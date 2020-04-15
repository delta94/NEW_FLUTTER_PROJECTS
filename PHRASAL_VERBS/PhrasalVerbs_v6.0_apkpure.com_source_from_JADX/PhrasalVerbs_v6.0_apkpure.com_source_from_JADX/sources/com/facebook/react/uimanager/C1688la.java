package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.facebook.react.uimanager.la */
public class C1688la {

    /* renamed from: a */
    private final ViewGroup f5040a;

    /* renamed from: b */
    private int f5041b = 0;

    /* renamed from: c */
    private int[] f5042c;

    public C1688la(ViewGroup viewGroup) {
        this.f5040a = viewGroup;
    }

    /* renamed from: a */
    public int mo5948a(int i, int i2) {
        if (this.f5042c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.f5040a.getChildAt(i3));
            }
            Collections.sort(arrayList, new C1686ka(this));
            this.f5042c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.f5042c[i4] = this.f5040a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.f5042c[i2];
    }

    /* renamed from: a */
    public void mo5949a(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f5041b++;
        }
        this.f5042c = null;
    }

    /* renamed from: a */
    public boolean mo5950a() {
        return this.f5041b > 0;
    }

    /* renamed from: b */
    public void mo5951b() {
        this.f5041b = 0;
        for (int i = 0; i < this.f5040a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.f5040a.getChildAt(i)) != null) {
                this.f5041b++;
            }
        }
        this.f5042c = null;
    }

    /* renamed from: b */
    public void mo5952b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f5041b--;
        }
        this.f5042c = null;
    }
}
