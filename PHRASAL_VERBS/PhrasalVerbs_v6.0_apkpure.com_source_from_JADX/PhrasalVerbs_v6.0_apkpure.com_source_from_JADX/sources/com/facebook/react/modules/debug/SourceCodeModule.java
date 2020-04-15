package com.facebook.react.modules.debug;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "SourceCode")
public class SourceCodeModule extends BaseJavaModule {
    public static final String NAME = "SourceCode";
    private final ReactContext mReactContext;

    public SourceCodeModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        String sourceURL = this.mReactContext.getCatalystInstance().getSourceURL();
        C1136a.m5054a(sourceURL, "No source URL loaded, have you initialised the instance?");
        hashMap.put("scriptURL", sourceURL);
        return hashMap;
    }

    public String getName() {
        return NAME;
    }
}
