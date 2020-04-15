package com.swmansion.gesturehandler.react;

import android.support.p029v4.util.C0336m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p032c.p115b.p116a.C1242c;

/* renamed from: com.swmansion.gesturehandler.react.l */
public class C1992l extends C1635c<C1992l> {

    /* renamed from: f */
    private static final C0336m<C1992l> f5910f = new C0336m<>(7);

    /* renamed from: g */
    private WritableMap f5911g;

    private C1992l() {
    }

    /* renamed from: a */
    public static C1992l m7590a(C1242c cVar, int i, int i2, C1982c cVar2) {
        C1992l lVar = (C1992l) f5910f.mo1311a();
        if (lVar == null) {
            lVar = new C1992l();
        }
        lVar.m7591b(cVar, i, i2, cVar2);
        return lVar;
    }

    /* renamed from: b */
    private void m7591b(C1242c cVar, int i, int i2, C1982c cVar2) {
        super.mo5871a(cVar.mo4642m().getId());
        this.f5911g = Arguments.createMap();
        if (cVar2 != null) {
            cVar2.mo7002a(cVar, this.f5911g);
        }
        this.f5911g.putInt("handlerTag", cVar.mo4641l());
        this.f5911g.putInt("state", i);
        this.f5911g.putInt("oldState", i2);
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), "onGestureHandlerStateChange", this.f5911g);
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
        return "onGestureHandlerStateChange";
    }

    /* renamed from: i */
    public void mo5879i() {
        this.f5911g = null;
        f5910f.mo1312a(this);
    }
}
