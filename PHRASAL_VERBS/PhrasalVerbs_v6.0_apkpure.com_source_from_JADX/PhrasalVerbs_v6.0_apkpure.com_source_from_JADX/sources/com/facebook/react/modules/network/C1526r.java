package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.TlsVersion;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.network.r */
public class C1526r {

    /* renamed from: a */
    private static C1525q f4665a;

    /* renamed from: a */
    public static Builder m6027a(Context context, int i) {
        Builder b = m6031b();
        return i == 0 ? b : b.cache(new Cache(new File(context.getCacheDir(), "http-cache"), (long) i));
    }

    /* renamed from: a */
    public static Builder m6028a(Builder builder) {
        if (VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new C1504C());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                C0727a.m3267a("OkHttpClientProvider", "Error while enabling TLS 1.2", (Throwable) e);
            }
        }
        return builder;
    }

    /* renamed from: a */
    public static OkHttpClient m6029a() {
        C1525q qVar = f4665a;
        return qVar != null ? qVar.mo5463a() : m6031b().build();
    }

    /* renamed from: a */
    public static OkHttpClient m6030a(Context context) {
        C1525q qVar = f4665a;
        return qVar != null ? qVar.mo5463a() : m6032b(context).build();
    }

    /* renamed from: b */
    public static Builder m6031b() {
        Builder cookieJar = new Builder().connectTimeout(0, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).cookieJar(new C1533y());
        try {
            Security.insertProviderAt((Provider) Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
            return cookieJar;
        } catch (Exception unused) {
            m6028a(cookieJar);
            return cookieJar;
        }
    }

    /* renamed from: b */
    public static Builder m6032b(Context context) {
        return m6027a(context, 10485760);
    }
}
