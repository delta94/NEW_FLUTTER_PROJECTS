package p000a.p005b.p009c.p018g;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p005b.p006a.C0015b;

/* renamed from: a.b.c.g.v */
public class C0156v {

    /* renamed from: a */
    private static final AtomicInteger f392a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f393b;

    /* renamed from: c */
    private static boolean f394c;

    /* renamed from: d */
    private static WeakHashMap<View, String> f395d;

    /* renamed from: e */
    private static WeakHashMap<View, C0116H> f396e = null;

    /* renamed from: f */
    private static Field f397f;

    /* renamed from: g */
    private static boolean f398g = false;

    /* renamed from: h */
    private static ThreadLocal<Rect> f399h;

    /* renamed from: a.b.c.g.v$a */
    public interface C0157a {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: a.b.c.g.v$b */
    static class C0158b {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f400a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f401b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f402c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f403d = null;

        C0158b() {
        }

        /* renamed from: a */
        static C0158b m583a(View view) {
            C0158b bVar = (C0158b) view.getTag(C0015b.tag_unhandled_key_event_manager);
            if (bVar != null) {
                return bVar;
            }
            C0158b bVar2 = new C0158b();
            view.setTag(C0015b.tag_unhandled_key_event_manager, bVar2);
            return bVar2;
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m584a() {
            if (this.f402c == null) {
                this.f402c = new SparseArray<>();
            }
            return this.f402c;
        }

        /* renamed from: b */
        private View m585b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f401b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m585b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m587c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        private void m586b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f401b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f400a.isEmpty()) {
                synchronized (f400a) {
                    if (this.f401b == null) {
                        this.f401b = new WeakHashMap<>();
                    }
                    for (int size = f400a.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f400a.get(size)).get();
                        if (view == null) {
                            f400a.remove(size);
                        } else {
                            this.f401b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f401b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m587c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0015b.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C0157a) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo557a(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.f403d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f403d = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray a = m584a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0156v.m576q(view)) {
                m587c(view, keyEvent);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo558a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m586b();
            }
            View b = m585b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m584a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }
    }

    /* renamed from: a */
    public static C0116H m537a(View view) {
        if (f396e == null) {
            f396e = new WeakHashMap<>();
        }
        C0116H h = (C0116H) f396e.get(view);
        if (h != null) {
            return h;
        }
        C0116H h2 = new C0116H(view);
        f396e.put(view, h2);
        return h2;
    }

    /* renamed from: a */
    public static C0121L m538a(View view, C0121L l) {
        if (VERSION.SDK_INT < 21) {
            return l;
        }
        WindowInsets windowInsets = (WindowInsets) C0121L.m396a(l);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0121L.m395a((Object) windowInsets);
    }

    /* renamed from: a */
    private static Rect m539a() {
        if (f399h == null) {
            f399h = new ThreadLocal<>();
        }
        Rect rect = (Rect) f399h.get();
        if (rect == null) {
            rect = new Rect();
            f399h.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static void m540a(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    public static void m541a(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect a = m539a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m564f(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m564f(view, i);
        }
    }

    /* renamed from: a */
    public static void m542a(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m543a(View view, C0134d dVar) {
        view.setAccessibilityDelegate(dVar == null ? null : dVar.mo474a());
    }

    /* renamed from: a */
    public static void m544a(View view, C0151q qVar) {
        if (VERSION.SDK_INT >= 21) {
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new C0155u(qVar));
        }
    }

    /* renamed from: a */
    public static void m545a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0154t) {
            ((C0154t) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m546a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0154t) {
            ((C0154t) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m547a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m548a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m549a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m550a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f395d == null) {
            f395d = new WeakHashMap<>();
        }
        f395d.put(view, str);
    }

    /* renamed from: a */
    public static void m551a(View view, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof C0146l) {
            ((C0146l) view).setNestedScrollingEnabled(z);
        }
    }

    /* renamed from: a */
    static boolean m552a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0158b.m583a(view).mo558a(view, keyEvent);
    }

    /* renamed from: b */
    public static C0121L m553b(View view, C0121L l) {
        if (VERSION.SDK_INT < 21) {
            return l;
        }
        WindowInsets windowInsets = (WindowInsets) C0121L.m396a(l);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0121L.m395a((Object) windowInsets);
    }

    /* renamed from: b */
    public static ColorStateList m554b(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof C0154t ? ((C0154t) view).getSupportBackgroundTintList() : null;
    }

    /* renamed from: b */
    public static void m555b(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect a = m539a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m566g(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m566g(view, i);
        }
    }

    /* renamed from: b */
    static boolean m556b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0158b.m583a(view).mo557a(keyEvent);
    }

    /* renamed from: c */
    public static Mode m557c(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof C0154t ? ((C0154t) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: c */
    public static void m558c(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: d */
    public static float m559d(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: d */
    public static void m560d(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: e */
    public static void m561e(View view, int i) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: e */
    public static boolean m562e(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: f */
    public static int m563f(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: f */
    private static void m564f(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m582w(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m582w((View) parent);
            }
        }
    }

    /* renamed from: g */
    public static int m565g(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: g */
    private static void m566g(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m582w(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m582w((View) parent);
            }
        }
    }

    /* renamed from: h */
    public static int m567h(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f394c) {
            try {
                f393b = View.class.getDeclaredField("mMinHeight");
                f393b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f394c = true;
        }
        Field field = f393b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: i */
    public static int m568i(View view) {
        return VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: j */
    public static int m569j(View view) {
        return VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: k */
    public static ViewParent m570k(View view) {
        return VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    /* renamed from: l */
    public static String m571l(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f395d;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    /* renamed from: m */
    public static int m572m(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: n */
    public static boolean m573n(View view) {
        boolean z = false;
        if (f398g) {
            return false;
        }
        if (f397f == null) {
            try {
                f397f = View.class.getDeclaredField("mAccessibilityDelegate");
                f397f.setAccessible(true);
            } catch (Throwable unused) {
                f398g = true;
                return false;
            }
        }
        try {
            if (f397f.get(view) != null) {
                z = true;
            }
            return z;
        } catch (Throwable unused2) {
            f398g = true;
            return false;
        }
    }

    /* renamed from: o */
    public static boolean m574o(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m575p(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m576q(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: r */
    public static boolean m577r(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: s */
    public static boolean m578s(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C0146l) {
            return ((C0146l) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: t */
    public static void m579t(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: u */
    public static void m580u(View view) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: v */
    public static void m581v(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C0146l) {
            ((C0146l) view).stopNestedScroll();
        }
    }

    /* renamed from: w */
    private static void m582w(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
