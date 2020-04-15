package com.facebook.react.views.scroll;

import android.view.View;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: com.facebook.react.views.scroll.f */
class C1782f implements Runnable {

    /* renamed from: a */
    private boolean f5264a = false;

    /* renamed from: b */
    final /* synthetic */ C1783g f5265b;

    C1782f(C1783g gVar) {
        this.f5265b = gVar;
    }

    public void run() {
        if (this.f5265b.f5272g) {
            this.f5265b.f5272g = false;
        } else if (!this.f5265b.f5276k || this.f5264a) {
            if (this.f5265b.f5280o) {
                C1788i.m6855b(this.f5265b);
            }
            this.f5265b.f5277l = null;
            this.f5265b.m6835c();
            return;
        } else {
            this.f5264a = true;
            this.f5265b.m6828a(0);
        }
        C0156v.m549a((View) this.f5265b, (Runnable) this, 20);
    }
}
