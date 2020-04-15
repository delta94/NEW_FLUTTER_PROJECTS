package p032c.p033a.p098m;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.C1436a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.C1460c;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.C1589V;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModule.C1588c;
import com.facebook.systrace.C1937a;
import java.util.HashMap;
import p032c.p033a.p098m.p102d.p103a.C1176a;

/* renamed from: c.a.m.c */
class C1171c extends C1161T implements C1155O {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1145G f3892a;

    /* renamed from: b */
    private final C1460c f3893b;

    /* renamed from: c */
    private final boolean f3894c;

    /* renamed from: d */
    private final int f3895d;

    C1171c(C1145G g, C1460c cVar, C1589V v, boolean z, int i) {
        this.f3892a = g;
        this.f3893b = cVar;
        this.f3894c = z;
        this.f3895d = i;
    }

    /* renamed from: e */
    private UIManagerModule m5185e(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C1937a.m7339a(0, "createUIManagerModule");
        try {
            if (this.f3894c) {
                UIManagerModule uIManagerModule = new UIManagerModule(reactApplicationContext, (C1588c) new C1169b(this), this.f3895d);
                return uIManagerModule;
            }
            UIManagerModule uIManagerModule2 = new UIManagerModule(reactApplicationContext, this.f3892a.mo4417a(reactApplicationContext), this.f3895d);
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
            return uIManagerModule2;
        } finally {
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.NativeModule mo4511a(java.lang.String r3, com.facebook.react.bridge.ReactApplicationContext r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1789797270: goto L_0x004e;
                case -1520650172: goto L_0x0044;
                case -1037217463: goto L_0x003a;
                case -790603268: goto L_0x0030;
                case 512434409: goto L_0x0026;
                case 881516744: goto L_0x001c;
                case 1256514152: goto L_0x0012;
                case 1861242489: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0058
        L_0x0008:
            java.lang.String r0 = "UIManager"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 6
            goto L_0x0059
        L_0x0012:
            java.lang.String r0 = "HeadlessJsTaskSupport"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 3
            goto L_0x0059
        L_0x001c:
            java.lang.String r0 = "SourceCode"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 4
            goto L_0x0059
        L_0x0026:
            java.lang.String r0 = "ExceptionsManager"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 2
            goto L_0x0059
        L_0x0030:
            java.lang.String r0 = "PlatformConstants"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 0
            goto L_0x0059
        L_0x003a:
            java.lang.String r0 = "DeviceEventManager"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0044:
            java.lang.String r0 = "DeviceInfo"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 7
            goto L_0x0059
        L_0x004e:
            java.lang.String r0 = "Timing"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 5
            goto L_0x0059
        L_0x0058:
            r0 = -1
        L_0x0059:
            switch(r0) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a2;
                case 2: goto L_0x0096;
                case 3: goto L_0x0090;
                case 4: goto L_0x008a;
                case 5: goto L_0x007e;
                case 6: goto L_0x0079;
                case 7: goto L_0x0073;
                default: goto L_0x005c;
            }
        L_0x005c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "In CoreModulesPackage, could not find Native module for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L_0x0073:
            com.facebook.react.modules.deviceinfo.DeviceInfoModule r3 = new com.facebook.react.modules.deviceinfo.DeviceInfoModule
            r3.<init>(r4)
            return r3
        L_0x0079:
            com.facebook.react.uimanager.UIManagerModule r3 = r2.m5185e(r4)
            return r3
        L_0x007e:
            com.facebook.react.modules.core.Timing r3 = new com.facebook.react.modules.core.Timing
            c.a.m.G r0 = r2.f3892a
            com.facebook.react.devsupport.a.b r0 = r0.mo4428d()
            r3.<init>(r4, r0)
            return r3
        L_0x008a:
            com.facebook.react.modules.debug.SourceCodeModule r3 = new com.facebook.react.modules.debug.SourceCodeModule
            r3.<init>(r4)
            return r3
        L_0x0090:
            com.facebook.react.modules.core.HeadlessJsTaskSupportModule r3 = new com.facebook.react.modules.core.HeadlessJsTaskSupportModule
            r3.<init>(r4)
            return r3
        L_0x0096:
            com.facebook.react.modules.core.ExceptionsManagerModule r3 = new com.facebook.react.modules.core.ExceptionsManagerModule
            c.a.m.G r4 = r2.f3892a
            com.facebook.react.devsupport.a.b r4 = r4.mo4428d()
            r3.<init>(r4)
            return r3
        L_0x00a2:
            com.facebook.react.modules.core.DeviceEventManagerModule r3 = new com.facebook.react.modules.core.DeviceEventManagerModule
            com.facebook.react.modules.core.c r0 = r2.f3893b
            r3.<init>(r4, r0)
            return r3
        L_0x00aa:
            com.facebook.react.modules.systeminfo.AndroidInfoModule r3 = new com.facebook.react.modules.systeminfo.AndroidInfoModule
            r3.<init>(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p098m.C1171c.mo4511a(java.lang.String, com.facebook.react.bridge.ReactApplicationContext):com.facebook.react.bridge.NativeModule");
    }

    /* renamed from: a */
    public void mo4470a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    /* renamed from: b */
    public void mo4471b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    /* renamed from: c */
    public C1436a mo4512c() {
        String str = "No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider";
        try {
            return (C1436a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, ExceptionsManagerModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, Timing.class, UIManagerModule.class};
            HashMap hashMap = new HashMap();
            for (Class cls : clsArr) {
                C1176a aVar = (C1176a) cls.getAnnotation(C1176a.class);
                String name = aVar.name();
                ReactModuleInfo reactModuleInfo = new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), false);
                hashMap.put(name, reactModuleInfo);
            }
            return new C1164a(this, hashMap);
        } catch (InstantiationException e) {
            throw new RuntimeException(str, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(str, e2);
        }
    }
}
