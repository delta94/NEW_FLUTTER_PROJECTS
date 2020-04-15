package android.support.p029v4.util;

/* renamed from: android.support.v4.util.n */
public class C0337n {
    /* renamed from: a */
    public static int m1441a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static <T> T m1442a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m1443a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
