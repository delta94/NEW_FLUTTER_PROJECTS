package p032c.p033a.p098m.p106f;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import javax.inject.Provider;

/* renamed from: c.a.m.f.i */
class C1190i implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3926a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3927b;

    C1190i(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3927b = b;
        this.f3926a = reactApplicationContext;
    }

    public NativeModule get() {
        return new NativeAnimatedModule(this.f3926a);
    }
}
