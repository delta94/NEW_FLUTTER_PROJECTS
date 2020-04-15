package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import p032c.p115b.p116a.C1242c;
import p032c.p115b.p116a.C1246g;

/* renamed from: com.swmansion.gesturehandler.react.h */
public class C1987h implements C1246g {

    /* renamed from: a */
    private final SparseArray<C1242c> f5898a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Integer> f5899b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<ArrayList<C1242c>> f5900c = new SparseArray<>();

    /* renamed from: a */
    private synchronized void m7568a(int i, C1242c cVar) {
        if (this.f5899b.get(cVar.mo4641l()) == null) {
            this.f5899b.put(cVar.mo4641l(), Integer.valueOf(i));
            ArrayList arrayList = (ArrayList) this.f5900c.get(i);
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(cVar);
                this.f5900c.put(i, arrayList2);
            } else {
                arrayList.add(cVar);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Handler ");
            sb.append(cVar);
            sb.append(" already attached");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private synchronized void m7569b(C1242c cVar) {
        Integer num = (Integer) this.f5899b.get(cVar.mo4641l());
        if (num != null) {
            this.f5899b.remove(cVar.mo4641l());
            ArrayList arrayList = (ArrayList) this.f5900c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(cVar);
                if (arrayList.size() == 0) {
                    this.f5900c.remove(num.intValue());
                }
            }
        }
        if (cVar.mo4642m() != null) {
            cVar.mo4628c();
        }
    }

    /* renamed from: a */
    public synchronized ArrayList<C1242c> mo4658a(View view) {
        return mo7026c(view.getId());
    }

    /* renamed from: a */
    public synchronized void mo7021a() {
        this.f5898a.clear();
        this.f5899b.clear();
        this.f5900c.clear();
    }

    /* renamed from: a */
    public synchronized void mo7022a(int i) {
        C1242c cVar = (C1242c) this.f5898a.get(i);
        if (cVar != null) {
            m7569b(cVar);
            this.f5898a.remove(i);
        }
    }

    /* renamed from: a */
    public synchronized void mo7023a(C1242c cVar) {
        this.f5898a.put(cVar.mo4641l(), cVar);
    }

    /* renamed from: a */
    public synchronized boolean mo7024a(int i, int i2) {
        boolean z;
        C1242c cVar = (C1242c) this.f5898a.get(i);
        if (cVar != null) {
            m7569b(cVar);
            m7568a(i2, cVar);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public synchronized C1242c mo7025b(int i) {
        return (C1242c) this.f5898a.get(i);
    }

    /* renamed from: c */
    public synchronized ArrayList<C1242c> mo7026c(int i) {
        return (ArrayList) this.f5900c.get(i);
    }
}
