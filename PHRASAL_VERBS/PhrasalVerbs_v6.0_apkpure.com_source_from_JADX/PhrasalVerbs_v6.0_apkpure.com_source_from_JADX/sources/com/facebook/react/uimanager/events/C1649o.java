package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1726w;

/* renamed from: com.facebook.react.uimanager.events.o */
public class C1649o {
    /* renamed from: a */
    private static WritableArray m6462a(int i, C1645k kVar) {
        WritableArray createArray = Arguments.createArray();
        MotionEvent j = kVar.mo5896j();
        float x = j.getX() - kVar.mo5897k();
        float y = j.getY() - kVar.mo5898l();
        for (int i2 = 0; i2 < j.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", (double) C1726w.m6666a(j.getX(i2)));
            createMap.putDouble("pageY", (double) C1726w.m6666a(j.getY(i2)));
            float y2 = j.getY(i2) - y;
            createMap.putDouble("locationX", (double) C1726w.m6666a(j.getX(i2) - x));
            createMap.putDouble("locationY", (double) C1726w.m6666a(y2));
            createMap.putInt("target", i);
            createMap.putDouble("timestamp", (double) kVar.mo5875e());
            createMap.putDouble("identifier", (double) j.getPointerId(i2));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    /* renamed from: a */
    public static void m6463a(RCTEventEmitter rCTEventEmitter, C1648n nVar, int i, C1645k kVar) {
        WritableArray a = m6462a(i, kVar);
        MotionEvent j = kVar.mo5896j();
        WritableArray createArray = Arguments.createArray();
        if (nVar == C1648n.MOVE || nVar == C1648n.CANCEL) {
            for (int i2 = 0; i2 < j.getPointerCount(); i2++) {
                createArray.pushInt(i2);
            }
        } else if (nVar == C1648n.START || nVar == C1648n.END) {
            createArray.pushInt(j.getActionIndex());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown touch type: ");
            sb.append(nVar);
            throw new RuntimeException(sb.toString());
        }
        rCTEventEmitter.receiveTouches(C1648n.m6461a(nVar), a, createArray);
    }
}
