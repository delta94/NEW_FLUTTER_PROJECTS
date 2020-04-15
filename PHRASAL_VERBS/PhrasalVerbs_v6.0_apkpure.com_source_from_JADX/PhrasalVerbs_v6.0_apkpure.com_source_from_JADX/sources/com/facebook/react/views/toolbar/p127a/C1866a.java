package com.facebook.react.views.toolbar.p127a;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.toolbar.a.a */
public class C1866a extends C1635c<C1866a> {

    /* renamed from: f */
    private final int f5558f;

    public C1866a(int i, int i2) {
        super(i);
        this.f5558f = i2;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("position", mo6625j());
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), writableNativeMap);
    }

    /* renamed from: a */
    public boolean mo5872a() {
        return false;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topSelect";
    }

    /* renamed from: j */
    public int mo6625j() {
        return this.f5558f;
    }
}
