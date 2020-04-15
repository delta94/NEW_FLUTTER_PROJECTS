package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1571G;
import com.facebook.react.uimanager.C1578N;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager<C1832t, C1830r> {
    public static final String REACT_CLASS = "RCTText";

    public C1830r createShadowNodeInstance() {
        return new C1830r();
    }

    public C1832t createViewInstance(C1578N n) {
        return new C1832t(n);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return C1397f.m5735a("topTextLayout", C1397f.m5735a("registrationName", "onTextLayout"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C1830r> getShadowNodeClass() {
        return C1830r.class;
    }

    public long measure(ReactContext reactContext, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return C1805A.m6903a(reactContext, readableNativeMap, readableNativeMap2, f, yogaMeasureMode, f2, yogaMeasureMode2);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C1832t tVar) {
        super.onAfterUpdateTransaction(tVar);
        tVar.mo2021d();
    }

    public void updateExtraData(C1832t tVar, Object obj) {
        C1831s sVar = (C1831s) obj;
        if (sVar.mo6410a()) {
            C1838z.m7020a(sVar.mo6417h(), tVar);
        }
        tVar.setText(sVar);
    }

    public Object updateLocalData(C1832t tVar, C1571G g, C1571G g2) {
        Spannable a = C1805A.m6904a(tVar.getContext(), g2.mo5674c("attributedString"));
        tVar.setSpanned(a);
        C1836x xVar = new C1836x(g);
        C1831s sVar = new C1831s(a, -1, false, xVar.mo6457d(), xVar.mo6462f(), xVar.mo6454c(), xVar.mo6441a(), xVar.mo6460e(), 1, 0);
        return sVar;
    }
}
