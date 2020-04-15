package p032c.p115b.p116a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: c.b.a.k */
public class C1250k extends C1242c<C1250k> {

    /* renamed from: A */
    private boolean f4065A;

    /* renamed from: z */
    private boolean f4066z;

    public C1250k() {
        mo4622b(true);
    }

    /* renamed from: a */
    private static boolean m5363a(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public boolean mo4627b(C1242c cVar) {
        return !this.f4065A;
    }

    /* renamed from: c */
    public C1250k mo4662c(boolean z) {
        this.f4065A = z;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        View m = mo4642m();
        int k = mo4640k();
        if (motionEvent.getActionMasked() == 1) {
            m.onTouchEvent(motionEvent);
            if ((k == 0 || k == 2) && m.isPressed()) {
                mo4615a();
            }
            mo4631d();
        } else if (k == 0 || k == 2) {
            if (this.f4066z) {
                m5363a(m, motionEvent);
            } else if (!m5363a(m, motionEvent)) {
                if (k != 2) {
                    mo4623b();
                    return;
                }
                return;
            }
            m.onTouchEvent(motionEvent);
            mo4615a();
        } else if (k == 4) {
            m.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: c */
    public boolean mo4630c(C1242c cVar) {
        boolean z = false;
        if (cVar instanceof C1250k) {
            C1250k kVar = (C1250k) cVar;
            if (kVar.mo4640k() == 4 && kVar.f4065A) {
                return false;
            }
        }
        boolean z2 = !this.f4065A;
        int k = mo4640k();
        int k2 = cVar.mo4640k();
        if (k == 4 && k2 == 4 && z2) {
            return false;
        }
        if (k == 4 && z2) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public C1250k mo4663d(boolean z) {
        this.f4066z = z;
        return this;
    }

    /* renamed from: d */
    public boolean mo4632d(C1242c cVar) {
        return super.mo4632d(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4609p() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        mo4642m().onTouchEvent(obtain);
    }
}
