package p032c.p033a.p098m;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v7.app.C0427m;
import android.view.KeyEvent;
import com.facebook.react.modules.core.C1460c;
import com.facebook.react.modules.core.C1462e;
import com.facebook.react.modules.core.C1463f;

/* renamed from: c.a.m.q */
public abstract class C1230q extends C0427m implements C1460c, C1462e {

    /* renamed from: p */
    private final C1232s f3983p = mo4575m();

    protected C1230q() {
    }

    /* renamed from: a */
    public void mo4573a(String[] strArr, int i, C1463f fVar) {
        this.f3983p.mo4585a(strArr, i, fVar);
    }

    /* renamed from: b */
    public void mo4574b() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C1232s mo4575m() {
        return new C1232s(this, mo4576n());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo4576n() {
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f3983p.mo4581a(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f3983p.mo4594f()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3983p.mo4583a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f3983p.mo4595g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f3983p.mo4586a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f3983p.mo4589b(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f3983p.mo4591c(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        if (!this.f3983p.mo4587a(intent)) {
            super.onNewIntent(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f3983p.mo4596h();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3983p.mo4582a(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f3983p.mo4597i();
    }
}
