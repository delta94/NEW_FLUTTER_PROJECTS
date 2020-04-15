package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.slider.b */
public class C1795b extends C1635c<C1795b> {

    /* renamed from: f */
    private final double f5325f;

    /* renamed from: g */
    private final boolean f5326g;

    public C1795b(int i, double d, boolean z) {
        super(i);
        this.f5325f = d;
        this.f5326g = z;
    }

    /* renamed from: l */
    private WritableMap m6874l() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo5877g());
        createMap.putDouble("value", mo6316j());
        createMap.putBoolean("fromUser", mo6317k());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6874l());
    }

    /* renamed from: c */
    public short mo5874c() {
        return 0;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topChange";
    }

    /* renamed from: j */
    public double mo6316j() {
        return this.f5325f;
    }

    /* renamed from: k */
    public boolean mo6317k() {
        return this.f5326g;
    }
}
