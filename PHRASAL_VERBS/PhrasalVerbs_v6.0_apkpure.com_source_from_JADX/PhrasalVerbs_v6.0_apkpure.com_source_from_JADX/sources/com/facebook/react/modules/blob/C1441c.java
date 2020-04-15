package com.facebook.react.modules.blob;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.network.NetworkingModule.C1505a;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: com.facebook.react.modules.blob.c */
class C1441c implements C1505a {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4474a;

    C1441c(BlobModule blobModule) {
        this.f4474a = blobModule;
    }

    /* renamed from: a */
    public RequestBody mo5294a(ReadableMap readableMap, String str) {
        String str2 = "type";
        if (readableMap.hasKey(str2) && !readableMap.getString(str2).isEmpty()) {
            str = readableMap.getString(str2);
        }
        if (str == null) {
            str = "application/octet-stream";
        }
        ReadableMap map = readableMap.getMap("blob");
        return RequestBody.create(MediaType.parse(str), this.f4474a.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size")));
    }

    /* renamed from: a */
    public boolean mo5295a(ReadableMap readableMap) {
        return readableMap.hasKey("blob");
    }
}
