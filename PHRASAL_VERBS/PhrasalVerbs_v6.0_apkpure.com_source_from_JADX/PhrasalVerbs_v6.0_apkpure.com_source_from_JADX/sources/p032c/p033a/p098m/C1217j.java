package p032c.p033a.p098m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.C1436a;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.a.m.j */
public abstract class C1217j implements C1151K {
    /* renamed from: a */
    public static C1436a m5212a(C1217j jVar) {
        String str = "Unable to instantiate ReactModuleInfoProvider for ";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(jVar.getClass().getCanonicalName());
            sb.append("$$ReactModuleInfoProvider");
            Class cls = Class.forName(sb.toString());
            if (cls != null) {
                try {
                    return (C1436a) cls.newInstance();
                } catch (InstantiationException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(jVar.getClass());
                    throw new RuntimeException(sb2.toString(), e);
                } catch (IllegalAccessException e2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(jVar.getClass());
                    throw new RuntimeException(sb3.toString(), e2);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("ReactModuleInfoProvider class for ");
                sb4.append(jVar.getClass().getCanonicalName());
                sb4.append(" not found.");
                throw new RuntimeException(sb4.toString());
            }
        } catch (ClassNotFoundException unused) {
            return new C1208g();
        }
    }

    /* renamed from: a */
    public abstract C1436a mo4543a();

    /* renamed from: a */
    public List<ViewManager> mo4465a(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> e = mo4556e(reactApplicationContext);
        if (e == null || e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec provider : e) {
            arrayList.add((ViewManager) provider.getProvider().get());
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final List<NativeModule> mo4452b(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : mo4544d(reactApplicationContext)) {
            C1941a a = C1940c.m7352a(0, "createNativeModule");
            a.mo6822a("module", (Object) moduleSpec.getType());
            a.mo6823a();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C1940c.m7351a(0).mo6823a();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C1940c.m7351a(0).mo6823a();
                throw th;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Iterable<ModuleHolder> mo4555c(ReactApplicationContext reactApplicationContext) {
        return new C1215i(this, mo4544d(reactApplicationContext), mo4543a().mo4518a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<ModuleSpec> mo4544d(ReactApplicationContext reactApplicationContext);

    /* renamed from: e */
    public List<ModuleSpec> mo4556e(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
