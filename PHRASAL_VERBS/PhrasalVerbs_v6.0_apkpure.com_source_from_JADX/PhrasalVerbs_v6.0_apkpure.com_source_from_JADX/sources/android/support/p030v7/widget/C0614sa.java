package android.support.p030v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.sa */
public class C0614sa extends ContextWrapper {

    /* renamed from: a */
    private static final Object f2380a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0614sa>> f2381b;

    /* renamed from: c */
    private final Resources f2382c;

    /* renamed from: d */
    private final Theme f2383d;

    private C0614sa(Context context) {
        super(context);
        if (C0519Ia.m2496b()) {
            this.f2382c = new C0519Ia(this, context.getResources());
            this.f2383d = this.f2382c.newTheme();
            this.f2383d.setTo(context.getTheme());
            return;
        }
        this.f2382c = new C0618ua(this, context.getResources());
        this.f2383d = null;
    }

    /* renamed from: a */
    public static Context m2913a(Context context) {
        if (!m2914b(context)) {
            return context;
        }
        synchronized (f2380a) {
            if (f2381b == null) {
                f2381b = new ArrayList<>();
            } else {
                for (int size = f2381b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f2381b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2381b.remove(size);
                    }
                }
                for (int size2 = f2381b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f2381b.get(size2);
                    C0614sa saVar = weakReference2 != null ? (C0614sa) weakReference2.get() : null;
                    if (saVar != null && saVar.getBaseContext() == context) {
                        return saVar;
                    }
                }
            }
            C0614sa saVar2 = new C0614sa(context);
            f2381b.add(new WeakReference(saVar2));
            return saVar2;
        }
    }

    /* renamed from: b */
    private static boolean m2914b(Context context) {
        if ((context instanceof C0614sa) || (context.getResources() instanceof C0618ua) || (context.getResources() instanceof C0519Ia)) {
            return false;
        }
        return VERSION.SDK_INT < 21 || C0519Ia.m2496b();
    }

    public AssetManager getAssets() {
        return this.f2382c.getAssets();
    }

    public Resources getResources() {
        return this.f2382c;
    }

    public Theme getTheme() {
        Theme theme = this.f2383d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Theme theme = this.f2383d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
