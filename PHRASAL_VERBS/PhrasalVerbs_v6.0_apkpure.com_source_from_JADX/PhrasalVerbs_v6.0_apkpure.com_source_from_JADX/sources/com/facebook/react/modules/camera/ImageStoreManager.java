package com.facebook.react.modules.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "ImageStoreManager")
public class ImageStoreManager extends ReactContextBaseJavaModule {
    private static final int BUFFER_SIZE = 8192;

    /* renamed from: com.facebook.react.modules.camera.ImageStoreManager$a */
    private class C1447a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final String f4497a;

        /* renamed from: b */
        private final Callback f4498b;

        /* renamed from: c */
        private final Callback f4499c;

        private C1447a(ReactContext reactContext, String str, Callback callback, Callback callback2) {
            super(reactContext);
            this.f4497a = str;
            this.f4498b = callback;
            this.f4499c = callback2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            InputStream openInputStream;
            try {
                openInputStream = ImageStoreManager.this.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.f4497a));
                try {
                    this.f4498b.invoke(ImageStoreManager.this.convertInputStreamToBase64OutputStream(openInputStream));
                } catch (IOException e) {
                    this.f4499c.invoke(e.getMessage());
                }
                ImageStoreManager.closeQuietly(openInputStream);
            } catch (FileNotFoundException e2) {
                this.f4499c.invoke(e2.getMessage());
            } catch (Throwable th) {
                ImageStoreManager.closeQuietly(openInputStream);
                throw th;
            }
        }
    }

    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public String convertInputStreamToBase64OutputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[BUFFER_SIZE];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    closeQuietly(base64OutputStream);
                    return byteArrayOutputStream.toString();
                }
            } catch (Throwable th) {
                closeQuietly(base64OutputStream);
                throw th;
            }
        }
    }

    @ReactMethod
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        C1447a aVar = new C1447a(getReactApplicationContext(), str, callback, callback2);
        aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public String getName() {
        return "ImageStoreManager";
    }
}
