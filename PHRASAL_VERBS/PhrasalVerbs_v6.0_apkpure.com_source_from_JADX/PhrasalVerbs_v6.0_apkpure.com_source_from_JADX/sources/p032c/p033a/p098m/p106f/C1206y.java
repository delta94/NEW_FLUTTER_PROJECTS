package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.clipboard.ClipboardModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.y */
class C1206y implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3958a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3959b;

    C1206y(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3959b = b;
        this.f3958a = reactApplicationContext;
    }

    public NativeModule get() {
        return new ClipboardModule(this.f3958a);
    }
}
