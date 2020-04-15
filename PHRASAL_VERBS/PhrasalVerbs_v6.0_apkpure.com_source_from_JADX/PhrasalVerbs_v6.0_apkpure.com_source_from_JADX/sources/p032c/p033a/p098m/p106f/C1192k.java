package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.netinfo.NetInfoModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.k */
class C1192k implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3930a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3931b;

    C1192k(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3931b = b;
        this.f3930a = reactApplicationContext;
    }

    public NativeModule get() {
        return new NetInfoModule(this.f3930a);
    }
}
