package com.facebook.react.views.webview.p128a;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.webview.a.b */
public class C1900b extends C1635c<C1900b> {

    /* renamed from: f */
    private WritableMap f5669f;

    public C1900b(int i, WritableMap writableMap) {
        super(i);
        this.f5669f = writableMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), this.f5669f);
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
        return "topLoadingFinish";
    }
}
