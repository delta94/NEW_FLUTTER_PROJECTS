package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.devsupport.JSCHeapCapture.C1403b;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "JSDevSupport")
public class JSDevSupport extends ReactContextBaseJavaModule {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
    public static final String MODULE_NAME = "JSDevSupport";
    private volatile C1405a mCurrentCallback = null;

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    /* renamed from: com.facebook.react.devsupport.JSDevSupport$a */
    public interface C1405a {
        /* renamed from: a */
        void mo5208a(int i, Exception exc);

        /* renamed from: a */
        void mo5209a(String str);
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public synchronized void computeDeepestJSHierarchy(View view, C1405a aVar) {
        getJSHierarchy(Integer.valueOf(((View) C1415g.m5791a(view).first).getId()).intValue(), aVar);
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ERROR_CODE_EXCEPTION", Integer.valueOf(0));
        hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", Integer.valueOf(1));
        return hashMap;
    }

    public synchronized void getJSHierarchy(int i, C1405a aVar) {
        JSDevSupportModule jSDevSupportModule = (JSDevSupportModule) getReactApplicationContext().getJSModule(JSDevSupportModule.class);
        if (jSDevSupportModule == null) {
            aVar.mo5208a(0, new C1403b("JSDevSupport module not registered."));
            return;
        }
        this.mCurrentCallback = aVar;
        jSDevSupportModule.getJSHierarchy(i);
    }

    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public synchronized void onFailure(int i, String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.mo5208a(i, new RuntimeException(str));
        }
    }

    @ReactMethod
    public synchronized void onSuccess(String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.mo5209a(str);
        }
    }
}
