package android.support.p030v7.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.widget.F */
class C0512F implements OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ OnGlobalLayoutListener f1913a;

    /* renamed from: b */
    final /* synthetic */ C0505b f1914b;

    C0512F(C0505b bVar, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f1914b = bVar;
        this.f1913a = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = C0503C.this.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1913a);
        }
    }
}
