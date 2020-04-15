package android.support.p029v4.app;

import android.graphics.Rect;
import android.support.p029v4.util.C0320b;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.G */
class C0240G implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0253Q f634a;

    /* renamed from: b */
    final /* synthetic */ C0320b f635b;

    /* renamed from: c */
    final /* synthetic */ Object f636c;

    /* renamed from: d */
    final /* synthetic */ C0242a f637d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f638e;

    /* renamed from: f */
    final /* synthetic */ View f639f;

    /* renamed from: g */
    final /* synthetic */ C0276j f640g;

    /* renamed from: h */
    final /* synthetic */ C0276j f641h;

    /* renamed from: i */
    final /* synthetic */ boolean f642i;

    /* renamed from: j */
    final /* synthetic */ ArrayList f643j;

    /* renamed from: k */
    final /* synthetic */ Object f644k;

    /* renamed from: l */
    final /* synthetic */ Rect f645l;

    C0240G(C0253Q q, C0320b bVar, Object obj, C0242a aVar, ArrayList arrayList, View view, C0276j jVar, C0276j jVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f634a = q;
        this.f635b = bVar;
        this.f636c = obj;
        this.f637d = aVar;
        this.f638e = arrayList;
        this.f639f = view;
        this.f640g = jVar;
        this.f641h = jVar2;
        this.f642i = z;
        this.f643j = arrayList2;
        this.f644k = obj2;
        this.f645l = rect;
    }

    public void run() {
        C0320b a = C0241H.m862a(this.f634a, this.f635b, this.f636c, this.f637d);
        if (a != null) {
            this.f638e.addAll(a.values());
            this.f638e.add(this.f639f);
        }
        C0241H.m875a(this.f640g, this.f641h, this.f642i, a, false);
        Object obj = this.f636c;
        if (obj != null) {
            this.f634a.mo894b(obj, this.f643j, this.f638e);
            View a2 = C0241H.m863a(a, this.f637d, this.f644k, this.f642i);
            if (a2 != null) {
                this.f634a.mo901a(a2, this.f645l);
            }
        }
    }
}
