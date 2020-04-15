package com.facebook.react.uimanager.events;

/* renamed from: com.facebook.react.uimanager.events.n */
public enum C1648n {
    START,
    END,
    MOVE,
    CANCEL;

    /* renamed from: a */
    public static String m6461a(C1648n nVar) {
        int i = C1647m.f4922a[nVar.ordinal()];
        if (i == 1) {
            return "topTouchStart";
        }
        if (i == 2) {
            return "topTouchEnd";
        }
        if (i == 3) {
            return "topTouchMove";
        }
        if (i == 4) {
            return "topTouchCancel";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected type ");
        sb.append(nVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
