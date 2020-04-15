package com.facebook.react.views.scroll;

import android.view.View;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: com.facebook.react.views.scroll.d */
class C1780d implements Runnable {

    /* renamed from: a */
    private boolean f5237a = false;

    /* renamed from: b */
    final /* synthetic */ C1781e f5238b;

    C1780d(C1781e eVar) {
        this.f5238b = eVar;
    }

    public void run() {
        if (this.f5238b.f5245g) {
            this.f5238b.f5245g = false;
        } else if (!this.f5238b.f5249k || this.f5237a) {
            if (this.f5238b.f5253o) {
                C1788i.m6855b(this.f5238b);
            }
            this.f5238b.f5250l = null;
            this.f5238b.m6815c();
            return;
        } else {
            this.f5237a = true;
            this.f5238b.m6808a(0);
        }
        C0156v.m549a((View) this.f5238b, (Runnable) this, 20);
    }
}
