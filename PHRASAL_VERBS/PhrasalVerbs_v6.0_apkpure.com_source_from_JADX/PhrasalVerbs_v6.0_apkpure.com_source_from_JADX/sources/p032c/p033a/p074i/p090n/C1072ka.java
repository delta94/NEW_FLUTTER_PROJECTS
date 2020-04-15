package p032c.p033a.p074i.p090n;

import p032c.p033a.p038c.p046h.C0744b;

/* renamed from: c.a.i.n.ka */
class C1072ka implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1075a f3641a;

    C1072ka(C1075a aVar) {
        this.f3641a = aVar;
    }

    public void run() {
        C0744b b;
        int c;
        synchronized (this.f3641a) {
            b = this.f3641a.f3649g;
            c = this.f3641a.f3650h;
            this.f3641a.f3649g = null;
            this.f3641a.f3651i = false;
        }
        if (C0744b.m3337c(b)) {
            try {
                this.f3641a.m4792b(b, c);
            } finally {
                C0744b.m3336b(b);
            }
        }
        this.f3641a.m4797d();
    }
}
