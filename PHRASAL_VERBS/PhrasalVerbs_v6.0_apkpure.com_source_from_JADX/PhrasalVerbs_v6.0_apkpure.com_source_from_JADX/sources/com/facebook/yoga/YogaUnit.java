package com.facebook.yoga;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    

    /* renamed from: f */
    private final int f5834f;

    private YogaUnit(int i) {
        this.f5834f = i;
    }

    /* renamed from: a */
    public static YogaUnit m7429a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public int mo6899a() {
        return this.f5834f;
    }
}
