package android.support.p030v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.p029v4.widget.C0383o;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.s */
public class C0613s {

    /* renamed from: a */
    private final ImageView f2376a;

    /* renamed from: b */
    private C0616ta f2377b;

    /* renamed from: c */
    private C0616ta f2378c;

    /* renamed from: d */
    private C0616ta f2379d;

    public C0613s(ImageView imageView) {
        this.f2376a = imageView;
    }

    /* renamed from: a */
    private boolean m2903a(Drawable drawable) {
        if (this.f2379d == null) {
            this.f2379d = new C0616ta();
        }
        C0616ta taVar = this.f2379d;
        taVar.mo3241a();
        ColorStateList a = C0383o.m1770a(this.f2376a);
        if (a != null) {
            taVar.f2389d = true;
            taVar.f2386a = a;
        }
        Mode b = C0383o.m1773b(this.f2376a);
        if (b != null) {
            taVar.f2388c = true;
            taVar.f2387b = b;
        }
        if (!taVar.f2389d && !taVar.f2388c) {
            return false;
        }
        C0600o.m2855a(drawable, taVar, this.f2376a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m2904e() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f2377b == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r1 != null) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3221a() {
        /*
            r3 = this;
            android.widget.ImageView r0 = r3.f2376a
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x000b
            android.support.p030v7.widget.C0525M.m2561b(r0)
        L_0x000b:
            if (r0 == 0) goto L_0x002d
            boolean r1 = r3.m2904e()
            if (r1 == 0) goto L_0x001a
            boolean r1 = r3.m2903a(r0)
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.support.v7.widget.ta r1 = r3.f2378c
            if (r1 == 0) goto L_0x0028
        L_0x001e:
            android.widget.ImageView r2 = r3.f2376a
            int[] r2 = r2.getDrawableState()
            android.support.p030v7.widget.C0600o.m2855a(r0, r1, r2)
            goto L_0x002d
        L_0x0028:
            android.support.v7.widget.ta r1 = r3.f2377b
            if (r1 == 0) goto L_0x002d
            goto L_0x001e
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0613s.mo3221a():void");
    }

    /* renamed from: a */
    public void mo3222a(int i) {
        if (i != 0) {
            Drawable b = C0173a.m597b(this.f2376a.getContext(), i);
            if (b != null) {
                C0525M.m2561b(b);
            }
            this.f2376a.setImageDrawable(b);
        } else {
            this.f2376a.setImageDrawable(null);
        }
        mo3221a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3223a(ColorStateList colorStateList) {
        if (this.f2378c == null) {
            this.f2378c = new C0616ta();
        }
        C0616ta taVar = this.f2378c;
        taVar.f2386a = colorStateList;
        taVar.f2389d = true;
        mo3221a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3224a(Mode mode) {
        if (this.f2378c == null) {
            this.f2378c = new C0616ta();
        }
        C0616ta taVar = this.f2378c;
        taVar.f2387b = mode;
        taVar.f2388c = true;
        mo3221a();
    }

    /* renamed from: a */
    public void mo3225a(AttributeSet attributeSet, int i) {
        C0620va a = C0620va.m2920a(this.f2376a.getContext(), attributeSet, C0172j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f2376a.getDrawable();
            if (drawable == null) {
                int g = a.mo3267g(C0172j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0173a.m597b(this.f2376a.getContext(), g);
                    if (drawable != null) {
                        this.f2376a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C0525M.m2561b(drawable);
            }
            if (a.mo3268g(C0172j.AppCompatImageView_tint)) {
                C0383o.m1771a(this.f2376a, a.mo3253a(C0172j.AppCompatImageView_tint));
            }
            if (a.mo3268g(C0172j.AppCompatImageView_tintMode)) {
                C0383o.m1772a(this.f2376a, C0525M.m2559a(a.mo3261d(C0172j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.mo3255a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo3226b() {
        C0616ta taVar = this.f2378c;
        if (taVar != null) {
            return taVar.f2386a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo3227c() {
        C0616ta taVar = this.f2378c;
        if (taVar != null) {
            return taVar.f2387b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo3228d() {
        return VERSION.SDK_INT < 21 || !(this.f2376a.getBackground() instanceof RippleDrawable);
    }
}
