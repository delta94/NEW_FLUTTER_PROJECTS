package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.permissions.PermissionsModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.m */
class C1194m implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3934a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3935b;

    C1194m(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3935b = b;
        this.f3934a = reactApplicationContext;
    }

    public NativeModule get() {
        return new PermissionsModule(this.f3934a);
    }
}
