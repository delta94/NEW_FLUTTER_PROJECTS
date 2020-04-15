package p032c.p033a.p038c.p040b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: c.a.c.b.f */
public class C0699f extends C0696c {

    /* renamed from: b */
    private static C0699f f2585b;

    private C0699f() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static C0699f m3211b() {
        if (f2585b == null) {
            f2585b = new C0699f();
        }
        return f2585b;
    }

    public void execute(Runnable runnable) {
        if (mo3434a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
