package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
import p000a.p005b.p009c.p018g.C0116H;

/* renamed from: android.support.v7.widget.L */
public interface C0524L {
    /* renamed from: a */
    C0116H mo2568a(int i, long j);

    /* renamed from: a */
    void mo2569a(int i);

    /* renamed from: a */
    void mo2571a(C0563aa aaVar);

    /* renamed from: a */
    void mo2572a(Menu menu, C0486a aVar);

    /* renamed from: a */
    void mo2575a(boolean z);

    /* renamed from: a */
    boolean mo2576a();

    /* renamed from: b */
    void mo2577b();

    /* renamed from: b */
    void mo2578b(int i);

    /* renamed from: b */
    void mo2581b(boolean z);

    /* renamed from: c */
    void mo2582c(int i);

    /* renamed from: c */
    boolean mo2584c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo2587d();

    /* renamed from: e */
    boolean mo2589e();

    /* renamed from: f */
    boolean mo2590f();

    /* renamed from: g */
    void mo2591g();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo2593h();

    /* renamed from: i */
    int mo2594i();

    /* renamed from: j */
    ViewGroup mo2595j();

    /* renamed from: k */
    Context mo2596k();

    /* renamed from: l */
    int mo2597l();

    /* renamed from: m */
    void mo2598m();

    /* renamed from: n */
    void mo2599n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
