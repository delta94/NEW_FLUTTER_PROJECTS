package com.reactnativecommunity.webview.p129a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p130d.p131a.p132a.C1996b;

/* renamed from: com.reactnativecommunity.webview.a.e */
public final class C1962e extends C1635c<C1962e> {

    /* renamed from: f */
    public static final C1963a f5873f = new C1963a(null);

    /* renamed from: g */
    private final String f5874g;

    /* renamed from: com.reactnativecommunity.webview.a.e$a */
    public static final class C1963a {
        private C1963a() {
        }

        public /* synthetic */ C1963a(C1995a aVar) {
            this();
        }
    }

    public C1962e(int i, String str) {
        C1996b.m7602a((Object) str, "mData");
        super(i);
        this.f5874g = str;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        C1996b.m7602a((Object) rCTEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", this.f5874g);
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
