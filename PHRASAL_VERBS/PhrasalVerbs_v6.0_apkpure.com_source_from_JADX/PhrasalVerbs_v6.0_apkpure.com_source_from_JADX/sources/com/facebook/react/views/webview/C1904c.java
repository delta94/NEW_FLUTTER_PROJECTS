package com.facebook.react.views.webview;

import android.graphics.Picture;
import android.webkit.WebView;
import android.webkit.WebView.PictureListener;
import com.facebook.react.uimanager.events.C1634b;

/* renamed from: com.facebook.react.views.webview.c */
class C1904c implements PictureListener {

    /* renamed from: a */
    final /* synthetic */ ReactWebViewManager f5673a;

    C1904c(ReactWebViewManager reactWebViewManager) {
        this.f5673a = reactWebViewManager;
    }

    public void onNewPicture(WebView webView, Picture picture) {
        ReactWebViewManager.dispatchEvent(webView, new C1634b(webView.getId(), webView.getWidth(), webView.getContentHeight()));
    }
}
