package p032c.p033a.p038c.p042d;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.a.c.d.l */
public final class C0720l {
    /* renamed from: a */
    public static <E> Set<E> m3249a(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    /* renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m3250a() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m3251b() {
        return m3249a(new IdentityHashMap());
    }
}
