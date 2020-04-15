package android.support.p030v7.widget;

import android.util.Property;

/* renamed from: android.support.v7.widget.oa */
class C0606oa extends Property<C0608pa, Float> {
    C0606oa(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(C0608pa paVar) {
        return Float.valueOf(paVar.f2363z);
    }

    /* renamed from: a */
    public void set(C0608pa paVar, Float f) {
        paVar.setThumbPosition(f.floatValue());
    }
}
