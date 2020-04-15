package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.e.k */
public class C0835k extends C0833i {

    /* renamed from: e */
    final Matrix f2943e;

    /* renamed from: f */
    private int f2944f;

    /* renamed from: g */
    private int f2945g;

    /* renamed from: h */
    private final Matrix f2946h = new Matrix();

    /* renamed from: i */
    private final RectF f2947i = new RectF();

    public C0835k(Drawable drawable, int i, int i2) {
        super(drawable);
        boolean z = true;
        C0718j.m3243a(i % 90 == 0);
        if (i2 < 0 || i2 > 8) {
            z = false;
        }
        C0718j.m3243a(z);
        this.f2943e = new Matrix();
        this.f2944f = i;
        this.f2945g = i2;
    }

    /* renamed from: a */
    public void mo3738a(Matrix matrix) {
        mo3779b(matrix);
        if (!this.f2943e.isIdentity()) {
            matrix.preConcat(this.f2943e);
        }
    }

    public void draw(Canvas canvas) {
        if (this.f2944f <= 0) {
            int i = this.f2945g;
            if (i == 0 || i == 1) {
                super.draw(canvas);
                return;
            }
        }
        int save = canvas.save();
        canvas.concat(this.f2943e);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public int getIntrinsicHeight() {
        int i = this.f2945g;
        return (i == 5 || i == 7 || this.f2944f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        int i = this.f2945g;
        return (i == 5 || i == 7 || this.f2944f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.f2944f <= 0) {
            int i = this.f2945g;
            if (i == 0 || i == 1) {
                current.setBounds(rect);
                return;
            }
        }
        int i2 = this.f2945g;
        if (i2 == 2) {
            this.f2943e.setScale(-1.0f, 1.0f);
        } else if (i2 == 7) {
            this.f2943e.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
            this.f2943e.postScale(-1.0f, 1.0f);
        } else if (i2 == 4) {
            this.f2943e.setScale(1.0f, -1.0f);
        } else if (i2 != 5) {
            this.f2943e.setRotate((float) this.f2944f, (float) rect.centerX(), (float) rect.centerY());
        } else {
            this.f2943e.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
            this.f2943e.postScale(1.0f, -1.0f);
        }
        this.f2946h.reset();
        this.f2943e.invert(this.f2946h);
        this.f2947i.set(rect);
        this.f2946h.mapRect(this.f2947i);
        RectF rectF = this.f2947i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
