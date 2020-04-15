package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.react.modules.network.b */
public class C1509b extends FilterOutputStream {

    /* renamed from: a */
    private long f4628a = 0;

    public C1509b(OutputStream outputStream) {
        super(outputStream);
    }

    public void close() {
        this.out.close();
    }

    public long getCount() {
        return this.f4628a;
    }

    public void write(int i) {
        this.out.write(i);
        this.f4628a++;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f4628a += (long) i2;
    }
}
