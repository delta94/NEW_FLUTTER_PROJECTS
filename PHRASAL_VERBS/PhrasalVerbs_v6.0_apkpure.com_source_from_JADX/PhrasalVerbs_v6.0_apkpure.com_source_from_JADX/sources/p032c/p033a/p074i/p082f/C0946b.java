package p032c.p033a.p074i.p082f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p032c.p033a.p035b.p037b.C0676g;
import p032c.p033a.p035b.p037b.C0678h;
import p032c.p033a.p035b.p037b.C0682j;
import p032c.p033a.p035b.p037b.C0682j.C0684b;
import p032c.p033a.p035b.p037b.C0689n;

/* renamed from: c.a.i.f.b */
public class C0946b implements C0950f {

    /* renamed from: a */
    private C0947c f3255a;

    public C0946b(C0947c cVar) {
        this.f3255a = cVar;
    }

    /* renamed from: a */
    public static C0682j m4154a(C0676g gVar, C0678h hVar) {
        return m4155a(gVar, hVar, Executors.newSingleThreadExecutor());
    }

    /* renamed from: a */
    public static C0682j m4155a(C0676g gVar, C0678h hVar, Executor executor) {
        C0684b bVar = new C0684b(gVar.mo3400k(), gVar.mo3399j(), gVar.mo3395f());
        C0678h hVar2 = hVar;
        C0684b bVar2 = bVar;
        C0682j jVar = new C0682j(hVar2, gVar.mo3397h(), bVar2, gVar.mo3393d(), gVar.mo3392c(), gVar.mo3396g(), gVar.mo3394e(), executor, gVar.mo3398i());
        return jVar;
    }

    /* renamed from: a */
    public C0689n mo4068a(C0676g gVar) {
        return m4154a(gVar, this.f3255a.mo4069a(gVar));
    }
}
