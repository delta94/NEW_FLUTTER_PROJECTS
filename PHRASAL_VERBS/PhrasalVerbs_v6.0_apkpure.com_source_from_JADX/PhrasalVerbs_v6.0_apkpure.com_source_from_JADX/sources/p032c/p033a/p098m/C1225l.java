package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p098m.p100b.C1170a;

/* renamed from: c.a.m.l */
public class C1225l {

    /* renamed from: a */
    private final ReactApplicationContext f3979a;

    /* renamed from: b */
    private final C1145G f3980b;

    /* renamed from: c */
    private final Map<String, ModuleHolder> f3981c = new HashMap();

    public C1225l(ReactApplicationContext reactApplicationContext, C1145G g) {
        this.f3979a = reactApplicationContext;
        this.f3980b = g;
    }

    /* renamed from: a */
    public NativeModuleRegistry mo4571a() {
        return new NativeModuleRegistry(this.f3979a, this.f3981c);
    }

    /* renamed from: a */
    public void mo4572a(C1151K k) {
        Iterable<ModuleHolder> iterable = k instanceof C1217j ? ((C1217j) k).mo4555c(this.f3979a) : k instanceof C1161T ? ((C1161T) k).mo4513c(this.f3979a) : C1154N.m5138a(k, this.f3979a, this.f3980b);
        for (ModuleHolder moduleHolder : iterable) {
            String name = moduleHolder.getName();
            if (this.f3981c.containsKey(name)) {
                ModuleHolder moduleHolder2 = (ModuleHolder) this.f3981c.get(name);
                if (moduleHolder.getCanOverrideExistingModule()) {
                    this.f3981c.remove(moduleHolder2);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Native module ");
                    sb.append(name);
                    sb.append(" tried to override ");
                    sb.append(moduleHolder2.getClassName());
                    sb.append(" for module name .Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true");
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (!C1170a.f3891d || !moduleHolder.isTurboModule()) {
                this.f3981c.put(name, moduleHolder);
            }
        }
    }
}
