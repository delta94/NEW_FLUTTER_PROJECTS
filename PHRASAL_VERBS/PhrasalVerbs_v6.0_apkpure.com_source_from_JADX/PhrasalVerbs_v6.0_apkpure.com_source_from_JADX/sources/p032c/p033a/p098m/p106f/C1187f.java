package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageStoreManager;
import javax.inject.Provider;

/* renamed from: c.a.m.f.f */
class C1187f implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3920a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3921b;

    C1187f(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3921b = b;
        this.f3920a = reactApplicationContext;
    }

    public NativeModule get() {
        return new ImageStoreManager(this.f3920a);
    }
}
