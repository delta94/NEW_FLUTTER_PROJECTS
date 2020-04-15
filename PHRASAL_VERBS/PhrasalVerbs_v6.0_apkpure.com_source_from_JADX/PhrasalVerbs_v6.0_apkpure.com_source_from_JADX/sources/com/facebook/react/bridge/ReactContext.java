package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p032c.p033a.p094k.p095a.C1136a;

public class ReactContext extends ContextWrapper {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners = new CopyOnWriteArraySet<>();
    private CatalystInstance mCatalystInstance;
    private WeakReference<Activity> mCurrentActivity;
    private LayoutInflater mInflater;
    private MessageQueueThread mJSMessageQueueThread;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners = new CopyOnWriteArraySet<>();
    private LifecycleState mLifecycleState = LifecycleState.BEFORE_CREATE;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private MessageQueueThread mUiMessageQueueThread;

    /* renamed from: com.facebook.react.bridge.ReactContext$2 */
    static /* synthetic */ class C13822 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$common$LifecycleState = new int[LifecycleState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.react.common.LifecycleState[] r0 = com.facebook.react.common.LifecycleState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$react$common$LifecycleState = r0
                int[] r0 = $SwitchMap$com$facebook$react$common$LifecycleState     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.react.common.LifecycleState r1 = com.facebook.react.common.LifecycleState.BEFORE_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$facebook$react$common$LifecycleState     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.react.common.LifecycleState r1 = com.facebook.react.common.LifecycleState.BEFORE_RESUME     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$facebook$react$common$LifecycleState     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.react.common.LifecycleState r1 = com.facebook.react.common.LifecycleState.RESUMED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReactContext.C13822.<clinit>():void");
        }
    }

    public ReactContext(Context context) {
        super(context);
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (hasActiveCatalystInstance()) {
            int i = C13822.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    runOnUiQueueThread(new Runnable() {
                        public void run() {
                            if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                                try {
                                    lifecycleEventListener.onHostResume();
                                } catch (RuntimeException e) {
                                    ReactContext.this.handleException(e);
                                }
                            }
                        }
                    });
                    return;
                }
                throw new RuntimeException("Unhandled lifecycle state.");
            }
        }
    }

    public void assertOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread(String str) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        messageQueueThread.assertIsOnThread(str);
    }

    public void assertOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.destroy();
        }
    }

    public CatalystInstance getCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        C1136a.m5053a(catalystInstance);
        return catalystInstance;
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJSModule(cls);
        }
        throw new RuntimeException(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mCatalystInstance.getJavaScriptContextHolder();
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public void handleException(Exception exc) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null && !catalystInstance.isDestroyed()) {
            NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
            if (nativeModuleCallExceptionHandler != null) {
                nativeModuleCallExceptionHandler.handleException(exc);
                return;
            }
        }
        throw new RuntimeException(exc);
    }

    public boolean hasActiveCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return catalystInstance != null && !catalystInstance.isDestroyed();
    }

    public boolean hasCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.hasNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        } else if (this.mCatalystInstance == null) {
            this.mCatalystInstance = catalystInstance;
            ReactQueueConfiguration reactQueueConfiguration = catalystInstance.getReactQueueConfiguration();
            this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
            this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
            this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
        } else {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
    }

    public boolean isOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((ActivityEventListener) it.next()).onActivityResult(activity, i, i2, intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostDestroy();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostPause();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostResume();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void onNewIntent(Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((ActivityEventListener) it.next()).onNewIntent(intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void resetPerfStats() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        if (messageQueueThread != null) {
            messageQueueThread.resetPerfStats();
        }
        MessageQueueThread messageQueueThread2 = this.mJSMessageQueueThread;
        if (messageQueueThread2 != null) {
            messageQueueThread2.resetPerfStats();
        }
    }

    public void runOnJSQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        C1136a.m5053a(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
    }

    public boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        C1136a.m5053a(currentActivity);
        currentActivity.startActivityForResult(intent, i, bundle);
        return true;
    }
}
