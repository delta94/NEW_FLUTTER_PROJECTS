package p031b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: b.k */
public class C0645k<TResult> {

    /* renamed from: a */
    public static final ExecutorService f2439a = C0637d.m2989a();

    /* renamed from: b */
    private static final Executor f2440b = C0637d.m2990b();

    /* renamed from: c */
    public static final Executor f2441c = C0634b.m2988b();

    /* renamed from: d */
    private static volatile C0646a f2442d;

    /* renamed from: e */
    private static C0645k<?> f2443e = new C0645k<>((TResult) null);

    /* renamed from: f */
    private static C0645k<Boolean> f2444f = new C0645k<>((TResult) Boolean.valueOf(true));

    /* renamed from: g */
    private static C0645k<Boolean> f2445g = new C0645k<>((TResult) Boolean.valueOf(false));

    /* renamed from: h */
    private static C0645k<?> f2446h = new C0645k<>(true);

    /* renamed from: i */
    private final Object f2447i = new Object();

    /* renamed from: j */
    private boolean f2448j;

    /* renamed from: k */
    private boolean f2449k;

    /* renamed from: l */
    private TResult f2450l;

    /* renamed from: m */
    private Exception f2451m;

    /* renamed from: n */
    private boolean f2452n;

    /* renamed from: o */
    private C0648m f2453o;

    /* renamed from: p */
    private List<C0640f<TResult, Void>> f2454p = new ArrayList();

    /* renamed from: b.k$a */
    public interface C0646a {
        /* renamed from: a */
        void mo3328a(C0645k<?> kVar, C0649n nVar);
    }

    C0645k() {
    }

    private C0645k(TResult tresult) {
        mo3323b(tresult);
    }

    private C0645k(boolean z) {
        if (z) {
            mo3327g();
        } else {
            mo3323b((TResult) null);
        }
    }

    /* renamed from: a */
    public static <TResult> C0645k<TResult> m2998a(Exception exc) {
        C0647l lVar = new C0647l();
        lVar.mo3330a(exc);
        return lVar.mo3329a();
    }

    /* renamed from: a */
    public static <TResult> C0645k<TResult> m2999a(TResult tresult) {
        if (tresult == null) {
            return f2443e;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? f2444f : f2445g;
        }
        C0647l lVar = new C0647l();
        lVar.mo3331a(tresult);
        return lVar.mo3329a();
    }

    /* renamed from: a */
    public static <TResult> C0645k<TResult> m3000a(Callable<TResult> callable, Executor executor) {
        return m3001a(callable, executor, (C0639e) null);
    }

    /* renamed from: a */
    public static <TResult> C0645k<TResult> m3001a(Callable<TResult> callable, Executor executor, C0639e eVar) {
        C0647l lVar = new C0647l();
        try {
            executor.execute(new C0644j(eVar, lVar, callable));
        } catch (Exception e) {
            lVar.mo3330a((Exception) new C0641g(e));
        }
        return lVar.mo3329a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <TContinuationResult, TResult> void m3003b(C0647l<TContinuationResult> lVar, C0640f<TResult, TContinuationResult> fVar, C0645k<TResult> kVar, Executor executor, C0639e eVar) {
        try {
            executor.execute(new C0643i(eVar, lVar, fVar, kVar));
        } catch (Exception e) {
            lVar.mo3330a((Exception) new C0641g(e));
        }
    }

    /* renamed from: c */
    public static C0646a m3004c() {
        return f2442d;
    }

    /* renamed from: h */
    private void m3005h() {
        synchronized (this.f2447i) {
            for (C0640f a : this.f2454p) {
                try {
                    a.mo3315a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f2454p = null;
        }
    }

    /* renamed from: a */
    public <TContinuationResult> C0645k<TContinuationResult> mo3318a(C0640f<TResult, TContinuationResult> fVar) {
        return mo3319a(fVar, f2440b, (C0639e) null);
    }

    /* renamed from: a */
    public <TContinuationResult> C0645k<TContinuationResult> mo3319a(C0640f<TResult, TContinuationResult> fVar, Executor executor, C0639e eVar) {
        boolean e;
        C0647l lVar = new C0647l();
        synchronized (this.f2447i) {
            e = mo3325e();
            if (!e) {
                List<C0640f<TResult, Void>> list = this.f2454p;
                C0642h hVar = new C0642h(this, lVar, fVar, executor, eVar);
                list.add(hVar);
            }
        }
        if (e) {
            m3003b(lVar, fVar, this, executor, eVar);
        }
        return lVar.mo3329a();
    }

    /* renamed from: a */
    public Exception mo3320a() {
        Exception exc;
        synchronized (this.f2447i) {
            if (this.f2451m != null) {
                this.f2452n = true;
                if (this.f2453o != null) {
                    this.f2453o.mo3336a();
                    this.f2453o = null;
                }
            }
            exc = this.f2451m;
        }
        return exc;
    }

    /* renamed from: b */
    public TResult mo3321b() {
        TResult tresult;
        synchronized (this.f2447i) {
            tresult = this.f2450l;
        }
        return tresult;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3322b(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2447i
            monitor-enter(r0)
            boolean r1 = r3.f2448j     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f2448j = r1     // Catch:{ all -> 0x002c }
            r3.f2451m = r4     // Catch:{ all -> 0x002c }
            r3.f2452n = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f2447i     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.m3005h()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f2452n     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            b.k$a r4 = m3004c()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            b.m r4 = new b.m     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f2453o = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p031b.C0645k.mo3322b(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3323b(TResult tresult) {
        synchronized (this.f2447i) {
            if (this.f2448j) {
                return false;
            }
            this.f2448j = true;
            this.f2450l = tresult;
            this.f2447i.notifyAll();
            m3005h();
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo3324d() {
        boolean z;
        synchronized (this.f2447i) {
            z = this.f2449k;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo3325e() {
        boolean z;
        synchronized (this.f2447i) {
            z = this.f2448j;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo3326f() {
        boolean z;
        synchronized (this.f2447i) {
            z = mo3320a() != null;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo3327g() {
        synchronized (this.f2447i) {
            if (this.f2448j) {
                return false;
            }
            this.f2448j = true;
            this.f2449k = true;
            this.f2447i.notifyAll();
            m3005h();
            return true;
        }
    }
}
