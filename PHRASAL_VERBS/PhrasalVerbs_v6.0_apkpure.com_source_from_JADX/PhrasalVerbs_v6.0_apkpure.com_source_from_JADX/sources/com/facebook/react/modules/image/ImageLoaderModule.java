package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import p032c.p033a.p038c.p040b.C0694a;
import p032c.p033a.p051d.C0768e;
import p032c.p033a.p059g.p060a.p061a.C0799c;
import p032c.p033a.p074i.p091o.C1117d;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "ImageLoader")
public class ImageLoaderModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<C0768e<Void>> mEnqueuedRequests;

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }

    private void registerRequest(int i, C0768e<Void> eVar) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, eVar);
        }
    }

    /* access modifiers changed from: private */
    public C0768e<Void> removeRequest(int i) {
        C0768e<Void> eVar;
        synchronized (this.mEnqueuedRequestMonitor) {
            eVar = (C0768e) this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return eVar;
    }

    @ReactMethod
    public void abortRequest(int i) {
        C0768e removeRequest = removeRequest(i);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        C0799c.m3533a().mo4072a(C1117d.m4986a(Uri.parse(str)).mo4378a(), this.mCallerContext).mo3549a(new C1490a(this, promise), C0694a.m3202a());
    }

    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                C0768e eVar = (C0768e) this.mEnqueuedRequests.valueAt(i);
                if (eVar != null) {
                    eVar.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    @ReactMethod
    public void prefetchImage(String str, int i, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        C0768e b = C0799c.m3533a().mo4080b(C1117d.m4986a(Uri.parse(str)).mo4378a(), this.mCallerContext);
        C1491b bVar = new C1491b(this, i, promise);
        registerRequest(i, b);
        b.mo3549a(bVar, C0694a.m3202a());
    }

    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new C1492c(this, getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
