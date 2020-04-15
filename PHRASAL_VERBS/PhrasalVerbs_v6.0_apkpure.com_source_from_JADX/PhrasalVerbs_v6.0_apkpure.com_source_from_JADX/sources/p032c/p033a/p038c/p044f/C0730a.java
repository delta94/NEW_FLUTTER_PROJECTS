package p032c.p033a.p038c.p044f;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import java.util.Map;
import p032c.p033a.p038c.p042d.C0712f;

/* renamed from: c.a.c.f.a */
public class C0730a {

    /* renamed from: a */
    public static final Map<String, String> f2602a = C0712f.m3227a("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    public static String m3313a(String str) {
        String c = m3315c(str);
        if (c == null) {
            return null;
        }
        String lowerCase = c.toLowerCase(Locale.US);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = (String) f2602a.get(lowerCase);
        }
        return mimeTypeFromExtension;
    }

    /* renamed from: b */
    public static boolean m3314b(String str) {
        return str != null && str.startsWith("video/");
    }

    /* renamed from: c */
    private static String m3315c(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }
}
