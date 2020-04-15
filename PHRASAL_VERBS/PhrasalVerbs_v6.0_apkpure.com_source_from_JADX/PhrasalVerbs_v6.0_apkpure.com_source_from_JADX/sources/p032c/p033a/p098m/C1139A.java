package p032c.p033a.p098m;

import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: c.a.m.A */
class C1139A implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3786a;

    /* renamed from: b */
    final /* synthetic */ C1140B f3787b;

    C1139A(C1140B b, ReactApplicationContext reactApplicationContext) {
        this.f3787b = b;
        this.f3786a = reactApplicationContext;
    }

    public void run() {
        try {
            this.f3787b.f3789b.m5076b(this.f3786a);
        } catch (Exception e) {
            this.f3787b.f3789b.f3806i.handleException(e);
        }
    }
}
