package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.modules.network.y */
public class C1533y implements C1508a {

    /* renamed from: a */
    private CookieJar f4677a = null;

    /* renamed from: a */
    public void mo5440a() {
        this.f4677a = null;
    }

    /* renamed from: a */
    public void mo5441a(CookieJar cookieJar) {
        this.f4677a = cookieJar;
    }

    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.f4677a;
        if (cookieJar == null) {
            return Collections.emptyList();
        }
        List<Cookie> loadForRequest = cookieJar.loadForRequest(httpUrl);
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : loadForRequest) {
            try {
                new Builder().add(cookie.name(), cookie.value());
                arrayList.add(cookie);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.f4677a;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }
}
