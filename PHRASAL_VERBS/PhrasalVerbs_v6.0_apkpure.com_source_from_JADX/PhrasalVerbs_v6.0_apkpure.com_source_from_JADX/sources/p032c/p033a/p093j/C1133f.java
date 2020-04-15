package p032c.p033a.p093j;

import java.io.InputStream;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.j.f */
class C1133f {

    /* renamed from: a */
    private static final Class<?> f3782a = C1133f.class;

    /* renamed from: c.a.j.f$a */
    private static class C1134a {

        /* renamed from: a */
        boolean f3783a;

        /* renamed from: b */
        int f3784b;

        /* renamed from: c */
        int f3785c;

        private C1134a() {
        }
    }

    C1133f() {
    }

    /* renamed from: a */
    public static int m5037a(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: a */
    public static int m5038a(InputStream inputStream, int i) {
        C1134a aVar = new C1134a();
        int a = m5039a(inputStream, i, aVar);
        int i2 = aVar.f3785c - 8;
        if (a == 0 || i2 > a) {
            return 0;
        }
        inputStream.skip((long) i2);
        return m5040a(inputStream, m5041a(inputStream, a - i2, aVar.f3783a, 274), aVar.f3783a);
    }

    /* renamed from: a */
    private static int m5039a(InputStream inputStream, int i, C1134a aVar) {
        Class<?> cls;
        String str;
        if (i <= 8) {
            return 0;
        }
        aVar.f3784b = C1131d.m5036a(inputStream, 4, false);
        int i2 = i - 4;
        int i3 = aVar.f3784b;
        if (i3 == 1229531648 || i3 == 1296891946) {
            aVar.f3783a = aVar.f3784b == 1229531648;
            aVar.f3785c = C1131d.m5036a(inputStream, 4, aVar.f3783a);
            int i4 = i2 - 4;
            int i5 = aVar.f3785c;
            if (i5 >= 8 && i5 - 8 <= i4) {
                return i4;
            }
            cls = f3782a;
            str = "Invalid offset";
        } else {
            cls = f3782a;
            str = "Invalid TIFF header";
        }
        C0727a.m3258a(cls, str);
        return 0;
    }

    /* renamed from: a */
    private static int m5040a(InputStream inputStream, int i, boolean z) {
        if (i < 10 || C1131d.m5036a(inputStream, 2, z) != 3 || C1131d.m5036a(inputStream, 4, z) != 1) {
            return 0;
        }
        int a = C1131d.m5036a(inputStream, 2, z);
        C1131d.m5036a(inputStream, 2, z);
        return a;
    }

    /* renamed from: a */
    private static int m5041a(InputStream inputStream, int i, boolean z, int i2) {
        if (i < 14) {
            return 0;
        }
        int a = C1131d.m5036a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a - 1;
            if (a <= 0 || i3 < 12) {
                return 0;
            }
            int i5 = i3 - 2;
            if (C1131d.m5036a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10);
            i3 = i5 - 10;
            a = i4;
        }
        return 0;
    }
}
