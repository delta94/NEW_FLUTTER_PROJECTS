package com.facebook.react.views.swiperefresh;

import android.support.p029v4.widget.C0342C;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.events.C1643i;

/* renamed from: com.facebook.react.views.swiperefresh.a */
public class C1798a extends C0342C {

    /* renamed from: Q */
    private boolean f5328Q = false;

    /* renamed from: R */
    private boolean f5329R = false;

    /* renamed from: S */
    private float f5330S = 0.0f;

    /* renamed from: T */
    private int f5331T;

    /* renamed from: U */
    private float f5332U;

    /* renamed from: V */
    private boolean f5333V;

    public C1798a(ReactContext reactContext) {
        super(reactContext);
        this.f5331T = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    /* renamed from: b */
    private boolean m6886b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5332U = motionEvent.getX();
            this.f5333V = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f5332U);
            if (this.f5333V || abs > ((float) this.f5331T)) {
                this.f5333V = true;
                return false;
            }
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!m6886b(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        C1643i.m6445a(this, motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f5328Q) {
            this.f5328Q = true;
            setProgressViewOffset(this.f5330S);
            setRefreshing(this.f5329R);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.f5330S = f;
        if (this.f5328Q) {
            int progressCircleDiameter = getProgressCircleDiameter();
            mo1465a(false, Math.round(C1726w.m6668b(f)) - progressCircleDiameter, Math.round(C1726w.m6668b(f + 64.0f) - ((float) progressCircleDiameter)));
        }
    }

    public void setRefreshing(boolean z) {
        this.f5329R = z;
        if (this.f5328Q) {
            super.setRefreshing(z);
        }
    }
}
