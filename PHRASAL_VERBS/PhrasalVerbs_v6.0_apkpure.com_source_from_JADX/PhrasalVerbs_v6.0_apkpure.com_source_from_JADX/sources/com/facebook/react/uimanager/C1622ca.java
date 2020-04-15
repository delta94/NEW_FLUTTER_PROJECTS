package com.facebook.react.uimanager;

import android.widget.ImageView.ScaleType;
import com.facebook.react.common.C1397f;
import com.facebook.react.common.C1397f.C1398a;
import com.facebook.react.uimanager.events.C1648n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.ca */
class C1622ca {
    /* renamed from: a */
    static Map m6376a() {
        C1398a a = C1397f.m5734a();
        String str = "captured";
        String str2 = "bubbled";
        String str3 = "phasedRegistrationNames";
        String str4 = "topChange";
        a.mo5183a(str4, C1397f.m5735a(str3, C1397f.m5736a(str2, "onChange", str, "onChangeCapture")));
        a.mo5183a("topSelect", C1397f.m5735a(str3, C1397f.m5736a(str2, "onSelect", str, "onSelectCapture")));
        a.mo5183a(C1648n.m6461a(C1648n.START), C1397f.m5735a(str3, C1397f.m5736a(str2, "onTouchStart", str, "onTouchStartCapture")));
        a.mo5183a(C1648n.m6461a(C1648n.MOVE), C1397f.m5735a(str3, C1397f.m5736a(str2, "onTouchMove", str, "onTouchMoveCapture")));
        a.mo5183a(C1648n.m6461a(C1648n.END), C1397f.m5735a(str3, C1397f.m5736a(str2, "onTouchEnd", str, "onTouchEndCapture")));
        a.mo5183a(C1648n.m6461a(C1648n.CANCEL), C1397f.m5735a(str3, C1397f.m5736a(str2, "onTouchCancel", str, "onTouchCancelCapture")));
        return a.mo5184a();
    }

    /* renamed from: b */
    public static Map<String, Object> m6377b() {
        HashMap b = C1397f.m5742b();
        b.put("UIView", C1397f.m5735a("ContentMode", C1397f.m5737a("ScaleAspectFit", Integer.valueOf(ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ScaleType.CENTER_INSIDE.ordinal()))));
        b.put("StyleConstants", C1397f.m5735a("PointerEventsValues", C1397f.m5738a("none", Integer.valueOf(C1727x.NONE.ordinal()), "boxNone", Integer.valueOf(C1727x.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(C1727x.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(C1727x.AUTO.ordinal()))));
        String str = "itemSelected";
        String str2 = "dismissed";
        b.put("PopupMenu", C1397f.m5736a(str2, str2, str, str));
        b.put("AccessibilityEventTypes", C1397f.m5737a("typeWindowStateChanged", Integer.valueOf(32), "typeViewFocused", Integer.valueOf(8), "typeViewClicked", Integer.valueOf(1)));
        return b;
    }

    /* renamed from: c */
    static Map m6378c() {
        C1398a a = C1397f.m5734a();
        String str = "registrationName";
        a.mo5183a("topContentSizeChange", C1397f.m5735a(str, "onContentSizeChange"));
        a.mo5183a("topLayout", C1397f.m5735a(str, "onLayout"));
        a.mo5183a("topLoadingError", C1397f.m5735a(str, "onLoadingError"));
        a.mo5183a("topLoadingFinish", C1397f.m5735a(str, "onLoadingFinish"));
        a.mo5183a("topLoadingStart", C1397f.m5735a(str, "onLoadingStart"));
        a.mo5183a("topSelectionChange", C1397f.m5735a(str, "onSelectionChange"));
        a.mo5183a("topMessage", C1397f.m5735a(str, "onMessage"));
        a.mo5183a("topScrollBeginDrag", C1397f.m5735a(str, "onScrollBeginDrag"));
        a.mo5183a("topScrollEndDrag", C1397f.m5735a(str, "onScrollEndDrag"));
        a.mo5183a("topScroll", C1397f.m5735a(str, "onScroll"));
        a.mo5183a("topMomentumScrollBegin", C1397f.m5735a(str, "onMomentumScrollBegin"));
        a.mo5183a("topMomentumScrollEnd", C1397f.m5735a(str, "onMomentumScrollEnd"));
        return a.mo5184a();
    }
}
