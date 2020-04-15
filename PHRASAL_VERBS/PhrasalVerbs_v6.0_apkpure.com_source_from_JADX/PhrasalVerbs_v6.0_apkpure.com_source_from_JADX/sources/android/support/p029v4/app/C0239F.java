package android.support.p029v4.app;

import android.graphics.Rect;
import android.support.p029v4.util.C0320b;
import android.view.View;

/* renamed from: android.support.v4.app.F */
class C0239F implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0276j f627a;

    /* renamed from: b */
    final /* synthetic */ C0276j f628b;

    /* renamed from: c */
    final /* synthetic */ boolean f629c;

    /* renamed from: d */
    final /* synthetic */ C0320b f630d;

    /* renamed from: e */
    final /* synthetic */ View f631e;

    /* renamed from: f */
    final /* synthetic */ C0253Q f632f;

    /* renamed from: g */
    final /* synthetic */ Rect f633g;

    C0239F(C0276j jVar, C0276j jVar2, boolean z, C0320b bVar, View view, C0253Q q, Rect rect) {
        this.f627a = jVar;
        this.f628b = jVar2;
        this.f629c = z;
        this.f630d = bVar;
        this.f631e = view;
        this.f632f = q;
        this.f633g = rect;
    }

    public void run() {
        C0241H.m875a(this.f627a, this.f628b, this.f629c, this.f630d, false);
        View view = this.f631e;
        if (view != null) {
            this.f632f.mo901a(view, this.f633g);
        }
    }
}
