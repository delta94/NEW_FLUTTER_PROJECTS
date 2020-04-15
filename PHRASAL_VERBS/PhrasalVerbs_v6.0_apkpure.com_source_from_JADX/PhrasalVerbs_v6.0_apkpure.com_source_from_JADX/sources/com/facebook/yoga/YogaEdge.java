package com.facebook.yoga;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public enum YogaEdge {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    

    /* renamed from: k */
    private final int f5773k;

    private YogaEdge(int i) {
        this.f5773k = i;
    }

    /* renamed from: a */
    public static YogaEdge m7365a(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown enum value: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public int mo6831a() {
        return this.f5773k;
    }
}
