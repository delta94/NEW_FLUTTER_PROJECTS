package com.swmansion.gesturehandler.react;

import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "GestureHandlerRootView")
public class RNGestureHandlerRootViewManager extends ViewGroupManager<C1991k> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    /* access modifiers changed from: protected */
    public C1991k createViewInstance(C1578N n) {
        return new C1991k(n);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        String str2 = "onGestureHandlerEvent";
        String str3 = "onGestureHandlerStateChange";
        return C1397f.m5736a(str2, C1397f.m5735a(str, str2), str3, C1397f.m5735a(str, str3));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void onDropViewInstance(C1991k kVar) {
        kVar.mo7034e();
    }
}
