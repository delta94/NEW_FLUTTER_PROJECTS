package com.reactnativecommunity.webview.p129a;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p130d.p131a.p132a.C1996b;

/* renamed from: com.reactnativecommunity.webview.a.a */
public final class C1954a extends C1635c<C1954a> {

    /* renamed from: f */
    public static final C1955a f5865f = new C1955a(null);

    /* renamed from: g */
    private final WritableMap f5866g;

    /* renamed from: com.reactnativecommunity.webview.a.a$a */
    public static final class C1955a {
        private C1955a() {
        }

        public /* synthetic */ C1955a(C1995a aVar) {
            this();
        }
    }

    public C1954a(int i, WritableMap writableMap) {
        C1996b.m7602a((Object) writableMap, "mEventData");
        super(i);
        this.f5866g = writableMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        C1996b.m7602a((Object) rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), this.f5866g);
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
        return "topLoadingError";
    }
}
