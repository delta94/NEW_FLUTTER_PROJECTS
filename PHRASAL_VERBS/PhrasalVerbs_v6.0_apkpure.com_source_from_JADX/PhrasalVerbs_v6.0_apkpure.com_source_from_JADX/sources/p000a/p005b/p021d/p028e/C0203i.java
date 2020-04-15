package p000a.p005b.p021d.p028e;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0119J;

/* renamed from: a.b.d.e.i */
public class C0203i {

    /* renamed from: a */
    final ArrayList<C0116H> f545a = new ArrayList<>();

    /* renamed from: b */
    private long f546b = -1;

    /* renamed from: c */
    private Interpolator f547c;

    /* renamed from: d */
    C0118I f548d;

    /* renamed from: e */
    private boolean f549e;

    /* renamed from: f */
    private final C0119J f550f = new C0202h(this);

    /* renamed from: a */
    public C0203i mo758a(long j) {
        if (!this.f549e) {
            this.f546b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0203i mo759a(C0116H h) {
        if (!this.f549e) {
            this.f545a.add(h);
        }
        return this;
    }

    /* renamed from: a */
    public C0203i mo760a(C0116H h, C0116H h2) {
        this.f545a.add(h);
        h2.mo405b(h.mo403b());
        this.f545a.add(h2);
        return this;
    }

    /* renamed from: a */
    public C0203i mo761a(C0118I i) {
        if (!this.f549e) {
            this.f548d = i;
        }
        return this;
    }

    /* renamed from: a */
    public C0203i mo762a(Interpolator interpolator) {
        if (!this.f549e) {
            this.f547c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public void mo763a() {
        if (this.f549e) {
            Iterator it = this.f545a.iterator();
            while (it.hasNext()) {
                ((C0116H) it.next()).mo402a();
            }
            this.f549e = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo764b() {
        this.f549e = false;
    }

    /* renamed from: c */
    public void mo765c() {
        if (!this.f549e) {
            Iterator it = this.f545a.iterator();
            while (it.hasNext()) {
                C0116H h = (C0116H) it.next();
                long j = this.f546b;
                if (j >= 0) {
                    h.mo398a(j);
                }
                Interpolator interpolator = this.f547c;
                if (interpolator != null) {
                    h.mo401a(interpolator);
                }
                if (this.f548d != null) {
                    h.mo399a((C0118I) this.f550f);
                }
                h.mo406c();
            }
            this.f549e = true;
        }
    }
}
