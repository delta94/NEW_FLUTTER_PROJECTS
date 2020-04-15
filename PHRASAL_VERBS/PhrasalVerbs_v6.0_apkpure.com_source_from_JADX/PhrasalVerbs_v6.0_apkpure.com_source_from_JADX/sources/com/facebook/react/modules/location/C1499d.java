package com.facebook.react.modules.location;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.modules.location.d */
public class C1499d {

    /* renamed from: a */
    public static int f4622a = 1;

    /* renamed from: b */
    public static int f4623b = 2;

    /* renamed from: c */
    public static int f4624c = 3;

    /* renamed from: a */
    public static WritableMap m5974a(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", i);
        if (str != null) {
            createMap.putString("message", str);
        }
        createMap.putInt("PERMISSION_DENIED", f4622a);
        createMap.putInt("POSITION_UNAVAILABLE", f4623b);
        createMap.putInt("TIMEOUT", f4624c);
        return createMap;
    }
}
