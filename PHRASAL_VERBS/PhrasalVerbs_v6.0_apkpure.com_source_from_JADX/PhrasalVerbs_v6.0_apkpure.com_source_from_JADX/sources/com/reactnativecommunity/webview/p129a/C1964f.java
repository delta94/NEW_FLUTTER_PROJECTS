package com.reactnativecommunity.webview.p129a;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p130d.p131a.p132a.C1996b;

/* renamed from: com.reactnativecommunity.webview.a.f */
public final class C1964f extends C1635c<C1964f> {

    /* renamed from: f */
    public static final C1965a f5875f = new C1965a(null);

    /* renamed from: g */
    private final WritableMap f5876g;

    /* renamed from: com.reactnativecommunity.webview.a.f$a */
    public static final class C1965a {
        private C1965a() {
        }

        public /* synthetic */ C1965a(C1995a aVar) {
            this();
        }
    }

    public C1964f(int i, WritableMap writableMap) {
        C1996b.m7602a((Object) writableMap, "mData");
        super(i);
        this.f5876g = writableMap;
        this.f5876g.putString("navigationType", "other");
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        C1996b.m7602a((Object) rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo5877g(), "topShouldStartLoadWithRequest", this.f5876g);
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
        return "topShouldStartLoadWithRequest";
    }
}
