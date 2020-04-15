package com.swmansion.gesturehandler.react;

import android.support.p029v4.util.C0336m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p032c.p115b.p116a.C1242c;

/* renamed from: com.swmansion.gesturehandler.react.b */
public class C1981b extends C1635c<C1981b> {

    /* renamed from: f */
    private static final C0336m<C1981b> f5891f = new C0336m<>(7);

    /* renamed from: g */
    private WritableMap f5892g;

    private C1981b() {
    }

    /* renamed from: a */
    public static C1981b m7547a(C1242c cVar, C1982c cVar2) {
        C1981b bVar = (C1981b) f5891f.mo1311a();
        if (bVar == null) {
            bVar = new C1981b();
        }
        bVar.m7548b(cVar, cVar2);
        return bVar;
    }

    /* renamed from: b */
    private void m7548b(C1242c cVar, C1982c cVar2) {
        super.mo5871a(cVar.mo4642m().getId());
        this.f5892g = Arguments.createMap();
        if (cVar2 != null) {
            cVar2.mo7002a(cVar, this.f5892g);
        }
        this.f5892g.putInt("handlerTag", cVar.mo4641l());
        this.f5892g.putInt("state", cVar.mo4640k());
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), "onGestureHandlerEvent", this.f5892g);
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
        return "onGestureHandlerEvent";
    }

    /* renamed from: i */
    public void mo5879i() {
        this.f5892g = null;
        f5891f.mo1312a(this);
    }
}
