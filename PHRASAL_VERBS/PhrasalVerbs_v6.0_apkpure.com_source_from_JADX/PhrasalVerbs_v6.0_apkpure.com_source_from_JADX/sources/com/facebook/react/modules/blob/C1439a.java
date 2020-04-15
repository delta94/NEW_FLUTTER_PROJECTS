package com.facebook.react.modules.blob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.websocket.WebSocketModule.C1563a;
import p133e.C2015j;

/* renamed from: com.facebook.react.modules.blob.a */
class C1439a implements C1563a {

    /* renamed from: a */
    final /* synthetic */ BlobModule f4472a;

    C1439a(BlobModule blobModule) {
        this.f4472a = blobModule;
    }

    /* renamed from: a */
    public void mo5290a(C2015j jVar, WritableMap writableMap) {
        byte[] i = jVar.mo7051i();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("blobId", this.f4472a.store(i));
        createMap.putInt("offset", 0);
        createMap.putInt("size", i.length);
        writableMap.putMap("data", createMap);
        writableMap.putString("type", "blob");
    }

    /* renamed from: a */
    public void mo5291a(String str, WritableMap writableMap) {
        writableMap.putString("data", str);
    }
}
