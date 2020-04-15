package p000a.p005b.p021d.p028e;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import p000a.p005b.p021d.p022a.C0171i;

/* renamed from: a.b.d.e.d */
public class C0195d extends ContextWrapper {

    /* renamed from: a */
    private int f483a;

    /* renamed from: b */
    private Theme f484b;

    /* renamed from: c */
    private LayoutInflater f485c;

    /* renamed from: d */
    private Configuration f486d;

    /* renamed from: e */
    private Resources f487e;

    public C0195d() {
        super(null);
    }

    public C0195d(Context context, int i) {
        super(context);
        this.f483a = i;
    }

    public C0195d(Context context, Theme theme) {
        super(context);
        this.f484b = theme;
    }

    /* renamed from: b */
    private Resources m711b() {
        Resources resources;
        if (this.f487e == null) {
            Configuration configuration = this.f486d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f487e = resources;
        }
        return this.f487e;
    }

    /* renamed from: c */
    private void m712c() {
        boolean z = this.f484b == null;
        if (z) {
            this.f484b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f484b.setTo(theme);
            }
        }
        mo721a(this.f484b, this.f483a, z);
    }

    /* renamed from: a */
    public int mo720a() {
        return this.f483a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo721a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m711b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f485c == null) {
            this.f485c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f485c;
    }

    public Theme getTheme() {
        Theme theme = this.f484b;
        if (theme != null) {
            return theme;
        }
        if (this.f483a == 0) {
            this.f483a = C0171i.Theme_AppCompat_Light;
        }
        m712c();
        return this.f484b;
    }

    public void setTheme(int i) {
        if (this.f483a != i) {
            this.f483a = i;
            m712c();
        }
    }
}
