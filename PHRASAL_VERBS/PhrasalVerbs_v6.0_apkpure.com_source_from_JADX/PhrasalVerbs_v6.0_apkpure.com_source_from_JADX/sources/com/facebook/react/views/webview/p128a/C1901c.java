package com.facebook.react.views.webview.p128a;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.webview.a.c */
public class C1901c extends C1635c<C1901c> {

    /* renamed from: f */
    private WritableMap f5670f;

    public C1901c(int i, WritableMap writableMap) {
        super(i);
        this.f5670f = writableMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), this.f5670f);
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
        return "topLoadingStart";
    }
}
