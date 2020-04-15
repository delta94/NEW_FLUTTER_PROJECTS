package p032c.p033a.p074i.p092p;

/* renamed from: c.a.i.p.c */
public class C1124c {

    /* renamed from: a */
    public static final C1125a f3778a = new C1126b();

    /* renamed from: b */
    private static volatile C1127c f3779b = null;

    /* renamed from: c.a.i.p.c$a */
    public interface C1125a {
    }

    /* renamed from: c.a.i.p.c$b */
    private static final class C1126b implements C1125a {
        private C1126b() {
        }
    }

    /* renamed from: c.a.i.p.c$c */
    public interface C1127c {
        /* renamed from: a */
        void mo4408a();

        /* renamed from: a */
        void mo4409a(String str);
    }

    private C1124c() {
    }

    /* renamed from: a */
    public static void m5022a() {
        m5024b().mo4408a();
    }

    /* renamed from: a */
    public static void m5023a(String str) {
        m5024b().mo4409a(str);
    }

    /* renamed from: b */
    private static C1127c m5024b() {
        if (f3779b == null) {
            synchronized (C1124c.class) {
                if (f3779b == null) {
                    f3779b = new C1122a();
                }
            }
        }
        return f3779b;
    }
}
