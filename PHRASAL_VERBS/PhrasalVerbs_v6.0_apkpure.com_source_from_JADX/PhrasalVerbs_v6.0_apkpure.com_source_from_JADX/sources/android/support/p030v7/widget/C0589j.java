package android.support.p030v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.j */
class C0589j {

    /* renamed from: a */
    private final View f2267a;

    /* renamed from: b */
    private final C0600o f2268b;

    /* renamed from: c */
    private int f2269c = -1;

    /* renamed from: d */
    private C0616ta f2270d;

    /* renamed from: e */
    private C0616ta f2271e;

    /* renamed from: f */
    private C0616ta f2272f;

    C0589j(View view) {
        this.f2267a = view;
        this.f2268b = C0600o.m2852a();
    }

    /* renamed from: b */
    private boolean m2805b(Drawable drawable) {
        if (this.f2272f == null) {
            this.f2272f = new C0616ta();
        }
        C0616ta taVar = this.f2272f;
        taVar.mo3241a();
        ColorStateList b = C0156v.m554b(this.f2267a);
        if (b != null) {
            taVar.f2389d = true;
            taVar.f2386a = b;
        }
        Mode c = C0156v.m557c(this.f2267a);
        if (c != null) {
            taVar.f2388c = true;
            taVar.f2387b = c;
        }
        if (!taVar.f2389d && !taVar.f2388c) {
            return false;
        }
        C0600o.m2855a(drawable, taVar, this.f2267a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m2806d() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f2270d == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3082a() {
        /*
            r3 = this;
            android.view.View r0 = r3.f2267a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0028
            boolean r1 = r3.m2806d()
            if (r1 == 0) goto L_0x0015
            boolean r1 = r3.m2805b(r0)
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            android.support.v7.widget.ta r1 = r3.f2271e
            if (r1 == 0) goto L_0x0023
        L_0x0019:
            android.view.View r2 = r3.f2267a
            int[] r2 = r2.getDrawableState()
            android.support.p030v7.widget.C0600o.m2855a(r0, r1, r2)
            goto L_0x0028
        L_0x0023:
            android.support.v7.widget.ta r1 = r3.f2270d
            if (r1 == 0) goto L_0x0028
            goto L_0x0019
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0589j.mo3082a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3083a(int i) {
        this.f2269c = i;
        C0600o oVar = this.f2268b;
        mo3084a(oVar != null ? oVar.mo3146b(this.f2267a.getContext(), i) : null);
        mo3082a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3084a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2270d == null) {
                this.f2270d = new C0616ta();
            }
            C0616ta taVar = this.f2270d;
            taVar.f2386a = colorStateList;
            taVar.f2389d = true;
        } else {
            this.f2270d = null;
        }
        mo3082a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3085a(Mode mode) {
        if (this.f2271e == null) {
            this.f2271e = new C0616ta();
        }
        C0616ta taVar = this.f2271e;
        taVar.f2387b = mode;
        taVar.f2388c = true;
        mo3082a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3086a(Drawable drawable) {
        this.f2269c = -1;
        mo3084a((ColorStateList) null);
        mo3082a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3087a(AttributeSet attributeSet, int i) {
        C0620va a = C0620va.m2920a(this.f2267a.getContext(), attributeSet, C0172j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo3268g(C0172j.ViewBackgroundHelper_android_background)) {
                this.f2269c = a.mo3267g(C0172j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f2268b.mo3146b(this.f2267a.getContext(), this.f2269c);
                if (b != null) {
                    mo3084a(b);
                }
            }
            if (a.mo3268g(C0172j.ViewBackgroundHelper_backgroundTint)) {
                C0156v.m545a(this.f2267a, a.mo3253a(C0172j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo3268g(C0172j.ViewBackgroundHelper_backgroundTintMode)) {
                C0156v.m546a(this.f2267a, C0525M.m2559a(a.mo3261d(C0172j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.mo3255a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo3088b() {
        C0616ta taVar = this.f2271e;
        if (taVar != null) {
            return taVar.f2386a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3089b(ColorStateList colorStateList) {
        if (this.f2271e == null) {
            this.f2271e = new C0616ta();
        }
        C0616ta taVar = this.f2271e;
        taVar.f2386a = colorStateList;
        taVar.f2389d = true;
        mo3082a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo3090c() {
        C0616ta taVar = this.f2271e;
        if (taVar != null) {
            return taVar.f2387b;
        }
        return null;
    }
}
