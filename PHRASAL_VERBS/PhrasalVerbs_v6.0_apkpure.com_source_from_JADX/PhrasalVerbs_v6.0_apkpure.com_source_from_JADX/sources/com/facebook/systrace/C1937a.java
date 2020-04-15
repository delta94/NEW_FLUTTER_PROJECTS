package com.facebook.systrace;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: com.facebook.systrace.a */
public class C1937a {

    /* renamed from: com.facebook.systrace.a$a */
    public enum C1938a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        

        /* renamed from: e */
        private final char f5736e;

        private C1938a(char c) {
            this.f5736e = c;
        }
    }

    /* renamed from: a */
    public static void m7338a(long j) {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m7339a(long j, String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m7340a(long j, String str, int i) {
    }

    /* renamed from: a */
    public static void m7341a(long j, String str, int i, long j2) {
    }

    /* renamed from: a */
    public static void m7342a(long j, String str, C1938a aVar) {
    }

    /* renamed from: a */
    public static void m7343a(TraceListener traceListener) {
    }

    /* renamed from: b */
    public static void m7344b(long j, String str, int i) {
    }

    /* renamed from: b */
    public static void m7345b(long j, String str, int i, long j2) {
    }

    /* renamed from: b */
    public static void m7346b(TraceListener traceListener) {
    }

    /* renamed from: b */
    public static boolean m7347b(long j) {
        return false;
    }

    /* renamed from: c */
    public static void m7348c(long j, String str, int i) {
    }

    /* renamed from: d */
    public static void m7349d(long j, String str, int i) {
    }

    /* renamed from: e */
    public static void m7350e(long j, String str, int i) {
    }
}
