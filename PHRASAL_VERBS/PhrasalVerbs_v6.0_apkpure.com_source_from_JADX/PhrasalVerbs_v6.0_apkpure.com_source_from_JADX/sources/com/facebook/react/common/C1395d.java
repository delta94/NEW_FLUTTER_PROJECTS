package com.facebook.react.common;

/* renamed from: com.facebook.react.common.d */
public class C1395d {

    /* renamed from: a */
    private long[] f4388a;

    /* renamed from: b */
    private int f4389b = 0;

    private C1395d(int i) {
        this.f4388a = new long[i];
    }

    /* renamed from: a */
    public static C1395d m5727a(int i) {
        return new C1395d(i);
    }

    /* renamed from: b */
    private void m5728b() {
        int i = this.f4389b;
        if (i == this.f4388a.length) {
            int i2 = i + 1;
            double d = (double) i;
            Double.isNaN(d);
            long[] jArr = new long[Math.max(i2, (int) (d * 1.8d))];
            System.arraycopy(this.f4388a, 0, jArr, 0, this.f4389b);
            this.f4388a = jArr;
        }
    }

    /* renamed from: a */
    public int mo5178a() {
        return this.f4389b;
    }

    /* renamed from: a */
    public void mo5179a(int i, long j) {
        if (i < this.f4389b) {
            this.f4388a[i] = j;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(i);
        sb.append(" >= ");
        sb.append(this.f4389b);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public void mo5180a(long j) {
        m5728b();
        long[] jArr = this.f4388a;
        int i = this.f4389b;
        this.f4389b = i + 1;
        jArr[i] = j;
    }

    /* renamed from: b */
    public void mo5181b(int i) {
        int i2 = this.f4389b;
        if (i <= i2) {
            this.f4389b = i2 - i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to drop ");
        sb.append(i);
        sb.append(" items from array of length ");
        sb.append(this.f4389b);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public long mo5182c(int i) {
        if (i < this.f4389b) {
            return this.f4388a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(i);
        sb.append(" >= ");
        sb.append(this.f4389b);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
