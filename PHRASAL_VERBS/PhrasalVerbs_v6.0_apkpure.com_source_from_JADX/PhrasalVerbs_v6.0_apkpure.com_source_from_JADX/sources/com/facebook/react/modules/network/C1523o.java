package com.facebook.react.modules.network;

import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

/* renamed from: com.facebook.react.modules.network.o */
class C1523o implements C1527s {

    /* renamed from: a */
    long f4659a = System.nanoTime();

    /* renamed from: b */
    final /* synthetic */ RCTDeviceEventEmitter f4660b;

    /* renamed from: c */
    final /* synthetic */ int f4661c;

    /* renamed from: d */
    final /* synthetic */ NetworkingModule f4662d;

    C1523o(NetworkingModule networkingModule, RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        this.f4662d = networkingModule;
        this.f4660b = rCTDeviceEventEmitter;
        this.f4661c = i;
    }

    /* renamed from: a */
    public void mo5460a(long j, long j2, boolean z) {
        long nanoTime = System.nanoTime();
        if (z || NetworkingModule.shouldDispatch(nanoTime, this.f4659a)) {
            C1503B.m5991b(this.f4660b, this.f4661c, j, j2);
            this.f4659a = nanoTime;
        }
    }
}
