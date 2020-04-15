package p032c.p033a.p038c.p042d;

/* renamed from: c.a.c.d.r */
public final class C0726r {
    /* renamed from: a */
    public static RuntimeException m3253a(Throwable th) {
        C0718j.m3240a(th);
        m3255b(th);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public static <X extends Throwable> void m3254a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: b */
    public static void m3255b(Throwable th) {
        m3254a(th, Error.class);
        m3254a(th, RuntimeException.class);
    }
}
