package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.fresco.FrescoModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.b */
class C1183b implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3912a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3913b;

    C1183b(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3913b = b;
        this.f3912a = reactApplicationContext;
    }

    public NativeModule get() {
        ReactApplicationContext reactApplicationContext = this.f3912a;
        if (this.f3913b.f3911a == null) {
            return new FrescoModule(reactApplicationContext, true, null);
        }
        this.f3913b.f3911a.mo4545a();
        throw null;
    }
}
