package com.facebook.react.modules.storage;

/* renamed from: com.facebook.react.modules.storage.i */
class C1552i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f4722a;

    /* renamed from: b */
    final /* synthetic */ C1543a f4723b;

    C1552i(C1543a aVar, Runnable runnable) {
        this.f4723b = aVar;
        this.f4722a = runnable;
    }

    public void run() {
        try {
            this.f4722a.run();
        } finally {
            this.f4723b.mo5495a();
        }
    }
}
