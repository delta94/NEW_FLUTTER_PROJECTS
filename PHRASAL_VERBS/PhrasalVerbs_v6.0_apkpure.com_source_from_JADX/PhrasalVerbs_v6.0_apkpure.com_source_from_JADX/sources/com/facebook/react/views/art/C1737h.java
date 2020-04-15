package com.facebook.react.views.art;

import com.facebook.react.bridge.ReadableArray;

/* renamed from: com.facebook.react.views.art.h */
class C1737h {
    /* renamed from: a */
    static int m6694a(ReadableArray readableArray, float[] fArr) {
        int length = readableArray.size() > fArr.length ? fArr.length : readableArray.size();
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        return readableArray.size();
    }

    /* renamed from: a */
    static float[] m6695a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        float[] fArr = new float[readableArray.size()];
        m6694a(readableArray, fArr);
        return fArr;
    }
}
