package com.facebook.react.views.drawer;

import android.support.p029v4.widget.C0373k;
import android.support.p029v4.widget.C0373k.C0377d;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.C1643i;

/* renamed from: com.facebook.react.views.drawer.a */
class C1742a extends C0373k {

    /* renamed from: P */
    private int f5135P = 8388611;

    /* renamed from: Q */
    private int f5136Q = -1;

    public C1742a(ReactContext reactContext) {
        super(reactContext);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6061e() {
        mo1721a(this.f5135P);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo6062f() {
        mo1754f(this.f5135P);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo6063g() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            C0377d dVar = (C0377d) childAt.getLayoutParams();
            dVar.f1237a = this.f5135P;
            dVar.width = this.f5136Q;
            childAt.setLayoutParams(dVar);
            childAt.setClickable(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo6064g(int i) {
        this.f5135P = i;
        mo6063g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo6065h(int i) {
        this.f5136Q = i;
        mo6063g();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C1643i.m6445a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e) {
            Log.w("ReactNative", "Error intercepting touch event.", e);
        }
        return false;
    }
}
