package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1397f;
import com.facebook.react.modules.core.C1458b.C1459a;
import com.facebook.react.modules.core.C1466i;
import com.facebook.react.modules.core.C1466i.C1467a;
import com.facebook.systrace.C1937a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.events.f */
public class C1638f implements LifecycleEventListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Comparator<C1635c> f4892a = new C1636d();

    /* renamed from: b */
    private final Object f4893b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f4894c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ReactApplicationContext f4895d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final LongSparseArray<Integer> f4896e = new LongSparseArray<>();

    /* renamed from: f */
    private final Map<String, Short> f4897f = C1397f.m5742b();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1639a f4898g = new C1639a(this, null);

    /* renamed from: h */
    private final ArrayList<C1635c> f4899h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<C1642h> f4900i = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final List<C1633a> f4901j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1640b f4902k = new C1640b(this, null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final AtomicInteger f4903l = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1635c[] f4904m = new C1635c[16];
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f4905n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile ReactEventEmitter f4906o;

    /* renamed from: p */
    private short f4907p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public volatile boolean f4908q = false;

    /* renamed from: com.facebook.react.uimanager.events.f$a */
    private class C1639a implements Runnable {
        private C1639a() {
        }

        /* synthetic */ C1639a(C1638f fVar, C1636d dVar) {
            this();
        }

        public void run() {
            C1937a.m7339a(0, "DispatchEventsRunnable");
            try {
                C1937a.m7344b(0, "ScheduleDispatchFrameCallback", C1638f.this.f4903l.getAndIncrement());
                C1638f.this.f4908q = false;
                C1136a.m5053a(C1638f.this.f4906o);
                synchronized (C1638f.this.f4894c) {
                    if (C1638f.this.f4905n > 0) {
                        if (C1638f.this.f4905n > 1) {
                            Arrays.sort(C1638f.this.f4904m, 0, C1638f.this.f4905n, C1638f.f4892a);
                        }
                        for (int i = 0; i < C1638f.this.f4905n; i++) {
                            C1635c cVar = C1638f.this.f4904m[i];
                            if (cVar != null) {
                                C1937a.m7344b(0, cVar.mo5869d(), cVar.mo5876f());
                                cVar.mo5868a((RCTEventEmitter) C1638f.this.f4906o);
                                cVar.mo5873b();
                            }
                        }
                        C1638f.this.m6416d();
                        C1638f.this.f4896e.clear();
                    }
                }
                for (C1633a a : C1638f.this.f4901j) {
                    a.mo5249a();
                }
                C1937a.m7338a(0);
            } catch (Throwable th) {
                C1937a.m7338a(0);
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.events.f$b */
    private class C1640b extends C1459a {

        /* renamed from: b */
        private volatile boolean f4910b;

        /* renamed from: c */
        private boolean f4911c;

        private C1640b() {
            this.f4910b = false;
            this.f4911c = false;
        }

        /* synthetic */ C1640b(C1638f fVar, C1636d dVar) {
            this();
        }

        /* renamed from: e */
        private void m6439e() {
            C1466i.m5877a().mo5342a(C1467a.TIMERS_EVENTS, (C1459a) C1638f.this.f4902k);
        }

        /* renamed from: a */
        public void mo5332a(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.f4911c) {
                this.f4910b = false;
            } else {
                m6439e();
            }
            String str = "ScheduleDispatchFrameCallback";
            C1937a.m7339a(0, str);
            try {
                C1638f.this.m6421f();
                if (!C1638f.this.f4908q) {
                    C1638f.this.f4908q = true;
                    C1937a.m7349d(0, str, C1638f.this.f4903l.get());
                    C1638f.this.f4895d.runOnJSQueueThread(C1638f.this.f4898g);
                }
            } finally {
                C1937a.m7338a(0);
            }
        }

        /* renamed from: b */
        public void mo5892b() {
            if (!this.f4910b) {
                this.f4910b = true;
                m6439e();
            }
        }

        /* renamed from: c */
        public void mo5893c() {
            if (!this.f4910b) {
                if (C1638f.this.f4895d.isOnUiQueueThread()) {
                    mo5892b();
                } else {
                    C1638f.this.f4895d.runOnUiQueueThread(new C1641g(this));
                }
            }
        }

        /* renamed from: d */
        public void mo5894d() {
            this.f4911c = true;
        }
    }

    public C1638f(ReactApplicationContext reactApplicationContext) {
        this.f4895d = reactApplicationContext;
        this.f4895d.addLifecycleEventListener(this);
        this.f4906o = new ReactEventEmitter(this.f4895d);
    }

    /* renamed from: a */
    private long m6408a(int i, String str, short s) {
        short s2;
        Short sh = (Short) this.f4897f.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.f4907p;
            this.f4907p = (short) (s3 + 1);
            this.f4897f.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return m6409a(i, s2, s);
    }

    /* renamed from: a */
    private static long m6409a(int i, short s, short s2) {
        return ((((long) s) & 65535) << 32) | ((long) i) | ((((long) s2) & 65535) << 48);
    }

    /* renamed from: b */
    private void m6414b(C1635c cVar) {
        int i = this.f4905n;
        C1635c[] cVarArr = this.f4904m;
        if (i == cVarArr.length) {
            this.f4904m = (C1635c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        C1635c[] cVarArr2 = this.f4904m;
        int i2 = this.f4905n;
        this.f4905n = i2 + 1;
        cVarArr2[i2] = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m6416d() {
        Arrays.fill(this.f4904m, 0, this.f4905n, null);
        this.f4905n = 0;
    }

    /* renamed from: e */
    private void m6419e() {
        if (this.f4906o != null) {
            this.f4902k.mo5893c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m6421f() {
        synchronized (this.f4893b) {
            synchronized (this.f4894c) {
                for (int i = 0; i < this.f4899h.size(); i++) {
                    C1635c cVar = (C1635c) this.f4899h.get(i);
                    if (!cVar.mo5872a()) {
                        m6414b(cVar);
                    } else {
                        long a = m6408a(cVar.mo5877g(), cVar.mo5869d(), cVar.mo5874c());
                        Integer num = (Integer) this.f4896e.get(a);
                        C1635c cVar2 = null;
                        if (num == null) {
                            this.f4896e.put(a, Integer.valueOf(this.f4905n));
                        } else {
                            C1635c cVar3 = this.f4904m[num.intValue()];
                            C1635c a2 = cVar.mo5870a(cVar3);
                            if (a2 != cVar3) {
                                this.f4896e.put(a, Integer.valueOf(this.f4905n));
                                this.f4904m[num.intValue()] = null;
                                cVar2 = cVar3;
                                cVar = a2;
                            } else {
                                cVar2 = cVar;
                                cVar = null;
                            }
                        }
                        if (cVar != null) {
                            m6414b(cVar);
                        }
                        if (cVar2 != null) {
                            cVar2.mo5873b();
                        }
                    }
                }
            }
            this.f4899h.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m6422g() {
        UiThreadUtil.assertOnUiThread();
        this.f4902k.mo5894d();
    }

    /* renamed from: a */
    public void mo5883a(int i) {
        this.f4906o.unregister(i);
    }

    /* renamed from: a */
    public void mo5884a(int i, RCTEventEmitter rCTEventEmitter) {
        this.f4906o.register(i, rCTEventEmitter);
    }

    /* renamed from: a */
    public void mo5885a(C1633a aVar) {
        this.f4901j.add(aVar);
    }

    /* renamed from: a */
    public void mo5886a(C1635c cVar) {
        C1136a.m5056a(cVar.mo5878h(), "Dispatched event hasn't been initialized");
        Iterator it = this.f4900i.iterator();
        while (it.hasNext()) {
            ((C1642h) it.next()).mo4817a(cVar);
        }
        synchronized (this.f4893b) {
            this.f4899h.add(cVar);
            C1937a.m7349d(0, cVar.mo5869d(), cVar.mo5876f());
        }
        m6419e();
    }

    /* renamed from: a */
    public void mo5887a(C1642h hVar) {
        this.f4900i.add(hVar);
    }

    /* renamed from: b */
    public void mo5888b() {
        m6419e();
    }

    /* renamed from: b */
    public void mo5889b(C1633a aVar) {
        this.f4901j.remove(aVar);
    }

    /* renamed from: c */
    public void mo5890c() {
        UiThreadUtil.runOnUiThread(new C1637e(this));
    }

    public void onHostDestroy() {
        m6422g();
    }

    public void onHostPause() {
        m6422g();
    }

    public void onHostResume() {
        this.f4902k.mo5893c();
    }
}
