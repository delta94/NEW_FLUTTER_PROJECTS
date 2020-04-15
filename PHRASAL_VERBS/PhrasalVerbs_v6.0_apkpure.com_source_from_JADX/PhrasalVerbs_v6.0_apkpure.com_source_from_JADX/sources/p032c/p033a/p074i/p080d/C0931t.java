package p032c.p033a.p074i.p080d;

import p032c.p033a.p038c.p042d.C0721m;

/* renamed from: c.a.i.d.t */
public class C0931t implements C0721m<C0903B> {
    /* renamed from: a */
    private int m4100a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    public C0903B get() {
        int a = m4100a();
        C0903B b = new C0903B(a, Integer.MAX_VALUE, a, Integer.MAX_VALUE, a / 8);
        return b;
    }
}
