package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.e.p */
public class C0840p extends C0833i implements C0836l {

    /* renamed from: e */
    C0841a f2967e = C0841a.OVERLAY_COLOR;

    /* renamed from: f */
    private final RectF f2968f = new RectF();

    /* renamed from: g */
    private RectF f2969g;

    /* renamed from: h */
    private Matrix f2970h;

    /* renamed from: i */
    private final float[] f2971i = new float[8];

    /* renamed from: j */
    final float[] f2972j = new float[8];

    /* renamed from: k */
    final Paint f2973k = new Paint(1);

    /* renamed from: l */
    private boolean f2974l = false;

    /* renamed from: m */
    private float f2975m = 0.0f;

    /* renamed from: n */
    private int f2976n = 0;

    /* renamed from: o */
    private int f2977o = 0;

    /* renamed from: p */
    private float f2978p = 0.0f;

    /* renamed from: q */
    private boolean f2979q = false;

    /* renamed from: r */
    private final Path f2980r = new Path();

    /* renamed from: s */
    private final Path f2981s = new Path();

    /* renamed from: t */
    private final RectF f2982t = new RectF();

    /* renamed from: c.a.g.e.p$a */
    public enum C0841a {
        OVERLAY_COLOR,
        CLIPPING
    }

    public C0840p(Drawable drawable) {
        C0718j.m3240a(drawable);
        super(drawable);
    }

    /* renamed from: b */
    private void m3770b() {
        float[] fArr;
        this.f2980r.reset();
        this.f2981s.reset();
        this.f2982t.set(getBounds());
        RectF rectF = this.f2982t;
        float f = this.f2978p;
        rectF.inset(f, f);
        this.f2980r.addRect(this.f2982t, Direction.CW);
        if (this.f2974l) {
            this.f2980r.addCircle(this.f2982t.centerX(), this.f2982t.centerY(), Math.min(this.f2982t.width(), this.f2982t.height()) / 2.0f, Direction.CW);
        } else {
            this.f2980r.addRoundRect(this.f2982t, this.f2971i, Direction.CW);
        }
        RectF rectF2 = this.f2982t;
        float f2 = this.f2978p;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f2982t;
        float f3 = this.f2975m;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f2974l) {
            this.f2981s.addCircle(this.f2982t.centerX(), this.f2982t.centerY(), Math.min(this.f2982t.width(), this.f2982t.height()) / 2.0f, Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f2972j;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f2971i[i] + this.f2978p) - (this.f2975m / 2.0f);
                i++;
            }
            this.f2981s.addRoundRect(this.f2982t, fArr, Direction.CW);
        }
        RectF rectF4 = this.f2982t;
        float f4 = this.f2975m;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    /* renamed from: a */
    public void mo3801a(float f) {
        this.f2978p = f;
        m3770b();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3818a(int i) {
        this.f2977o = i;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3802a(int i, float f) {
        this.f2976n = i;
        this.f2975m = f;
        m3770b();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3803a(boolean z) {
        this.f2974l = z;
        m3770b();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3804a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f2971i, 0.0f);
        } else {
            C0718j.m3244a(fArr.length == 8, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f2971i, 0, 8);
        }
        m3770b();
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo3805b(float f) {
        Arrays.fill(this.f2971i, f);
        m3770b();
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo3806b(boolean z) {
        this.f2979q = z;
        m3770b();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f2968f.set(getBounds());
        int i = C0839o.f2966a[this.f2967e.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            this.f2980r.setFillType(FillType.EVEN_ODD);
            canvas.clipPath(this.f2980r);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.f2979q) {
                RectF rectF = this.f2969g;
                if (rectF == null) {
                    this.f2969g = new RectF(this.f2968f);
                    this.f2970h = new Matrix();
                } else {
                    rectF.set(this.f2968f);
                }
                RectF rectF2 = this.f2969g;
                float f = this.f2975m;
                rectF2.inset(f, f);
                this.f2970h.setRectToRect(this.f2968f, this.f2969g, ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f2968f);
                canvas.concat(this.f2970h);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f2973k.setStyle(Style.FILL);
            this.f2973k.setColor(this.f2977o);
            this.f2973k.setStrokeWidth(0.0f);
            this.f2980r.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.f2980r, this.f2973k);
            if (this.f2974l) {
                float width = ((this.f2968f.width() - this.f2968f.height()) + this.f2975m) / 2.0f;
                float height = ((this.f2968f.height() - this.f2968f.width()) + this.f2975m) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f2968f;
                    float f2 = rectF3.left;
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.f2973k);
                    RectF rectF4 = this.f2968f;
                    float f3 = rectF4.right;
                    canvas2.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.f2973k);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f2968f;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    Canvas canvas3 = canvas;
                    canvas3.drawRect(f4, f5, rectF5.right, f5 + height, this.f2973k);
                    RectF rectF6 = this.f2968f;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas3.drawRect(f6, f7 - height, rectF6.right, f7, this.f2973k);
                }
            }
        }
        if (this.f2976n != 0) {
            this.f2973k.setStyle(Style.STROKE);
            this.f2973k.setColor(this.f2976n);
            this.f2973k.setStrokeWidth(this.f2975m);
            this.f2980r.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.f2981s, this.f2973k);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3770b();
    }
}
