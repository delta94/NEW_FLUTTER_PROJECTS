package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.appstate.AppStateModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.t */
class C1201t implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3948a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3949b;

    C1201t(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3949b = b;
        this.f3948a = reactApplicationContext;
    }

    public NativeModule get() {
        return new AppStateModule(this.f3948a);
    }
}
