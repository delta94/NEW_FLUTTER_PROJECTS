package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.imagepipeline.memory.f */
class C1274f<V> {

    /* renamed from: a */
    public final int f4166a;

    /* renamed from: b */
    public final int f4167b;

    /* renamed from: c */
    final Queue f4168c;

    /* renamed from: d */
    private final boolean f4169d;

    /* renamed from: e */
    private int f4170e;

    public C1274f(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        C0718j.m3247b(i > 0);
        C0718j.m3247b(i2 >= 0);
        if (i3 < 0) {
            z2 = false;
        }
        C0718j.m3247b(z2);
        this.f4166a = i;
        this.f4167b = i2;
        this.f4168c = new LinkedList();
        this.f4170e = i3;
        this.f4169d = z;
    }

    /* renamed from: a */
    public void mo4743a() {
        C0718j.m3247b(this.f4170e > 0);
        this.f4170e--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4744a(V v) {
        this.f4168c.add(v);
    }

    /* renamed from: b */
    public V mo4745b() {
        V f = mo4750f();
        if (f != null) {
            this.f4170e++;
        }
        return f;
    }

    /* renamed from: b */
    public void mo4746b(V v) {
        int i;
        C0718j.m3240a(v);
        boolean z = false;
        if (this.f4169d) {
            if (this.f4170e > 0) {
                z = true;
            }
            C0718j.m3247b(z);
            i = this.f4170e;
        } else {
            i = this.f4170e;
            if (i <= 0) {
                C0727a.m3268a("BUCKET", "Tried to release value %s from an empty bucket!", v);
                return;
            }
        }
        this.f4170e = i - 1;
        mo4744a(v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4747c() {
        return this.f4168c.size();
    }

    /* renamed from: d */
    public void mo4748d() {
        this.f4170e++;
    }

    /* renamed from: e */
    public boolean mo4749e() {
        return this.f4170e + mo4747c() > this.f4167b;
    }

    /* renamed from: f */
    public V mo4750f() {
        return this.f4168c.poll();
    }
}
