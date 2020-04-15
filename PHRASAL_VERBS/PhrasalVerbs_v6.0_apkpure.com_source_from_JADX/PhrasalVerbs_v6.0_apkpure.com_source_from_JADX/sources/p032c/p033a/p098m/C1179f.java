package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import com.facebook.react.module.model.C1436a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;

/* renamed from: c.a.m.f */
class C1179f extends C1217j {
    C1179f() {
    }

    /* renamed from: a */
    public C1436a mo4543a() {
        return C1217j.m5212a((C1217j) this);
    }

    /* renamed from: d */
    public List<ModuleSpec> mo4544d(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCHeapCapture.class, (Provider<? extends NativeModule>) new C1175d<Object>(this, reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCSamplingProfiler.class, (Provider<? extends NativeModule>) new C1177e<Object>(this, reactApplicationContext)));
        return arrayList;
    }
}
