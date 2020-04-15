package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.C1399g;

/* renamed from: com.facebook.react.uimanager.L */
public class C1576L {

    /* renamed from: a */
    private final SparseArray<C1569E> f4777a = new SparseArray<>();

    /* renamed from: b */
    private final SparseBooleanArray f4778b = new SparseBooleanArray();

    /* renamed from: c */
    private final C1399g f4779c = new C1399g();

    /* renamed from: a */
    public int mo5681a() {
        this.f4779c.mo5193a();
        return this.f4778b.size();
    }

    /* renamed from: a */
    public C1569E mo5682a(int i) {
        this.f4779c.mo5193a();
        return (C1569E) this.f4777a.get(i);
    }

    /* renamed from: a */
    public void mo5683a(C1569E e) {
        this.f4779c.mo5193a();
        this.f4777a.put(e.mo5592g(), e);
    }

    /* renamed from: b */
    public int mo5684b(int i) {
        this.f4779c.mo5193a();
        return this.f4778b.keyAt(i);
    }

    /* renamed from: b */
    public void mo5685b(C1569E e) {
        this.f4779c.mo5193a();
        int g = e.mo5592g();
        this.f4777a.put(g, e);
        this.f4778b.put(g, true);
    }

    /* renamed from: c */
    public boolean mo5686c(int i) {
        this.f4779c.mo5193a();
        return this.f4778b.get(i);
    }

    /* renamed from: d */
    public void mo5687d(int i) {
        this.f4779c.mo5193a();
        if (!this.f4778b.get(i)) {
            this.f4777a.remove(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to remove root node ");
        sb.append(i);
        sb.append(" without using removeRootNode!");
        throw new C1685k(sb.toString());
    }

    /* renamed from: e */
    public void mo5688e(int i) {
        this.f4779c.mo5193a();
        if (i != -1) {
            if (this.f4778b.get(i)) {
                this.f4777a.remove(i);
                this.f4778b.delete(i);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("View with tag ");
            sb.append(i);
            sb.append(" is not registered as a root view");
            throw new C1685k(sb.toString());
        }
    }
}
