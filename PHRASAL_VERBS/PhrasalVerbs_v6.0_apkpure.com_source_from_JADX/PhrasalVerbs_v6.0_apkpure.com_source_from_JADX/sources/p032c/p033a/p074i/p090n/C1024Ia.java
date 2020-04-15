package p032c.p033a.p074i.p090n;

import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.n.Ia */
public final class C1024Ia {
    /* renamed from: a */
    public static int m4559a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    /* renamed from: a */
    public static boolean m4560a(int i, int i2, C0942e eVar) {
        boolean z = true;
        if (eVar == null) {
            if (((float) m4559a(i)) < 2048.0f || m4559a(i2) < 2048) {
                z = false;
            }
            return z;
        }
        if (m4559a(i) < eVar.f3242a || m4559a(i2) < eVar.f3243b) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m4561a(C0988d dVar, C0942e eVar) {
        int q;
        int w;
        if (dVar == null) {
            return false;
        }
        int t = dVar.mo4221t();
        if (t == 90 || t == 270) {
            q = dVar.mo4218q();
            w = dVar.mo4224w();
        } else {
            q = dVar.mo4224w();
            w = dVar.mo4218q();
        }
        return m4560a(q, w, eVar);
    }
}
