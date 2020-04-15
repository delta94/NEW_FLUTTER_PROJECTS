package android.support.p029v4.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.K */
class C0245K implements TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Object f660a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f661b;

    /* renamed from: c */
    final /* synthetic */ Object f662c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f663d;

    /* renamed from: e */
    final /* synthetic */ Object f664e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f665f;

    /* renamed from: g */
    final /* synthetic */ C0249M f666g;

    C0245K(C0249M m, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f666g = m;
        this.f660a = obj;
        this.f661b = arrayList;
        this.f662c = obj2;
        this.f663d = arrayList2;
        this.f664e = obj3;
        this.f665f = arrayList3;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.f660a;
        if (obj != null) {
            this.f666g.mo888a(obj, this.f661b, null);
        }
        Object obj2 = this.f662c;
        if (obj2 != null) {
            this.f666g.mo888a(obj2, this.f663d, null);
        }
        Object obj3 = this.f664e;
        if (obj3 != null) {
            this.f666g.mo888a(obj3, this.f665f, null);
        }
    }
}
