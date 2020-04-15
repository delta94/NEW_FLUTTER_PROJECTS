package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p032c.p033a.p094k.p095a.C1136a;

public class JSIModuleRegistry {
    private final Map<Class, JSIModuleHolder> mModules = new HashMap();

    public <T extends JSIModule> T getModule(Class<T> cls) {
        JSIModuleHolder jSIModuleHolder = (JSIModuleHolder) this.mModules.get(cls);
        if (jSIModuleHolder != null) {
            T jSIModule = jSIModuleHolder.getJSIModule();
            C1136a.m5053a(jSIModule);
            return (JSIModule) jSIModule;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find JSIModule for class ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    public void notifyJSInstanceDestroy() {
        for (JSIModuleHolder notifyJSInstanceDestroy : this.mModules.values()) {
            notifyJSInstanceDestroy.notifyJSInstanceDestroy();
        }
    }

    public void registerModules(List<JSIModuleSpec> list) {
        for (JSIModuleSpec jSIModuleSpec : list) {
            this.mModules.put(jSIModuleSpec.getJSIModuleClass(), new JSIModuleHolder(jSIModuleSpec));
        }
    }
}
