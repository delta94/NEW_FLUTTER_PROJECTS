package android.support.p030v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p029v4.graphics.drawable.C0313c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.w */
class C0621w {

    /* renamed from: a */
    private static final int[] f2399a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f2400b;

    /* renamed from: c */
    private Bitmap f2401c;

    C0621w(ProgressBar progressBar) {
        this.f2400b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo2407a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m2940a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m2940a(Drawable drawable, boolean z) {
        if (drawable instanceof C0313c) {
            C0313c cVar = (C0313c) drawable;
            Drawable a = cVar.mo1270a();
            if (a != null) {
                cVar.mo1271a(m2940a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m2940a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2401c == null) {
                this.f2401c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo2409b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            drawable = z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: b */
    private Shape mo2409b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo3269a() {
        return this.f2401c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2408a(AttributeSet attributeSet, int i) {
        C0620va a = C0620va.m2920a(this.f2400b.getContext(), attributeSet, f2399a, i, 0);
        Drawable c = a.mo3260c(0);
        if (c != null) {
            this.f2400b.setIndeterminateDrawable(mo2407a(c));
        }
        Drawable c2 = a.mo3260c(1);
        if (c2 != null) {
            this.f2400b.setProgressDrawable(m2940a(c2, false));
        }
        a.mo3255a();
    }
}
