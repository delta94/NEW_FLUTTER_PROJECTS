package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.fabric.p119a.C1418b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.j */
public class C1433j implements C1428e {

    /* renamed from: a */
    private final int f4458a;

    /* renamed from: b */
    private final ReadableMap f4459b;

    public C1433j(int i, ReadableNativeMap readableNativeMap) {
        this.f4458a = i;
        this.f4459b = readableNativeMap;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5233a(this.f4458a, this.f4459b);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateLocalDataMountItem [");
        sb.append(this.f4458a);
        sb.append("] - localData: ");
        sb.append(this.f4459b);
        return sb.toString();
    }
}
