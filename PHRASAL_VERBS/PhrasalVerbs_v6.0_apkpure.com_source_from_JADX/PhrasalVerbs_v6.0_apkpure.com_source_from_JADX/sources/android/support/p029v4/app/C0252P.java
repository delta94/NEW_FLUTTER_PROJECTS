package android.support.p029v4.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.app.P */
class C0252P implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f690a;

    /* renamed from: b */
    final /* synthetic */ Map f691b;

    /* renamed from: c */
    final /* synthetic */ C0253Q f692c;

    C0252P(C0253Q q, ArrayList arrayList, Map map) {
        this.f692c = q;
        this.f690a = arrayList;
        this.f691b = map;
    }

    public void run() {
        int size = this.f690a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f690a.get(i);
            C0156v.m550a(view, (String) this.f691b.get(C0156v.m571l(view)));
        }
    }
}
