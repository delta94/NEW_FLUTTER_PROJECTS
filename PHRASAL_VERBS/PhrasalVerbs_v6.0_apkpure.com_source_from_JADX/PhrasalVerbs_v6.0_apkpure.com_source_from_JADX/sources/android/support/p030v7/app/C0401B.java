package android.support.p030v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import p000a.p005b.p009c.p018g.C0140g;
import p000a.p005b.p009c.p018g.C0140g.C0141a;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p028e.C0192b;
import p000a.p005b.p021d.p028e.C0192b.C0193a;

/* renamed from: android.support.v7.app.B */
public class C0401B extends Dialog implements C0428n {

    /* renamed from: a */
    private C0429o f1367a;

    /* renamed from: b */
    private final C0141a f1368b = new C0395A(this);

    public C0401B(Context context, int i) {
        super(context, m1835a(context, i));
        mo1845a().mo1946a((Bundle) null);
        mo1845a().mo1950a();
    }

    /* renamed from: a */
    private static int m1835a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0163a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0192b mo1844a(C0193a aVar) {
        return null;
    }

    /* renamed from: a */
    public C0429o mo1845a() {
        if (this.f1367a == null) {
            this.f1367a = C0429o.m1956a((Dialog) this, (C0428n) this);
        }
        return this.f1367a;
    }

    /* renamed from: a */
    public void mo1846a(C0192b bVar) {
    }

    /* renamed from: a */
    public boolean mo1847a(int i) {
        return mo1845a().mo1953b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1848a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo1845a().mo1948a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo1850b(C0192b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0140g.m477a(this.f1368b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo1845a().mo1944a(i);
    }

    public void invalidateOptionsMenu() {
        mo1845a().mo1959f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo1845a().mo1958e();
        super.onCreate(bundle);
        mo1845a().mo1946a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo1845a().mo1963j();
    }

    public void setContentView(int i) {
        mo1845a().mo1955c(i);
    }

    public void setContentView(View view) {
        mo1845a().mo1947a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo1845a().mo1952b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo1845a().mo1949a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo1845a().mo1949a(charSequence);
    }
}
