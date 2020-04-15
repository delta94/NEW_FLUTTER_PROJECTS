package com.facebook.react.uimanager.events;

import android.support.p029v4.util.C0336m;
import android.view.MotionEvent;
import com.facebook.react.bridge.SoftAssertions;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.events.k */
public class C1645k extends C1635c<C1645k> {

    /* renamed from: f */
    private static final C0336m<C1645k> f4915f = new C0336m<>(3);

    /* renamed from: g */
    private MotionEvent f4916g;

    /* renamed from: h */
    private C1648n f4917h;

    /* renamed from: i */
    private short f4918i;

    /* renamed from: j */
    private float f4919j;

    /* renamed from: k */
    private float f4920k;

    private C1645k() {
    }

    /* renamed from: a */
    public static C1645k m6446a(int i, C1648n nVar, MotionEvent motionEvent, long j, float f, float f2, C1646l lVar) {
        C1645k kVar = (C1645k) f4915f.mo1311a();
        if (kVar == null) {
            kVar = new C1645k();
        }
        kVar.m6447b(i, nVar, motionEvent, j, f, f2, lVar);
        return kVar;
    }

    /* renamed from: b */
    private void m6447b(int i, C1648n nVar, MotionEvent motionEvent, long j, float f, float f2, C1646l lVar) {
        super.mo5871a(i);
        short s = 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    s = lVar.mo5900b(j);
                } else if (action != 3) {
                    if (action == 5 || action == 6) {
                        lVar.mo5902d(j);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unhandled MotionEvent action: ");
                        sb.append(action);
                        throw new RuntimeException(sb.toString());
                    }
                }
            }
            lVar.mo5903e(j);
        } else {
            lVar.mo5899a(j);
        }
        this.f4917h = nVar;
        this.f4916g = MotionEvent.obtain(motionEvent);
        this.f4918i = s;
        this.f4919j = f;
        this.f4920k = f2;
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        C1648n nVar = this.f4917h;
        C1136a.m5053a(nVar);
        C1649o.m6463a(rCTEventEmitter, nVar, mo5877g(), this);
    }

    /* renamed from: a */
    public boolean mo5872a() {
        int[] iArr = C1644j.f4914a;
        C1648n nVar = this.f4917h;
        C1136a.m5053a(nVar);
        int i = iArr[nVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown touch event type: ");
        sb.append(this.f4917h);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: c */
    public short mo5874c() {
        return this.f4918i;
    }

    /* renamed from: d */
    public String mo5869d() {
        C1648n nVar = this.f4917h;
        C1136a.m5053a(nVar);
        return C1648n.m6461a(nVar);
    }

    /* renamed from: i */
    public void mo5879i() {
        MotionEvent motionEvent = this.f4916g;
        C1136a.m5053a(motionEvent);
        motionEvent.recycle();
        this.f4916g = null;
        f4915f.mo1312a(this);
    }

    /* renamed from: j */
    public MotionEvent mo5896j() {
        C1136a.m5053a(this.f4916g);
        return this.f4916g;
    }

    /* renamed from: k */
    public float mo5897k() {
        return this.f4919j;
    }

    /* renamed from: l */
    public float mo5898l() {
        return this.f4920k;
    }
}
