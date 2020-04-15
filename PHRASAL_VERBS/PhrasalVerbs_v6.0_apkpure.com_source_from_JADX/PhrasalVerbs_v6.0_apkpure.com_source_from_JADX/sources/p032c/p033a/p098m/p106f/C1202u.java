package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.blob.BlobModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.u */
class C1202u implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3950a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3951b;

    C1202u(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3951b = b;
        this.f3950a = reactApplicationContext;
    }

    public NativeModule get() {
        return new BlobModule(this.f3950a);
    }
}
