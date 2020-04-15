package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.storage.AsyncStorageModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.w */
class C1204w implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3954a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3955b;

    C1204w(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3955b = b;
        this.f3954a = reactApplicationContext;
    }

    public NativeModule get() {
        return new AsyncStorageModule(this.f3954a);
    }
}
