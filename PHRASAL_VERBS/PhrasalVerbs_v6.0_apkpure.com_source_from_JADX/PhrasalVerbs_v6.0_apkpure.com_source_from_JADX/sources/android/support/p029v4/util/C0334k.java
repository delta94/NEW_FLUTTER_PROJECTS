package android.support.p029v4.util;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: android.support.v4.util.k */
public class C0334k {
    /* renamed from: a */
    public static int m1438a(Object... objArr) {
        return VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }
}
