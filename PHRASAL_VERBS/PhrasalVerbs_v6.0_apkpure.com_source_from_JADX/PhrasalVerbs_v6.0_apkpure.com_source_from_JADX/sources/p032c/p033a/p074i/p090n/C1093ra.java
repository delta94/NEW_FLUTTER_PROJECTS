package p032c.p033a.p074i.p090n;

import android.content.ContentResolver;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.ra */
public class C1093ra extends C1036S {

    /* renamed from: c */
    private final ContentResolver f3690c;

    public C1093ra(Executor executor, C0739h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f3690c = contentResolver;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4276a(C1114c cVar) {
        return mo4288b(this.f3690c.openInputStream(cVar.mo4372o()), -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4277a() {
        return "QualifiedResourceFetchProducer";
    }
}
