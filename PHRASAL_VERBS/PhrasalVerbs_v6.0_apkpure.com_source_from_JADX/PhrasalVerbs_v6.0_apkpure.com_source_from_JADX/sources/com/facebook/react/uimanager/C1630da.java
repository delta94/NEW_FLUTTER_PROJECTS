package com.facebook.react.uimanager;

import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.UIManagerModule.C1588c;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p032c.p033a.p098m.p100b.C1170a;

/* renamed from: com.facebook.react.uimanager.da */
class C1630da {
    /* renamed from: a */
    static Map<String, Object> m6387a() {
        return C1397f.m5736a("bubblingEventTypes", C1622ca.m6376a(), "directEventTypes", C1622ca.m6378c());
    }

    /* renamed from: a */
    static Map<String, Object> m6388a(C1588c cVar) {
        Map<String, Object> b = C1622ca.m6377b();
        if (!C1170a.f3888a) {
            b.put("ViewManagerNames", cVar.mo4530a());
        }
        b.put("LazyViewManagersEnabled", Boolean.valueOf(true));
        return b;
    }

    /* renamed from: a */
    static Map<String, Object> m6389a(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b = C1397f.m5742b();
        Map exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        String str = "bubblingEventTypes";
        if (exportedCustomBubblingEventTypeConstants != null) {
            m6391a(map3, exportedCustomBubblingEventTypeConstants);
            m6391a(exportedCustomBubblingEventTypeConstants, map);
            b.put(str, exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b.put(str, map);
        }
        Map exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        String str2 = "directEventTypes";
        if (exportedCustomDirectEventTypeConstants != null) {
            m6391a(map4, exportedCustomDirectEventTypeConstants);
            m6391a(exportedCustomDirectEventTypeConstants, map2);
            b.put(str2, exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b.put(str2, map2);
        }
        Map exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b.put("Constants", exportedViewConstants);
        }
        Map commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b.put("Commands", commandsMap);
        }
        Map nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b.put("NativeProps", nativeProps);
        }
        return b;
    }

    /* renamed from: a */
    static Map<String, Object> m6390a(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> b = C1622ca.m6377b();
        Map a = C1622ca.m6376a();
        Map c = C1622ca.m6378c();
        if (map != null) {
            map.putAll(a);
        }
        if (map2 != null) {
            map2.putAll(c);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            C1941a a2 = C1940c.m7352a(0, "UIManagerModuleConstantsHelper.createConstants");
            a2.mo6822a("ViewManager", (Object) name);
            a2.mo6822a("Lazy", (Object) Boolean.valueOf(false));
            a2.mo6823a();
            try {
                Map a3 = m6389a(viewManager, null, null, map, map2);
                if (!a3.isEmpty()) {
                    b.put(name, a3);
                }
            } finally {
                C1940c.m7351a(0);
            }
        }
        b.put("genericBubblingEventTypes", a);
        b.put("genericDirectEventTypes", c);
        return b;
    }

    /* renamed from: a */
    private static void m6391a(Map map, Map map2) {
        if (map != null && map2 != null && !map2.isEmpty()) {
            for (Object next : map2.keySet()) {
                Object obj = map2.get(next);
                Object obj2 = map.get(next);
                if (obj2 == null || !(obj instanceof Map) || !(obj2 instanceof Map)) {
                    map.put(next, obj);
                } else {
                    m6391a((Map) obj2, (Map) obj);
                }
            }
        }
    }
}
