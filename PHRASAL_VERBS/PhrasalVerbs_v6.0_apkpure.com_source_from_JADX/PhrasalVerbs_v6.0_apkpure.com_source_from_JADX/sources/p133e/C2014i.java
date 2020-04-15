package p133e;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: e.i */
public interface C2014i extends C2000D, ReadableByteChannel {
    /* renamed from: a */
    long mo7092a(byte b);

    /* renamed from: a */
    C2011g mo7097a();

    /* renamed from: a */
    C2015j mo7105a(long j);

    /* renamed from: a */
    String mo7107a(Charset charset);

    /* renamed from: a */
    void mo7108a(C2011g gVar, long j);

    /* renamed from: a */
    boolean mo7109a(long j, C2015j jVar);

    /* renamed from: b */
    String mo7114b(long j);

    /* renamed from: c */
    byte[] mo7117c();

    /* renamed from: d */
    boolean mo7119d();

    /* renamed from: d */
    boolean mo7120d(long j);

    /* renamed from: e */
    byte[] mo7122e(long j);

    /* renamed from: f */
    long mo7124f();

    /* renamed from: f */
    void mo7125f(long j);

    /* renamed from: g */
    String mo7127g();

    /* renamed from: h */
    int mo7129h();

    /* renamed from: i */
    short mo7132i();

    /* renamed from: k */
    long mo7136k();

    /* renamed from: l */
    InputStream mo7138l();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);
}
