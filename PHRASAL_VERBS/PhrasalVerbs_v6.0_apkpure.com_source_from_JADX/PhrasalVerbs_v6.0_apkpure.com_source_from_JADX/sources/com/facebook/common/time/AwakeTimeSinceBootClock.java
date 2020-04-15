package com.facebook.common.time;

import android.os.SystemClock;
import p032c.p033a.p038c.p042d.C0710d;

@C0710d
public class AwakeTimeSinceBootClock implements C1264b {
    @C0710d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @C0710d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @C0710d
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
