package com.facebook.react.modules.blob;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule.C1507c;

/* renamed from: com.facebook.react.modules.blob.b */
class C1440b implements C1507c {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4473a;

    C1440b(BlobModule blobModule) {
        this.f4473a = blobModule;
    }

    /* renamed from: a */
    public WritableMap mo5292a(Uri uri) {
        byte[] access$000 = this.f4473a.getBytesFromUri(uri);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("blobId", this.f4473a.store(access$000));
        createMap.putInt("offset", 0);
        createMap.putInt("size", access$000.length);
        createMap.putString("type", this.f4473a.getMimeTypeFromUri(uri));
        createMap.putString("name", this.f4473a.getNameFromUri(uri));
        createMap.putDouble("lastModified", (double) this.f4473a.getLastModifiedFromUri(uri));
        return createMap;
    }

    /* renamed from: a */
    public boolean mo5293a(Uri uri, String str) {
        String scheme = uri.getScheme();
        return !("http".equals(scheme) || "https".equals(scheme)) && "blob".equals(str);
    }
}
