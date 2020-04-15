package com.facebook.react.uimanager.events;

import com.facebook.react.common.C1401i;
import com.facebook.react.uimanager.events.C1635c;

/* renamed from: com.facebook.react.uimanager.events.c */
public abstract class C1635c<T extends C1635c> {

    /* renamed from: a */
    private static int f4886a;

    /* renamed from: b */
    private boolean f4887b;

    /* renamed from: c */
    private int f4888c;

    /* renamed from: d */
    private long f4889d;

    /* renamed from: e */
    private int f4890e;

    protected C1635c() {
        int i = f4886a;
        f4886a = i + 1;
        this.f4890e = i;
    }

    protected C1635c(int i) {
        int i2 = f4886a;
        f4886a = i2 + 1;
        this.f4890e = i2;
        mo5871a(i);
    }

    /* renamed from: a */
    public T mo5870a(T t) {
        return mo5875e() >= t.mo5875e() ? this : t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5871a(int i) {
        this.f4888c = i;
        this.f4889d = C1401i.m5753c();
        this.f4887b = true;
    }

    /* renamed from: a */
    public abstract void mo5868a(RCTEventEmitter rCTEventEmitter);

    /* renamed from: a */
    public boolean mo5872a() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5873b() {
        this.f4887b = false;
        mo5879i();
    }

    /* renamed from: c */
    public short mo5874c() {
        return 0;
    }

    /* renamed from: d */
    public abstract String mo5869d();

    /* renamed from: e */
    public final long mo5875e() {
        return this.f4889d;
    }

    /* renamed from: f */
    public int mo5876f() {
        return this.f4890e;
    }

    /* renamed from: g */
    public final int mo5877g() {
        return this.f4888c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo5878h() {
        return this.f4887b;
    }

    /* renamed from: i */
    public void mo5879i() {
    }
}
