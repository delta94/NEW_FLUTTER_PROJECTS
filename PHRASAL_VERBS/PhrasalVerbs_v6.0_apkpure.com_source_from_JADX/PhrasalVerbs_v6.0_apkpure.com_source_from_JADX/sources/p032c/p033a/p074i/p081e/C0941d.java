package p032c.p033a.p074i.p081e;

/* renamed from: c.a.i.e.d */
public enum C0941d {
    LOW,
    MEDIUM,
    HIGH;

    /* renamed from: a */
    public static C0941d m4141a(C0941d dVar, C0941d dVar2) {
        return dVar == null ? dVar2 : (dVar2 != null && dVar.ordinal() <= dVar2.ordinal()) ? dVar2 : dVar;
    }
}
