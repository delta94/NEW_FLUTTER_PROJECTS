package p032c.p033a.p098m;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import javax.inject.Provider;

/* renamed from: c.a.m.d */
class C1175d implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3905a;

    /* renamed from: b */
    final /* synthetic */ C1179f f3906b;

    C1175d(C1179f fVar, ReactApplicationContext reactApplicationContext) {
        this.f3906b = fVar;
        this.f3905a = reactApplicationContext;
    }

    public NativeModule get() {
        return new JSCHeapCapture(this.f3905a);
    }
}
