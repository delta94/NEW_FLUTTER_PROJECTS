package p000a.p005b.p021d.p025c.p026a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.p029v4.graphics.drawable.C0311a;

/* renamed from: a.b.d.c.a.e */
public class C0187e extends Drawable implements Callback {

    /* renamed from: a */
    private Drawable f475a;

    public C0187e(Drawable drawable) {
        mo652a(drawable);
    }

    /* renamed from: a */
    public Drawable mo651a() {
        return this.f475a;
    }

    /* renamed from: a */
    public void mo652a(Drawable drawable) {
        Drawable drawable2 = this.f475a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f475a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f475a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f475a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f475a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f475a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f475a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f475a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f475a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f475a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f475a.getPadding(rect);
    }

    public int[] getState() {
        return this.f475a.getState();
    }

    public Region getTransparentRegion() {
        return this.f475a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0311a.m1347e(this.f475a);
    }

    public boolean isStateful() {
        return this.f475a.isStateful();
    }

    public void jumpToCurrentState() {
        C0311a.m1348f(this.f475a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f475a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f475a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f475a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0311a.m1340a(this.f475a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f475a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f475a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f475a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f475a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0311a.m1334a(this.f475a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0311a.m1335a(this.f475a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f475a.setState(iArr);
    }

    public void setTint(int i) {
        C0311a.m1344b(this.f475a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0311a.m1336a(this.f475a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0311a.m1339a(this.f475a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f475a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
