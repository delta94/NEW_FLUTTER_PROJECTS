package com.facebook.react.modules.systeminfo;

import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: com.facebook.react.modules.systeminfo.a */
public class C1554a {
    /* renamed from: a */
    public static String m6070a() {
        if (m6071b()) {
            return Build.MODEL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MODEL);
        sb.append(" - ");
        sb.append(VERSION.RELEASE);
        sb.append(" - API ");
        sb.append(VERSION.SDK_INT);
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m6071b() {
        return Build.FINGERPRINT.contains("vbox");
    }
}
