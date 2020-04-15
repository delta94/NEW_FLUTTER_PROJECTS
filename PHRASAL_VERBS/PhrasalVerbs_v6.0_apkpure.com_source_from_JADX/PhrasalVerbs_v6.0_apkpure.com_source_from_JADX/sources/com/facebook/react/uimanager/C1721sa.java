package com.facebook.react.uimanager;

import com.facebook.react.common.C1391a;
import com.facebook.yoga.YogaNode;

/* renamed from: com.facebook.react.uimanager.sa */
public class C1721sa {

    /* renamed from: a */
    private static final Object f5096a = new Object();

    /* renamed from: b */
    private static C1391a<YogaNode> f5097b;

    /* renamed from: a */
    public static C1391a<YogaNode> m6642a() {
        C1391a<YogaNode> aVar;
        C1391a<YogaNode> aVar2 = f5097b;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (f5096a) {
            if (f5097b == null) {
                f5097b = new C1391a<>(1024);
            }
            aVar = f5097b;
        }
        return aVar;
    }
}
