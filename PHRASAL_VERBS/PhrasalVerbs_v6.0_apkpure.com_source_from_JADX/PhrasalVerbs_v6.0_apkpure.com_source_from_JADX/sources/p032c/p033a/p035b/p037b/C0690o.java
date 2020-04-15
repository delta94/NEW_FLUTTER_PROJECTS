package p032c.p033a.p035b.p037b;

import java.io.IOException;
import p032c.p033a.p035b.p036a.C0654b;
import p032c.p033a.p035b.p036a.C0655c.C0656a;
import p032c.p033a.p035b.p036a.C0657d;

/* renamed from: c.a.b.b.o */
public class C0690o implements C0654b {

    /* renamed from: a */
    private static final Object f2568a = new Object();

    /* renamed from: b */
    private static C0690o f2569b;

    /* renamed from: c */
    private static int f2570c;

    /* renamed from: d */
    private C0657d f2571d;

    /* renamed from: e */
    private String f2572e;

    /* renamed from: f */
    private long f2573f;

    /* renamed from: g */
    private long f2574g;

    /* renamed from: h */
    private long f2575h;

    /* renamed from: i */
    private IOException f2576i;

    /* renamed from: j */
    private C0656a f2577j;

    /* renamed from: k */
    private C0690o f2578k;

    private C0690o() {
    }

    /* renamed from: a */
    public static C0690o m3189a() {
        synchronized (f2568a) {
            if (f2569b == null) {
                return new C0690o();
            }
            C0690o oVar = f2569b;
            f2569b = oVar.f2578k;
            oVar.f2578k = null;
            f2570c--;
            return oVar;
        }
    }

    /* renamed from: c */
    private void m3190c() {
        this.f2571d = null;
        this.f2572e = null;
        this.f2573f = 0;
        this.f2574g = 0;
        this.f2575h = 0;
        this.f2576i = null;
        this.f2577j = null;
    }

    /* renamed from: a */
    public C0690o mo3419a(long j) {
        this.f2574g = j;
        return this;
    }

    /* renamed from: a */
    public C0690o mo3420a(C0656a aVar) {
        this.f2577j = aVar;
        return this;
    }

    /* renamed from: a */
    public C0690o mo3421a(C0657d dVar) {
        this.f2571d = dVar;
        return this;
    }

    /* renamed from: a */
    public C0690o mo3422a(IOException iOException) {
        this.f2576i = iOException;
        return this;
    }

    /* renamed from: a */
    public C0690o mo3423a(String str) {
        this.f2572e = str;
        return this;
    }

    /* renamed from: b */
    public C0690o mo3424b(long j) {
        this.f2575h = j;
        return this;
    }

    /* renamed from: b */
    public void mo3425b() {
        synchronized (f2568a) {
            if (f2570c < 5) {
                m3190c();
                f2570c++;
                if (f2569b != null) {
                    this.f2578k = f2569b;
                }
                f2569b = this;
            }
        }
    }

    /* renamed from: c */
    public C0690o mo3426c(long j) {
        this.f2573f = j;
        return this;
    }
}
