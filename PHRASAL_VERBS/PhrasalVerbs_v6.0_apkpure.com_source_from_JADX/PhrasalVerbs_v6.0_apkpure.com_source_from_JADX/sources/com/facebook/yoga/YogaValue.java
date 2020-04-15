package com.facebook.yoga;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class YogaValue {

    /* renamed from: a */
    static final YogaValue f5835a = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);

    /* renamed from: b */
    static final YogaValue f5836b = new YogaValue(0.0f, YogaUnit.POINT);

    /* renamed from: c */
    static final YogaValue f5837c = new YogaValue(Float.NaN, YogaUnit.AUTO);

    /* renamed from: d */
    public final float f5838d;

    /* renamed from: e */
    public final YogaUnit f5839e;

    @C1137a
    YogaValue(float f, int i) {
        this(f, YogaUnit.m7429a(i));
    }

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.f5838d = f;
        this.f5839e = yogaUnit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.f5839e;
        if (yogaUnit == yogaValue.f5839e) {
            return yogaUnit == YogaUnit.UNDEFINED || yogaUnit == YogaUnit.AUTO || Float.compare(this.f5838d, yogaValue.f5838d) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f5838d) + this.f5839e.mo6899a();
    }

    public String toString() {
        int i = C1946d.f5846a[this.f5839e.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.f5838d);
        }
        if (i == 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5838d);
            sb.append("%");
            return sb.toString();
        } else if (i == 4) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }
}
