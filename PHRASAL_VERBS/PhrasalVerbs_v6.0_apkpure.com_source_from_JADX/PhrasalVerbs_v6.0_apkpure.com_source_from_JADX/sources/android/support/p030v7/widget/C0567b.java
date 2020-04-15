package android.support.p030v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0567b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2219a;

    public C0567b(ActionBarContainer actionBarContainer) {
        this.f2219a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2219a;
        if (actionBarContainer.f1799h) {
            Drawable drawable = actionBarContainer.f1798g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1796e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2219a;
        Drawable drawable3 = actionBarContainer2.f1797f;
        if (drawable3 != null && actionBarContainer2.f1800i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f2219a;
        if (actionBarContainer.f1799h) {
            drawable = actionBarContainer.f1798g;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f1796e;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
