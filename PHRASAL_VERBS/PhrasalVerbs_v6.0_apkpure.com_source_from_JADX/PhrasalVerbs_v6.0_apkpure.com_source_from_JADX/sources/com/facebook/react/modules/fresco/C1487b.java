package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import p032c.p033a.p074i.p077b.p078a.C0893e;
import p032c.p033a.p074i.p077b.p078a.C0893e.C0894a;
import p032c.p033a.p074i.p090n.C1054da.C1055a;

/* renamed from: com.facebook.react.modules.fresco.b */
class C1487b extends C0893e {

    /* renamed from: c */
    private final OkHttpClient f4590c;

    /* renamed from: d */
    private final Executor f4591d;

    public C1487b(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.f4590c = okHttpClient;
        this.f4591d = okHttpClient.dispatcher().executorService();
    }

    /* renamed from: a */
    private Map<String, String> m5925a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo3966a(C0894a aVar, C1055a aVar2) {
        aVar.f3143f = SystemClock.elapsedRealtime();
        Uri h = aVar.mo4260h();
        Map a = aVar.mo4254b().mo4322c() instanceof C1486a ? m5925a(((C1486a) aVar.mo4254b().mo4322c()).mo5387s()) : null;
        if (a == null) {
            a = Collections.emptyMap();
        }
        mo3964a(aVar, aVar2, new Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(h.toString()).headers(Headers.m7800of(a)).get().build());
    }
}
