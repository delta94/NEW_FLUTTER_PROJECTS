package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.i */
public class C1853i extends C1635c<C1853i> {

    /* renamed from: f */
    private String f5529f;

    /* renamed from: g */
    private String f5530g;

    /* renamed from: h */
    private int f5531h;

    /* renamed from: i */
    private int f5532i;

    public C1853i(int i, String str, String str2, int i2, int i3) {
        super(i);
        this.f5529f = str;
        this.f5530g = str2;
        this.f5531h = i2;
        this.f5532i = i3;
    }

    /* renamed from: j */
    private WritableMap m7071j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("start", (double) this.f5531h);
        createMap2.putDouble("end", (double) this.f5532i);
        createMap.putString("text", this.f5529f);
        createMap.putString("previousText", this.f5530g);
        createMap.putMap("range", createMap2);
        createMap.putInt("target", mo5877g());
        return createMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m7071j());
    }

    /* renamed from: a */
    public boolean mo5872a() {
        return false;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topTextInput";
    }
}
