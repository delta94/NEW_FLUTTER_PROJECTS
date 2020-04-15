package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.viewpager.b */
class C1889b extends C1635c<C1889b> {

    /* renamed from: f */
    private final String f5648f;

    protected C1889b(int i, String str) {
        super(i);
        this.f5648f = str;
    }

    /* renamed from: j */
    private WritableMap m7190j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.f5648f);
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7190j());
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topPageScrollStateChanged";
    }
}
