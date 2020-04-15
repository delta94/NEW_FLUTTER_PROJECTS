package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends ReactContextBaseJavaModule {
    private C1402a mCaptureInProgress = null;

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    /* renamed from: com.facebook.react.devsupport.JSCHeapCapture$a */
    public interface C1402a {
        /* renamed from: a */
        void mo5199a(C1403b bVar);

        /* renamed from: a */
        void mo5200a(File file);
    }

    /* renamed from: com.facebook.react.devsupport.JSCHeapCapture$b */
    public static class C1403b extends Exception {
        C1403b(String str) {
            super(str);
        }
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public synchronized void captureComplete(String str, String str2) {
        if (this.mCaptureInProgress != null) {
            if (str2 == null) {
                this.mCaptureInProgress.mo5200a(new File(str));
            } else {
                this.mCaptureInProgress.mo5199a(new C1403b(str2));
            }
            this.mCaptureInProgress = null;
        }
    }

    public synchronized void captureHeap(String str, C1402a aVar) {
        if (this.mCaptureInProgress != null) {
            aVar.mo5199a(new C1403b("Heap capture already in progress."));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/capture.json");
        File file = new File(sb.toString());
        file.delete();
        HeapCapture heapCapture = (HeapCapture) getReactApplicationContext().getJSModule(HeapCapture.class);
        if (heapCapture == null) {
            aVar.mo5199a(new C1403b("Heap capture js module not registered."));
            return;
        }
        this.mCaptureInProgress = aVar;
        heapCapture.captureHeap(file.getPath());
    }

    public String getName() {
        return "JSCHeapCapture";
    }
}
