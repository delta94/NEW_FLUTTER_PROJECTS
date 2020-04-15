package p133e;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: e.w */
final class C2030w implements C2013h {

    /* renamed from: a */
    public final C2011g f5968a = new C2011g();

    /* renamed from: b */
    public final C1999C f5969b;

    /* renamed from: c */
    boolean f5970c;

    C2030w(C1999C c) {
        if (c != null) {
            this.f5969b = c;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: a */
    public long mo7094a(C2000D d) {
        if (d != null) {
            long j = 0;
            while (true) {
                long read = d.read(this.f5968a, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
                mo7121e();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: a */
    public C2011g mo7097a() {
        return this.f5968a;
    }

    /* renamed from: a */
    public C2013h mo7099a(C2015j jVar) {
        if (!this.f5970c) {
            this.f5968a.mo7099a(jVar);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public C2013h mo7100a(String str) {
        if (!this.f5970c) {
            this.f5968a.mo7100a(str);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public C2013h mo7112b() {
        if (!this.f5970c) {
            long size = this.f5968a.size();
            if (size > 0) {
                this.f5969b.write(this.f5968a, size);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public C2013h mo7116c(long j) {
        if (!this.f5970c) {
            this.f5968a.mo7116c(j);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void close() {
        if (!this.f5970c) {
            try {
                if (this.f5968a.f5928c > 0) {
                    this.f5969b.write(this.f5968a, this.f5968a.f5928c);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f5969b.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f5970c = true;
            if (th != null) {
                C2003G.m7626a(th);
                throw null;
            }
        }
    }

    /* renamed from: e */
    public C2013h mo7121e() {
        if (!this.f5970c) {
            long n = this.f5968a.mo7140n();
            if (n > 0) {
                this.f5969b.write(this.f5968a, n);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() {
        if (!this.f5970c) {
            C2011g gVar = this.f5968a;
            long j = gVar.f5928c;
            if (j > 0) {
                this.f5969b.write(gVar, j);
            }
            this.f5969b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: g */
    public C2013h mo7126g(long j) {
        if (!this.f5970c) {
            this.f5968a.mo7126g(j);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f5970c;
    }

    /* renamed from: j */
    public OutputStream mo7134j() {
        return new C2029v(this);
    }

    public C2002F timeout() {
        return this.f5969b.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f5969b);
        sb.append(")");
        return sb.toString();
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.f5970c) {
            int write = this.f5968a.write(byteBuffer);
            mo7121e();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public C2013h write(byte[] bArr) {
        if (!this.f5970c) {
            this.f5968a.write(bArr);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C2013h write(byte[] bArr, int i, int i2) {
        if (!this.f5970c) {
            this.f5968a.write(bArr, i, i2);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void write(C2011g gVar, long j) {
        if (!this.f5970c) {
            this.f5968a.write(gVar, j);
            mo7121e();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public C2013h writeByte(int i) {
        if (!this.f5970c) {
            this.f5968a.writeByte(i);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C2013h writeInt(int i) {
        if (!this.f5970c) {
            this.f5968a.writeInt(i);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public C2013h writeShort(int i) {
        if (!this.f5970c) {
            this.f5968a.writeShort(i);
            mo7121e();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
