package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1578N;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTVirtualText")
public class ReactVirtualTextViewManager extends BaseViewManager<View, C1834v> {
    public static final String REACT_CLASS = "RCTVirtualText";

    public C1834v createShadowNodeInstance() {
        return new C1834v();
    }

    public View createViewInstance(C1578N n) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C1834v> getShadowNodeClass() {
        return C1834v.class;
    }

    public void updateExtraData(View view, Object obj) {
    }
}
