package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.Util;
import p133e.C2013h;
import p133e.C2015j;

public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    private final C2015j boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;

    public static final class Builder {
        private final C2015j boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = C2015j.m7721c(str);
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addPart(Part part) {
            if (part != null) {
                this.parts.add(part);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, this.parts);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            } else if (mediaType.type().equals("multipart")) {
                this.type = mediaType;
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("multipart != ");
                sb.append(mediaType);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public static final class Part {
        final RequestBody body;
        final Headers headers;

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public static Part create(Headers headers2, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            } else if (headers2 != null && headers2.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (headers2 == null || headers2.get("Content-Length") == null) {
                return new Part(headers2, requestBody);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                MultipartBody.appendQuotedString(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    MultipartBody.appendQuotedString(sb, str2);
                }
                return create(Headers.m7801of("Content-Disposition", sb.toString()), requestBody);
            }
            throw new NullPointerException("name == null");
        }

        public RequestBody body() {
            return this.body;
        }

        public Headers headers() {
            return this.headers;
        }
    }

    MultipartBody(C2015j jVar, MediaType mediaType, List<Part> list) {
        this.boundary = jVar;
        this.originalType = mediaType;
        StringBuilder sb = new StringBuilder();
        sb.append(mediaType);
        sb.append("; boundary=");
        sb.append(jVar.mo7052j());
        this.contentType = MediaType.get(sb.toString());
        this.parts = Util.immutableList(list);
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                str2 = "%0A";
            } else if (charAt == 13) {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [e.h] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r13v3, types: [e.g] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long writeOrCountBytes(p133e.C2013h r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            e.g r13 = new e.g
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r12.parts
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
        L_0x0015:
            if (r3 >= r1) goto L_0x00a7
            java.util.List<okhttp3.MultipartBody$Part> r6 = r12.parts
            java.lang.Object r6 = r6.get(r3)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.headers
            okhttp3.RequestBody r6 = r6.body
            byte[] r8 = DASHDASH
            r13.write(r8)
            e.j r8 = r12.boundary
            r13.mo7099a(r8)
            byte[] r8 = CRLF
            r13.write(r8)
            if (r7 == 0) goto L_0x0059
            int r8 = r7.size()
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x0059
            java.lang.String r10 = r7.name(r9)
            e.h r10 = r13.mo7100a(r10)
            byte[] r11 = COLONSPACE
            e.h r10 = r10.write(r11)
            java.lang.String r11 = r7.value(r9)
            e.h r10 = r10.mo7100a(r11)
            byte[] r11 = CRLF
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0039
        L_0x0059:
            okhttp3.MediaType r7 = r6.contentType()
            if (r7 == 0) goto L_0x0072
            java.lang.String r8 = "Content-Type: "
            e.h r8 = r13.mo7100a(r8)
            java.lang.String r7 = r7.toString()
            e.h r7 = r8.mo7100a(r7)
            byte[] r8 = CRLF
            r7.write(r8)
        L_0x0072:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008c
            java.lang.String r9 = "Content-Length: "
            e.h r9 = r13.mo7100a(r9)
            e.h r9 = r9.mo7126g(r7)
            byte[] r10 = CRLF
            r9.write(r10)
            goto L_0x0092
        L_0x008c:
            if (r14 == 0) goto L_0x0092
            r0.mo7139m()
            return r9
        L_0x0092:
            byte[] r9 = CRLF
            r13.write(r9)
            if (r14 == 0) goto L_0x009b
            long r4 = r4 + r7
            goto L_0x009e
        L_0x009b:
            r6.writeTo(r13)
        L_0x009e:
            byte[] r6 = CRLF
            r13.write(r6)
            int r3 = r3 + 1
            goto L_0x0015
        L_0x00a7:
            byte[] r1 = DASHDASH
            r13.write(r1)
            e.j r1 = r12.boundary
            r13.mo7099a(r1)
            byte[] r1 = DASHDASH
            r13.write(r1)
            byte[] r1 = CRLF
            r13.write(r1)
            if (r14 == 0) goto L_0x00c5
            long r13 = r0.size()
            long r4 = r4 + r13
            r0.mo7139m()
        L_0x00c5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.writeOrCountBytes(e.h, boolean):long");
    }

    public String boundary() {
        return this.boundary.mo7052j();
    }

    public long contentLength() {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    public MediaType contentType() {
        return this.contentType;
    }

    public Part part(int i) {
        return (Part) this.parts.get(i);
    }

    public List<Part> parts() {
        return this.parts;
    }

    public int size() {
        return this.parts.size();
    }

    public MediaType type() {
        return this.originalType;
    }

    public void writeTo(C2013h hVar) {
        writeOrCountBytes(hVar, false);
    }
}
