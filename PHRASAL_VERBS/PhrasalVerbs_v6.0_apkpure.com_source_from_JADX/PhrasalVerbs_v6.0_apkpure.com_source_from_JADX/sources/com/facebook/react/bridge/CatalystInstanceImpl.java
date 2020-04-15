package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.TraceListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p096l.p097a.C1137a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1137a
public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
    private volatile boolean mAcceptCalls;
    /* access modifiers changed from: private */
    public final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    /* access modifiers changed from: private */
    public final HybridData mHybridData;
    private boolean mInitialized;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    /* access modifiers changed from: private */
    public final JSIModuleRegistry mJSIModuleRegistry;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    /* access modifiers changed from: private */
    public JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    /* access modifiers changed from: private */
    public final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    /* access modifiers changed from: private */
    public final AtomicInteger mPendingJSCalls;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private String mSourceURL;
    private final TraceListener mTraceListener;

    private static class BridgeCallback implements ReactCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }
    }

    public static class Builder {
        private JSBundleLoader mJSBundleLoader;
        private JavaScriptExecutor mJSExecutor;
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        private NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            ReactQueueConfigurationSpec reactQueueConfigurationSpec = this.mReactQueueConfigurationSpec;
            C1136a.m5053a(reactQueueConfigurationSpec);
            ReactQueueConfigurationSpec reactQueueConfigurationSpec2 = reactQueueConfigurationSpec;
            JavaScriptExecutor javaScriptExecutor = this.mJSExecutor;
            C1136a.m5053a(javaScriptExecutor);
            JavaScriptExecutor javaScriptExecutor2 = javaScriptExecutor;
            NativeModuleRegistry nativeModuleRegistry = this.mRegistry;
            C1136a.m5053a(nativeModuleRegistry);
            NativeModuleRegistry nativeModuleRegistry2 = nativeModuleRegistry;
            JSBundleLoader jSBundleLoader = this.mJSBundleLoader;
            C1136a.m5053a(jSBundleLoader);
            JSBundleLoader jSBundleLoader2 = jSBundleLoader;
            NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
            C1136a.m5053a(nativeModuleCallExceptionHandler);
            CatalystInstanceImpl catalystInstanceImpl = new CatalystInstanceImpl(reactQueueConfigurationSpec2, javaScriptExecutor2, nativeModuleRegistry2, jSBundleLoader2, nativeModuleCallExceptionHandler);
            return catalystInstanceImpl;
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
            return this;
        }

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    private static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    private class NativeExceptionHandler implements QueueThreadExceptionHandler {
        private NativeExceptionHandler() {
        }

        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    public static class PendingJSCall {
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        /* access modifiers changed from: 0000 */
        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                nativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, nativeArray);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(".");
            sb.append(this.mMethod);
            sb.append("(");
            NativeArray nativeArray = this.mArguments;
            sb.append(nativeArray == null ? "" : nativeArray.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        ReactBridge.staticInit();
    }

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mPendingJSCalls = new AtomicInteger(0);
        StringBuilder sb = new StringBuilder();
        sb.append("pending_js_calls_instance");
        sb.append(sNextInstanceIdForTrace.getAndIncrement());
        this.mJsPendingCallsTitleForTrace = sb.toString();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        String str = "ReactNative";
        Log.d(str, "Initializing React Xplat Bridge.");
        C1937a.m7339a(0, "createCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler());
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
        this.mTraceListener = new JSProfilerTraceListener(this);
        C1937a.m7338a(0);
        Log.d(str, "Initializing React Xplat Bridge before initializeBridge");
        C1937a.m7339a(0, "initializeCxxBridge");
        initializeBridge(new BridgeCallback(this), javaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), this.mNativeModulesQueueThread, this.mNativeModuleRegistry.getJavaModules(this), this.mNativeModuleRegistry.getCxxModules());
        Log.d(str, "Initializing React Xplat Bridge after initializeBridge");
        C1937a.m7338a(0);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    /* access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        int decrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z = decrementAndGet == 0;
        C1937a.m7350e(0, this.mJsPendingCallsTitleForTrace, decrementAndGet);
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                public void run() {
                    Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeIdle();
                    }
                }
            });
        }
    }

    private native long getJavaScriptContext();

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        C1176a aVar = (C1176a) cls.getAnnotation(C1176a.class);
        if (aVar != null) {
            return aVar.name();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find @ReactModule annotation in ");
        sb.append(cls.getCanonicalName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: private */
    public void incrementPendingJSCalls() {
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        boolean z = andIncrement == 0;
        C1937a.m7350e(0, this.mJsPendingCallsTitleForTrace, andIncrement + 1);
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                public void run() {
                    Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeBusy();
                    }
                }
            });
        }
    }

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    /* access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() {
            public void run() {
                CatalystInstanceImpl.this.destroy();
            }
        });
    }

    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    public void addJSIModules(List<JSIModuleSpec> list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            String pendingJSCall2 = pendingJSCall.toString();
            StringBuilder sb = new StringBuilder();
            sb.append("Calling JS function after bridge has been destroyed: ");
            sb.append(pendingJSCall2);
            C0727a.m3284d("ReactNative", sb.toString());
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(pendingJSCall);
                    return;
                }
            }
        }
        pendingJSCall.call(this);
    }

    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    public void destroy() {
        Log.d("ReactNative", "CatalystInstanceImpl.destroy() start");
        UiThreadUtil.assertOnUiThread();
        if (!this.mDestroyed) {
            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                public void run() {
                    CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
                    CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
                    boolean z = false;
                    if (CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0) {
                        z = true;
                    }
                    if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                        Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                        while (it.hasNext()) {
                            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = (NotThreadSafeBridgeIdleDebugListener) it.next();
                            if (!z) {
                                notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                            }
                            notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                        }
                    }
                    AsyncTask.execute(new Runnable() {
                        public void run() {
                            CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                            CatalystInstanceImpl.this.mHybridData.mo4794a();
                            CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                            Log.d("ReactNative", "CatalystInstanceImpl.destroy() end");
                            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                        }
                    });
                }
            });
            C1937a.m7346b(this.mTraceListener);
        }
    }

    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
    }

    public <T extends JSIModule> T getJSIModule(Class<T> cls) {
        return this.mJSIModuleRegistry.getModule(cls);
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return this.mNativeModuleRegistry.getModule(getNameFromAnnotation(cls));
    }

    public NativeModule getNativeModule(String str) {
        return this.mNativeModuleRegistry.getModule(str);
    }

    public Collection<NativeModule> getNativeModules() {
        return this.mNativeModuleRegistry.getAllModules();
    }

    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    public String getSourceURL() {
        return this.mSourceURL;
    }

    public void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return this.mNativeModuleRegistry.hasModule(getNameFromAnnotation(cls));
    }

    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            z = this.mJSBundleHasLoaded && this.mAcceptCalls;
        }
        return z;
    }

    public void initialize() {
        Log.d("ReactNative", "CatalystInstanceImpl.initialize()");
        C1136a.m5056a(!this.mInitialized, "This catalyst instance has already been initialized");
        C1136a.m5056a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
            }
        });
    }

    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            C0727a.m3284d("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    public void loadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromDeltaBundle(str, nativeDeltaClient, z);
    }

    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    public void runJSBundle() {
        Log.d("ReactNative", "CatalystInstanceImpl.runJSBundle()");
        C1136a.m5056a(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator it = this.mJSCallsPendingInit.iterator();
            while (it.hasNext()) {
                ((PendingJSCall) it.next()).call(this);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
        C1937a.m7343a(this.mTraceListener);
    }

    public native void setGlobalVariable(String str, String str2);

    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }
}
