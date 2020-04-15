package com.facebook.react.uimanager;

import android.support.p029v4.util.C0336m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.uimanager.v */
public class C1725v extends C1635c<C1725v> {

    /* renamed from: f */
    private static final C0336m<C1725v> f5103f = new C0336m<>(20);

    /* renamed from: g */
    private int f5104g;

    /* renamed from: h */
    private int f5105h;

    /* renamed from: i */
    private int f5106i;

    /* renamed from: j */
    private int f5107j;

    private C1725v() {
    }

    /* renamed from: b */
    public static C1725v m6660b(int i, int i2, int i3, int i4, int i5) {
        C1725v vVar = (C1725v) f5103f.mo1311a();
        if (vVar == null) {
            vVar = new C1725v();
        }
        vVar.mo6017a(i, i2, i3, i4, i5);
        return vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6017a(int i, int i2, int i3, int i4, int i5) {
        super.mo5871a(i);
        this.f5104g = i2;
        this.f5105h = i3;
        this.f5106i = i4;
        this.f5107j = i5;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", (double) C1726w.m6666a((float) this.f5104g));
        createMap.putDouble("y", (double) C1726w.m6666a((float) this.f5105h));
        createMap.putDouble("width", (double) C1726w.m6666a((float) this.f5106i));
        createMap.putDouble("height", (double) C1726w.m6666a((float) this.f5107j));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", mo5877g());
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), createMap2);
    }

    /* renamed from: d */
    public String mo5869d() {
        return "topLayout";
    }

    /* renamed from: i */
    public void mo5879i() {
        f5103f.mo1312a(this);
    }
}
