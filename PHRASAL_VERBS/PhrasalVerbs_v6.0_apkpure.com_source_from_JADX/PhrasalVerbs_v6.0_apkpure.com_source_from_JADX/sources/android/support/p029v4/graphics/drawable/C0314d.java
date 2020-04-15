package android.support.p029v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.graphics.drawable.d */
class C0314d extends Drawable implements Callback, C0313c, C0312b {

    /* renamed from: a */
    static final Mode f934a = Mode.SRC_IN;

    /* renamed from: b */
    private int f935b;

    /* renamed from: c */
    private Mode f936c;

    /* renamed from: d */
    private boolean f937d;

    /* renamed from: e */
    C0315a f938e;

    /* renamed from: f */
    private boolean f939f;

    /* renamed from: g */
    Drawable f940g;

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    protected static abstract class C0315a extends ConstantState {

        /* renamed from: a */
        int f941a;

        /* renamed from: b */
        ConstantState f942b;

        /* renamed from: c */
        ColorStateList f943c = null;

        /* renamed from: d */
        Mode f944d = C0314d.f934a;

        C0315a(C0315a aVar, Resources resources) {
            if (aVar != null) {
                this.f941a = aVar.f941a;
                this.f942b = aVar.f942b;
                this.f943c = aVar.f943c;
                this.f944d = aVar.f944d;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1303a() {
            return this.f942b != null;
        }

        public int getChangingConfigurations() {
            int i = this.f941a;
            ConstantState constantState = this.f942b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: android.support.v4.graphics.drawable.d$b */
    private static class C0316b extends C0315a {
        C0316b(C0315a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0314d(this, resources);
        }
    }

    C0314d(Drawable drawable) {
        this.f938e = mo1273c();
        mo1271a(drawable);
    }

    C0314d(C0315a aVar, Resources resources) {
        this.f938e = aVar;
        m1353a(resources);
    }

    /* renamed from: a */
    private void m1353a(Resources resources) {
        C0315a aVar = this.f938e;
        if (aVar != null) {
            ConstantState constantState = aVar.f942b;
            if (constantState != null) {
                mo1271a(constantState.newDrawable(resources));
            }
        }
    }

    /* renamed from: a */
    private boolean m1354a(int[] iArr) {
        if (!mo1272b()) {
            return false;
        }
        C0315a aVar = this.f938e;
        ColorStateList colorStateList = aVar.f943c;
        Mode mode = aVar.f944d;
        if (colorStateList == null || mode == null) {
            this.f937d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f937d && colorForState == this.f935b && mode == this.f936c)) {
                setColorFilter(colorForState, mode);
                this.f935b = colorForState;
                this.f936c = mode;
                this.f937d = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo1270a() {
        return this.f940g;
    }

    /* renamed from: a */
    public final void mo1271a(Drawable drawable) {
        Drawable drawable2 = this.f940g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f940g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0315a aVar = this.f938e;
            if (aVar != null) {
                aVar.f942b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1272b() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0315a mo1273c() {
        return new C0316b(this.f938e, null);
    }

    public void draw(Canvas canvas) {
        this.f940g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0315a aVar = this.f938e;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f940g.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        C0315a aVar = this.f938e;
        if (aVar == null || !aVar.mo1303a()) {
            return null;
        }
        this.f938e.f941a = getChangingConfigurations();
        return this.f938e;
    }

    public Drawable getCurrent() {
        return this.f940g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f940g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f940g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f940g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f940g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f940g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f940g.getPadding(rect);
    }

    public int[] getState() {
        return this.f940g.getState();
    }

    public Region getTransparentRegion() {
        return this.f940g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f940g.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (mo1272b()) {
            C0315a aVar = this.f938e;
            if (aVar != null) {
                colorStateList = aVar.f943c;
                return (colorStateList == null && colorStateList.isStateful()) || this.f940g.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.f940g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f939f && super.mutate() == this) {
            this.f938e = mo1273c();
            Drawable drawable = this.f940g;
            if (drawable != null) {
                drawable.mutate();
            }
            C0315a aVar = this.f938e;
            if (aVar != null) {
                Drawable drawable2 = this.f940g;
                aVar.f942b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f939f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f940g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f940g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f940g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f940g.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f940g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f940g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f940g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f940g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1354a(iArr) || this.f940g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f938e.f943c = colorStateList;
        m1354a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f938e.f944d = mode;
        m1354a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f940g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
