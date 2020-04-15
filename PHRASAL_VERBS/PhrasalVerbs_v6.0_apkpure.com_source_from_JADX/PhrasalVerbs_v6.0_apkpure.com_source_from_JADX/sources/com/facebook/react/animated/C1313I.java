package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.C1571G;
import com.facebook.react.uimanager.C1584U;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.react.animated.I */
class C1313I extends C1328b {

    /* renamed from: e */
    private int f4255e = -1;

    /* renamed from: f */
    private final C1312H f4256f;

    /* renamed from: g */
    private final C1584U f4257g;

    /* renamed from: h */
    private final Map<String, Integer> f4258h;

    /* renamed from: i */
    private final JavaOnlyMap f4259i;

    /* renamed from: j */
    private final C1571G f4260j;

    C1313I(ReadableMap readableMap, C1312H h, C1584U u) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f4258h = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f4258h.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f4259i = new JavaOnlyMap();
        this.f4260j = new C1571G(this.f4259i);
        this.f4256f = h;
        this.f4257g = u;
    }

    /* renamed from: a */
    public void mo4829a(int i) {
        if (this.f4255e == -1) {
            this.f4255e = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animated node ");
        sb.append(this.f4304d);
        sb.append(" is already attached to a view");
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo4830b() {
        ReadableMapKeySetIterator keySetIterator = this.f4259i.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.f4259i.putNull(keySetIterator.nextKey());
        }
        this.f4257g.mo5712a(this.f4255e, this.f4260j);
    }

    /* renamed from: b */
    public void mo4831b(int i) {
        if (this.f4255e == i) {
            this.f4255e = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
    }

    /* renamed from: c */
    public final void mo4832c() {
        if (this.f4255e != -1) {
            for (Entry entry : this.f4258h.entrySet()) {
                C1328b d = this.f4256f.mo4824d(((Integer) entry.getValue()).intValue());
                if (d == null) {
                    throw new IllegalArgumentException("Mapped property node does not exists");
                } else if (d instanceof C1317L) {
                    ((C1317L) d).mo4835a(this.f4259i);
                } else if (d instanceof C1326Q) {
                    this.f4259i.putDouble((String) entry.getKey(), ((C1326Q) d).mo4864d());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported type of node used in property node ");
                    sb.append(d.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f4257g.mo5712a(this.f4255e, this.f4260j);
        }
    }
}
