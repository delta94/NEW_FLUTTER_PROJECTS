package com.facebook.react.uimanager.events;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.common.C1625b;
import p032c.p033a.p094k.p095a.C1136a;

public class ReactEventEmitter implements RCTEventEmitter {
    private static final String TAG = "ReactEventEmitter";
    private final SparseArray<RCTEventEmitter> mEventEmitters = new SparseArray<>();
    private final ReactApplicationContext mReactContext;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getEventEmitter(int i) {
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) this.mEventEmitters.get(C1625b.m6380a(i));
        return rCTEventEmitter == null ? (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class) : rCTEventEmitter;
    }

    public void receiveEvent(int i, String str, WritableMap writableMap) {
        getEventEmitter(i).receiveEvent(i, str, writableMap);
    }

    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        C1136a.m5055a(writableArray.size() > 0);
        getEventEmitter(writableArray.getMap(0).getInt("target")).receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mEventEmitters.put(i, rCTEventEmitter);
    }

    public void unregister(int i) {
        this.mEventEmitters.remove(i);
    }
}
