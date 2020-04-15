package com.facebook.react.uimanager;

import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.ja */
public class C1684ja {

    /* renamed from: a */
    public static Comparator<C1684ja> f5029a = new C1682ia();

    /* renamed from: b */
    public final int f5030b;

    /* renamed from: c */
    public final int f5031c;

    public C1684ja(int i, int i2) {
        this.f5030b = i;
        this.f5031c = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C1684ja.class) {
            return false;
        }
        C1684ja jaVar = (C1684ja) obj;
        return this.f5031c == jaVar.f5031c && this.f5030b == jaVar.f5030b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f5030b);
        sb.append(", ");
        sb.append(this.f5031c);
        sb.append("]");
        return sb.toString();
    }
}
