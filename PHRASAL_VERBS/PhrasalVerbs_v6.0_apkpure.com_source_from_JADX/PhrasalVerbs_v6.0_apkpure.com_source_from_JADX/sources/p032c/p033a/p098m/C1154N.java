package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.m.N */
public class C1154N {
    /* renamed from: a */
    public static Iterable<ModuleHolder> m5138a(C1151K k, ReactApplicationContext reactApplicationContext, C1145G g) {
        StringBuilder sb = new StringBuilder();
        sb.append(k.getClass().getSimpleName());
        sb.append(" is not a LazyReactPackage, falling back to old version.");
        C0727a.m3266a("ReactNative", sb.toString());
        return new C1153M(k instanceof C1149I ? ((C1149I) k).mo4451a(reactApplicationContext, g) : k.mo4452b(reactApplicationContext));
    }
}
