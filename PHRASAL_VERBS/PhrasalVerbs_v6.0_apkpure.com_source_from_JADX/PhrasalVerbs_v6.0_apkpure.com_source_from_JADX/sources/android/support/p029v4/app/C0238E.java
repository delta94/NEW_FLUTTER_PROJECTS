package android.support.p029v4.app;

import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.E */
class C0238E implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f619a;

    /* renamed from: b */
    final /* synthetic */ C0253Q f620b;

    /* renamed from: c */
    final /* synthetic */ View f621c;

    /* renamed from: d */
    final /* synthetic */ C0276j f622d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f623e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f624f;

    /* renamed from: g */
    final /* synthetic */ ArrayList f625g;

    /* renamed from: h */
    final /* synthetic */ Object f626h;

    C0238E(Object obj, C0253Q q, View view, C0276j jVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f619a = obj;
        this.f620b = q;
        this.f621c = view;
        this.f622d = jVar;
        this.f623e = arrayList;
        this.f624f = arrayList2;
        this.f625g = arrayList3;
        this.f626h = obj2;
    }

    public void run() {
        Object obj = this.f619a;
        if (obj != null) {
            this.f620b.mo892b(obj, this.f621c);
            this.f624f.addAll(C0241H.m869a(this.f620b, this.f619a, this.f622d, this.f623e, this.f621c));
        }
        if (this.f625g != null) {
            if (this.f626h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f621c);
                this.f620b.mo888a(this.f626h, this.f625g, arrayList);
            }
            this.f625g.clear();
            this.f625g.add(this.f621c);
        }
    }
}
