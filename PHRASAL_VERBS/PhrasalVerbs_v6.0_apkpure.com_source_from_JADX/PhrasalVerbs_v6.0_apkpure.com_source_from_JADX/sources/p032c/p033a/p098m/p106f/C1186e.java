package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.image.ImageLoaderModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.e */
class C1186e implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3918a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3919b;

    C1186e(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3919b = b;
        this.f3918a = reactApplicationContext;
    }

    public NativeModule get() {
        return new ImageLoaderModule(this.f3918a);
    }
}
