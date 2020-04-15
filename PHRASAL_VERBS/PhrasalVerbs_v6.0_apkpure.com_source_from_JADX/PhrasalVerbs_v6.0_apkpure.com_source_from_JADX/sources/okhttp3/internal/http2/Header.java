package okhttp3.internal.http2;

import okhttp3.Headers;
import okhttp3.internal.Util;
import p133e.C2015j;

public final class Header {
    public static final C2015j PSEUDO_PREFIX = C2015j.m7721c(":");
    public static final C2015j RESPONSE_STATUS = C2015j.m7721c(RESPONSE_STATUS_UTF8);
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C2015j TARGET_AUTHORITY = C2015j.m7721c(TARGET_AUTHORITY_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C2015j TARGET_METHOD = C2015j.m7721c(TARGET_METHOD_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C2015j TARGET_PATH = C2015j.m7721c(TARGET_PATH_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C2015j TARGET_SCHEME = C2015j.m7721c(TARGET_SCHEME_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    final int hpackSize;
    public final C2015j name;
    public final C2015j value;

    interface Listener {
        void onHeaders(Headers headers);
    }

    public Header(C2015j jVar, C2015j jVar2) {
        this.name = jVar;
        this.value = jVar2;
        this.hpackSize = jVar.mo7048g() + 32 + jVar2.mo7048g();
    }

    public Header(C2015j jVar, String str) {
        this(jVar, C2015j.m7721c(str));
    }

    public Header(String str, String str2) {
        this(C2015j.m7721c(str), C2015j.m7721c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return this.name.equals(header.name) && this.value.equals(header.value);
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return Util.format("%s: %s", this.name.mo7052j(), this.value.mo7052j());
    }
}
