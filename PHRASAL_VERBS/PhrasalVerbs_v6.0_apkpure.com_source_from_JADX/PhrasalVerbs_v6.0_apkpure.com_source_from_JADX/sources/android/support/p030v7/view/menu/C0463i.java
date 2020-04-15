package android.support.p030v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.widget.C0554V;
import android.support.p030v7.widget.C0556W;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p018g.C0139f;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0166d;
import p000a.p005b.p021d.p022a.C0169g;

/* renamed from: android.support.v7.view.menu.i */
final class C0463i extends C0482s implements C0485v, OnKeyListener, OnDismissListener {

    /* renamed from: b */
    private static final int f1652b = C0169g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private OnDismissListener f1653A;

    /* renamed from: B */
    boolean f1654B;

    /* renamed from: c */
    private final Context f1655c;

    /* renamed from: d */
    private final int f1656d;

    /* renamed from: e */
    private final int f1657e;

    /* renamed from: f */
    private final int f1658f;

    /* renamed from: g */
    private final boolean f1659g;

    /* renamed from: h */
    final Handler f1660h;

    /* renamed from: i */
    private final List<C0468l> f1661i = new ArrayList();

    /* renamed from: j */
    final List<C0464a> f1662j = new ArrayList();

    /* renamed from: k */
    final OnGlobalLayoutListener f1663k = new C0459e(this);

    /* renamed from: l */
    private final OnAttachStateChangeListener f1664l = new C0460f(this);

    /* renamed from: m */
    private final C0554V f1665m = new C0462h(this);

    /* renamed from: n */
    private int f1666n = 0;

    /* renamed from: o */
    private int f1667o = 0;

    /* renamed from: p */
    private View f1668p;

    /* renamed from: q */
    View f1669q;

    /* renamed from: r */
    private int f1670r;

    /* renamed from: s */
    private boolean f1671s;

    /* renamed from: t */
    private boolean f1672t;

    /* renamed from: u */
    private int f1673u;

    /* renamed from: v */
    private int f1674v;

    /* renamed from: w */
    private boolean f1675w;

    /* renamed from: x */
    private boolean f1676x;

    /* renamed from: y */
    private C0486a f1677y;

    /* renamed from: z */
    ViewTreeObserver f1678z;

    /* renamed from: android.support.v7.view.menu.i$a */
    private static class C0464a {

        /* renamed from: a */
        public final C0556W f1679a;

        /* renamed from: b */
        public final C0468l f1680b;

        /* renamed from: c */
        public final int f1681c;

        public C0464a(C0556W w, C0468l lVar, int i) {
            this.f1679a = w;
            this.f1680b = lVar;
            this.f1681c = i;
        }

        /* renamed from: a */
        public ListView mo2164a() {
            return this.f1679a.mo2056d();
        }
    }

    public C0463i(Context context, View view, int i, int i2, boolean z) {
        this.f1655c = context;
        this.f1668p = view;
        this.f1657e = i;
        this.f1658f = i2;
        this.f1659g = z;
        this.f1675w = false;
        this.f1670r = m2156h();
        Resources resources = context.getResources();
        this.f1656d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0166d.abc_config_prefDialogWidth));
        this.f1660h = new Handler();
    }

    /* renamed from: a */
    private MenuItem m2150a(C0468l lVar, C0468l lVar2) {
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lVar.getItem(i);
            if (item.hasSubMenu() && lVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m2151a(C0464a aVar, C0468l lVar) {
        int i;
        C0467k kVar;
        MenuItem a = m2150a(aVar.f1680b, lVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo2164a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            kVar = (C0467k) headerViewListAdapter.getWrappedAdapter();
        } else {
            kVar = (C0467k) adapter;
            i = 0;
        }
        int count = kVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == kVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: c */
    private int m2152c(C0468l lVar) {
        int size = this.f1662j.size();
        for (int i = 0; i < size; i++) {
            if (lVar == ((C0464a) this.f1662j.get(i)).f1680b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m2153d(int i) {
        List<C0464a> list = this.f1662j;
        ListView a = ((C0464a) list.get(list.size() - 1)).mo2164a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1669q.getWindowVisibleDisplayFrame(rect);
        return this.f1670r == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private void m2154d(C0468l lVar) {
        View view;
        C0464a aVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1655c);
        C0467k kVar = new C0467k(lVar, from, this.f1659g, f1652b);
        if (!mo2052b() && this.f1675w) {
            kVar.mo2175a(true);
        } else if (mo2052b()) {
            kVar.mo2175a(C0482s.m2291b(lVar));
        }
        int a = C0482s.m2289a(kVar, null, this.f1655c, this.f1656d);
        C0556W g = m2155g();
        g.mo2563a((ListAdapter) kVar);
        g.mo2920b(a);
        g.mo2922c(this.f1667o);
        if (this.f1662j.size() > 0) {
            List<C0464a> list = this.f1662j;
            aVar = (C0464a) list.get(list.size() - 1);
            view = m2151a(aVar, lVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            g.mo2959c(false);
            g.mo2957a((Object) null);
            int d = m2153d(a);
            boolean z = d == 1;
            this.f1670r = d;
            if (VERSION.SDK_INT >= 26) {
                g.mo2916a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1668p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1667o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1668p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1667o & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                g.mo2923d(i3);
                g.mo2921b(true);
                g.mo2931h(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                g.mo2923d(i3);
                g.mo2921b(true);
                g.mo2931h(i2);
            }
            i3 = i + a;
            g.mo2923d(i3);
            g.mo2921b(true);
            g.mo2931h(i2);
        } else {
            if (this.f1671s) {
                g.mo2923d(this.f1673u);
            }
            if (this.f1672t) {
                g.mo2931h(this.f1674v);
            }
            g.mo2914a(mo2367f());
        }
        this.f1662j.add(new C0464a(g, lVar, this.f1670r));
        g.mo2053c();
        ListView d2 = g.mo2056d();
        d2.setOnKeyListener(this);
        if (aVar == null && this.f1676x && lVar.mo2227h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0169g.abc_popup_menu_header_item_layout, d2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(lVar.mo2227h());
            d2.addHeaderView(frameLayout, null, false);
            g.mo2053c();
        }
    }

    /* renamed from: g */
    private C0556W m2155g() {
        C0556W w = new C0556W(this.f1655c, null, this.f1657e, this.f1658f);
        w.mo2956a(this.f1665m);
        w.mo2917a((OnItemClickListener) this);
        w.mo2918a((OnDismissListener) this);
        w.mo2916a(this.f1668p);
        w.mo2922c(this.f1667o);
        w.mo2919a(true);
        w.mo2925e(2);
        return w;
    }

    /* renamed from: h */
    private int m2156h() {
        return C0156v.m565g(this.f1668p) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo2041a(int i) {
        if (this.f1666n != i) {
            this.f1666n = i;
            this.f1667o = C0139f.m475a(i, C0156v.m565g(this.f1668p));
        }
    }

    /* renamed from: a */
    public void mo2042a(C0468l lVar) {
        lVar.mo2192a((C0485v) this, this.f1655c);
        if (mo2052b()) {
            m2154d(lVar);
        } else {
            this.f1661i.add(lVar);
        }
    }

    /* renamed from: a */
    public void mo2043a(C0468l lVar, boolean z) {
        int c = m2152c(lVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f1662j.size()) {
                ((C0464a) this.f1662j.get(i)).f1680b.mo2195a(false);
            }
            C0464a aVar = (C0464a) this.f1662j.remove(c);
            aVar.f1680b.mo2210b((C0485v) this);
            if (this.f1654B) {
                aVar.f1679a.mo2958b(null);
                aVar.f1679a.mo2913a(0);
            }
            aVar.f1679a.dismiss();
            int size = this.f1662j.size();
            this.f1670r = size > 0 ? ((C0464a) this.f1662j.get(size - 1)).f1681c : m2156h();
            if (size == 0) {
                dismiss();
                C0486a aVar2 = this.f1677y;
                if (aVar2 != null) {
                    aVar2.mo2000a(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1678z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1678z.removeGlobalOnLayoutListener(this.f1663k);
                    }
                    this.f1678z = null;
                }
                this.f1669q.removeOnAttachStateChangeListener(this.f1664l);
                this.f1653A.onDismiss();
            } else if (z) {
                ((C0464a) this.f1662j.get(0)).f1680b.mo2195a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo2044a(C0486a aVar) {
        this.f1677y = aVar;
    }

    /* renamed from: a */
    public void mo2045a(View view) {
        if (this.f1668p != view) {
            this.f1668p = view;
            this.f1667o = C0139f.m475a(this.f1666n, C0156v.m565g(this.f1668p));
        }
    }

    /* renamed from: a */
    public void mo2046a(OnDismissListener onDismissListener) {
        this.f1653A = onDismissListener;
    }

    /* renamed from: a */
    public void mo2047a(boolean z) {
        for (C0464a a : this.f1662j) {
            C0482s.m2290a(a.mo2164a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo2048a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo2049a(C0453D d) {
        for (C0464a aVar : this.f1662j) {
            if (d == aVar.f1680b) {
                aVar.mo2164a().requestFocus();
                return true;
            }
        }
        if (!d.hasVisibleItems()) {
            return false;
        }
        mo2042a((C0468l) d);
        C0486a aVar2 = this.f1677y;
        if (aVar2 != null) {
            aVar2.mo2001a(d);
        }
        return true;
    }

    /* renamed from: b */
    public void mo2050b(int i) {
        this.f1671s = true;
        this.f1673u = i;
    }

    /* renamed from: b */
    public void mo2051b(boolean z) {
        this.f1675w = z;
    }

    /* renamed from: b */
    public boolean mo2052b() {
        return this.f1662j.size() > 0 && ((C0464a) this.f1662j.get(0)).f1679a.mo2052b();
    }

    /* renamed from: c */
    public void mo2053c() {
        if (!mo2052b()) {
            for (C0468l d : this.f1661i) {
                m2154d(d);
            }
            this.f1661i.clear();
            this.f1669q = this.f1668p;
            if (this.f1669q != null) {
                boolean z = this.f1678z == null;
                this.f1678z = this.f1669q.getViewTreeObserver();
                if (z) {
                    this.f1678z.addOnGlobalLayoutListener(this.f1663k);
                }
                this.f1669q.addOnAttachStateChangeListener(this.f1664l);
            }
        }
    }

    /* renamed from: c */
    public void mo2054c(int i) {
        this.f1672t = true;
        this.f1674v = i;
    }

    /* renamed from: c */
    public void mo2055c(boolean z) {
        this.f1676x = z;
    }

    /* renamed from: d */
    public ListView mo2056d() {
        if (this.f1662j.isEmpty()) {
            return null;
        }
        List<C0464a> list = this.f1662j;
        return ((C0464a) list.get(list.size() - 1)).mo2164a();
    }

    public void dismiss() {
        int size = this.f1662j.size();
        if (size > 0) {
            C0464a[] aVarArr = (C0464a[]) this.f1662j.toArray(new C0464a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0464a aVar = aVarArr[i];
                if (aVar.f1679a.mo2052b()) {
                    aVar.f1679a.dismiss();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo2161e() {
        return false;
    }

    public void onDismiss() {
        C0464a aVar;
        int size = this.f1662j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C0464a) this.f1662j.get(i);
            if (!aVar.f1679a.mo2052b()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f1680b.mo2195a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
