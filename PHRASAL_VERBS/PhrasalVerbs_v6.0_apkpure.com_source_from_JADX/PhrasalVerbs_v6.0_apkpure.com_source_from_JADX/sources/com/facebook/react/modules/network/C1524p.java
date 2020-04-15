package com.facebook.react.modules.network;

import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.p117a.C1392a;

/* renamed from: com.facebook.react.modules.network.p */
class C1524p extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ int f4663a;

    /* renamed from: b */
    final /* synthetic */ NetworkingModule f4664b;

    C1524p(NetworkingModule networkingModule, ReactContext reactContext, int i) {
        this.f4664b = networkingModule;
        this.f4663a = i;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        C1392a.m5724a(this.f4664b.mClient, Integer.valueOf(this.f4663a));
    }
}
