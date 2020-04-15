package p032c.p033a.p098m.p101c;

/* renamed from: c.a.m.c.a */
class C1172a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f3896a;

    /* renamed from: b */
    final /* synthetic */ C1173b f3897b;

    C1172a(C1173b bVar, int i) {
        this.f3897b = bVar;
        this.f3896a = i;
    }

    public void run() {
        for (C1174c onHeadlessJsTaskFinish : this.f3897b.f3900c) {
            onHeadlessJsTaskFinish.onHeadlessJsTaskFinish(this.f3896a);
        }
    }
}
