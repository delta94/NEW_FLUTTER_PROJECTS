package p000a.p005b.p021d.p028e;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0164b;
import p000a.p005b.p021d.p022a.C0166d;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: a.b.d.e.a */
public class C0191a {

    /* renamed from: a */
    private Context f480a;

    private C0191a(Context context) {
        this.f480a = context;
    }

    /* renamed from: a */
    public static C0191a m682a(Context context) {
        return new C0191a(context);
    }

    /* renamed from: a */
    public boolean mo690a() {
        return this.f480a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: b */
    public int mo691b() {
        return this.f480a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo692c() {
        Configuration configuration = this.f480a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: d */
    public int mo693d() {
        return this.f480a.getResources().getDimensionPixelSize(C0166d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo694e() {
        TypedArray obtainStyledAttributes = this.f480a.obtainStyledAttributes(null, C0172j.ActionBar, C0163a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0172j.ActionBar_height, 0);
        Resources resources = this.f480a.getResources();
        if (!mo695f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0166d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo695f() {
        return this.f480a.getResources().getBoolean(C0164b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo696g() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f480a).hasPermanentMenuKey();
    }
}
