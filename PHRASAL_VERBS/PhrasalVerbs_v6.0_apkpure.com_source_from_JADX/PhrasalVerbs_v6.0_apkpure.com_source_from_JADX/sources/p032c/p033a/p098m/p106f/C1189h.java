package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.location.LocationModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.h */
class C1189h implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3924a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3925b;

    C1189h(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3925b = b;
        this.f3924a = reactApplicationContext;
    }

    public NativeModule get() {
        return new LocationModule(this.f3924a);
    }
}
