package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.C1397f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "I18nManager")
public class I18nManagerModule extends ContextBaseJavaModule {
    public static final String NAME = "I18nManager";
    private final C1489a sharedI18nUtilInstance = C1489a.m5938a();

    public I18nManagerModule(Context context) {
        super(context);
    }

    @ReactMethod
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.mo5391a(getContext(), z);
    }

    @ReactMethod
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.mo5393b(getContext(), z);
    }

    public Map<String, Object> getConstants() {
        Context context = getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap b = C1397f.m5742b();
        b.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.mo5394b(context)));
        b.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.mo5392a(context)));
        b.put("localeIdentifier", locale.toString());
        return b;
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.mo5395c(getContext(), z);
    }
}
