package com.facebook.react.modules.network;

import java.io.OutputStream;

/* renamed from: com.facebook.react.modules.network.t */
class C1528t extends C1509b {

    /* renamed from: b */
    final /* synthetic */ C1529u f4666b;

    C1528t(C1529u uVar, OutputStream outputStream) {
        this.f4666b = uVar;
        super(outputStream);
    }

    /* renamed from: m */
    private void m6034m() {
        long count = getCount();
        long contentLength = this.f4666b.contentLength();
        this.f4666b.f4668b.mo5460a(count, contentLength, count == contentLength);
    }

    public void write(int i) {
        super.write(i);
        m6034m();
    }

    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        m6034m();
    }
}
