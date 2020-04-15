package p032c.p115b.p116a;

import java.util.Comparator;

/* renamed from: c.b.a.e */
class C1244e implements Comparator<C1242c> {
    C1244e() {
    }

    /* renamed from: a */
    public int compare(C1242c cVar, C1242c cVar2) {
        if ((cVar.f4037x && cVar2.f4037x) || (cVar.f4038y && cVar2.f4038y)) {
            return Integer.signum(cVar2.f4036w - cVar.f4036w);
        }
        if (cVar.f4037x) {
            return -1;
        }
        if (cVar2.f4037x) {
            return 1;
        }
        if (cVar.f4038y) {
            return -1;
        }
        return cVar2.f4038y ? 1 : 0;
    }
}
