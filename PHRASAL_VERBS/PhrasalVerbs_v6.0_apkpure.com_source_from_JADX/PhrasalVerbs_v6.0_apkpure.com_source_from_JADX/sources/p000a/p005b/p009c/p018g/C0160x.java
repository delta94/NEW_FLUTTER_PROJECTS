package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import p000a.p005b.p006a.C0015b;

/* renamed from: a.b.c.g.x */
public final class C0160x {
    /* renamed from: a */
    public static boolean m592a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0015b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0156v.m571l(viewGroup) == null) ? false : true;
    }
}
