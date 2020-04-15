package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.C1462e;
import com.facebook.react.modules.core.C1463f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p010a.C0055b;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RNCWebView")
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    final String DEFAULT_MIME_TYPES = "*/*";
    /* access modifiers changed from: private */
    public Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri outputFileUri;
    private C1463f webviewFileDownloaderPermissionListener = new C1968d(this);

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, "image").booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(isArrayEmpty(acceptedMimeType).booleanValue() || arrayContainsString(acceptedMimeType, "video").booleanValue());
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String contains : strArr) {
            if (contains.contains(str)) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                strArr2[i] = getMimeTypeFromExtension(str.replace(".", ""));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private File getCapturedFile(String str) {
        String str2;
        String str3;
        String str4 = "";
        if (str.equals("android.media.action.IMAGE_CAPTURE")) {
            str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image-";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            str4 = Environment.DIRECTORY_MOVIES;
            str2 = "video-";
            str3 = ".mp4";
        } else {
            str2 = str4;
            str3 = str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(String.valueOf(System.currentTimeMillis()));
        sb.append(str3);
        String sb2 = sb.toString();
        return VERSION.SDK_INT < 23 ? new File(Environment.getExternalStoragePublicDirectory(str4), sb2) : File.createTempFile(sb2, str3, getReactApplicationContext().getExternalFilesDir(null));
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e) {
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            file = null;
        }
        if (VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".fileprovider");
        return C0055b.m174a(reactApplicationContext, sb.toString(), file);
    }

    private C1462e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof C1462e) {
            return (C1462e) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    private Intent getPhotoIntent() {
        String str = "android.media.action.IMAGE_CAPTURE";
        Intent intent = new Intent(str);
        this.outputFileUri = getOutputUri(str);
        intent.putExtra("output", this.outputFileUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        Uri[] uriArr = null;
        if (intent == null) {
            return null;
        }
        if (intent.getData() == null) {
            if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                uriArr = new Uri[itemCount];
                for (int i2 = 0; i2 < itemCount; i2++) {
                    uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
                }
            }
            return uriArr;
        } else if (i != -1 || VERSION.SDK_INT < 21) {
            return null;
        } else {
            return FileChooserParams.parseResult(i, intent);
        }
    }

    private Intent getVideoIntent() {
        String str = "android.media.action.VIDEO_CAPTURE";
        Intent intent = new Intent(str);
        intent.putExtra("output", getOutputUri(str));
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
        Toast.makeText(getCurrentActivity().getApplicationContext(), "Downloading", 1).show();
    }

    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions() {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        boolean z = C0039a.m106a((Context) getCurrentActivity(), str) == 0;
        if (!z) {
            getPermissionAwareActivity().mo4573a(new String[]{str}, 1, this.webviewFileDownloaderPermissionListener);
        }
        return z;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        Boolean valueOf = Boolean.valueOf(false);
        int i = VERSION.SDK_INT;
        Boolean valueOf2 = Boolean.valueOf(true);
        if (i >= 21) {
            valueOf = valueOf2;
        }
        if (i >= 16 && i <= 18) {
            valueOf = valueOf2;
        }
        promise.resolve(valueOf);
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Object selectedFiles;
        ValueCallback valueCallback;
        if (this.filePathCallback != null || this.filePathCallbackLegacy != null) {
            if (i != 1) {
                if (i == 3) {
                    selectedFiles = i2 != -1 ? null : intent == null ? this.outputFileUri : intent.getData();
                    valueCallback = this.filePathCallbackLegacy;
                }
                this.filePathCallback = null;
                this.filePathCallbackLegacy = null;
                this.outputFileUri = null;
            }
            if (i2 != -1) {
                ValueCallback<Uri[]> valueCallback2 = this.filePathCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
            } else {
                selectedFiles = getSelectedFiles(intent, i2);
                if (selectedFiles != null) {
                    valueCallback = this.filePathCallback;
                } else {
                    this.filePathCallback.onReceiveValue(new Uri[]{this.outputFileUri});
                }
            }
            this.filePathCallback = null;
            this.filePathCallbackLegacy = null;
            this.outputFileUri = null;
            valueCallback.onReceiveValue(selectedFiles);
            this.filePathCallback = null;
            this.filePathCallbackLegacy = null;
            this.outputFileUri = null;
        }
    }

    public void onNewIntent(Intent intent) {
    }

    public void setDownloadRequest(Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(str).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr, boolean z) {
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(strArr).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(strArr).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent2.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent2, 1);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
        return true;
    }
}
