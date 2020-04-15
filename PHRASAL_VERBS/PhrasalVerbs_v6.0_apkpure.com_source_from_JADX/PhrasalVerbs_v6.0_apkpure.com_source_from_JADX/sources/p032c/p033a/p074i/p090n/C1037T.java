package p032c.p033a.p074i.p090n;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.T */
public class C1037T extends C1036S {
    public C1037T(Executor executor, C0739h hVar) {
        super(executor, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4276a(C1114c cVar) {
        return mo4288b(new FileInputStream(cVar.mo4371n().toString()), (int) cVar.mo4371n().length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4277a() {
        return "LocalFileFetchProducer";
    }
}
