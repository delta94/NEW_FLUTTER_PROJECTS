package com.facebook.react.views.checkbox;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.checkbox.b */
class C1739b extends C1635c<C1739b> {

    /* renamed from: f */
    private final boolean f5132f;

    public C1739b(int i, boolean z) {
        super(i);
        this.f5132f = z;
    }

    /* renamed from: k */
    private WritableMap m6697k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo5877g());
        createMap.putBoolean("value", mo6052j());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6697k());
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
    public boolean mo6052j() {
        return this.f5132f;
    }
}
