package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.modules.storage.b */
public class C1545b {
    /* renamed from: a */
    static WritableMap m6053a(String str) {
        return m6054a(str, "Database Error");
    }

    /* renamed from: a */
    static WritableMap m6054a(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }

    /* renamed from: b */
    static WritableMap m6055b(String str) {
        return m6054a(str, "Invalid key");
    }

    /* renamed from: c */
    static WritableMap m6056c(String str) {
        return m6054a(str, "Invalid Value");
    }
}
