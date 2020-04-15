package android.support.p030v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p029v4.graphics.drawable.C0311a;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.A */
class C0492A extends C0621w {

    /* renamed from: d */
    private final SeekBar f1784d;

    /* renamed from: e */
    private Drawable f1785e;

    /* renamed from: f */
    private ColorStateList f1786f = null;

    /* renamed from: g */
    private Mode f1787g = null;

    /* renamed from: h */
    private boolean f1788h = false;

    /* renamed from: i */
    private boolean f1789i = false;

    C0492A(SeekBar seekBar) {
        super(seekBar);
        this.f1784d = seekBar;
    }

    /* renamed from: d */
    private void m2339d() {
        if (this.f1785e == null) {
            return;
        }
        if (this.f1788h || this.f1789i) {
            this.f1785e = C0311a.m1350h(this.f1785e.mutate());
            if (this.f1788h) {
                C0311a.m1336a(this.f1785e, this.f1786f);
            }
            if (this.f1789i) {
                C0311a.m1339a(this.f1785e, this.f1787g);
            }
            if (this.f1785e.isStateful()) {
                this.f1785e.setState(this.f1784d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2406a(Canvas canvas) {
        if (this.f1785e != null) {
            int max = this.f1784d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1785e.getIntrinsicWidth();
                int intrinsicHeight = this.f1785e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1785e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1784d.getWidth() - this.f1784d.getPaddingLeft()) - this.f1784d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1784d.getPaddingLeft(), (float) (this.f1784d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1785e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2407a(Drawable drawable) {
        Drawable drawable2 = this.f1785e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1785e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1784d);
            C0311a.m1342a(drawable, C0156v.m565g(this.f1784d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1784d.getDrawableState());
            }
            m2339d();
        }
        this.f1784d.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2408a(AttributeSet attributeSet, int i) {
        super.mo2408a(attributeSet, i);
        C0620va a = C0620va.m2920a(this.f1784d.getContext(), attributeSet, C0172j.AppCompatSeekBar, i, 0);
        Drawable c = a.mo3260c(C0172j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f1784d.setThumb(c);
        }
        mo2407a(a.mo3258b(C0172j.AppCompatSeekBar_tickMark));
        if (a.mo3268g(C0172j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1787g = C0525M.m2559a(a.mo3261d(C0172j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1787g);
            this.f1789i = true;
        }
        if (a.mo3268g(C0172j.AppCompatSeekBar_tickMarkTint)) {
            this.f1786f = a.mo3253a(C0172j.AppCompatSeekBar_tickMarkTint);
            this.f1788h = true;
        }
        a.mo3255a();
        m2339d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2409b() {
        Drawable drawable = this.f1785e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1784d.getDrawableState())) {
            this.f1784d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2410c() {
        Drawable drawable = this.f1785e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
