package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageEditingManager;
import javax.inject.Provider;

/* renamed from: c.a.m.f.d */
class C1185d implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3916a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3917b;

    C1185d(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3917b = b;
        this.f3916a = reactApplicationContext;
    }

    public NativeModule get() {
        return new ImageEditingManager(this.f3916a);
    }
}
