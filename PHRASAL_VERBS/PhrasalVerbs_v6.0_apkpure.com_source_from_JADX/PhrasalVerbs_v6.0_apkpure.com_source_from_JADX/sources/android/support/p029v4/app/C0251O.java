package android.support.p029v4.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.app.O */
class C0251O implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f687a;

    /* renamed from: b */
    final /* synthetic */ Map f688b;

    /* renamed from: c */
    final /* synthetic */ C0253Q f689c;

    C0251O(C0253Q q, ArrayList arrayList, Map map) {
        this.f689c = q;
        this.f687a = arrayList;
        this.f688b = map;
    }

    public void run() {
        int size = this.f687a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f687a.get(i);
            String l = C0156v.m571l(view);
            if (l != null) {
                C0156v.m550a(view, C0253Q.m917a(this.f688b, l));
            }
        }
    }
}
