package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.r */
class C1862r extends C1635c<C1862r> {

    /* renamed from: f */
    private String f5556f;

    public C1862r(int i, String str) {
        super(i);
        this.f5556f = str;
    }

    /* renamed from: j */
    private WritableMap m7096j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo5877g());
        createMap.putString("text", this.f5556f);
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7096j());
    }

    /* renamed from: a */
    public boolean mo5872a() {
        return false;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topSubmitEditing";
    }
}
