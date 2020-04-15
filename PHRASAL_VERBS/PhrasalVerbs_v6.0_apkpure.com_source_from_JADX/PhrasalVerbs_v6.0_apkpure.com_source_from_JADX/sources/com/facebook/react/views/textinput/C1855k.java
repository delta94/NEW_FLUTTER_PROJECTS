package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.k */
public class C1855k extends C1635c<C1853i> {

    /* renamed from: f */
    private String f5533f;

    C1855k(int i, String str) {
        super(i);
        this.f5533f = str;
    }

    /* renamed from: j */
    private WritableMap m7079j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", this.f5533f);
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7079j());
    }

    /* renamed from: a */
    public boolean mo5872a() {
        return false;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topKeyPress";
    }
}
