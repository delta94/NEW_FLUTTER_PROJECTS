package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.e.q */
public abstract class C0842q extends Drawable implements C0836l, C0858u {

    /* renamed from: A */
    private boolean f2986A = true;

    /* renamed from: B */
    private C0859v f2987B;

    /* renamed from: a */
    private final Drawable f2988a;

    /* renamed from: b */
    protected boolean f2989b = false;

    /* renamed from: c */
    protected boolean f2990c = false;

    /* renamed from: d */
    protected float f2991d = 0.0f;

    /* renamed from: e */
    protected final Path f2992e = new Path();

    /* renamed from: f */
    protected boolean f2993f = true;

    /* renamed from: g */
    protected int f2994g = 0;

    /* renamed from: h */
    protected final Path f2995h = new Path();

    /* renamed from: i */
    private final float[] f2996i = new float[8];

    /* renamed from: j */
    final float[] f2997j = new float[8];

    /* renamed from: k */
    float[] f2998k;

    /* renamed from: l */
    final RectF f2999l = new RectF();

    /* renamed from: m */
    final RectF f3000m = new RectF();

    /* renamed from: n */
    final RectF f3001n = new RectF();

    /* renamed from: o */
    final RectF f3002o = new RectF();

    /* renamed from: p */
    RectF f3003p;

    /* renamed from: q */
    final Matrix f3004q = new Matrix();

    /* renamed from: r */
    final Matrix f3005r = new Matrix();

    /* renamed from: s */
    final Matrix f3006s = new Matrix();

    /* renamed from: t */
    final Matrix f3007t = new Matrix();

    /* renamed from: u */
    final Matrix f3008u = new Matrix();

    /* renamed from: v */
    Matrix f3009v;

    /* renamed from: w */
    Matrix f3010w;

    /* renamed from: x */
    final Matrix f3011x = new Matrix();

    /* renamed from: y */
    private float f3012y = 0.0f;

    /* renamed from: z */
    private boolean f3013z = false;

    C0842q(Drawable drawable) {
        this.f2988a = drawable;
    }

    /* renamed from: a */
    public void mo3801a(float f) {
        if (this.f3012y != f) {
            this.f3012y = f;
            this.f2986A = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3802a(int i, float f) {
        if (this.f2994g != i || this.f2991d != f) {
            this.f2994g = i;
            this.f2991d = f;
            this.f2986A = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo3740a(C0859v vVar) {
        this.f2987B = vVar;
    }

    /* renamed from: a */
    public void mo3803a(boolean z) {
        this.f2989b = z;
        this.f2986A = true;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3804a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f2996i, 0.0f);
            this.f2990c = false;
        } else {
            C0718j.m3244a(fArr.length == 8, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f2996i, 0, 8);
            this.f2990c = false;
            for (int i = 0; i < 8; i++) {
                this.f2990c |= fArr[i] > 0.0f;
            }
        }
        this.f2986A = true;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3807a() {
        return this.f2989b || this.f2990c || this.f2991d > 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3819b() {
        float[] fArr;
        RectF rectF;
        Path path;
        float[] fArr2;
        if (this.f2986A) {
            this.f2995h.reset();
            RectF rectF2 = this.f2999l;
            float f = this.f2991d;
            rectF2.inset(f / 2.0f, f / 2.0f);
            if (this.f2989b) {
                this.f2995h.addCircle(this.f2999l.centerX(), this.f2999l.centerY(), Math.min(this.f2999l.width(), this.f2999l.height()) / 2.0f, Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr2 = this.f2997j;
                    if (i >= fArr2.length) {
                        break;
                    }
                    fArr2[i] = (this.f2996i[i] + this.f3012y) - (this.f2991d / 2.0f);
                    i++;
                }
                this.f2995h.addRoundRect(this.f2999l, fArr2, Direction.CW);
            }
            RectF rectF3 = this.f2999l;
            float f2 = this.f2991d;
            rectF3.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.f2992e.reset();
            float f3 = this.f3012y + (this.f3013z ? this.f2991d : 0.0f);
            this.f2999l.inset(f3, f3);
            if (this.f2989b) {
                this.f2992e.addCircle(this.f2999l.centerX(), this.f2999l.centerY(), Math.min(this.f2999l.width(), this.f2999l.height()) / 2.0f, Direction.CW);
            } else {
                if (this.f3013z) {
                    if (this.f2998k == null) {
                        this.f2998k = new float[8];
                    }
                    for (int i2 = 0; i2 < this.f2997j.length; i2++) {
                        this.f2998k[i2] = this.f2996i[i2] - this.f2991d;
                    }
                    path = this.f2992e;
                    rectF = this.f2999l;
                    fArr = this.f2998k;
                } else {
                    path = this.f2992e;
                    rectF = this.f2999l;
                    fArr = this.f2996i;
                }
                path.addRoundRect(rectF, fArr, Direction.CW);
            }
            float f4 = -f3;
            this.f2999l.inset(f4, f4);
            this.f2992e.setFillType(FillType.WINDING);
            this.f2986A = false;
        }
    }

    /* renamed from: b */
    public void mo3805b(float f) {
        boolean z = false;
        C0718j.m3247b(f >= 0.0f);
        Arrays.fill(this.f2996i, f);
        if (f != 0.0f) {
            z = true;
        }
        this.f2990c = z;
        this.f2986A = true;
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo3806b(boolean z) {
        if (this.f3013z != z) {
            this.f3013z = z;
            this.f2986A = true;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r0.equals(r4.f3010w) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3820c() {
        /*
            r4 = this;
            c.a.g.e.v r0 = r4.f2987B
            if (r0 == 0) goto L_0x0011
            android.graphics.Matrix r1 = r4.f3006s
            r0.mo3738a(r1)
            c.a.g.e.v r0 = r4.f2987B
            android.graphics.RectF r1 = r4.f2999l
            r0.mo3739a(r1)
            goto L_0x001f
        L_0x0011:
            android.graphics.Matrix r0 = r4.f3006s
            r0.reset()
            android.graphics.RectF r0 = r4.f2999l
            android.graphics.Rect r1 = r4.getBounds()
            r0.set(r1)
        L_0x001f:
            android.graphics.RectF r0 = r4.f3001n
            int r1 = r4.getIntrinsicWidth()
            float r1 = (float) r1
            int r2 = r4.getIntrinsicHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.RectF r0 = r4.f3002o
            android.graphics.drawable.Drawable r1 = r4.f2988a
            android.graphics.Rect r1 = r1.getBounds()
            r0.set(r1)
            android.graphics.Matrix r0 = r4.f3004q
            android.graphics.RectF r1 = r4.f3001n
            android.graphics.RectF r2 = r4.f3002o
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            boolean r0 = r4.f3013z
            if (r0 == 0) goto L_0x007a
            android.graphics.RectF r0 = r4.f3003p
            if (r0 != 0) goto L_0x0057
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.RectF r1 = r4.f2999l
            r0.<init>(r1)
            r4.f3003p = r0
            goto L_0x005c
        L_0x0057:
            android.graphics.RectF r1 = r4.f2999l
            r0.set(r1)
        L_0x005c:
            android.graphics.RectF r0 = r4.f3003p
            float r1 = r4.f2991d
            r0.inset(r1, r1)
            android.graphics.Matrix r0 = r4.f3009v
            if (r0 != 0) goto L_0x006e
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.f3009v = r0
        L_0x006e:
            android.graphics.Matrix r0 = r4.f3009v
            android.graphics.RectF r1 = r4.f2999l
            android.graphics.RectF r2 = r4.f3003p
            android.graphics.Matrix$ScaleToFit r3 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r2, r3)
            goto L_0x0081
        L_0x007a:
            android.graphics.Matrix r0 = r4.f3009v
            if (r0 == 0) goto L_0x0081
            r0.reset()
        L_0x0081:
            android.graphics.Matrix r0 = r4.f3006s
            android.graphics.Matrix r1 = r4.f3007t
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L_0x00a2
            android.graphics.Matrix r0 = r4.f3004q
            android.graphics.Matrix r2 = r4.f3005r
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a2
            android.graphics.Matrix r0 = r4.f3009v
            if (r0 == 0) goto L_0x00f1
            android.graphics.Matrix r2 = r4.f3010w
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00f1
        L_0x00a2:
            r4.f2993f = r1
            android.graphics.Matrix r0 = r4.f3006s
            android.graphics.Matrix r2 = r4.f3008u
            r0.invert(r2)
            android.graphics.Matrix r0 = r4.f3011x
            android.graphics.Matrix r2 = r4.f3006s
            r0.set(r2)
            boolean r0 = r4.f3013z
            if (r0 == 0) goto L_0x00bd
            android.graphics.Matrix r0 = r4.f3011x
            android.graphics.Matrix r2 = r4.f3009v
            r0.postConcat(r2)
        L_0x00bd:
            android.graphics.Matrix r0 = r4.f3011x
            android.graphics.Matrix r2 = r4.f3004q
            r0.preConcat(r2)
            android.graphics.Matrix r0 = r4.f3007t
            android.graphics.Matrix r2 = r4.f3006s
            r0.set(r2)
            android.graphics.Matrix r0 = r4.f3005r
            android.graphics.Matrix r2 = r4.f3004q
            r0.set(r2)
            boolean r0 = r4.f3013z
            if (r0 == 0) goto L_0x00ea
            android.graphics.Matrix r0 = r4.f3010w
            if (r0 != 0) goto L_0x00e4
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r2 = r4.f3009v
            r0.<init>(r2)
            r4.f3010w = r0
            goto L_0x00f1
        L_0x00e4:
            android.graphics.Matrix r2 = r4.f3009v
            r0.set(r2)
            goto L_0x00f1
        L_0x00ea:
            android.graphics.Matrix r0 = r4.f3010w
            if (r0 == 0) goto L_0x00f1
            r0.reset()
        L_0x00f1:
            android.graphics.RectF r0 = r4.f2999l
            android.graphics.RectF r2 = r4.f3000m
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0104
            r4.f2986A = r1
            android.graphics.RectF r0 = r4.f3000m
            android.graphics.RectF r1 = r4.f2999l
            r0.set(r1)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p059g.p068e.C0842q.mo3820c():void");
    }

    public void clearColorFilter() {
        this.f2988a.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        this.f2988a.draw(canvas);
    }

    public int getAlpha() {
        return this.f2988a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f2988a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f2988a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2988a.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f2988a.getOpacity();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f2988a.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.f2988a.setAlpha(i);
    }

    public void setColorFilter(int i, Mode mode) {
        this.f2988a.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2988a.setColorFilter(colorFilter);
    }
}
