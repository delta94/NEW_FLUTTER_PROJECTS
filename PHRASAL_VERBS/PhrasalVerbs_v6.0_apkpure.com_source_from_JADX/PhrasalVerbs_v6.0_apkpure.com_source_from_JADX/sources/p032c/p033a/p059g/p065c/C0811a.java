package p032c.p033a.p059g.p065c;

import p032c.p033a.p051d.C0767d;
import p032c.p033a.p051d.C0768e;

/* renamed from: c.a.g.c.a */
class C0811a extends C0767d<T> {

    /* renamed from: a */
    final /* synthetic */ String f2829a;

    /* renamed from: b */
    final /* synthetic */ boolean f2830b;

    /* renamed from: c */
    final /* synthetic */ C0812b f2831c;

    C0811a(C0812b bVar, String str, boolean z) {
        this.f2831c = bVar;
        this.f2829a = str;
        this.f2830b = z;
    }

    /* renamed from: d */
    public void mo3566d(C0768e<T> eVar) {
        boolean b = eVar.mo3555b();
        this.f2831c.m3599a(this.f2829a, eVar, eVar.mo3558d(), b);
    }

    /* renamed from: e */
    public void mo3567e(C0768e<T> eVar) {
        this.f2831c.m3601a(this.f2829a, eVar, eVar.mo3556c(), true);
    }

    /* renamed from: f */
    public void mo3568f(C0768e<T> eVar) {
        boolean b = eVar.mo3555b();
        float d = eVar.mo3558d();
        Object result = eVar.getResult();
        if (result != null) {
            this.f2831c.m3600a(this.f2829a, eVar, result, d, b, this.f2830b);
        } else if (b) {
            this.f2831c.m3601a(this.f2829a, eVar, (Throwable) new NullPointerException(), true);
        }
    }
}
