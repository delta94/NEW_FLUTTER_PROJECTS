package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.k */
class C0221k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LiveData f600a;

    C0221k(LiveData liveData) {
        this.f600a = liveData;
    }

    public void run() {
        Object b;
        synchronized (this.f600a.f555b) {
            b = this.f600a.f559f;
            this.f600a.f559f = LiveData.f554a;
        }
        this.f600a.mo799a(b);
    }
}
