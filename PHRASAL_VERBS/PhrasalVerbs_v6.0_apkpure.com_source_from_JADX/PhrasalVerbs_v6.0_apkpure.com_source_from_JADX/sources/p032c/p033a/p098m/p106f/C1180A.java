package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.dialog.DialogModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.A */
class C1180A implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3909a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3910b;

    C1180A(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3910b = b;
        this.f3909a = reactApplicationContext;
    }

    public NativeModule get() {
        return new DialogModule(this.f3909a);
    }
}
