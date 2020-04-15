package p133e;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: e.h */
public interface C2013h extends C1999C, WritableByteChannel {
    /* renamed from: a */
    long mo7094a(C2000D d);

    /* renamed from: a */
    C2011g mo7097a();

    /* renamed from: a */
    C2013h mo7099a(C2015j jVar);

    /* renamed from: a */
    C2013h mo7100a(String str);

    /* renamed from: b */
    C2013h mo7112b();

    /* renamed from: c */
    C2013h mo7116c(long j);

    /* renamed from: e */
    C2013h mo7121e();

    void flush();

    /* renamed from: g */
    C2013h mo7126g(long j);

    /* renamed from: j */
    OutputStream mo7134j();

    C2013h write(byte[] bArr);

    C2013h write(byte[] bArr, int i, int i2);

    C2013h writeByte(int i);

    C2013h writeInt(int i);

    C2013h writeShort(int i);
}
