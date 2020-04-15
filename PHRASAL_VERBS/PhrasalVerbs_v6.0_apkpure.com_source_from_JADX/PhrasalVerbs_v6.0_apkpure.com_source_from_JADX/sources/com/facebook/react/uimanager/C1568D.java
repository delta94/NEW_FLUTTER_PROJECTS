package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.D */
public class C1568D {

    /* renamed from: a */
    private static int f4753a = 1;

    /* renamed from: a */
    public static synchronized int m6080a() {
        int i;
        synchronized (C1568D.class) {
            i = f4753a;
            f4753a += 10;
        }
        return i;
    }
}
