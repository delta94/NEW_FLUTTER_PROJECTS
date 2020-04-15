package p032c.p033a.p038c.p050l;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: c.a.c.l.c */
public class C0762c {

    /* renamed from: a */
    public static final boolean f2649a = (VERSION.SDK_INT <= 17);

    /* renamed from: b */
    public static final boolean f2650b;

    /* renamed from: c */
    public static final boolean f2651c = m3392b();

    /* renamed from: d */
    public static C0760b f2652d = null;

    /* renamed from: e */
    private static boolean f2653e = false;

    /* renamed from: f */
    private static final byte[] f2654f = m3391a("RIFF");

    /* renamed from: g */
    private static final byte[] f2655g = m3391a("WEBP");

    /* renamed from: h */
    private static final byte[] f2656h = m3391a("VP8 ");

    /* renamed from: i */
    private static final byte[] f2657i = m3391a("VP8L");

    /* renamed from: j */
    private static final byte[] f2658j = m3391a("VP8X");

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 14) {
            z = false;
        }
        f2650b = z;
    }

    /* renamed from: a */
    public static C0760b m3387a() {
        if (f2653e) {
            return f2652d;
        }
        C0760b bVar = null;
        try {
            bVar = (C0760b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f2653e = true;
        return bVar;
    }

    /* renamed from: a */
    public static boolean m3388a(byte[] bArr, int i) {
        return m3390a(bArr, i + 12, f2658j) && ((bArr[i + 20] & 2) == 2);
    }

    /* renamed from: a */
    public static boolean m3389a(byte[] bArr, int i, int i2) {
        return i2 >= 21 && m3390a(bArr, i + 12, f2658j);
    }

    /* renamed from: a */
    private static boolean m3390a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static byte[] m3391a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    private static boolean m3392b() {
        int i = VERSION.SDK_INT;
        if (i < 17) {
            return false;
        }
        if (i == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m3393b(byte[] bArr, int i) {
        return m3390a(bArr, i + 12, f2658j) && ((bArr[i + 20] & 16) == 16);
    }

    /* renamed from: b */
    public static boolean m3394b(byte[] bArr, int i, int i2) {
        return i2 >= 20 && m3390a(bArr, i, f2654f) && m3390a(bArr, i + 8, f2655g);
    }

    /* renamed from: c */
    public static boolean m3395c(byte[] bArr, int i) {
        return m3390a(bArr, i + 12, f2657i);
    }

    /* renamed from: d */
    public static boolean m3396d(byte[] bArr, int i) {
        return m3390a(bArr, i + 12, f2656h);
    }
}
