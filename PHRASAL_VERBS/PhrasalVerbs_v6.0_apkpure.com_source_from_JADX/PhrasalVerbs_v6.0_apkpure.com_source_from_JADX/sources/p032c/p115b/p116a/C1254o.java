package p032c.p115b.p116a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ViewConfiguration;

/* renamed from: c.b.a.o */
public class C1254o extends C1242c<C1254o> {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public double f4096A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public double f4097B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public float f4098C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public float f4099D;

    /* renamed from: E */
    private OnScaleGestureListener f4100E = new C1253n(this);

    /* renamed from: z */
    private ScaleGestureDetector f4101z;

    public C1254o() {
        mo4622b(false);
    }

    /* renamed from: a */
    static /* synthetic */ double m5398a(C1254o oVar, double d) {
        double d2 = oVar.f4096A * d;
        oVar.f4096A = d2;
        return d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        if (mo4640k() == 0) {
            Context context = mo4642m().getContext();
            this.f4097B = 0.0d;
            this.f4096A = 1.0d;
            this.f4101z = new ScaleGestureDetector(context, this.f4100E);
            this.f4099D = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            mo4623b();
        }
        ScaleGestureDetector scaleGestureDetector = this.f4101z;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (mo4640k() == 4 && pointerCount < 2) {
            mo4631d();
        } else if (motionEvent.getActionMasked() == 1) {
            mo4633e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo4610q() {
        this.f4101z = null;
        this.f4097B = 0.0d;
        this.f4096A = 1.0d;
    }

    /* renamed from: t */
    public float mo4678t() {
        ScaleGestureDetector scaleGestureDetector = this.f4101z;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusX();
    }

    /* renamed from: u */
    public float mo4685u() {
        ScaleGestureDetector scaleGestureDetector = this.f4101z;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusY();
    }

    /* renamed from: v */
    public double mo4686v() {
        return this.f4096A;
    }

    /* renamed from: w */
    public double mo4687w() {
        return this.f4097B;
    }
}
