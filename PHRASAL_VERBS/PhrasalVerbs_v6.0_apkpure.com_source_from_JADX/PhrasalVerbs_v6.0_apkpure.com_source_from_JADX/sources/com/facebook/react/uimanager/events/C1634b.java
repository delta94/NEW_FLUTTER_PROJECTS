package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1726w;

/* renamed from: com.facebook.react.uimanager.events.b */
public class C1634b extends C1635c<C1634b> {

    /* renamed from: f */
    private final int f4884f;

    /* renamed from: g */
    private final int f4885g;

    public C1634b(int i, int i2, int i3) {
        super(i);
        this.f4884f = i2;
        this.f4885g = i3;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", (double) C1726w.m6666a((float) this.f4884f));
        createMap.putDouble("height", (double) C1726w.m6666a((float) this.f4885g));
        rCTEventEmitter.receiveEvent(mo5877g(), "topContentSizeChange", createMap);
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topContentSizeChange";
    }
}
