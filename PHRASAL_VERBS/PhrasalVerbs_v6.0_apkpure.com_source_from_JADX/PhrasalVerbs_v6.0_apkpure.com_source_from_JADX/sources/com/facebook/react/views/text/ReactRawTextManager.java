package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.ViewManager;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTRawText")
public class ReactRawTextManager extends ViewManager<View, C1824l> {
    public static final String REACT_CLASS = "RCTRawText";

    public C1824l createShadowNodeInstance() {
        return new C1824l();
    }

    public C1832t createViewInstance(C1578N n) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C1824l> getShadowNodeClass() {
        return C1824l.class;
    }

    public void updateExtraData(View view, Object obj) {
    }
}
