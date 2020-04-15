package p032c.p033a.p098m;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: c.a.m.y */
class C1238y implements OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f4001a;

    /* renamed from: b */
    final /* synthetic */ C1145G f4002b;

    C1238y(C1145G g, View view) {
        this.f4002b = g;
        this.f4001a = view;
    }

    public void onViewAttachedToWindow(View view) {
        this.f4001a.removeOnAttachStateChangeListener(this);
        this.f4002b.f3806i.mo5214a(true);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
