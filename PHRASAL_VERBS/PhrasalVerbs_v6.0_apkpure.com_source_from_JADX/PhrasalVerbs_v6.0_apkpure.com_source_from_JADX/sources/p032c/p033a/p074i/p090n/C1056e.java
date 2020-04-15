package p032c.p033a.p074i.p090n;

import java.util.ArrayList;
import java.util.List;
import p032c.p033a.p074i.p081e.C0941d;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1114c.C1116b;

/* renamed from: c.a.i.n.e */
public class C1056e implements C1084oa {

    /* renamed from: a */
    private final C1114c f3591a;

    /* renamed from: b */
    private final String f3592b;

    /* renamed from: c */
    private final C1091qa f3593c;

    /* renamed from: d */
    private final Object f3594d;

    /* renamed from: e */
    private final C1116b f3595e;

    /* renamed from: f */
    private boolean f3596f;

    /* renamed from: g */
    private C0941d f3597g;

    /* renamed from: h */
    private boolean f3598h;

    /* renamed from: i */
    private boolean f3599i = false;

    /* renamed from: j */
    private final List<C1089pa> f3600j = new ArrayList();

    public C1056e(C1114c cVar, String str, C1091qa qaVar, Object obj, C1116b bVar, boolean z, boolean z2, C0941d dVar) {
        this.f3591a = cVar;
        this.f3592b = str;
        this.f3593c = qaVar;
        this.f3594d = obj;
        this.f3595e = bVar;
        this.f3596f = z;
        this.f3597g = dVar;
        this.f3598h = z2;
    }

    /* renamed from: a */
    public static void m4724a(List<C1089pa> list) {
        if (list != null) {
            for (C1089pa a : list) {
                a.mo3958a();
            }
        }
    }

    /* renamed from: b */
    public static void m4725b(List<C1089pa> list) {
        if (list != null) {
            for (C1089pa b : list) {
                b.mo4292b();
            }
        }
    }

    /* renamed from: c */
    public static void m4726c(List<C1089pa> list) {
        if (list != null) {
            for (C1089pa d : list) {
                d.mo4294d();
            }
        }
    }

    /* renamed from: d */
    public static void m4727d(List<C1089pa> list) {
        if (list != null) {
            for (C1089pa c : list) {
                c.mo4293c();
            }
        }
    }

    /* renamed from: a */
    public Object mo4316a() {
        return this.f3594d;
    }

    /* renamed from: a */
    public synchronized List<C1089pa> mo4317a(C0941d dVar) {
        if (dVar == this.f3597g) {
            return null;
        }
        this.f3597g = dVar;
        return new ArrayList(this.f3600j);
    }

    /* renamed from: a */
    public synchronized List<C1089pa> mo4318a(boolean z) {
        if (z == this.f3598h) {
            return null;
        }
        this.f3598h = z;
        return new ArrayList(this.f3600j);
    }

    /* renamed from: a */
    public void mo4319a(C1089pa paVar) {
        boolean z;
        synchronized (this) {
            this.f3600j.add(paVar);
            z = this.f3599i;
        }
        if (z) {
            paVar.mo3958a();
        }
    }

    /* renamed from: b */
    public synchronized C0941d mo4320b() {
        return this.f3597g;
    }

    /* renamed from: b */
    public synchronized List<C1089pa> mo4321b(boolean z) {
        if (z == this.f3596f) {
            return null;
        }
        this.f3596f = z;
        return new ArrayList(this.f3600j);
    }

    /* renamed from: c */
    public C1114c mo4322c() {
        return this.f3591a;
    }

    /* renamed from: d */
    public synchronized boolean mo4323d() {
        return this.f3596f;
    }

    /* renamed from: e */
    public C1091qa mo4324e() {
        return this.f3593c;
    }

    /* renamed from: f */
    public synchronized boolean mo4325f() {
        return this.f3598h;
    }

    /* renamed from: g */
    public C1116b mo4326g() {
        return this.f3595e;
    }

    public String getId() {
        return this.f3592b;
    }

    /* renamed from: h */
    public void mo4328h() {
        m4724a(mo4329i());
    }

    /* renamed from: i */
    public synchronized List<C1089pa> mo4329i() {
        if (this.f3599i) {
            return null;
        }
        this.f3599i = true;
        return new ArrayList(this.f3600j);
    }
}
