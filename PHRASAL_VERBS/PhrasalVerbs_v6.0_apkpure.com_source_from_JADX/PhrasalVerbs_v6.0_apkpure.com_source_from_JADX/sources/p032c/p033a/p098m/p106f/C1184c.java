package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.c */
class C1184c implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3914a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3915b;

    C1184c(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3915b = b;
        this.f3914a = reactApplicationContext;
    }

    public NativeModule get() {
        return new I18nManagerModule(this.f3914a);
    }
}
