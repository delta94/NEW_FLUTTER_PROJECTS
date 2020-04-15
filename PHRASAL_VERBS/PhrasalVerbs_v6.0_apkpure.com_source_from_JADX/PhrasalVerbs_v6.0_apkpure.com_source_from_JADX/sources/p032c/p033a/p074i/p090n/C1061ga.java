package p032c.p033a.p074i.p090n;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b.C0640f;
import p031b.C0645k;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p045g.C0731a;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p045g.C0741j;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p073h.C0883c;
import p032c.p033a.p074i.p080d.C0920l;
import p032c.p033a.p074i.p080d.C0921m;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.ga */
public class C1061ga implements C1082na<C0988d> {

    /* renamed from: a */
    private final C0920l f3609a;

    /* renamed from: b */
    private final C0921m f3610b;

    /* renamed from: c */
    private final C0739h f3611c;

    /* renamed from: d */
    private final C0731a f3612d;

    /* renamed from: e */
    private final C1082na<C0988d> f3613e;

    /* renamed from: c.a.i.n.ga$a */
    private static class C1062a extends C1094s<C0988d, C0988d> {

        /* renamed from: c */
        private final C0920l f3614c;

        /* renamed from: d */
        private final C0657d f3615d;

        /* renamed from: e */
        private final C0739h f3616e;

        /* renamed from: f */
        private final C0731a f3617f;

        /* renamed from: g */
        private final C0988d f3618g;

        private C1062a(C1081n<C0988d> nVar, C0920l lVar, C0657d dVar, C0739h hVar, C0731a aVar, C0988d dVar2) {
            super(nVar);
            this.f3614c = lVar;
            this.f3615d = dVar;
            this.f3616e = hVar;
            this.f3617f = aVar;
            this.f3618g = dVar2;
        }

        /* synthetic */ C1062a(C1081n nVar, C0920l lVar, C0657d dVar, C0739h hVar, C0731a aVar, C0988d dVar2, C1057ea eaVar) {
            this(nVar, lVar, dVar, hVar, aVar, dVar2);
        }

        /* renamed from: a */
        private C0741j m4758a(C0988d dVar, C0988d dVar2) {
            C0741j a = this.f3616e.mo3502a(dVar2.mo4223v() + dVar2.mo4216o().f3221b);
            m4760a(dVar.mo4220s(), a, dVar2.mo4216o().f3221b);
            m4760a(dVar2.mo4220s(), a, dVar2.mo4223v());
            return a;
        }

        /* renamed from: a */
        private void m4759a(C0741j jVar) {
            C0988d dVar;
            Throwable th;
            C0744b a = C0744b.m3334a(jVar.mo3512m());
            try {
                dVar = new C0988d(a);
                try {
                    dVar.mo4226y();
                    mo4347c().mo4310a(dVar, 1);
                    C0988d.m4406b(dVar);
                    C0744b.m3336b(a);
                } catch (Throwable th2) {
                    th = th2;
                    C0988d.m4406b(dVar);
                    C0744b.m3336b(a);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                dVar = null;
                th = th4;
                C0988d.m4406b(dVar);
                C0744b.m3336b(a);
                throw th;
            }
        }

        /* renamed from: a */
        private void m4760a(InputStream inputStream, OutputStream outputStream, int i) {
            byte[] bArr = (byte[]) this.f3617f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f3617f.mo3486a(bArr);
                    throw th;
                }
            }
            this.f3617f.mo3486a(bArr);
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
        }

        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            if (!C1051c.m4689b(i)) {
                if (this.f3618g == null || dVar.mo4216o() == null) {
                    if (C1051c.m4690b(i, 8) && C1051c.m4687a(i) && dVar.mo4219r() != C0883c.f3126a) {
                        this.f3614c.mo4012a(this.f3615d, dVar);
                    }
                    mo4347c().mo4310a(dVar, i);
                } else {
                    try {
                        m4759a(m4758a(this.f3618g, dVar));
                    } catch (IOException e) {
                        C0727a.m3267a("PartialDiskCacheProducer", "Error while merging image data", (Throwable) e);
                        mo4347c().mo4311a((Throwable) e);
                    } catch (Throwable th) {
                        dVar.close();
                        this.f3618g.close();
                        throw th;
                    }
                    dVar.close();
                    this.f3618g.close();
                    this.f3614c.mo4016c(this.f3615d);
                }
            }
        }
    }

    public C1061ga(C0920l lVar, C0921m mVar, C0739h hVar, C0731a aVar, C1082na<C0988d> naVar) {
        this.f3609a = lVar;
        this.f3610b = mVar;
        this.f3611c = hVar;
        this.f3612d = aVar;
        this.f3613e = naVar;
    }

    /* renamed from: a */
    private static Uri m4749a(C1114c cVar) {
        return cVar.mo4372o().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* renamed from: a */
    private C0640f<C0988d, Void> m4750a(C1081n<C0988d> nVar, C1084oa oaVar, C0657d dVar) {
        C1057ea eaVar = new C1057ea(this, oaVar.mo4324e(), oaVar.getId(), nVar, oaVar, dVar);
        return eaVar;
    }

    /* renamed from: a */
    static Map<String, String> m4751a(C1091qa qaVar, String str, boolean z, int i) {
        if (!qaVar.mo4236a(str)) {
            return null;
        }
        String str2 = "cached_value_found";
        if (!z) {
            return C0712f.m3226a(str2, String.valueOf(z));
        }
        return C0712f.m3227a(str2, String.valueOf(z), "encodedImageSize", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4753a(C1081n<C0988d> nVar, C1084oa oaVar, C0657d dVar, C0988d dVar2) {
        C1062a aVar = new C1062a(nVar, this.f3609a, dVar, this.f3611c, this.f3612d, dVar2, null);
        this.f3613e.mo4248a(aVar, oaVar);
    }

    /* renamed from: a */
    private void m4754a(AtomicBoolean atomicBoolean, C1084oa oaVar) {
        oaVar.mo4319a(new C1059fa(this, atomicBoolean));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m4756b(C0645k<?> kVar) {
        return kVar.mo3324d() || (kVar.mo3326f() && (kVar.mo3320a() instanceof CancellationException));
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        C1114c c = oaVar.mo4322c();
        if (!c.mo4374q()) {
            this.f3613e.mo4248a(nVar, oaVar);
            return;
        }
        oaVar.mo4324e().mo4232a(oaVar.getId(), "PartialDiskCacheProducer");
        C0657d a = this.f3610b.mo4017a(c, m4749a(c), oaVar.mo4316a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f3609a.mo4011a(a, atomicBoolean).mo3318a(m4750a(nVar, oaVar, a));
        m4754a(atomicBoolean, oaVar);
    }
}
