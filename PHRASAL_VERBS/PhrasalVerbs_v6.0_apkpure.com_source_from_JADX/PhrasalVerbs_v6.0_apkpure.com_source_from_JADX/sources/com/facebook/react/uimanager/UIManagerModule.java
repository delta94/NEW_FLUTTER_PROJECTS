package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.util.ArrayMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.common.C1624a;
import com.facebook.react.uimanager.common.C1625b;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.p122b.C1599a;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p052e.p055b.C0783c;
import p032c.p033a.p052e.p056c.C0784a;
import p032c.p033a.p098m.p099a.C1165a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    private static final boolean DEBUG = C0783c.m3478a().mo3577a(C0784a.f2702f);
    public static final String NAME = "UIManager";
    private int mBatchId;
    /* access modifiers changed from: private */
    public final Map<String, Object> mCustomDirectEvents;
    private final C1638f mEventDispatcher;
    private final List<C1632ea> mListeners;
    private final C1587b mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    /* access modifiers changed from: private */
    public final C1584U mUIImplementation;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final C1701oa mViewManagerRegistry;

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$a */
    public interface C1586a {
        /* renamed from: a */
        String mo5790a(String str);
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$b */
    private class C1587b implements ComponentCallbacks2 {
        private C1587b() {
        }

        /* synthetic */ C1587b(UIManagerModule uIManagerModule, C1591X x) {
            this();
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                C1721sa.m6642a().mo5177b();
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$c */
    public interface C1588c {
        /* renamed from: a */
        ViewManager mo4529a(String str);

        /* renamed from: a */
        List<String> mo4530a();
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, C1588c cVar, int i) {
        this(reactApplicationContext, cVar, new C1589V(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, C1588c cVar, C1589V v, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new C1587b(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        C1654h.m6474b((Context) reactApplicationContext);
        this.mEventDispatcher = new C1638f(reactApplicationContext);
        this.mModuleConstants = createConstants(cVar);
        this.mCustomDirectEvents = C1622ca.m6378c();
        this.mViewManagerRegistry = new C1701oa(cVar);
        this.mUIImplementation = v.mo5794a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new C1589V(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, C1589V v, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new C1587b(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        C1654h.m6474b((Context) reactApplicationContext);
        this.mEventDispatcher = new C1638f(reactApplicationContext);
        this.mCustomDirectEvents = C1397f.m5742b();
        this.mModuleConstants = createConstants(list, null, this.mCustomDirectEvents);
        this.mViewManagerRegistry = new C1701oa(list);
        this.mUIImplementation = v.mo5794a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager b = str != null ? this.mUIImplementation.mo5729b(str) : null;
        if (b == null) {
            return null;
        }
        C1941a a = C1940c.m7352a(0, "UIManagerModule.getConstantsForViewManager");
        a.mo6822a("ViewManager", (Object) b.getName());
        a.mo6822a("Lazy", (Object) Boolean.valueOf(true));
        a.mo6823a();
        try {
            Map a2 = C1630da.m6389a(b, null, null, null, this.mCustomDirectEvents);
            if (a2 != null) {
                return Arguments.makeNativeMap(a2);
            }
            C1940c.m7351a(0).mo6823a();
            return null;
        } finally {
            C1940c.m7351a(0).mo6823a();
        }
    }

    private static Map<String, Object> createConstants(C1588c cVar) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C1941a a = C1940c.m7352a(0, "CreateUIManagerConstants");
        a.mo6822a("Lazy", (Object) Boolean.valueOf(true));
        a.mo6823a();
        try {
            return C1630da.m6388a(cVar);
        } finally {
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C1941a a = C1940c.m7352a(0, "CreateUIManagerConstants");
        a.mo6822a("Lazy", (Object) Boolean.valueOf(DEBUG));
        a.mo6823a();
        try {
            Map<String, Object> a2 = C1630da.m6390a(list, map, map2);
            return a2;
        } finally {
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public void addAnimation(int i, int i2, Callback callback) {
        this.mUIImplementation.mo5704a(i, i2, callback);
    }

    public <T extends SizeMonitoringFrameLayout & C1624a> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    public <T extends SizeMonitoringFrameLayout & C1624a> int addRootView(T t, WritableMap writableMap, String str) {
        C1937a.m7339a(0, "UIManagerModule.addRootView");
        int a = C1568D.m6080a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        this.mUIImplementation.mo5726a(t, a, new C1578N(reactApplicationContext, t.getContext()));
        t.setOnSizeChangedListener(new C1593Z(this, reactApplicationContext, a));
        C1937a.m7338a(0);
        return a;
    }

    public void addUIBlock(C1582S s) {
        this.mUIImplementation.mo5724a(s);
    }

    public void addUIManagerListener(C1632ea eaVar) {
        this.mListeners.add(eaVar);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.mo5699a();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.mo5718a(readableMap, callback, callback2);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("(UIManager.createView) tag: ");
            sb.append(i);
            sb.append(", class: ");
            sb.append(str);
            sb.append(", props: ");
            sb.append(readableMap);
            String sb2 = sb.toString();
            C0727a.m3266a("ReactNative", sb2);
            C0783c.m3478a().mo3575a(C0784a.f2702f, sb2);
        }
        this.mUIImplementation.mo5714a(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.mo5737c();
    }

    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.mo5706a(i, i2, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        C1590W.m6338a(getReactApplicationContext(), C1625b.m6380a(i)).dispatchCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.mo5701a(i, (float) Math.round(C1726w.m6665a(readableArray.getDouble(0))), (float) Math.round(C1726w.m6665a(readableArray.getDouble(1))), callback);
    }

    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        WritableMap writableMap = (WritableMap) this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return writableMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(C1630da.m6387a());
    }

    public C1586a getDirectEventNamesResolver() {
        return new C1591X(this);
    }

    public C1638f getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.mo5740d();
    }

    public C1584U getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public C1701oa getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.mo5884a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        C1569E g = this.mUIImplementation.mo5746g(i);
        if (g == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Warning : attempted to dirty a non-existent react shadow node. reactTag=");
            sb.append(i);
            C0727a.m3284d("ReactNative", sb.toString());
            return;
        }
        g.mo5582c();
        this.mUIImplementation.mo5700a(-1);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("(UIManager.manageChildren) tag: ");
            sb.append(i);
            sb.append(", moveFrom: ");
            sb.append(readableArray);
            sb.append(", moveTo: ");
            sb.append(readableArray2);
            sb.append(", addTags: ");
            sb.append(readableArray3);
            sb.append(", atIndices: ");
            sb.append(readableArray4);
            sb.append(", removeFrom: ");
            sb.append(readableArray5);
            String sb2 = sb.toString();
            C0727a.m3266a("ReactNative", sb2);
            C0783c.m3478a().mo3575a(C0784a.f2702f, sb2);
        }
        this.mUIImplementation.mo5711a(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.mo5707a(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.mo5734b(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.mo5705a(i, i2, callback, callback2);
    }

    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.mo5708a(i, callback, callback2);
    }

    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        C1941a a = C1940c.m7352a(0, "onBatchCompleteUI");
        a.mo6821a("BatchId", i);
        a.mo6823a();
        for (C1632ea willDispatchViewUpdates : this.mListeners) {
            willDispatchViewUpdates.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.mo5700a(i);
        } finally {
            C1937a.m7338a(0);
        }
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.mo5890c();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        C1721sa.m6642a().mo5177b();
        C1693na.m6549a();
    }

    public void onHostDestroy() {
        this.mUIImplementation.mo5742e();
    }

    public void onHostPause() {
        this.mUIImplementation.mo5745f();
    }

    public void onHostResume() {
        this.mUIImplementation.mo5747g();
    }

    @ReactMethod
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    @Deprecated
    public void preComputeConstantsForViewManager(List<String> list) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str);
            if (computeConstantsForViewManager != null) {
                arrayMap.put(str, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(arrayMap);
    }

    public void prependUIBlock(C1582S s) {
        this.mUIImplementation.mo5736b(s);
    }

    public void profileNextBatch() {
        this.mUIImplementation.mo5748h();
    }

    public void registerAnimation(C1165a aVar) {
        this.mUIImplementation.mo5717a(aVar);
    }

    public void removeAnimation(int i, int i2) {
        this.mUIImplementation.mo5702a(i, i2);
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.mo5741d(i);
    }

    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.mo5743e(i);
    }

    public void removeUIManagerListener(C1632ea eaVar) {
        this.mListeners.remove(eaVar);
    }

    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.mo5731b(i, i2);
    }

    public int resolveRootTagFromReactTag(int i) {
        return C1625b.m6381b(i) ? i : this.mUIImplementation.mo5744f(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        this.mUIImplementation.mo5739c(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("(UIManager.setChildren) tag: ");
            sb.append(i);
            sb.append(", children: ");
            sb.append(readableArray);
            String sb2 = sb.toString();
            C0727a.m3266a("ReactNative", sb2);
            C0783c.m3478a().mo3575a(C0784a.f2702f, sb2);
        }
        this.mUIImplementation.mo5709a(i, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.mo5716a(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.mo5727a(z);
    }

    public void setViewHierarchyUpdateDebugListener(C1599a aVar) {
        this.mUIImplementation.mo5725a(aVar);
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new C1597aa(this, reactApplicationContext, i, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.mo5710a(i, readableArray, callback, callback2);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.mo5703a(i, i2, i3);
    }

    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C1600ba baVar = new C1600ba(this, reactApplicationContext, i, i2, i3);
        reactApplicationContext.runOnNativeModulesQueueThread(baVar);
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("(UIManager.updateView) tag: ");
            sb.append(i);
            sb.append(", class: ");
            sb.append(str);
            sb.append(", props: ");
            sb.append(readableMap);
            String sb2 = sb.toString();
            C0727a.m3266a("ReactNative", sb2);
            C0783c.m3478a().mo3575a(C0784a.f2702f, sb2);
        }
        this.mUIImplementation.mo5715a(i, str, readableMap);
    }

    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.mo5733b(i, i2, callback);
    }
}
