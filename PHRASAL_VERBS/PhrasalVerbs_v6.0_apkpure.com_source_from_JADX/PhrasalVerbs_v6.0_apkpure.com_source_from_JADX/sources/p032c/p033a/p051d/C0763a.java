package p032c.p033a.p051d;

/* renamed from: c.a.d.a */
class C0763a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f2659a;

    /* renamed from: b */
    final /* synthetic */ C0771h f2660b;

    /* renamed from: c */
    final /* synthetic */ boolean f2661c;

    /* renamed from: d */
    final /* synthetic */ C0765c f2662d;

    C0763a(C0765c cVar, boolean z, C0771h hVar, boolean z2) {
        this.f2662d = cVar;
        this.f2659a = z;
        this.f2660b = hVar;
        this.f2661c = z2;
    }

    public void run() {
        if (this.f2659a) {
            this.f2660b.mo3564b(this.f2662d);
        } else if (this.f2661c) {
            this.f2660b.mo3563a(this.f2662d);
        } else {
            this.f2660b.mo3565c(this.f2662d);
        }
    }
}
