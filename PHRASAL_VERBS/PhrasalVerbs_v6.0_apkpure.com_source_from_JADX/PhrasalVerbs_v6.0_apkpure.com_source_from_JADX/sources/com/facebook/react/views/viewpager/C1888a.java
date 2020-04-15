package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.viewpager.a */
class C1888a extends C1635c<C1888a> {

    /* renamed from: f */
    private final int f5646f;

    /* renamed from: g */
    private final float f5647g;

    protected C1888a(int i, int i2, float f) {
        super(i);
        this.f5646f = i2;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        this.f5647g = f;
    }

    /* renamed from: j */
    private WritableMap m7187j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f5646f);
        createMap.putDouble("offset", (double) this.f5647g);
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7187j());
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topPageScroll";
    }
}
