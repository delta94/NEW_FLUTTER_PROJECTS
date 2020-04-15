package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p133e.C2000D;
import p133e.C2013h;
import p133e.C2015j;
import p133e.C2025t;

public abstract class RequestBody {
    public static RequestBody create(final MediaType mediaType, final C2015j jVar) {
        return new RequestBody() {
            public long contentLength() {
                return (long) jVar.mo7048g();
            }

            public MediaType contentType() {
                return MediaType.this;
            }

            public void writeTo(C2013h hVar) {
                hVar.mo7099a(jVar);
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                public long contentLength() {
                    return file.length();
                }

                public MediaType contentType() {
                    return MediaType.this;
                }

                public void writeTo(C2013h hVar) {
                    C2000D d = null;
                    try {
                        d = C2025t.m7760c(file);
                        hVar.mo7094a(d);
                    } finally {
                        Util.closeQuietly((Closeable) d);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            charset = mediaType.charset();
            if (charset == null) {
                charset = Util.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType = MediaType.parse(sb.toString());
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() {
                public long contentLength() {
                    return (long) i2;
                }

                public MediaType contentType() {
                    return MediaType.this;
                }

                public void writeTo(C2013h hVar) {
                    hVar.write(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public long contentLength() {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(C2013h hVar);
}
