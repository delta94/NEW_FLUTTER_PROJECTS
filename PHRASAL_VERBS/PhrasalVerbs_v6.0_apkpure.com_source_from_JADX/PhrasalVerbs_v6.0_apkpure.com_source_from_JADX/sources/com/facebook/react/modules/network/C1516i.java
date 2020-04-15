package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.react.modules.network.i */
public class C1516i extends CookieHandler {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final boolean f4642a = (VERSION.SDK_INT < 21);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1517a f4643b = new C1517a();

    /* renamed from: c */
    private final ReactContext f4644c;

    /* renamed from: d */
    private CookieManager f4645d;

    /* renamed from: com.facebook.react.modules.network.i$a */
    private class C1517a {

        /* renamed from: a */
        private final Handler f4646a;

        public C1517a() {
            this.f4646a = new Handler(Looper.getMainLooper(), new C1514g(this, C1516i.this));
        }

        /* access modifiers changed from: private */
        @TargetApi(21)
        /* renamed from: c */
        public void m6018c() {
            CookieManager a = C1516i.this.m6014c();
            if (a != null) {
                a.flush();
            }
        }

        /* renamed from: a */
        public void mo5457a() {
            if (C1516i.f4642a) {
                this.f4646a.sendEmptyMessageDelayed(1, 30000);
            }
        }

        /* renamed from: b */
        public void mo5458b() {
            this.f4646a.removeMessages(1);
            C1516i.this.m6007a((Runnable) new C1515h(this));
        }
    }

    public C1516i(ReactContext reactContext) {
        this.f4644c = reactContext;
    }

    /* renamed from: a */
    private static void m6005a(Context context) {
        if (f4642a) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6007a(Runnable runnable) {
        new C1513f(this, this.f4644c, runnable).execute(new Void[0]);
    }

    @TargetApi(21)
    /* renamed from: a */
    private void m6008a(String str, String str2) {
        CookieManager c = m6014c();
        if (c != null) {
            c.setCookie(str, str2, null);
        }
    }

    /* renamed from: a */
    private void m6009a(String str, List<String> list) {
        CookieManager c = m6014c();
        if (c != null) {
            if (f4642a) {
                m6007a((Runnable) new C1512e(this, list, c, str));
            } else {
                for (String a : list) {
                    m6008a(str, a);
                }
                c.flush();
                this.f4643b.mo5457a();
            }
        }
    }

    /* renamed from: a */
    private static boolean m6011a(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    /* renamed from: b */
    private void m6013b(Callback callback) {
        CookieManager c = m6014c();
        if (c != null) {
            c.removeAllCookies(new C1511d(this, callback));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public CookieManager m6014c() {
        if (this.f4645d == null) {
            m6005a((Context) this.f4644c);
            try {
                this.f4645d = CookieManager.getInstance();
                if (f4642a) {
                    this.f4645d.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("No WebView installed")) {
                    return null;
                }
                throw e;
            }
        }
        return this.f4645d;
    }

    /* renamed from: a */
    public void mo5453a(Callback callback) {
        if (f4642a) {
            new C1510c(this, this.f4644c, callback).execute(new Void[0]);
        } else {
            m6013b(callback);
        }
    }

    /* renamed from: b */
    public void mo5454b() {
        if (f4642a) {
            CookieManager c = m6014c();
            if (c != null) {
                c.removeExpiredCookie();
            }
            this.f4643b.mo5458b();
        }
    }

    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        CookieManager c = m6014c();
        if (c == null) {
            return Collections.emptyMap();
        }
        String cookie = c.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    public void put(URI uri, Map<String, List<String>> map) {
        String uri2 = uri.toString();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && m6011a(str)) {
                m6009a(uri2, (List) entry.getValue());
            }
        }
    }
}
