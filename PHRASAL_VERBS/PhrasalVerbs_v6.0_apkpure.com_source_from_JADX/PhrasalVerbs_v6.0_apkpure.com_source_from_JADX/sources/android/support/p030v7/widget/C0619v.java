package android.support.p030v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p029v4.widget.C0387s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.v */
class C0619v extends PopupWindow {

    /* renamed from: a */
    private static final boolean f2394a = (VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f2395b;

    public C0619v(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2916a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m2916a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0620va a = C0620va.m2920a(context, attributeSet, C0172j.PopupWindow, i, i2);
        if (a.mo3268g(C0172j.PopupWindow_overlapAnchor)) {
            m2917a(a.mo3256a(C0172j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo3258b(C0172j.PopupWindow_android_popupBackground));
        a.mo3255a();
    }

    /* renamed from: a */
    private void m2917a(boolean z) {
        if (f2394a) {
            this.f2395b = z;
        } else {
            C0387s.m1781a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f2394a && this.f2395b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2394a && this.f2395b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2394a && this.f2395b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
