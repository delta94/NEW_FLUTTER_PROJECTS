package p032c.p033a.p035b.p037b;

import android.content.Context;
import com.facebook.common.time.C1263a;
import com.facebook.common.time.C1265c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p032c.p033a.p034a.C0650a;
import p032c.p033a.p035b.p036a.C0652a;
import p032c.p033a.p035b.p036a.C0652a.C0653a;
import p032c.p033a.p035b.p036a.C0655c;
import p032c.p033a.p035b.p036a.C0655c.C0656a;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p035b.p036a.C0658e;
import p032c.p033a.p035b.p036a.C0663j;
import p032c.p033a.p035b.p037b.C0678h.C0679a;
import p032c.p033a.p035b.p037b.C0678h.C0680b;
import p032c.p033a.p038c.p039a.C0691a;
import p032c.p033a.p038c.p039a.C0692b;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p047i.C0749a;
import p032c.p033a.p038c.p047i.C0749a.C0750a;

/* renamed from: c.a.b.b.j */
public class C0682j implements C0689n, C0691a {

    /* renamed from: a */
    private static final Class<?> f2534a = C0682j.class;

    /* renamed from: b */
    private static final long f2535b = TimeUnit.HOURS.toMillis(2);

    /* renamed from: c */
    private static final long f2536c = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: d */
    private final long f2537d;

    /* renamed from: e */
    private final long f2538e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CountDownLatch f2539f;

    /* renamed from: g */
    private long f2540g;

    /* renamed from: h */
    private final C0655c f2541h;

    /* renamed from: i */
    final Set<String> f2542i;

    /* renamed from: j */
    private long f2543j;

    /* renamed from: k */
    private final long f2544k;

    /* renamed from: l */
    private final C0749a f2545l;

    /* renamed from: m */
    private final C0678h f2546m;

    /* renamed from: n */
    private final C0688m f2547n;

    /* renamed from: o */
    private final C0652a f2548o;

    /* renamed from: p */
    private final boolean f2549p;

    /* renamed from: q */
    private final C0683a f2550q;

    /* renamed from: r */
    private final C1263a f2551r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f2552s = new Object();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f2553t;

    /* renamed from: c.a.b.b.j$a */
    static class C0683a {

        /* renamed from: a */
        private boolean f2554a = false;

        /* renamed from: b */
        private long f2555b = -1;

        /* renamed from: c */
        private long f2556c = -1;

        C0683a() {
        }

        /* renamed from: a */
        public synchronized long mo3410a() {
            return this.f2556c;
        }

        /* renamed from: a */
        public synchronized void mo3411a(long j, long j2) {
            if (this.f2554a) {
                this.f2555b += j;
                this.f2556c += j2;
            }
        }

        /* renamed from: b */
        public synchronized long mo3412b() {
            return this.f2555b;
        }

        /* renamed from: b */
        public synchronized void mo3413b(long j, long j2) {
            this.f2556c = j2;
            this.f2555b = j;
            this.f2554a = true;
        }

        /* renamed from: c */
        public synchronized boolean mo3414c() {
            return this.f2554a;
        }

        /* renamed from: d */
        public synchronized void mo3415d() {
            this.f2554a = false;
            this.f2556c = -1;
            this.f2555b = -1;
        }
    }

    /* renamed from: c.a.b.b.j$b */
    public static class C0684b {

        /* renamed from: a */
        public final long f2557a;

        /* renamed from: b */
        public final long f2558b;

        /* renamed from: c */
        public final long f2559c;

        public C0684b(long j, long j2, long j3) {
            this.f2557a = j;
            this.f2558b = j2;
            this.f2559c = j3;
        }
    }

    public C0682j(C0678h hVar, C0688m mVar, C0684b bVar, C0655c cVar, C0652a aVar, C0692b bVar2, Context context, Executor executor, boolean z) {
        this.f2537d = bVar.f2558b;
        long j = bVar.f2559c;
        this.f2538e = j;
        this.f2540g = j;
        this.f2545l = C0749a.m3357a();
        this.f2546m = hVar;
        this.f2547n = mVar;
        this.f2543j = -1;
        this.f2541h = cVar;
        this.f2544k = bVar.f2557a;
        this.f2548o = aVar;
        this.f2550q = new C0683a();
        if (bVar2 != null) {
            bVar2.mo3427a(this);
        }
        this.f2551r = C1265c.m5447a();
        this.f2549p = z;
        this.f2542i = new HashSet();
        if (this.f2549p) {
            this.f2539f = new CountDownLatch(1);
            executor.execute(new C0681i(this));
            return;
        }
        this.f2539f = new CountDownLatch(0);
    }

    /* renamed from: a */
    private C0650a m3146a(C0680b bVar, C0657d dVar, String str) {
        C0650a a;
        synchronized (this.f2552s) {
            a = bVar.mo3383a(dVar);
            this.f2542i.add(str);
            this.f2550q.mo3411a(a.size(), 1);
        }
        return a;
    }

    /* renamed from: a */
    private C0680b m3147a(String str, C0657d dVar) {
        m3152b();
        return this.f2546m.mo3363a(str, dVar);
    }

    /* renamed from: a */
    private Collection<C0679a> m3149a(Collection<C0679a> collection) {
        long now = this.f2551r.now() + f2535b;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (C0679a aVar : collection) {
            if (aVar.mo3377b() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f2547n.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    private void m3150a(long j, C0656a aVar) {
        long j2 = j;
        try {
            Collection<C0679a> a = m3149a(this.f2546m.mo3370d());
            long b = this.f2550q.mo3412b();
            long j3 = b - j2;
            int i = 0;
            long j4 = 0;
            for (C0679a aVar2 : a) {
                if (j4 > j3) {
                    break;
                }
                long a2 = this.f2546m.mo3362a(aVar2);
                this.f2542i.remove(aVar2.getId());
                if (a2 > 0) {
                    i++;
                    j4 += a2;
                    C0690o a3 = C0690o.m3189a();
                    a3.mo3423a(aVar2.getId());
                    a3.mo3420a(aVar);
                    a3.mo3426c(a2);
                    a3.mo3424b(b - j4);
                    a3.mo3419a(j2);
                    this.f2541h.mo3346b(a3);
                    a3.mo3425b();
                } else {
                    C0656a aVar3 = aVar;
                }
            }
            this.f2550q.mo3411a(-j4, (long) (-i));
            this.f2546m.mo3369c();
        } catch (IOException e) {
            C0652a aVar4 = this.f2548o;
            C0653a aVar5 = C0653a.EVICTION;
            Class<?> cls = f2534a;
            StringBuilder sb = new StringBuilder();
            sb.append("evictAboveSize: ");
            sb.append(e.getMessage());
            aVar4.mo3343a(aVar5, cls, sb.toString(), e);
            throw e;
        }
    }

    /* renamed from: b */
    private void m3152b() {
        synchronized (this.f2552s) {
            boolean c = m3155c();
            m3157e();
            long b = this.f2550q.mo3412b();
            if (b > this.f2540g && !c) {
                this.f2550q.mo3415d();
                m3155c();
            }
            if (b > this.f2540g) {
                m3150a((this.f2540g * 9) / 10, C0656a.CACHE_FULL);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m3155c() {
        long now = this.f2551r.now();
        if (this.f2550q.mo3414c()) {
            long j = this.f2543j;
            if (j != -1 && now - j <= f2536c) {
                return false;
            }
        }
        return m3156d();
    }

    /* renamed from: d */
    private boolean m3156d() {
        long j;
        long now = this.f2551r.now();
        long j2 = f2535b + now;
        Set<String> set = (!this.f2549p || !this.f2542i.isEmpty()) ? this.f2549p ? new HashSet<>() : null : this.f2542i;
        try {
            long j3 = -1;
            int i = 0;
            int i2 = 0;
            long j4 = 0;
            boolean z = false;
            int i3 = 0;
            for (C0679a aVar : this.f2546m.mo3370d()) {
                i3++;
                j4 += aVar.mo3376a();
                if (aVar.mo3377b() > j2) {
                    i++;
                    j = j2;
                    int a = (int) (((long) i2) + aVar.mo3376a());
                    j3 = Math.max(aVar.mo3377b() - now, j3);
                    i2 = a;
                    z = true;
                } else {
                    j = j2;
                    if (this.f2549p) {
                        set.add(aVar.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                C0652a aVar2 = this.f2548o;
                C0653a aVar3 = C0653a.READ_INVALID_ENTRY;
                Class<?> cls = f2534a;
                StringBuilder sb = new StringBuilder();
                sb.append("Future timestamp found in ");
                sb.append(i);
                sb.append(" files , with a total size of ");
                sb.append(i2);
                sb.append(" bytes, and a maximum time delta of ");
                sb.append(j3);
                sb.append("ms");
                aVar2.mo3343a(aVar3, cls, sb.toString(), null);
            }
            long j5 = (long) i3;
            if (!(this.f2550q.mo3410a() == j5 && this.f2550q.mo3412b() == j4)) {
                if (this.f2549p && this.f2542i != set) {
                    this.f2542i.clear();
                    this.f2542i.addAll(set);
                }
                this.f2550q.mo3413b(j4, j5);
            }
            this.f2543j = now;
            return true;
        } catch (IOException e) {
            C0652a aVar4 = this.f2548o;
            C0653a aVar5 = C0653a.GENERIC_IO;
            Class<?> cls2 = f2534a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("calcFileCacheSize: ");
            sb2.append(e.getMessage());
            aVar4.mo3343a(aVar5, cls2, sb2.toString(), e);
            return false;
        }
    }

    /* renamed from: e */
    private void m3157e() {
        this.f2540g = this.f2545l.mo3531a(this.f2546m.mo3366b() ? C0750a.EXTERNAL : C0750a.INTERNAL, this.f2538e - this.f2550q.mo3412b()) ? this.f2537d : this.f2538e;
    }

    /* renamed from: a */
    public C0650a mo3404a(C0657d dVar) {
        C0650a aVar;
        C0690o a = C0690o.m3189a();
        a.mo3421a(dVar);
        try {
            synchronized (this.f2552s) {
                List b = C0658e.m3041b(dVar);
                int i = 0;
                String str = null;
                aVar = null;
                while (true) {
                    if (i >= b.size()) {
                        break;
                    }
                    str = (String) b.get(i);
                    a.mo3423a(str);
                    aVar = this.f2546m.mo3368c(str, dVar);
                    if (aVar != null) {
                        break;
                    }
                    i++;
                }
                if (aVar == null) {
                    this.f2541h.mo3345a(a);
                    this.f2542i.remove(str);
                } else {
                    this.f2541h.mo3348d(a);
                    this.f2542i.add(str);
                }
            }
            a.mo3425b();
            return aVar;
        } catch (IOException e) {
            try {
                this.f2548o.mo3343a(C0653a.GENERIC_IO, f2534a, "getResource", e);
                a.mo3422a(e);
                this.f2541h.mo3350f(a);
                return null;
            } finally {
                a.mo3425b();
            }
        }
    }

    /* renamed from: a */
    public C0650a mo3405a(C0657d dVar, C0663j jVar) {
        String a;
        C0680b a2;
        C0690o a3 = C0690o.m3189a();
        a3.mo3421a(dVar);
        this.f2541h.mo3351g(a3);
        synchronized (this.f2552s) {
            a = C0658e.m3040a(dVar);
        }
        a3.mo3423a(a);
        try {
            a2 = m3147a(a, dVar);
            a2.mo3384a(jVar, dVar);
            C0650a a4 = m3146a(a2, dVar, a);
            a3.mo3426c(a4.size());
            a3.mo3424b(this.f2550q.mo3412b());
            this.f2541h.mo3349e(a3);
            if (!a2.mo3385a()) {
                C0727a.m3258a(f2534a, "Failed to delete temp file");
            }
            a3.mo3425b();
            return a4;
        } catch (IOException e) {
            try {
                a3.mo3422a(e);
                this.f2541h.mo3347c(a3);
                C0727a.m3263a(f2534a, "Failed inserting a file into the cache", (Throwable) e);
                throw e;
            } catch (Throwable th) {
                a3.mo3425b();
                throw th;
            }
        } catch (Throwable th2) {
            if (!a2.mo3385a()) {
                C0727a.m3258a(f2534a, "Failed to delete temp file");
            }
            throw th2;
        }
    }

    /* renamed from: a */
    public void mo3406a() {
        synchronized (this.f2552s) {
            try {
                this.f2546m.mo3364a();
                this.f2542i.clear();
                this.f2541h.mo3344a();
            } catch (IOException e) {
                C0652a aVar = this.f2548o;
                C0653a aVar2 = C0653a.EVICTION;
                Class<?> cls = f2534a;
                StringBuilder sb = new StringBuilder();
                sb.append("clearAll: ");
                sb.append(e.getMessage());
                aVar.mo3343a(aVar2, cls, sb.toString(), e);
            }
            this.f2550q.mo3415d();
        }
    }

    /* renamed from: b */
    public boolean mo3407b(C0657d dVar) {
        synchronized (this.f2552s) {
            List b = C0658e.m3041b(dVar);
            for (int i = 0; i < b.size(); i++) {
                if (this.f2542i.contains((String) b.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public void mo3408c(C0657d dVar) {
        synchronized (this.f2552s) {
            try {
                List b = C0658e.m3041b(dVar);
                for (int i = 0; i < b.size(); i++) {
                    String str = (String) b.get(i);
                    this.f2546m.remove(str);
                    this.f2542i.remove(str);
                }
            } catch (IOException e) {
                C0652a aVar = this.f2548o;
                C0653a aVar2 = C0653a.DELETE_FILE;
                Class<?> cls = f2534a;
                StringBuilder sb = new StringBuilder();
                sb.append("delete: ");
                sb.append(e.getMessage());
                aVar.mo3343a(aVar2, cls, sb.toString(), e);
            }
        }
    }

    /* renamed from: d */
    public boolean mo3409d(C0657d dVar) {
        synchronized (this.f2552s) {
            if (mo3407b(dVar)) {
                return true;
            }
            try {
                List b = C0658e.m3041b(dVar);
                for (int i = 0; i < b.size(); i++) {
                    String str = (String) b.get(i);
                    if (this.f2546m.mo3367b(str, dVar)) {
                        this.f2542i.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }
}
