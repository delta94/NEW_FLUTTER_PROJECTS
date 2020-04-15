package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
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
import com.facebook.react.uimanager.events.C1634b;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.views.scroll.C1778b;
import com.facebook.react.views.scroll.C1789j;
import com.facebook.react.views.scroll.C1791l;
import com.reactnativecommunity.webview.p129a.C1954a;
import com.reactnativecommunity.webview.p129a.C1956b;
import com.reactnativecommunity.webview.p129a.C1958c;
import com.reactnativecommunity.webview.p129a.C1960d;
import com.reactnativecommunity.webview.p129a.C1962e;
import com.reactnativecommunity.webview.p129a.C1964f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RNCWebView")
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebView";
    protected boolean mAllowsFullscreenVideo;
    protected C1949a mWebChromeClient;
    protected C1970f mWebViewConfig;

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$a */
    protected static class C1949a extends WebChromeClient implements LifecycleEventListener {

        /* renamed from: a */
        protected static final LayoutParams f5849a = new LayoutParams(-1, -1, 17);

        /* renamed from: b */
        protected ReactContext f5850b;

        /* renamed from: c */
        protected View f5851c;

        /* renamed from: d */
        protected View f5852d;

        /* renamed from: e */
        protected CustomViewCallback f5853e;

        public C1949a(ReactContext reactContext, WebView webView) {
            this.f5850b = reactContext;
            this.f5851c = webView;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ViewGroup mo6935a() {
            return (ViewGroup) this.f5850b.getCurrentActivity().findViewById(16908290);
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            callback.invoke(str, true, false);
        }

        public void onHostDestroy() {
        }

        public void onHostPause() {
        }

        public void onHostResume() {
            if (VERSION.SDK_INT >= 19) {
                View view = this.f5852d;
                if (view != null && view.getSystemUiVisibility() != 7942) {
                    this.f5852d.setSystemUiVisibility(7942);
                }
            }
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) webView.getId());
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            createMap.putDouble("progress", (double) (((float) i) / 100.0f));
            RNCWebViewManager.dispatchEvent(webView, new C1958c(webView.getId(), createMap));
        }

        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            boolean z = true;
            if (fileChooserParams.getMode() != 1) {
                z = false;
            }
            return RNCWebViewManager.getModule(this.f5850b).startPhotoPickerIntent(valueCallback, fileChooserParams.createIntent(), acceptTypes, z);
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$b */
    protected static class C1950b extends WebView implements LifecycleEventListener {

        /* renamed from: a */
        protected String f5854a;

        /* renamed from: b */
        protected boolean f5855b = false;

        /* renamed from: c */
        protected C1952c f5856c;

        /* renamed from: d */
        protected boolean f5857d = false;

        /* renamed from: e */
        private C1778b f5858e;

        /* renamed from: f */
        protected boolean f5859f = false;

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$b$a */
        protected class C1951a {

            /* renamed from: a */
            C1950b f5860a;

            C1951a(C1950b bVar) {
                this.f5860a = bVar;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f5860a.mo6944b(str);
            }
        }

        public C1950b(C1578N n) {
            super(n);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1951a mo6940a(C1950b bVar) {
            return new C1951a(bVar);
        }

        /* renamed from: a */
        public void mo6941a() {
            if (getSettings().getJavaScriptEnabled()) {
                String str = this.f5854a;
                if (str != null && !TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(function() {\n");
                    sb.append(this.f5854a);
                    sb.append(";\n})();");
                    mo6942a(sb.toString());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6942a(String str) {
            if (VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("javascript:");
                sb.append(URLEncoder.encode(str, RNCWebViewManager.HTML_ENCODING));
                loadUrl(sb.toString());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6943b() {
            setWebViewClient(null);
            destroy();
        }

        /* renamed from: b */
        public void mo6944b(String str) {
            RNCWebViewManager.dispatchEvent(this, new C1962e(getId(), str));
        }

        public C1952c getRNCWebViewClient() {
            return this.f5856c;
        }

        public void onHostDestroy() {
            mo6943b();
        }

        public void onHostPause() {
        }

        public void onHostResume() {
        }

        /* access modifiers changed from: protected */
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.f5859f) {
                if (this.f5858e == null) {
                    this.f5858e = new C1778b();
                }
                if (this.f5858e.mo6232a(i, i2)) {
                    RNCWebViewManager.dispatchEvent(this, C1789j.m6857a(getId(), C1791l.SCROLL, i, i2, this.f5858e.mo6231a(), this.f5858e.mo6233b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.f5857d) {
                RNCWebViewManager.dispatchEvent(this, new C1634b(getId(), i, i2));
            }
        }

        public void setHasScrollEvent(boolean z) {
            this.f5859f = z;
        }

        public void setInjectedJavaScript(String str) {
            this.f5854a = str;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.f5855b != z) {
                this.f5855b = z;
                String str = RNCWebViewManager.JAVASCRIPT_INTERFACE;
                if (z) {
                    addJavascriptInterface(mo6940a(this), str);
                } else {
                    removeJavascriptInterface(str);
                }
            }
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.f5857d = z;
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f5856c = (C1952c) webViewClient;
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$c */
    protected static class C1952c extends WebViewClient {

        /* renamed from: a */
        protected boolean f5862a = false;

        /* renamed from: b */
        protected ReadableArray f5863b;

        protected C1952c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public WritableMap mo6954a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", !this.f5862a && webView.getProgress() != 100);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        /* renamed from: a */
        public void mo6955a(ReadableArray readableArray) {
            this.f5863b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6956b(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new C1956b(webView.getId(), mo6954a(webView, str)));
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f5862a) {
                ((C1950b) webView).mo6941a();
                mo6956b(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f5862a = false;
            RNCWebViewManager.dispatchEvent(webView, new C1960d(webView.getId(), mo6954a(webView, str)));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f5862a = true;
            mo6956b(webView, str2);
            WritableMap a = mo6954a(webView, str2);
            a.putDouble("code", (double) i);
            a.putString("description", str);
            RNCWebViewManager.dispatchEvent(webView, new C1954a(webView.getId(), a));
        }

        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new C1964f(webView.getId(), mo6954a(webView, str)));
            return true;
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mWebViewConfig = new C1953a(this);
    }

    public RNCWebViewManager(C1970f fVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mWebViewConfig = fVar;
    }

    protected static void dispatchEvent(WebView webView, C1635c cVar) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a(cVar);
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, WebView webView) {
        webView.setWebViewClient(new C1952c());
    }

    /* access modifiers changed from: protected */
    public C1950b createRNCWebViewInstance(C1578N n) {
        return new C1950b(n);
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public WebView createViewInstance(C1578N n) {
        C1950b createRNCWebViewInstance = createRNCWebViewInstance(n);
        setupWebChromeClient(n, createRNCWebViewInstance);
        n.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.mo6968a(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, "never");
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new C1966b(this, n));
        return createRNCWebViewInstance;
    }

    public Map<String, Integer> getCommandsMap() {
        return C1397f.m5741a("goBack", Integer.valueOf(1), "goForward", Integer.valueOf(2), "reload", Integer.valueOf(3), "stopLoading", Integer.valueOf(4), "postMessage", Integer.valueOf(5), "injectJavaScript", Integer.valueOf(6), "loadUrl", Integer.valueOf(7));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = C1397f.m5742b();
        }
        String str = "registrationName";
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", C1397f.m5735a(str, "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", C1397f.m5735a(str, "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(C1791l.m6865a(C1791l.SCROLL), C1397f.m5735a(str, "onScroll"));
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return "RNCWebView";
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        C1950b bVar = (C1950b) webView;
        ((C1578N) webView.getContext()).removeLifecycleEventListener(bVar);
        bVar.mo6943b();
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
                    C1950b bVar = (C1950b) webView;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    StringBuilder sb = new StringBuilder();
                    sb.append("(function () {var event;var data = ");
                    sb.append(jSONObject.toString());
                    sb.append(";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    bVar.mo6942a(sb.toString());
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                ((C1950b) webView).mo6942a(readableArray.getString(0));
                return;
            case 7:
                if (readableArray != null) {
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                throw new RuntimeException("Arguments for loading an url are null!");
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

    @C1595a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @C1595a(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z) {
        boolean z2;
        WebSettings webSettings;
        if (z) {
            Context context = webView.getContext();
            if (context != null) {
                webView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
                webView.getSettings().setCacheMode(-1);
                webSettings = webView.getSettings();
                z2 = true;
            } else {
                return;
            }
        } else {
            webView.getSettings().setCacheMode(2);
            webSettings = webView.getSettings();
            z2 = false;
        }
        webSettings.setAppCacheEnabled(z2);
    }

    @C1595a(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @C1595a(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @C1595a(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z) {
        webView.setLayerType(z ? 1 : 0, null);
    }

    @C1595a(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((C1950b) webView).setInjectedJavaScript(str);
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
        ((C1950b) webView).setMessagingEnabled(z);
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
        ((C1950b) webView).setSendContentSizeChangeEvents(z);
    }

    @C1595a(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z) {
        ((C1950b) webView).setHasScrollEvent(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    @com.facebook.react.uimanager.p121a.C1595a(name = "overScrollMode")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverScrollMode(android.webkit.WebView r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r7.hashCode()
            r1 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r0 == r1) goto L_0x0021
            r1 = 951530617(0x38b73479, float:8.735894E-5)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "content"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "never"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "always"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 2
            goto L_0x0036
        L_0x0035:
            r7 = -1
        L_0x0036:
            if (r7 == 0) goto L_0x0044
            if (r7 == r4) goto L_0x003f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            goto L_0x0048
        L_0x003f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            goto L_0x0048
        L_0x0044:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
        L_0x0048:
            int r7 = r7.intValue()
            r6.setOverScrollMode(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewManager.setOverScrollMode(android.webkit.WebView, java.lang.String):void");
    }

    @C1595a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @C1595a(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @C1595a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z) {
        webView.setHorizontalScrollBarEnabled(z);
    }

    @C1595a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z) {
        webView.setVerticalScrollBarEnabled(z);
    }

    @C1595a(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            String str = "html";
            if (readableMap.hasKey(str)) {
                String string = readableMap.getString(str);
                String str2 = "baseUrl";
                webView.loadDataWithBaseURL(readableMap.hasKey(str2) ? readableMap.getString(str2) : "", string, HTML_MIME_TYPE, HTML_ENCODING, null);
                return;
            }
            String str3 = "uri";
            if (readableMap.hasKey(str3)) {
                String string2 = readableMap.getString(str3);
                String url = webView.getUrl();
                if (url == null || !url.equals(string2)) {
                    String str4 = "method";
                    if (!readableMap.hasKey(str4) || !readableMap.getString(str4).equalsIgnoreCase(HTTP_METHOD_POST)) {
                        HashMap hashMap = new HashMap();
                        String str5 = "headers";
                        if (readableMap.hasKey(str5)) {
                            ReadableMap map = readableMap.getMap(str5);
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
                    String str6 = "body";
                    if (readableMap.hasKey(str6)) {
                        String string3 = readableMap.getString(str6);
                        try {
                            bArr = string3.getBytes(HTML_ENCODING);
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

    @C1595a(name = "textZoom")
    public void setTextZoom(WebView webView, int i) {
        webView.getSettings().setTextZoom(i);
    }

    @C1595a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @C1595a(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        C1952c rNCWebViewClient = ((C1950b) webView).getRNCWebViewClient();
        if (rNCWebViewClient != null && readableArray != null) {
            rNCWebViewClient.mo6955a(readableArray);
        }
    }

    @C1595a(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    /* access modifiers changed from: protected */
    public void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        C1949a aVar;
        if (this.mAllowsFullscreenVideo) {
            aVar = new C1967c(this, reactContext, webView);
        } else {
            C1949a aVar2 = this.mWebChromeClient;
            if (aVar2 != null) {
                aVar2.onHideCustomView();
            }
            aVar = new C1949a(reactContext, webView);
        }
        this.mWebChromeClient = aVar;
        webView.setWebChromeClient(this.mWebChromeClient);
    }
}
