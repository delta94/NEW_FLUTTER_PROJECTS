package p032c.p115b.p116a;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: c.b.a.b */
public class C1241b extends C1242c<C1241b> {

    /* renamed from: A */
    private long f4005A = 160;

    /* renamed from: B */
    private int f4006B = 1;

    /* renamed from: C */
    private int f4007C = 1;

    /* renamed from: D */
    private float f4008D;

    /* renamed from: E */
    private float f4009E;

    /* renamed from: F */
    private Handler f4010F;

    /* renamed from: G */
    private int f4011G;

    /* renamed from: H */
    private final Runnable f4012H = new C1240a(this);

    /* renamed from: z */
    private long f4013z = 800;

    /* renamed from: d */
    private void m5269d(MotionEvent motionEvent) {
        if (!m5271f(motionEvent)) {
            mo4633e();
        }
    }

    /* renamed from: e */
    private void m5270e(MotionEvent motionEvent) {
        this.f4008D = motionEvent.getRawX();
        this.f4009E = motionEvent.getRawY();
        mo4623b();
        this.f4011G = 1;
        Handler handler = this.f4010F;
        if (handler == null) {
            this.f4010F = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.f4010F.postDelayed(this.f4012H, this.f4013z);
    }

    /* renamed from: f */
    private boolean m5271f(MotionEvent motionEvent) {
        if (this.f4011G != this.f4007C || (((this.f4006B & 1) == 0 || motionEvent.getRawX() - this.f4008D <= ((float) this.f4005A)) && (((this.f4006B & 2) == 0 || this.f4008D - motionEvent.getRawX() <= ((float) this.f4005A)) && (((this.f4006B & 4) == 0 || this.f4009E - motionEvent.getRawY() <= ((float) this.f4005A)) && ((this.f4006B & 8) == 0 || motionEvent.getRawY() - this.f4009E <= ((float) this.f4005A)))))) {
            return false;
        }
        this.f4010F.removeCallbacksAndMessages(null);
        mo4615a();
        mo4631d();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        int k = mo4640k();
        if (k == 0) {
            m5270e(motionEvent);
        }
        if (k == 2) {
            m5271f(motionEvent);
            if (motionEvent.getPointerCount() > this.f4011G) {
                this.f4011G = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                m5269d(motionEvent);
            }
        }
    }

    /* renamed from: d */
    public void mo4607d(int i) {
        this.f4006B = i;
    }

    /* renamed from: e */
    public void mo4608e(int i) {
        this.f4007C = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4609p() {
        Handler handler = this.f4010F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo4610q() {
        Handler handler = this.f4010F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
