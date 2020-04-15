package p032c.p033a.p098m;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.CatalystInstanceImpl.Builder;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C1406a;
import com.facebook.react.devsupport.C1413e;
import com.facebook.react.devsupport.C1414f;
import com.facebook.react.devsupport.p118a.C1407a;
import com.facebook.react.devsupport.p118a.C1408b;
import com.facebook.react.devsupport.p118a.C1409c;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.C1460c;
import com.facebook.react.modules.core.C1466i;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.debug.p120a.C1477a;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.uimanager.C1589V;
import com.facebook.react.uimanager.C1590W;
import com.facebook.react.uimanager.C1654h;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.p005b.p009c.p018g.C0156v;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p052e.p055b.C0783c;
import p032c.p033a.p052e.p056c.C0784a;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: c.a.m.G */
public class C1145G {

    /* renamed from: a */
    private final Set<C1156P> f3798a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    private volatile LifecycleState f3799b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1146a f3800c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile Thread f3801d;

    /* renamed from: e */
    private final JavaScriptExecutorFactory f3802e;

    /* renamed from: f */
    private final JSBundleLoader f3803f;

    /* renamed from: g */
    private final String f3804g;

    /* renamed from: h */
    private final List<C1151K> f3805h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1408b f3806i;

    /* renamed from: j */
    private final boolean f3807j;

    /* renamed from: k */
    private final NotThreadSafeBridgeIdleDebugListener f3808k;

    /* renamed from: l */
    private final Object f3809l = new Object();

    /* renamed from: m */
    private volatile ReactContext f3810m;

    /* renamed from: n */
    private final Context f3811n;

    /* renamed from: o */
    private C1460c f3812o;

    /* renamed from: p */
    private Activity f3813p;

    /* renamed from: q */
    private final Collection<C1147b> f3814q = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: r */
    public volatile boolean f3815r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile Boolean f3816s = Boolean.valueOf(false);

    /* renamed from: t */
    private final C1224k f3817t;

    /* renamed from: u */
    private final NativeModuleCallExceptionHandler f3818u;

    /* renamed from: v */
    private final JSIModulePackage f3819v;

    /* renamed from: w */
    private List<ViewManager> f3820w;

    /* renamed from: c.a.m.G$a */
    private class C1146a {

        /* renamed from: a */
        private final JavaScriptExecutorFactory f3821a;

        /* renamed from: b */
        private final JSBundleLoader f3822b;

        public C1146a(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            C1136a.m5053a(javaScriptExecutorFactory);
            this.f3821a = javaScriptExecutorFactory;
            C1136a.m5053a(jSBundleLoader);
            this.f3822b = jSBundleLoader;
        }

        /* renamed from: a */
        public JSBundleLoader mo4435a() {
            return this.f3822b;
        }

        /* renamed from: b */
        public JavaScriptExecutorFactory mo4436b() {
            return this.f3821a;
        }
    }

    /* renamed from: c.a.m.G$b */
    public interface C1147b {
        /* renamed from: a */
        void mo4437a(ReactContext reactContext);
    }

    C1145G(Context context, Activity activity, C1460c cVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<C1151K> list, boolean z, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, C1589V v, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, C1414f fVar, boolean z2, C1407a aVar, int i, int i2, JSIModulePackage jSIModulePackage, Map<String, Object> map) {
        Context context2 = context;
        Log.d("ReactNative", "ReactInstanceManager.ctor()");
        m5063a(context);
        C1654h.m6474b(context);
        this.f3811n = context2;
        this.f3813p = activity;
        this.f3812o = cVar;
        this.f3802e = javaScriptExecutorFactory;
        this.f3803f = jSBundleLoader;
        this.f3804g = str;
        this.f3805h = new ArrayList();
        boolean z3 = z;
        this.f3807j = z3;
        C1937a.m7339a(0, "ReactInstanceManager.initDevSupportManager");
        this.f3806i = C1406a.m5758a(context, m5080k(), this.f3804g, z3, fVar, aVar, i, map);
        C1937a.m7338a(0);
        this.f3808k = notThreadSafeBridgeIdleDebugListener;
        this.f3799b = lifecycleState;
        this.f3817t = new C1224k(context);
        this.f3818u = nativeModuleCallExceptionHandler;
        synchronized (this.f3805h) {
            C0783c.m3478a().mo3575a(C0784a.f2699c, "RNCore: Use Split Packages");
            List<C1151K> list2 = this.f3805h;
            C1171c cVar2 = new C1171c(this, new C1235v(this), v, z2, i2);
            list2.add(cVar2);
            if (this.f3807j) {
                this.f3805h.add(new C1179f());
            }
            this.f3805h.addAll(list);
        }
        this.f3819v = jSIModulePackage;
        C1466i.m5879b();
        if (this.f3807j) {
            this.f3806i.mo5222g();
        }
    }

    /* renamed from: a */
    public static C1148H m5058a() {
        return new C1148H();
    }

    /* renamed from: a */
    private NativeModuleRegistry m5059a(ReactApplicationContext reactApplicationContext, List<C1151K> list, boolean z) {
        C1225l lVar = new C1225l(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f3805h) {
            for (C1151K k : list) {
                if (!z || !this.f3805h.contains(k)) {
                    C1937a.m7339a(0, "createAndProcessCustomReactPackage");
                    if (z) {
                        try {
                            this.f3805h.add(k);
                        } catch (Throwable th) {
                            C1937a.m7338a(0);
                            throw th;
                        }
                    }
                    m5067a(k, lVar);
                    C1937a.m7338a(0);
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        C1937a.m7339a(0, "buildNativeModuleRegistry");
        try {
            return lVar.mo4571a();
        } finally {
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public ReactApplicationContext m5061a(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.f3811n);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.f3818u;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.f3806i;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        Builder nativeModuleCallExceptionHandler2 = new Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(m5059a(reactApplicationContext, this.f3805h, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        C1937a.m7339a(0, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            JSIModulePackage jSIModulePackage = this.f3819v;
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f3808k;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (C1937a.m7347b(0)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            C1937a.m7339a(0, "runJSBundle");
            build.runJSBundle();
            C1937a.m7338a(0);
            reactApplicationContext.initializeWithInstance(build);
            return reactApplicationContext;
        } catch (Throwable th) {
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m5063a(Context context) {
        SoLoader.m7250a(context, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5064a(C1146a aVar) {
        Log.d("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f3798a) {
            synchronized (this.f3809l) {
                if (this.f3810m != null) {
                    m5071a(this.f3810m);
                    this.f3810m = null;
                }
            }
        }
        this.f3801d = new Thread(null, new C1140B(this, aVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f3801d.start();
    }

    /* renamed from: a */
    private void m5067a(C1151K k, C1225l lVar) {
        C1941a a = C1940c.m7352a(0, "processPackage");
        a.mo6822a("className", (Object) k.getClass().getSimpleName());
        a.mo6823a();
        boolean z = k instanceof C1155O;
        if (z) {
            ((C1155O) k).mo4470a();
        }
        lVar.mo4572a(k);
        if (z) {
            ((C1155O) k).mo4471b();
        }
        C1940c.m7351a(0).mo6823a();
    }

    /* renamed from: a */
    private void m5068a(C1156P p, CatalystInstance catalystInstance) {
        Log.d("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (p.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(p.getId());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(p.getId());
        }
    }

    /* renamed from: a */
    private void m5069a(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        C1146a aVar = new C1146a(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f3801d == null) {
            m5064a(aVar);
        } else {
            this.f3800c = aVar;
        }
    }

    /* renamed from: a */
    private void m5070a(NativeDeltaClient nativeDeltaClient) {
        Log.d("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        m5069a(this.f3802e, nativeDeltaClient == null ? JSBundleLoader.createCachedBundleFromNetworkLoader(this.f3806i.mo5220e(), this.f3806i.mo5210a()) : JSBundleLoader.createDeltaFromNetworkLoader(this.f3806i.mo5220e(), nativeDeltaClient));
    }

    /* renamed from: a */
    private void m5071a(ReactContext reactContext) {
        Log.d("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f3799b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f3798a) {
            for (C1156P p : this.f3798a) {
                p.removeAllViews();
                p.setId(-1);
            }
        }
        reactContext.destroy();
        this.f3806i.mo5215b(reactContext);
        this.f3817t.mo4567b(reactContext.getCatalystInstance());
    }

    /* renamed from: a */
    private synchronized void m5072a(boolean z) {
        ReactContext c = mo4426c();
        if (c != null && (z || this.f3799b == LifecycleState.BEFORE_RESUME || this.f3799b == LifecycleState.BEFORE_CREATE)) {
            c.onHostResume(this.f3813p);
        }
        this.f3799b = LifecycleState.RESUMED;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5076b(ReactApplicationContext reactApplicationContext) {
        Log.d("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        C1937a.m7339a(0, "setupReactContext");
        synchronized (this.f3798a) {
            synchronized (this.f3809l) {
                C1136a.m5053a(reactApplicationContext);
                this.f3810m = reactApplicationContext;
            }
            CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
            C1136a.m5053a(catalystInstance);
            CatalystInstance catalystInstance2 = catalystInstance;
            catalystInstance2.initialize();
            this.f3806i.mo5211a((ReactContext) reactApplicationContext);
            this.f3817t.mo4566a((MemoryPressureListener) catalystInstance2);
            m5082m();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (C1156P c : this.f3798a) {
                m5078c(c);
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        UiThreadUtil.runOnUiThread(new C1141C(this, (C1147b[]) this.f3814q.toArray(new C1147b[this.f3814q.size()]), reactApplicationContext));
        C1937a.m7338a(0);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new C1142D(this));
        reactApplicationContext.runOnNativeModulesQueueThread(new C1143E(this));
    }

    /* renamed from: c */
    private void m5078c(C1156P p) {
        Log.d("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        C1937a.m7339a(0, "attachRootViewToInstance");
        UIManager a = C1590W.m6338a(this.f3810m, p.getUIManagerType());
        Bundle appProperties = p.getAppProperties();
        int addRootView = a.addRootView(p, appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), p.getInitialUITemplate());
        p.setRootViewTag(addRootView);
        p.mo4478b();
        C1937a.m7340a(0, "pre_rootView.onAttachedToReactInstance", addRootView);
        UiThreadUtil.runOnUiThread(new C1144F(this, addRootView, p));
        C1937a.m7338a(0);
    }

    /* renamed from: k */
    private C1413e m5080k() {
        return new C1236w(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m5081l() {
        UiThreadUtil.assertOnUiThread();
        C1460c cVar = this.f3812o;
        if (cVar != null) {
            cVar.mo4574b();
        }
    }

    /* renamed from: m */
    private synchronized void m5082m() {
        if (this.f3799b == LifecycleState.RESUMED) {
            m5072a(true);
        }
    }

    /* renamed from: n */
    private synchronized void m5083n() {
        ReactContext c = mo4426c();
        if (c != null) {
            if (this.f3799b == LifecycleState.RESUMED) {
                c.onHostPause();
                this.f3799b = LifecycleState.BEFORE_RESUME;
            }
            if (this.f3799b == LifecycleState.BEFORE_RESUME) {
                c.onHostDestroy();
            }
        }
        this.f3799b = LifecycleState.BEFORE_CREATE;
    }

    /* renamed from: o */
    private synchronized void m5084o() {
        ReactContext c = mo4426c();
        if (c != null) {
            if (this.f3799b == LifecycleState.BEFORE_CREATE) {
                c.onHostResume(this.f3813p);
            } else if (this.f3799b == LifecycleState.RESUMED) {
            }
            c.onHostPause();
        }
        this.f3799b = LifecycleState.BEFORE_RESUME;
    }

    /* renamed from: p */
    private void m5085p() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        C0783c.m3478a().mo3575a(C0784a.f2699c, "RNCore: load from BundleLoader");
        m5069a(this.f3802e, this.f3803f);
    }

    /* renamed from: q */
    private void m5086q() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        C0783c.m3478a().mo3575a(C0784a.f2699c, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f3807j && this.f3804g != null) {
            C1477a f = this.f3806i.mo5221f();
            if (this.f3806i.mo5223h() && !f.mo5362b()) {
                m5070a((NativeDeltaClient) null);
                return;
            } else if (!C1937a.m7347b(0)) {
                if (this.f3803f == null) {
                    this.f3806i.mo5219d();
                } else {
                    this.f3806i.mo5212a((C1409c) new C1237x(this, f));
                }
                return;
            }
        }
        m5085p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r6.f3805h.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r4 = (p032c.p033a.p098m.C1151K) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r4 instanceof p032c.p033a.p098m.C1163U) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4 = ((p032c.p033a.p098m.C1163U) r4).mo4516a(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r6.f3805h;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.uimanager.ViewManager mo4416a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f3809l
            monitor-enter(r0)
            com.facebook.react.bridge.ReactContext r1 = r6.mo4426c()     // Catch:{ all -> 0x003e }
            com.facebook.react.bridge.ReactApplicationContext r1 = (com.facebook.react.bridge.ReactApplicationContext) r1     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r1 == 0) goto L_0x003c
            boolean r3 = r1.hasActiveCatalystInstance()     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x0013
            goto L_0x003c
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            java.util.List<c.a.m.K> r3 = r6.f3805h
            monitor-enter(r3)
            java.util.List<c.a.m.K> r0 = r6.f3805h     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x001d:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0037
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0039 }
            c.a.m.K r4 = (p032c.p033a.p098m.C1151K) r4     // Catch:{ all -> 0x0039 }
            boolean r5 = r4 instanceof p032c.p033a.p098m.C1163U     // Catch:{ all -> 0x0039 }
            if (r5 == 0) goto L_0x001d
            c.a.m.U r4 = (p032c.p033a.p098m.C1163U) r4     // Catch:{ all -> 0x0039 }
            com.facebook.react.uimanager.ViewManager r4 = r4.mo4516a(r1, r7)     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x0037:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r2
        L_0x0039:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r7
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r2
        L_0x003e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p098m.C1145G.mo4416a(java.lang.String):com.facebook.react.uimanager.ViewManager");
    }

    /* renamed from: a */
    public List<ViewManager> mo4417a(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        C1937a.m7339a(0, "createAllViewManagers");
        try {
            if (this.f3820w == null) {
                synchronized (this.f3805h) {
                    if (this.f3820w == null) {
                        this.f3820w = new ArrayList();
                        for (C1151K a : this.f3805h) {
                            this.f3820w.addAll(a.mo4465a(reactApplicationContext));
                        }
                        list = this.f3820w;
                    }
                }
                C1937a.m7338a(0);
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                return list;
            }
            list = this.f3820w;
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th) {
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo4418a(Activity activity) {
        if (activity == this.f3813p) {
            mo4432h();
        }
    }

    /* renamed from: a */
    public void mo4419a(Activity activity, int i, int i2, Intent intent) {
        ReactContext c = mo4426c();
        if (c != null) {
            c.onActivityResult(activity, i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo4420a(Activity activity, C1460c cVar) {
        UiThreadUtil.assertOnUiThread();
        this.f3812o = cVar;
        mo4427c(activity);
    }

    /* renamed from: a */
    public void mo4421a(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext c = mo4426c();
        if (c == null) {
            C0727a.m3284d("ReactNative", "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            ((DeviceEventManagerModule) c.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        c.onNewIntent(this.f3813p, intent);
    }

    /* renamed from: a */
    public void mo4422a(C1156P p) {
        UiThreadUtil.assertOnUiThread();
        this.f3798a.add(p);
        p.removeAllViews();
        p.setId(-1);
        ReactContext c = mo4426c();
        if (this.f3801d == null && c != null) {
            m5078c(p);
        }
    }

    /* renamed from: b */
    public void mo4423b() {
        Log.d("ReactNative", "ReactInstanceManager.createReactContextInBackground()");
        C1136a.m5056a(!this.f3815r, "createReactContextInBackground should only be called when creating the react application for the first time. When reloading JS, e.g. from a new file, explicitlyuse recreateReactContextInBackground");
        this.f3815r = true;
        m5086q();
    }

    /* renamed from: b */
    public void mo4424b(Activity activity) {
        C1136a.m5053a(this.f3813p);
        boolean z = activity == this.f3813p;
        StringBuilder sb = new StringBuilder();
        sb.append("Pausing an activity that is not the current activity, this is incorrect! Current activity: ");
        sb.append(this.f3813p.getClass().getSimpleName());
        sb.append(" Paused activity: ");
        sb.append(activity.getClass().getSimpleName());
        C1136a.m5056a(z, sb.toString());
        mo4433i();
    }

    /* renamed from: b */
    public void mo4425b(C1156P p) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f3798a) {
            if (this.f3798a.contains(p)) {
                ReactContext c = mo4426c();
                this.f3798a.remove(p);
                if (c != null && c.hasActiveCatalystInstance()) {
                    m5068a(p, c.getCatalystInstance());
                }
            }
        }
    }

    /* renamed from: c */
    public ReactContext mo4426c() {
        ReactContext reactContext;
        synchronized (this.f3809l) {
            reactContext = this.f3810m;
        }
        return reactContext;
    }

    /* renamed from: c */
    public void mo4427c(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f3813p = activity;
        if (this.f3807j) {
            View decorView = this.f3813p.getWindow().getDecorView();
            if (!C0156v.m576q(decorView)) {
                decorView.addOnAttachStateChangeListener(new C1238y(this, decorView));
            } else {
                this.f3806i.mo5214a(true);
            }
        }
        m5072a(false);
    }

    /* renamed from: d */
    public C1408b mo4428d() {
        return this.f3806i;
    }

    /* JADX INFO: used method not loaded: com.facebook.systrace.c.a.a(java.lang.String, java.lang.Object):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.facebook.systrace.a.a(long):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2 = new java.util.HashSet();
        r5 = r10.f3805h.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5.hasNext() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r6 = (p032c.p033a.p098m.C1151K) r5.next();
        r7 = com.facebook.systrace.C1940c.m7352a(0, "ReactInstanceManager.getViewManagerName");
        r7.mo6822a("Package", (java.lang.Object) r6.getClass().getSimpleName());
        r7.mo6823a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if ((r6 instanceof p032c.p033a.p098m.C1163U) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r6 = ((p032c.p033a.p098m.C1163U) r6).mo4517a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r6 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r2.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        com.facebook.systrace.C1940c.m7351a(0).mo6823a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        com.facebook.systrace.C1937a.m7338a(0);
        r0 = new java.util.ArrayList(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r4 = r10.f3805h;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo4429e() {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r2 = "ReactInstanceManager.getViewManagerNames"
            com.facebook.systrace.C1937a.m7339a(r0, r2)
            java.lang.Object r2 = r10.f3809l
            monitor-enter(r2)
            com.facebook.react.bridge.ReactContext r3 = r10.mo4426c()     // Catch:{ all -> 0x0071 }
            com.facebook.react.bridge.ReactApplicationContext r3 = (com.facebook.react.bridge.ReactApplicationContext) r3     // Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x006e
            boolean r4 = r3.hasActiveCatalystInstance()     // Catch:{ all -> 0x0071 }
            if (r4 != 0) goto L_0x0019
            goto L_0x006e
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            java.util.List<c.a.m.K> r4 = r10.f3805h
            monitor-enter(r4)
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x006b }
            r2.<init>()     // Catch:{ all -> 0x006b }
            java.util.List<c.a.m.K> r5 = r10.f3805h     // Catch:{ all -> 0x006b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006b }
        L_0x0028:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0061
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x006b }
            c.a.m.K r6 = (p032c.p033a.p098m.C1151K) r6     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "ReactInstanceManager.getViewManagerName"
            com.facebook.systrace.c$a r7 = com.facebook.systrace.C1940c.m7352a(r0, r7)     // Catch:{ all -> 0x006b }
            java.lang.String r8 = "Package"
            java.lang.Class r9 = r6.getClass()     // Catch:{ all -> 0x006b }
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ all -> 0x006b }
            r7.mo6822a(r8, r9)     // Catch:{ all -> 0x006b }
            r7.mo6823a()     // Catch:{ all -> 0x006b }
            boolean r7 = r6 instanceof p032c.p033a.p098m.C1163U     // Catch:{ all -> 0x006b }
            if (r7 == 0) goto L_0x0059
            c.a.m.U r6 = (p032c.p033a.p098m.C1163U) r6     // Catch:{ all -> 0x006b }
            java.util.List r6 = r6.mo4517a(r3)     // Catch:{ all -> 0x006b }
            if (r6 == 0) goto L_0x0059
            r2.addAll(r6)     // Catch:{ all -> 0x006b }
        L_0x0059:
            com.facebook.systrace.c$a r6 = com.facebook.systrace.C1940c.m7351a(r0)     // Catch:{ all -> 0x006b }
            r6.mo6823a()     // Catch:{ all -> 0x006b }
            goto L_0x0028
        L_0x0061:
            com.facebook.systrace.C1937a.m7338a(r0)     // Catch:{ all -> 0x006b }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x006b }
            r0.<init>(r2)     // Catch:{ all -> 0x006b }
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return r0
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            return r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p098m.C1145G.mo4429e():java.util.List");
    }

    /* renamed from: f */
    public boolean mo4430f() {
        return this.f3815r;
    }

    /* renamed from: g */
    public void mo4431g() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f3810m;
        if (reactContext == null) {
            C0727a.m3284d("ReactNative", "Instance detached from instance manager");
            m5081l();
            return;
        }
        ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
    }

    /* renamed from: h */
    public void mo4432h() {
        UiThreadUtil.assertOnUiThread();
        if (this.f3807j) {
            this.f3806i.mo5214a(false);
        }
        m5083n();
        this.f3813p = null;
    }

    /* renamed from: i */
    public void mo4433i() {
        UiThreadUtil.assertOnUiThread();
        this.f3812o = null;
        if (this.f3807j) {
            this.f3806i.mo5214a(false);
        }
        m5084o();
    }

    /* renamed from: j */
    public void mo4434j() {
        UiThreadUtil.assertOnUiThread();
        this.f3806i.mo5224i();
    }
}
