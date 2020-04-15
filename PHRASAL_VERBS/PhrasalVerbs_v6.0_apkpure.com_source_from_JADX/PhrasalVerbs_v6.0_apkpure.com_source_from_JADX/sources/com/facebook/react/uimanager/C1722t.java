package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.t */
public class C1722t {

    /* renamed from: a */
    private final C1655ha f5098a;

    /* renamed from: b */
    private final C1576L f5099b;

    /* renamed from: c */
    private final SparseBooleanArray f5100c = new SparseBooleanArray();

    /* renamed from: com.facebook.react.uimanager.t$a */
    private static class C1723a {

        /* renamed from: a */
        public final C1569E f5101a;

        /* renamed from: b */
        public final int f5102b;

        C1723a(C1569E e, int i) {
            this.f5101a = e;
            this.f5102b = i;
        }
    }

    public C1722t(C1655ha haVar, C1576L l) {
        this.f5098a = haVar;
        this.f5099b = l;
    }

    /* renamed from: a */
    private C1723a m6643a(C1569E e, int i) {
        while (e.mo5563A()) {
            C1569E parent = e.getParent();
            if (parent == null) {
                return null;
            }
            i += parent.mo5565a(e);
            e = parent;
        }
        return new C1723a(e, i);
    }

    /* renamed from: a */
    public static void m6644a(C1569E e) {
        e.mo5594h();
    }

    /* renamed from: a */
    private void m6645a(C1569E e, int i, int i2) {
        if (e.mo5563A() || e.mo5612z() == null) {
            for (int i3 = 0; i3 < e.mo5589e(); i3++) {
                C1569E e2 = e.mo5590e(i3);
                int g = e2.mo5592g();
                if (!this.f5100c.get(g)) {
                    this.f5100c.put(g, true);
                    m6645a(e2, e2.mo5608v() + i, e2.mo5601o() + i2);
                }
            }
            return;
        }
        this.f5098a.mo5911a(e.mo5612z().mo5592g(), e.mo5592g(), i, i2, e.mo5598l(), e.mo5564a());
    }

    /* renamed from: a */
    private void m6646a(C1569E e, C1569E e2, int i) {
        C1136a.m5055a(!e.mo5563A());
        int i2 = i;
        for (int i3 = 0; i3 < e2.mo5589e(); i3++) {
            C1569E e3 = e2.mo5590e(i3);
            C1136a.m5055a(e3.mo5612z() == null);
            if (e3.mo5563A()) {
                int k = e.mo5597k();
                m6650b(e, e3, i2);
                i2 += e.mo5597k() - k;
            } else {
                m6653d(e, e3, i2);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private void m6647a(C1569E e, C1571G g) {
        C1569E parent = e.getParent();
        if (parent == null) {
            e.mo5574a(false);
            return;
        }
        int c = parent.mo5581c(e);
        parent.mo5566a(c);
        m6648a(e, false);
        e.mo5574a(false);
        this.f5098a.mo5925a(e.mo5602p(), e.mo5592g(), e.mo5606t(), g);
        parent.mo5580b(e, c);
        m6652c(parent, e, c);
        for (int i = 0; i < e.mo5589e(); i++) {
            m6652c(e, e.mo5590e(i), i);
        }
        C1136a.m5055a(this.f5100c.size() == 0);
        m6651c(e);
        for (int i2 = 0; i2 < e.mo5589e(); i2++) {
            m6651c(e.mo5590e(i2));
        }
        this.f5100c.clear();
    }

    /* renamed from: a */
    private void m6648a(C1569E e, boolean z) {
        C1569E z2 = e.mo5612z();
        if (z2 != null) {
            int b = z2.mo5576b(e);
            z2.mo5585d(b);
            this.f5098a.mo5921a(z2.mo5592g(), new int[]{b}, (C1684ja[]) null, z ? new int[]{e.mo5592g()} : null);
            return;
        }
        for (int e2 = e.mo5589e() - 1; e2 >= 0; e2--) {
            m6648a(e.mo5590e(e2), z);
        }
    }

    /* renamed from: a */
    private static boolean m6649a(C1571G g) {
        if (g == null) {
            return true;
        }
        String str = "collapsable";
        if (g.mo5676e(str) && !g.mo5672a(str, true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = g.f4775a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!C1718ra.m6611a(g.f4775a, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m6650b(C1569E e, C1569E e2, int i) {
        m6646a(e, e2, i);
    }

    /* renamed from: c */
    private void m6651c(C1569E e) {
        int g = e.mo5592g();
        if (!this.f5100c.get(g)) {
            this.f5100c.put(g, true);
            C1569E parent = e.getParent();
            int v = e.mo5608v();
            int o = e.mo5601o();
            while (parent != null && parent.mo5563A()) {
                v += Math.round(parent.mo5610x());
                o += Math.round(parent.mo5607u());
                parent = parent.getParent();
            }
            m6645a(e, v, o);
        }
    }

    /* renamed from: c */
    private void m6652c(C1569E e, C1569E e2, int i) {
        int a = e.mo5565a(e.mo5590e(i));
        if (e.mo5563A()) {
            C1723a a2 = m6643a(e, a);
            if (a2 != null) {
                C1569E e3 = a2.f5101a;
                a = a2.f5102b;
                e = e3;
            } else {
                return;
            }
        }
        if (!e2.mo5563A()) {
            m6653d(e, e2, a);
        } else {
            m6650b(e, e2, a);
        }
    }

    /* renamed from: d */
    private void m6653d(C1569E e, C1569E e2, int i) {
        e.mo5568a(e2, i);
        this.f5098a.mo5921a(e.mo5592g(), (int[]) null, new C1684ja[]{new C1684ja(e2.mo5592g(), i)}, (int[]) null);
    }

    /* renamed from: a */
    public void mo6011a() {
        this.f5100c.clear();
    }

    /* renamed from: a */
    public void mo6012a(C1569E e, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            m6652c(e, this.f5099b.mo5682a(readableArray.getInt(i)), i);
        }
    }

    /* renamed from: a */
    public void mo6013a(C1569E e, C1578N n, C1571G g) {
        boolean z = e.mo5606t().equals(ReactViewManager.REACT_CLASS) && m6649a(g);
        e.mo5574a(z);
        if (!z) {
            this.f5098a.mo5925a(n, e.mo5592g(), e.mo5606t(), g);
        }
    }

    /* renamed from: a */
    public void mo6014a(C1569E e, String str, C1571G g) {
        if (e.mo5563A() && !m6649a(g)) {
            m6647a(e, g);
        } else if (!e.mo5563A()) {
            this.f5098a.mo5920a(e.mo5592g(), str, g);
        }
    }

    /* renamed from: a */
    public void mo6015a(C1569E e, int[] iArr, int[] iArr2, C1684ja[] jaVarArr, int[] iArr3) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            m6648a(this.f5099b.mo5682a(i), z);
        }
        for (C1684ja jaVar : jaVarArr) {
            m6652c(e, this.f5099b.mo5682a(jaVar.f5030b), jaVar.f5031c);
        }
    }

    /* renamed from: b */
    public void mo6016b(C1569E e) {
        m6651c(e);
    }
}
