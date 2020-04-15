package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
import p133e.C2011g;
import p133e.C2013h;

public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder(Charset charset2) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset2;
        }

        public Builder add(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.names.add(HttpUrl.canonicalize(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                String str4 = str2;
                this.values.add(HttpUrl.canonicalize(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public Builder addEncoded(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.names.add(HttpUrl.canonicalize(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                String str4 = str2;
                this.values.add(HttpUrl.canonicalize(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(C2013h hVar, boolean z) {
        C2011g gVar = z ? new C2011g() : hVar.mo7097a();
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                gVar.writeByte(38);
            }
            gVar.mo7100a((String) this.encodedNames.get(i));
            gVar.writeByte(61);
            gVar.mo7100a((String) this.encodedValues.get(i));
        }
        if (!z) {
            return 0;
        }
        long size2 = gVar.size();
        gVar.mo7139m();
        return size2;
    }

    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public String encodedName(int i) {
        return (String) this.encodedNames.get(i);
    }

    public String encodedValue(int i) {
        return (String) this.encodedValues.get(i);
    }

    public String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    public String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    public void writeTo(C2013h hVar) {
        writeOrCountBytes(hVar, false);
    }
}
