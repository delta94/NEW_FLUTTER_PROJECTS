package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p133e.C2000D;
import p133e.C2014i;
import p133e.C2025t;

/* renamed from: com.facebook.react.modules.network.w */
public class C1531w extends ResponseBody {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ResponseBody f4671a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1527s f4672b;

    /* renamed from: c */
    private C2014i f4673c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f4674d = 0;

    public C1531w(ResponseBody responseBody, C1527s sVar) {
        this.f4671a = responseBody;
        this.f4672b = sVar;
    }

    /* renamed from: b */
    private C2000D m6039b(C2000D d) {
        return new C1530v(this, d);
    }

    public long contentLength() {
        return this.f4671a.contentLength();
    }

    public MediaType contentType() {
        return this.f4671a.contentType();
    }

    /* renamed from: m */
    public long mo5470m() {
        return this.f4674d;
    }

    public C2014i source() {
        if (this.f4673c == null) {
            this.f4673c = C2025t.m7756a(m6039b((C2000D) this.f4671a.source()));
        }
        return this.f4673c;
    }
}
