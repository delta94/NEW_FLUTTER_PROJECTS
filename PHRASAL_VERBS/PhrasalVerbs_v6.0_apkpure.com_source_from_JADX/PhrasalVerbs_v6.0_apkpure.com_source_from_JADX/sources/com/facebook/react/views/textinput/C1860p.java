package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.p */
class C1860p extends C1635c<C1860p> {

    /* renamed from: f */
    private int f5549f;

    /* renamed from: g */
    private int f5550g;

    public C1860p(int i, int i2, int i3) {
        super(i);
        this.f5549f = i2;
        this.f5550g = i3;
    }

    /* renamed from: j */
    private WritableMap m7084j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f5550g);
        createMap2.putInt("start", this.f5549f);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7084j());
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topSelectionChange";
    }
}
