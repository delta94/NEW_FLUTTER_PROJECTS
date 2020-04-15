package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
@C1911d
class Api18TraceUtils {
    Api18TraceUtils() {
    }

    /* renamed from: a */
    public static void m7245a() {
        Trace.endSection();
    }

    /* renamed from: a */
    public static void m7246a(String str) {
        Trace.beginSection(str);
    }
}
