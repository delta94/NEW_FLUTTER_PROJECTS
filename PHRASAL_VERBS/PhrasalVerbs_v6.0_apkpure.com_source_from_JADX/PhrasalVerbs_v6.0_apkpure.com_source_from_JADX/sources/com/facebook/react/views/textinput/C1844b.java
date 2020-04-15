package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.b */
public class C1844b extends C1635c<C1850f> {

    /* renamed from: f */
    private float f5495f;

    /* renamed from: g */
    private float f5496g;

    public C1844b(int i, float f, float f2) {
        super(i);
        this.f5495f = f;
        this.f5496g = f2;
    }

    /* renamed from: j */
    private WritableMap m7032j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", (double) this.f5495f);
        createMap2.putDouble("height", (double) this.f5496g);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", mo5877g());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7032j());
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topContentSizeChange";
    }
}
