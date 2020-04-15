package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.slider.d */
public class C1797d extends C1635c<C1797d> {

    /* renamed from: f */
    private final double f5327f;

    public C1797d(int i, double d) {
        super(i);
        this.f5327f = d;
    }

    /* renamed from: k */
    private WritableMap m6880k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo5877g());
        createMap.putDouble("value", mo6321j());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6880k());
    }

    /* renamed from: a */
    public boolean mo5872a() {
        return false;
    }

    /* renamed from: c */
    public short mo5874c() {
        return 0;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topSlidingComplete";
    }

    /* renamed from: j */
    public double mo6321j() {
        return this.f5327f;
    }
}
