package android.support.p029v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

/* renamed from: android.support.v4.app.L */
class C0246L extends EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f667a;

    /* renamed from: b */
    final /* synthetic */ C0249M f668b;

    C0246L(C0249M m, Rect rect) {
        this.f668b = m;
        this.f667a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f667a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f667a;
    }
}
