package p032c.p033a.p074i.p080d;

import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.d.h */
class C0916h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0657d f3178a;

    /* renamed from: b */
    final /* synthetic */ C0988d f3179b;

    /* renamed from: c */
    final /* synthetic */ C0920l f3180c;

    C0916h(C0920l lVar, C0657d dVar, C0988d dVar2) {
        this.f3180c = lVar;
        this.f3178a = dVar;
        this.f3179b = dVar2;
    }

    public void run() {
        try {
            this.f3180c.m4041c(this.f3178a, this.f3179b);
        } finally {
            this.f3180c.f3192g.mo3999b(this.f3178a, this.f3179b);
            C0988d.m4406b(this.f3179b);
        }
    }
}
