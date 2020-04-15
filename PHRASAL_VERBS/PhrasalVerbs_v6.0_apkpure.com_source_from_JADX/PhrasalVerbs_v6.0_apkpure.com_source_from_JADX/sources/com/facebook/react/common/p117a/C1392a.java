package com.facebook.react.common.p117a;

import java.util.Iterator;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* renamed from: com.facebook.react.common.a.a */
public class C1392a {
    /* renamed from: a */
    public static void m5724a(OkHttpClient okHttpClient, Object obj) {
        for (Call call : okHttpClient.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
                return;
            }
        }
        Iterator it = okHttpClient.dispatcher().runningCalls().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Call call2 = (Call) it.next();
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
                break;
            }
        }
    }
}
