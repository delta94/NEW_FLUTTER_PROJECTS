package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.Ia */
public class C0519Ia extends Resources {

    /* renamed from: a */
    private static boolean f1952a = false;

    /* renamed from: b */
    private final WeakReference<Context> f1953b;

    public C0519Ia(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1953b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m2495a() {
        return f1952a;
    }

    /* renamed from: b */
    public static boolean m2496b() {
        return m2495a() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo2679a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f1953b.get();
        return context != null ? C0600o.m2852a().mo3144a(context, this, i) : super.getDrawable(i);
    }
}
