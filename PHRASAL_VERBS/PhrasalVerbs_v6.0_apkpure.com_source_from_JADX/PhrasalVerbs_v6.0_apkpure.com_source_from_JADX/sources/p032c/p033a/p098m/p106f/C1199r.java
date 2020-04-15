package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.vibration.VibrationModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.r */
class C1199r implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3944a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3945b;

    C1199r(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3945b = b;
        this.f3944a = reactApplicationContext;
    }

    public NativeModule get() {
        return new VibrationModule(this.f3944a);
    }
}
