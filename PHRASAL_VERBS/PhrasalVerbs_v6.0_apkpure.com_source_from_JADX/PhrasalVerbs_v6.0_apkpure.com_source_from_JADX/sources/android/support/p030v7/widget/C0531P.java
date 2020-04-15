package android.support.p030v7.widget;

import android.os.SystemClock;
import android.support.p030v7.view.menu.C0491z;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.P */
public abstract class C0531P implements OnTouchListener, OnAttachStateChangeListener {

    /* renamed from: a */
    private final float f1985a;

    /* renamed from: b */
    private final int f1986b;

    /* renamed from: c */
    private final int f1987c;

    /* renamed from: d */
    final View f1988d;

    /* renamed from: e */
    private Runnable f1989e;

    /* renamed from: f */
    private Runnable f1990f;

    /* renamed from: g */
    private boolean f1991g;

    /* renamed from: h */
    private int f1992h;

    /* renamed from: i */
    private final int[] f1993i = new int[2];

    /* renamed from: android.support.v7.widget.P$a */
    private class C0532a implements Runnable {
        C0532a() {
        }

        public void run() {
            ViewParent parent = C0531P.this.f1988d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.P$b */
    private class C0533b implements Runnable {
        C0533b() {
        }

        public void run() {
            C0531P.this.mo2712d();
        }
    }

    public C0531P(View view) {
        this.f1988d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1985a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1986b = ViewConfiguration.getTapTimeout();
        this.f1987c = (this.f1986b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m2579a(MotionEvent motionEvent) {
        View view = this.f1988d;
        C0491z a = mo2036a();
        if (a != null && a.mo2052b()) {
            C0526N n = (C0526N) a.mo2056d();
            if (n != null && n.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                m2581a(view, obtainNoHistory);
                m2583b(n, obtainNoHistory);
                boolean a2 = n.mo2695a(obtainNoHistory, this.f1992h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z = true;
                boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!a2 || !z2) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2580a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m2581a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1993i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2582b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1988d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1992h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1985a
            boolean r6 = m2580a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m2584e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m2584e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1992h = r6
            java.lang.Runnable r6 = r5.f1989e
            if (r6 != 0) goto L_0x0052
            android.support.v7.widget.P$a r6 = new android.support.v7.widget.P$a
            r6.<init>()
            r5.f1989e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1989e
            int r1 = r5.f1986b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1990f
            if (r6 != 0) goto L_0x0065
            android.support.v7.widget.P$b r6 = new android.support.v7.widget.P$b
            r6.<init>()
            r5.f1990f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1990f
            int r1 = r5.f1987c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0531P.m2582b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m2583b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1993i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: e */
    private void m2584e() {
        Runnable runnable = this.f1990f;
        if (runnable != null) {
            this.f1988d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1989e;
        if (runnable2 != null) {
            this.f1988d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0491z mo2036a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo2037b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2711c() {
        C0491z a = mo2036a();
        if (a != null && a.mo2052b()) {
            a.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2712d() {
        m2584e();
        View view = this.f1988d;
        if (view.isEnabled() && !view.isLongClickable() && mo2037b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1991g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1991g;
        if (z2) {
            z = m2579a(motionEvent) || !mo2711c();
        } else {
            z = m2582b(motionEvent) && mo2037b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1988d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1991g = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1991g = false;
        this.f1992h = -1;
        Runnable runnable = this.f1989e;
        if (runnable != null) {
            this.f1988d.removeCallbacks(runnable);
        }
    }
}
