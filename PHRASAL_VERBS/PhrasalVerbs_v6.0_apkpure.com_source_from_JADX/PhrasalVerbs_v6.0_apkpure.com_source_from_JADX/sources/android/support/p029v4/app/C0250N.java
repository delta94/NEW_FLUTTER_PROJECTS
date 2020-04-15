package android.support.p029v4.app;

import android.view.View;
import java.util.ArrayList;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.app.N */
class C0250N implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f681a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f682b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f683c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f684d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f685e;

    /* renamed from: f */
    final /* synthetic */ C0253Q f686f;

    C0250N(C0253Q q, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f686f = q;
        this.f681a = i;
        this.f682b = arrayList;
        this.f683c = arrayList2;
        this.f684d = arrayList3;
        this.f685e = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f681a; i++) {
            C0156v.m550a((View) this.f682b.get(i), (String) this.f683c.get(i));
            C0156v.m550a((View) this.f684d.get(i), (String) this.f685e.get(i));
        }
    }
}
