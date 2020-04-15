package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.network.NetworkingModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.j */
class C1191j implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3928a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3929b;

    C1191j(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3929b = b;
        this.f3928a = reactApplicationContext;
    }

    public NativeModule get() {
        return new NetworkingModule(this.f3928a);
    }
}
