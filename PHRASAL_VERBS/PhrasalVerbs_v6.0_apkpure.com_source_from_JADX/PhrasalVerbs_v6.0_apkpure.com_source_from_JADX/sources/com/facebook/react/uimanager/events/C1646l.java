package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* renamed from: com.facebook.react.uimanager.events.l */
public class C1646l {

    /* renamed from: a */
    private final SparseIntArray f4921a = new SparseIntArray();

    /* renamed from: a */
    public void mo5899a(long j) {
        this.f4921a.put((int) j, 0);
    }

    /* renamed from: b */
    public short mo5900b(long j) {
        int i = this.f4921a.get((int) j, -1);
        if (i != -1) {
            return (short) (65535 & i);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    /* renamed from: c */
    public boolean mo5901c(long j) {
        return this.f4921a.get((int) j, -1) != -1;
    }

    /* renamed from: d */
    public void mo5902d(long j) {
        int i = (int) j;
        int i2 = this.f4921a.get(i, -1);
        if (i2 != -1) {
            this.f4921a.put(i, i2 + 1);
            return;
        }
        throw new RuntimeException("Tried to increment non-existent cookie");
    }

    /* renamed from: e */
    public void mo5903e(long j) {
        this.f4921a.delete((int) j);
    }
}
