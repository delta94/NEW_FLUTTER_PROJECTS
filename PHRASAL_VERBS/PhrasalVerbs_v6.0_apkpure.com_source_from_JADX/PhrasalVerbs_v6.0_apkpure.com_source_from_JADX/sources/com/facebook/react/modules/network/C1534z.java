package com.facebook.react.modules.network;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import p133e.C2000D;
import p133e.C2013h;
import p133e.C2025t;

/* renamed from: com.facebook.react.modules.network.z */
class C1534z extends RequestBody {

    /* renamed from: a */
    final /* synthetic */ MediaType f4678a;

    /* renamed from: b */
    final /* synthetic */ InputStream f4679b;

    C1534z(MediaType mediaType, InputStream inputStream) {
        this.f4678a = mediaType;
        this.f4679b = inputStream;
    }

    public long contentLength() {
        try {
            return (long) this.f4679b.available();
        } catch (IOException unused) {
            return 0;
        }
    }

    public MediaType contentType() {
        return this.f4678a;
    }

    public void writeTo(C2013h hVar) {
        C2000D d = null;
        try {
            d = C2025t.m7753a(this.f4679b);
            hVar.mo7094a(d);
        } finally {
            Util.closeQuietly((Closeable) d);
        }
    }
}
