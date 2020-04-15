package com.facebook.react.bridge;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
interface ReactCallback {
    @C1137a
    void decrementPendingJSCalls();

    @C1137a
    void incrementPendingJSCalls();

    @C1137a
    void onBatchComplete();
}
