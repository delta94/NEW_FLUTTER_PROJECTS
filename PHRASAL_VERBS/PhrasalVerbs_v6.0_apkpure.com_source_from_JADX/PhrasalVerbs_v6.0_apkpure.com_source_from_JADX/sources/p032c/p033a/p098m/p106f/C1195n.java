package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.share.ShareModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.n */
class C1195n implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3936a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3937b;

    C1195n(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3937b = b;
        this.f3936a = reactApplicationContext;
    }

    public NativeModule get() {
        return new ShareModule(this.f3936a);
    }
}
