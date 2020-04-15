package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.network.NetworkingModule.C1505a;
import com.facebook.react.modules.network.NetworkingModule.C1506b;
import com.facebook.react.modules.network.NetworkingModule.C1507c;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.modules.websocket.WebSocketModule.C1563a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p133e.C2015j;

@C1176a(name = "BlobModule")
public class BlobModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "BlobModule";
    private final Map<String, byte[]> mBlobs = new HashMap();
    private final C1505a mNetworkingRequestBodyHandler = new C1441c(this);
    private final C1506b mNetworkingResponseHandler = new C1442d(this);
    private final C1507c mNetworkingUriHandler = new C1440b(this);
    private final C1563a mWebSocketContentHandler = new C1439a(this);

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri) {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("File not found for ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath());
            if (fileExtensionFromUrl != null) {
                type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
        }
        return type == null ? "" : type;
    }

    /* access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
                query.close();
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @ReactMethod
    public void addNetworkingHandler() {
        NetworkingModule networkingModule = (NetworkingModule) getReactApplicationContext().getNativeModule(NetworkingModule.class);
        networkingModule.addUriHandler(this.mNetworkingUriHandler);
        networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
        networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
    }

    @ReactMethod
    public void addWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, this.mWebSocketContentHandler);
    }

    @ReactMethod
    public void createFromParts(ReadableArray readableArray, String str) {
        byte[] bArr;
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String str2 = "type";
            String string = map.getString(str2);
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -891985903) {
                if (hashCode == 3026845 && string.equals("blob")) {
                    c = 0;
                }
            } else if (string.equals("string")) {
                c = 1;
            }
            String str3 = "data";
            if (c == 0) {
                ReadableMap map2 = map.getMap(str3);
                i += map2.getInt("size");
                bArr = resolve(map2);
            } else if (c == 1) {
                bArr = map.getString(str3).getBytes(Charset.forName("UTF-8"));
                i += bArr.length;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid type for blob: ");
                sb.append(map.getString(str2));
                throw new IllegalArgumentException(sb.toString());
            }
            arrayList.add(i2, bArr);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    public Map<String, Object> getConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return C1397f.m5736a("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void release(String str) {
        remove(str);
    }

    public void remove(String str) {
        this.mBlobs.remove(str);
    }

    @ReactMethod
    public void removeWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, null);
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }

    public byte[] resolve(String str, int i, int i2) {
        byte[] bArr = (byte[]) this.mBlobs.get(str);
        if (bArr == null) {
            return null;
        }
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        if (i > 0 || i2 != bArr.length) {
            bArr = Arrays.copyOfRange(bArr, i, i2 + i);
        }
        return bArr;
    }

    @ReactMethod
    public void sendOverSocket(ReadableMap readableMap, int i) {
        byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve != null) {
            getWebSocketModule().sendBinary(C2015j.m7719a(resolve), i);
        } else {
            getWebSocketModule().sendBinary((C2015j) null, i);
        }
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        this.mBlobs.put(str, bArr);
    }
}
