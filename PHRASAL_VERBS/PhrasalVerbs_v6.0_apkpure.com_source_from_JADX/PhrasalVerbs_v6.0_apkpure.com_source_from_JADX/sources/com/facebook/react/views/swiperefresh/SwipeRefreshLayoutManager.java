package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1397f;
import com.facebook.react.common.C1397f.C1398a;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p121a.C1595a;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AndroidSwipeRefreshLayout")
public class SwipeRefreshLayoutManager extends ViewGroupManager<C1798a> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1798a aVar) {
        aVar.setOnRefreshListener(new C1800c(this, n, aVar));
    }

    /* access modifiers changed from: protected */
    public C1798a createViewInstance(C1578N n) {
        return new C1798a(n);
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C1398a a = C1397f.m5734a();
        a.mo5183a("topRefresh", C1397f.m5735a("registrationName", "onRefresh"));
        return a.mo5184a();
    }

    public Map<String, Object> getExportedViewConstants() {
        return C1397f.m5735a("SIZE", C1397f.m5736a("DEFAULT", Integer.valueOf(1), "LARGE", Integer.valueOf(0)));
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C1595a(customType = "ColorArray", name = "colors")
    public void setColors(C1798a aVar, ReadableArray readableArray) {
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                iArr[i] = readableArray.getInt(i);
            }
            aVar.setColorSchemeColors(iArr);
            return;
        }
        aVar.setColorSchemeColors(new int[0]);
    }

    @C1595a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1798a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @C1595a(customType = "Color", defaultInt = 0, name = "progressBackgroundColor")
    public void setProgressBackgroundColor(C1798a aVar, int i) {
        aVar.setProgressBackgroundColorSchemeColor(i);
    }

    @C1595a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(C1798a aVar, float f) {
        aVar.setProgressViewOffset(f);
    }

    @C1595a(name = "refreshing")
    public void setRefreshing(C1798a aVar, boolean z) {
        aVar.setRefreshing(z);
    }

    @C1595a(defaultInt = 1, name = "size")
    public void setSize(C1798a aVar, int i) {
        aVar.setSize(i);
    }
}
