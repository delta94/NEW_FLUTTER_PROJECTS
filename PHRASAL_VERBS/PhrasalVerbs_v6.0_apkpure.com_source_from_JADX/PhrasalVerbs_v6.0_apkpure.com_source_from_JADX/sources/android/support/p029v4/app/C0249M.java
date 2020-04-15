package android.support.p029v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.M */
class C0249M extends C0253Q {
    C0249M() {
    }

    /* renamed from: a */
    private static boolean m900a(Transition transition) {
        return !C0253Q.m919a(transition.getTargetIds()) || !C0253Q.m919a(transition.getTargetNames()) || !C0253Q.m919a(transition.getTargetTypes());
    }

    /* renamed from: a */
    public Object mo881a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo882a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo883a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0246L(this, rect));
        }
    }

    /* renamed from: a */
    public void mo884a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo885a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0244J(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo886a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C0245K k = new C0245K(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.addListener(k);
    }

    /* renamed from: a */
    public void mo887a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo887a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m900a(transition) && C0253Q.m919a(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo888a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo888a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m900a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget((View) arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo889a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo890b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo891b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: b */
    public void mo892b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: b */
    public void mo893b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0253Q.m918a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo887a((Object) transitionSet, arrayList);
    }

    /* renamed from: b */
    public void mo894b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo888a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public Object mo895c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: c */
    public void mo896c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo901a(view, rect);
            transition.setEpicenterCallback(new C0243I(this, rect));
        }
    }
}
