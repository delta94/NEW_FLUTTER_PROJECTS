package p032c.p115b.p116a;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: c.b.a.u */
public class C1261u extends C1242c<C1261u> {

    /* renamed from: z */
    private static float f4122z = Float.MIN_VALUE;

    /* renamed from: A */
    private float f4123A;

    /* renamed from: B */
    private float f4124B;

    /* renamed from: C */
    private float f4125C;

    /* renamed from: D */
    private long f4126D = 500;

    /* renamed from: E */
    private long f4127E = 500;

    /* renamed from: F */
    private int f4128F = 1;

    /* renamed from: G */
    private int f4129G = 1;

    /* renamed from: H */
    private int f4130H = 1;

    /* renamed from: I */
    private float f4131I;

    /* renamed from: J */
    private float f4132J;

    /* renamed from: K */
    private float f4133K;

    /* renamed from: L */
    private float f4134L;

    /* renamed from: M */
    private float f4135M;

    /* renamed from: N */
    private float f4136N;

    /* renamed from: O */
    private Handler f4137O;

    /* renamed from: P */
    private int f4138P;

    /* renamed from: Q */
    private final Runnable f4139Q = new C1260t(this);

    public C1261u() {
        float f = f4122z;
        this.f4123A = f;
        this.f4124B = f;
        this.f4125C = f;
        mo4622b(true);
    }

    /* renamed from: t */
    private void m5431t() {
        Handler handler = this.f4137O;
        if (handler == null) {
            this.f4137O = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.f4138P + 1;
        this.f4138P = i;
        if (i != this.f4128F || this.f4130H < this.f4129G) {
            this.f4137O.postDelayed(this.f4139Q, this.f4127E);
            return;
        }
        mo4615a();
        mo4631d();
    }

    /* renamed from: u */
    private boolean m5432u() {
        float f = (this.f4135M - this.f4131I) + this.f4133K;
        boolean z = true;
        if (this.f4123A != f4122z && Math.abs(f) > this.f4123A) {
            return true;
        }
        float f2 = (this.f4136N - this.f4132J) + this.f4134L;
        if (this.f4124B != f4122z && Math.abs(f2) > this.f4124B) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.f4125C;
        if (f4 == f4122z || f3 <= f4) {
            z = false;
        }
        return z;
    }

    /* renamed from: v */
    private void m5433v() {
        Handler handler = this.f4137O;
        if (handler == null) {
            this.f4137O = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.f4137O.postDelayed(this.f4139Q, this.f4126D);
    }

    /* renamed from: a */
    public C1261u mo4660a(float f) {
        this.f4125C = f * f;
        return this;
    }

    /* renamed from: a */
    public C1261u mo4700a(long j) {
        this.f4127E = j;
        return this;
    }

    /* renamed from: b */
    public C1261u mo4701b(float f) {
        this.f4123A = f;
        return this;
    }

    /* renamed from: b */
    public C1261u mo4702b(long j) {
        this.f4126D = j;
        return this;
    }

    /* renamed from: c */
    public C1261u mo4703c(float f) {
        this.f4124B = f;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        int k = mo4640k();
        int actionMasked = motionEvent.getActionMasked();
        if (k == 0) {
            this.f4133K = 0.0f;
            this.f4134L = 0.0f;
            this.f4131I = motionEvent.getRawX();
            this.f4132J = motionEvent.getRawY();
        }
        if (actionMasked == 6 || actionMasked == 5) {
            this.f4133K += this.f4135M - this.f4131I;
            this.f4134L += this.f4136N - this.f4132J;
            this.f4135M = C1247h.m5357a(motionEvent, true);
            this.f4136N = C1247h.m5358b(motionEvent, true);
            this.f4131I = this.f4135M;
            this.f4132J = this.f4136N;
        } else {
            this.f4135M = C1247h.m5357a(motionEvent, true);
            this.f4136N = C1247h.m5358b(motionEvent, true);
        }
        if (this.f4130H < motionEvent.getPointerCount()) {
            this.f4130H = motionEvent.getPointerCount();
        }
        if (m5432u()) {
            mo4633e();
            return;
        }
        if (k == 0) {
            if (actionMasked == 0) {
                mo4623b();
            }
        } else if (k != 2) {
            return;
        } else {
            if (actionMasked == 1) {
                m5431t();
                return;
            } else if (actionMasked != 0) {
                return;
            }
        }
        m5433v();
    }

    /* renamed from: d */
    public C1261u mo4607d(int i) {
        this.f4129G = i;
        return this;
    }

    /* renamed from: e */
    public C1261u mo4608e(int i) {
        this.f4128F = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4609p() {
        Handler handler = this.f4137O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo4610q() {
        this.f4138P = 0;
        this.f4130H = 0;
        Handler handler = this.f4137O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
