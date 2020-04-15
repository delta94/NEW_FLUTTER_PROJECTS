package p032c.p033a.p059g.p060a.p061a;

import android.content.Context;
import android.content.res.Resources;
import java.util.Set;
import p032c.p033a.p038c.p040b.C0699f;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p059g.p064b.C0806b;
import p032c.p033a.p059g.p065c.C0819g;
import p032c.p033a.p074i.p080d.C0902A;
import p032c.p033a.p074i.p082f.C0954j;
import p032c.p033a.p074i.p082f.C0964o;
import p032c.p033a.p074i.p085i.C0984a;

/* renamed from: c.a.g.a.a.g */
public class C0803g implements C0721m<C0802f> {

    /* renamed from: a */
    private final Context f2782a;

    /* renamed from: b */
    private final C0954j f2783b;

    /* renamed from: c */
    private final C0804h f2784c;

    /* renamed from: d */
    private final Set<C0819g> f2785d;

    public C0803g(Context context, C0798b bVar) {
        this(context, C0964o.m4272f(), bVar);
    }

    public C0803g(Context context, C0964o oVar, C0798b bVar) {
        this(context, oVar, null, bVar);
    }

    public C0803g(Context context, C0964o oVar, Set<C0819g> set, C0798b bVar) {
        this.f2782a = context;
        this.f2783b = oVar.mo4133e();
        if (bVar == null) {
            this.f2784c = new C0804h();
            C0804h hVar = this.f2784c;
            Resources resources = context.getResources();
            C0806b b = C0806b.m3581b();
            C0984a a = oVar.mo4129a(context);
            C0699f b2 = C0699f.m3211b();
            C0902A d = this.f2783b.mo4084d();
            if (bVar != null) {
                bVar.mo3623a();
                throw null;
            } else if (bVar == null) {
                hVar.mo3658a(resources, b, a, b2, d, null, null);
                this.f2785d = set;
            } else {
                bVar.mo3624b();
                throw null;
            }
        } else {
            bVar.mo3625c();
            throw null;
        }
    }

    public C0802f get() {
        return new C0802f(this.f2782a, this.f2784c, this.f2783b, this.f2785d);
    }
}
