package android.support.p030v7.widget;

/* renamed from: android.support.v7.widget.Y */
class C0559Y {

    /* renamed from: a */
    private int f2180a = 0;

    /* renamed from: b */
    private int f2181b = 0;

    /* renamed from: c */
    private int f2182c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2183d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2184e = 0;

    /* renamed from: f */
    private int f2185f = 0;

    /* renamed from: g */
    private boolean f2186g = false;

    /* renamed from: h */
    private boolean f2187h = false;

    C0559Y() {
    }

    /* renamed from: a */
    public int mo3006a() {
        return this.f2186g ? this.f2180a : this.f2181b;
    }

    /* renamed from: a */
    public void mo3007a(int i, int i2) {
        this.f2187h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2184e = i;
            this.f2180a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2185f = i2;
            this.f2181b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3008a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f2186g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f2186g = r2
            boolean r0 = r1.f2187h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f2183d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f2184e
        L_0x0016:
            r1.f2180a = r2
            int r2 = r1.f2182c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f2182c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f2184e
        L_0x0024:
            r1.f2180a = r2
            int r2 = r1.f2183d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f2184e
            r1.f2180a = r2
        L_0x002f:
            int r2 = r1.f2185f
        L_0x0031:
            r1.f2181b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0559Y.mo3008a(boolean):void");
    }

    /* renamed from: b */
    public int mo3009b() {
        return this.f2180a;
    }

    /* renamed from: b */
    public void mo3010b(int i, int i2) {
        this.f2182c = i;
        this.f2183d = i2;
        this.f2187h = true;
        if (this.f2186g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2180a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2181b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2180a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2181b = i2;
        }
    }

    /* renamed from: c */
    public int mo3011c() {
        return this.f2181b;
    }

    /* renamed from: d */
    public int mo3012d() {
        return this.f2186g ? this.f2181b : this.f2180a;
    }
}
