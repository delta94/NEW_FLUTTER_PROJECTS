package p032c.p033a.p059g.p068e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* renamed from: c.a.g.e.m */
public class C0837m extends C0842q {

    /* renamed from: C */
    private final Paint f2948C = new Paint();

    /* renamed from: D */
    private final Paint f2949D = new Paint(1);

    /* renamed from: E */
    private final Bitmap f2950E;

    /* renamed from: F */
    private WeakReference<Bitmap> f2951F;

    public C0837m(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.f2950E = bitmap;
        if (paint != null) {
            this.f2948C.set(paint);
        }
        this.f2948C.setFlags(1);
        this.f2949D.setStyle(Style.STROKE);
    }

    /* renamed from: d */
    private void m3759d() {
        WeakReference<Bitmap> weakReference = this.f2951F;
        if (weakReference == null || weakReference.get() != this.f2950E) {
            this.f2951F = new WeakReference<>(this.f2950E);
            Paint paint = this.f2948C;
            Bitmap bitmap = this.f2950E;
            TileMode tileMode = TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f2993f = true;
        }
        if (this.f2993f) {
            this.f2948C.getShader().setLocalMatrix(this.f3011x);
            this.f2993f = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3807a() {
        return super.mo3807a() && this.f2950E != null;
    }

    public void draw(Canvas canvas) {
        if (!mo3807a()) {
            super.draw(canvas);
            return;
        }
        mo3820c();
        mo3819b();
        m3759d();
        int save = canvas.save();
        canvas.concat(this.f3008u);
        canvas.drawPath(this.f2992e, this.f2948C);
        float f = this.f2991d;
        if (f > 0.0f) {
            this.f2949D.setStrokeWidth(f);
            this.f2949D.setColor(C0831g.m3725a(this.f2994g, this.f2948C.getAlpha()));
            canvas.drawPath(this.f2995h, this.f2949D);
        }
        canvas.restoreToCount(save);
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f2948C.getAlpha()) {
            this.f2948C.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f2948C.setColorFilter(colorFilter);
    }
}
