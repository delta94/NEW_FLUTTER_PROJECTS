package com.facebook.react.uimanager;

import android.os.SystemClock;
import com.facebook.react.uimanager.C1655ha.C1676u;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.react.uimanager.fa */
class C1651fa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f4928a;

    /* renamed from: b */
    final /* synthetic */ ArrayDeque f4929b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f4930c;

    /* renamed from: d */
    final /* synthetic */ long f4931d;

    /* renamed from: e */
    final /* synthetic */ long f4932e;

    /* renamed from: f */
    final /* synthetic */ long f4933f;

    /* renamed from: g */
    final /* synthetic */ long f4934g;

    /* renamed from: h */
    final /* synthetic */ C1655ha f4935h;

    C1651fa(C1655ha haVar, int i, ArrayDeque arrayDeque, ArrayList arrayList, long j, long j2, long j3, long j4) {
        this.f4935h = haVar;
        this.f4928a = i;
        this.f4929b = arrayDeque;
        this.f4930c = arrayList;
        this.f4931d = j;
        this.f4932e = j2;
        this.f4933f = j3;
        this.f4934g = j4;
    }

    public void run() {
        C1941a a = C1940c.m7352a(0, "DispatchUI");
        a.mo6821a("BatchId", this.f4928a);
        a.mo6823a();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.f4929b != null) {
                Iterator it = this.f4929b.iterator();
                while (it.hasNext()) {
                    ((C1676u) it.next()).execute();
                }
            }
            if (this.f4930c != null) {
                Iterator it2 = this.f4930c.iterator();
                while (it2.hasNext()) {
                    ((C1676u) it2.next()).execute();
                }
            }
            if (this.f4935h.f4955n && this.f4935h.f4957p == 0) {
                this.f4935h.f4957p = this.f4931d;
                this.f4935h.f4958q = this.f4932e;
                this.f4935h.f4959r = this.f4933f;
                this.f4935h.f4960s = uptimeMillis;
                this.f4935h.f4963v = this.f4934g;
                C1937a.m7341a(0, "delayBeforeDispatchViewUpdates", 0, this.f4935h.f4957p * 1000000);
                C1937a.m7345b(0, "delayBeforeDispatchViewUpdates", 0, this.f4935h.f4959r * 1000000);
                C1937a.m7341a(0, "delayBeforeBatchRunStart", 0, this.f4935h.f4959r * 1000000);
                C1937a.m7345b(0, "delayBeforeBatchRunStart", 0, this.f4935h.f4960s * 1000000);
            }
            this.f4935h.f4943b.mo6004b();
            if (this.f4935h.f4952k != null) {
                this.f4935h.f4952k.mo5360b();
            }
            C1937a.m7338a(0);
        } catch (Exception e) {
            this.f4935h.f4954m = true;
            throw e;
        } catch (Throwable th) {
            C1937a.m7338a(0);
            throw th;
        }
    }
}
