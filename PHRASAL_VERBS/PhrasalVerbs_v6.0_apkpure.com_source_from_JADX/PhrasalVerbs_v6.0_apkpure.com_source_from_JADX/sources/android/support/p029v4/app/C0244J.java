package android.support.p029v4.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.J */
class C0244J implements TransitionListener {

    /* renamed from: a */
    final /* synthetic */ View f657a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f658b;

    /* renamed from: c */
    final /* synthetic */ C0249M f659c;

    C0244J(C0249M m, View view, ArrayList arrayList) {
        this.f659c = m;
        this.f657a = view;
        this.f658b = arrayList;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f657a.setVisibility(8);
        int size = this.f658b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f658b.get(i)).setVisibility(0);
        }
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
