package com.facebook.react.views.scroll;

import android.support.p029v4.util.C0336m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.views.scroll.j */
public class C1789j extends C1635c<C1789j> {

    /* renamed from: f */
    private static final C0336m<C1789j> f5296f = new C0336m<>(3);

    /* renamed from: g */
    private int f5297g;

    /* renamed from: h */
    private int f5298h;

    /* renamed from: i */
    private double f5299i;

    /* renamed from: j */
    private double f5300j;

    /* renamed from: k */
    private int f5301k;

    /* renamed from: l */
    private int f5302l;

    /* renamed from: m */
    private int f5303m;

    /* renamed from: n */
    private int f5304n;

    /* renamed from: o */
    private C1791l f5305o;

    private C1789j() {
    }

    /* renamed from: a */
    public static C1789j m6857a(int i, C1791l lVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        C1789j jVar = (C1789j) f5296f.mo1311a();
        if (jVar == null) {
            jVar = new C1789j();
        }
        jVar.m6858b(i, lVar, i2, i3, f, f2, i4, i5, i6, i7);
        return jVar;
    }

    /* renamed from: b */
    private void m6858b(int i, C1791l lVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        super.mo5871a(i);
        this.f5305o = lVar;
        this.f5297g = i2;
        this.f5298h = i3;
        this.f5299i = (double) f;
        this.f5300j = (double) f2;
        this.f5301k = i4;
        this.f5302l = i5;
        this.f5303m = i6;
        this.f5304n = i7;
    }

    /* renamed from: j */
    private WritableMap m6859j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        String str = "x";
        createMap2.putDouble(str, (double) C1726w.m6666a((float) this.f5297g));
        String str2 = "y";
        createMap2.putDouble(str2, (double) C1726w.m6666a((float) this.f5298h));
        WritableMap createMap3 = Arguments.createMap();
        String str3 = "width";
        createMap3.putDouble(str3, (double) C1726w.m6666a((float) this.f5301k));
        String str4 = "height";
        createMap3.putDouble(str4, (double) C1726w.m6666a((float) this.f5302l));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble(str3, (double) C1726w.m6666a((float) this.f5303m));
        createMap4.putDouble(str4, (double) C1726w.m6666a((float) this.f5304n));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble(str, this.f5299i);
        createMap5.putDouble(str2, this.f5300j);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", mo5877g());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), m6859j());
    }

    /* renamed from: a */
    public boolean mo5872a() {
        return this.f5305o == C1791l.SCROLL;
    }

    /* renamed from: c */
    public short mo5874c() {
        return 0;
    }

    /* renamed from: d */
    public String mo5869d() {
        C1791l lVar = this.f5305o;
        C1136a.m5053a(lVar);
        return C1791l.m6865a(lVar);
    }

    /* renamed from: i */
    public void mo5879i() {
        f5296f.mo1312a(this);
    }
}
