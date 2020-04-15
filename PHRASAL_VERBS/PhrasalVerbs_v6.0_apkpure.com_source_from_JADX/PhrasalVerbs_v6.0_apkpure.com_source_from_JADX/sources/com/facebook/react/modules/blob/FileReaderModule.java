package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "FileReaderModule")
public class FileReaderModule extends ReactContextBaseJavaModule {
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";
    protected static final String NAME = "FileReaderModule";

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private BlobModule getBlobModule() {
        return (BlobModule) getReactApplicationContext().getNativeModule(BlobModule.class);
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void readAsDataURL(ReadableMap readableMap, Promise promise) {
        String str = "type";
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("data:");
            sb.append((!readableMap.hasKey(str) || readableMap.getString(str).isEmpty()) ? "application/octet-stream" : readableMap.getString(str));
            sb.append(";base64,");
            sb.append(Base64.encodeToString(resolve, 2));
            promise.resolve(sb.toString());
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }

    @ReactMethod
    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            promise.resolve(new String(resolve, str));
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }
}
