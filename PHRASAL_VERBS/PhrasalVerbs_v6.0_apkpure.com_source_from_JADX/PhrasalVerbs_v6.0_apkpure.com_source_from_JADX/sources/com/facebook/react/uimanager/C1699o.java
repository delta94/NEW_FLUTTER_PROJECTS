package com.facebook.react.uimanager;

import java.lang.reflect.Array;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.o */
public class C1699o {

    /* renamed from: com.facebook.react.uimanager.o$a */
    public static class C1700a {

        /* renamed from: a */
        double[] f5051a = new double[4];

        /* renamed from: b */
        double[] f5052b = new double[3];

        /* renamed from: c */
        double[] f5053c = new double[3];

        /* renamed from: d */
        double[] f5054d = new double[3];

        /* renamed from: e */
        double[] f5055e = new double[3];
    }

    /* renamed from: a */
    public static double m6561a(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: a */
    public static double m6562a(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double d21 = d3 * d6;
        double d22 = d2 * d7;
        double d23 = d4 * d5;
        double d24 = d8 * d;
        double d25 = d3 * d5;
        double d26 = d7 * d;
        double d27 = d2 * d5;
        double d28 = d * d6;
        return ((((((((((((((((((((((((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13)) + ((d20 * d11) * d13)) + ((d21 * d12) * d13)) - ((d22 * d12) * d13)) - ((d17 * d9) * d14)) + ((d18 * d9) * d14)) + ((d23 * d11) * d14)) - ((d24 * d11) * d14)) - ((d25 * d12) * d14)) + ((d26 * d12) * d14)) + ((d19 * d9) * d15)) - ((d20 * d9) * d15)) - ((d23 * d10) * d15)) + ((d24 * d10) * d15)) + ((d27 * d12) * d15)) - ((d12 * d28) * d15)) - ((d21 * d9) * d16)) + ((d22 * d9) * d16)) + ((d25 * d10) * d16)) - ((d26 * d10) * d16)) - ((d27 * d11) * d16)) + (d28 * d11 * d16);
    }

    /* renamed from: a */
    public static void m6563a(double[] dArr, double d) {
        dArr[11] = -1.0d / d;
    }

    /* renamed from: a */
    public static void m6564a(double[] dArr, double d, double d2) {
        dArr[12] = d;
        dArr[13] = d2;
    }

    /* renamed from: a */
    public static void m6565a(double[] dArr, double d, double d2, double d3) {
        dArr[12] = d;
        dArr[13] = d2;
        dArr[14] = d3;
    }

    /* renamed from: a */
    public static void m6566a(double[] dArr, C1700a aVar) {
        double[] dArr2 = dArr;
        C1700a aVar2 = aVar;
        C1136a.m5055a(dArr2.length == 16);
        double[] dArr3 = aVar2.f5051a;
        double[] dArr4 = aVar2.f5052b;
        double[] dArr5 = aVar2.f5053c;
        double[] dArr6 = aVar2.f5054d;
        double[] dArr7 = aVar2.f5055e;
        if (!m6577c(dArr2[15])) {
            double[][] dArr8 = (double[][]) Array.newInstance(double.class, new int[]{4, 4});
            double[] dArr9 = new double[16];
            for (int i = 0; i < 4; i++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    int i3 = (i * 4) + i2;
                    double d = dArr2[i3] / dArr2[15];
                    dArr8[i][i2] = d;
                    if (i2 == 3) {
                        d = 0.0d;
                    }
                    dArr9[i3] = d;
                }
            }
            dArr9[15] = 1.0d;
            if (!m6577c(m6562a(dArr9))) {
                if (!m6577c(dArr8[0][3]) || !m6577c(dArr8[1][3]) || !m6577c(dArr8[2][3])) {
                    m6573b(new double[]{dArr8[0][3], dArr8[1][3], dArr8[2][3], dArr8[3][3]}, m6579d(m6574b(dArr9)), dArr3);
                } else {
                    dArr3[2] = 0.0d;
                    dArr3[1] = 0.0d;
                    dArr3[0] = 0.0d;
                    dArr3[3] = 1.0d;
                }
                for (int i4 = 0; i4 < 3; i4++) {
                    dArr6[i4] = dArr8[3][i4];
                }
                double[][] dArr10 = (double[][]) Array.newInstance(double.class, new int[]{3, 3});
                for (int i5 = 0; i5 < 3; i5++) {
                    dArr10[i5][0] = dArr8[i5][0];
                    dArr10[i5][1] = dArr8[i5][1];
                    dArr10[i5][2] = dArr8[i5][2];
                }
                dArr4[0] = m6580e(dArr10[0]);
                dArr10[0] = m6585i(dArr10[0], dArr4[0]);
                dArr5[0] = m6571b(dArr10[0], dArr10[1]);
                dArr10[1] = m6569a(dArr10[1], dArr10[0], 1.0d, -dArr5[0]);
                dArr5[0] = m6571b(dArr10[0], dArr10[1]);
                dArr10[1] = m6569a(dArr10[1], dArr10[0], 1.0d, -dArr5[0]);
                dArr4[1] = m6580e(dArr10[1]);
                dArr10[1] = m6585i(dArr10[1], dArr4[1]);
                dArr5[0] = dArr5[0] / dArr4[1];
                dArr5[1] = m6571b(dArr10[0], dArr10[2]);
                dArr10[2] = m6569a(dArr10[2], dArr10[0], 1.0d, -dArr5[1]);
                dArr5[2] = m6571b(dArr10[1], dArr10[2]);
                dArr10[2] = m6569a(dArr10[2], dArr10[1], 1.0d, -dArr5[2]);
                dArr4[2] = m6580e(dArr10[2]);
                dArr10[2] = m6585i(dArr10[2], dArr4[2]);
                dArr5[1] = dArr5[1] / dArr4[2];
                dArr5[2] = dArr5[2] / dArr4[2];
                if (m6571b(dArr10[0], m6568a(dArr10[1], dArr10[2])) < 0.0d) {
                    for (int i6 = 0; i6 < 3; i6++) {
                        dArr4[i6] = dArr4[i6] * -1.0d;
                        double[] dArr11 = dArr10[i6];
                        dArr11[0] = dArr11[0] * -1.0d;
                        double[] dArr12 = dArr10[i6];
                        dArr12[1] = dArr12[1] * -1.0d;
                        double[] dArr13 = dArr10[i6];
                        dArr13[2] = dArr13[2] * -1.0d;
                    }
                }
                dArr7[0] = m6570b((-Math.atan2(dArr10[2][1], dArr10[2][2])) * 57.29577951308232d);
                dArr7[1] = m6570b((-Math.atan2(-dArr10[2][0], Math.sqrt((dArr10[2][1] * dArr10[2][1]) + (dArr10[2][2] * dArr10[2][2])))) * 57.29577951308232d);
                dArr7[2] = m6570b((-Math.atan2(dArr10[1][0], dArr10[0][0])) * 57.29577951308232d);
            }
        }
    }

    /* renamed from: a */
    public static void m6567a(double[] dArr, double[] dArr2, double[] dArr3) {
        double d = dArr2[0];
        double d2 = dArr2[1];
        double d3 = dArr2[2];
        double d4 = dArr2[3];
        double d5 = dArr2[4];
        double d6 = dArr2[5];
        double d7 = dArr2[6];
        double d8 = dArr2[7];
        double d9 = dArr2[8];
        double d10 = dArr2[9];
        double d11 = dArr2[10];
        double d12 = dArr2[11];
        double d13 = dArr2[12];
        double d14 = dArr2[13];
        double d15 = dArr2[14];
        double d16 = dArr2[15];
        double d17 = dArr3[0];
        double d18 = dArr3[1];
        double d19 = dArr3[2];
        double d20 = dArr3[3];
        dArr[0] = (d17 * d) + (d18 * d5) + (d19 * d9) + (d20 * d13);
        dArr[1] = (d17 * d2) + (d18 * d6) + (d19 * d10) + (d20 * d14);
        dArr[2] = (d17 * d3) + (d18 * d7) + (d19 * d11) + (d20 * d15);
        dArr[3] = (d17 * d4) + (d18 * d8) + (d19 * d12) + (d20 * d16);
        double d21 = dArr3[4];
        double d22 = dArr3[5];
        double d23 = dArr3[6];
        double d24 = dArr3[7];
        dArr[4] = (d21 * d) + (d22 * d5) + (d23 * d9) + (d24 * d13);
        dArr[5] = (d21 * d2) + (d22 * d6) + (d23 * d10) + (d24 * d14);
        dArr[6] = (d21 * d3) + (d22 * d7) + (d23 * d11) + (d24 * d15);
        dArr[7] = (d21 * d4) + (d22 * d8) + (d23 * d12) + (d24 * d16);
        double d25 = dArr3[8];
        double d26 = dArr3[9];
        double d27 = dArr3[10];
        double d28 = dArr3[11];
        dArr[8] = (d25 * d) + (d26 * d5) + (d27 * d9) + (d28 * d13);
        dArr[9] = (d25 * d2) + (d26 * d6) + (d27 * d10) + (d28 * d14);
        dArr[10] = (d25 * d3) + (d26 * d7) + (d27 * d11) + (d28 * d15);
        dArr[11] = (d25 * d4) + (d26 * d8) + (d27 * d12) + (d28 * d16);
        double d29 = dArr3[12];
        double d30 = dArr3[13];
        double d31 = dArr3[14];
        double d32 = dArr3[15];
        dArr[12] = (d * d29) + (d5 * d30) + (d9 * d31) + (d13 * d32);
        dArr[13] = (d2 * d29) + (d6 * d30) + (d10 * d31) + (d14 * d32);
        dArr[14] = (d3 * d29) + (d7 * d30) + (d11 * d31) + (d15 * d32);
        dArr[15] = (d29 * d4) + (d30 * d8) + (d31 * d12) + (d32 * d16);
    }

    /* renamed from: a */
    public static double[] m6568a(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[1] * dArr2[2]) - (dArr[2] * dArr2[1]), (dArr[2] * dArr2[0]) - (dArr[0] * dArr2[2]), (dArr[0] * dArr2[1]) - (dArr[1] * dArr2[0])};
    }

    /* renamed from: a */
    public static double[] m6569a(double[] dArr, double[] dArr2, double d, double d2) {
        return new double[]{(dArr[0] * d) + (dArr2[0] * d2), (dArr[1] * d) + (dArr2[1] * d2), (d * dArr[2]) + (d2 * dArr2[2])};
    }

    /* renamed from: b */
    public static double m6570b(double d) {
        double round = (double) Math.round(d * 1000.0d);
        Double.isNaN(round);
        return round * 0.001d;
    }

    /* renamed from: b */
    public static double m6571b(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    /* renamed from: b */
    public static void m6572b(double[] dArr, double d) {
        dArr[5] = Math.cos(d);
        dArr[6] = Math.sin(d);
        dArr[9] = -Math.sin(d);
        dArr[10] = Math.cos(d);
    }

    /* renamed from: b */
    public static void m6573b(double[] dArr, double[] dArr2, double[] dArr3) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        dArr3[0] = (dArr2[0] * d) + (dArr2[4] * d2) + (dArr2[8] * d3) + (dArr2[12] * d4);
        dArr3[1] = (dArr2[1] * d) + (dArr2[5] * d2) + (dArr2[9] * d3) + (dArr2[13] * d4);
        dArr3[2] = (dArr2[2] * d) + (dArr2[6] * d2) + (dArr2[10] * d3) + (dArr2[14] * d4);
        dArr3[3] = (d * dArr2[3]) + (d2 * dArr2[7]) + (d3 * dArr2[11]) + (d4 * dArr2[15]);
    }

    /* renamed from: b */
    public static double[] m6574b(double[] dArr) {
        double a = m6562a(dArr);
        if (m6577c(a)) {
            return dArr;
        }
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d7 * d12;
        double d18 = d8 * d11;
        double d19 = d8 * d10;
        double d20 = d6 * d12;
        double d21 = d7 * d10;
        double d22 = ((((d17 * d14) - (d18 * d14)) + (d19 * d15)) - (d20 * d15)) - (d21 * d16);
        double d23 = d6 * d11;
        double d24 = d4 * d11;
        double d25 = d3 * d12;
        double d26 = d4 * d10;
        double d27 = d2 * d12;
        double d28 = d3 * d10;
        double d29 = (((d24 * d14) - (d25 * d14)) - (d26 * d15)) + (d27 * d15) + (d28 * d16);
        double d30 = d2 * d11;
        double d31 = d3 * d8;
        double d32 = d4 * d7;
        double d33 = d4 * d6;
        double d34 = d2 * d8;
        double d35 = d3 * d6;
        double d36 = ((((d31 * d14) - (d32 * d14)) + (d33 * d15)) - (d34 * d15)) - (d35 * d16);
        double d37 = d2 * d7;
        double d38 = (d18 * d13) - (d17 * d13);
        double d39 = d8 * d9;
        double d40 = d5 * d12;
        double d41 = d7 * d9;
        double d42 = (d38 - (d39 * d15)) + (d40 * d15) + (d41 * d16);
        double d43 = d5 * d11;
        double d44 = (d25 * d13) - (d24 * d13);
        double d45 = d4 * d9;
        double d46 = d * d12;
        double d47 = d3 * d9;
        double d48 = d * d11;
        double d49 = d4 * d5;
        double d50 = d8 * d;
        double d51 = d3 * d5;
        double d52 = d7 * d;
        double d53 = d6 * d9;
        double d54 = ((((d20 * d13) - (d19 * d13)) + (d39 * d14)) - (d40 * d14)) - (d53 * d16);
        double d55 = d5 * d10;
        double d56 = d2 * d9;
        double d57 = d * d10;
        double d58 = d2 * d5;
        double d59 = d * d6;
        return new double[]{(d22 + (d23 * d16)) / a, (d29 - (d30 * d16)) / a, (d36 + (d37 * d16)) / a, ((((((d32 * d10) - (d31 * d10)) - (d33 * d11)) + (d34 * d11)) + (d35 * d12)) - (d37 * d12)) / a, (d42 - (d43 * d16)) / a, ((((d44 + (d45 * d15)) - (d46 * d15)) - (d47 * d16)) + (d48 * d16)) / a, ((((((d32 * d13) - (d31 * d13)) - (d49 * d15)) + (d50 * d15)) + (d51 * d16)) - (d52 * d16)) / a, ((((((d31 * d9) - (d32 * d9)) + (d49 * d11)) - (d50 * d11)) - (d51 * d12)) + (d52 * d12)) / a, (d54 + (d55 * d16)) / a, ((((((d26 * d13) - (d27 * d13)) - (d45 * d14)) + (d46 * d14)) + (d56 * d16)) - (d57 * d16)) / a, ((((((d34 * d13) - (d33 * d13)) + (d49 * d14)) - (d50 * d14)) - (d58 * d16)) + (d16 * d59)) / a, ((((((d33 * d9) - (d34 * d9)) - (d49 * d10)) + (d50 * d10)) + (d58 * d12)) - (d12 * d59)) / a, ((((((d21 * d13) - (d23 * d13)) - (d41 * d14)) + (d43 * d14)) + (d53 * d15)) - (d55 * d15)) / a, ((((((d30 * d13) - (d28 * d13)) + (d47 * d14)) - (d48 * d14)) - (d56 * d15)) + (d57 * d15)) / a, ((((((d35 * d13) - (d13 * d37)) - (d51 * d14)) + (d14 * d52)) + (d58 * d15)) - (d15 * d59)) / a, ((((((d37 * d9) - (d35 * d9)) + (d51 * d10)) - (d52 * d10)) - (d58 * d11)) + (d59 * d11)) / a};
    }

    /* renamed from: c */
    public static void m6575c(double[] dArr) {
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[11] = 0.0d;
        dArr[9] = 0.0d;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[15] = 1.0d;
        dArr[10] = 1.0d;
        dArr[5] = 1.0d;
        dArr[0] = 1.0d;
    }

    /* renamed from: c */
    public static void m6576c(double[] dArr, double d) {
        dArr[0] = Math.cos(d);
        dArr[2] = -Math.sin(d);
        dArr[8] = Math.sin(d);
        dArr[10] = Math.cos(d);
    }

    /* renamed from: c */
    private static boolean m6577c(double d) {
        boolean z = false;
        if (Double.isNaN(d)) {
            return false;
        }
        if (Math.abs(d) < 1.0E-5d) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public static void m6578d(double[] dArr, double d) {
        dArr[0] = Math.cos(d);
        dArr[1] = Math.sin(d);
        dArr[4] = -Math.sin(d);
        dArr[5] = Math.cos(d);
    }

    /* renamed from: d */
    public static double[] m6579d(double[] dArr) {
        return new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    /* renamed from: e */
    public static double m6580e(double[] dArr) {
        return Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1]) + (dArr[2] * dArr[2]));
    }

    /* renamed from: e */
    public static void m6581e(double[] dArr, double d) {
        dArr[0] = d;
    }

    /* renamed from: f */
    public static void m6582f(double[] dArr, double d) {
        dArr[5] = d;
    }

    /* renamed from: g */
    public static void m6583g(double[] dArr, double d) {
        dArr[4] = Math.tan(d);
    }

    /* renamed from: h */
    public static void m6584h(double[] dArr, double d) {
        dArr[1] = Math.tan(d);
    }

    /* renamed from: i */
    public static double[] m6585i(double[] dArr, double d) {
        if (m6577c(d)) {
            d = m6580e(dArr);
        }
        double d2 = 1.0d / d;
        return new double[]{dArr[0] * d2, dArr[1] * d2, dArr[2] * d2};
    }
}
