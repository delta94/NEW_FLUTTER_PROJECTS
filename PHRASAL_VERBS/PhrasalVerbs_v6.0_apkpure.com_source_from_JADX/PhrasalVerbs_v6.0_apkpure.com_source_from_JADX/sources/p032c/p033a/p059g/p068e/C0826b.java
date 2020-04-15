package p032c.p033a.p059g.p068e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.e.b */
public class C0826b extends Drawable implements Callback, C0859v, C0858u {

    /* renamed from: a */
    private C0859v f2909a;

    /* renamed from: b */
    private final C0830f f2910b = new C0830f();

    /* renamed from: c */
    private final Drawable[] f2911c;

    /* renamed from: d */
    private final C0829e[] f2912d;

    /* renamed from: e */
    private final Rect f2913e = new Rect();

    /* renamed from: f */
    private boolean f2914f;

    /* renamed from: g */
    private boolean f2915g;

    /* renamed from: h */
    private boolean f2916h;

    public C0826b(Drawable[] drawableArr) {
        int i = 0;
        this.f2914f = false;
        this.f2915g = false;
        this.f2916h = false;
        C0718j.m3240a(drawableArr);
        this.f2911c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f2911c;
            if (i < drawableArr2.length) {
                C0831g.m3726a(drawableArr2[i], this, this);
                i++;
            } else {
                this.f2912d = new C0829e[drawableArr2.length];
                return;
            }
        }
    }

    /* renamed from: c */
    private C0829e mo3770c(int i) {
        return new C0825a(this, i);
    }

    /* renamed from: a */
    public int mo3735a() {
        return this.f2911c.length;
    }

    /* renamed from: a */
    public Drawable mo3736a(int i) {
        boolean z = true;
        C0718j.m3243a(i >= 0);
        if (i >= this.f2911c.length) {
            z = false;
        }
        C0718j.m3243a(z);
        return this.f2911c[i];
    }

    /* renamed from: a */
    public Drawable mo3737a(int i, Drawable drawable) {
        boolean z = true;
        C0718j.m3243a(i >= 0);
        if (i >= this.f2911c.length) {
            z = false;
        }
        C0718j.m3243a(z);
        Drawable drawable2 = this.f2911c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f2916h) {
                drawable.mutate();
            }
            C0831g.m3726a(this.f2911c[i], null, null);
            C0831g.m3726a(drawable, null, null);
            C0831g.m3728a(drawable, this.f2910b);
            C0831g.m3727a(drawable, (Drawable) this);
            C0831g.m3726a(drawable, this, this);
            this.f2915g = false;
            this.f2911c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    /* renamed from: a */
    public void mo3738a(Matrix matrix) {
        C0859v vVar = this.f2909a;
        if (vVar != null) {
            vVar.mo3738a(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: a */
    public void mo3739a(RectF rectF) {
        C0859v vVar = this.f2909a;
        if (vVar != null) {
            vVar.mo3739a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* renamed from: a */
    public void mo3740a(C0859v vVar) {
        this.f2909a = vVar;
    }

    /* renamed from: b */
    public C0829e mo3741b(int i) {
        boolean z = true;
        C0718j.m3243a(i >= 0);
        if (i >= this.f2912d.length) {
            z = false;
        }
        C0718j.m3243a(z);
        C0829e[] eVarArr = this.f2912d;
        if (eVarArr[i] == null) {
            eVarArr[i] = mo3770c(i);
        }
        return this.f2912d[i];
    }

    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f2911c.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f2913e;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        if (!this.f2915g) {
            this.f2914f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f2911c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f2914f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f2914f = z2 | z;
                i++;
            }
            this.f2915g = true;
        }
        return this.f2914f;
    }

    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.f2916h = true;
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2910b.mo3763a(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2910b.mo3764a(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z) {
        this.f2910b.mo3766a(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f2910b.mo3767b(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f2911c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
