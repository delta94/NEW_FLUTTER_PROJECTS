package p000a.p005b.p021d.p028e;

import android.view.View;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0119J;

/* renamed from: a.b.d.e.h */
class C0202h extends C0119J {

    /* renamed from: a */
    private boolean f542a = false;

    /* renamed from: b */
    private int f543b = 0;

    /* renamed from: c */
    final /* synthetic */ C0203i f544c;

    C0202h(C0203i iVar) {
        this.f544c = iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo757a() {
        this.f543b = 0;
        this.f542a = false;
        this.f544c.mo764b();
    }

    /* renamed from: b */
    public void mo408b(View view) {
        int i = this.f543b + 1;
        this.f543b = i;
        if (i == this.f544c.f545a.size()) {
            C0118I i2 = this.f544c.f548d;
            if (i2 != null) {
                i2.mo408b(null);
            }
            mo757a();
        }
    }

    /* renamed from: c */
    public void mo409c(View view) {
        if (!this.f542a) {
            this.f542a = true;
            C0118I i = this.f544c.f548d;
            if (i != null) {
                i.mo409c(null);
            }
        }
    }
}
