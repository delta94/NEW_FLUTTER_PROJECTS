package p000a.p005b.p009c.p018g;

import android.view.View;
import android.view.ViewParent;

/* renamed from: a.b.c.g.m */
public class C0147m {

    /* renamed from: a */
    private ViewParent f382a;

    /* renamed from: b */
    private ViewParent f383b;

    /* renamed from: c */
    private final View f384c;

    /* renamed from: d */
    private boolean f385d;

    /* renamed from: e */
    private int[] f386e;

    public C0147m(View view) {
        this.f384c = view;
    }

    /* renamed from: a */
    private void m494a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f382a = viewParent;
        } else if (i == 1) {
            this.f383b = viewParent;
        }
    }

    /* renamed from: d */
    private ViewParent m495d(int i) {
        if (i == 0) {
            return this.f382a;
        }
        if (i != 1) {
            return null;
        }
        return this.f383b;
    }

    /* renamed from: a */
    public void mo504a(boolean z) {
        if (this.f385d) {
            C0156v.m581v(this.f384c);
        }
        this.f385d = z;
    }

    /* renamed from: a */
    public boolean mo505a() {
        return mo508a(0);
    }

    /* renamed from: a */
    public boolean mo506a(float f, float f2) {
        if (mo514b()) {
            ViewParent d = m495d(0);
            if (d != null) {
                return C0113E.m372a(d, this.f384c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo507a(float f, float f2, boolean z) {
        if (mo514b()) {
            ViewParent d = m495d(0);
            if (d != null) {
                return C0113E.m373a(d, this.f384c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo508a(int i) {
        return m495d(i) != null;
    }

    /* renamed from: a */
    public boolean mo509a(int i, int i2) {
        if (mo508a(i2)) {
            return true;
        }
        if (mo514b()) {
            View view = this.f384c;
            for (ViewParent parent = this.f384c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0113E.m374b(parent, view, this.f384c, i, i2)) {
                    m494a(i2, parent);
                    C0113E.m371a(parent, view, this.f384c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo510a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo511a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean mo511a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (mo514b()) {
            ViewParent d = m495d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr2 != null) {
                    this.f384c.getLocationInWindow(iArr2);
                    i7 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                C0113E.m369a(d, this.f384c, i, i2, i3, i4, i5);
                if (iArr2 != null) {
                    this.f384c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i7;
                    iArr2[1] = iArr2[1] - i6;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo512a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo513a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo513a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (mo514b()) {
            ViewParent d = m495d(i3);
            if (d == null) {
                return false;
            }
            boolean z = true;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f384c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f386e == null) {
                        this.f386e = new int[2];
                    }
                    iArr = this.f386e;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C0113E.m370a(d, this.f384c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f384c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    z = false;
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo514b() {
        return this.f385d;
    }

    /* renamed from: b */
    public boolean mo515b(int i) {
        return mo509a(i, 0);
    }

    /* renamed from: c */
    public void mo516c() {
        mo517c(0);
    }

    /* renamed from: c */
    public void mo517c(int i) {
        ViewParent d = m495d(i);
        if (d != null) {
            C0113E.m368a(d, this.f384c, i);
            m494a(i, (ViewParent) null);
        }
    }
}
