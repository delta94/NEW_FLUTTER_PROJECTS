package com.facebook.react.bridge;

import javax.inject.Provider;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

public class ModuleSpec {
    private static final String TAG = "ModuleSpec";
    private final String mName;
    private final Provider<? extends NativeModule> mProvider;
    private final Class<? extends NativeModule> mType = null;

    private ModuleSpec(Provider<? extends NativeModule> provider) {
        this.mProvider = provider;
        this.mName = null;
    }

    private ModuleSpec(Provider<? extends NativeModule> provider, String str) {
        this.mProvider = provider;
        this.mName = str;
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider<? extends NativeModule> provider) {
        C1176a aVar = (C1176a) cls.getAnnotation(C1176a.class);
        if (aVar != null) {
            return new ModuleSpec(provider, aVar.name());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find @ReactModule annotation on ");
        sb.append(cls.getName());
        sb.append(". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
        C0727a.m3284d(TAG, sb.toString());
        return new ModuleSpec(provider, ((NativeModule) provider.get()).getName());
    }

    public static ModuleSpec nativeModuleSpec(String str, Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider, str);
    }

    public static ModuleSpec viewManagerSpec(Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider);
    }

    public String getName() {
        return this.mName;
    }

    public Provider<? extends NativeModule> getProvider() {
        return this.mProvider;
    }

    public Class<? extends NativeModule> getType() {
        return this.mType;
    }
}
