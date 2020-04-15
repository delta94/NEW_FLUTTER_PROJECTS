package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.e.c */
public class C0827c extends C0833i implements Runnable, C0828d {

    /* renamed from: e */
    private int f2917e;

    /* renamed from: f */
    private boolean f2918f;

    /* renamed from: g */
    float f2919g;

    /* renamed from: h */
    private boolean f2920h;

    public C0827c(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    public C0827c(Drawable drawable, int i, boolean z) {
        C0718j.m3240a(drawable);
        super(drawable);
        this.f2919g = 0.0f;
        this.f2920h = false;
        this.f2917e = i;
        this.f2918f = z;
    }

    /* renamed from: b */
    private int m3715b() {
        return (int) ((20.0f / ((float) this.f2917e)) * 360.0f);
    }

    /* renamed from: c */
    private void m3716c() {
        if (!this.f2920h) {
            this.f2920h = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f2919g;
        if (!this.f2918f) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) (bounds.left + (i / 2)), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        m3716c();
    }

    public void run() {
        this.f2920h = false;
        this.f2919g += (float) m3715b();
        invalidateSelf();
    }
}
