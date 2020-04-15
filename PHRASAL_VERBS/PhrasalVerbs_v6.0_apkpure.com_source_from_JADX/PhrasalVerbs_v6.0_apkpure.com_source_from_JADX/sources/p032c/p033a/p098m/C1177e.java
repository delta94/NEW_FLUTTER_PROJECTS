package p032c.p033a.p098m;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import javax.inject.Provider;

/* renamed from: c.a.m.e */
class C1177e implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3907a;

    /* renamed from: b */
    final /* synthetic */ C1179f f3908b;

    C1177e(C1179f fVar, ReactApplicationContext reactApplicationContext) {
        this.f3908b = fVar;
        this.f3907a = reactApplicationContext;
    }

    public NativeModule get() {
        return new JSCSamplingProfiler(this.f3907a);
    }
}
