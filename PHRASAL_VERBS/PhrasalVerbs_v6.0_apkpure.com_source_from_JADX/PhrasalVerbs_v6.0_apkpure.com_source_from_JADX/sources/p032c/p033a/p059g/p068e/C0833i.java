package p032c.p033a.p059g.p068e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: c.a.g.e.i */
public class C0833i extends Drawable implements Callback, C0859v, C0858u, C0829e {

    /* renamed from: a */
    private static final Matrix f2935a = new Matrix();

    /* renamed from: b */
    private Drawable f2936b;

    /* renamed from: c */
    private final C0830f f2937c = new C0830f();

    /* renamed from: d */
    protected C0859v f2938d;

    public C0833i(Drawable drawable) {
        this.f2936b = drawable;
        C0831g.m3726a(this.f2936b, this, this);
    }

    /* renamed from: a */
    public Drawable mo3733a() {
        return getCurrent();
    }

    /* renamed from: a */
    public Drawable mo3734a(Drawable drawable) {
        return mo3778b(drawable);
    }

    /* renamed from: a */
    public void mo3738a(Matrix matrix) {
        mo3779b(matrix);
    }

    /* renamed from: a */
    public void mo3739a(RectF rectF) {
        C0859v vVar = this.f2938d;
        if (vVar != null) {
            vVar.mo3739a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* renamed from: a */
    public void mo3740a(C0859v vVar) {
        this.f2938d = vVar;
    }

    /* renamed from: b */
    public Drawable mo3778b(Drawable drawable) {
        Drawable c = mo3780c(drawable);
        invalidateSelf();
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3779b(Matrix matrix) {
        C0859v vVar = this.f2938d;
        if (vVar != null) {
            vVar.mo3738a(matrix);
        } else {
            matrix.reset();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Drawable mo3780c(Drawable drawable) {
        Drawable drawable2 = this.f2936b;
        C0831g.m3726a(drawable2, null, null);
        C0831g.m3726a(drawable, null, null);
        C0831g.m3728a(drawable, this.f2937c);
        C0831g.m3727a(drawable, (Drawable) this);
        C0831g.m3726a(drawable, this, this);
        this.f2936b = drawable;
        return drawable2;
    }

    public void draw(Canvas canvas) {
        this.f2936b.draw(canvas);
    }

    public ConstantState getConstantState() {
        return this.f2936b.getConstantState();
    }

    public Drawable getCurrent() {
        return this.f2936b;
    }

    public int getIntrinsicHeight() {
        return this.f2936b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2936b.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f2936b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2936b.getPadding(rect);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        return this.f2936b.isStateful();
    }

    public Drawable mutate() {
        this.f2936b.mutate();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f2936b.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2936b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f2936b.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2937c.mo3763a(i);
        this.f2936b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2937c.mo3764a(colorFilter);
        this.f2936b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2937c.mo3766a(z);
        this.f2936b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2937c.mo3767b(z);
        this.f2936b.setFilterBitmap(z);
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        this.f2936b.setHotspot(f, f2);
    }

    public boolean setVisible(boolean z, boolean z2) {
        super.setVisible(z, z2);
        return this.f2936b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
