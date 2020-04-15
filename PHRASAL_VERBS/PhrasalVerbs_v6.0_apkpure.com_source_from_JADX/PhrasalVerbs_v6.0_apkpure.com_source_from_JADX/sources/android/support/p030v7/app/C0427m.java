package android.support.p030v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v4.app.C0256U;
import android.support.p029v4.app.C0261Z;
import android.support.p029v4.app.C0261Z.C0262a;
import android.support.p029v4.app.C0263a;
import android.support.p029v4.app.C0281l;
import android.support.p030v7.widget.C0519Ia;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import p000a.p005b.p021d.p028e.C0192b;
import p000a.p005b.p021d.p028e.C0192b.C0193a;

/* renamed from: android.support.v7.app.m */
public class C0427m extends C0281l implements C0428n, C0262a, C0415b {

    /* renamed from: m */
    private C0429o f1461m;

    /* renamed from: n */
    private int f1462n = 0;

    /* renamed from: o */
    private Resources f1463o;

    /* renamed from: a */
    private boolean m1938a(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0192b mo1844a(C0193a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo1846a(C0192b bVar) {
    }

    /* renamed from: a */
    public void mo1920a(Intent intent) {
        C0256U.m950a((Activity) this, intent);
    }

    /* renamed from: a */
    public void mo1921a(C0261Z z) {
        z.mo918a((Activity) this);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo1929i().mo1948a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo1850b(C0192b bVar) {
    }

    /* renamed from: b */
    public void mo1923b(C0261Z z) {
    }

    /* renamed from: b */
    public boolean mo1924b(Intent intent) {
        return C0256U.m953b((Activity) this, intent);
    }

    public void closeOptionsMenu() {
        C0411a j = mo1931j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j == null || !j.mo1891e()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d */
    public Intent mo924d() {
        return C0256U.m948a(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0411a j = mo1931j();
        if (keyCode != 82 || j == null || !j.mo1890a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo1929i().mo1944a(i);
    }

    public MenuInflater getMenuInflater() {
        return mo1929i().mo1954c();
    }

    public Resources getResources() {
        if (this.f1463o == null && C0519Ia.m2496b()) {
            this.f1463o = new C0519Ia(this, super.getResources());
        }
        Resources resources = this.f1463o;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h */
    public void mo1079h() {
        mo1929i().mo1959f();
    }

    /* renamed from: i */
    public C0429o mo1929i() {
        if (this.f1461m == null) {
            this.f1461m = C0429o.m1955a((Activity) this, (C0428n) this);
        }
        return this.f1461m;
    }

    public void invalidateOptionsMenu() {
        mo1929i().mo1959f();
    }

    /* renamed from: j */
    public C0411a mo1931j() {
        return mo1929i().mo1957d();
    }

    @Deprecated
    /* renamed from: k */
    public void mo1932k() {
    }

    /* renamed from: l */
    public boolean mo1933l() {
        Intent d = mo924d();
        if (d == null) {
            return false;
        }
        if (mo1924b(d)) {
            C0261Z a = C0261Z.m961a((Context) this);
            mo1921a(a);
            mo1923b(a);
            a.mo921a();
            try {
                C0263a.m969a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            mo1920a(d);
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo1929i().mo1945a(configuration);
        if (this.f1463o != null) {
            this.f1463o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo1932k();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0429o i = mo1929i();
        i.mo1958e();
        i.mo1946a(bundle);
        if (i.mo1950a()) {
            int i2 = this.f1462n;
            if (i2 != 0) {
                if (VERSION.SDK_INT >= 23) {
                    onApplyThemeResource(getTheme(), this.f1462n, false);
                } else {
                    setTheme(i2);
                }
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo1929i().mo1960g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m1938a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0411a j = mo1931j();
        if (menuItem.getItemId() != 16908332 || j == null || (j.mo1881g() & 4) == 0) {
            return false;
        }
        return mo1933l();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo1929i().mo1951b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo1929i().mo1961h();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1929i().mo1956c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo1929i().mo1962i();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1929i().mo1963j();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo1929i().mo1949a(charSequence);
    }

    public void openOptionsMenu() {
        C0411a j = mo1931j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (j == null || !j.mo1894k()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo1929i().mo1955c(i);
    }

    public void setContentView(View view) {
        mo1929i().mo1947a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo1929i().mo1952b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f1462n = i;
    }
}
