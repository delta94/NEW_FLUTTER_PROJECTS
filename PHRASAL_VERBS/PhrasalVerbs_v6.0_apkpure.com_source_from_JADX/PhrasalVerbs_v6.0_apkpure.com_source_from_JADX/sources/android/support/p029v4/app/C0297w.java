package android.support.p029v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0231s;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p029v4.app.C0287p.C0289b;
import android.support.p029v4.app.C0287p.C0290c;
import android.support.p029v4.util.C0322d;
import android.support.p029v4.util.C0324f;
import android.support.p029v4.util.C0325g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.app.w */
final class C0297w extends C0287p implements Factory2 {

    /* renamed from: a */
    static boolean f856a = false;

    /* renamed from: b */
    static Field f857b;

    /* renamed from: c */
    static final Interpolator f858c = new DecelerateInterpolator(2.5f);

    /* renamed from: d */
    static final Interpolator f859d = new DecelerateInterpolator(1.5f);

    /* renamed from: e */
    static final Interpolator f860e = new AccelerateInterpolator(2.5f);

    /* renamed from: f */
    static final Interpolator f861f = new AccelerateInterpolator(1.5f);

    /* renamed from: A */
    String f862A;

    /* renamed from: B */
    boolean f863B;

    /* renamed from: C */
    ArrayList<C0268c> f864C;

    /* renamed from: D */
    ArrayList<Boolean> f865D;

    /* renamed from: E */
    ArrayList<C0276j> f866E;

    /* renamed from: F */
    Bundle f867F = null;

    /* renamed from: G */
    SparseArray<Parcelable> f868G = null;

    /* renamed from: H */
    ArrayList<C0307j> f869H;

    /* renamed from: I */
    C0308x f870I;

    /* renamed from: J */
    Runnable f871J = new C0291q(this);

    /* renamed from: g */
    ArrayList<C0305h> f872g;

    /* renamed from: h */
    boolean f873h;

    /* renamed from: i */
    int f874i = 0;

    /* renamed from: j */
    final ArrayList<C0276j> f875j = new ArrayList<>();

    /* renamed from: k */
    SparseArray<C0276j> f876k;

    /* renamed from: l */
    ArrayList<C0268c> f877l;

    /* renamed from: m */
    ArrayList<C0276j> f878m;

    /* renamed from: n */
    ArrayList<C0268c> f879n;

    /* renamed from: o */
    ArrayList<Integer> f880o;

    /* renamed from: p */
    ArrayList<C0290c> f881p;

    /* renamed from: q */
    private final CopyOnWriteArrayList<C0303f> f882q = new CopyOnWriteArrayList<>();

    /* renamed from: r */
    int f883r = 0;

    /* renamed from: s */
    C0286o f884s;

    /* renamed from: t */
    C0284m f885t;

    /* renamed from: u */
    C0276j f886u;

    /* renamed from: v */
    C0276j f887v;

    /* renamed from: w */
    boolean f888w;

    /* renamed from: x */
    boolean f889x;

    /* renamed from: y */
    boolean f890y;

    /* renamed from: z */
    boolean f891z;

    /* renamed from: android.support.v4.app.w$a */
    private static class C0298a extends C0299b {

        /* renamed from: b */
        View f892b;

        C0298a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f892b = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C0156v.m576q(this.f892b) || VERSION.SDK_INT >= 24) {
                this.f892b.post(new C0296v(this));
            } else {
                this.f892b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.w$b */
    private static class C0299b implements AnimationListener {

        /* renamed from: a */
        private final AnimationListener f893a;

        C0299b(AnimationListener animationListener) {
            this.f893a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            AnimationListener animationListener = this.f893a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            AnimationListener animationListener = this.f893a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            AnimationListener animationListener = this.f893a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.w$c */
    private static class C0300c {

        /* renamed from: a */
        public final Animation f894a;

        /* renamed from: b */
        public final Animator f895b;

        C0300c(Animator animator) {
            this.f894a = null;
            this.f895b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0300c(Animation animation) {
            this.f894a = animation;
            this.f895b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.w$d */
    private static class C0301d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f896a;

        C0301d(View view) {
            this.f896a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f896a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f896a.setLayerType(2, null);
        }
    }

    /* renamed from: android.support.v4.app.w$e */
    private static class C0302e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f897a;

        /* renamed from: b */
        private final View f898b;

        /* renamed from: c */
        private boolean f899c;

        /* renamed from: d */
        private boolean f900d;

        /* renamed from: e */
        private boolean f901e = true;

        C0302e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f897a = viewGroup;
            this.f898b = view;
            addAnimation(animation);
            this.f897a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f901e = true;
            if (this.f899c) {
                return !this.f900d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f899c = true;
                C0257V.m954a(this.f897a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f901e = true;
            if (this.f899c) {
                return !this.f900d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f899c = true;
                C0257V.m954a(this.f897a, this);
            }
            return true;
        }

        public void run() {
            if (this.f899c || !this.f901e) {
                this.f897a.endViewTransition(this.f898b);
                this.f900d = true;
                return;
            }
            this.f901e = false;
            this.f897a.post(this);
        }
    }

    /* renamed from: android.support.v4.app.w$f */
    private static final class C0303f {

        /* renamed from: a */
        final C0289b f902a;

        /* renamed from: b */
        final boolean f903b;
    }

    /* renamed from: android.support.v4.app.w$g */
    static class C0304g {

        /* renamed from: a */
        public static final int[] f904a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.w$h */
    interface C0305h {
        /* renamed from: a */
        boolean mo934a(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.w$i */
    private class C0306i implements C0305h {

        /* renamed from: a */
        final String f905a;

        /* renamed from: b */
        final int f906b;

        /* renamed from: c */
        final int f907c;

        C0306i(String str, int i, int i2) {
            this.f905a = str;
            this.f906b = i;
            this.f907c = i2;
        }

        /* renamed from: a */
        public boolean mo934a(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2) {
            C0276j jVar = C0297w.this.f887v;
            if (jVar != null && this.f906b < 0 && this.f905a == null) {
                C0287p Q = jVar.mo982Q();
                if (Q != null && Q.mo1148d()) {
                    return false;
                }
            }
            return C0297w.this.mo1192a(arrayList, arrayList2, this.f905a, this.f906b, this.f907c);
        }
    }

    /* renamed from: android.support.v4.app.w$j */
    static class C0307j implements C0279c {

        /* renamed from: a */
        final boolean f909a;

        /* renamed from: b */
        final C0268c f910b;

        /* renamed from: c */
        private int f911c;

        C0307j(C0268c cVar, boolean z) {
            this.f909a = z;
            this.f910b = cVar;
        }

        /* renamed from: a */
        public void mo1069a() {
            this.f911c++;
        }

        /* renamed from: b */
        public void mo1070b() {
            this.f911c--;
            if (this.f911c == 0) {
                this.f910b.f701a.mo1246w();
            }
        }

        /* renamed from: c */
        public void mo1255c() {
            C0268c cVar = this.f910b;
            cVar.f701a.mo1179a(cVar, this.f909a, false, false);
        }

        /* renamed from: d */
        public void mo1256d() {
            boolean z = this.f911c > 0;
            C0297w wVar = this.f910b.f701a;
            int size = wVar.f875j.size();
            for (int i = 0; i < size; i++) {
                C0276j jVar = (C0276j) wVar.f875j.get(i);
                jVar.mo1006a((C0279c) null);
                if (z && jVar.mo974E()) {
                    jVar.mo1015aa();
                }
            }
            C0268c cVar = this.f910b;
            cVar.f701a.mo1179a(cVar, this.f909a, !z, true);
        }

        /* renamed from: e */
        public boolean mo1257e() {
            return this.f911c == 0;
        }
    }

    C0297w() {
    }

    /* renamed from: A */
    private void m1206A() {
        this.f873h = false;
        this.f865D.clear();
        this.f864C.clear();
    }

    /* renamed from: B */
    private void m1207B() {
        SparseArray<C0276j> sparseArray = this.f876k;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            C0276j jVar = (C0276j) this.f876k.valueAt(i);
            if (jVar != null) {
                if (jVar.mo1037g() != null) {
                    int y = jVar.mo1067y();
                    View g = jVar.mo1037g();
                    Animation animation = g.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        g.clearAnimation();
                    }
                    jVar.mo1010a((View) null);
                    mo1181a(jVar, y, 0, 0, false);
                } else if (jVar.mo1039h() != null) {
                    jVar.mo1039h().end();
                }
            }
        }
    }

    /* renamed from: C */
    private void m1208C() {
        if (this.f869H != null) {
            while (!this.f869H.isEmpty()) {
                ((C0307j) this.f869H.remove(0)).mo1256d();
            }
        }
    }

    /* renamed from: a */
    private int m1209a(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0322d<C0276j> dVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0268c cVar = (C0268c) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (cVar.mo940e() && !cVar.mo933a(arrayList, i4 + 1, i2)) {
                if (this.f869H == null) {
                    this.f869H = new ArrayList<>();
                }
                C0307j jVar = new C0307j(cVar, booleanValue);
                this.f869H.add(jVar);
                cVar.mo930a((C0279c) jVar);
                if (booleanValue) {
                    cVar.mo938c();
                } else {
                    cVar.mo936b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, cVar);
                }
                m1215a(dVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static C0300c m1210a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f859d);
        alphaAnimation.setDuration(220);
        return new C0300c((Animation) alphaAnimation);
    }

    /* renamed from: a */
    static C0300c m1211a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f858c);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f859d);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0300c((Animation) animationSet);
    }

    /* renamed from: a */
    private static AnimationListener m1212a(Animation animation) {
        String str;
        try {
            if (f857b == null) {
                f857b = Animation.class.getDeclaredField("mListener");
                f857b.setAccessible(true);
            }
            return (AnimationListener) f857b.get(animation);
        } catch (NoSuchFieldException e) {
            e = e;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1213a(C0276j jVar, C0300c cVar, int i) {
        View view = jVar.f764K;
        ViewGroup viewGroup = jVar.f763J;
        viewGroup.startViewTransition(view);
        jVar.mo1018b(i);
        Animation animation = cVar.f894a;
        if (animation != null) {
            C0302e eVar = new C0302e(animation, viewGroup, view);
            jVar.mo1010a(jVar.f764K);
            eVar.setAnimationListener(new C0293s(this, m1212a((Animation) eVar), viewGroup, jVar));
            m1225b(view, cVar);
            jVar.f764K.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f895b;
        jVar.mo1001a(animator);
        animator.addListener(new C0294t(this, viewGroup, view, jVar));
        animator.setTarget(jVar.f764K);
        m1225b(jVar.f764K, cVar);
        animator.start();
    }

    /* renamed from: a */
    private static void m1214a(C0308x xVar) {
        if (xVar != null) {
            List<C0276j> b = xVar.mo1259b();
            if (b != null) {
                for (C0276j jVar : b) {
                    jVar.f759F = true;
                }
            }
            List<C0308x> a = xVar.mo1258a();
            if (a != null) {
                for (C0308x a2 : a) {
                    m1214a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1215a(C0322d<C0276j> dVar) {
        int i = this.f883r;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f875j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0276j jVar = (C0276j) this.f875j.get(i2);
                if (jVar.f778c < min) {
                    mo1181a(jVar, min, jVar.mo1058q(), jVar.mo1059r(), false);
                    if (jVar.f764K != null && !jVar.f756C && jVar.f769P) {
                        dVar.add(jVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1216a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0325g(str));
        C0286o oVar = this.f884s;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (oVar != null) {
            try {
                oVar.mo1107a(str3, null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            mo1145a(str3, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (((java.lang.Boolean) r9.get(r5)).booleanValue() != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r3.mo1255c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (((java.lang.Boolean) r9.get(r5)).booleanValue() != false) goto L_0x0032;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1217a(java.util.ArrayList<android.support.p029v4.app.C0268c> r8, java.util.ArrayList<java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList<android.support.v4.app.w$j> r0 = r7.f869H
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = 0
            goto L_0x000b
        L_0x0007:
            int r0 = r0.size()
        L_0x000b:
            r2 = r0
            r0 = 0
        L_0x000d:
            if (r0 >= r2) goto L_0x0074
            java.util.ArrayList<android.support.v4.app.w$j> r3 = r7.f869H
            java.lang.Object r3 = r3.get(r0)
            android.support.v4.app.w$j r3 = (android.support.p029v4.app.C0297w.C0307j) r3
            r4 = -1
            if (r8 == 0) goto L_0x0036
            boolean r5 = r3.f909a
            if (r5 != 0) goto L_0x0036
            android.support.v4.app.c r5 = r3.f910b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x0036
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0036
        L_0x0032:
            r3.mo1255c()
            goto L_0x0071
        L_0x0036:
            boolean r5 = r3.mo1257e()
            if (r5 != 0) goto L_0x004a
            if (r8 == 0) goto L_0x0071
            android.support.v4.app.c r5 = r3.f910b
            int r6 = r8.size()
            boolean r5 = r5.mo933a(r8, r1, r6)
            if (r5 == 0) goto L_0x0071
        L_0x004a:
            java.util.ArrayList<android.support.v4.app.w$j> r5 = r7.f869H
            r5.remove(r0)
            int r0 = r0 + -1
            int r2 = r2 + -1
            if (r8 == 0) goto L_0x006e
            boolean r5 = r3.f909a
            if (r5 != 0) goto L_0x006e
            android.support.v4.app.c r5 = r3.f910b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x006e
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x006e
            goto L_0x0032
        L_0x006e:
            r3.mo1256d()
        L_0x0071:
            int r0 = r0 + 1
            goto L_0x000d
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.app.C0297w.m1217a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: a */
    private static void m1218a(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0268c cVar = (C0268c) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                cVar.mo928a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                cVar.mo936b(z);
            } else {
                cVar.mo928a(1);
                cVar.mo938c();
            }
            i++;
        }
    }

    /* renamed from: a */
    static boolean m1219a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m1219a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1220a(C0300c cVar) {
        Animation animation = cVar.f894a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return m1219a(cVar.f895b);
        }
        List animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1221a(View view, C0300c cVar) {
        return view != null && cVar != null && VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0156v.m575p(view) && m1220a(cVar);
    }

    /* renamed from: a */
    private boolean m1222a(String str, int i, int i2) {
        mo1235o();
        m1229c(true);
        C0276j jVar = this.f887v;
        if (jVar != null && i < 0 && str == null) {
            C0287p Q = jVar.mo982Q();
            if (Q != null && Q.mo1148d()) {
                return true;
            }
        }
        boolean a = mo1192a(this.f864C, this.f865D, str, i, i2);
        if (a) {
            this.f873h = true;
            try {
                m1228c(this.f864C, this.f865D);
            } finally {
                m1206A();
            }
        }
        mo1232n();
        m1233y();
        return a;
    }

    /* renamed from: b */
    public static int m1223b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private void m1224b(C0322d<C0276j> dVar) {
        int size = dVar.size();
        for (int i = 0; i < size; i++) {
            C0276j jVar = (C0276j) dVar.mo1331c(i);
            if (!jVar.f788m) {
                View z = jVar.mo1068z();
                jVar.f771R = z.getAlpha();
                z.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private static void m1225b(View view, C0300c cVar) {
        if (view != null && cVar != null && m1221a(view, cVar)) {
            Animator animator = cVar.f895b;
            if (animator != null) {
                animator.addListener(new C0301d(view));
                return;
            }
            AnimationListener a = m1212a(cVar.f894a);
            view.setLayerType(2, null);
            cVar.f894a.setAnimationListener(new C0298a(view, a));
        }
    }

    /* renamed from: b */
    private void m1226b(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0268c> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0268c) arrayList3.get(i4)).f720t;
        ArrayList<C0276j> arrayList5 = this.f866E;
        if (arrayList5 == null) {
            this.f866E = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f866E.addAll(this.f875j);
        C0276j q = mo1239q();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0268c cVar = (C0268c) arrayList3.get(i6);
            q = !((Boolean) arrayList4.get(i6)).booleanValue() ? cVar.mo927a(this.f866E, q) : cVar.mo935b(this.f866E, q);
            z2 = z2 || cVar.f709i;
        }
        this.f866E.clear();
        if (!z) {
            C0241H.m877a(this, arrayList, arrayList2, i, i2, false);
        }
        m1218a(arrayList, arrayList2, i, i2);
        if (z) {
            C0322d dVar = new C0322d();
            m1215a(dVar);
            int a = m1209a(arrayList, arrayList2, i, i2, dVar);
            m1224b(dVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0241H.m877a(this, arrayList, arrayList2, i, i3, true);
            mo1174a(this.f883r, true);
        }
        while (i4 < i5) {
            C0268c cVar2 = (C0268c) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue()) {
                int i7 = cVar2.f713m;
                if (i7 >= 0) {
                    mo1195b(i7);
                    cVar2.f713m = -1;
                }
            }
            cVar2.mo941f();
            i4++;
        }
        if (z2) {
            mo1241s();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1227b(java.util.ArrayList<android.support.p029v4.app.C0268c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.w$h> r0 = r4.f872g     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<android.support.v4.app.w$h> r0 = r4.f872g     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.w$h> r0 = r4.f872g     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.w$h> r3 = r4.f872g     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.support.v4.app.w$h r3 = (android.support.p029v4.app.C0297w.C0305h) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo934a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.w$h> r5 = r4.f872g     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            android.support.v4.app.o r5 = r4.f884s     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo1141e()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f871J     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.app.C0297w.m1227b(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: c */
    private void m1228c(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1217a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0268c) arrayList.get(i)).f720t) {
                    if (i2 != i) {
                        m1226b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0268c) arrayList.get(i2)).f720t) {
                            i2++;
                        }
                    }
                    m1226b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m1226b(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: c */
    private void m1229c(boolean z) {
        if (this.f873h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f884s == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f884s.mo1141e().getLooper()) {
            if (!z) {
                m1234z();
            }
            if (this.f864C == null) {
                this.f864C = new ArrayList<>();
                this.f865D = new ArrayList<>();
            }
            this.f873h = true;
            try {
                m1217a(null, null);
            } finally {
                this.f873h = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: d */
    public static int m1230d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m1231e(int i) {
        try {
            this.f873h = true;
            mo1174a(i, false);
            this.f873h = false;
            mo1235o();
        } catch (Throwable th) {
            this.f873h = false;
            throw th;
        }
    }

    /* renamed from: p */
    private C0276j m1232p(C0276j jVar) {
        ViewGroup viewGroup = jVar.f763J;
        View view = jVar.f764K;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f875j.indexOf(jVar) - 1; indexOf >= 0; indexOf--) {
                C0276j jVar2 = (C0276j) this.f875j.get(indexOf);
                if (jVar2.f763J == viewGroup && jVar2.f764K != null) {
                    return jVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m1233y() {
        SparseArray<C0276j> sparseArray = this.f876k;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f876k.valueAt(size) == null) {
                    SparseArray<C0276j> sparseArray2 = this.f876k;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: z */
    private void m1234z() {
        if (mo1147c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f862A != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not perform this action inside of ");
            sb.append(this.f862A);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public C0235C mo1142a() {
        return new C0268c(this);
    }

    /* renamed from: a */
    public C0276j mo1170a(int i) {
        for (int size = this.f875j.size() - 1; size >= 0; size--) {
            C0276j jVar = (C0276j) this.f875j.get(size);
            if (jVar != null && jVar.f801z == i) {
                return jVar;
            }
        }
        SparseArray<C0276j> sparseArray = this.f876k;
        if (sparseArray != null) {
            for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
                C0276j jVar2 = (C0276j) this.f876k.valueAt(size2);
                if (jVar2 != null && jVar2.f801z == i) {
                    return jVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0276j mo1171a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        C0276j jVar = (C0276j) this.f876k.get(i);
        if (jVar != null) {
            return jVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": index ");
        sb.append(i);
        m1216a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: a */
    public C0276j mo1143a(String str) {
        if (str != null) {
            for (int size = this.f875j.size() - 1; size >= 0; size--) {
                C0276j jVar = (C0276j) this.f875j.get(size);
                if (jVar != null && str.equals(jVar.f755B)) {
                    return jVar;
                }
            }
        }
        SparseArray<C0276j> sparseArray = this.f876k;
        if (!(sparseArray == null || str == null)) {
            for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
                C0276j jVar2 = (C0276j) this.f876k.valueAt(size2);
                if (jVar2 != null && str.equals(jVar2.f755B)) {
                    return jVar2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0300c mo1172a(C0276j jVar, int i, boolean z, int i2) {
        int q = jVar.mo1058q();
        Animation a = jVar.mo995a(i, z, q);
        if (a != null) {
            return new C0300c(a);
        }
        Animator b = jVar.mo1016b(i, z, q);
        if (b != null) {
            return new C0300c(b);
        }
        if (q != 0) {
            boolean equals = "anim".equals(this.f884s.mo1139c().getResources().getResourceTypeName(q));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f884s.mo1139c(), q);
                    if (loadAnimation != null) {
                        return new C0300c(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f884s.mo1139c(), q);
                    if (loadAnimator != null) {
                        return new C0300c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f884s.mo1139c(), q);
                        if (loadAnimation2 != null) {
                            return new C0300c(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int b2 = m1223b(i, z);
        if (b2 < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return m1211a(this.f884s.mo1139c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1211a(this.f884s.mo1139c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1211a(this.f884s.mo1139c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1211a(this.f884s.mo1139c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1210a(this.f884s.mo1139c(), 0.0f, 1.0f);
            case 6:
                return m1210a(this.f884s.mo1139c(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f884s.mo1111h()) {
                    i2 = this.f884s.mo1110g();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* renamed from: a */
    public void mo1144a(int i, int i2) {
        if (i >= 0) {
            mo1187a((C0305h) new C0306i(null, i, i2), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo1173a(int i, C0268c cVar) {
        synchronized (this) {
            if (this.f879n == null) {
                this.f879n = new ArrayList<>();
            }
            int size = this.f879n.size();
            if (i < size) {
                if (f856a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting back stack index ");
                    sb.append(i);
                    sb.append(" to ");
                    sb.append(cVar);
                    Log.v("FragmentManager", sb.toString());
                }
                this.f879n.set(i, cVar);
            } else {
                while (size < i) {
                    this.f879n.add(null);
                    if (this.f880o == null) {
                        this.f880o = new ArrayList<>();
                    }
                    if (f856a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding available back stack index ");
                        sb2.append(size);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.f880o.add(Integer.valueOf(size));
                    size++;
                }
                if (f856a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding back stack index ");
                    sb3.append(i);
                    sb3.append(" with ");
                    sb3.append(cVar);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.f879n.add(cVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1174a(int i, boolean z) {
        if (this.f884s == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f883r) {
            this.f883r = i;
            if (this.f876k != null) {
                int size = this.f875j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo1220h((C0276j) this.f875j.get(i2));
                }
                int size2 = this.f876k.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0276j jVar = (C0276j) this.f876k.valueAt(i3);
                    if (jVar != null && ((jVar.f789n || jVar.f757D) && !jVar.f769P)) {
                        mo1220h(jVar);
                    }
                }
                mo1247x();
                if (this.f888w) {
                    C0286o oVar = this.f884s;
                    if (oVar != null && this.f883r == 4) {
                        oVar.mo1112i();
                        this.f888w = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1175a(Configuration configuration) {
        for (int i = 0; i < this.f875j.size(); i++) {
            C0276j jVar = (C0276j) this.f875j.get(i);
            if (jVar != null) {
                jVar.mo1005a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void mo1176a(Bundle bundle, String str, C0276j jVar) {
        int i = jVar.f782g;
        if (i >= 0) {
            bundle.putInt(str, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(jVar);
        sb.append(" is not currently in the FragmentManager");
        m1216a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1177a(Parcelable parcelable, C0308x xVar) {
        List list;
        List list2;
        if (parcelable != null) {
            C0310z zVar = (C0310z) parcelable;
            if (zVar.f915a != null) {
                if (xVar != null) {
                    List b = xVar.mo1259b();
                    list2 = xVar.mo1258a();
                    list = xVar.mo1260c();
                    int size = b != null ? b.size() : 0;
                    int i = 0;
                    while (i < size) {
                        C0276j jVar = (C0276j) b.get(i);
                        if (f856a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restoreAllState: re-attaching retained ");
                            sb.append(jVar);
                            Log.v("FragmentManager", sb.toString());
                        }
                        int i2 = 0;
                        while (true) {
                            C0234B[] bArr = zVar.f915a;
                            if (i2 >= bArr.length || bArr[i2].f607b == jVar.f782g) {
                                C0234B[] bArr2 = zVar.f915a;
                            } else {
                                i2++;
                            }
                        }
                        C0234B[] bArr22 = zVar.f915a;
                        if (i2 != bArr22.length) {
                            C0234B b2 = bArr22[i2];
                            b2.f617l = jVar;
                            jVar.f780e = null;
                            jVar.f794s = 0;
                            jVar.f791p = false;
                            jVar.f788m = false;
                            jVar.f785j = null;
                            Bundle bundle = b2.f616k;
                            if (bundle != null) {
                                bundle.setClassLoader(this.f884s.mo1139c().getClassLoader());
                                jVar.f780e = b2.f616k.getSparseParcelableArray("android:view_state");
                                jVar.f779d = b2.f616k;
                            }
                            i++;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Could not find active fragment with index ");
                            sb2.append(jVar.f782g);
                            m1216a((RuntimeException) new IllegalStateException(sb2.toString()));
                            throw null;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f876k = new SparseArray<>(zVar.f915a.length);
                int i3 = 0;
                while (true) {
                    C0234B[] bArr3 = zVar.f915a;
                    if (i3 >= bArr3.length) {
                        break;
                    }
                    C0234B b3 = bArr3[i3];
                    if (b3 != null) {
                        C0276j a = b3.mo843a(this.f884s, this.f885t, this.f886u, (list2 == null || i3 >= list2.size()) ? null : (C0308x) list2.get(i3), (list == null || i3 >= list.size()) ? null : (C0231s) list.get(i3));
                        if (f856a) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreAllState: active #");
                            sb3.append(i3);
                            sb3.append(": ");
                            sb3.append(a);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        this.f876k.put(a.f782g, a);
                        b3.f617l = null;
                    }
                    i3++;
                }
                if (xVar != null) {
                    List b4 = xVar.mo1259b();
                    int size2 = b4 != null ? b4.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        C0276j jVar2 = (C0276j) b4.get(i4);
                        int i5 = jVar2.f786k;
                        if (i5 >= 0) {
                            jVar2.f785j = (C0276j) this.f876k.get(i5);
                            if (jVar2.f785j == null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Re-attaching retained fragment ");
                                sb4.append(jVar2);
                                sb4.append(" target no longer exists: ");
                                sb4.append(jVar2.f786k);
                                Log.w("FragmentManager", sb4.toString());
                            }
                        }
                    }
                }
                this.f875j.clear();
                if (zVar.f916b != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr = zVar.f916b;
                        if (i6 >= iArr.length) {
                            break;
                        }
                        C0276j jVar3 = (C0276j) this.f876k.get(iArr[i6]);
                        if (jVar3 != null) {
                            jVar3.f788m = true;
                            if (f856a) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("restoreAllState: added #");
                                sb5.append(i6);
                                sb5.append(": ");
                                sb5.append(jVar3);
                                Log.v("FragmentManager", sb5.toString());
                            }
                            if (!this.f875j.contains(jVar3)) {
                                synchronized (this.f875j) {
                                    this.f875j.add(jVar3);
                                }
                                i6++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("No instantiated fragment for index #");
                            sb6.append(zVar.f916b[i6]);
                            m1216a((RuntimeException) new IllegalStateException(sb6.toString()));
                            throw null;
                        }
                    }
                }
                C0271e[] eVarArr = zVar.f917c;
                if (eVarArr != null) {
                    this.f877l = new ArrayList<>(eVarArr.length);
                    int i7 = 0;
                    while (true) {
                        C0271e[] eVarArr2 = zVar.f917c;
                        if (i7 >= eVarArr2.length) {
                            break;
                        }
                        C0268c a2 = eVarArr2[i7].mo945a(this);
                        if (f856a) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("restoreAllState: back stack #");
                            sb7.append(i7);
                            sb7.append(" (index ");
                            sb7.append(a2.f713m);
                            sb7.append("): ");
                            sb7.append(a2);
                            Log.v("FragmentManager", sb7.toString());
                            PrintWriter printWriter = new PrintWriter(new C0325g("FragmentManager"));
                            a2.mo932a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f877l.add(a2);
                        int i8 = a2.f713m;
                        if (i8 >= 0) {
                            mo1173a(i8, a2);
                        }
                        i7++;
                    }
                } else {
                    this.f877l = null;
                }
                int i9 = zVar.f918d;
                if (i9 >= 0) {
                    this.f887v = (C0276j) this.f876k.get(i9);
                }
                this.f874i = zVar.f919e;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1178a(C0268c cVar) {
        if (this.f877l == null) {
            this.f877l = new ArrayList<>();
        }
        this.f877l.add(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1179a(C0268c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.mo936b(z3);
        } else {
            cVar.mo938c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0241H.m877a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo1174a(this.f883r, true);
        }
        SparseArray<C0276j> sparseArray = this.f876k;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                C0276j jVar = (C0276j) this.f876k.valueAt(i);
                if (jVar != null && jVar.f764K != null && jVar.f769P && cVar.mo937b(jVar.f754A)) {
                    float f = jVar.f771R;
                    if (f > 0.0f) {
                        jVar.f764K.setAlpha(f);
                    }
                    if (z3) {
                        jVar.f771R = 0.0f;
                    } else {
                        jVar.f771R = -1.0f;
                        jVar.f769P = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1180a(C0276j jVar) {
        if (f856a) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(jVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (jVar.f757D) {
            jVar.f757D = false;
            if (jVar.f788m) {
                return;
            }
            if (!this.f875j.contains(jVar)) {
                if (f856a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(jVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f875j) {
                    this.f875j.add(jVar);
                }
                jVar.f788m = true;
                if (jVar.f760G && jVar.f761H) {
                    this.f888w = true;
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fragment already added: ");
            sb3.append(jVar);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r8v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r0 != 3) goto L_0x041a;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v5
      assigns: []
      uses: []
      mth insns count: 422
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x041f  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1181a(android.support.p029v4.app.C0276j r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.f788m
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.f757D
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r18
            goto L_0x0016
        L_0x0011:
            r0 = r18
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.f789n
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f778c
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r17.mo973D()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f778c
        L_0x002a:
            boolean r1 = r7.f766M
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.f778c
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.f778c
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x02d8
            boolean r0 = r7.f790o
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7.f791p
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            android.view.View r0 = r17.mo1037g()
            if (r0 != 0) goto L_0x0056
            android.animation.Animator r0 = r17.mo1039h()
            if (r0 == 0) goto L_0x006a
        L_0x0056:
            r7.mo1010a(r14)
            r7.mo1001a(r14)
            int r2 = r17.mo1067y()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.mo1181a(r1, r2, r3, r4, r5)
        L_0x006a:
            int r0 = r7.f778c
            if (r0 == 0) goto L_0x0076
            if (r0 == r8) goto L_0x01a0
            if (r0 == r10) goto L_0x0292
            if (r0 == r9) goto L_0x02b2
            goto L_0x041a
        L_0x0076:
            if (r11 <= 0) goto L_0x01a0
            boolean r0 = f856a
            if (r0 == 0) goto L_0x0090
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0090:
            android.os.Bundle r0 = r7.f779d
            if (r0 == 0) goto L_0x00e3
            android.support.v4.app.o r1 = r6.f884s
            android.content.Context r1 = r1.mo1139c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f779d
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f780e = r0
            android.os.Bundle r0 = r7.f779d
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.j r0 = r6.mo1171a(r0, r1)
            r7.f785j = r0
            android.support.v4.app.j r0 = r7.f785j
            if (r0 == 0) goto L_0x00c3
            android.os.Bundle r0 = r7.f779d
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.f787l = r0
        L_0x00c3:
            java.lang.Boolean r0 = r7.f781f
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.booleanValue()
            r7.f767N = r0
            r7.f781f = r14
            goto L_0x00da
        L_0x00d0:
            android.os.Bundle r0 = r7.f779d
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f767N = r0
        L_0x00da:
            boolean r0 = r7.f767N
            if (r0 != 0) goto L_0x00e3
            r7.f766M = r8
            if (r11 <= r10) goto L_0x00e3
            r11 = 2
        L_0x00e3:
            android.support.v4.app.o r0 = r6.f884s
            r7.f796u = r0
            android.support.v4.app.j r1 = r6.f886u
            r7.f800y = r1
            if (r1 == 0) goto L_0x00f0
            android.support.v4.app.w r0 = r1.f797v
            goto L_0x00f4
        L_0x00f0:
            android.support.v4.app.w r0 = r0.mo1140d()
        L_0x00f4:
            r7.f795t = r0
            android.support.v4.app.j r0 = r7.f785j
            java.lang.String r15 = "Fragment "
            if (r0 == 0) goto L_0x013a
            android.util.SparseArray<android.support.v4.app.j> r1 = r6.f876k
            int r0 = r0.f782g
            java.lang.Object r0 = r1.get(r0)
            android.support.v4.app.j r1 = r7.f785j
            if (r0 != r1) goto L_0x0116
            int r0 = r1.f778c
            if (r0 >= r8) goto L_0x013a
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.mo1181a(r1, r2, r3, r4, r5)
            goto L_0x013a
        L_0x0116:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.j r2 = r7.f785j
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013a:
            android.support.v4.app.o r0 = r6.f884s
            android.content.Context r0 = r0.mo1139c()
            r6.mo1197b(r7, r0, r13)
            r7.f762I = r13
            android.support.v4.app.o r0 = r6.f884s
            android.content.Context r0 = r0.mo1139c()
            r7.mo953a(r0)
            boolean r0 = r7.f762I
            if (r0 == 0) goto L_0x0186
            android.support.v4.app.j r0 = r7.f800y
            if (r0 != 0) goto L_0x015c
            android.support.v4.app.o r0 = r6.f884s
            r0.mo1106a(r7)
            goto L_0x015f
        L_0x015c:
            r0.mo1007a(r7)
        L_0x015f:
            android.support.v4.app.o r0 = r6.f884s
            android.content.Context r0 = r0.mo1139c()
            r6.mo1182a(r7, r0, r13)
            boolean r0 = r7.f773T
            if (r0 != 0) goto L_0x017c
            android.os.Bundle r0 = r7.f779d
            r6.mo1204c(r7, r0, r13)
            android.os.Bundle r0 = r7.f779d
            r7.mo1040h(r0)
            android.os.Bundle r0 = r7.f779d
            r6.mo1198b(r7, r0, r13)
            goto L_0x0183
        L_0x017c:
            android.os.Bundle r0 = r7.f779d
            r7.mo1047k(r0)
            r7.f778c = r8
        L_0x0183:
            r7.f759F = r13
            goto L_0x01a0
        L_0x0186:
            android.support.v4.app.X r0 = new android.support.v4.app.X
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            r16.mo1207d(r17)
            if (r11 <= r8) goto L_0x0292
            boolean r0 = f856a
            if (r0 == 0) goto L_0x01bd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x01bd:
            boolean r0 = r7.f790o
            if (r0 != 0) goto L_0x027d
            int r0 = r7.f754A
            if (r0 == 0) goto L_0x0233
            r1 = -1
            if (r0 == r1) goto L_0x0214
            android.support.v4.app.m r1 = r6.f885t
            android.view.View r0 = r1.mo968a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0234
            boolean r1 = r7.f792q
            if (r1 == 0) goto L_0x01d7
            goto L_0x0234
        L_0x01d7:
            android.content.res.Resources r0 = r17.mo1063u()     // Catch:{ NotFoundException -> 0x01e2 }
            int r1 = r7.f754A     // Catch:{ NotFoundException -> 0x01e2 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x01e2 }
            goto L_0x01e4
        L_0x01e2:
            java.lang.String r0 = "unknown"
        L_0x01e4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.f754A
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.m1216a(r1)
            throw r14
        L_0x0214:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m1216a(r0)
            throw r14
        L_0x0233:
            r0 = r14
        L_0x0234:
            r7.f763J = r0
            android.os.Bundle r1 = r7.f779d
            android.view.LayoutInflater r1 = r7.mo1043i(r1)
            android.os.Bundle r2 = r7.f779d
            r7.mo1019b(r1, r0, r2)
            android.view.View r1 = r7.f764K
            if (r1 == 0) goto L_0x027b
            r7.f765L = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0251
            android.view.View r1 = r7.f764K
            r0.addView(r1)
        L_0x0251:
            boolean r0 = r7.f756C
            if (r0 == 0) goto L_0x025c
            android.view.View r0 = r7.f764K
            r1 = 8
            r0.setVisibility(r1)
        L_0x025c:
            android.view.View r0 = r7.f764K
            android.os.Bundle r1 = r7.f779d
            r7.mo1011a(r0, r1)
            android.view.View r0 = r7.f764K
            android.os.Bundle r1 = r7.f779d
            r6.mo1184a(r7, r0, r1, r13)
            android.view.View r0 = r7.f764K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0277
            android.view.ViewGroup r0 = r7.f763J
            if (r0 == 0) goto L_0x0277
            goto L_0x0278
        L_0x0277:
            r8 = 0
        L_0x0278:
            r7.f769P = r8
            goto L_0x027d
        L_0x027b:
            r7.f765L = r14
        L_0x027d:
            android.os.Bundle r0 = r7.f779d
            r7.mo1038g(r0)
            android.os.Bundle r0 = r7.f779d
            r6.mo1183a(r7, r0, r13)
            android.view.View r0 = r7.f764K
            if (r0 == 0) goto L_0x0290
            android.os.Bundle r0 = r7.f779d
            r7.mo1049l(r0)
        L_0x0290:
            r7.f779d = r14
        L_0x0292:
            if (r11 <= r10) goto L_0x02b2
            boolean r0 = f856a
            if (r0 == 0) goto L_0x02ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02ac:
            r17.mo989X()
            r6.mo1215f(r7, r13)
        L_0x02b2:
            if (r11 <= r9) goto L_0x041a
            boolean r0 = f856a
            if (r0 == 0) goto L_0x02cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02cc:
            r17.mo988W()
            r6.mo1212e(r7, r13)
            r7.f779d = r14
            r7.f780e = r14
            goto L_0x041a
        L_0x02d8:
            if (r0 <= r11) goto L_0x041a
            if (r0 == r8) goto L_0x03a6
            if (r0 == r10) goto L_0x0325
            if (r0 == r9) goto L_0x0305
            r1 = 4
            if (r0 == r1) goto L_0x02e5
            goto L_0x041a
        L_0x02e5:
            if (r11 >= r1) goto L_0x0305
            boolean r0 = f856a
            if (r0 == 0) goto L_0x02ff
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02ff:
            r17.mo987V()
            r6.mo1209d(r7, r13)
        L_0x0305:
            if (r11 >= r9) goto L_0x0325
            boolean r0 = f856a
            if (r0 == 0) goto L_0x031f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x031f:
            r17.mo990Y()
            r6.mo1218g(r7, r13)
        L_0x0325:
            if (r11 >= r10) goto L_0x03a6
            boolean r0 = f856a
            if (r0 == 0) goto L_0x033f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x033f:
            android.view.View r0 = r7.f764K
            if (r0 == 0) goto L_0x0352
            android.support.v4.app.o r0 = r6.f884s
            boolean r0 = r0.mo1108b(r7)
            if (r0 == 0) goto L_0x0352
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f780e
            if (r0 != 0) goto L_0x0352
            r16.mo1231m(r17)
        L_0x0352:
            r17.mo984S()
            r6.mo1221h(r7, r13)
            android.view.View r0 = r7.f764K
            if (r0 == 0) goto L_0x0397
            android.view.ViewGroup r1 = r7.f763J
            if (r1 == 0) goto L_0x0397
            r1.endViewTransition(r0)
            android.view.View r0 = r7.f764K
            r0.clearAnimation()
            int r0 = r6.f883r
            r1 = 0
            if (r0 <= 0) goto L_0x0388
            boolean r0 = r6.f891z
            if (r0 != 0) goto L_0x0388
            android.view.View r0 = r7.f764K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0388
            float r0 = r7.f771R
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0388
            r0 = r19
            r2 = r20
            android.support.v4.app.w$c r0 = r6.mo1172a(r7, r0, r13, r2)
            goto L_0x0389
        L_0x0388:
            r0 = r14
        L_0x0389:
            r7.f771R = r1
            if (r0 == 0) goto L_0x0390
            r6.m1213a(r7, r0, r11)
        L_0x0390:
            android.view.ViewGroup r0 = r7.f763J
            android.view.View r1 = r7.f764K
            r0.removeView(r1)
        L_0x0397:
            r7.f763J = r14
            r7.f764K = r14
            r7.f776W = r14
            android.arch.lifecycle.m<android.arch.lifecycle.f> r0 = r7.f777X
            r0.mo799a(r14)
            r7.f765L = r14
            r7.f791p = r13
        L_0x03a6:
            if (r11 >= r8) goto L_0x041a
            boolean r0 = r6.f891z
            if (r0 == 0) goto L_0x03cd
            android.view.View r0 = r17.mo1037g()
            if (r0 == 0) goto L_0x03bd
            android.view.View r0 = r17.mo1037g()
            r7.mo1010a(r14)
            r0.clearAnimation()
            goto L_0x03cd
        L_0x03bd:
            android.animation.Animator r0 = r17.mo1039h()
            if (r0 == 0) goto L_0x03cd
            android.animation.Animator r0 = r17.mo1039h()
            r7.mo1001a(r14)
            r0.cancel()
        L_0x03cd:
            android.view.View r0 = r17.mo1037g()
            if (r0 != 0) goto L_0x0416
            android.animation.Animator r0 = r17.mo1039h()
            if (r0 == 0) goto L_0x03da
            goto L_0x0416
        L_0x03da:
            boolean r0 = f856a
            if (r0 == 0) goto L_0x03f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x03f2:
            boolean r0 = r7.f759F
            if (r0 != 0) goto L_0x03fd
            r17.mo983R()
            r6.mo1199b(r7, r13)
            goto L_0x03ff
        L_0x03fd:
            r7.f778c = r13
        L_0x03ff:
            r17.mo985T()
            r6.mo1205c(r7, r13)
            if (r21 != 0) goto L_0x041a
            boolean r0 = r7.f759F
            if (r0 != 0) goto L_0x040f
            r16.mo1217g(r17)
            goto L_0x041a
        L_0x040f:
            r7.f796u = r14
            r7.f800y = r14
            r7.f795t = r14
            goto L_0x041a
        L_0x0416:
            r7.mo1018b(r11)
            goto L_0x041b
        L_0x041a:
            r8 = r11
        L_0x041b:
            int r0 = r7.f778c
            if (r0 == r8) goto L_0x044c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; "
            r0.append(r1)
            java.lang.String r1 = "expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f778c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.f778c = r8
        L_0x044c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.app.C0297w.mo1181a(android.support.v4.app.j, int, int, int, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1182a(C0276j jVar, Context context, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1182a(jVar, context, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1150a((C0287p) this, jVar, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1183a(C0276j jVar, Bundle bundle, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1183a(jVar, bundle, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1151a((C0287p) this, jVar, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1184a(C0276j jVar, View view, Bundle bundle, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1184a(jVar, view, bundle, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1152a(this, jVar, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo1185a(C0276j jVar, boolean z) {
        if (f856a) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(jVar);
            Log.v("FragmentManager", sb.toString());
        }
        mo1214f(jVar);
        if (jVar.f757D) {
            return;
        }
        if (!this.f875j.contains(jVar)) {
            synchronized (this.f875j) {
                this.f875j.add(jVar);
            }
            jVar.f788m = true;
            jVar.f789n = false;
            if (jVar.f764K == null) {
                jVar.f770Q = false;
            }
            if (jVar.f760G && jVar.f761H) {
                this.f888w = true;
            }
            if (z) {
                mo1223i(jVar);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment already added: ");
        sb2.append(jVar);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: a */
    public void mo1186a(C0286o oVar, C0284m mVar, C0276j jVar) {
        if (this.f884s == null) {
            this.f884s = oVar;
            this.f885t = mVar;
            this.f886u = jVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public void mo1187a(C0305h hVar, boolean z) {
        if (!z) {
            m1234z();
        }
        synchronized (this) {
            if (!this.f891z) {
                if (this.f884s != null) {
                    if (this.f872g == null) {
                        this.f872g = new ArrayList<>();
                    }
                    this.f872g.add(hVar);
                    mo1246w();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo1188a(Menu menu) {
        if (this.f883r >= 1) {
            for (int i = 0; i < this.f875j.size(); i++) {
                C0276j jVar = (C0276j) this.f875j.get(i);
                if (jVar != null) {
                    jVar.mo1024c(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1145a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        SparseArray<C0276j> sparseArray = this.f876k;
        if (sparseArray != null) {
            int size = sparseArray.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    C0276j jVar = (C0276j) this.f876k.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(jVar);
                    if (jVar != null) {
                        jVar.mo1012a(sb2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size2 = this.f875j.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                C0276j jVar2 = (C0276j) this.f875j.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(jVar2.toString());
            }
        }
        ArrayList<C0276j> arrayList = this.f878m;
        if (arrayList != null) {
            int size3 = arrayList.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C0276j jVar3 = (C0276j) this.f878m.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(jVar3.toString());
                }
            }
        }
        ArrayList<C0268c> arrayList2 = this.f877l;
        if (arrayList2 != null) {
            int size4 = arrayList2.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    C0268c cVar = (C0268c) this.f877l.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(cVar.toString());
                    cVar.mo931a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f879n != null) {
                int size5 = this.f879n.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        C0268c cVar2 = (C0268c) this.f879n.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(cVar2);
                    }
                }
            }
            if (this.f880o != null && this.f880o.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f880o.toArray()));
            }
        }
        ArrayList<C0305h> arrayList3 = this.f872g;
        if (arrayList3 != null) {
            int size6 = arrayList3.size();
            if (size6 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size6; i6++) {
                    C0305h hVar = (C0305h) this.f872g.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f884s);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f885t);
        if (this.f886u != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f886u);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f883r);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f889x);
        printWriter.print(" mStopped=");
        printWriter.print(this.f890y);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f891z);
        if (this.f888w) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f888w);
        }
        if (this.f862A != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f862A);
        }
    }

    /* renamed from: a */
    public void mo1189a(boolean z) {
        for (int size = this.f875j.size() - 1; size >= 0; size--) {
            C0276j jVar = (C0276j) this.f875j.get(size);
            if (jVar != null) {
                jVar.mo1028d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1190a(Menu menu, MenuInflater menuInflater) {
        if (this.f883r < 1) {
            return false;
        }
        ArrayList<C0276j> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f875j.size(); i++) {
            C0276j jVar = (C0276j) this.f875j.get(i);
            if (jVar != null && jVar.mo1022b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(jVar);
                z = true;
            }
        }
        if (this.f878m != null) {
            for (int i2 = 0; i2 < this.f878m.size(); i2++) {
                C0276j jVar2 = (C0276j) this.f878m.get(i2);
                if (arrayList == null || !arrayList.contains(jVar2)) {
                    jVar2.mo979J();
                }
            }
        }
        this.f878m = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo1191a(MenuItem menuItem) {
        if (this.f883r < 1) {
            return false;
        }
        for (int i = 0; i < this.f875j.size(); i++) {
            C0276j jVar = (C0276j) this.f875j.get(i);
            if (jVar != null && jVar.mo1026c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1192a(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0268c> arrayList3 = this.f877l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f877l.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                i3 = this.f877l.size() - 1;
                while (i3 >= 0) {
                    C0268c cVar = (C0268c) this.f877l.get(i3);
                    if ((str != null && str.equals(cVar.mo939d())) || (i >= 0 && i == cVar.f713m)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0268c cVar2 = (C0268c) this.f877l.get(i3);
                        if ((str == null || !str.equals(cVar2.mo939d())) && (i < 0 || i != cVar2.f713m)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f877l.size() - 1) {
                return false;
            }
            for (int size2 = this.f877l.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f877l.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: b */
    public int mo1193b(C0268c cVar) {
        synchronized (this) {
            if (this.f880o != null) {
                if (this.f880o.size() > 0) {
                    int intValue = ((Integer) this.f880o.remove(this.f880o.size() - 1)).intValue();
                    if (f856a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding back stack index ");
                        sb.append(intValue);
                        sb.append(" with ");
                        sb.append(cVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    this.f879n.set(intValue, cVar);
                    return intValue;
                }
            }
            if (this.f879n == null) {
                this.f879n = new ArrayList<>();
            }
            int size = this.f879n.size();
            if (f856a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting back stack index ");
                sb2.append(size);
                sb2.append(" to ");
                sb2.append(cVar);
                Log.v("FragmentManager", sb2.toString());
            }
            this.f879n.add(cVar);
            return size;
        }
    }

    /* renamed from: b */
    public C0276j mo1194b(String str) {
        SparseArray<C0276j> sparseArray = this.f876k;
        if (!(sparseArray == null || str == null)) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                C0276j jVar = (C0276j) this.f876k.valueAt(size);
                if (jVar != null) {
                    C0276j a = jVar.mo992a(str);
                    if (a != null) {
                        return a;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public List<C0276j> mo1146b() {
        List<C0276j> list;
        if (this.f875j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f875j) {
            list = (List) this.f875j.clone();
        }
        return list;
    }

    /* renamed from: b */
    public void mo1195b(int i) {
        synchronized (this) {
            this.f879n.set(i, null);
            if (this.f880o == null) {
                this.f880o = new ArrayList<>();
            }
            if (f856a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing back stack index ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            this.f880o.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1196b(C0276j jVar) {
        if (jVar.f764K != null) {
            C0300c a = mo1172a(jVar, jVar.mo1059r(), !jVar.f756C, jVar.mo1060s());
            if (a != null) {
                Animator animator = a.f895b;
                if (animator != null) {
                    animator.setTarget(jVar.f764K);
                    if (!jVar.f756C) {
                        jVar.f764K.setVisibility(0);
                    } else if (jVar.mo972C()) {
                        jVar.mo1035f(false);
                    } else {
                        ViewGroup viewGroup = jVar.f763J;
                        View view = jVar.f764K;
                        viewGroup.startViewTransition(view);
                        a.f895b.addListener(new C0295u(this, viewGroup, view, jVar));
                    }
                    m1225b(jVar.f764K, a);
                    a.f895b.start();
                }
            }
            if (a != null) {
                m1225b(jVar.f764K, a);
                jVar.f764K.startAnimation(a.f894a);
                a.f894a.start();
            }
            jVar.f764K.setVisibility((!jVar.f756C || jVar.mo972C()) ? 0 : 8);
            if (jVar.mo972C()) {
                jVar.mo1035f(false);
            }
        }
        if (jVar.f788m && jVar.f760G && jVar.f761H) {
            this.f888w = true;
        }
        jVar.f770Q = false;
        jVar.mo1013a(jVar.f756C);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1197b(C0276j jVar, Context context, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1197b(jVar, context, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1154b((C0287p) this, jVar, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1198b(C0276j jVar, Bundle bundle, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1198b(jVar, bundle, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1155b((C0287p) this, jVar, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1199b(C0276j jVar, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1199b(jVar, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1149a(this, jVar);
            }
        }
    }

    /* renamed from: b */
    public void mo1200b(boolean z) {
        for (int size = this.f875j.size() - 1; size >= 0; size--) {
            C0276j jVar = (C0276j) this.f875j.get(size);
            if (jVar != null) {
                jVar.mo1031e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo1201b(Menu menu) {
        if (this.f883r < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f875j.size(); i++) {
            C0276j jVar = (C0276j) this.f875j.get(i);
            if (jVar != null && jVar.mo1029d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo1202b(MenuItem menuItem) {
        if (this.f883r < 1) {
            return false;
        }
        for (int i = 0; i < this.f875j.size(); i++) {
            C0276j jVar = (C0276j) this.f875j.get(i);
            if (jVar != null && jVar.mo1030d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo1203c(C0276j jVar) {
        if (f856a) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(jVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (!jVar.f757D) {
            jVar.f757D = true;
            if (jVar.f788m) {
                if (f856a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(jVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f875j) {
                    this.f875j.remove(jVar);
                }
                if (jVar.f760G && jVar.f761H) {
                    this.f888w = true;
                }
                jVar.f788m = false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1204c(C0276j jVar, Bundle bundle, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1204c(jVar, bundle, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1157c(this, jVar, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1205c(C0276j jVar, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1205c(jVar, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1153b(this, jVar);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1147c() {
        return this.f889x || this.f890y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1206c(int i) {
        return this.f883r >= i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1207d(C0276j jVar) {
        if (jVar.f790o && !jVar.f793r) {
            jVar.mo1019b(jVar.mo1043i(jVar.f779d), (ViewGroup) null, jVar.f779d);
            View view = jVar.f764K;
            if (view != null) {
                jVar.f765L = view;
                view.setSaveFromParentEnabled(false);
                if (jVar.f756C) {
                    jVar.f764K.setVisibility(8);
                }
                jVar.mo1011a(jVar.f764K, jVar.f779d);
                mo1184a(jVar, jVar.f764K, jVar.f779d, false);
                return;
            }
            jVar.f765L = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1208d(C0276j jVar, Bundle bundle, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1208d(jVar, bundle, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1159d(this, jVar, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1209d(C0276j jVar, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1209d(jVar, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1156c(this, jVar);
            }
        }
    }

    /* renamed from: d */
    public boolean mo1148d() {
        m1234z();
        return m1222a((String) null, -1, 0);
    }

    /* renamed from: e */
    public void mo1210e() {
        this.f889x = false;
        this.f890y = false;
        m1231e(2);
    }

    /* renamed from: e */
    public void mo1211e(C0276j jVar) {
        if (f856a) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(jVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (!jVar.f756C) {
            jVar.f756C = true;
            jVar.f770Q = true ^ jVar.f770Q;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1212e(C0276j jVar, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1212e(jVar, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1158d(this, jVar);
            }
        }
    }

    /* renamed from: f */
    public void mo1213f() {
        this.f889x = false;
        this.f890y = false;
        m1231e(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1214f(C0276j jVar) {
        if (jVar.f782g < 0) {
            int i = this.f874i;
            this.f874i = i + 1;
            jVar.mo999a(i, this.f886u);
            if (this.f876k == null) {
                this.f876k = new SparseArray<>();
            }
            this.f876k.put(jVar.f782g, jVar);
            if (f856a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Allocated fragment index ");
                sb.append(jVar);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1215f(C0276j jVar, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1215f(jVar, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1160e(this, jVar);
            }
        }
    }

    /* renamed from: g */
    public void mo1216g() {
        this.f891z = true;
        mo1235o();
        m1231e(0);
        this.f884s = null;
        this.f885t = null;
        this.f886u = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1217g(C0276j jVar) {
        if (jVar.f782g >= 0) {
            if (f856a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing fragment index ");
                sb.append(jVar);
                Log.v("FragmentManager", sb.toString());
            }
            this.f876k.put(jVar.f782g, null);
            jVar.mo970A();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1218g(C0276j jVar, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1218g(jVar, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1161f(this, jVar);
            }
        }
    }

    /* renamed from: h */
    public void mo1219h() {
        m1231e(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1220h(C0276j jVar) {
        if (jVar != null) {
            int i = this.f883r;
            if (jVar.f789n) {
                i = jVar.mo973D() ? Math.min(i, 1) : Math.min(i, 0);
            }
            mo1181a(jVar, i, jVar.mo1059r(), jVar.mo1060s(), false);
            if (jVar.f764K != null) {
                C0276j p = m1232p(jVar);
                if (p != null) {
                    View view = p.f764K;
                    ViewGroup viewGroup = jVar.f763J;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(jVar.f764K);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(jVar.f764K, indexOfChild);
                    }
                }
                if (jVar.f769P && jVar.f763J != null) {
                    float f = jVar.f771R;
                    if (f > 0.0f) {
                        jVar.f764K.setAlpha(f);
                    }
                    jVar.f771R = 0.0f;
                    jVar.f769P = false;
                    C0300c a = mo1172a(jVar, jVar.mo1059r(), true, jVar.mo1060s());
                    if (a != null) {
                        m1225b(jVar.f764K, a);
                        Animation animation = a.f894a;
                        if (animation != null) {
                            jVar.f764K.startAnimation(animation);
                        } else {
                            a.f895b.setTarget(jVar.f764K);
                            a.f895b.start();
                        }
                    }
                }
            }
            if (jVar.f770Q) {
                mo1196b(jVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1221h(C0276j jVar, boolean z) {
        C0276j jVar2 = this.f886u;
        if (jVar2 != null) {
            C0287p p = jVar2.mo1057p();
            if (p instanceof C0297w) {
                ((C0297w) p).mo1221h(jVar, true);
            }
        }
        Iterator it = this.f882q.iterator();
        while (it.hasNext()) {
            C0303f fVar = (C0303f) it.next();
            if (!z || fVar.f903b) {
                fVar.f902a.mo1162g(this, jVar);
            }
        }
    }

    /* renamed from: i */
    public void mo1222i() {
        for (int i = 0; i < this.f875j.size(); i++) {
            C0276j jVar = (C0276j) this.f875j.get(i);
            if (jVar != null) {
                jVar.mo986U();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1223i(C0276j jVar) {
        mo1181a(jVar, this.f883r, 0, 0, false);
    }

    /* renamed from: j */
    public void mo1224j() {
        m1231e(3);
    }

    /* renamed from: j */
    public void mo1225j(C0276j jVar) {
        if (jVar.f766M) {
            if (this.f873h) {
                this.f863B = true;
                return;
            }
            jVar.f766M = false;
            mo1181a(jVar, this.f883r, 0, 0, false);
        }
    }

    /* renamed from: k */
    public void mo1226k() {
        this.f889x = false;
        this.f890y = false;
        m1231e(4);
    }

    /* renamed from: k */
    public void mo1227k(C0276j jVar) {
        if (f856a) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(jVar);
            sb.append(" nesting=");
            sb.append(jVar.f794s);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !jVar.mo973D();
        if (!jVar.f757D || z) {
            synchronized (this.f875j) {
                this.f875j.remove(jVar);
            }
            if (jVar.f760G && jVar.f761H) {
                this.f888w = true;
            }
            jVar.f788m = false;
            jVar.f789n = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Bundle mo1228l(C0276j jVar) {
        Bundle bundle;
        if (this.f867F == null) {
            this.f867F = new Bundle();
        }
        jVar.mo1045j(this.f867F);
        mo1208d(jVar, this.f867F, false);
        if (!this.f867F.isEmpty()) {
            bundle = this.f867F;
            this.f867F = null;
        } else {
            bundle = null;
        }
        if (jVar.f764K != null) {
            mo1231m(jVar);
        }
        if (jVar.f780e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", jVar.f780e);
        }
        if (!jVar.f767N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", jVar.f767N);
        }
        return bundle;
    }

    /* renamed from: l */
    public void mo1229l() {
        this.f889x = false;
        this.f890y = false;
        m1231e(3);
    }

    /* renamed from: m */
    public void mo1230m() {
        this.f890y = true;
        m1231e(2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo1231m(C0276j jVar) {
        if (jVar.f765L != null) {
            SparseArray<Parcelable> sparseArray = this.f868G;
            if (sparseArray == null) {
                this.f868G = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            jVar.f765L.saveHierarchyState(this.f868G);
            if (this.f868G.size() > 0) {
                jVar.f780e = this.f868G;
                this.f868G = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo1232n() {
        if (this.f863B) {
            this.f863B = false;
            mo1247x();
        }
    }

    /* renamed from: n */
    public void mo1233n(C0276j jVar) {
        if (jVar == null || (this.f876k.get(jVar.f782g) == jVar && (jVar.f796u == null || jVar.mo1057p() == this))) {
            this.f887v = jVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(jVar);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o */
    public void mo1234o(C0276j jVar) {
        if (f856a) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(jVar);
            Log.v("FragmentManager", sb.toString());
        }
        if (jVar.f756C) {
            jVar.f756C = false;
            jVar.f770Q = !jVar.f770Q;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o */
    public boolean mo1235o() {
        m1229c(true);
        boolean z = false;
        while (m1227b(this.f864C, this.f865D)) {
            this.f873h = true;
            try {
                m1228c(this.f864C, this.f865D);
                m1206A();
                z = true;
            } catch (Throwable th) {
                m1206A();
                throw th;
            }
        }
        mo1232n();
        m1233y();
        return z;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0276j jVar;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C0304g.f904a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0276j.m1016a(this.f884s.mo1139c(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        C0276j a = resourceId != -1 ? mo1170a(resourceId) : null;
        if (a == null && string != null) {
            a = mo1143a(string);
        }
        if (a == null && i != -1) {
            a = mo1170a(i);
        }
        if (f856a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str3);
            sb2.append(" existing=");
            sb2.append(a);
            Log.v("FragmentManager", sb2.toString());
        }
        if (a == null) {
            C0276j a2 = this.f885t.mo967a(context, str3, null);
            a2.f790o = true;
            a2.f801z = resourceId != 0 ? resourceId : i;
            a2.f754A = i;
            a2.f755B = string;
            a2.f791p = true;
            a2.f795t = this;
            C0286o oVar = this.f884s;
            a2.f796u = oVar;
            a2.mo1004a(oVar.mo1139c(), attributeSet2, a2.f779d);
            mo1185a(a2, true);
            jVar = a2;
        } else if (!a.f791p) {
            a.f791p = true;
            C0286o oVar2 = this.f884s;
            a.f796u = oVar2;
            if (!a.f759F) {
                a.mo1004a(oVar2.mo1139c(), attributeSet2, a.f779d);
            }
            jVar = a;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(" with another fragment for ");
            sb3.append(str3);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (this.f883r >= 1 || !jVar.f790o) {
            mo1223i(jVar);
        } else {
            mo1181a(jVar, 1, 0, 0, false);
        }
        View view2 = jVar.f764K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (jVar.f764K.getTag() == null) {
                jVar.f764K.setTag(string);
            }
            return jVar.f764K;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(str3);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public Factory2 mo1238p() {
        return this;
    }

    /* renamed from: q */
    public C0276j mo1239q() {
        return this.f887v;
    }

    /* renamed from: r */
    public void mo1240r() {
        this.f870I = null;
        this.f889x = false;
        this.f890y = false;
        int size = this.f875j.size();
        for (int i = 0; i < size; i++) {
            C0276j jVar = (C0276j) this.f875j.get(i);
            if (jVar != null) {
                jVar.mo977H();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo1241s() {
        if (this.f881p != null) {
            for (int i = 0; i < this.f881p.size(); i++) {
                ((C0290c) this.f881p.get(i)).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public C0308x mo1242t() {
        m1214a(this.f870I);
        return this.f870I;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f886u;
        if (obj == null) {
            obj = this.f884s;
        }
        C0324f.m1400a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public Parcelable mo1244u() {
        int[] iArr;
        m1208C();
        m1207B();
        mo1235o();
        this.f889x = true;
        C0271e[] eVarArr = null;
        this.f870I = null;
        SparseArray<C0276j> sparseArray = this.f876k;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size = this.f876k.size();
        C0234B[] bArr = new C0234B[size];
        int i = 0;
        boolean z = false;
        while (true) {
            String str = " has cleared index: ";
            String str2 = "Failure saving state: active ";
            String str3 = ": ";
            String str4 = "FragmentManager";
            if (i < size) {
                C0276j jVar = (C0276j) this.f876k.valueAt(i);
                if (jVar != null) {
                    if (jVar.f782g >= 0) {
                        C0234B b = new C0234B(jVar);
                        bArr[i] = b;
                        if (jVar.f778c <= 0 || b.f616k != null) {
                            b.f616k = jVar.f779d;
                        } else {
                            b.f616k = mo1228l(jVar);
                            C0276j jVar2 = jVar.f785j;
                            if (jVar2 != null) {
                                if (jVar2.f782g >= 0) {
                                    if (b.f616k == null) {
                                        b.f616k = new Bundle();
                                    }
                                    mo1176a(b.f616k, "android:target_state", jVar.f785j);
                                    int i2 = jVar.f787l;
                                    if (i2 != 0) {
                                        b.f616k.putInt("android:target_req_state", i2);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failure saving state: ");
                                    sb.append(jVar);
                                    sb.append(" has target not in fragment manager: ");
                                    sb.append(jVar.f785j);
                                    m1216a((RuntimeException) new IllegalStateException(sb.toString()));
                                    throw null;
                                }
                            }
                        }
                        if (f856a) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Saved state of ");
                            sb2.append(jVar);
                            sb2.append(str3);
                            sb2.append(b.f616k);
                            Log.v(str4, sb2.toString());
                        }
                        z = true;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(jVar);
                        sb3.append(str);
                        sb3.append(jVar.f782g);
                        m1216a((RuntimeException) new IllegalStateException(sb3.toString()));
                        throw null;
                    }
                }
                i++;
            } else if (!z) {
                if (f856a) {
                    Log.v(str4, "saveAllState: no fragments!");
                }
                return null;
            } else {
                int size2 = this.f875j.size();
                if (size2 > 0) {
                    iArr = new int[size2];
                    int i3 = 0;
                    while (i3 < size2) {
                        iArr[i3] = ((C0276j) this.f875j.get(i3)).f782g;
                        if (iArr[i3] >= 0) {
                            if (f856a) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("saveAllState: adding fragment #");
                                sb4.append(i3);
                                sb4.append(str3);
                                sb4.append(this.f875j.get(i3));
                                Log.v(str4, sb4.toString());
                            }
                            i3++;
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str2);
                            sb5.append(this.f875j.get(i3));
                            sb5.append(str);
                            sb5.append(iArr[i3]);
                            m1216a((RuntimeException) new IllegalStateException(sb5.toString()));
                            throw null;
                        }
                    }
                } else {
                    iArr = null;
                }
                ArrayList<C0268c> arrayList = this.f877l;
                if (arrayList != null) {
                    int size3 = arrayList.size();
                    if (size3 > 0) {
                        eVarArr = new C0271e[size3];
                        for (int i4 = 0; i4 < size3; i4++) {
                            eVarArr[i4] = new C0271e((C0268c) this.f877l.get(i4));
                            if (f856a) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("saveAllState: adding back stack #");
                                sb6.append(i4);
                                sb6.append(str3);
                                sb6.append(this.f877l.get(i4));
                                Log.v(str4, sb6.toString());
                            }
                        }
                    }
                }
                C0310z zVar = new C0310z();
                zVar.f915a = bArr;
                zVar.f916b = iArr;
                zVar.f917c = eVarArr;
                C0276j jVar3 = this.f887v;
                if (jVar3 != null) {
                    zVar.f918d = jVar3.f782g;
                }
                zVar.f919e = this.f874i;
                mo1245v();
                return zVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo1245v() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0308x xVar;
        if (this.f876k != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f876k.size(); i++) {
                C0276j jVar = (C0276j) this.f876k.valueAt(i);
                if (jVar != null) {
                    if (jVar.f758E) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(jVar);
                        C0276j jVar2 = jVar.f785j;
                        jVar.f786k = jVar2 != null ? jVar2.f782g : -1;
                        if (f856a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("retainNonConfig: keeping retained ");
                            sb.append(jVar);
                            Log.v("FragmentManager", sb.toString());
                        }
                    }
                    C0297w wVar = jVar.f797v;
                    if (wVar != null) {
                        wVar.mo1245v();
                        xVar = jVar.f797v.f870I;
                    } else {
                        xVar = jVar.f798w;
                    }
                    if (arrayList2 == null && xVar != null) {
                        arrayList2 = new ArrayList(this.f876k.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(xVar);
                    }
                    if (arrayList == null && jVar.f799x != null) {
                        arrayList = new ArrayList(this.f876k.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(jVar.f799x);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f870I = null;
        } else {
            this.f870I = new C0308x(arrayList3, arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo1246w() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f869H != null && !this.f869H.isEmpty();
            if (this.f872g != null && this.f872g.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f884s.mo1141e().removeCallbacks(this.f871J);
                this.f884s.mo1141e().post(this.f871J);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo1247x() {
        if (this.f876k != null) {
            for (int i = 0; i < this.f876k.size(); i++) {
                C0276j jVar = (C0276j) this.f876k.valueAt(i);
                if (jVar != null) {
                    mo1225j(jVar);
                }
            }
        }
    }
}
