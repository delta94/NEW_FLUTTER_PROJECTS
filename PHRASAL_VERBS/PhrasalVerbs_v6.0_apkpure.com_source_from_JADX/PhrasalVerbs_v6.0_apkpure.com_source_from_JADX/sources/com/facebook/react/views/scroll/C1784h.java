package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1726w;
import java.util.Map;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.views.scroll.h */
public class C1784h {

    /* renamed from: com.facebook.react.views.scroll.h$a */
    public interface C1785a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, C1786b bVar);

        void scrollToEnd(T t, C1787c cVar);
    }

    /* renamed from: com.facebook.react.views.scroll.h$b */
    public static class C1786b {

        /* renamed from: a */
        public final int f5292a;

        /* renamed from: b */
        public final int f5293b;

        /* renamed from: c */
        public final boolean f5294c;

        C1786b(int i, int i2, boolean z) {
            this.f5292a = i;
            this.f5293b = i2;
            this.f5294c = z;
        }
    }

    /* renamed from: com.facebook.react.views.scroll.h$c */
    public static class C1787c {

        /* renamed from: a */
        public final boolean f5295a;

        C1787c(boolean z) {
            this.f5295a = z;
        }
    }

    /* renamed from: a */
    public static Map<String, Integer> m6847a() {
        return C1397f.m5737a("scrollTo", Integer.valueOf(1), "scrollToEnd", Integer.valueOf(2), "flashScrollIndicators", Integer.valueOf(3));
    }

    /* renamed from: a */
    public static <T> void m6848a(C1785a<T> aVar, T t, int i, ReadableArray readableArray) {
        C1136a.m5053a(aVar);
        C1136a.m5053a(t);
        C1136a.m5053a(readableArray);
        if (i == 1) {
            aVar.scrollTo(t, new C1786b(Math.round(C1726w.m6665a(readableArray.getDouble(0))), Math.round(C1726w.m6665a(readableArray.getDouble(1))), readableArray.getBoolean(2)));
        } else if (i == 2) {
            aVar.scrollToEnd(t, new C1787c(readableArray.getBoolean(0)));
        } else if (i == 3) {
            aVar.flashScrollIndicators(t);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), aVar.getClass().getSimpleName()}));
        }
    }
}
