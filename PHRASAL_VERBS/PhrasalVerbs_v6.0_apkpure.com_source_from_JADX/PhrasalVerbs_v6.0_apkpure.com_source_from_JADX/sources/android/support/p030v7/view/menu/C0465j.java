package android.support.p030v7.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.view.menu.C0487w.C0488a;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p000a.p005b.p021d.p022a.C0169g;

/* renamed from: android.support.v7.view.menu.j */
public class C0465j implements C0485v, OnItemClickListener {

    /* renamed from: a */
    Context f1682a;

    /* renamed from: b */
    LayoutInflater f1683b;

    /* renamed from: c */
    C0468l f1684c;

    /* renamed from: d */
    ExpandedMenuView f1685d;

    /* renamed from: e */
    int f1686e;

    /* renamed from: f */
    int f1687f;

    /* renamed from: g */
    int f1688g;

    /* renamed from: h */
    private C0486a f1689h;

    /* renamed from: i */
    C0466a f1690i;

    /* renamed from: android.support.v7.view.menu.j$a */
    private class C0466a extends BaseAdapter {

        /* renamed from: a */
        private int f1691a = -1;

        public C0466a() {
            mo2168a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2168a() {
            C0474p f = C0465j.this.f1684c.mo2223f();
            if (f != null) {
                ArrayList j = C0465j.this.f1684c.mo2231j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (((C0474p) j.get(i)) == f) {
                        this.f1691a = i;
                        return;
                    }
                }
            }
            this.f1691a = -1;
        }

        public int getCount() {
            int size = C0465j.this.f1684c.mo2231j().size() - C0465j.this.f1686e;
            return this.f1691a < 0 ? size : size - 1;
        }

        public C0474p getItem(int i) {
            ArrayList j = C0465j.this.f1684c.mo2231j();
            int i2 = i + C0465j.this.f1686e;
            int i3 = this.f1691a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C0474p) j.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0465j jVar = C0465j.this;
                view = jVar.f1683b.inflate(jVar.f1688g, viewGroup, false);
            }
            ((C0488a) view).mo2017a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo2168a();
            super.notifyDataSetChanged();
        }
    }

    public C0465j(int i, int i2) {
        this.f1688g = i;
        this.f1687f = i2;
    }

    public C0465j(Context context, int i) {
        this(i, 0);
        this.f1682a = context;
        this.f1683b = LayoutInflater.from(this.f1682a);
    }

    /* renamed from: a */
    public C0487w mo2165a(ViewGroup viewGroup) {
        if (this.f1685d == null) {
            this.f1685d = (ExpandedMenuView) this.f1683b.inflate(C0169g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1690i == null) {
                this.f1690i = new C0466a();
            }
            this.f1685d.setAdapter(this.f1690i);
            this.f1685d.setOnItemClickListener(this);
        }
        return this.f1685d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.f1683b == null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2141a(android.content.Context r3, android.support.p030v7.view.menu.C0468l r4) {
        /*
            r2 = this;
            int r0 = r2.f1687f
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f1682a = r1
        L_0x000b:
            android.content.Context r3 = r2.f1682a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1683b = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f1682a
            if (r0 == 0) goto L_0x001f
            r2.f1682a = r3
            android.view.LayoutInflater r3 = r2.f1683b
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f1684c = r4
            android.support.v7.view.menu.j$a r3 = r2.f1690i
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.view.menu.C0465j.mo2141a(android.content.Context, android.support.v7.view.menu.l):void");
    }

    /* renamed from: a */
    public void mo2043a(C0468l lVar, boolean z) {
        C0486a aVar = this.f1689h;
        if (aVar != null) {
            aVar.mo2000a(lVar, z);
        }
    }

    /* renamed from: a */
    public void mo2044a(C0486a aVar) {
        this.f1689h = aVar;
    }

    /* renamed from: a */
    public void mo2047a(boolean z) {
        C0466a aVar = this.f1690i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo2048a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo2049a(C0453D d) {
        if (!d.hasVisibleItems()) {
            return false;
        }
        new C0471m(d).mo2246a((IBinder) null);
        C0486a aVar = this.f1689h;
        if (aVar != null) {
            aVar.mo2001a(d);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2145a(C0468l lVar, C0474p pVar) {
        return false;
    }

    /* renamed from: b */
    public ListAdapter mo2166b() {
        if (this.f1690i == null) {
            this.f1690i = new C0466a();
        }
        return this.f1690i;
    }

    /* renamed from: b */
    public boolean mo2149b(C0468l lVar, C0474p pVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1684c.mo2197a((MenuItem) this.f1690i.getItem(i), (C0485v) this, 0);
    }
}
