package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.viewpager.c */
class C1890c extends C1635c<C1890c> {

    /* renamed from: f */
    private final int f5649f;

    protected C1890c(int i, int i2) {
        super(i);
        this.f5649f = i2;
    }

    /* renamed from: j */
    private WritableMap m7193j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f5649f);
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7193j());
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topPageSelected";
    }
}
