package p032c.p033a.p074i.p084h;

import java.util.Collections;
import java.util.List;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p074i.p086j.C0990f;
import p032c.p033a.p074i.p086j.C0991g;

/* renamed from: c.a.i.h.i */
public class C0981i implements C0978f {

    /* renamed from: a */
    private final C0983b f3440a;

    /* renamed from: c.a.i.h.i$a */
    private static class C0982a implements C0983b {
        private C0982a() {
        }

        /* renamed from: a */
        public List<Integer> mo4190a() {
            return Collections.EMPTY_LIST;
        }

        /* renamed from: b */
        public int mo4191b() {
            return 0;
        }
    }

    /* renamed from: c.a.i.h.i$b */
    public interface C0983b {
        /* renamed from: a */
        List<Integer> mo4190a();

        /* renamed from: b */
        int mo4191b();
    }

    public C0981i() {
        this(new C0982a());
    }

    public C0981i(C0983b bVar) {
        C0718j.m3240a(bVar);
        this.f3440a = bVar;
    }

    /* renamed from: a */
    public C0991g mo4184a(int i) {
        return C0990f.m4435a(i, i >= this.f3440a.mo4191b(), false);
    }

    /* renamed from: b */
    public int mo4185b(int i) {
        List a = this.f3440a.mo4190a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (((Integer) a.get(i2)).intValue() > i) {
                return ((Integer) a.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}
