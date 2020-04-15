package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.o */
class C1196o implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3938a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3939b;

    C1196o(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3939b = b;
        this.f3938a = reactApplicationContext;
    }

    public NativeModule get() {
        return new StatusBarModule(this.f3938a);
    }
}
