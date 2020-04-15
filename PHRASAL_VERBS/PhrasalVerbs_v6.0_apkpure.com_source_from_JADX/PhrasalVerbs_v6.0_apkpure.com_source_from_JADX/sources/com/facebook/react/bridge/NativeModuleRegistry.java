package com.facebook.react.bridge;

import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.C1937a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

public class NativeModuleRegistry {
    private final Map<String, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> map) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
    }

    private Map<String, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder module : this.mModules.values()) {
            arrayList.add(module.getModule());
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.mModules.entrySet()) {
            if (((ModuleHolder) entry.getValue()).isCxxModule()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.mModules.entrySet()) {
            if (!((ModuleHolder) entry.getValue()).isCxxModule()) {
                arrayList.add(new JavaModuleWrapper(jSInstance, (ModuleHolder) entry.getValue()));
            }
        }
        return arrayList;
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        C1176a aVar = (C1176a) cls.getAnnotation(C1176a.class);
        if (aVar != null) {
            Object obj = this.mModules.get(aVar.name());
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.name());
            sb.append(" could not be found. Is it defined in ");
            sb.append(cls.getName());
            C1136a.m5054a(obj, sb.toString());
            return ((ModuleHolder) obj).getModule();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not find @ReactModule annotation in class ");
        sb2.append(cls.getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public NativeModule getModule(String str) {
        Object obj = this.mModules.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find module with name ");
        sb.append(str);
        C1136a.m5054a(obj, sb.toString());
        return ((ModuleHolder) obj).getModule();
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(((C1176a) cls.getAnnotation(C1176a.class)).name());
    }

    public boolean hasModule(String str) {
        return this.mModules.containsKey(str);
    }

    /* access modifiers changed from: 0000 */
    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        C1937a.m7339a(0, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            for (ModuleHolder destroy : this.mModules.values()) {
                destroy.destroy();
            }
        } finally {
            C1937a.m7338a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        C1937a.m7339a(0, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            for (ModuleHolder markInitializable : this.mModules.values()) {
                markInitializable.markInitializable();
            }
        } finally {
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        ModuleHolder moduleHolder = (ModuleHolder) this.mModules.get(UIManagerModule.NAME);
        if (moduleHolder != null && moduleHolder.hasInstance()) {
            ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
        }
    }

    /* access modifiers changed from: 0000 */
    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        C1136a.m5056a(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
        for (Entry entry : nativeModuleRegistry.getModuleMap().entrySet()) {
            String str = (String) entry.getKey();
            if (!this.mModules.containsKey(str)) {
                this.mModules.put(str, (ModuleHolder) entry.getValue());
            }
        }
    }
}
