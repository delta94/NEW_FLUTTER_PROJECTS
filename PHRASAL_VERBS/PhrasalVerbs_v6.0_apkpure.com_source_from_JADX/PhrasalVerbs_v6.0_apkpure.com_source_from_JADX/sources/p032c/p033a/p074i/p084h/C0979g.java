package p032c.p033a.p074i.p084h;

import java.io.IOException;
import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0708b;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0726r;
import p032c.p033a.p038c.p045g.C0731a;
import p032c.p033a.p038c.p045g.C0736f;
import p032c.p033a.p038c.p049k.C0756d;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.h.g */
public class C0979g {

    /* renamed from: a */
    private int f3432a = 0;

    /* renamed from: b */
    private int f3433b = 0;

    /* renamed from: c */
    private int f3434c = 0;

    /* renamed from: d */
    private int f3435d = 0;

    /* renamed from: e */
    private int f3436e = 0;

    /* renamed from: f */
    private int f3437f = 0;

    /* renamed from: g */
    private boolean f3438g;

    /* renamed from: h */
    private final C0731a f3439h;

    public C0979g(C0731a aVar) {
        C0718j.m3240a(aVar);
        this.f3439h = aVar;
    }

    /* renamed from: a */
    private static boolean m4376a(int i) {
        boolean z = true;
        if (i == 1) {
            return false;
        }
        if (i >= 208 && i <= 215) {
            return false;
        }
        if (i == 217 || i == 216) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m4377a(InputStream inputStream) {
        boolean z;
        int i = this.f3436e;
        while (true) {
            try {
                z = false;
                int i2 = 1;
                int i3 = 6;
                if (this.f3432a == 6) {
                    break;
                }
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                this.f3434c++;
                if (this.f3438g) {
                    this.f3432a = 6;
                    this.f3438g = false;
                    return false;
                }
                int i4 = this.f3432a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        i3 = 3;
                        if (i4 != 2) {
                            if (i4 != 3) {
                                i2 = 5;
                                if (i4 != 4) {
                                    if (i4 != 5) {
                                        C0718j.m3247b(false);
                                        this.f3433b = read;
                                    } else {
                                        int i5 = ((this.f3433b << 8) + read) - 2;
                                        C0756d.m3369a(inputStream, (long) i5);
                                        this.f3434c += i5;
                                    }
                                }
                            } else {
                                if (read != 255) {
                                    if (read != 0) {
                                        if (read == 217) {
                                            this.f3438g = true;
                                            m4378b(this.f3434c - 2);
                                        } else {
                                            if (read == 218) {
                                                m4378b(this.f3434c - 2);
                                            }
                                            if (m4376a(read)) {
                                                this.f3432a = 4;
                                                this.f3433b = read;
                                            }
                                        }
                                    }
                                }
                                this.f3432a = i3;
                                this.f3433b = read;
                            }
                        } else if (read == 255) {
                            this.f3432a = i3;
                            this.f3433b = read;
                        } else {
                            this.f3433b = read;
                        }
                    } else {
                        if (read == 216) {
                        }
                        this.f3432a = i3;
                        this.f3433b = read;
                    }
                    this.f3432a = 2;
                    this.f3433b = read;
                } else {
                    if (read == 255) {
                    }
                    this.f3432a = i3;
                    this.f3433b = read;
                }
                this.f3432a = i2;
                this.f3433b = read;
            } catch (IOException e) {
                C0726r.m3253a(e);
                throw null;
            }
        }
        if (!(this.f3432a == 6 || this.f3436e == i)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m4378b(int i) {
        if (this.f3435d > 0) {
            this.f3437f = i;
        }
        int i2 = this.f3435d;
        this.f3435d = i2 + 1;
        this.f3436e = i2;
    }

    /* renamed from: a */
    public int mo4186a() {
        return this.f3437f;
    }

    /* renamed from: a */
    public boolean mo4187a(C0988d dVar) {
        if (this.f3432a == 6 || dVar.mo4223v() <= this.f3434c) {
            return false;
        }
        C0736f fVar = new C0736f(dVar.mo4220s(), (byte[]) this.f3439h.get(16384), this.f3439h);
        try {
            C0756d.m3369a(fVar, (long) this.f3434c);
            boolean a = m4377a((InputStream) fVar);
            C0708b.m3223a(fVar);
            return a;
        } catch (IOException e) {
            C0726r.m3253a(e);
            throw null;
        } catch (Throwable th) {
            C0708b.m3223a(fVar);
            throw th;
        }
    }

    /* renamed from: b */
    public int mo4188b() {
        return this.f3436e;
    }

    /* renamed from: c */
    public boolean mo4189c() {
        return this.f3438g;
    }
}
