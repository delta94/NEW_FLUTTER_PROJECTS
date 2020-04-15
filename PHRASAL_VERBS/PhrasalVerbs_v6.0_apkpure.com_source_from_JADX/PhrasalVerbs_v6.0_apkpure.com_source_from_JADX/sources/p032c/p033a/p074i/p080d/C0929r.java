package p032c.p033a.p074i.p080d;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import p032c.p033a.p038c.p042d.C0721m;

/* renamed from: c.a.i.d.r */
public class C0929r implements C0721m<C0903B> {

    /* renamed from: a */
    private final ActivityManager f3215a;

    public C0929r(ActivityManager activityManager) {
        this.f3215a = activityManager;
    }

    /* renamed from: a */
    private int m4093a() {
        int min = Math.min(this.f3215a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    public C0903B get() {
        C0903B b = new C0903B(m4093a(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return b;
    }
}
