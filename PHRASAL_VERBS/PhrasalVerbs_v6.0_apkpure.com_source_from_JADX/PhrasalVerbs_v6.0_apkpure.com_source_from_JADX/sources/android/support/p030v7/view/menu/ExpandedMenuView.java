package android.support.p030v7.view.menu;

import android.content.Context;
import android.support.p030v7.view.menu.C0468l.C0470b;
import android.support.p030v7.widget.C0620va;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0470b, C0487w, OnItemClickListener {

    /* renamed from: a */
    private static final int[] f1588a = {16842964, 16843049};

    /* renamed from: b */
    private C0468l f1589b;

    /* renamed from: c */
    private int f1590c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0620va a = C0620va.m2920a(context, attributeSet, f1588a, i, 0);
        if (a.mo3268g(0)) {
            setBackgroundDrawable(a.mo3258b(0));
        }
        if (a.mo3268g(1)) {
            setDivider(a.mo3258b(1));
        }
        a.mo3255a();
    }

    /* renamed from: a */
    public void mo2090a(C0468l lVar) {
        this.f1589b = lVar;
    }

    /* renamed from: a */
    public boolean mo2091a(C0474p pVar) {
        return this.f1589b.mo2196a((MenuItem) pVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1590c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2091a((C0474p) getAdapter().getItem(i));
    }
}
