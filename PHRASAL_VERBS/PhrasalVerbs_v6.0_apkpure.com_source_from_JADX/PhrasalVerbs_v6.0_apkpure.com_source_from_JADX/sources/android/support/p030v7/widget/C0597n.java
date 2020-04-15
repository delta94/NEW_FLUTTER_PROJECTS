package android.support.p030v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.widget.C0366g;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.n */
class C0597n {

    /* renamed from: a */
    private final CompoundButton f2281a;

    /* renamed from: b */
    private ColorStateList f2282b = null;

    /* renamed from: c */
    private Mode f2283c = null;

    /* renamed from: d */
    private boolean f2284d = false;

    /* renamed from: e */
    private boolean f2285e = false;

    /* renamed from: f */
    private boolean f2286f;

    C0597n(CompoundButton compoundButton) {
        this.f2281a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3127a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0366g.m1682a(this.f2281a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3128a() {
        Drawable a = C0366g.m1682a(this.f2281a);
        if (a == null) {
            return;
        }
        if (this.f2284d || this.f2285e) {
            Drawable mutate = C0311a.m1350h(a).mutate();
            if (this.f2284d) {
                C0311a.m1336a(mutate, this.f2282b);
            }
            if (this.f2285e) {
                C0311a.m1339a(mutate, this.f2283c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2281a.getDrawableState());
            }
            this.f2281a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3129a(ColorStateList colorStateList) {
        this.f2282b = colorStateList;
        this.f2284d = true;
        mo3128a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3130a(Mode mode) {
        this.f2283c = mode;
        this.f2285e = true;
        mo3128a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3131a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2281a.getContext().obtainStyledAttributes(attributeSet, C0172j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0172j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C0172j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.f2281a.setButtonDrawable(C0173a.m597b(this.f2281a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C0172j.CompoundButton_buttonTint)) {
                C0366g.m1683a(this.f2281a, obtainStyledAttributes.getColorStateList(C0172j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0172j.CompoundButton_buttonTintMode)) {
                C0366g.m1684a(this.f2281a, C0525M.m2559a(obtainStyledAttributes.getInt(C0172j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo3132b() {
        return this.f2282b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo3133c() {
        return this.f2283c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3134d() {
        if (this.f2286f) {
            this.f2286f = false;
            return;
        }
        this.f2286f = true;
        mo3128a();
    }
}
