package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.d */
public class C1272d {

    /* renamed from: a */
    private static final Class<?> f4162a = C1272d.class;

    /* renamed from: b */
    public static final int f4163b = m5488b();

    /* renamed from: c */
    private static int f4164c = 384;

    /* renamed from: d */
    private static volatile C1271c f4165d;

    /* renamed from: a */
    public static C1271c m5487a() {
        if (f4165d == null) {
            synchronized (C1272d.class) {
                if (f4165d == null) {
                    f4165d = new C1271c(f4164c, f4163b);
                }
            }
        }
        return f4165d;
    }

    /* renamed from: b */
    private static int m5488b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
