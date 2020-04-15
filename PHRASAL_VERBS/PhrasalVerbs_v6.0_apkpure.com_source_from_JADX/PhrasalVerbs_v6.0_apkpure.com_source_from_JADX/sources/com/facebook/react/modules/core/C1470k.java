package com.facebook.react.modules.core;

/* renamed from: com.facebook.react.modules.core.k */
class C1470k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f4537a;

    /* renamed from: b */
    final /* synthetic */ Timing f4538b;

    C1470k(Timing timing, boolean z) {
        this.f4538b = timing;
        this.f4537a = z;
    }

    public void run() {
        synchronized (this.f4538b.mIdleCallbackGuard) {
            if (this.f4537a) {
                this.f4538b.setChoreographerIdleCallback();
            } else {
                this.f4538b.clearChoreographerIdleCallback();
            }
        }
    }
}
