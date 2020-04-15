package com.reactnativecommunity.webview.p129a;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p130d.p131a.p132a.C1996b;

/* renamed from: com.reactnativecommunity.webview.a.c */
public final class C1958c extends C1635c<C1958c> {

    /* renamed from: f */
    public static final C1959a f5869f = new C1959a(null);

    /* renamed from: g */
    private final WritableMap f5870g;

    /* renamed from: com.reactnativecommunity.webview.a.c$a */
    public static final class C1959a {
        private C1959a() {
        }

        public /* synthetic */ C1959a(C1995a aVar) {
            this();
        }
    }

    public C1958c(int i, WritableMap writableMap) {
        C1996b.m7602a((Object) writableMap, "mEventData");
        super(i);
        this.f5870g = writableMap;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        C1996b.m7602a((Object) rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), this.f5870g);
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
        return "topLoadingProgress";
    }
}
