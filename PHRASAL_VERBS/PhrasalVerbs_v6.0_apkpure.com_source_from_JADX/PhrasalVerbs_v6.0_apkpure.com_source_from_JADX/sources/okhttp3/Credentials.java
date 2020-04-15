package okhttp3;

import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p133e.C2015j;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String a = C2015j.m7718a(sb.toString(), charset).mo7038a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(a);
        return sb2.toString();
    }
}
