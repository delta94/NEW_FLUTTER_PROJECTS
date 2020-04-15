package p000a.p005b.p007b.p008a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.graphics.drawable.C0312b;

/* renamed from: a.b.b.a.i */
abstract class C0028i extends Drawable implements C0312b {

    /* renamed from: a */
    Drawable f51a;

    C0028i() {
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1337a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return C0311a.m1345c(drawable);
        }
        return null;
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1348f(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1334a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1335a(drawable, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
