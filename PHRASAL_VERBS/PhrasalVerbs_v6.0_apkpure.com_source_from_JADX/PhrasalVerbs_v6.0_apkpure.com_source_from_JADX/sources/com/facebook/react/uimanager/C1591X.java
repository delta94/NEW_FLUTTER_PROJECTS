package com.facebook.react.uimanager;

import com.facebook.react.uimanager.UIManagerModule.C1586a;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.X */
class C1591X implements C1586a {

    /* renamed from: a */
    final /* synthetic */ UIManagerModule f4805a;

    C1591X(UIManagerModule uIManagerModule) {
        this.f4805a = uIManagerModule;
    }

    /* renamed from: a */
    public String mo5790a(String str) {
        Map map = (Map) this.f4805a.mCustomDirectEvents.get(str);
        return map != null ? (String) map.get("registrationName") : str;
    }
}
