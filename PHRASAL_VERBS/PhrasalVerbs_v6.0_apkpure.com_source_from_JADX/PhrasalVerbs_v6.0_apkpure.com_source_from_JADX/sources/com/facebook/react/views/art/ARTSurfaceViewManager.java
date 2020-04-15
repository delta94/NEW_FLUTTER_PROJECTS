package com.facebook.react.views.art;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1578N;
import com.facebook.yoga.YogaMeasureFunction;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "ARTSurfaceView")
public class ARTSurfaceViewManager extends BaseViewManager<C1732c, C1734e> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new C1733d();
    public static final String REACT_CLASS = "ARTSurfaceView";

    public C1734e createShadowNodeInstance() {
        C1734e eVar = new C1734e();
        eVar.mo5633a(MEASURE_FUNCTION);
        return eVar;
    }

    /* access modifiers changed from: protected */
    public C1732c createViewInstance(C1578N n) {
        return new C1732c(n);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C1734e> getShadowNodeClass() {
        return C1734e.class;
    }

    public void setBackgroundColor(C1732c cVar, int i) {
    }

    public void updateExtraData(C1732c cVar, Object obj) {
        cVar.setSurfaceTextureListener((C1734e) obj);
    }
}
