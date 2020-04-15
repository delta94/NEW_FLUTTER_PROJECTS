package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.storage.g */
class C1550g extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4718a;

    /* renamed from: b */
    final /* synthetic */ AsyncStorageModule f4719b;

    C1550g(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback) {
        this.f4719b = asyncStorageModule;
        this.f4718a = callback;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        if (!this.f4719b.mReactDatabaseSupplier.mo5506c()) {
            this.f4718a.invoke(C1545b.m6053a(null));
            return;
        }
        try {
            this.f4719b.mReactDatabaseSupplier.mo5504a();
            this.f4718a.invoke(new Object[0]);
        } catch (Exception e) {
            C0727a.m3276b("ReactNative", e.getMessage(), (Throwable) e);
            this.f4718a.invoke(C1545b.m6054a(null, e.getMessage()));
        }
    }
}
