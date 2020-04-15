package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p046h.C0746d;
import p032c.p033a.p093j.C1129b;

/* renamed from: com.facebook.imagepipeline.memory.c */
public class C1271c {

    /* renamed from: a */
    private int f4157a;

    /* renamed from: b */
    private long f4158b;

    /* renamed from: c */
    private final int f4159c;

    /* renamed from: d */
    private final int f4160d;

    /* renamed from: e */
    private final C0746d<Bitmap> f4161e;

    public C1271c(int i, int i2) {
        boolean z = true;
        C0718j.m3243a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        C0718j.m3243a(z);
        this.f4159c = i;
        this.f4160d = i2;
        this.f4161e = new C1270b(this);
    }

    /* renamed from: a */
    public synchronized int mo4733a() {
        return this.f4157a;
    }

    /* renamed from: a */
    public synchronized void mo4734a(Bitmap bitmap) {
        int a = C1129b.m5029a(bitmap);
        C0718j.m3244a(this.f4157a > 0, (Object) "No bitmaps registered.");
        long j = (long) a;
        C0718j.m3245a(j <= this.f4158b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(a), Long.valueOf(this.f4158b));
        this.f4158b -= j;
        this.f4157a--;
    }

    /* renamed from: b */
    public synchronized int mo4735b() {
        return this.f4159c;
    }

    /* renamed from: b */
    public synchronized boolean mo4736b(Bitmap bitmap) {
        int a = C1129b.m5029a(bitmap);
        if (this.f4157a < this.f4159c) {
            long j = (long) a;
            if (this.f4158b + j <= ((long) this.f4160d)) {
                this.f4157a++;
                this.f4158b += j;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public synchronized int mo4737c() {
        return this.f4160d;
    }

    /* renamed from: d */
    public C0746d<Bitmap> mo4738d() {
        return this.f4161e;
    }

    /* renamed from: e */
    public synchronized long mo4739e() {
        return this.f4158b;
    }
}
