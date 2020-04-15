package p032c.p033a.p059g.p060a.p061a;

import android.content.Context;
import android.net.Uri;
import java.util.Set;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0711e;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p051d.C0768e;
import p032c.p033a.p059g.p060a.p061a.p062a.C0791b;
import p032c.p033a.p059g.p060a.p061a.p062a.C0795f;
import p032c.p033a.p059g.p065c.C0816e;
import p032c.p033a.p059g.p065c.C0816e.C0817a;
import p032c.p033a.p059g.p065c.C0819g;
import p032c.p033a.p059g.p071h.C0870a;
import p032c.p033a.p074i.p080d.C0921m;
import p032c.p033a.p074i.p081e.C0943f;
import p032c.p033a.p074i.p082f.C0954j;
import p032c.p033a.p074i.p085i.C0984a;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0989e;
import p032c.p033a.p074i.p087k.C0994c;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1114c.C1116b;
import p032c.p033a.p074i.p091o.C1117d;
import p032c.p033a.p074i.p092p.C1124c;

/* renamed from: c.a.g.a.a.f */
public class C0802f extends C0816e<C0802f, C1114c, C0744b<C0986b>, C0989e> {

    /* renamed from: s */
    private final C0954j f2777s;

    /* renamed from: t */
    private final C0804h f2778t;

    /* renamed from: u */
    private C0711e<C0984a> f2779u;

    /* renamed from: v */
    private C0791b f2780v;

    /* renamed from: w */
    private C0795f f2781w;

    public C0802f(Context context, C0804h hVar, C0954j jVar, Set<C0819g> set) {
        super(context, set);
        this.f2777s = jVar;
        this.f2778t = hVar;
    }

    /* renamed from: a */
    public static C1116b m3567a(C0817a aVar) {
        int i = C0801e.f2776a[aVar.ordinal()];
        if (i == 1) {
            return C1116b.FULL_FETCH;
        }
        if (i == 2) {
            return C1116b.DISK_CACHE;
        }
        if (i == 3) {
            return C1116b.BITMAP_MEMORY_CACHE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cache level");
        sb.append(aVar);
        sb.append("is not supported. ");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: m */
    private C0657d m3568m() {
        C1114c cVar = (C1114c) mo3711f();
        C0921m e = this.f2777s.mo4085e();
        if (e == null || cVar == null) {
            return null;
        }
        return cVar.mo4362f() != null ? e.mo4019b(cVar, mo3707c()) : e.mo4018a(cVar, mo3707c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0768e<C0744b<C0986b>> mo3652a(C0870a aVar, String str, C1114c cVar, Object obj, C0817a aVar2) {
        return this.f2777s.mo4075a(cVar, obj, m3567a(aVar2), mo3654b(aVar));
    }

    /* renamed from: a */
    public C0802f m3572a(Uri uri) {
        C1114c a;
        if (uri == null) {
            a = null;
        } else {
            C1117d a2 = C1117d.m4986a(uri);
            a2.mo4383a(C0943f.m4143b());
            a = a2.mo4378a();
        }
        super.mo3703b(a);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0994c mo3654b(C0870a aVar) {
        if (aVar instanceof C0800d) {
            return ((C0800d) aVar).mo3649q();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0800d m3575j() {
        C1124c.m5023a("obtainController");
        try {
            C0870a g = mo3712g();
            String b = C0816e.m3642b();
            C0800d a = g instanceof C0800d ? (C0800d) g : this.f2778t.mo3656a();
            a.mo3630a(mo3693a(a, b), b, m3568m(), mo3707c(), this.f2779u, this.f2780v);
            a.mo3632a(this.f2781w);
            return a;
        } finally {
            C1124c.m5022a();
        }
    }
}
