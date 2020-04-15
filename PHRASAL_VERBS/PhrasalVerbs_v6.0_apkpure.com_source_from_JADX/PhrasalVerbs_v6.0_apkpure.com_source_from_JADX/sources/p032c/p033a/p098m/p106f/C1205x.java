package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.CameraRollManager;
import javax.inject.Provider;

/* renamed from: c.a.m.f.x */
class C1205x implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3956a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3957b;

    C1205x(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3957b = b;
        this.f3956a = reactApplicationContext;
    }

    public NativeModule get() {
        return new CameraRollManager(this.f3956a);
    }
}
