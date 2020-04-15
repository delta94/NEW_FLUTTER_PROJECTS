package p032c.p033a.p074i.p080d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.d.F */
public class C0907F {

    /* renamed from: a */
    private static final Class<?> f3163a = C0907F.class;

    /* renamed from: b */
    private Map<C0657d, C0988d> f3164b = new HashMap();

    private C0907F() {
    }

    /* renamed from: b */
    public static C0907F m4013b() {
        return new C0907F();
    }

    /* renamed from: c */
    private synchronized void m4014c() {
        C0727a.m3271b(f3163a, "Count = %d", (Object) Integer.valueOf(this.f3164b.size()));
    }

    /* renamed from: a */
    public void mo3995a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f3164b.values());
            this.f3164b.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C0988d dVar = (C0988d) arrayList.get(i);
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo3996a(C0657d dVar, C0988d dVar2) {
        C0718j.m3240a(dVar);
        C0718j.m3243a(C0988d.m4408e(dVar2));
        C0988d.m4406b((C0988d) this.f3164b.put(dVar, C0988d.m4405a(dVar2)));
        m4014c();
    }

    /* renamed from: a */
    public synchronized boolean mo3997a(C0657d dVar) {
        C0718j.m3240a(dVar);
        if (!this.f3164b.containsKey(dVar)) {
            return false;
        }
        C0988d dVar2 = (C0988d) this.f3164b.get(dVar);
        synchronized (dVar2) {
            if (C0988d.m4408e(dVar2)) {
                return true;
            }
            this.f3164b.remove(dVar);
            C0727a.m3280c(f3163a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(dVar2)), dVar.mo3352a(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p032c.p033a.p074i.p086j.C0988d mo3998b(p032c.p033a.p035b.p036a.C0657d r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            p032c.p033a.p038c.p042d.C0718j.m3240a(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map<c.a.b.a.d, c.a.i.j.d> r0 = r6.f3164b     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0051 }
            c.a.i.j.d r0 = (p032c.p033a.p074i.p086j.C0988d) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004e
            monitor-enter(r0)     // Catch:{ all -> 0x0051 }
            boolean r1 = p032c.p033a.p074i.p086j.C0988d.m4408e(r0)     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.util.Map<c.a.b.a.d, c.a.i.j.d> r1 = r6.f3164b     // Catch:{ all -> 0x004b }
            r1.remove(r7)     // Catch:{ all -> 0x004b }
            java.lang.Class<?> r1 = f3163a     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004b }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x004b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 1
            java.lang.String r5 = r7.mo3352a()     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 2
            int r7 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x004b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004b }
            r3[r4] = r7     // Catch:{ all -> 0x004b }
            p032c.p033a.p038c.p043e.C0727a.m3280c(r1, r2, r3)     // Catch:{ all -> 0x004b }
            r7 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r6)
            return r7
        L_0x0045:
            c.a.i.j.d r7 = p032c.p033a.p074i.p086j.C0988d.m4405a(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x004e:
            r7 = r0
        L_0x004f:
            monitor-exit(r6)
            return r7
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p080d.C0907F.mo3998b(c.a.b.a.d):c.a.i.j.d");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public synchronized boolean mo3999b(C0657d dVar, C0988d dVar2) {
        C0718j.m3240a(dVar);
        C0718j.m3240a(dVar2);
        C0718j.m3243a(C0988d.m4408e(dVar2));
        C0988d dVar3 = (C0988d) this.f3164b.get(dVar);
        if (dVar3 == null) {
            return false;
        }
        C0744b n = dVar3.mo4215n();
        C0744b n2 = dVar2.mo4215n();
        if (!(n == null || n2 == null)) {
            try {
                if (n.mo3520n() == n2.mo3520n()) {
                    this.f3164b.remove(dVar);
                    C0744b.m3336b(n2);
                    C0744b.m3336b(n);
                    C0988d.m4406b(dVar3);
                    m4014c();
                    return true;
                }
            } catch (Throwable th) {
                C0744b.m3336b(n2);
                C0744b.m3336b(n);
                C0988d.m4406b(dVar3);
                throw th;
            }
        }
        C0744b.m3336b(n2);
        C0744b.m3336b(n);
        C0988d.m4406b(dVar3);
        return false;
    }

    /* renamed from: c */
    public boolean mo4000c(C0657d dVar) {
        C0988d dVar2;
        C0718j.m3240a(dVar);
        synchronized (this) {
            dVar2 = (C0988d) this.f3164b.remove(dVar);
        }
        if (dVar2 == null) {
            return false;
        }
        try {
            return dVar2.mo4225x();
        } finally {
            dVar2.close();
        }
    }
}
