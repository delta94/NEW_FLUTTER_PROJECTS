package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.f */
public class C1850f extends C1635c<C1850f> {

    /* renamed from: f */
    private String f5526f;

    /* renamed from: g */
    private int f5527g;

    public C1850f(int i, String str, int i2) {
        super(i);
        this.f5526f = str;
        this.f5527g = i2;
    }

    /* renamed from: j */
    private WritableMap m7060j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f5526f);
        createMap.putInt("eventCount", this.f5527g);
        createMap.putInt("target", mo5877g());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7060j());
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topChange";
    }
}
