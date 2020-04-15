package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.events.C1645k;
import com.facebook.react.uimanager.events.C1646l;
import com.facebook.react.uimanager.events.C1648n;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.l */
public class C1687l {

    /* renamed from: a */
    private int f5034a = -1;

    /* renamed from: b */
    private final float[] f5035b = new float[2];

    /* renamed from: c */
    private boolean f5036c = false;

    /* renamed from: d */
    private long f5037d = Long.MIN_VALUE;

    /* renamed from: e */
    private final ViewGroup f5038e;

    /* renamed from: f */
    private final C1646l f5039f = new C1646l();

    public C1687l(ViewGroup viewGroup) {
        this.f5038e = viewGroup;
    }

    /* renamed from: a */
    private int m6536a(MotionEvent motionEvent) {
        return C1579O.m6264a(motionEvent.getX(), motionEvent.getY(), this.f5038e, this.f5035b, (int[]) null);
    }

    /* renamed from: c */
    private void m6537c(MotionEvent motionEvent, C1638f fVar) {
        if (this.f5034a == -1) {
            C0727a.m3284d("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        C1136a.m5056a(!this.f5036c, "Expected to not have already sent a cancel for this gesture");
        C1136a.m5053a(fVar);
        C1638f fVar2 = fVar;
        int i = this.f5034a;
        C1648n nVar = C1648n.CANCEL;
        long j = this.f5037d;
        float[] fArr = this.f5035b;
        fVar2.mo5886a((C1635c) C1645k.m6446a(i, nVar, motionEvent, j, fArr[0], fArr[1], this.f5039f));
    }

    /* renamed from: a */
    public void mo5946a(MotionEvent motionEvent, C1638f fVar) {
        C1648n nVar;
        long j;
        float f;
        float f2;
        C1645k a;
        C1638f fVar2 = fVar;
        int action = motionEvent.getAction() & 255;
        String str = "ReactNative";
        if (action == 0) {
            if (this.f5034a != -1) {
                C0727a.m3275b(str, "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f5036c = false;
            this.f5037d = motionEvent.getEventTime();
            this.f5034a = m6536a(motionEvent);
            int i = this.f5034a;
            C1648n nVar2 = C1648n.START;
            long j2 = this.f5037d;
            float[] fArr = this.f5035b;
            a = C1645k.m6446a(i, nVar2, motionEvent, j2, fArr[0], fArr[1], this.f5039f);
        } else if (!this.f5036c) {
            int i2 = this.f5034a;
            if (i2 == -1) {
                C0727a.m3275b(str, "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else {
                if (action == 1) {
                    m6536a(motionEvent);
                    int i3 = this.f5034a;
                    C1648n nVar3 = C1648n.END;
                    long j3 = this.f5037d;
                    float[] fArr2 = this.f5035b;
                    fVar2.mo5886a((C1635c) C1645k.m6446a(i3, nVar3, motionEvent, j3, fArr2[0], fArr2[1], this.f5039f));
                } else if (action == 2) {
                    m6536a(motionEvent);
                    int i4 = this.f5034a;
                    C1648n nVar4 = C1648n.MOVE;
                    long j4 = this.f5037d;
                    float[] fArr3 = this.f5035b;
                    a = C1645k.m6446a(i4, nVar4, motionEvent, j4, fArr3[0], fArr3[1], this.f5039f);
                } else {
                    if (action == 5) {
                        nVar = C1648n.START;
                        j = this.f5037d;
                        float[] fArr4 = this.f5035b;
                        f = fArr4[0];
                        f2 = fArr4[1];
                    } else if (action == 6) {
                        nVar = C1648n.END;
                        j = this.f5037d;
                        float[] fArr5 = this.f5035b;
                        f = fArr5[0];
                        f2 = fArr5[1];
                    } else if (action != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Warning : touch event was ignored. Action=");
                        sb.append(action);
                        sb.append(" Target=");
                        sb.append(this.f5034a);
                        C0727a.m3284d(str, sb.toString());
                    } else if (this.f5039f.mo5901c(motionEvent.getDownTime())) {
                        m6537c(motionEvent, fVar);
                    } else {
                        C0727a.m3275b(str, "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                    }
                    a = C1645k.m6446a(i2, nVar, motionEvent, j, f, f2, this.f5039f);
                }
                this.f5034a = -1;
                this.f5037d = Long.MIN_VALUE;
            }
        } else {
            return;
        }
        fVar2.mo5886a((C1635c) a);
    }

    /* renamed from: b */
    public void mo5947b(MotionEvent motionEvent, C1638f fVar) {
        if (!this.f5036c) {
            m6537c(motionEvent, fVar);
            this.f5036c = true;
            this.f5034a = -1;
        }
    }
}
