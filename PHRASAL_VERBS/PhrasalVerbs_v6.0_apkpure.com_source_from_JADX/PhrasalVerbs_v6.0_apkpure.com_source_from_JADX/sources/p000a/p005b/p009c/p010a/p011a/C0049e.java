package p000a.p005b.p009c.p010a.p011a;

import java.lang.reflect.Array;

/* renamed from: a.b.c.a.a.e */
final class C0049e {
    /* renamed from: a */
    public static int m151a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static int[] m152a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m151a(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: a */
    public static <T> T[] m153a(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m151a(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }
}
