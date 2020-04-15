package android.support.p029v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

/* renamed from: android.support.v4.app.I */
class C0243I extends EpicenterCallback {

    /* renamed from: a */
    final /* synthetic */ Rect f655a;

    /* renamed from: b */
    final /* synthetic */ C0249M f656b;

    C0243I(C0249M m, Rect rect) {
        this.f656b = m;
        this.f655a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f655a;
    }
}
