package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: a.b.c.g.L */
public class C0121L {

    /* renamed from: a */
    private final Object f324a;

    private C0121L(Object obj) {
        this.f324a = obj;
    }

    /* renamed from: a */
    static C0121L m395a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0121L(obj);
    }

    /* renamed from: a */
    static Object m396a(C0121L l) {
        if (l == null) {
            return null;
        }
        return l.f324a;
    }

    /* renamed from: a */
    public int mo411a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f324a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: a */
    public C0121L mo412a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C0121L(((WindowInsets) this.f324a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int mo413b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f324a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo414c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f324a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo415d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f324a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo416e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f324a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0121L.class != obj.getClass()) {
            return false;
        }
        C0121L l = (C0121L) obj;
        Object obj2 = this.f324a;
        if (obj2 != null) {
            z = obj2.equals(l.f324a);
        } else if (l.f324a != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Object obj = this.f324a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
