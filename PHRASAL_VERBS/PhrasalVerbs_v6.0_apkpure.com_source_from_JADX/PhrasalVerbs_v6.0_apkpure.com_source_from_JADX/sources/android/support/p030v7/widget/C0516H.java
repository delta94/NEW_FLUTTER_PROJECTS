package android.support.p030v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.widget.C0345D;
import android.support.p029v4.widget.C0359b;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p000a.p005b.p009c.p010a.p011a.C0052h.C0053a;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.H */
class C0516H {

    /* renamed from: a */
    private final TextView f1931a;

    /* renamed from: b */
    private C0616ta f1932b;

    /* renamed from: c */
    private C0616ta f1933c;

    /* renamed from: d */
    private C0616ta f1934d;

    /* renamed from: e */
    private C0616ta f1935e;

    /* renamed from: f */
    private C0616ta f1936f;

    /* renamed from: g */
    private C0616ta f1937g;

    /* renamed from: h */
    private final C0520J f1938h;

    /* renamed from: i */
    private int f1939i = 0;

    /* renamed from: j */
    private Typeface f1940j;

    /* renamed from: k */
    private boolean f1941k;

    C0516H(TextView textView) {
        this.f1931a = textView;
        this.f1938h = new C0520J(this.f1931a);
    }

    /* renamed from: a */
    private static C0616ta m2468a(Context context, C0600o oVar, int i) {
        ColorStateList b = oVar.mo3146b(context, i);
        if (b == null) {
            return null;
        }
        C0616ta taVar = new C0616ta();
        taVar.f2389d = true;
        taVar.f2386a = b;
        return taVar;
    }

    /* renamed from: a */
    private void m2469a(Context context, C0620va vaVar) {
        Typeface typeface;
        this.f1939i = vaVar.mo3261d(C0172j.TextAppearance_android_textStyle, this.f1939i);
        boolean z = false;
        if (vaVar.mo3268g(C0172j.TextAppearance_android_fontFamily) || vaVar.mo3268g(C0172j.TextAppearance_fontFamily)) {
            this.f1940j = null;
            int i = vaVar.mo3268g(C0172j.TextAppearance_fontFamily) ? C0172j.TextAppearance_fontFamily : C0172j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f1940j = vaVar.mo3254a(i, this.f1939i, (C0053a) new C0514G(this, new WeakReference(this.f1931a)));
                    if (this.f1940j == null) {
                        z = true;
                    }
                    this.f1941k = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1940j == null) {
                String d = vaVar.mo3262d(i);
                if (d != null) {
                    this.f1940j = Typeface.create(d, this.f1939i);
                }
            }
            return;
        }
        if (vaVar.mo3268g(C0172j.TextAppearance_android_typeface)) {
            this.f1941k = false;
            int d2 = vaVar.mo3261d(C0172j.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                typeface = Typeface.SERIF;
            } else if (d2 == 3) {
                typeface = Typeface.MONOSPACE;
            }
            this.f1940j = typeface;
        }
    }

    /* renamed from: a */
    private void m2470a(Drawable drawable, C0616ta taVar) {
        if (drawable != null && taVar != null) {
            C0600o.m2855a(drawable, taVar, this.f1931a.getDrawableState());
        }
    }

    /* renamed from: b */
    private void m2471b(int i, float f) {
        this.f1938h.mo2683a(i, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2632a() {
        if (!(this.f1932b == null && this.f1933c == null && this.f1934d == null && this.f1935e == null)) {
            Drawable[] compoundDrawables = this.f1931a.getCompoundDrawables();
            m2470a(compoundDrawables[0], this.f1932b);
            m2470a(compoundDrawables[1], this.f1933c);
            m2470a(compoundDrawables[2], this.f1934d);
            m2470a(compoundDrawables[3], this.f1935e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1936f != null || this.f1937g != null) {
            Drawable[] compoundDrawablesRelative = this.f1931a.getCompoundDrawablesRelative();
            m2470a(compoundDrawablesRelative[0], this.f1936f);
            m2470a(compoundDrawablesRelative[2], this.f1937g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2633a(int i) {
        this.f1938h.mo2682a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2634a(int i, float f) {
        if (!C0359b.f1140a && !mo2648h()) {
            m2471b(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2635a(int i, int i2, int i3, int i4) {
        this.f1938h.mo2684a(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2636a(Context context, int i) {
        C0620va a = C0620va.m2918a(context, i, C0172j.TextAppearance);
        if (a.mo3268g(C0172j.TextAppearance_textAllCaps)) {
            mo2639a(a.mo3256a(C0172j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo3268g(C0172j.TextAppearance_android_textColor)) {
            ColorStateList a2 = a.mo3253a(C0172j.TextAppearance_android_textColor);
            if (a2 != null) {
                this.f1931a.setTextColor(a2);
            }
        }
        if (a.mo3268g(C0172j.TextAppearance_android_textSize) && a.mo3259c(C0172j.TextAppearance_android_textSize, -1) == 0) {
            this.f1931a.setTextSize(0, 0.0f);
        }
        m2469a(context, a);
        a.mo3255a();
        Typeface typeface = this.f1940j;
        if (typeface != null) {
            this.f1931a.setTypeface(typeface, this.f1939i);
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo2637a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f1931a.getContext();
        C0600o a = C0600o.m2852a();
        C0620va a2 = C0620va.m2920a(context, attributeSet2, C0172j.AppCompatTextHelper, i2, 0);
        int g = a2.mo3267g(C0172j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo3268g(C0172j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1932b = m2468a(context, a, a2.mo3267g(C0172j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo3268g(C0172j.AppCompatTextHelper_android_drawableTop)) {
            this.f1933c = m2468a(context, a, a2.mo3267g(C0172j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo3268g(C0172j.AppCompatTextHelper_android_drawableRight)) {
            this.f1934d = m2468a(context, a, a2.mo3267g(C0172j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo3268g(C0172j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1935e = m2468a(context, a, a2.mo3267g(C0172j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (VERSION.SDK_INT >= 17) {
            if (a2.mo3268g(C0172j.AppCompatTextHelper_android_drawableStart)) {
                this.f1936f = m2468a(context, a, a2.mo3267g(C0172j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.mo3268g(C0172j.AppCompatTextHelper_android_drawableEnd)) {
                this.f1937g = m2468a(context, a, a2.mo3267g(C0172j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.mo3255a();
        boolean z3 = this.f1931a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C0620va a3 = C0620va.m2918a(context, g, C0172j.TextAppearance);
            if (z3 || !a3.mo3268g(C0172j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo3256a(C0172j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m2469a(context, a3);
            if (VERSION.SDK_INT < 23) {
                ColorStateList a4 = a3.mo3268g(C0172j.TextAppearance_android_textColor) ? a3.mo3253a(C0172j.TextAppearance_android_textColor) : null;
                colorStateList = a3.mo3268g(C0172j.TextAppearance_android_textColorHint) ? a3.mo3253a(C0172j.TextAppearance_android_textColorHint) : null;
                if (a3.mo3268g(C0172j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a3.mo3253a(C0172j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = a4;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.mo3255a();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        C0620va a5 = C0620va.m2920a(context, attributeSet2, C0172j.TextAppearance, i2, 0);
        if (z3 || !a5.mo3268g(C0172j.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = a5.mo3256a(C0172j.TextAppearance_textAllCaps, false);
        }
        if (VERSION.SDK_INT < 23) {
            if (a5.mo3268g(C0172j.TextAppearance_android_textColor)) {
                colorStateList3 = a5.mo3253a(C0172j.TextAppearance_android_textColor);
            }
            if (a5.mo3268g(C0172j.TextAppearance_android_textColorHint)) {
                colorStateList = a5.mo3253a(C0172j.TextAppearance_android_textColorHint);
            }
            if (a5.mo3268g(C0172j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a5.mo3253a(C0172j.TextAppearance_android_textColorLink);
            }
        }
        if (VERSION.SDK_INT >= 28 && a5.mo3268g(C0172j.TextAppearance_android_textSize) && a5.mo3259c(C0172j.TextAppearance_android_textSize, -1) == 0) {
            this.f1931a.setTextSize(0, 0.0f);
        }
        m2469a(context, a5);
        a5.mo3255a();
        if (colorStateList3 != null) {
            this.f1931a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f1931a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f1931a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            mo2639a(z);
        }
        Typeface typeface = this.f1940j;
        if (typeface != null) {
            this.f1931a.setTypeface(typeface, this.f1939i);
        }
        this.f1938h.mo2685a(attributeSet2, i2);
        if (C0359b.f1140a && this.f1938h.mo2691f() != 0) {
            int[] e = this.f1938h.mo2690e();
            if (e.length > 0) {
                if (((float) this.f1931a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1931a.setAutoSizeTextTypeUniformWithConfiguration(this.f1938h.mo2688c(), this.f1938h.mo2687b(), this.f1938h.mo2689d(), 0);
                } else {
                    this.f1931a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        C0620va a6 = C0620va.m2919a(context, attributeSet2, C0172j.AppCompatTextView);
        int c = a6.mo3259c(C0172j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int c2 = a6.mo3259c(C0172j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int c3 = a6.mo3259c(C0172j.AppCompatTextView_lineHeight, -1);
        a6.mo3255a();
        if (c != -1) {
            C0345D.m1492a(this.f1931a, c);
        }
        if (c2 != -1) {
            C0345D.m1496b(this.f1931a, c2);
        }
        if (c3 != -1) {
            C0345D.m1498c(this.f1931a, c3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2638a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1941k) {
            this.f1940j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1939i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2639a(boolean z) {
        this.f1931a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2640a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0359b.f1140a) {
            mo2642b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2641a(int[] iArr, int i) {
        this.f1938h.mo2686a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2642b() {
        this.f1938h.mo2681a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo2643c() {
        return this.f1938h.mo2687b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2644d() {
        return this.f1938h.mo2688c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo2645e() {
        return this.f1938h.mo2689d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int[] mo2646f() {
        return this.f1938h.mo2690e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo2647g() {
        return this.f1938h.mo2691f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo2648h() {
        return this.f1938h.mo2692g();
    }
}
