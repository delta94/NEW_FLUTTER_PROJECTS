package p032c.p115b.p116a;

import android.view.MotionEvent;
import p032c.p115b.p116a.C1256q.C1257a;

/* renamed from: c.b.a.s */
public class C1259s extends C1242c<C1259s> {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public double f4117A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public double f4118B;

    /* renamed from: C */
    private C1257a f4119C = new C1258r(this);

    /* renamed from: z */
    private C1256q f4120z;

    public C1259s() {
        mo4622b(false);
    }

    /* renamed from: a */
    static /* synthetic */ double m5423a(C1259s sVar, double d) {
        double d2 = sVar.f4117A + d;
        sVar.f4117A = d2;
        return d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        int k = mo4640k();
        if (k == 0) {
            this.f4118B = 0.0d;
            this.f4117A = 0.0d;
            this.f4120z = new C1256q(this.f4119C);
            mo4623b();
        }
        C1256q qVar = this.f4120z;
        if (qVar != null) {
            qVar.mo4689a(motionEvent);
        }
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        if (k == 4) {
            mo4631d();
        } else {
            mo4633e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo4610q() {
        this.f4120z = null;
        this.f4118B = 0.0d;
        this.f4117A = 0.0d;
    }

    /* renamed from: t */
    public float mo4678t() {
        C1256q qVar = this.f4120z;
        if (qVar == null) {
            return Float.NaN;
        }
        return qVar.mo4688a();
    }

    /* renamed from: u */
    public float mo4696u() {
        C1256q qVar = this.f4120z;
        if (qVar == null) {
            return Float.NaN;
        }
        return qVar.mo4690b();
    }

    /* renamed from: v */
    public double mo4697v() {
        return this.f4117A;
    }

    /* renamed from: w */
    public double mo4698w() {
        return this.f4118B;
    }
}
