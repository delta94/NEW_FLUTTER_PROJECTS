package p032c.p033a.p038c.p045g;

import java.io.Closeable;

/* renamed from: c.a.c.g.g */
public interface C0737g extends Closeable {

    /* renamed from: c.a.c.g.g$a */
    public static class C0738a extends RuntimeException {
        public C0738a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: a */
    byte mo3494a(int i);

    /* renamed from: a */
    int mo3495a(int i, byte[] bArr, int i2, int i3);

    boolean isClosed();

    int size();
}
