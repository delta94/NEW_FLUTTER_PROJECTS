package com.facebook.yoga;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: e */
    private final int f5758e;

    private YogaDirection(int i) {
        this.f5758e = i;
    }

    /* renamed from: a */
    public static YogaDirection m7362a(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown enum value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public int mo6829a() {
        return this.f5758e;
    }
}
