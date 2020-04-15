package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "JSCSamplingProfiler", needsEagerInit = true)
public class JSCSamplingProfiler extends ReactContextBaseJavaModule {
    private static final HashSet<JSCSamplingProfiler> sRegisteredDumpers = new HashSet<>();
    private String mOperationError = null;
    private boolean mOperationInProgress = false;
    private int mOperationToken = 0;
    private SamplingProfiler mSamplingProfiler = null;
    private String mSamplingProfilerResult = null;

    public interface SamplingProfiler extends JavaScriptModule {
        void poke(int i);
    }

    /* renamed from: com.facebook.react.devsupport.JSCSamplingProfiler$a */
    public static class C1404a extends Exception {
        C1404a(String str) {
            super(str);
        }
    }

    public JSCSamplingProfiler(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private int getOperationToken() {
        if (!this.mOperationInProgress) {
            this.mOperationInProgress = true;
            int i = this.mOperationToken + 1;
            this.mOperationToken = i;
            return i;
        }
        throw new C1404a("Another operation already in progress.");
    }

    public static synchronized List<String> poke(long j) {
        LinkedList linkedList;
        synchronized (JSCSamplingProfiler.class) {
            linkedList = new LinkedList();
            if (!sRegisteredDumpers.isEmpty()) {
                Iterator it = sRegisteredDumpers.iterator();
                while (it.hasNext()) {
                    JSCSamplingProfiler jSCSamplingProfiler = (JSCSamplingProfiler) it.next();
                    jSCSamplingProfiler.pokeHelper(j);
                    linkedList.add(jSCSamplingProfiler.mSamplingProfilerResult);
                }
            } else {
                throw new C1404a("No JSC registered");
            }
        }
        return linkedList;
    }

    private synchronized void pokeHelper(long j) {
        if (this.mSamplingProfiler != null) {
            this.mSamplingProfiler.poke(getOperationToken());
            waitForOperation(j);
        } else {
            throw new C1404a("SamplingProfiler.js module not connected");
        }
    }

    private static synchronized void registerSamplingProfiler(JSCSamplingProfiler jSCSamplingProfiler) {
        synchronized (JSCSamplingProfiler.class) {
            if (!sRegisteredDumpers.contains(jSCSamplingProfiler)) {
                sRegisteredDumpers.add(jSCSamplingProfiler);
            } else {
                throw new RuntimeException("a JSCSamplingProfiler registered more than once");
            }
        }
    }

    private static synchronized void unregisterSamplingProfiler(JSCSamplingProfiler jSCSamplingProfiler) {
        synchronized (JSCSamplingProfiler.class) {
            sRegisteredDumpers.remove(jSCSamplingProfiler);
        }
    }

    private void waitForOperation(long j) {
        try {
            wait(j);
            if (!this.mOperationInProgress) {
                String str = this.mOperationError;
                if (str != null) {
                    throw new C1404a(str);
                }
                return;
            }
            this.mOperationInProgress = false;
            throw new C1404a("heap capture timed out.");
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Waiting for heap capture failed: ");
            sb.append(e.getMessage());
            throw new C1404a(sb.toString());
        }
    }

    public String getName() {
        return "JSCSamplingProfiler";
    }

    public void initialize() {
        super.initialize();
        this.mSamplingProfiler = (SamplingProfiler) getReactApplicationContext().getJSModule(SamplingProfiler.class);
        registerSamplingProfiler(this);
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        unregisterSamplingProfiler(this);
        this.mSamplingProfiler = null;
    }

    @ReactMethod
    public synchronized void operationComplete(int i, String str, String str2) {
        if (i == this.mOperationToken) {
            this.mOperationInProgress = false;
            this.mSamplingProfilerResult = str;
            this.mOperationError = str2;
            notify();
        } else {
            throw new RuntimeException("Completed operation is not in progress.");
        }
    }
}
