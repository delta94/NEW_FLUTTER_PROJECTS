package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: c.a.m.Q */
class C1159Q implements Iterator<ModuleHolder> {

    /* renamed from: a */
    final /* synthetic */ C1160S f3871a;

    C1159Q(C1160S s) {
        this.f3871a = s;
    }

    public boolean hasNext() {
        return this.f3871a.f3872a.hasNext();
    }

    public ModuleHolder next() {
        Entry entry = (Entry) this.f3871a.f3872a.next();
        String str = (String) entry.getKey();
        ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
        C1160S s = this.f3871a;
        return new ModuleHolder(reactModuleInfo, new C1162a(str, s.f3873b));
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
}
