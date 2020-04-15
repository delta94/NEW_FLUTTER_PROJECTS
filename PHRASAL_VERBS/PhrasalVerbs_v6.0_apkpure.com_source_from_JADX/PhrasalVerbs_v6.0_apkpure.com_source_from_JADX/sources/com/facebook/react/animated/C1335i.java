package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.i */
class C1335i extends C1326Q {

    /* renamed from: h */
    private final double[] f4329h;

    /* renamed from: i */
    private final double[] f4330i;

    /* renamed from: j */
    private final String f4331j;

    /* renamed from: k */
    private final String f4332k;

    /* renamed from: l */
    private C1326Q f4333l;

    public C1335i(ReadableMap readableMap) {
        this.f4329h = m5698a(readableMap.getArray("inputRange"));
        this.f4330i = m5698a(readableMap.getArray("outputRange"));
        this.f4331j = readableMap.getString("extrapolateLeft");
        this.f4332k = readableMap.getString("extrapolateRight");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double m5695a(double r15, double r17, double r19, double r21, double r23, java.lang.String r25, java.lang.String r26) {
        /*
            r0 = r25
            r1 = r26
            r2 = 0
            java.lang.String r3 = "Invalid extrapolation type "
            java.lang.String r4 = "clamp"
            java.lang.String r5 = "identity"
            java.lang.String r6 = "extend"
            r7 = 94742715(0x5a5a8bb, float:1.5578507E-35)
            r8 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
            r9 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
            r10 = -1
            r11 = 2
            r12 = 1
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x0066
            int r13 = r25.hashCode()
            if (r13 == r9) goto L_0x0038
            if (r13 == r8) goto L_0x0030
            if (r13 == r7) goto L_0x0028
            goto L_0x0040
        L_0x0028:
            boolean r13 = r0.equals(r4)
            if (r13 == 0) goto L_0x0040
            r13 = 1
            goto L_0x0041
        L_0x0030:
            boolean r13 = r0.equals(r5)
            if (r13 == 0) goto L_0x0040
            r13 = 0
            goto L_0x0041
        L_0x0038:
            boolean r13 = r0.equals(r6)
            if (r13 == 0) goto L_0x0040
            r13 = 2
            goto L_0x0041
        L_0x0040:
            r13 = -1
        L_0x0041:
            if (r13 == 0) goto L_0x0065
            if (r13 == r12) goto L_0x0062
            if (r13 != r11) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "for left extrapolation"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0062:
            r13 = r17
            goto L_0x0067
        L_0x0065:
            return r15
        L_0x0066:
            r13 = r15
        L_0x0067:
            int r0 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b2
            int r0 = r26.hashCode()
            if (r0 == r9) goto L_0x0086
            if (r0 == r8) goto L_0x007e
            if (r0 == r7) goto L_0x0076
            goto L_0x008d
        L_0x0076:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x008d
            r10 = 1
            goto L_0x008d
        L_0x007e:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x008d
            r10 = 0
            goto L_0x008d
        L_0x0086:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x008d
            r10 = 2
        L_0x008d:
            if (r10 == 0) goto L_0x00b1
            if (r10 == r12) goto L_0x00ae
            if (r10 != r11) goto L_0x0094
            goto L_0x00b2
        L_0x0094:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "for right extrapolation"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ae:
            r13 = r19
            goto L_0x00b2
        L_0x00b1:
            return r13
        L_0x00b2:
            double r0 = r23 - r21
            double r13 = r13 - r17
            double r0 = r0 * r13
            double r2 = r19 - r17
            double r0 = r0 / r2
            double r0 = r21 + r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.C1335i.m5695a(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    /* renamed from: a */
    static double m5696a(double d, double[] dArr, double[] dArr2, String str, String str2) {
        int a = m5697a(d, dArr);
        int i = a + 1;
        return m5695a(d, dArr[a], dArr[i], dArr2[a], dArr2[i], str, str2);
    }

    /* renamed from: a */
    private static int m5697a(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d) {
            i++;
        }
        return i - 1;
    }

    /* renamed from: a */
    private static double[] m5698a(ReadableArray readableArray) {
        double[] dArr = new double[readableArray.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    /* renamed from: a */
    public void mo4836a() {
        C1326Q q = this.f4333l;
        if (q != null) {
            this.f4296e = m5696a(q.mo4864d(), this.f4329h, this.f4330i, this.f4331j, this.f4332k);
        }
    }

    /* renamed from: b */
    public void mo4867b(C1328b bVar) {
        if (this.f4333l != null) {
            throw new IllegalStateException("Parent already attached");
        } else if (bVar instanceof C1326Q) {
            this.f4333l = (C1326Q) bVar;
        } else {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
    }

    /* renamed from: c */
    public void mo4868c(C1328b bVar) {
        if (bVar == this.f4333l) {
            this.f4333l = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }
}
