package p032c.p033a.p098m;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.devsupport.C1412d;
import com.facebook.react.modules.core.C1460c;
import com.facebook.react.modules.core.C1463f;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: c.a.m.s */
public class C1232s {

    /* renamed from: a */
    private final Activity f3988a;

    /* renamed from: b */
    private final String f3989b;

    /* renamed from: c */
    private C1156P f3990c;

    /* renamed from: d */
    private C1412d f3991d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1463f f3992e;

    /* renamed from: f */
    private Callback f3993f;

    public C1232s(C1230q qVar, String str) {
        this.f3988a = qVar;
        this.f3989b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1156P mo4580a() {
        return new C1156P(mo4588b());
    }

    /* renamed from: a */
    public void mo4581a(int i, int i2, Intent intent) {
        if (mo4593e().mo4464l()) {
            mo4593e().mo4460h().mo4419a(mo4592d(), i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo4582a(int i, String[] strArr, int[] iArr) {
        this.f3993f = new C1231r(this, i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4583a(Bundle bundle) {
        String str = this.f3989b;
        if (str != null) {
            mo4584a(str);
        }
        this.f3991d = new C1412d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4584a(String str) {
        if (this.f3990c == null) {
            this.f3990c = mo4580a();
            this.f3990c.mo4474a(mo4593e().mo4460h(), str, mo4590c());
            mo4592d().setContentView(this.f3990c);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }

    @TargetApi(23)
    /* renamed from: a */
    public void mo4585a(String[] strArr, int i, C1463f fVar) {
        this.f3992e = fVar;
        mo4592d().requestPermissions(strArr, i);
    }

    /* renamed from: a */
    public boolean mo4586a(int i, KeyEvent keyEvent) {
        if (!mo4593e().mo4464l() || !mo4593e().mo4463k() || i != 90) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    /* renamed from: a */
    public boolean mo4587a(Intent intent) {
        if (!mo4593e().mo4464l()) {
            return false;
        }
        mo4593e().mo4460h().mo4421a(intent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Context mo4588b() {
        Activity activity = this.f3988a;
        C1136a.m5053a(activity);
        return activity;
    }

    /* renamed from: b */
    public boolean mo4589b(int i, KeyEvent keyEvent) {
        if (!mo4593e().mo4464l() || !mo4593e().mo4463k() || i != 90) {
            return false;
        }
        mo4593e().mo4460h().mo4434j();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bundle mo4590c() {
        return null;
    }

    /* renamed from: c */
    public boolean mo4591c(int i, KeyEvent keyEvent) {
        if (mo4593e().mo4464l() && mo4593e().mo4463k()) {
            if (i == 82) {
                mo4593e().mo4460h().mo4434j();
                return true;
            }
            C1412d dVar = this.f3991d;
            C1136a.m5053a(dVar);
            if (dVar.mo5226a(i, mo4592d().getCurrentFocus())) {
                mo4593e().mo4460h().mo4428d().mo5219d();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Activity mo4592d() {
        return (Activity) mo4588b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1150J mo4593e() {
        return ((C1234u) mo4592d().getApplication()).mo4601a();
    }

    /* renamed from: f */
    public boolean mo4594f() {
        if (!mo4593e().mo4464l()) {
            return false;
        }
        mo4593e().mo4460h().mo4431g();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo4595g() {
        C1156P p = this.f3990c;
        if (p != null) {
            p.mo4479c();
            this.f3990c = null;
        }
        if (mo4593e().mo4464l()) {
            mo4593e().mo4460h().mo4418a(mo4592d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo4596h() {
        if (mo4593e().mo4464l()) {
            mo4593e().mo4460h().mo4424b(mo4592d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo4597i() {
        if (mo4593e().mo4464l()) {
            mo4593e().mo4460h().mo4420a(mo4592d(), (C1460c) mo4592d());
        }
        Callback callback = this.f3993f;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f3993f = null;
        }
    }
}
