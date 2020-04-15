package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.a.m.i */
class C1215i implements Iterable<ModuleHolder> {

    /* renamed from: a */
    final /* synthetic */ List f3966a;

    /* renamed from: b */
    final /* synthetic */ Map f3967b;

    /* renamed from: c */
    final /* synthetic */ C1217j f3968c;

    C1215i(C1217j jVar, List list, Map map) {
        this.f3968c = jVar;
        this.f3966a = list;
        this.f3967b = map;
    }

    public Iterator<ModuleHolder> iterator() {
        return new C1213h(this);
    }
}
