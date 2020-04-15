package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p059g.p068e.C0845t.C0847b;
import p032c.p033a.p059g.p068e.C0845t.C0857l;

/* renamed from: c.a.g.e.s */
public class C0844s extends C0833i {

    /* renamed from: e */
    C0847b f3014e;

    /* renamed from: f */
    Object f3015f;

    /* renamed from: g */
    PointF f3016g = null;

    /* renamed from: h */
    int f3017h = 0;

    /* renamed from: i */
    int f3018i = 0;

    /* renamed from: j */
    Matrix f3019j;

    /* renamed from: k */
    private Matrix f3020k = new Matrix();

    public C0844s(Drawable drawable, C0847b bVar) {
        C0718j.m3240a(drawable);
        super(drawable);
        this.f3014e = bVar;
    }

    /* renamed from: d */
    private void m3788d() {
        boolean z;
        C0847b bVar = this.f3014e;
        boolean z2 = true;
        if (bVar instanceof C0857l) {
            Object state = ((C0857l) bVar).getState();
            z = state == null || !state.equals(this.f3015f);
            this.f3015f = state;
        } else {
            z = false;
        }
        if (this.f3017h == getCurrent().getIntrinsicWidth() && this.f3018i == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            mo3831b();
        }
    }

    /* renamed from: a */
    public void mo3738a(Matrix matrix) {
        mo3779b(matrix);
        m3788d();
        Matrix matrix2 = this.f3019j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void mo3829a(PointF pointF) {
        if (!C0715i.m3232a(this.f3016g, pointF)) {
            if (this.f3016g == null) {
                this.f3016g = new PointF();
            }
            this.f3016g.set(pointF);
            mo3831b();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3830a(C0847b bVar) {
        if (!C0715i.m3232a(this.f3014e, bVar)) {
            this.f3014e = bVar;
            this.f3015f = null;
            mo3831b();
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public Drawable mo3778b(Drawable drawable) {
        Drawable b = super.mo3778b(drawable);
        mo3831b();
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3831b() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f3017h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f3018i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f3019j = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f3019j = null;
        } else if (this.f3014e == C0847b.f3021a) {
            current.setBounds(bounds);
            this.f3019j = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            C0847b bVar = this.f3014e;
            Matrix matrix = this.f3020k;
            PointF pointF = this.f3016g;
            float f = pointF != null ? pointF.x : 0.5f;
            PointF pointF2 = this.f3016g;
            bVar.mo3833a(matrix, bounds, intrinsicWidth, intrinsicHeight, f, pointF2 != null ? pointF2.y : 0.5f);
            this.f3019j = this.f3020k;
        }
    }

    /* renamed from: c */
    public C0847b mo3832c() {
        return this.f3014e;
    }

    public void draw(Canvas canvas) {
        m3788d();
        if (this.f3019j != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f3019j);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        mo3831b();
    }
}
