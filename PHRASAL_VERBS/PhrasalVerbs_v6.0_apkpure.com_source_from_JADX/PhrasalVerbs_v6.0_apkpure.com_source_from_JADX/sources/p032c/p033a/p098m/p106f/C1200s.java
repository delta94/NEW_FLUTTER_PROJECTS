package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.websocket.WebSocketModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.s */
class C1200s implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3946a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3947b;

    C1200s(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3947b = b;
        this.f3946a = reactApplicationContext;
    }

    public NativeModule get() {
        return new WebSocketModule(this.f3946a);
    }
}
