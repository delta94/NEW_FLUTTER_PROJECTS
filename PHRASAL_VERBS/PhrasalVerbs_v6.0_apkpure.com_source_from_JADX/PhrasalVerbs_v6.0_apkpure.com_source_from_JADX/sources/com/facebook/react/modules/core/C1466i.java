package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C1458b.C1459a;
import java.util.ArrayDeque;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.modules.core.i */
public class C1466i {

    /* renamed from: a */
    private static C1466i f4522a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile C1458b f4523b;

    /* renamed from: c */
    private final C1468b f4524c = new C1468b(this, null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayDeque<C1459a>[] f4525d = new ArrayDeque[C1467a.values().length];
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f4526e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f4527f = false;

    /* renamed from: com.facebook.react.modules.core.i$a */
    public enum C1467a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        

        /* renamed from: g */
        private final int f4534g;

        private C1467a(int i) {
            this.f4534g = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5346a() {
            return this.f4534g;
        }
    }

    /* renamed from: com.facebook.react.modules.core.i$b */
    private class C1468b extends C1459a {
        private C1468b() {
        }

        /* synthetic */ C1468b(C1466i iVar, C1464g gVar) {
            this();
        }

        /* renamed from: a */
        public void mo5332a(long j) {
            synchronized (C1466i.this) {
                C1466i.this.f4527f = false;
                for (int i = 0; i < C1466i.this.f4525d.length; i++) {
                    int size = C1466i.this.f4525d[i].size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C1459a) C1466i.this.f4525d[i].removeFirst()).mo5332a(j);
                        C1466i.this.f4526e = C1466i.this.f4526e - 1;
                    }
                }
                C1466i.this.m5882d();
            }
        }
    }

    private C1466i() {
        int i = 0;
        while (true) {
            ArrayDeque<C1459a>[] arrayDequeArr = this.f4525d;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            } else {
                mo5343a((Runnable) null);
                return;
            }
        }
    }

    /* renamed from: a */
    public static C1466i m5877a() {
        C1136a.m5054a(f4522a, "ReactChoreographer needs to be initialized.");
        return f4522a;
    }

    /* renamed from: b */
    public static void m5879b() {
        if (f4522a == null) {
            f4522a = new C1466i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5882d() {
        C1136a.m5055a(this.f4526e >= 0);
        if (this.f4526e == 0 && this.f4527f) {
            if (this.f4523b != null) {
                this.f4523b.mo5335b((C1459a) this.f4524c);
            }
            this.f4527f = false;
        }
    }

    /* renamed from: a */
    public synchronized void mo5342a(C1467a aVar, C1459a aVar2) {
        this.f4525d[aVar.mo5346a()].addLast(aVar2);
        boolean z = true;
        this.f4526e++;
        if (this.f4526e <= 0) {
            z = false;
        }
        C1136a.m5055a(z);
        if (!this.f4527f) {
            if (this.f4523b == null) {
                mo5343a((Runnable) new C1464g(this));
            } else {
                mo5345c();
            }
        }
    }

    /* renamed from: a */
    public void mo5343a(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new C1465h(this, runnable));
    }

    /* renamed from: b */
    public synchronized void mo5344b(C1467a aVar, C1459a aVar2) {
        if (this.f4525d[aVar.mo5346a()].removeFirstOccurrence(aVar2)) {
            this.f4526e--;
            m5882d();
        } else {
            C0727a.m3275b("ReactNative", "Tried to remove non-existent frame callback");
        }
    }

    /* renamed from: c */
    public void mo5345c() {
        this.f4523b.mo5334a((C1459a) this.f4524c);
        this.f4527f = true;
    }
}
