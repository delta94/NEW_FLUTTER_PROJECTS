package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.jni.b */
public class C1300b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C1302b f4222a = new C1302b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C1303c f4223b = new C1303c(null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ReferenceQueue f4224c = new ReferenceQueue();

    /* renamed from: d */
    private static Thread f4225d = new C1299a("HybridData DestructorThread");

    /* renamed from: com.facebook.jni.b$a */
    public static abstract class C1301a extends PhantomReference<Object> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C1301a f4226a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1301a f4227b;

        private C1301a() {
            super(null, C1300b.f4224c);
        }

        /* synthetic */ C1301a(C1299a aVar) {
            this();
        }

        C1301a(Object obj) {
            super(obj, C1300b.f4224c);
            C1300b.f4223b.mo4802a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo4795a();
    }

    /* renamed from: com.facebook.jni.b$b */
    private static class C1302b {

        /* renamed from: a */
        private C1301a f4228a = new C1304d(null);

        public C1302b() {
            this.f4228a.f4226a = new C1304d(null);
            this.f4228a.f4226a.f4227b = this.f4228a;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m5623c(C1301a aVar) {
            aVar.f4226a.f4227b = aVar.f4227b;
            aVar.f4227b.f4226a = aVar.f4226a;
        }

        /* renamed from: b */
        public void mo4800b(C1301a aVar) {
            aVar.f4226a = this.f4228a.f4226a;
            this.f4228a.f4226a = aVar;
            aVar.f4226a.f4227b = aVar;
            aVar.f4227b = this.f4228a;
        }
    }

    /* renamed from: com.facebook.jni.b$c */
    private static class C1303c {

        /* renamed from: a */
        private AtomicReference<C1301a> f4229a;

        private C1303c() {
            this.f4229a = new AtomicReference<>();
        }

        /* synthetic */ C1303c(C1299a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo4801a() {
            C1301a aVar = (C1301a) this.f4229a.getAndSet(null);
            while (aVar != null) {
                C1301a b = aVar.f4226a;
                C1300b.f4222a.mo4800b(aVar);
                aVar = b;
            }
        }

        /* renamed from: a */
        public void mo4802a(C1301a aVar) {
            C1301a aVar2;
            do {
                aVar2 = (C1301a) this.f4229a.get();
                aVar.f4226a = aVar2;
            } while (!this.f4229a.compareAndSet(aVar2, aVar));
        }
    }

    /* renamed from: com.facebook.jni.b$d */
    private static class C1304d extends C1301a {
        private C1304d() {
            super((C1299a) null);
        }

        /* synthetic */ C1304d(C1299a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4795a() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        f4225d.start();
    }
}
