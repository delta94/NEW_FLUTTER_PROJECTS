package p032c.p033a.p035b.p037b;

/* renamed from: c.a.b.b.i */
class C0681i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0682j f2533a;

    C0681i(C0682j jVar) {
        this.f2533a = jVar;
    }

    public void run() {
        synchronized (this.f2533a.f2552s) {
            this.f2533a.m3155c();
        }
        this.f2533a.f2553t = true;
        this.f2533a.f2539f.countDown();
    }
}
