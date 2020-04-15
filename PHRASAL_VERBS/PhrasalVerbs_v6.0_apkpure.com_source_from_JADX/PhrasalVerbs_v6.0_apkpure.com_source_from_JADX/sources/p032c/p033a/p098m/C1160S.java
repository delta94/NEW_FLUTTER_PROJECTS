package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;

/* renamed from: c.a.m.S */
class C1160S implements Iterable<ModuleHolder> {

    /* renamed from: a */
    final /* synthetic */ Iterator f3872a;

    /* renamed from: b */
    final /* synthetic */ ReactApplicationContext f3873b;

    /* renamed from: c */
    final /* synthetic */ C1161T f3874c;

    C1160S(C1161T t, Iterator it, ReactApplicationContext reactApplicationContext) {
        this.f3874c = t;
        this.f3872a = it;
        this.f3873b = reactApplicationContext;
    }

    public Iterator<ModuleHolder> iterator() {
        return new C1159Q(this);
    }
}
