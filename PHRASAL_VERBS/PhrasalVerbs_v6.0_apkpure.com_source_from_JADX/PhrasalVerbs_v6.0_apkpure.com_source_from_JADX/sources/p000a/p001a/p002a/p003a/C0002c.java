package p000a.p001a.p002a.p003a;

import java.util.concurrent.Executor;

/* renamed from: a.a.a.a.c */
public class C0002c extends C0004e {

    /* renamed from: a */
    private static volatile C0002c f0a;

    /* renamed from: b */
    private static final Executor f1b = new C0000a();

    /* renamed from: c */
    private static final Executor f2c = new C0001b();

    /* renamed from: d */
    private C0004e f3d = this.f4e;

    /* renamed from: e */
    private C0004e f4e = new C0003d();

    private C0002c() {
    }

    /* renamed from: b */
    public static C0002c m0b() {
        if (f0a != null) {
            return f0a;
        }
        synchronized (C0002c.class) {
            if (f0a == null) {
                f0a = new C0002c();
            }
        }
        return f0a;
    }

    /* renamed from: a */
    public void mo3a(Runnable runnable) {
        this.f3d.mo3a(runnable);
    }

    /* renamed from: a */
    public boolean mo4a() {
        return this.f3d.mo4a();
    }

    /* renamed from: b */
    public void mo5b(Runnable runnable) {
        this.f3d.mo5b(runnable);
    }
}
