package com.facebook.react.modules.network;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import java.net.SocketTimeoutException;

/* renamed from: com.facebook.react.modules.network.B */
public class C1503B {
    /* renamed from: a */
    public static void m5984a(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushNull();
        rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", createArray);
    }

    /* renamed from: a */
    public static void m5985a(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, int i2, WritableMap writableMap, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushInt(i2);
        createArray.pushMap(writableMap);
        createArray.pushString(str);
        rCTDeviceEventEmitter.emit("didReceiveNetworkResponse", createArray);
    }

    /* renamed from: a */
    public static void m5986a(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, long j, long j2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushInt((int) j);
        createArray.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didReceiveNetworkDataProgress", createArray);
    }

    /* renamed from: a */
    public static void m5987a(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, WritableMap writableMap) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushMap(writableMap);
        rCTDeviceEventEmitter.emit("didReceiveNetworkData", createArray);
    }

    /* renamed from: a */
    public static void m5988a(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        rCTDeviceEventEmitter.emit("didReceiveNetworkData", createArray);
    }

    /* renamed from: a */
    public static void m5989a(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str, long j, long j2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        createArray.pushInt((int) j);
        createArray.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didReceiveNetworkIncrementalData", createArray);
    }

    /* renamed from: a */
    public static void m5990a(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, String str, Throwable th) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushString(str);
        if (th != null && th.getClass() == SocketTimeoutException.class) {
            createArray.pushBoolean(true);
        }
        rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", createArray);
    }

    /* renamed from: b */
    public static void m5991b(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, long j, long j2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        createArray.pushInt((int) j);
        createArray.pushInt((int) j2);
        rCTDeviceEventEmitter.emit("didSendNetworkData", createArray);
    }
}
