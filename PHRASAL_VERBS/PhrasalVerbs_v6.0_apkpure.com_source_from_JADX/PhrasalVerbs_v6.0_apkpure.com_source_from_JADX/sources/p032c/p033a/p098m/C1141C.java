package p032c.p033a.p098m;

import com.facebook.react.bridge.ReactApplicationContext;
import p032c.p033a.p098m.C1145G.C1147b;

/* renamed from: c.a.m.C */
class C1141C implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1147b[] f3790a;

    /* renamed from: b */
    final /* synthetic */ ReactApplicationContext f3791b;

    /* renamed from: c */
    final /* synthetic */ C1145G f3792c;

    C1141C(C1145G g, C1147b[] bVarArr, ReactApplicationContext reactApplicationContext) {
        this.f3792c = g;
        this.f3790a = bVarArr;
        this.f3791b = reactApplicationContext;
    }

    public void run() {
        for (C1147b a : this.f3790a) {
            a.mo4437a(this.f3791b);
        }
    }
}
