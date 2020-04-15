package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public interface MessageQueueThread {
    @C1137a
    void assertIsOnThread();

    @C1137a
    void assertIsOnThread(String str);

    @C1137a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @C1137a
    MessageQueueThreadPerfStats getPerfStats();

    @C1137a
    boolean isOnThread();

    @C1137a
    void quitSynchronous();

    @C1137a
    void resetPerfStats();

    @C1137a
    void runOnQueue(Runnable runnable);
}
