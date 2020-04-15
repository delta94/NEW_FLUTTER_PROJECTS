package p032c.p115b.p116a;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;

/* renamed from: c.b.a.n */
class C1253n implements OnScaleGestureListener {

    /* renamed from: a */
    final /* synthetic */ C1254o f4095a;

    C1253n(C1254o oVar) {
        this.f4095a = oVar;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        double a = this.f4095a.f4096A;
        C1254o.m5398a(this.f4095a, (double) scaleGestureDetector.getScaleFactor());
        long timeDelta = scaleGestureDetector.getTimeDelta();
        if (timeDelta > 0) {
            C1254o oVar = this.f4095a;
            double a2 = oVar.f4096A - a;
            double d = (double) timeDelta;
            Double.isNaN(d);
            oVar.f4097B = a2 / d;
        }
        if (Math.abs(this.f4095a.f4098C - scaleGestureDetector.getCurrentSpan()) >= this.f4095a.f4099D && this.f4095a.mo4640k() == 2) {
            this.f4095a.mo4615a();
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f4095a.f4098C = scaleGestureDetector.getCurrentSpan();
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
