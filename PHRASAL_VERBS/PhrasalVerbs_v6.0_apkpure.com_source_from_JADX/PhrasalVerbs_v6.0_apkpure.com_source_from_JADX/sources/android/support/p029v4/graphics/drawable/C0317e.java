package android.support.p029v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.e */
class C0317e extends C0314d {

    /* renamed from: h */
    private static Method f945h;

    /* renamed from: android.support.v4.graphics.drawable.e$a */
    private static class C0318a extends C0315a {
        C0318a(C0315a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0317e(this, resources);
        }
    }

    C0317e(Drawable drawable) {
        super(drawable);
        m1360d();
    }

    C0317e(C0315a aVar, Resources resources) {
        super(aVar, resources);
        m1360d();
    }

    /* renamed from: d */
    private void m1360d() {
        if (f945h == null) {
            try {
                f945h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1272b() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f940g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0315a mo1273c() {
        return new C0318a(this.f938e, null);
    }

    public Rect getDirtyBounds() {
        return this.f940g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f940g.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f940g.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f940g.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo1272b()) {
            super.setTint(i);
        } else {
            this.f940g.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo1272b()) {
            super.setTintList(colorStateList);
        } else {
            this.f940g.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo1272b()) {
            super.setTintMode(mode);
        } else {
            this.f940g.setTintMode(mode);
        }
    }
}
