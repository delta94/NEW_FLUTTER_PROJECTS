package com.facebook.react.common;

import android.support.p029v4.util.C0335l;

/* renamed from: com.facebook.react.common.a */
public class C1391a<T> implements C0335l<T> {

    /* renamed from: a */
    private final Object[] f4386a;

    /* renamed from: b */
    private int f4387b = 0;

    public C1391a(int i) {
        this.f4386a = new Object[i];
    }

    /* renamed from: a */
    public synchronized T mo5175a() {
        if (this.f4387b == 0) {
            return null;
        }
        this.f4387b--;
        int i = this.f4387b;
        T t = this.f4386a[i];
        this.f4386a[i] = null;
        return t;
    }

    /* renamed from: a */
    public synchronized boolean mo5176a(T t) {
        if (this.f4387b == this.f4386a.length) {
            return false;
        }
        this.f4386a[this.f4387b] = t;
        this.f4387b++;
        return true;
    }

    /* renamed from: b */
    public synchronized void mo5177b() {
        for (int i = 0; i < this.f4387b; i++) {
            this.f4386a[i] = null;
        }
        this.f4387b = 0;
    }
}
