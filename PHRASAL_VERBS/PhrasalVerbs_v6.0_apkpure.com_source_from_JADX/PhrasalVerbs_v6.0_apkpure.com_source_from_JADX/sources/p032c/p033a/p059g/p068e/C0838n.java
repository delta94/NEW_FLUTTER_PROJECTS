package p032c.p033a.p059g.p068e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.e.n */
public class C0838n extends Drawable implements C0836l {

    /* renamed from: a */
    private final float[] f2952a = new float[8];

    /* renamed from: b */
    final float[] f2953b = new float[8];

    /* renamed from: c */
    float[] f2954c;

    /* renamed from: d */
    final Paint f2955d = new Paint(1);

    /* renamed from: e */
    private boolean f2956e = false;

    /* renamed from: f */
    private float f2957f = 0.0f;

    /* renamed from: g */
    private float f2958g = 0.0f;

    /* renamed from: h */
    private int f2959h = 0;

    /* renamed from: i */
    private boolean f2960i = false;

    /* renamed from: j */
    final Path f2961j = new Path();

    /* renamed from: k */
    final Path f2962k = new Path();

    /* renamed from: l */
    private int f2963l = 0;

    /* renamed from: m */
    private final RectF f2964m = new RectF();

    /* renamed from: n */
    private int f2965n = 255;

    public C0838n(int i) {
        mo3811a(i);
    }

    @TargetApi(11)
    /* renamed from: a */
    public static C0838n m3761a(ColorDrawable colorDrawable) {
        return new C0838n(colorDrawable.getColor());
    }

    /* renamed from: a */
    private void m3762a() {
        float[] fArr;
        float[] fArr2;
        this.f2961j.reset();
        this.f2962k.reset();
        this.f2964m.set(getBounds());
        RectF rectF = this.f2964m;
        float f = this.f2957f;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.f2956e) {
            this.f2962k.addCircle(this.f2964m.centerX(), this.f2964m.centerY(), Math.min(this.f2964m.width(), this.f2964m.height()) / 2.0f, Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr2 = this.f2953b;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = (this.f2952a[i2] + this.f2958g) - (this.f2957f / 2.0f);
                i2++;
            }
            this.f2962k.addRoundRect(this.f2964m, fArr2, Direction.CW);
        }
        RectF rectF2 = this.f2964m;
        float f2 = this.f2957f;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.f2958g + (this.f2960i ? this.f2957f : 0.0f);
        this.f2964m.inset(f3, f3);
        if (this.f2956e) {
            this.f2961j.addCircle(this.f2964m.centerX(), this.f2964m.centerY(), Math.min(this.f2964m.width(), this.f2964m.height()) / 2.0f, Direction.CW);
        } else if (this.f2960i) {
            if (this.f2954c == null) {
                this.f2954c = new float[8];
            }
            while (true) {
                fArr = this.f2954c;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = this.f2952a[i] - this.f2957f;
                i++;
            }
            this.f2961j.addRoundRect(this.f2964m, fArr, Direction.CW);
        } else {
            this.f2961j.addRoundRect(this.f2964m, this.f2952a, Direction.CW);
        }
        float f4 = -f3;
        this.f2964m.inset(f4, f4);
    }

    /* renamed from: a */
    public void mo3801a(float f) {
        if (this.f2958g != f) {
            this.f2958g = f;
            m3762a();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3811a(int i) {
        if (this.f2963l != i) {
            this.f2963l = i;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3802a(int i, float f) {
        if (this.f2959h != i) {
            this.f2959h = i;
            invalidateSelf();
        }
        if (this.f2957f != f) {
            this.f2957f = f;
            m3762a();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3803a(boolean z) {
        this.f2956e = z;
        m3762a();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3804a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f2952a, 0.0f);
        } else {
            C0718j.m3244a(fArr.length == 8, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f2952a, 0, 8);
        }
        m3762a();
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo3805b(float f) {
        C0718j.m3244a(f >= 0.0f, (Object) "radius should be non negative");
        Arrays.fill(this.f2952a, f);
        m3762a();
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo3806b(boolean z) {
        if (this.f2960i != z) {
            this.f2960i = z;
            m3762a();
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        this.f2955d.setColor(C0831g.m3725a(this.f2963l, this.f2965n));
        this.f2955d.setStyle(Style.FILL);
        canvas.drawPath(this.f2961j, this.f2955d);
        if (this.f2957f != 0.0f) {
            this.f2955d.setColor(C0831g.m3725a(this.f2959h, this.f2965n));
            this.f2955d.setStyle(Style.STROKE);
            this.f2955d.setStrokeWidth(this.f2957f);
            canvas.drawPath(this.f2962k, this.f2955d);
        }
    }

    public int getAlpha() {
        return this.f2965n;
    }

    public int getOpacity() {
        return C0831g.m3724a(C0831g.m3725a(this.f2963l, this.f2965n));
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3762a();
    }

    public void setAlpha(int i) {
        if (i != this.f2965n) {
            this.f2965n = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
