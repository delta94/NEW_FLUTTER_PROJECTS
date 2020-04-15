package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.imagepipeline.nativecode.C1296a;
import java.io.Closeable;
import p032c.p033a.p038c.p042d.C0710d;
import p032c.p033a.p038c.p042d.C0718j;

@C0710d
public class NativeMemoryChunk implements Closeable {

    /* renamed from: a */
    private final long f4142a;

    /* renamed from: b */
    private final int f4143b;

    /* renamed from: c */
    private boolean f4144c;

    static {
        C1296a.m5607a();
    }

    public NativeMemoryChunk() {
        this.f4143b = 0;
        this.f4142a = 0;
        this.f4144c = true;
    }

    public NativeMemoryChunk(int i) {
        C0718j.m3243a(i > 0);
        this.f4143b = i;
        this.f4142a = nativeAllocate(this.f4143b);
        this.f4144c = false;
    }

    /* renamed from: a */
    private int m5448a(int i, int i2) {
        return Math.min(Math.max(0, this.f4143b - i), i2);
    }

    /* renamed from: a */
    private void m5449a(int i, int i2, int i3, int i4) {
        boolean z = true;
        C0718j.m3243a(i4 >= 0);
        C0718j.m3243a(i >= 0);
        C0718j.m3243a(i3 >= 0);
        C0718j.m3243a(i + i4 <= this.f4143b);
        if (i3 + i4 > i2) {
            z = false;
        }
        C0718j.m3243a(z);
    }

    /* renamed from: b */
    private void m5450b(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        C0718j.m3247b(!isClosed());
        C0718j.m3247b(!nativeMemoryChunk.isClosed());
        m5449a(i, nativeMemoryChunk.f4143b, i2, i3);
        nativeMemcpy(nativeMemoryChunk.f4142a + ((long) i2), this.f4142a + ((long) i), i3);
    }

    @C0710d
    private static native long nativeAllocate(int i);

    @C0710d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @C0710d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @C0710d
    private static native void nativeFree(long j);

    @C0710d
    private static native void nativeMemcpy(long j, long j2, int i);

    @C0710d
    private static native byte nativeReadByte(long j);

    /* renamed from: a */
    public synchronized byte mo4709a(int i) {
        boolean z = true;
        C0718j.m3247b(!isClosed());
        C0718j.m3243a(i >= 0);
        if (i >= this.f4143b) {
            z = false;
        }
        C0718j.m3243a(z);
        return nativeReadByte(this.f4142a + ((long) i));
    }

    /* renamed from: a */
    public synchronized int mo4710a(int i, byte[] bArr, int i2, int i3) {
        int a;
        C0718j.m3240a(bArr);
        C0718j.m3247b(!isClosed());
        a = m5448a(i, i3);
        m5449a(i, bArr.length, i2, a);
        nativeCopyToByteArray(this.f4142a + ((long) i), bArr, i2, a);
        return a;
    }

    /* renamed from: a */
    public void mo4711a(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        C0718j.m3240a(nativeMemoryChunk);
        if (nativeMemoryChunk.f4142a == this.f4142a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Copying from NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" to NativeMemoryChunk ");
            sb.append(Integer.toHexString(System.identityHashCode(nativeMemoryChunk)));
            sb.append(" which share the same address ");
            sb.append(Long.toHexString(this.f4142a));
            Log.w("NativeMemoryChunk", sb.toString());
            C0718j.m3243a(false);
        }
        if (nativeMemoryChunk.f4142a < this.f4142a) {
            synchronized (nativeMemoryChunk) {
                synchronized (this) {
                    m5450b(i, nativeMemoryChunk, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (nativeMemoryChunk) {
                m5450b(i, nativeMemoryChunk, i2, i3);
            }
        }
    }

    /* renamed from: b */
    public synchronized int mo4712b(int i, byte[] bArr, int i2, int i3) {
        int a;
        C0718j.m3240a(bArr);
        C0718j.m3247b(!isClosed());
        a = m5448a(i, i3);
        m5449a(i, bArr.length, i2, a);
        nativeCopyFromByteArray(this.f4142a + ((long) i), bArr, i2, a);
        return a;
    }

    public synchronized void close() {
        if (!this.f4144c) {
            this.f4144c = true;
            nativeFree(this.f4142a);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!isClosed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("finalize: Chunk ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" still active. Underlying address = ");
            sb.append(Long.toHexString(this.f4142a));
            Log.w("NativeMemoryChunk", sb.toString());
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public synchronized boolean isClosed() {
        return this.f4144c;
    }

    /* renamed from: m */
    public int mo4716m() {
        return this.f4143b;
    }
}
