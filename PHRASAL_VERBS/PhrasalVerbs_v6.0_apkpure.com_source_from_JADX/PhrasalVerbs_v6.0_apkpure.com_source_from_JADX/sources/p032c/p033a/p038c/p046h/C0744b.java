package p032c.p033a.p038c.p046h;

import java.io.Closeable;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.c.h.b */
public final class C0744b<T> implements Cloneable, Closeable {

    /* renamed from: a */
    private static Class<C0744b> f2615a = C0744b.class;

    /* renamed from: b */
    private static final C0746d<Closeable> f2616b = new C0743a();

    /* renamed from: c */
    private boolean f2617c = false;

    /* renamed from: d */
    private final C0747e<T> f2618d;

    private C0744b(C0747e<T> eVar) {
        C0718j.m3240a(eVar);
        this.f2618d = eVar;
        eVar.mo3526a();
    }

    private C0744b(T t, C0746d<T> dVar) {
        this.f2618d = new C0747e<>(t, dVar);
    }

    /* renamed from: a */
    public static <T> C0744b<T> m3333a(C0744b<T> bVar) {
        if (bVar != null) {
            return bVar.mo3519m();
        }
        return null;
    }

    /* renamed from: a */
    public static <T extends Closeable> C0744b<T> m3334a(T t) {
        if (t == null) {
            return null;
        }
        return new C0744b<>(t, f2616b);
    }

    /* renamed from: a */
    public static <T> C0744b<T> m3335a(T t, C0746d<T> dVar) {
        if (t == null) {
            return null;
        }
        return new C0744b<>(t, dVar);
    }

    /* renamed from: b */
    public static void m3336b(C0744b<?> bVar) {
        if (bVar != null) {
            bVar.close();
        }
    }

    /* renamed from: c */
    public static boolean m3337c(C0744b<?> bVar) {
        return bVar != null && bVar.mo3522p();
    }

    public synchronized C0744b<T> clone() {
        C0718j.m3247b(mo3522p());
        return new C0744b<>(this.f2618d);
    }

    public void close() {
        synchronized (this) {
            if (!this.f2617c) {
                this.f2617c = true;
                this.f2618d.mo3527b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (this.f2617c) {
                    super.finalize();
                    return;
                }
                C0727a.m3280c(f2615a, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2618d)), this.f2618d.mo3528c().getClass().getName());
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: m */
    public synchronized C0744b<T> mo3519m() {
        if (!mo3522p()) {
            return null;
        }
        return clone();
    }

    /* renamed from: n */
    public synchronized T mo3520n() {
        C0718j.m3247b(!this.f2617c);
        return this.f2618d.mo3528c();
    }

    /* renamed from: o */
    public int mo3521o() {
        if (mo3522p()) {
            return System.identityHashCode(this.f2618d.mo3528c());
        }
        return 0;
    }

    /* renamed from: p */
    public synchronized boolean mo3522p() {
        return !this.f2617c;
    }
}
