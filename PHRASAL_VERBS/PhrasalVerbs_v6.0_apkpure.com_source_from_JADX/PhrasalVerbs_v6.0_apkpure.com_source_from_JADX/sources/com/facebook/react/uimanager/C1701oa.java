package com.facebook.react.uimanager;

import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.UIManagerModule.C1588c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.oa */
public final class C1701oa {

    /* renamed from: a */
    private final Map<String, ViewManager> f5056a;

    /* renamed from: b */
    private final C1588c f5057b;

    public C1701oa(C1588c cVar) {
        this.f5056a = C1397f.m5742b();
        this.f5057b = cVar;
    }

    public C1701oa(List<ViewManager> list) {
        HashMap b = C1397f.m5742b();
        for (ViewManager viewManager : list) {
            b.put(viewManager.getName(), viewManager);
        }
        this.f5056a = b;
        this.f5057b = null;
    }

    /* renamed from: a */
    public ViewManager mo5978a(String str) {
        ViewManager viewManager = (ViewManager) this.f5056a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        C1588c cVar = this.f5057b;
        if (cVar != null) {
            ViewManager a = cVar.mo4529a(str);
            if (a != null) {
                this.f5056a.put(str, a);
                return a;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No ViewManager defined for class ");
        sb.append(str);
        throw new C1685k(sb.toString());
    }
}
