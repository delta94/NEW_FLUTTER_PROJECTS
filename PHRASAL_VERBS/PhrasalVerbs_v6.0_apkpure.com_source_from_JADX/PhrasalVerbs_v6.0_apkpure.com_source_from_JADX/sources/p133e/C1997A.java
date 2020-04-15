package p133e;

/* renamed from: e.A */
final class C1997A {

    /* renamed from: a */
    static C2033z f5913a;

    /* renamed from: b */
    static long f5914b;

    private C1997A() {
    }

    /* renamed from: a */
    static C2033z m7604a() {
        synchronized (C1997A.class) {
            if (f5913a == null) {
                return new C2033z();
            }
            C2033z zVar = f5913a;
            f5913a = zVar.f5980f;
            zVar.f5980f = null;
            f5914b -= 8192;
            return zVar;
        }
    }

    /* renamed from: a */
    static void m7605a(C2033z zVar) {
        if (zVar.f5980f != null || zVar.f5981g != null) {
            throw new IllegalArgumentException();
        } else if (!zVar.f5978d) {
            synchronized (C1997A.class) {
                if (f5914b + 8192 <= 65536) {
                    f5914b += 8192;
                    zVar.f5980f = f5913a;
                    zVar.f5977c = 0;
                    zVar.f5976b = 0;
                    f5913a = zVar;
                }
            }
        }
    }
}
