package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ua */
class C0618ua extends C0558X {

    /* renamed from: b */
    private final WeakReference<Context> f2393b;

    public C0618ua(Context context, Resources resources) {
        super(resources);
        this.f2393b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f2393b.get();
        if (!(drawable == null || context == null)) {
            C0600o.m2852a();
            C0600o.m2858a(context, i, drawable);
        }
        return drawable;
    }
}
