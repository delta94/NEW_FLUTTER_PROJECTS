package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.C1436a;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Provider;

/* renamed from: c.a.m.T */
public abstract class C1161T implements C1151K {

    /* renamed from: c.a.m.T$a */
    private class C1162a implements Provider<NativeModule> {

        /* renamed from: a */
        private final String f3875a;

        /* renamed from: b */
        private final ReactApplicationContext f3876b;

        public C1162a(String str, ReactApplicationContext reactApplicationContext) {
            this.f3875a = str;
            this.f3876b = reactApplicationContext;
        }

        public NativeModule get() {
            return C1161T.this.mo4511a(this.f3875a, this.f3876b);
        }
    }

    /* renamed from: a */
    public abstract NativeModule mo4511a(String str, ReactApplicationContext reactApplicationContext);

    /* renamed from: a */
    public List<ViewManager> mo4465a(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> d = mo4514d(reactApplicationContext);
        if (d == null || d.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec provider : d) {
            arrayList.add((ViewManager) provider.getProvider().get());
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<NativeModule> mo4452b(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    /* renamed from: c */
    public abstract C1436a mo4512c();

    /* renamed from: c */
    public Iterable<ModuleHolder> mo4513c(ReactApplicationContext reactApplicationContext) {
        return new C1160S(this, mo4512c().mo4518a().entrySet().iterator(), reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<ModuleSpec> mo4514d(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
