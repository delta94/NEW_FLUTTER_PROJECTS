package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.react.animated.P */
class C1322P extends C1328b {

    /* renamed from: e */
    private final C1312H f4288e;

    /* renamed from: f */
    private final List<C1325c> f4289f;

    /* renamed from: com.facebook.react.animated.P$a */
    private class C1323a extends C1325c {

        /* renamed from: c */
        public int f4290c;

        private C1323a() {
            super();
        }
    }

    /* renamed from: com.facebook.react.animated.P$b */
    private class C1324b extends C1325c {

        /* renamed from: c */
        public double f4292c;

        private C1324b() {
            super();
        }
    }

    /* renamed from: com.facebook.react.animated.P$c */
    private class C1325c {

        /* renamed from: a */
        public String f4294a;

        private C1325c() {
        }
    }

    C1322P(ReadableMap readableMap, C1312H h) {
        Object obj;
        ReadableArray array = readableMap.getArray("transforms");
        this.f4289f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                C1323a aVar = new C1323a();
                aVar.f4294a = string;
                aVar.f4290c = map.getInt("nodeTag");
                obj = aVar;
            } else {
                C1324b bVar = new C1324b();
                bVar.f4294a = string;
                bVar.f4292c = map.getDouble("value");
                obj = bVar;
            }
            this.f4289f.add(obj);
        }
        this.f4288e = h;
    }

    /* renamed from: a */
    public void mo4860a(JavaOnlyMap javaOnlyMap) {
        double d;
        ArrayList arrayList = new ArrayList(this.f4289f.size());
        for (C1325c cVar : this.f4289f) {
            if (cVar instanceof C1323a) {
                C1328b d2 = this.f4288e.mo4824d(((C1323a) cVar).f4290c);
                if (d2 == null) {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                } else if (d2 instanceof C1326Q) {
                    d = ((C1326Q) d2).mo4864d();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported type of node used as a transform child node ");
                    sb.append(d2.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                d = ((C1324b) cVar).f4292c;
            }
            arrayList.add(JavaOnlyMap.m5720of(cVar.f4294a, Double.valueOf(d)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
