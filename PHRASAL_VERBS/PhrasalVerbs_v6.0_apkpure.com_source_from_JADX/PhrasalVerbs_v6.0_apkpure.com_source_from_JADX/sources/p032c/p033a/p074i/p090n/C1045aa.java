package p032c.p033a.p074i.p090n;

import android.util.Pair;
import c.a.i.n.aa$a.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0720l;
import p032c.p033a.p074i.p081e.C0941d;

/* renamed from: c.a.i.n.aa */
public abstract class C1045aa<K, T extends Closeable> implements C1082na<T> {

    /* renamed from: a */
    final Map<K, C1046a> f3573a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1082na<T> f3574b;

    /* renamed from: c.a.i.n.aa$a */
    class C1046a {

        /* renamed from: a */
        private final K f3575a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final CopyOnWriteArraySet<Pair<C1081n<T>, C1084oa>> f3576b = C0720l.m3250a();

        /* renamed from: c */
        private T f3577c;

        /* renamed from: d */
        private float f3578d;

        /* renamed from: e */
        private int f3579e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1056e f3580f;

        /* renamed from: g */
        private a f3581g;

        /* renamed from: c.a.i.n.aa$a$a */
        private class C1047a extends C1051c<T> {
            private C1047a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo4172b(T t, int i) {
                C1046a.this.mo4299a(this, t, i);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo4170b() {
                C1046a.this.mo4297a((a) this);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo4171b(float f) {
                C1046a.this.mo4298a((a) this, f);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public void mo4173b(Throwable th) {
                C1046a.this.mo4300a((a) this, th);
            }
        }

        public C1046a(K k) {
            this.f3575a = k;
        }

        /* renamed from: a */
        private void m4655a(Pair<C1081n<T>, C1084oa> pair, C1084oa oaVar) {
            oaVar.mo4319a(new C1043Z(this, pair));
        }

        /* renamed from: a */
        private void m4657a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* renamed from: a */
        private synchronized boolean m4658a() {
            boolean z;
            Iterator it = this.f3576b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C1084oa) ((Pair) it.next()).second).mo4325f()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            return z;
        }

        /* renamed from: b */
        private synchronized boolean m4660b() {
            boolean z;
            Iterator it = this.f3576b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C1084oa) ((Pair) it.next()).second).mo4323d()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            return z;
        }

        /* renamed from: c */
        private synchronized C0941d m4661c() {
            C0941d dVar;
            dVar = C0941d.LOW;
            Iterator it = this.f3576b.iterator();
            while (it.hasNext()) {
                dVar = C0941d.m4141a(dVar, ((C1084oa) ((Pair) it.next()).second).mo4320b());
            }
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m4664d() {
            synchronized (this) {
                boolean z = true;
                C0718j.m3243a(this.f3580f == null);
                if (this.f3581g != null) {
                    z = false;
                }
                C0718j.m3243a(z);
                if (this.f3576b.isEmpty()) {
                    C1045aa.this.m4650a(this.f3575a, this);
                    return;
                }
                C1084oa oaVar = (C1084oa) ((Pair) this.f3576b.iterator().next()).second;
                C1056e eVar = new C1056e(oaVar.mo4322c(), oaVar.getId(), oaVar.mo4324e(), oaVar.mo4316a(), oaVar.mo4326g(), m4660b(), m4658a(), m4661c());
                this.f3580f = eVar;
                this.f3581g = new C1047a();
                C1056e eVar2 = this.f3580f;
                a aVar = this.f3581g;
                C1045aa.this.f3574b.mo4248a(aVar, eVar2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public synchronized List<C1089pa> m4665e() {
            if (this.f3580f == null) {
                return null;
            }
            return this.f3580f.mo4318a(m4658a());
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public synchronized List<C1089pa> m4667f() {
            if (this.f3580f == null) {
                return null;
            }
            return this.f3580f.mo4321b(m4660b());
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public synchronized List<C1089pa> m4669g() {
            if (this.f3580f == null) {
                return null;
            }
            return this.f3580f.mo4317a(m4661c());
        }

        /* renamed from: a */
        public void mo4297a(a aVar) {
            synchronized (this) {
                if (this.f3581g == aVar) {
                    this.f3581g = null;
                    this.f3580f = null;
                    m4657a((Closeable) this.f3577c);
                    this.f3577c = null;
                    m4664d();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((p032c.p033a.p074i.p090n.C1081n) r0.first).mo4308a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            if (r3.hasNext() == false) goto L_0x0029;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4298a(c.a.i.n.aa$a.a r3, float r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                c.a.i.n.aa$a.a<> r0 = r2.f3581g     // Catch:{ all -> 0x002a }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0007:
                r2.f3578d = r4     // Catch:{ all -> 0x002a }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<c.a.i.n.n<T>, c.a.i.n.oa>> r3 = r2.f3576b     // Catch:{ all -> 0x002a }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
            L_0x0010:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0026 }
                c.a.i.n.n r1 = (p032c.p033a.p074i.p090n.C1081n) r1     // Catch:{ all -> 0x0026 }
                r1.mo4308a(r4)     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0010
            L_0x0026:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r3
            L_0x0029:
                return
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1045aa.C1046a.mo4298a(c.a.i.n.aa$a$a, float):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r3.hasNext() == false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            ((p032c.p033a.p074i.p090n.C1081n) r0.first).mo4310a(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4299a(c.a.i.n.aa$a.a r3, T r4, int r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                c.a.i.n.aa$a.a<> r0 = r2.f3581g     // Catch:{ all -> 0x004d }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                return
            L_0x0007:
                T r3 = r2.f3577c     // Catch:{ all -> 0x004d }
                r2.m4657a(r3)     // Catch:{ all -> 0x004d }
                r3 = 0
                r2.f3577c = r3     // Catch:{ all -> 0x004d }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<c.a.i.n.n<T>, c.a.i.n.oa>> r3 = r2.f3576b     // Catch:{ all -> 0x004d }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004d }
                boolean r0 = p032c.p033a.p074i.p090n.C1051c.m4689b(r5)     // Catch:{ all -> 0x004d }
                if (r0 == 0) goto L_0x0026
                c.a.i.n.aa r0 = p032c.p033a.p074i.p090n.C1045aa.this     // Catch:{ all -> 0x004d }
                java.io.Closeable r0 = r0.mo4295a(r4)     // Catch:{ all -> 0x004d }
                r2.f3577c = r0     // Catch:{ all -> 0x004d }
                r2.f3579e = r5     // Catch:{ all -> 0x004d }
                goto L_0x0032
            L_0x0026:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<c.a.i.n.n<T>, c.a.i.n.oa>> r0 = r2.f3576b     // Catch:{ all -> 0x004d }
                r0.clear()     // Catch:{ all -> 0x004d }
                c.a.i.n.aa r0 = p032c.p033a.p074i.p090n.C1045aa.this     // Catch:{ all -> 0x004d }
                K r1 = r2.f3575a     // Catch:{ all -> 0x004d }
                r0.m4650a(r1, r2)     // Catch:{ all -> 0x004d }
            L_0x0032:
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
            L_0x0033:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0049 }
                c.a.i.n.n r1 = (p032c.p033a.p074i.p090n.C1081n) r1     // Catch:{ all -> 0x0049 }
                r1.mo4310a(r4, r5)     // Catch:{ all -> 0x0049 }
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                goto L_0x0033
            L_0x0049:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                throw r3
            L_0x004c:
                return
            L_0x004d:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1045aa.C1046a.mo4299a(c.a.i.n.aa$a$a, java.io.Closeable, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((p032c.p033a.p074i.p090n.C1081n) r0.first).mo4311a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r3.hasNext() == false) goto L_0x003b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4300a(c.a.i.n.aa$a.a r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                c.a.i.n.aa$a.a<> r0 = r2.f3581g     // Catch:{ all -> 0x003c }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                return
            L_0x0007:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<c.a.i.n.n<T>, c.a.i.n.oa>> r3 = r2.f3576b     // Catch:{ all -> 0x003c }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x003c }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<c.a.i.n.n<T>, c.a.i.n.oa>> r0 = r2.f3576b     // Catch:{ all -> 0x003c }
                r0.clear()     // Catch:{ all -> 0x003c }
                c.a.i.n.aa r0 = p032c.p033a.p074i.p090n.C1045aa.this     // Catch:{ all -> 0x003c }
                K r1 = r2.f3575a     // Catch:{ all -> 0x003c }
                r0.m4650a(r1, r2)     // Catch:{ all -> 0x003c }
                T r0 = r2.f3577c     // Catch:{ all -> 0x003c }
                r2.m4657a(r0)     // Catch:{ all -> 0x003c }
                r0 = 0
                r2.f3577c = r0     // Catch:{ all -> 0x003c }
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
            L_0x0022:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0038 }
                c.a.i.n.n r1 = (p032c.p033a.p074i.p090n.C1081n) r1     // Catch:{ all -> 0x0038 }
                r1.mo4311a(r4)     // Catch:{ all -> 0x0038 }
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                goto L_0x0022
            L_0x0038:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                throw r3
            L_0x003b:
                return
            L_0x003c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                throw r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1045aa.C1046a.mo4300a(c.a.i.n.aa$a$a, java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            p032c.p033a.p074i.p090n.C1056e.m4726c(r1);
            p032c.p033a.p074i.p090n.C1056e.m4727d(r2);
            p032c.p033a.p074i.p090n.C1056e.m4725b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.f3577c) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.f3582h.mo4295a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= 0.0f) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.mo4308a(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r8.mo4310a(r4, r6);
            m4657a((java.io.Closeable) r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
            m4655a(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4301a(p032c.p033a.p074i.p090n.C1081n<T> r8, p032c.p033a.p074i.p090n.C1084oa r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                c.a.i.n.aa r1 = p032c.p033a.p074i.p090n.C1045aa.this     // Catch:{ all -> 0x0060 }
                K r2 = r7.f3575a     // Catch:{ all -> 0x0060 }
                c.a.i.n.aa$a r1 = r1.m4651b(r2)     // Catch:{ all -> 0x0060 }
                if (r1 == r7) goto L_0x0012
                r8 = 0
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                return r8
            L_0x0012:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<c.a.i.n.n<T>, c.a.i.n.oa>> r1 = r7.f3576b     // Catch:{ all -> 0x0060 }
                r1.add(r0)     // Catch:{ all -> 0x0060 }
                java.util.List r1 = r7.m4667f()     // Catch:{ all -> 0x0060 }
                java.util.List r2 = r7.m4669g()     // Catch:{ all -> 0x0060 }
                java.util.List r3 = r7.m4665e()     // Catch:{ all -> 0x0060 }
                T r4 = r7.f3577c     // Catch:{ all -> 0x0060 }
                float r5 = r7.f3578d     // Catch:{ all -> 0x0060 }
                int r6 = r7.f3579e     // Catch:{ all -> 0x0060 }
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                p032c.p033a.p074i.p090n.C1056e.m4726c(r1)
                p032c.p033a.p074i.p090n.C1056e.m4727d(r2)
                p032c.p033a.p074i.p090n.C1056e.m4725b(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x005d }
                T r1 = r7.f3577c     // Catch:{ all -> 0x005a }
                if (r4 == r1) goto L_0x003b
                r4 = 0
                goto L_0x0043
            L_0x003b:
                if (r4 == 0) goto L_0x0043
                c.a.i.n.aa r1 = p032c.p033a.p074i.p090n.C1045aa.this     // Catch:{ all -> 0x005a }
                java.io.Closeable r4 = r1.mo4295a(r4)     // Catch:{ all -> 0x005a }
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                if (r4 == 0) goto L_0x0054
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8.mo4308a(r5)     // Catch:{ all -> 0x005d }
            L_0x004e:
                r8.mo4310a(r4, r6)     // Catch:{ all -> 0x005d }
                r7.m4657a(r4)     // Catch:{ all -> 0x005d }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                r7.m4655a(r0, r9)
                r8 = 1
                return r8
            L_0x005a:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                throw r8     // Catch:{ all -> 0x005d }
            L_0x005d:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                throw r8
            L_0x0060:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1045aa.C1046a.mo4301a(c.a.i.n.n, c.a.i.n.oa):boolean");
        }
    }

    protected C1045aa(C1082na<T> naVar) {
        this.f3574b = naVar;
    }

    /* renamed from: a */
    private synchronized C1046a m4647a(K k) {
        C1046a aVar;
        aVar = new C1046a<>(k);
        this.f3573a.put(k, aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m4650a(K k, C1046a aVar) {
        if (this.f3573a.get(k) == aVar) {
            this.f3573a.remove(k);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized C1046a m4651b(K k) {
        return (C1046a) this.f3573a.get(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo4295a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract K mo4296a(C1084oa oaVar);

    /* renamed from: a */
    public void mo4248a(C1081n<T> nVar, C1084oa oaVar) {
        boolean z;
        C1046a b;
        Object a = mo4296a(oaVar);
        do {
            z = false;
            synchronized (this) {
                b = m4651b(a);
                if (b == null) {
                    b = m4647a((K) a);
                    z = true;
                }
            }
        } while (!b.mo4301a(nVar, oaVar));
        if (z) {
            b.m4664d();
        }
    }
}
