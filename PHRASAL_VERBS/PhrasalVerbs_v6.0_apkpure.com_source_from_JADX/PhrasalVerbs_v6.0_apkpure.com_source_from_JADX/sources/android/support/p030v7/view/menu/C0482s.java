package android.support.p030v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.s */
abstract class C0482s implements C0491z, C0485v, OnItemClickListener {

    /* renamed from: a */
    private Rect f1770a;

    C0482s() {
    }

    /* renamed from: a */
    protected static int m2289a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0467k m2290a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0467k) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0467k) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m2291b(C0468l lVar) {
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo2041a(int i);

    /* renamed from: a */
    public void mo2141a(Context context, C0468l lVar) {
    }

    /* renamed from: a */
    public void mo2366a(Rect rect) {
        this.f1770a = rect;
    }

    /* renamed from: a */
    public abstract void mo2042a(C0468l lVar);

    /* renamed from: a */
    public abstract void mo2045a(View view);

    /* renamed from: a */
    public abstract void mo2046a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public boolean mo2145a(C0468l lVar, C0474p pVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo2050b(int i);

    /* renamed from: b */
    public abstract void mo2051b(boolean z);

    /* renamed from: b */
    public boolean mo2149b(C0468l lVar, C0474p pVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo2054c(int i);

    /* renamed from: c */
    public abstract void mo2055c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo2161e() {
        return true;
    }

    /* renamed from: f */
    public Rect mo2367f() {
        return this.f1770a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m2290a(listAdapter).f1693a.mo2197a((MenuItem) listAdapter.getItem(i), (C0485v) this, mo2161e() ? 0 : 4);
    }
}
