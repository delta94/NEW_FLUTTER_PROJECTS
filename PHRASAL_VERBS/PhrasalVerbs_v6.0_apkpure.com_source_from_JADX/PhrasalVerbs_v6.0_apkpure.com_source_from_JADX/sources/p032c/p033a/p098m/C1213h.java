package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.a.m.h */
class C1213h implements Iterator<ModuleHolder> {

    /* renamed from: a */
    int f3964a = 0;

    /* renamed from: b */
    final /* synthetic */ C1215i f3965b;

    C1213h(C1215i iVar) {
        this.f3965b = iVar;
    }

    public boolean hasNext() {
        return this.f3964a < this.f3965b.f3966a.size();
    }

    /* JADX INFO: finally extract failed */
    public ModuleHolder next() {
        List list = this.f3965b.f3966a;
        int i = this.f3964a;
        this.f3964a = i + 1;
        ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
        String name = moduleSpec.getName();
        ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.f3965b.f3967b.get(name);
        if (reactModuleInfo != null) {
            return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
        }
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
        try {
            NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
            return new ModuleHolder(nativeModule);
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
            throw th;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
}
