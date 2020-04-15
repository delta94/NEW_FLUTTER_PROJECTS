package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C1937a;

public class ReactBridge {
    private static boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (!sDidInit) {
                sDidInit = true;
                sLoadStartTime = SystemClock.uptimeMillis();
                C1937a.m7339a(0, "ReactBridge.staticInit::load:reactnativejni");
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
                SoLoader.m7253a("reactnativejni");
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
                C1937a.m7338a(0);
                sLoadEndTime = SystemClock.uptimeMillis();
            }
        }
    }
}
