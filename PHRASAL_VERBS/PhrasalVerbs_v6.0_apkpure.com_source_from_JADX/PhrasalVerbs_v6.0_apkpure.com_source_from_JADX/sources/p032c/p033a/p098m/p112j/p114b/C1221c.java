package p032c.p033a.p098m.p112j.p114b;

import java.util.List;
import p032c.p033a.p074i.p082f.C0954j;
import p032c.p033a.p074i.p082f.C0964o;

/* renamed from: c.a.m.j.b.c */
public class C1221c {

    /* renamed from: c.a.m.j.b.c$a */
    public static class C1222a {

        /* renamed from: a */
        private final C1219a f3974a;

        /* renamed from: b */
        private final C1219a f3975b;

        private C1222a(C1219a aVar, C1219a aVar2) {
            this.f3974a = aVar;
            this.f3975b = aVar2;
        }

        /* renamed from: a */
        public C1219a mo4561a() {
            return this.f3974a;
        }

        /* renamed from: b */
        public C1219a mo4562b() {
            return this.f3975b;
        }
    }

    /* renamed from: a */
    public static C1222a m5226a(int i, int i2, List<C1219a> list) {
        return m5227a(i, i2, list, 1.0d);
    }

    /* renamed from: a */
    public static C1222a m5227a(int i, int i2, List<C1219a> list, double d) {
        if (list.isEmpty()) {
            return new C1222a(null, null);
        }
        if (list.size() == 1) {
            return new C1222a((C1219a) list.get(0), null);
        }
        if (i <= 0 || i2 <= 0) {
            return new C1222a(null, null);
        }
        C0954j e = C0964o.m4272f().mo4133e();
        double d2 = (double) (i * i2);
        Double.isNaN(d2);
        double d3 = d2 * d;
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        C1219a aVar = null;
        C1219a aVar2 = null;
        for (C1219a aVar3 : list) {
            double abs = Math.abs(1.0d - (aVar3.mo4557a() / d3));
            if (abs < d4) {
                aVar2 = aVar3;
                d4 = abs;
            }
            if (abs < d5 && (e.mo4077a(aVar3.mo4559c()) || e.mo4082b(aVar3.mo4559c()))) {
                aVar = aVar3;
                d5 = abs;
            }
        }
        if (!(aVar == null || aVar2 == null || !aVar.mo4558b().equals(aVar2.mo4558b()))) {
            aVar = null;
        }
        return new C1222a(aVar2, aVar);
    }
}
