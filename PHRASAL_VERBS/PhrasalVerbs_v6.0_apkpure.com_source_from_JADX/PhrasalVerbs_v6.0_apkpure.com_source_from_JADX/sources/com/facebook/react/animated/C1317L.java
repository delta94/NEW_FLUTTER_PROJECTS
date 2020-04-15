package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.react.animated.L */
class C1317L extends C1328b {

    /* renamed from: e */
    private final C1312H f4279e;

    /* renamed from: f */
    private final Map<String, Integer> f4280f = new HashMap();

    C1317L(ReadableMap readableMap, C1312H h) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f4280f.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f4279e = h;
    }

    /* renamed from: a */
    public void mo4835a(JavaOnlyMap javaOnlyMap) {
        for (Entry entry : this.f4280f.entrySet()) {
            C1328b d = this.f4279e.mo4824d(((Integer) entry.getValue()).intValue());
            if (d == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            } else if (d instanceof C1322P) {
                ((C1322P) d).mo4860a(javaOnlyMap);
            } else if (d instanceof C1326Q) {
                javaOnlyMap.putDouble((String) entry.getKey(), ((C1326Q) d).mo4864d());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported type of node used in property node ");
                sb.append(d.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
