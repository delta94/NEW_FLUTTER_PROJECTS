package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: c.a.g.e.j */
public class C0834j extends C0833i {

    /* renamed from: e */
    private Matrix f2939e;

    /* renamed from: f */
    private Matrix f2940f;

    /* renamed from: g */
    private int f2941g;

    /* renamed from: h */
    private int f2942h;

    /* renamed from: b */
    private void m3748b() {
        Matrix matrix;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f2941g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f2942h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            matrix = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            matrix = this.f2939e;
        }
        this.f2940f = matrix;
    }

    /* renamed from: c */
    private void m3749c() {
        if (this.f2941g != getCurrent().getIntrinsicWidth() || this.f2942h != getCurrent().getIntrinsicHeight()) {
            m3748b();
        }
    }

    /* renamed from: a */
    public void mo3738a(Matrix matrix) {
        super.mo3738a(matrix);
        Matrix matrix2 = this.f2940f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: b */
    public Drawable mo3778b(Drawable drawable) {
        Drawable b = super.mo3778b(drawable);
        m3748b();
        return b;
    }

    public void draw(Canvas canvas) {
        m3749c();
        if (this.f2940f != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f2940f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3748b();
    }
}
