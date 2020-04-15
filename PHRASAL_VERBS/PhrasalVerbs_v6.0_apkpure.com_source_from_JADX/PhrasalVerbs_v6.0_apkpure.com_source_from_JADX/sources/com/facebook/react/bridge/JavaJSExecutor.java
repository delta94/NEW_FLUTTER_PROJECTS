package com.facebook.react.bridge;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public interface JavaJSExecutor {

    public interface Factory {
        JavaJSExecutor create();
    }

    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @C1137a
    String executeJSCall(String str, String str2);

    @C1137a
    void loadApplicationScript(String str);

    @C1137a
    void setGlobalVariable(String str, String str2);
}
