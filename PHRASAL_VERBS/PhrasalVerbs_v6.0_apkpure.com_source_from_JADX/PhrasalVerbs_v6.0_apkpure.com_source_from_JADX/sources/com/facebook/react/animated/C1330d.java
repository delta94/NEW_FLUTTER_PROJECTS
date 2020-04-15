package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.d */
abstract class C1330d {

    /* renamed from: a */
    boolean f4305a = false;

    /* renamed from: b */
    C1326Q f4306b;

    /* renamed from: c */
    Callback f4307c;

    /* renamed from: d */
    int f4308d;

    C1330d() {
    }

    /* renamed from: a */
    public abstract void mo4833a(long j);

    /* renamed from: a */
    public void mo4834a(ReadableMap readableMap) {
        StringBuilder sb = new StringBuilder();
        sb.append("Animation config for ");
        sb.append(getClass().getSimpleName());
        sb.append(" cannot be reset");
        throw new JSApplicationCausedNativeException(sb.toString());
    }
}
