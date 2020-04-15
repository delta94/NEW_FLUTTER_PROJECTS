package com.facebook.react.views.drawer;

import android.os.Build.VERSION;
import android.support.p029v4.widget.C0373k;
import android.support.p029v4.widget.C0373k.C0376c;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.views.drawer.p125a.C1743a;
import com.facebook.react.views.drawer.p125a.C1744b;
import com.facebook.react.views.drawer.p125a.C1745c;
import com.facebook.react.views.drawer.p125a.C1746d;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AndroidDrawerLayout")
public class ReactDrawerLayoutManager extends ViewGroupManager<C1742a> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    protected static final String REACT_CLASS = "AndroidDrawerLayout";

    /* renamed from: com.facebook.react.views.drawer.ReactDrawerLayoutManager$a */
    public static class C1741a implements C0376c {

        /* renamed from: a */
        private final C0373k f5133a;

        /* renamed from: b */
        private final C1638f f5134b;

        public C1741a(C0373k kVar, C1638f fVar) {
            this.f5133a = kVar;
            this.f5134b = fVar;
        }

        /* renamed from: a */
        public void mo1786a(int i) {
            this.f5134b.mo5886a((C1635c) new C1746d(this.f5133a.getId(), i));
        }

        /* renamed from: a */
        public void mo1787a(View view) {
            this.f5134b.mo5886a((C1635c) new C1744b(this.f5133a.getId()));
        }

        /* renamed from: a */
        public void mo1788a(View view, float f) {
            this.f5134b.mo5886a((C1635c) new C1745c(this.f5133a.getId(), f));
        }

        /* renamed from: b */
        public void mo1789b(View view) {
            this.f5134b.mo5886a((C1635c) new C1743a(this.f5133a.getId()));
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1742a aVar) {
        aVar.setDrawerListener(new C1741a(aVar, ((UIManagerModule) n.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    public void addView(C1742a aVar, View view, int i) {
        if (getChildCount(aVar) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        } else if (i == 0 || i == 1) {
            aVar.addView(view, i);
            aVar.mo6063g();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("The only valid indices for drawer's child are 0 or 1. Got ");
            sb.append(i);
            sb.append(" instead.");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public C1742a createViewInstance(C1578N n) {
        return new C1742a(n);
    }

    public Map<String, Integer> getCommandsMap() {
        return C1397f.m5736a("openDrawer", Integer.valueOf(1), "closeDrawer", Integer.valueOf(2));
    }

    @C1595a(defaultFloat = Float.NaN, name = "drawerWidth")
    public void getDrawerWidth(C1742a aVar, float f) {
        aVar.mo6065h(Float.isNaN(f) ? -1 : Math.round(C1726w.m6668b(f)));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        return C1397f.m5738a("topDrawerSlide", C1397f.m5735a(str, "onDrawerSlide"), "topDrawerOpened", C1397f.m5735a(str, "onDrawerOpen"), "topDrawerClosed", C1397f.m5735a(str, "onDrawerClose"), "topDrawerStateChanged", C1397f.m5735a(str, "onDrawerStateChanged"));
    }

    public Map getExportedViewConstants() {
        return C1397f.m5735a("DrawerPosition", C1397f.m5736a("Left", Integer.valueOf(8388611), "Right", Integer.valueOf(8388613)));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void receiveCommand(C1742a aVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            aVar.mo6062f();
        } else if (i == 2) {
            aVar.mo6061e();
        }
    }

    @C1595a(name = "drawerLockMode")
    public void setDrawerLockMode(C1742a aVar, String str) {
        int i;
        if (str == null || "unlocked".equals(str)) {
            i = 0;
        } else if ("locked-closed".equals(str)) {
            i = 1;
        } else if ("locked-open".equals(str)) {
            i = 2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown drawerLockMode ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        aVar.setDrawerLockMode(i);
    }

    @C1595a(defaultInt = 8388611, name = "drawerPosition")
    public void setDrawerPosition(C1742a aVar, int i) {
        if (8388611 == i || 8388613 == i) {
            aVar.mo6064g(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown drawerPosition ");
        sb.append(i);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    public void setElevation(C1742a aVar, float f) {
        if (VERSION.SDK_INT >= 21) {
            try {
                C1742a.class.getMethod("setDrawerElevation", new Class[]{Float.TYPE}).invoke(aVar, new Object[]{Float.valueOf(C1726w.m6668b(f))});
            } catch (Exception e) {
                C0727a.m3276b("ReactNative", "setDrawerElevation is not available in this version of the support lib.", (Throwable) e);
            }
        }
    }
}
