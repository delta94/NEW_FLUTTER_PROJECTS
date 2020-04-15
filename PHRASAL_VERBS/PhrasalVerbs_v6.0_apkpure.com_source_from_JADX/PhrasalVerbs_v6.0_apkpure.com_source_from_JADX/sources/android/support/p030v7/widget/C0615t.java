package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p029v4.widget.C0348F;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p005b.p009c.p018g.C0154t;

/* renamed from: android.support.v7.widget.t */
public class C0615t extends ImageView implements C0154t, C0348F {

    /* renamed from: a */
    private final C0589j f2384a;

    /* renamed from: b */
    private final C0613s f2385b;

    public C0615t(Context context) {
        this(context, null);
    }

    public C0615t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0615t(Context context, AttributeSet attributeSet, int i) {
        super(C0614sa.m2913a(context), attributeSet, i);
        this.f2384a = new C0589j(this);
        this.f2384a.mo3087a(attributeSet, i);
        this.f2385b = new C0613s(this);
        this.f2385b.mo3225a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0589j jVar = this.f2384a;
        if (jVar != null) {
            jVar.mo3082a();
        }
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            sVar.mo3221a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0589j jVar = this.f2384a;
        if (jVar != null) {
            return jVar.mo3088b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0589j jVar = this.f2384a;
        if (jVar != null) {
            return jVar.mo3090c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            return sVar.mo3226b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            return sVar.mo3227c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f2385b.mo3228d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0589j jVar = this.f2384a;
        if (jVar != null) {
            jVar.mo3086a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0589j jVar = this.f2384a;
        if (jVar != null) {
            jVar.mo3083a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            sVar.mo3221a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            sVar.mo3221a();
        }
    }

    public void setImageResource(int i) {
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            sVar.mo3222a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            sVar.mo3221a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0589j jVar = this.f2384a;
        if (jVar != null) {
            jVar.mo3089b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0589j jVar = this.f2384a;
        if (jVar != null) {
            jVar.mo3085a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            sVar.mo3223a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        C0613s sVar = this.f2385b;
        if (sVar != null) {
            sVar.mo3224a(mode);
        }
    }
}
