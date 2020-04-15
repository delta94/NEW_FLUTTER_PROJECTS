package p032c.p033a.p098m;

import com.facebook.react.bridge.Callback;

/* renamed from: c.a.m.r */
class C1231r implements Callback {

    /* renamed from: a */
    final /* synthetic */ int f3984a;

    /* renamed from: b */
    final /* synthetic */ String[] f3985b;

    /* renamed from: c */
    final /* synthetic */ int[] f3986c;

    /* renamed from: d */
    final /* synthetic */ C1232s f3987d;

    C1231r(C1232s sVar, int i, String[] strArr, int[] iArr) {
        this.f3987d = sVar;
        this.f3984a = i;
        this.f3985b = strArr;
        this.f3986c = iArr;
    }

    public void invoke(Object... objArr) {
        if (this.f3987d.f3992e != null && this.f3987d.f3992e.onRequestPermissionsResult(this.f3984a, this.f3985b, this.f3986c)) {
            this.f3987d.f3992e = null;
        }
    }
}
