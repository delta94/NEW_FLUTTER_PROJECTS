package android.support.p030v7.view.menu;

import android.support.p030v7.view.menu.C0487w.C0488a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.k */
public class C0467k extends BaseAdapter {

    /* renamed from: a */
    C0468l f1693a;

    /* renamed from: b */
    private int f1694b = -1;

    /* renamed from: c */
    private boolean f1695c;

    /* renamed from: d */
    private final boolean f1696d;

    /* renamed from: e */
    private final LayoutInflater f1697e;

    /* renamed from: f */
    private final int f1698f;

    public C0467k(C0468l lVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1696d = z;
        this.f1697e = layoutInflater;
        this.f1693a = lVar;
        this.f1698f = i;
        mo2174a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2174a() {
        C0474p f = this.f1693a.mo2223f();
        if (f != null) {
            ArrayList j = this.f1693a.mo2231j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C0474p) j.get(i)) == f) {
                    this.f1694b = i;
                    return;
                }
            }
        }
        this.f1694b = -1;
    }

    /* renamed from: a */
    public void mo2175a(boolean z) {
        this.f1695c = z;
    }

    /* renamed from: b */
    public C0468l mo2176b() {
        return this.f1693a;
    }

    public int getCount() {
        ArrayList j = this.f1696d ? this.f1693a.mo2231j() : this.f1693a.mo2234n();
        return this.f1694b < 0 ? j.size() : j.size() - 1;
    }

    public C0474p getItem(int i) {
        ArrayList j = this.f1696d ? this.f1693a.mo2231j() : this.f1693a.mo2234n();
        int i2 = this.f1694b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0474p) j.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1697e.inflate(this.f1698f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1693a.mo2067o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0488a aVar = (C0488a) view;
        if (this.f1695c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo2017a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo2174a();
        super.notifyDataSetChanged();
    }
}
