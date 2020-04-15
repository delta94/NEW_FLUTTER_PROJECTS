package com.facebook.react.views.scroll;

/* renamed from: com.facebook.react.views.scroll.l */
public enum C1791l {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* renamed from: a */
    public static String m6865a(C1791l lVar) {
        int i = C1790k.f5306a[lVar.ordinal()];
        if (i == 1) {
            return "topScrollBeginDrag";
        }
        if (i == 2) {
            return "topScrollEndDrag";
        }
        if (i == 3) {
            return "topScroll";
        }
        if (i == 4) {
            return "topMomentumScrollBegin";
        }
        if (i == 5) {
            return "topMomentumScrollEnd";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported ScrollEventType: ");
        sb.append(lVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
