package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.switchview.b */
class C1803b extends C1635c<C1803b> {

    /* renamed from: f */
    private final boolean f5343f;

    public C1803b(int i, boolean z) {
        super(i);
        this.f5343f = z;
    }

    /* renamed from: k */
    private WritableMap m6898k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", mo5877g());
        createMap.putBoolean("value", mo6346j());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6898k());
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
    public boolean mo6346j() {
        return this.f5343f;
    }
}
