package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.intent.IntentModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.g */
class C1188g implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3922a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3923b;

    C1188g(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3923b = b;
        this.f3922a = reactApplicationContext;
    }

    public NativeModule get() {
        return new IntentModule(this.f3922a);
    }
}
