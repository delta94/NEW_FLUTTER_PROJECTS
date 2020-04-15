package com.facebook.react.views.webview.p128a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.webview.a.d */
public class C1902d extends C1635c<C1902d> {

    /* renamed from: f */
    private final String f5671f;

    public C1902d(int i, String str) {
        super(i);
        this.f5671f = str;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", this.f5671f);
        rCTEventEmitter.receiveEvent(mo5877g(), "topMessage", createMap);
    }

    /* renamed from: a */
    public boolean mo5872a() {
        return false;
    }

    /* renamed from: c */
    public short mo5874c() {
        return 0;
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topMessage";
    }
}
