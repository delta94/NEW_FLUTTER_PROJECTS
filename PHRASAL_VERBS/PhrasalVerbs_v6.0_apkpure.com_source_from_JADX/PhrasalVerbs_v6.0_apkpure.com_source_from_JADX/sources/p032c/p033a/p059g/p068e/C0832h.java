package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.e.h */
public class C0832h extends C0826b {

    /* renamed from: i */
    private final Drawable[] f2926i;

    /* renamed from: j */
    int f2927j;

    /* renamed from: k */
    int f2928k;

    /* renamed from: l */
    long f2929l;

    /* renamed from: m */
    int[] f2930m;

    /* renamed from: n */
    int[] f2931n;

    /* renamed from: o */
    int f2932o;

    /* renamed from: p */
    boolean[] f2933p;

    /* renamed from: q */
    int f2934q;

    public C0832h(Drawable[] drawableArr) {
        super(drawableArr);
        boolean z = true;
        if (drawableArr.length < 1) {
            z = false;
        }
        C0718j.m3248b(z, "At least one layer required!");
        this.f2926i = drawableArr;
        this.f2930m = new int[drawableArr.length];
        this.f2931n = new int[drawableArr.length];
        this.f2932o = 255;
        this.f2933p = new boolean[drawableArr.length];
        this.f2934q = 0;
        m3731g();
    }

    /* renamed from: a */
    private void m3729a(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.f2934q++;
            drawable.mutate().setAlpha(i);
            this.f2934q--;
            drawable.draw(canvas);
        }
    }

    /* renamed from: a */
    private boolean m3730a(float f) {
        boolean z = true;
        for (int i = 0; i < this.f2926i.length; i++) {
            int i2 = this.f2933p[i] ? 1 : -1;
            int[] iArr = this.f2931n;
            iArr[i] = (int) (((float) this.f2930m[i]) + (((float) (i2 * 255)) * f));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            int[] iArr2 = this.f2931n;
            if (iArr2[i] > 255) {
                iArr2[i] = 255;
            }
            if (this.f2933p[i] && this.f2931n[i] < 255) {
                z = false;
            }
            if (!this.f2933p[i] && this.f2931n[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    private void m3731g() {
        this.f2927j = 2;
        Arrays.fill(this.f2930m, 0);
        this.f2930m[0] = 255;
        Arrays.fill(this.f2931n, 0);
        this.f2931n[0] = 255;
        Arrays.fill(this.f2933p, false);
        this.f2933p[0] = true;
    }

    /* renamed from: b */
    public void mo3768b() {
        this.f2934q++;
    }

    /* renamed from: c */
    public void mo3769c() {
        this.f2934q--;
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo3770c(int i) {
        this.f2927j = 0;
        this.f2933p[i] = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo3771d() {
        this.f2927j = 0;
        Arrays.fill(this.f2933p, true);
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo3772d(int i) {
        this.f2927j = 0;
        this.f2933p[i] = false;
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r0 != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0 != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[LOOP:0: B:18:0x004a->B:20:0x004f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[EDGE_INSN: B:23:0x0061->B:21:0x0061 ?: BREAK  
    EDGE_INSN: B:23:0x0061->B:21:0x0061 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f2927j
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r3) goto L_0x000b
            r0 = 1
            goto L_0x004a
        L_0x000b:
            int r0 = r8.f2928k
            if (r0 <= 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            p032c.p033a.p038c.p042d.C0718j.m3247b(r0)
            long r4 = r8.mo3775f()
            long r6 = r8.f2929l
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f2928k
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.m3730a(r0)
            if (r0 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0028:
            int[] r0 = r8.f2931n
            int[] r4 = r8.f2930m
            android.graphics.drawable.Drawable[] r5 = r8.f2926i
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.mo3775f()
            r8.f2929l = r4
            int r0 = r8.f2928k
            if (r0 != 0) goto L_0x003f
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            boolean r0 = r8.m3730a(r0)
            if (r0 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = 1
        L_0x0048:
            r8.f2927j = r1
        L_0x004a:
            android.graphics.drawable.Drawable[] r1 = r8.f2926i
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0061
            r1 = r1[r2]
            int[] r3 = r8.f2931n
            r3 = r3[r2]
            int r4 = r8.f2932o
            int r3 = r3 * r4
            int r3 = r3 / 255
            r8.m3729a(r9, r1, r3)
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0061:
            if (r0 != 0) goto L_0x0066
            r8.invalidateSelf()
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p059g.p068e.C0832h.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public void mo3773e() {
        this.f2927j = 2;
        for (int i = 0; i < this.f2926i.length; i++) {
            this.f2931n[i] = this.f2933p[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* renamed from: e */
    public void mo3774e(int i) {
        this.f2928k = i;
        if (this.f2927j == 1) {
            this.f2927j = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo3775f() {
        return SystemClock.uptimeMillis();
    }

    public int getAlpha() {
        return this.f2932o;
    }

    public void invalidateSelf() {
        if (this.f2934q == 0) {
            super.invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        if (this.f2932o != i) {
            this.f2932o = i;
            invalidateSelf();
        }
    }
}
