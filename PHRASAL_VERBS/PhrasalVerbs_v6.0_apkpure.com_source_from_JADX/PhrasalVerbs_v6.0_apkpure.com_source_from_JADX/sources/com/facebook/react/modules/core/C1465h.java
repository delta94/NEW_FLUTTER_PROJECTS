package com.facebook.react.modules.core;

/* renamed from: com.facebook.react.modules.core.h */
class C1465h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f4520a;

    /* renamed from: b */
    final /* synthetic */ C1466i f4521b;

    C1465h(C1466i iVar, Runnable runnable) {
        this.f4521b = iVar;
        this.f4520a = runnable;
    }

    public void run() {
        synchronized (C1466i.class) {
            if (this.f4521b.f4523b == null) {
                this.f4521b.f4523b = C1458b.m5865a();
            }
        }
        Runnable runnable = this.f4520a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
