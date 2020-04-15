package com.facebook.react.modules.blob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule.C1506b;
import okhttp3.ResponseBody;

/* renamed from: com.facebook.react.modules.blob.d */
class C1442d implements C1506b {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4475a;

    C1442d(BlobModule blobModule) {
        this.f4475a = blobModule;
    }

    /* renamed from: a */
    public WritableMap mo5296a(ResponseBody responseBody) {
        byte[] bytes = responseBody.bytes();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("blobId", this.f4475a.store(bytes));
        createMap.putInt("offset", 0);
        createMap.putInt("size", bytes.length);
        return createMap;
    }

    /* renamed from: a */
    public boolean mo5297a(String str) {
        return "blob".equals(str);
    }
}
