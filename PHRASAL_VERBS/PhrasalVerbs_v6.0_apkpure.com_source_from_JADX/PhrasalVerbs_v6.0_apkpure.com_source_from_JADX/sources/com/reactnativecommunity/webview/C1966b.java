package com.reactnativecommunity.webview;

import android.app.DownloadManager.Request;
import android.net.Uri;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import com.facebook.react.uimanager.C1578N;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.reactnativecommunity.webview.b */
class C1966b implements DownloadListener {

    /* renamed from: a */
    final /* synthetic */ C1578N f5877a;

    /* renamed from: b */
    final /* synthetic */ RNCWebViewManager f5878b;

    C1966b(RNCWebViewManager rNCWebViewManager, C1578N n) {
        this.f5878b = rNCWebViewManager;
        this.f5877a = n;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        RNCWebViewModule module = RNCWebViewManager.getModule(this.f5877a);
        Request request = new Request(Uri.parse(str));
        String guessFileName = URLUtil.guessFileName(str, str3, str4);
        StringBuilder sb = new StringBuilder();
        sb.append("Downloading ");
        sb.append(guessFileName);
        String sb2 = sb.toString();
        try {
            URL url = new URL(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(url.getProtocol());
            sb3.append("://");
            sb3.append(url.getHost());
            String cookie = CookieManager.getInstance().getCookie(sb3.toString());
            request.addRequestHeader("Cookie", cookie);
            PrintStream printStream = System.out;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Got cookie for DownloadManager: ");
            sb4.append(cookie);
            printStream.println(sb4.toString());
        } catch (MalformedURLException e) {
            PrintStream printStream2 = System.out;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Error getting cookie for DownloadManager: ");
            sb5.append(e.toString());
            printStream2.println(sb5.toString());
            e.printStackTrace();
        }
        request.addRequestHeader("User-Agent", str2);
        request.setTitle(guessFileName);
        request.setDescription(sb2);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
        module.setDownloadRequest(request);
        if (module.grantFileDownloaderPermissions()) {
            module.downloadFile();
        }
    }
}
