package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.a.m.L */
class C1152L implements Iterator<ModuleHolder> {

    /* renamed from: a */
    int f3846a = 0;

    /* renamed from: b */
    final /* synthetic */ C1153M f3847b;

    C1152L(C1153M m) {
        this.f3847b = m;
    }

    public boolean hasNext() {
        return this.f3846a < this.f3847b.f3848a.size();
    }

    public ModuleHolder next() {
        List list = this.f3847b.f3848a;
        int i = this.f3846a;
        this.f3846a = i + 1;
        return new ModuleHolder((NativeModule) list.get(i));
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove methods ");
    }
}
