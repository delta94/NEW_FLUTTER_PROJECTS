package com.facebook.react.modules.network;

import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p133e.C1999C;
import p133e.C2013h;
import p133e.C2025t;

/* renamed from: com.facebook.react.modules.network.u */
public class C1529u extends RequestBody {

    /* renamed from: a */
    private final RequestBody f4667a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1527s f4668b;

    /* renamed from: c */
    private long f4669c = 0;

    public C1529u(RequestBody requestBody, C1527s sVar) {
        this.f4667a = requestBody;
        this.f4668b = sVar;
    }

    /* renamed from: a */
    private C1999C m6036a(C2013h hVar) {
        return C2025t.m7750a((OutputStream) new C1528t(this, hVar.mo7134j()));
    }

    public long contentLength() {
        if (this.f4669c == 0) {
            this.f4669c = this.f4667a.contentLength();
        }
        return this.f4669c;
    }

    public MediaType contentType() {
        return this.f4667a.contentType();
    }

    public void writeTo(C2013h hVar) {
        C2013h a = C2025t.m7755a(m6036a(hVar));
        contentLength();
        this.f4667a.writeTo(a);
        a.flush();
    }
}
