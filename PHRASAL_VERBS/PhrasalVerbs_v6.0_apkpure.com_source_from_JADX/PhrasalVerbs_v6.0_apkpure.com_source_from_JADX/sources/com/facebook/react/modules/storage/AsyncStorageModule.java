package com.facebook.react.modules.storage;

import android.os.AsyncTask;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p032c.p033a.p098m.p104e.p105a.C1178a;

@C1176a(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends ReactContextBaseJavaModule implements C1178a {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final C1543a executor;
    /* access modifiers changed from: private */
    public C1553j mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$a */
    private class C1543a implements Executor {

        /* renamed from: a */
        private final ArrayDeque<Runnable> f4702a = new ArrayDeque<>();

        /* renamed from: b */
        private Runnable f4703b;

        /* renamed from: c */
        private final Executor f4704c;

        C1543a(Executor executor) {
            this.f4704c = executor;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo5495a() {
            Runnable runnable = (Runnable) this.f4702a.poll();
            this.f4703b = runnable;
            if (runnable != null) {
                this.f4704c.execute(this.f4703b);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.f4702a.offer(new C1552i(this, runnable));
            if (this.f4703b == null) {
                mo5495a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor2) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new C1543a(executor2);
        this.mReactDatabaseSupplier = C1553j.m6063a(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.mo5506c();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new C1550g(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.mo5505b();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new C1551h(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(C1545b.m6055b(null), null);
            return;
        }
        new C1546c(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new C1549f(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C1545b.m6055b(null));
            return;
        }
        new C1548e(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C1545b.m6055b(null));
            return;
        }
        new C1547d(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }
}
