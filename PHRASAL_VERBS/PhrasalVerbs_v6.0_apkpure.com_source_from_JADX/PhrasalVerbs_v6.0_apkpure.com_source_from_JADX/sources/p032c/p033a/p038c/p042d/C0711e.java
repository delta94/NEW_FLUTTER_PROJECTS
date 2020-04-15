package p032c.p033a.p038c.p042d;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: c.a.c.d.e */
public class C0711e<E> extends ArrayList<E> {
    private C0711e(int i) {
        super(i);
    }

    /* renamed from: a */
    public static <E> C0711e<E> m3224a(E... eArr) {
        C0711e<E> eVar = new C0711e<>(eArr.length);
        Collections.addAll(eVar, eArr);
        return eVar;
    }
}
