package com.facebook.react.common;

import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.common.g */
public class C1399g {

    /* renamed from: a */
    private Thread f4395a = null;

    /* renamed from: a */
    public void mo5193a() {
        Thread currentThread = Thread.currentThread();
        if (this.f4395a == null) {
            this.f4395a = currentThread;
        }
        C1136a.m5055a(this.f4395a == currentThread);
    }
}
