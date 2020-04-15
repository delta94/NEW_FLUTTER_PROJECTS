package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* renamed from: com.facebook.react.views.scroll.m */
public class C1792m {

    /* renamed from: a */
    private VelocityTracker f5313a;

    /* renamed from: b */
    private float f5314b;

    /* renamed from: c */
    private float f5315c;

    /* renamed from: a */
    public float mo6299a() {
        return this.f5314b;
    }

    /* renamed from: a */
    public void mo6300a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f5313a == null) {
            this.f5313a = VelocityTracker.obtain();
        }
        this.f5313a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f5313a.computeCurrentVelocity(1);
            this.f5314b = this.f5313a.getXVelocity();
            this.f5315c = this.f5313a.getYVelocity();
            VelocityTracker velocityTracker = this.f5313a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5313a = null;
            }
        }
    }

    /* renamed from: b */
    public float mo6301b() {
        return this.f5315c;
    }
}
