package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.C1401i;
import com.facebook.react.devsupport.p118a.C1408b;
import com.facebook.react.modules.core.C1458b.C1459a;
import com.facebook.react.modules.core.C1466i.C1467a;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p032c.p033a.p098m.p101c.C1173b;
import p032c.p033a.p098m.p101c.C1174c;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "Timing")
public final class Timing extends ReactContextBaseJavaModule implements LifecycleEventListener, C1174c {
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    public static final String NAME = "Timing";
    /* access modifiers changed from: private */
    public final AtomicBoolean isPaused = new AtomicBoolean(true);
    /* access modifiers changed from: private */
    public final AtomicBoolean isRunningTasks = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public C1453a mCurrentIdleCallbackRunnable;
    private final C1408b mDevSupportManager;
    private boolean mFrameCallbackPosted = false;
    private boolean mFrameIdleCallbackPosted = false;
    /* access modifiers changed from: private */
    public final Object mIdleCallbackGuard = new Object();
    private final C1454b mIdleFrameCallback = new C1454b(this, null);
    /* access modifiers changed from: private */
    public final C1466i mReactChoreographer;
    /* access modifiers changed from: private */
    public boolean mSendIdleEvents = false;
    private final C1456d mTimerFrameCallback = new C1456d(this, null);
    /* access modifiers changed from: private */
    public final Object mTimerGuard = new Object();
    /* access modifiers changed from: private */
    public final SparseArray<C1455c> mTimerIdsToTimers;
    /* access modifiers changed from: private */
    public final PriorityQueue<C1455c> mTimers;

    /* renamed from: com.facebook.react.modules.core.Timing$a */
    private class C1453a implements Runnable {

        /* renamed from: a */
        private volatile boolean f4503a = false;

        /* renamed from: b */
        private final long f4504b;

        public C1453a(long j) {
            this.f4504b = j;
        }

        /* renamed from: a */
        public void mo5330a() {
            this.f4503a = true;
        }

        public void run() {
            boolean access$1400;
            if (!this.f4503a) {
                long c = C1401i.m5753c() - (this.f4504b / 1000000);
                long a = C1401i.m5751a() - c;
                if (Timing.FRAME_DURATION_MS - ((float) c) >= Timing.IDLE_CALLBACK_FRAME_DEADLINE_MS) {
                    synchronized (Timing.this.mIdleCallbackGuard) {
                        access$1400 = Timing.this.mSendIdleEvents;
                    }
                    if (access$1400) {
                        ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callIdleCallbacks((double) a);
                    }
                    Timing.this.mCurrentIdleCallbackRunnable = null;
                }
            }
        }
    }

    /* renamed from: com.facebook.react.modules.core.Timing$b */
    private class C1454b extends C1459a {
        private C1454b() {
        }

        /* synthetic */ C1454b(Timing timing, C1469j jVar) {
            this();
        }

        /* renamed from: a */
        public void mo5332a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                if (Timing.this.mCurrentIdleCallbackRunnable != null) {
                    Timing.this.mCurrentIdleCallbackRunnable.mo5330a();
                }
                Timing timing = Timing.this;
                timing.mCurrentIdleCallbackRunnable = new C1453a(j);
                Timing.this.getReactApplicationContext().runOnJSQueueThread(Timing.this.mCurrentIdleCallbackRunnable);
                Timing.this.mReactChoreographer.mo5342a(C1467a.IDLE_EVENT, (C1459a) this);
            }
        }
    }

    /* renamed from: com.facebook.react.modules.core.Timing$c */
    private static class C1455c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f4507a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f4508b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f4509c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f4510d;

        private C1455c(int i, long j, int i2, boolean z) {
            this.f4507a = i;
            this.f4510d = j;
            this.f4509c = i2;
            this.f4508b = z;
        }

        /* synthetic */ C1455c(int i, long j, int i2, boolean z, C1469j jVar) {
            this(i, j, i2, z);
        }
    }

    /* renamed from: com.facebook.react.modules.core.Timing$d */
    private class C1456d extends C1459a {

        /* renamed from: b */
        private WritableArray f4511b;

        private C1456d() {
            this.f4511b = null;
        }

        /* synthetic */ C1456d(Timing timing, C1469j jVar) {
            this();
        }

        /* renamed from: a */
        public void mo5332a(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                long j2 = j / 1000000;
                synchronized (Timing.this.mTimerGuard) {
                    while (!Timing.this.mTimers.isEmpty() && ((C1455c) Timing.this.mTimers.peek()).f4510d < j2) {
                        C1455c cVar = (C1455c) Timing.this.mTimers.poll();
                        if (this.f4511b == null) {
                            this.f4511b = Arguments.createArray();
                        }
                        this.f4511b.pushInt(cVar.f4507a);
                        if (cVar.f4508b) {
                            cVar.f4510d = ((long) cVar.f4509c) + j2;
                            Timing.this.mTimers.add(cVar);
                        } else {
                            Timing.this.mTimerIdsToTimers.remove(cVar.f4507a);
                        }
                    }
                }
                if (this.f4511b != null) {
                    ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(this.f4511b);
                    this.f4511b = null;
                }
                Timing.this.mReactChoreographer.mo5342a(C1467a.TIMERS_EVENTS, (C1459a) this);
            }
        }
    }

    public Timing(ReactApplicationContext reactApplicationContext, C1408b bVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = bVar;
        this.mTimers = new PriorityQueue<>(11, new C1469j(this));
        this.mTimerIdsToTimers = new SparseArray<>();
        this.mReactChoreographer = C1466i.m5877a();
    }

    /* access modifiers changed from: private */
    public void clearChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.mo5344b(C1467a.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = false;
        }
    }

    private void clearFrameCallback() {
        C1173b a = C1173b.m5190a((ReactContext) getReactApplicationContext());
        if (this.mFrameCallbackPosted && this.isPaused.get() && !a.mo4534a()) {
            this.mReactChoreographer.mo5344b(C1467a.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = false;
        }
    }

    private void maybeIdleCallback() {
        if (this.isPaused.get() && !this.isRunningTasks.get()) {
            clearFrameCallback();
        }
    }

    private void maybeSetChoreographerIdleCallback() {
        synchronized (this.mIdleCallbackGuard) {
            if (this.mSendIdleEvents) {
                setChoreographerIdleCallback();
            }
        }
    }

    private void setChoreographerCallback() {
        if (!this.mFrameCallbackPosted) {
            this.mReactChoreographer.mo5342a(C1467a.TIMERS_EVENTS, (C1459a) this.mTimerFrameCallback);
            this.mFrameCallbackPosted = true;
        }
    }

    /* access modifiers changed from: private */
    public void setChoreographerIdleCallback() {
        if (!this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.mo5342a(C1467a.IDLE_EVENT, (C1459a) this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = true;
        }
    }

    @ReactMethod
    public void createTimer(int i, int i2, double d, boolean z) {
        long a = C1401i.m5751a();
        long j = (long) d;
        if (this.mDevSupportManager.mo5217b() && Math.abs(j - a) > 60000) {
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0, (j - a) + ((long) i2));
        if (i2 != 0 || z) {
            C1455c cVar = new C1455c(i, (C1401i.m5752b() / 1000000) + max, i2, z, null);
            synchronized (this.mTimerGuard) {
                this.mTimers.add(cVar);
                this.mTimerIdsToTimers.put(i, cVar);
            }
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(createArray);
    }

    @ReactMethod
    public void deleteTimer(int i) {
        synchronized (this.mTimerGuard) {
            C1455c cVar = (C1455c) this.mTimerIdsToTimers.get(i);
            if (cVar != null) {
                this.mTimerIdsToTimers.remove(i);
                this.mTimers.remove(cVar);
            }
        }
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        C1173b.m5190a((ReactContext) getReactApplicationContext()).mo4533a((C1174c) this);
    }

    public void onCatalystInstanceDestroy() {
        clearFrameCallback();
        clearChoreographerIdleCallback();
        C1173b.m5190a((ReactContext) getReactApplicationContext()).mo4535b((C1174c) this);
    }

    public void onHeadlessJsTaskFinish(int i) {
        if (!C1173b.m5190a((ReactContext) getReactApplicationContext()).mo4534a()) {
            this.isRunningTasks.set(false);
            clearFrameCallback();
            maybeIdleCallback();
        }
    }

    public void onHeadlessJsTaskStart(int i) {
        if (!this.isRunningTasks.getAndSet(true)) {
            setChoreographerCallback();
            maybeSetChoreographerIdleCallback();
        }
    }

    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @ReactMethod
    public void setSendIdleEvents(boolean z) {
        synchronized (this.mIdleCallbackGuard) {
            this.mSendIdleEvents = z;
        }
        UiThreadUtil.runOnUiThread(new C1470k(this, z));
    }
}
