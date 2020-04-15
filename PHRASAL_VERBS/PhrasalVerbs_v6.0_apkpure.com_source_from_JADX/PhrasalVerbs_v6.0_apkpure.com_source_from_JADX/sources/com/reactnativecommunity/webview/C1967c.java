package com.reactnativecommunity.webview;

import android.os.Build.VERSION;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.reactnativecommunity.webview.c */
class C1967c extends C1949a {

    /* renamed from: f */
    final /* synthetic */ RNCWebViewManager f5879f;

    C1967c(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView) {
        this.f5879f = rNCWebViewManager;
        super(reactContext, webView);
    }

    public void onHideCustomView() {
        View view = this.f5852d;
        if (view != null) {
            view.setVisibility(8);
            mo6935a().removeView(this.f5852d);
            this.f5853e.onCustomViewHidden();
            this.f5852d = null;
            this.f5853e = null;
            this.f5851c.setVisibility(0);
            if (VERSION.SDK_INT >= 19) {
                this.f5850b.getCurrentActivity().getWindow().clearFlags(512);
            }
            this.f5850b.removeLifecycleEventListener(this);
        }
    }

    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        if (this.f5852d != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        this.f5852d = view;
        this.f5853e = customViewCallback;
        if (VERSION.SDK_INT >= 19) {
            this.f5852d.setSystemUiVisibility(7942);
            this.f5850b.getCurrentActivity().getWindow().setFlags(512, 512);
        }
        this.f5852d.setBackgroundColor(-16777216);
        mo6935a().addView(this.f5852d, C1949a.f5849a);
        this.f5851c.setVisibility(8);
        this.f5850b.addLifecycleEventListener(this);
    }
}
