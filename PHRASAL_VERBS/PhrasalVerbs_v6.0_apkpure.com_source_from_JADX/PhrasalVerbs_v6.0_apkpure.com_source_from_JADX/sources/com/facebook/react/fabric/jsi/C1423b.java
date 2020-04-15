package com.facebook.react.fabric.jsi;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C1937a;

/* renamed from: com.facebook.react.fabric.jsi.b */
public class C1423b {

    /* renamed from: a */
    private static boolean f4431a = false;

    /* renamed from: a */
    public static void m5817a() {
        if (!f4431a) {
            f4431a = true;
            C1937a.m7339a(0, "FabricSoLoader.staticInit::load:fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.m7253a("fabricjni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            C1937a.m7338a(0);
        }
    }
}
