package p032c.p033a.p074i.p090n;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p073h.C0882b;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.y */
public class C1108y {
    /* renamed from: a */
    static float m4947a(C1114c cVar, C0988d dVar) {
        C0718j.m3243a(C0988d.m4407d(dVar));
        C0942e l = cVar.mo4369l();
        if (l == null || l.f3243b <= 0 || l.f3242a <= 0 || dVar.mo4224w() == 0 || dVar.mo4218q() == 0) {
            return 1.0f;
        }
        int c = m4951c(cVar, dVar);
        boolean z = c == 90 || c == 270;
        int q = z ? dVar.mo4218q() : dVar.mo4224w();
        int w = z ? dVar.mo4224w() : dVar.mo4218q();
        float f = ((float) l.f3242a) / ((float) q);
        float f2 = ((float) l.f3243b) / ((float) w);
        float max = Math.max(f, f2);
        C0727a.m3277b("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f for %s", Integer.valueOf(l.f3242a), Integer.valueOf(l.f3243b), Integer.valueOf(q), Integer.valueOf(w), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max), cVar.mo4372o().toString());
        return max;
    }

    /* renamed from: a */
    static int m4948a(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            double pow = Math.pow(d, 2.0d);
            Double.isNaN(d);
            double d2 = 1.0d / (pow - d);
            Double.isNaN(d);
            if ((1.0d / d) + (d2 * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: b */
    static int m4949b(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = (double) i2;
            Double.isNaN(d);
            double d2 = 1.0d / d;
            if (d2 + (0.3333333432674408d * d2) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public static int m4950b(C1114c cVar, C0988d dVar) {
        if (!C0988d.m4407d(dVar)) {
            return 1;
        }
        float a = m4947a(cVar, dVar);
        int b = dVar.mo4219r() == C0882b.f3116a ? m4949b(a) : m4948a(a);
        int max = Math.max(dVar.mo4218q(), dVar.mo4224w());
        C0942e l = cVar.mo4369l();
        float f = l != null ? l.f3244c : 2048.0f;
        while (((float) (max / b)) > f) {
            b = dVar.mo4219r() == C0882b.f3116a ? b * 2 : b + 1;
        }
        return b;
    }

    /* renamed from: c */
    private static int m4951c(C1114c cVar, C0988d dVar) {
        boolean z = false;
        if (!cVar.mo4370m().mo4060g()) {
            return 0;
        }
        int t = dVar.mo4221t();
        if (t == 0 || t == 90 || t == 180 || t == 270) {
            z = true;
        }
        C0718j.m3243a(z);
        return t;
    }
}
