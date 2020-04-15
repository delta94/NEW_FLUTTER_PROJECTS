package p000a.p005b.p009c.p018g;

import android.graphics.Rect;
import android.view.View;

/* renamed from: a.b.c.g.B */
class C0100B implements C0151q {

    /* renamed from: a */
    private final Rect f234a = new Rect();

    /* renamed from: b */
    final /* synthetic */ C0101C f235b;

    C0100B(C0101C c) {
        this.f235b = c;
    }

    /* renamed from: a */
    public C0121L mo317a(View view, C0121L l) {
        C0121L b = C0156v.m553b(view, l);
        if (b.mo416e()) {
            return b;
        }
        Rect rect = this.f234a;
        rect.left = b.mo413b();
        rect.top = b.mo415d();
        rect.right = b.mo414c();
        rect.bottom = b.mo411a();
        int childCount = this.f235b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0121L a = C0156v.m538a(this.f235b.getChildAt(i), b);
            rect.left = Math.min(a.mo413b(), rect.left);
            rect.top = Math.min(a.mo415d(), rect.top);
            rect.right = Math.min(a.mo414c(), rect.right);
            rect.bottom = Math.min(a.mo411a(), rect.bottom);
        }
        return b.mo412a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
