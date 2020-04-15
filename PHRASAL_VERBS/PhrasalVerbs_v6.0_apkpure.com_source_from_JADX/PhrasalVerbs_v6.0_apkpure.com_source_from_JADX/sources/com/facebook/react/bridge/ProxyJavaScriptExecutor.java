package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    private JavaJSExecutor mJavaJSExecutor;

    public static class Factory implements JavaScriptExecutorFactory {
        private final com.facebook.react.bridge.JavaJSExecutor.Factory mJavaJSExecutorFactory;

        public Factory(com.facebook.react.bridge.JavaJSExecutor.Factory factory) {
            this.mJavaJSExecutorFactory = factory;
        }

        public JavaScriptExecutor create() {
            return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public ProxyJavaScriptExecutor(JavaJSExecutor javaJSExecutor) {
        super(initHybrid(javaJSExecutor));
        this.mJavaJSExecutor = javaJSExecutor;
    }

    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    public void close() {
        JavaJSExecutor javaJSExecutor = this.mJavaJSExecutor;
        if (javaJSExecutor != null) {
            javaJSExecutor.close();
            this.mJavaJSExecutor = null;
        }
    }

    public String getName() {
        return "ProxyJavaScriptExecutor";
    }
}
