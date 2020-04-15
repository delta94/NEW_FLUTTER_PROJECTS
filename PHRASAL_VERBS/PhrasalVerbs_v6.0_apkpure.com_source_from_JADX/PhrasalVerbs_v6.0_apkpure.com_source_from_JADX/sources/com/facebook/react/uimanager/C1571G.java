package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.uimanager.G */
public class C1571G {

    /* renamed from: a */
    final ReadableMap f4775a;

    public C1571G(ReadableMap readableMap) {
        this.f4775a = readableMap;
    }

    /* renamed from: a */
    public double mo5668a(String str, double d) {
        return this.f4775a.isNull(str) ? d : this.f4775a.getDouble(str);
    }

    /* renamed from: a */
    public float mo5669a(String str, float f) {
        return this.f4775a.isNull(str) ? f : (float) this.f4775a.getDouble(str);
    }

    /* renamed from: a */
    public int mo5670a(String str, int i) {
        return this.f4775a.isNull(str) ? i : this.f4775a.getInt(str);
    }

    /* renamed from: a */
    public ReadableArray mo5671a(String str) {
        return this.f4775a.getArray(str);
    }

    /* renamed from: a */
    public boolean mo5672a(String str, boolean z) {
        return this.f4775a.isNull(str) ? z : this.f4775a.getBoolean(str);
    }

    /* renamed from: b */
    public Dynamic mo5673b(String str) {
        return this.f4775a.getDynamic(str);
    }

    /* renamed from: c */
    public ReadableMap mo5674c(String str) {
        return this.f4775a.getMap(str);
    }

    /* renamed from: d */
    public String mo5675d(String str) {
        return this.f4775a.getString(str);
    }

    /* renamed from: e */
    public boolean mo5676e(String str) {
        return this.f4775a.hasKey(str);
    }

    /* renamed from: f */
    public boolean mo5677f(String str) {
        return this.f4775a.isNull(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(C1571G.class.getSimpleName());
        sb.append(": ");
        sb.append(this.f4775a.toString());
        sb.append(" }");
        return sb.toString();
    }
}
