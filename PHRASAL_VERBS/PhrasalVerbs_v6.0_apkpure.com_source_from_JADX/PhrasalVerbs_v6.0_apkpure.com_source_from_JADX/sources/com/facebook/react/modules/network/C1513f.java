package com.facebook.react.modules.network;

import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.modules.network.f */
class C1513f extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Runnable f4637a;

    /* renamed from: b */
    final /* synthetic */ C1516i f4638b;

    C1513f(C1516i iVar, ReactContext reactContext, Runnable runnable) {
        this.f4638b = iVar;
        this.f4637a = runnable;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        this.f4637a.run();
    }
}
