package p032c.p033a.p059g.p060a.p061a;

import android.content.res.Resources;
import java.util.concurrent.Executor;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0711e;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p059g.p064b.C0806b;
import p032c.p033a.p074i.p080d.C0902A;
import p032c.p033a.p074i.p085i.C0984a;
import p032c.p033a.p074i.p086j.C0986b;

/* renamed from: c.a.g.a.a.h */
public class C0804h {

    /* renamed from: a */
    private Resources f2786a;

    /* renamed from: b */
    private C0806b f2787b;

    /* renamed from: c */
    private C0984a f2788c;

    /* renamed from: d */
    private Executor f2789d;

    /* renamed from: e */
    private C0902A<C0657d, C0986b> f2790e;

    /* renamed from: f */
    private C0711e<C0984a> f2791f;

    /* renamed from: g */
    private C0721m<Boolean> f2792g;

    /* renamed from: a */
    public C0800d mo3656a() {
        C0800d a = mo3657a(this.f2786a, this.f2787b, this.f2788c, this.f2789d, this.f2790e, this.f2791f);
        C0721m<Boolean> mVar = this.f2792g;
        if (mVar != null) {
            a.mo3640b(((Boolean) mVar.get()).booleanValue());
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0800d mo3657a(Resources resources, C0806b bVar, C0984a aVar, Executor executor, C0902A<C0657d, C0986b> a, C0711e<C0984a> eVar) {
        C0800d dVar = new C0800d(resources, bVar, aVar, executor, a, eVar);
        return dVar;
    }

    /* renamed from: a */
    public void mo3658a(Resources resources, C0806b bVar, C0984a aVar, Executor executor, C0902A<C0657d, C0986b> a, C0711e<C0984a> eVar, C0721m<Boolean> mVar) {
        this.f2786a = resources;
        this.f2787b = bVar;
        this.f2788c = aVar;
        this.f2789d = executor;
        this.f2790e = a;
        this.f2791f = eVar;
        this.f2792g = mVar;
    }
}
