package com.facebook.react.views.drawer.p125a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.drawer.a.d */
public class C1746d extends C1635c<C1746d> {

    /* renamed from: f */
    private final int f5138f;

    public C1746d(int i, int i2) {
        super(i);
        this.f5138f = i2;
    }

    /* renamed from: k */
    private WritableMap m6723k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("drawerState", (double) mo6067j());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6723k());
    }

    /* renamed from: c */
    public short mo5874c() {
        return 0;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topDrawerStateChanged";
    }

    /* renamed from: j */
    public int mo6067j() {
        return this.f5138f;
    }
}
