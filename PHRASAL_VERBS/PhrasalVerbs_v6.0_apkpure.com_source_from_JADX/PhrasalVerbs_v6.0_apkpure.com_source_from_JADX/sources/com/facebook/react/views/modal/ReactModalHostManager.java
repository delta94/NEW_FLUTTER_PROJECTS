package com.facebook.react.views.modal;

import com.facebook.react.common.C1397f;
import com.facebook.react.common.C1397f.C1398a;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.p121a.C1595a;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTModalHostView")
public class ReactModalHostManager extends ViewGroupManager<C1763g> {
    public static final String REACT_CLASS = "RCTModalHostView";

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1763g gVar) {
        C1638f eventDispatcher = ((UIManagerModule) n.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        gVar.setOnRequestCloseListener(new C1759c(this, eventDispatcher, gVar));
        gVar.setOnShowListener(new C1760d(this, eventDispatcher, gVar));
    }

    public C1691n createShadowNodeInstance() {
        return new C1758b();
    }

    /* access modifiers changed from: protected */
    public C1763g createViewInstance(C1578N n) {
        return new C1763g(n);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C1398a a = C1397f.m5734a();
        String str = "registrationName";
        a.mo5183a("topRequestClose", C1397f.m5735a(str, "onRequestClose"));
        a.mo5183a("topShow", C1397f.m5735a(str, "onShow"));
        return a.mo5184a();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<? extends C1691n> getShadowNodeClass() {
        return C1758b.class;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C1763g gVar) {
        super.onAfterUpdateTransaction(gVar);
        gVar.mo6123b();
    }

    public void onDropViewInstance(C1763g gVar) {
        super.onDropViewInstance(gVar);
        gVar.mo6120a();
    }

    @C1595a(name = "animationType")
    public void setAnimationType(C1763g gVar, String str) {
        gVar.setAnimationType(str);
    }

    @C1595a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(C1763g gVar, boolean z) {
        gVar.setHardwareAccelerated(z);
    }

    @C1595a(name = "transparent")
    public void setTransparent(C1763g gVar, boolean z) {
        gVar.setTransparent(z);
    }
}
