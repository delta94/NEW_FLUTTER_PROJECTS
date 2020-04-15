package android.support.p029v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0211d;
import android.arch.lifecycle.C0211d.C0213b;
import android.arch.lifecycle.C0215f;
import android.arch.lifecycle.C0217h;
import android.arch.lifecycle.C0226p;
import android.os.Bundle;
import android.support.p029v4.util.C0338o;
import android.view.KeyEvent;
import android.view.View;
import p000a.p005b.p009c.p018g.C0140g;
import p000a.p005b.p009c.p018g.C0140g.C0141a;

/* renamed from: android.support.v4.app.Y */
public class C0260Y extends Activity implements C0215f, C0141a {

    /* renamed from: a */
    private C0338o<Class<? extends Object>, Object> f696a = new C0338o<>();

    /* renamed from: b */
    private C0217h f697b = new C0217h(this);

    /* renamed from: a */
    public C0211d mo817a() {
        return this.f697b;
    }

    /* renamed from: a */
    public boolean mo500a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0140g.m481a(decorView, keyEvent)) {
            return C0140g.m477a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0140g.m481a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0226p.m836a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f697b.mo818a(C0213b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
