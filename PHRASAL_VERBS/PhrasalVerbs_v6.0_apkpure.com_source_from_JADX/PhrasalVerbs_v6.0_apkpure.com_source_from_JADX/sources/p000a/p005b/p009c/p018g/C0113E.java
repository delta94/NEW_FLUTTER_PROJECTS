package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.b.c.g.E */
public final class C0113E {
    /* renamed from: a */
    public static void m368a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0148n) {
            ((C0148n) viewParent).mo518a(view, i);
        } else if (i != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C0149o) {
                ((C0149o) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: a */
    public static void m369a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C0148n) {
            ((C0148n) viewParent).mo519a(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C0149o) {
                ((C0149o) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public static void m370a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0148n) {
            ((C0148n) viewParent).mo520a(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onNestedPreScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C0149o) {
                ((C0149o) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static void m371a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0148n) {
            ((C0148n) viewParent).mo522b(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onNestedScrollAccepted");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C0149o) {
                ((C0149o) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static boolean m372a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof C0149o) {
                return ((C0149o) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m373a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface ");
                sb.append("method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        } else {
            if (viewParent instanceof C0149o) {
                return ((C0149o) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m374b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0148n) {
            return ((C0148n) viewParent).mo521a(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface ");
                    sb.append("method onStartNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof C0149o) {
                return ((C0149o) viewParent).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }
}
