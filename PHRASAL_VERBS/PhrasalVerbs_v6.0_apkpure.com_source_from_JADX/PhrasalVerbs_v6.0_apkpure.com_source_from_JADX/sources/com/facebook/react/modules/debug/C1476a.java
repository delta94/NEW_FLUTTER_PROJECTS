package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.C1395d;
import com.facebook.react.uimanager.p122b.C1599a;

/* renamed from: com.facebook.react.modules.debug.a */
public class C1476a implements NotThreadSafeBridgeIdleDebugListener, C1599a {

    /* renamed from: a */
    private final C1395d f4549a = C1395d.m5727a(20);

    /* renamed from: b */
    private final C1395d f4550b = C1395d.m5727a(20);

    /* renamed from: c */
    private final C1395d f4551c = C1395d.m5727a(20);

    /* renamed from: d */
    private final C1395d f4552d = C1395d.m5727a(20);

    /* renamed from: e */
    private volatile boolean f4553e = true;

    /* renamed from: a */
    private static long m5895a(C1395d dVar, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < dVar.mo5178a(); i++) {
            long c = dVar.mo5182c(i);
            if (c >= j && c < j2) {
                j3 = c;
            } else if (c >= j2) {
                break;
            }
        }
        return j3;
    }

    /* renamed from: a */
    private static void m5896a(C1395d dVar, long j) {
        int a = dVar.mo5178a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            if (dVar.mo5182c(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < a - i; i3++) {
                dVar.mo5179a(i3, dVar.mo5182c(i3 + i));
            }
            dVar.mo5181b(i);
        }
    }

    /* renamed from: b */
    private boolean m5897b(long j, long j2) {
        long a = m5895a(this.f4549a, j, j2);
        long a2 = m5895a(this.f4550b, j, j2);
        if (a == -1 && a2 == -1) {
            return this.f4553e;
        }
        return a > a2;
    }

    /* renamed from: b */
    private static boolean m5898b(C1395d dVar, long j, long j2) {
        for (int i = 0; i < dVar.mo5178a(); i++) {
            long c = dVar.mo5182c(i);
            if (c >= j && c < j2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo5358a() {
        this.f4551c.mo5180a(System.nanoTime());
    }

    /* renamed from: a */
    public synchronized boolean mo5359a(long j, long j2) {
        boolean z;
        boolean b = m5898b(this.f4552d, j, j2);
        boolean b2 = m5897b(j, j2);
        z = true;
        if (!b) {
            if (!b2 || m5898b(this.f4551c, j, j2)) {
                z = false;
            }
        }
        m5896a(this.f4549a, j2);
        m5896a(this.f4550b, j2);
        m5896a(this.f4551c, j2);
        m5896a(this.f4552d, j2);
        this.f4553e = b2;
        return z;
    }

    /* renamed from: b */
    public synchronized void mo5360b() {
        this.f4552d.mo5180a(System.nanoTime());
    }

    public synchronized void onBridgeDestroyed() {
    }

    public synchronized void onTransitionToBridgeBusy() {
        this.f4550b.mo5180a(System.nanoTime());
    }

    public synchronized void onTransitionToBridgeIdle() {
        this.f4549a.mo5180a(System.nanoTime());
    }
}
