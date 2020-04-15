package p032c.p033a.p074i.p090n;

import java.io.InputStream;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0708b;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.S */
public abstract class C1036S implements C1082na<C0988d> {

    /* renamed from: a */
    private final Executor f3560a;

    /* renamed from: b */
    private final C0739h f3561b;

    protected C1036S(Executor executor, C0739h hVar) {
        this.f3560a = executor;
        this.f3561b = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0988d mo4276a(C1114c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4287a(InputStream inputStream, int i) {
        C0737g gVar;
        if (i <= 0) {
            try {
                gVar = this.f3561b.mo3498a(inputStream);
            } catch (Throwable th) {
                C0708b.m3223a(inputStream);
                C0744b.m3336b(null);
                throw th;
            }
        } else {
            gVar = this.f3561b.mo3499a(inputStream, i);
        }
        C0744b a = C0744b.m3334a(gVar);
        C0988d dVar = new C0988d(a);
        C0708b.m3223a(inputStream);
        C0744b.m3336b(a);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo4277a();

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        C1091qa e = oaVar.mo4324e();
        String id = oaVar.getId();
        C1081n<C0988d> nVar2 = nVar;
        C1091qa qaVar = e;
        C1034P p = new C1034P(this, nVar2, qaVar, mo4277a(), id, oaVar.mo4322c(), e, id);
        oaVar.mo4319a(new C1035Q(this, p));
        this.f3560a.execute(p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0988d mo4288b(InputStream inputStream, int i) {
        return mo4287a(inputStream, i);
    }
}
