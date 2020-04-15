package com.facebook.common.time;

import android.os.SystemClock;
import p032c.p033a.p038c.p042d.C0710d;

@C0710d
public class RealtimeSinceBootClock implements C1264b {

    /* renamed from: a */
    private static final RealtimeSinceBootClock f4140a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @C0710d
    public static RealtimeSinceBootClock get() {
        return f4140a;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
