package p032c.p115b.p116a;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: c.b.a.j */
public class C1249j extends C1242c<C1249j> {

    /* renamed from: z */
    private static float f4059z = 10.0f;

    /* renamed from: A */
    private long f4060A = 500;

    /* renamed from: B */
    private float f4061B;

    /* renamed from: C */
    private float f4062C;

    /* renamed from: D */
    private float f4063D;

    /* renamed from: E */
    private Handler f4064E;

    public C1249j(Context context) {
        mo4622b(true);
        this.f4061B = f4059z * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public C1249j mo4660a(float f) {
        this.f4061B = f * f;
        return this;
    }

    /* renamed from: a */
    public void mo4661a(long j) {
        this.f4060A = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4625b(int i, int i2) {
        Handler handler = this.f4064E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f4064E = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        if (mo4640k() == 0) {
            mo4623b();
            this.f4062C = motionEvent.getRawX();
            this.f4063D = motionEvent.getRawY();
            this.f4064E = new Handler();
            this.f4064E.postDelayed(new C1248i(this), this.f4060A);
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler = this.f4064E;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f4064E = null;
            }
            if (mo4640k() == 4) {
                mo4631d();
                return;
            }
        } else {
            float rawX = motionEvent.getRawX() - this.f4062C;
            float rawY = motionEvent.getRawY() - this.f4063D;
            if ((rawX * rawX) + (rawY * rawY) <= this.f4061B) {
                return;
            }
            if (mo4640k() == 4) {
                mo4628c();
                return;
            }
        }
        mo4633e();
    }
}
