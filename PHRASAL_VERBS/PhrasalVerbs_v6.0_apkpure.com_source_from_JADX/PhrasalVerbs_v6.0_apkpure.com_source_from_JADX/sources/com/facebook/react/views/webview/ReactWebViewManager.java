package com.facebook.react.views.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.PictureListener;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.views.webview.p128a.C1899a;
import com.facebook.react.views.webview.p128a.C1900b;
import com.facebook.react.views.webview.p128a.C1901c;
import com.facebook.react.views.webview.p128a.C1902d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTWebView")
public class ReactWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    protected static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    private static final String INTENT_URL_PREFIX = "intent://";
    public static final String REACT_CLASS = "RCTWebView";
    protected PictureListener mPictureListener;
    protected C1905d mWebViewConfig;

    /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$a */
    protected static class C1895a extends WebView implements LifecycleEventListener {

        /* renamed from: a */
        protected String f5659a;

        /* renamed from: b */
        protected boolean f5660b = false;

        /* renamed from: c */
        protected C1897b f5661c;

        /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$a$a */
        protected class C1896a {

            /* renamed from: a */
            C1895a f5662a;

            C1896a(C1895a aVar) {
                this.f5662a = aVar;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f5662a.mo6777b(str);
            }
        }

        public C1895a(C1578N n) {
            super(n);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1896a mo6773a(C1895a aVar) {
            return new C1896a(aVar);
        }

        /* renamed from: a */
        public void mo6774a() {
            if (getSettings().getJavaScriptEnabled()) {
                String str = this.f5659a;
                if (str != null && !TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(function() {\n");
                    sb.append(this.f5659a);
                    sb.append(";\n})();");
                    mo6775a(sb.toString());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6775a(String str) {
            if (VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("javascript:");
                sb.append(URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING));
                loadUrl(sb.toString());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6776b() {
            setWebViewClient(null);
            destroy();
        }

        /* renamed from: b */
        public void mo6777b(String str) {
            ReactWebViewManager.dispatchEvent(this, new C1902d(getId(), str));
        }

        /* renamed from: c */
        public void mo6778c() {
            if (this.f5660b) {
                mo6775a("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})");
            }
        }

        public C1897b getReactWebViewClient() {
            return this.f5661c;
        }

        public void onHostDestroy() {
            mo6776b();
        }

        public void onHostPause() {
        }

        public void onHostResume() {
        }

        public void setInjectedJavaScript(String str) {
            this.f5659a = str;
        }

        public void setMessagingEnabled(boolean z) {
            if (this.f5660b != z) {
                this.f5660b = z;
                String str = ReactWebViewManager.BRIDGE_NAME;
                if (z) {
                    addJavascriptInterface(mo6773a(this), str);
                    mo6778c();
                } else {
                    removeJavascriptInterface(str);
                }
            }
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f5661c = (C1897b) webViewClient;
        }
    }

    /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$b */
    protected static class C1897b extends WebViewClient {

        /* renamed from: a */
        protected boolean f5664a = false;

        /* renamed from: b */
        protected ReadableArray f5665b;

        /* renamed from: c */
        protected List<Pattern> f5666c;

        protected C1897b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m7221a(android.content.Context r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "intent://"
                boolean r0 = r8.startsWith(r0)
                java.lang.String r1 = "ReactNative"
                r2 = 0
                if (r0 == 0) goto L_0x0017
                r0 = 1
                android.content.Intent r0 = android.content.Intent.parseUri(r8, r0)     // Catch:{ URISyntaxException -> 0x0011 }
                goto L_0x0018
            L_0x0011:
                r0 = move-exception
                java.lang.String r3 = "Can't parse intent:// URI"
                p032c.p033a.p038c.p043e.C0727a.m3267a(r1, r3, r0)
            L_0x0017:
                r0 = r2
            L_0x0018:
                java.lang.String r3 = "android.intent.category.BROWSABLE"
                java.lang.String r4 = "android.intent.action.VIEW"
                if (r0 == 0) goto L_0x0048
                r0.addCategory(r3)
                r0.setComponent(r2)
                r0.setSelector(r2)
                android.content.pm.PackageManager r2 = r7.getPackageManager()
                r5 = 65536(0x10000, float:9.18355E-41)
                android.content.pm.ResolveInfo r2 = r2.resolveActivity(r0, r5)
                if (r2 == 0) goto L_0x0037
                r7.startActivity(r0)
                goto L_0x0051
            L_0x0037:
                java.lang.String r2 = "browser_fallback_url"
                java.lang.String r0 = r0.getStringExtra(r2)
                android.content.Intent r2 = new android.content.Intent
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r2.<init>(r4, r0)
                r0 = r2
                goto L_0x0051
            L_0x0048:
                android.content.Intent r0 = new android.content.Intent
                android.net.Uri r2 = android.net.Uri.parse(r8)
                r0.<init>(r4, r2)
            L_0x0051:
                r2 = 268435456(0x10000000, float:2.5243549E-29)
                r0.setFlags(r2)     // Catch:{ ActivityNotFoundException -> 0x005d }
                r0.addCategory(r3)     // Catch:{ ActivityNotFoundException -> 0x005d }
                r7.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x005d }
                goto L_0x0072
            L_0x005d:
                r7 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "activity not found to handle uri scheme for: "
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                p032c.p033a.p038c.p043e.C0727a.m3276b(r1, r8, r7)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.webview.ReactWebViewManager.C1897b.m7221a(android.content.Context, java.lang.String):void");
        }

        /* renamed from: a */
        private boolean m7222a(List<Pattern> list, String str) {
            Uri parse = Uri.parse(str);
            String str2 = "";
            String scheme = parse.getScheme() != null ? parse.getScheme() : str2;
            if (parse.getAuthority() != null) {
                str2 = parse.getAuthority();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(scheme);
            sb.append("://");
            sb.append(str2);
            String sb2 = sb.toString();
            for (Pattern matcher : list) {
                if (matcher.matcher(sb2).matches()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public WritableMap mo6784a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", !this.f5664a && webView.getProgress() != 100);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        /* renamed from: a */
        public void mo6785a(ReadableArray readableArray) {
            this.f5665b = readableArray;
        }

        /* renamed from: a */
        public void mo6786a(List<Pattern> list) {
            this.f5666c = list;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6787b(WebView webView, String str) {
            ReactWebViewManager.dispatchEvent(webView, new C1900b(webView.getId(), mo6784a(webView, str)));
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f5664a) {
                C1895a aVar = (C1895a) webView;
                aVar.mo6774a();
                aVar.mo6778c();
                mo6787b(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f5664a = false;
            ReactWebViewManager.dispatchEvent(webView, new C1901c(webView.getId(), mo6784a(webView, str)));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f5664a = true;
            mo6787b(webView, str2);
            WritableMap a = mo6784a(webView, str2);
            a.putDouble("code", (double) i);
            a.putString("description", str);
            ReactWebViewManager.dispatchEvent(webView, new C1899a(webView.getId(), a));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.equals(ReactWebViewManager.BLANK_URL)) {
                return false;
            }
            ReadableArray readableArray = this.f5665b;
            if (readableArray != null && readableArray.size() > 0) {
                Iterator it = this.f5665b.toArrayList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.startsWith((String) it.next())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                m7221a(webView.getContext(), str);
                return true;
            }
            List<Pattern> list = this.f5666c;
            if (list != null && m7222a(list, str)) {
                return false;
            }
            m7221a(webView.getContext(), str);
            return true;
        }
    }

    public ReactWebViewManager() {
        this.mWebViewConfig = new C1898a(this);
    }

    public ReactWebViewManager(C1905d dVar) {
        this.mWebViewConfig = dVar;
    }

    protected static void dispatchEvent(WebView webView, C1635c cVar) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a(cVar);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, WebView webView) {
        webView.setWebViewClient(new C1897b());
    }

    /* access modifiers changed from: protected */
    public C1895a createReactWebViewInstance(C1578N n) {
        return new C1895a(n);
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public WebView createViewInstance(C1578N n) {
        C1895a createReactWebViewInstance = createReactWebViewInstance(n);
        createReactWebViewInstance.setWebChromeClient(new C1903b(this));
        n.addLifecycleEventListener(createReactWebViewInstance);
        this.mWebViewConfig.mo6792a(createReactWebViewInstance);
        WebSettings settings = createReactWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs(createReactWebViewInstance, false);
        setMixedContentMode(createReactWebViewInstance, "never");
        createReactWebViewInstance.setLayoutParams(new LayoutParams(-1, -1));
        setGeolocationEnabled(createReactWebViewInstance, Boolean.valueOf(false));
        return createReactWebViewInstance;
    }

    public Map<String, Integer> getCommandsMap() {
        return C1397f.m5740a("goBack", Integer.valueOf(1), "goForward", Integer.valueOf(2), "reload", Integer.valueOf(3), "stopLoading", Integer.valueOf(4), "postMessage", Integer.valueOf(5), "injectJavaScript", Integer.valueOf(6));
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public PictureListener getPictureListener() {
        if (this.mPictureListener == null) {
            this.mPictureListener = new C1904c(this);
        }
        return this.mPictureListener;
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        C1895a aVar = (C1895a) webView;
        ((C1578N) webView.getContext()).removeLifecycleEventListener(aVar);
        aVar.mo6776b();
    }

    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    C1895a aVar = (C1895a) webView;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    StringBuilder sb = new StringBuilder();
                    sb.append("(function () {var event;var data = ");
                    sb.append(jSONObject.toString());
                    sb.append(";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    aVar.mo6775a(sb.toString());
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                ((C1895a) webView).mo6775a(readableArray.getString(0));
                return;
            default:
                return;
        }
    }

    @C1595a(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @C1595a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @C1595a(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @C1595a(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @C1595a(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((C1895a) webView).setInjectedJavaScript(str);
    }

    @C1595a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @C1595a(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @C1595a(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((C1895a) webView).setMessagingEnabled(z);
    }

    @C1595a(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        int i;
        WebSettings webSettings;
        if (VERSION.SDK_INT >= 21) {
            if (str == null || "never".equals(str)) {
                webSettings = webView.getSettings();
                i = 1;
            } else if ("always".equals(str)) {
                webSettings = webView.getSettings();
                i = 0;
            } else if ("compatibility".equals(str)) {
                webSettings = webView.getSettings();
                i = 2;
            } else {
                return;
            }
            webSettings.setMixedContentMode(i);
        }
    }

    @C1595a(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        webView.setPictureListener(z ? getPictureListener() : null);
    }

    @C1595a(name = "originWhitelist")
    public void setOriginWhitelist(WebView webView, ReadableArray readableArray) {
        C1897b reactWebViewClient = ((C1895a) webView).getReactWebViewClient();
        if (reactWebViewClient != null && readableArray != null) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < readableArray.size(); i++) {
                linkedList.add(Pattern.compile(readableArray.getString(i)));
            }
            reactWebViewClient.mo6786a((List<Pattern>) linkedList);
        }
    }

    @C1595a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @C1595a(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @C1595a(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            String str = "html";
            boolean hasKey = readableMap.hasKey(str);
            String str2 = HTML_ENCODING;
            if (hasKey) {
                String string = readableMap.getString(str);
                String str3 = "baseUrl";
                if (readableMap.hasKey(str3)) {
                    webView.loadDataWithBaseURL(readableMap.getString(str3), string, HTML_MIME_TYPE, HTML_ENCODING, null);
                } else {
                    webView.loadData(string, HTML_MIME_TYPE, str2);
                }
                return;
            }
            String str4 = "uri";
            if (readableMap.hasKey(str4)) {
                String string2 = readableMap.getString(str4);
                String url = webView.getUrl();
                if (url == null || !url.equals(string2)) {
                    String str5 = "method";
                    if (!readableMap.hasKey(str5) || !readableMap.getString(str5).equalsIgnoreCase(HTTP_METHOD_POST)) {
                        HashMap hashMap = new HashMap();
                        String str6 = "headers";
                        if (readableMap.hasKey(str6)) {
                            ReadableMap map = readableMap.getMap(str6);
                            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                            while (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                if (!"user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                    hashMap.put(nextKey, map.getString(nextKey));
                                } else if (webView.getSettings() != null) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                }
                            }
                        }
                        webView.loadUrl(string2, hashMap);
                        return;
                    }
                    byte[] bArr = null;
                    String str7 = "body";
                    if (readableMap.hasKey(str7)) {
                        String string3 = readableMap.getString(str7);
                        try {
                            bArr = string3.getBytes(str2);
                        } catch (UnsupportedEncodingException unused) {
                            bArr = string3.getBytes();
                        }
                    }
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    webView.postUrl(string2, bArr);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @C1595a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @C1595a(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        C1897b reactWebViewClient = ((C1895a) webView).getReactWebViewClient();
        if (reactWebViewClient != null && readableArray != null) {
            reactWebViewClient.mo6785a(readableArray);
        }
    }

    @C1595a(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    @C1595a(defaultBoolean = true, name = "hardwareAccelerationEnabledExperimental")
    public void sethardwareAccelerationEnabledExperimental(WebView webView, boolean z) {
        if (!z) {
            webView.setLayerType(1, null);
        }
    }
}
