package com.facebook.react.views.drawer.p125a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.drawer.a.c */
public class C1745c extends C1635c<C1745c> {

    /* renamed from: f */
    private final float f5137f;

    public C1745c(int i, float f) {
        super(i);
        this.f5137f = f;
    }

    /* renamed from: k */
    private WritableMap m6718k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("offset", (double) mo6066j());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6718k());
    }

    /* renamed from: c */
    public short mo5874c() {
        return 0;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topDrawerSlide";
    }

    /* renamed from: j */
    public float mo6066j() {
        return this.f5137f;
    }
}
