package com.facebook.react.views.picker.p126a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.picker.a.a */
public class C1771a extends C1635c<C1771a> {

    /* renamed from: f */
    private final int f5213f;

    public C1771a(int i, int i2) {
        super(i);
        this.f5213f = i2;
    }

    /* renamed from: j */
    private WritableMap m6787j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f5213f);
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6787j());
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topSelect";
    }
}
