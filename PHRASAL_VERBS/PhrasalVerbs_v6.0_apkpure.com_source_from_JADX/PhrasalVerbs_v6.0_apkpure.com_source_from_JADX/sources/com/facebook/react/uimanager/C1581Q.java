package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.facebook.react.uimanager.Q */
public class C1581Q {

    /* renamed from: a */
    private static ThreadLocal<double[]> f4790a = new C1580P();

    /* renamed from: a */
    private static double m6270a(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = (double) Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : C1699o.m6561a(d);
    }

    /* renamed from: a */
    public static void m6271a(ReadableArray readableArray, double[] dArr) {
        double d;
        double[] dArr2 = (double[]) f4790a.get();
        C1699o.m6575c(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String nextKey = map.keySetIterator().nextKey();
            C1699o.m6575c(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array.getDouble(i2);
                }
            } else if ("perspective".equals(nextKey)) {
                C1699o.m6563a(dArr2, map.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                C1699o.m6572b(dArr2, m6270a(map, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                C1699o.m6576c(dArr2, m6270a(map, nextKey));
            } else if ("rotate".equals(nextKey) || "rotateZ".equals(nextKey)) {
                C1699o.m6578d(dArr2, m6270a(map, nextKey));
            } else {
                if ("scale".equals(nextKey)) {
                    d = map.getDouble(nextKey);
                    C1699o.m6581e(dArr2, d);
                } else if ("scaleX".equals(nextKey)) {
                    C1699o.m6581e(dArr2, map.getDouble(nextKey));
                } else if ("scaleY".equals(nextKey)) {
                    d = map.getDouble(nextKey);
                } else {
                    double d2 = 0.0d;
                    if ("translate".equals(nextKey)) {
                        ReadableArray array2 = map.getArray(nextKey);
                        double d3 = array2.getDouble(0);
                        double d4 = array2.getDouble(1);
                        if (array2.size() > 2) {
                            d2 = array2.getDouble(2);
                        }
                        C1699o.m6565a(dArr2, d3, d4, d2);
                    } else if ("translateX".equals(nextKey)) {
                        C1699o.m6564a(dArr2, map.getDouble(nextKey), 0.0d);
                    } else if ("translateY".equals(nextKey)) {
                        C1699o.m6564a(dArr2, 0.0d, map.getDouble(nextKey));
                    } else if ("skewX".equals(nextKey)) {
                        C1699o.m6583g(dArr2, m6270a(map, nextKey));
                    } else if ("skewY".equals(nextKey)) {
                        C1699o.m6584h(dArr2, m6270a(map, nextKey));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported transform type: ");
                        sb.append(nextKey);
                        throw new JSApplicationIllegalArgumentException(sb.toString());
                    }
                }
                C1699o.m6582f(dArr2, d);
            }
            C1699o.m6567a(dArr, dArr, dArr2);
        }
    }
}
