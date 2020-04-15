package com.facebook.react.modules.network;

import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Response;

/* renamed from: com.facebook.react.modules.network.m */
class C1521m implements Interceptor {

    /* renamed from: a */
    final /* synthetic */ String f4650a;

    /* renamed from: b */
    final /* synthetic */ RCTDeviceEventEmitter f4651b;

    /* renamed from: c */
    final /* synthetic */ int f4652c;

    /* renamed from: d */
    final /* synthetic */ NetworkingModule f4653d;

    C1521m(NetworkingModule networkingModule, String str, RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        this.f4653d = networkingModule;
        this.f4650a = str;
        this.f4651b = rCTDeviceEventEmitter;
        this.f4652c = i;
    }

    public Response intercept(Chain chain) {
        Response proceed = chain.proceed(chain.request());
        return proceed.newBuilder().body(new C1531w(proceed.body(), new C1520l(this))).build();
    }
}
