package p032c.p033a.p093j;

import java.io.IOException;
import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.j.c */
public class C1130c {
    /* renamed from: a */
    public static int m5031a(int i) {
        return C1133f.m5037a(i);
    }

    /* renamed from: a */
    public static int m5032a(InputStream inputStream) {
        try {
            int b = m5034b(inputStream);
            if (b == 0) {
                return 0;
            }
            return C1133f.m5038a(inputStream, b);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m5033a(InputStream inputStream, int i) {
        C0718j.m3240a(inputStream);
        while (C1131d.m5036a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = C1131d.m5036a(inputStream, 1, false);
            }
            if ((i != 192 || !m5035b(i2)) && i2 != i) {
                if (!(i2 == 216 || i2 == 1)) {
                    if (i2 == 217 || i2 == 218) {
                        break;
                    }
                    inputStream.skip((long) (C1131d.m5036a(inputStream, 2, false) - 2));
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static int m5034b(InputStream inputStream) {
        if (m5033a(inputStream, 225)) {
            int a = C1131d.m5036a(inputStream, 2, false) - 2;
            if (a > 6) {
                int a2 = C1131d.m5036a(inputStream, 4, false);
                int i = a - 4;
                int a3 = C1131d.m5036a(inputStream, 2, false);
                int i2 = i - 2;
                if (a2 == 1165519206 && a3 == 0) {
                    return i2;
                }
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m5035b(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            default:
                return false;
        }
    }
}
