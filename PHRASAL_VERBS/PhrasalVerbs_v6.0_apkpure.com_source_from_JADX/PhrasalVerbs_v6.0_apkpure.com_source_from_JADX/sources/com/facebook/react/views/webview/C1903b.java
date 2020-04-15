package com.facebook.react.views.webview;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;

/* renamed from: com.facebook.react.views.webview.b */
class C1903b extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ ReactWebViewManager f5672a;

    C1903b(ReactWebViewManager reactWebViewManager) {
        this.f5672a = reactWebViewManager;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        callback.invoke(str, true, false);
    }
}
