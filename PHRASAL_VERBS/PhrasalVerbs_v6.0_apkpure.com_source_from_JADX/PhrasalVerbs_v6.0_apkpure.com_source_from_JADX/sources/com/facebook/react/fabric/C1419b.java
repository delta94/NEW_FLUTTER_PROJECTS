package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.jsi.Binding;
import com.facebook.react.fabric.jsi.C1423b;
import com.facebook.react.fabric.jsi.EventBeatManager;
import com.facebook.react.fabric.jsi.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.C1424a;
import com.facebook.react.fabric.mounting.mountitems.C1425b;
import com.facebook.react.fabric.mounting.mountitems.C1426c;
import com.facebook.react.fabric.mounting.mountitems.C1427d;
import com.facebook.react.fabric.mounting.mountitems.C1428e;
import com.facebook.react.fabric.mounting.mountitems.C1429f;
import com.facebook.react.fabric.mounting.mountitems.C1430g;
import com.facebook.react.fabric.mounting.mountitems.C1431h;
import com.facebook.react.fabric.mounting.mountitems.C1432i;
import com.facebook.react.fabric.mounting.mountitems.C1433j;
import com.facebook.react.fabric.mounting.mountitems.C1434k;
import com.facebook.react.fabric.p119a.C1417a;
import com.facebook.react.fabric.p119a.C1418b;
import com.facebook.react.modules.core.C1458b.C1459a;
import com.facebook.react.modules.core.C1466i;
import com.facebook.react.modules.core.C1466i.C1467a;
import com.facebook.react.uimanager.C1568D;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1693na;
import com.facebook.react.uimanager.common.C1624a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.events.C1633a;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.systrace.C1937a;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p096l.p097a.C1137a;

@SuppressLint({"MissingNativeLoadLibrary"})
/* renamed from: com.facebook.react.fabric.b */
public class C1419b implements UIManager, LifecycleEventListener {

    /* renamed from: a */
    private static final Map<String, String> f4408a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Binding f4409b;

    /* renamed from: c */
    private final ReactApplicationContext f4410c;

    /* renamed from: d */
    private final C1418b f4411d;

    /* renamed from: e */
    private final C1638f f4412e;

    /* renamed from: f */
    private final ConcurrentHashMap<Integer, C1578N> f4413f;

    /* renamed from: g */
    private final EventBeatManager f4414g;

    /* renamed from: h */
    private final Object f4415h;

    /* renamed from: i */
    private final Object f4416i;

    /* renamed from: j */
    private List<C1428e> f4417j;

    /* renamed from: k */
    private List<C1428e> f4418k;

    /* renamed from: l */
    private final C1420a f4419l;

    /* renamed from: m */
    private boolean f4420m;

    /* renamed from: n */
    private long f4421n;

    /* renamed from: o */
    private long f4422o;

    /* renamed from: p */
    private long f4423p;

    /* renamed from: q */
    private long f4424q;

    /* renamed from: r */
    private long f4425r;

    /* renamed from: s */
    private long f4426s;

    /* renamed from: t */
    private long f4427t;

    /* renamed from: com.facebook.react.fabric.b$a */
    private class C1420a extends C1421c {
    }

    static {
        C1423b.m5817a();
        f4408a.put("View", ReactViewManager.REACT_CLASS);
        f4408a.put("Image", ReactImageManager.REACT_CLASS);
        f4408a.put("ScrollView", ReactScrollViewManager.REACT_CLASS);
        String str = "ReactPerformanceLoggerFlag";
        f4408a.put(str, str);
        f4408a.put("Paragraph", ReactTextViewManager.REACT_CLASS);
        f4408a.put("Text", "RCText");
        f4408a.put("RawText", ReactRawTextManager.REACT_CLASS);
        f4408a.put("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS);
        f4408a.put("ShimmeringView", "RKShimmeringView");
        f4408a.put("TemplateView", "RCTTemplateView");
    }

    /* renamed from: a */
    private void m5811a() {
        List<C1428e> list;
        List<C1428e> list2;
        if (!this.f4420m) {
            C0727a.m3284d("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        try {
            synchronized (this.f4416i) {
                list = this.f4418k;
                this.f4418k = new ArrayList();
            }
            this.f4421n = SystemClock.uptimeMillis();
            synchronized (this.f4415h) {
                list2 = this.f4417j;
                this.f4417j = new ArrayList();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("FabricUIManager::premountViews (");
            sb.append(list.size());
            sb.append(" batches)");
            C1937a.m7339a(0, sb.toString());
            for (C1428e a : list) {
                a.mo5251a(this.f4411d);
            }
            this.f4423p = SystemClock.uptimeMillis() - uptimeMillis;
            C1937a.m7338a(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FabricUIManager::mountViews (");
            sb2.append(list2.size());
            sb2.append(" batches)");
            C1937a.m7339a(0, sb2.toString());
            long uptimeMillis2 = SystemClock.uptimeMillis();
            for (C1428e a2 : list2) {
                a2.mo5251a(this.f4411d);
            }
            this.f4422o = SystemClock.uptimeMillis() - uptimeMillis2;
            C1937a.m7338a(0);
        } catch (Exception e) {
            C0727a.m3267a("ReactNative", "Exception thrown when executing UIFrameGuarded", (Throwable) e);
            this.f4420m = false;
            throw e;
        }
    }

    @C1137a
    private C1428e createBatchMountItem(C1428e[] eVarArr, int i) {
        return new BatchMountItem(eVarArr, i);
    }

    @C1137a
    private C1428e createMountItem(String str, int i, int i2, boolean z) {
        String str2 = (String) f4408a.get(str);
        if (str2 != null) {
            C1578N n = (C1578N) this.f4413f.get(Integer.valueOf(i));
            if (n != null) {
                return new C1424a(n, str2, i2, z);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find ReactContext for root: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find component with name ");
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    @C1137a
    private C1428e deleteMountItem(int i) {
        return new C1425b(i);
    }

    @C1137a
    private C1428e insertMountItem(int i, int i2, int i3) {
        return new C1427d(i, i2, i3);
    }

    @C1137a
    private long measure(String str, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, int i, int i2, int i3, int i4) {
        C1418b bVar = this.f4411d;
        ReactApplicationContext reactApplicationContext = this.f4410c;
        float f = (float) i;
        float f2 = (float) i2;
        float b = C1417a.m5794b(f, f2);
        YogaMeasureMode a = C1417a.m5793a(f, f2);
        float f3 = (float) i3;
        float f4 = (float) i4;
        bVar.mo5227a(reactApplicationContext, str, readableNativeMap, readableNativeMap2, b, a, C1417a.m5794b(f3, f4), C1417a.m5793a(f3, f4));
        throw null;
    }

    @C1137a
    private void preallocateView(int i, String str) {
        if (!UiThreadUtil.isOnUiThread()) {
            synchronized (this.f4416i) {
                Object obj = this.f4413f.get(Integer.valueOf(i));
                C1136a.m5053a(obj);
                C1578N n = (C1578N) obj;
                String str2 = (String) f4408a.get(str);
                C1136a.m5053a(str2);
                this.f4418k.add(new C1429f(n, i, str2));
            }
        }
    }

    @C1137a
    private C1428e removeMountItem(int i, int i2, int i3) {
        return new C1430g(i, i2, i3);
    }

    @C1137a
    private void scheduleMountItems(C1428e eVar, long j, long j2, long j3) {
        this.f4425r = j;
        this.f4426s = j2;
        this.f4427t = SystemClock.uptimeMillis() - j3;
        this.f4424q = SystemClock.uptimeMillis();
        synchronized (this.f4415h) {
            this.f4417j.add(eVar);
        }
        if (UiThreadUtil.isOnUiThread()) {
            m5811a();
        }
    }

    @C1137a
    private C1428e updateEventEmitterMountItem(int i, Object obj) {
        return new C1431h(i, (EventEmitterWrapper) obj);
    }

    @C1137a
    private C1428e updateLayoutMountItem(int i, int i2, int i3, int i4, int i5) {
        C1432i iVar = new C1432i(i, i2, i3, i4, i5);
        return iVar;
    }

    @C1137a
    private C1428e updateLocalDataMountItem(int i, ReadableNativeMap readableNativeMap) {
        return new C1433j(i, readableNativeMap);
    }

    @C1137a
    private C1428e updatePropsMountItem(int i, ReadableNativeMap readableNativeMap) {
        return new C1434k(i, readableNativeMap);
    }

    /* renamed from: a */
    public void mo5241a(int i, String str, WritableMap writableMap) {
        this.f4411d.mo5238b(i);
        throw null;
    }

    public <T extends SizeMonitoringFrameLayout & C1624a> int addRootView(T t, WritableMap writableMap, String str) {
        int a = C1568D.m6080a();
        new C1578N(this.f4410c, t.getContext());
        this.f4411d.mo5235a(a, (SizeMonitoringFrameLayout) t);
        throw null;
    }

    public void clearJSResponder() {
    }

    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        synchronized (this.f4415h) {
            this.f4417j.add(new C1426c(i, i2, readableArray));
        }
    }

    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f4425r));
        hashMap.put("LayoutTime", Long.valueOf(this.f4426s));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f4424q));
        hashMap.put("RunStartTime", Long.valueOf(this.f4421n));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f4422o));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f4423p));
        hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.f4427t));
        return hashMap;
    }

    public void initialize() {
        this.f4412e.mo5884a(2, (RCTEventEmitter) new FabricEventEmitter(this));
        this.f4412e.mo5885a((C1633a) this.f4414g);
    }

    public void onCatalystInstanceDestroy() {
        this.f4412e.mo5889b((C1633a) this.f4414g);
        this.f4412e.mo5883a(2);
        this.f4409b.mo5243a();
        C1693na.m6549a();
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        C1466i.m5877a().mo5344b(C1467a.DISPATCH_UI, this.f4419l);
    }

    public void onHostResume() {
        C1466i.m5877a().mo5342a(C1467a.DISPATCH_UI, (C1459a) this.f4419l);
    }

    @C1137a
    public void onRequestEventBeat() {
        this.f4412e.mo5888b();
    }

    public void profileNextBatch() {
    }

    public void removeRootView(int i) {
        this.f4411d.mo5240c(i);
        throw null;
    }

    public void setJSResponder(int i, boolean z) {
    }

    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        ReactApplicationContext reactApplicationContext = this.f4410c;
        C1416a aVar = new C1416a(this, reactApplicationContext, i, i2, i3);
        reactApplicationContext.runOnJSQueueThread(aVar);
    }
}
