package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.l */
class C1193l implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3932a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3933b;

    C1193l(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3933b = b;
        this.f3932a = reactApplicationContext;
    }

    public NativeModule get() {
        return new AccessibilityInfoModule(this.f3932a);
    }
}
