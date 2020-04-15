package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.toast.ToastModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.q */
class C1198q implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3942a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3943b;

    C1198q(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3943b = b;
        this.f3942a = reactApplicationContext;
    }

    public NativeModule get() {
        return new ToastModule(this.f3942a);
    }
}
