package android.support.p029v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.o */
public class C0383o {
    /* renamed from: a */
    public static ColorStateList m1770a(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        return imageView instanceof C0348F ? ((C0348F) imageView).getSupportImageTintList() : null;
    }

    /* renamed from: a */
    public static void m1771a(ImageView imageView, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C0348F) {
            ((C0348F) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1772a(ImageView imageView, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof C0348F) {
            ((C0348F) imageView).setSupportImageTintMode(mode);
        }
    }

    /* renamed from: b */
    public static Mode m1773b(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        return imageView instanceof C0348F ? ((C0348F) imageView).getSupportImageTintMode() : null;
    }
}
