package p032c.p033a.p038c.p042d;

/* renamed from: c.a.c.d.g */
public class C0713g {
    /* renamed from: a */
    public static int m3228a(int... iArr) {
        C0718j.m3243a(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }
}
