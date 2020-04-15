package android.support.p030v7.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.f */
class C0460f implements OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0463i f1646a;

    C0460f(C0463i iVar) {
        this.f1646a = iVar;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1646a.f1678z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1646a.f1678z = view.getViewTreeObserver();
            }
            C0463i iVar = this.f1646a;
            iVar.f1678z.removeGlobalOnLayoutListener(iVar.f1663k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
