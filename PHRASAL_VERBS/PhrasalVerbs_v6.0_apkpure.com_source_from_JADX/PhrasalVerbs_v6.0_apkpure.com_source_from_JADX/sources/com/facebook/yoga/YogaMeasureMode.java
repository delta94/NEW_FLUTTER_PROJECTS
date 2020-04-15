package com.facebook.yoga;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    

    /* renamed from: e */
    private final int f5803e;

    private YogaMeasureMode(int i) {
        this.f5803e = i;
    }

    /* renamed from: a */
    public static YogaMeasureMode m7369a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
