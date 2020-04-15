package p032c.p033a.p074i.p090n;

import android.os.SystemClock;
import java.io.InputStream;
import java.util.Map;
import p032c.p033a.p038c.p045g.C0731a;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p045g.C0741j;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p081e.C0938a;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p090n.C1054da.C1055a;

/* renamed from: c.a.i.n.ca */
public class C1052ca implements C1082na<C0988d> {

    /* renamed from: a */
    private final C0739h f3588a;

    /* renamed from: b */
    private final C0731a f3589b;

    /* renamed from: c */
    private final C1054da f3590c;

    public C1052ca(C0739h hVar, C0731a aVar, C1054da daVar) {
        this.f3588a = hVar;
        this.f3589b = aVar;
        this.f3590c = daVar;
    }

    /* renamed from: a */
    protected static float m4701a(int i, int i2) {
        if (i2 > 0) {
            return ((float) i) / ((float) i2);
        }
        double d = (double) (-i);
        Double.isNaN(d);
        return 1.0f - ((float) Math.exp(d / 50000.0d));
    }

    /* renamed from: a */
    private Map<String, String> m4702a(C1004B b, int i) {
        if (!b.mo4257e().mo4236a(b.mo4255c())) {
            return null;
        }
        return this.f3590c.mo3967b(b, i);
    }

    /* renamed from: a */
    private void m4703a(C0741j jVar, int i, C0938a aVar, C1081n<C0988d> nVar) {
        C0988d dVar;
        C0744b a = C0744b.m3334a(jVar.mo3512m());
        try {
            dVar = new C0988d(a);
            try {
                dVar.mo4204a(aVar);
                dVar.mo4226y();
                nVar.mo4310a(dVar, i);
                C0988d.m4406b(dVar);
                C0744b.m3336b(a);
            } catch (Throwable th) {
                th = th;
                C0988d.m4406b(dVar);
                C0744b.m3336b(a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dVar = null;
            C0988d.m4406b(dVar);
            C0744b.m3336b(a);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4704a(C1004B b) {
        b.mo4257e().mo4235a(b.mo4255c(), "NetworkFetchProducer", null);
        b.mo4250a().mo4307a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4705a(C1004B b, Throwable th) {
        String str = "NetworkFetchProducer";
        b.mo4257e().mo4234a(b.mo4255c(), str, th, null);
        b.mo4257e().mo3595a(b.mo4255c(), str, false);
        b.mo4250a().mo4311a(th);
    }

    /* renamed from: b */
    private boolean m4708b(C1004B b) {
        if (!b.mo4254b().mo4325f()) {
            return false;
        }
        return this.f3590c.mo4315a(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4312a(C0741j jVar, C1004B b) {
        Map a = m4702a(b, jVar.size());
        C1091qa e = b.mo4257e();
        String str = "NetworkFetchProducer";
        e.mo4237b(b.mo4255c(), str, a);
        e.mo3595a(b.mo4255c(), str, true);
        m4703a(jVar, b.mo4258f() | 1, b.mo4259g(), b.mo4250a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4313a(C1004B b, InputStream inputStream, int i) {
        C0741j a = i > 0 ? this.f3588a.mo3502a(i) : this.f3588a.mo3501a();
        byte[] bArr = (byte[]) this.f3589b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f3590c.mo3965a(b, a.size());
                    mo4312a(a, b);
                    return;
                } else if (read > 0) {
                    a.write(bArr, 0, read);
                    mo4314b(a, b);
                    b.mo4250a().mo4308a(m4701a(a.size(), i));
                }
            } finally {
                this.f3589b.mo3486a(bArr);
                a.close();
            }
        }
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        oaVar.mo4324e().mo4232a(oaVar.getId(), "NetworkFetchProducer");
        C1004B a = this.f3590c.mo3961a(nVar, oaVar);
        this.f3590c.mo3966a(a, (C1055a) new C1050ba(this, a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4314b(C0741j jVar, C1004B b) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (m4708b(b) && uptimeMillis - b.mo4256d() >= 100) {
            b.mo4252a(uptimeMillis);
            b.mo4257e().mo4233a(b.mo4255c(), "NetworkFetchProducer", "intermediate_result");
            m4703a(jVar, b.mo4258f(), b.mo4259g(), b.mo4250a());
        }
    }
}
