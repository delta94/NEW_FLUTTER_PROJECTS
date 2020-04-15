package p133e;

import java.io.IOException;

/* renamed from: e.u */
public final class C2026u {

    /* renamed from: a */
    final long f5957a;

    /* renamed from: b */
    final C2011g f5958b = new C2011g();

    /* renamed from: c */
    boolean f5959c;

    /* renamed from: d */
    boolean f5960d;

    /* renamed from: e */
    private final C1999C f5961e = new C2027a();

    /* renamed from: f */
    private final C2000D f5962f = new C2028b();

    /* renamed from: e.u$a */
    final class C2027a implements C1999C {

        /* renamed from: a */
        final C2002F f5963a = new C2002F();

        C2027a() {
        }

        public void close() {
            synchronized (C2026u.this.f5958b) {
                if (!C2026u.this.f5959c) {
                    if (C2026u.this.f5960d) {
                        if (C2026u.this.f5958b.size() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                    C2026u.this.f5959c = true;
                    C2026u.this.f5958b.notifyAll();
                }
            }
        }

        public void flush() {
            synchronized (C2026u.this.f5958b) {
                if (C2026u.this.f5959c) {
                    throw new IllegalStateException("closed");
                } else if (C2026u.this.f5960d) {
                    if (C2026u.this.f5958b.size() > 0) {
                        throw new IOException("source is closed");
                    }
                }
            }
        }

        public C2002F timeout() {
            return this.f5963a;
        }

        public void write(C2011g gVar, long j) {
            synchronized (C2026u.this.f5958b) {
                if (!C2026u.this.f5959c) {
                    while (j > 0) {
                        if (!C2026u.this.f5960d) {
                            long size = C2026u.this.f5957a - C2026u.this.f5958b.size();
                            if (size == 0) {
                                this.f5963a.waitUntilNotified(C2026u.this.f5958b);
                            } else {
                                long min = Math.min(size, j);
                                C2026u.this.f5958b.write(gVar, min);
                                j -= min;
                                C2026u.this.f5958b.notifyAll();
                            }
                        } else {
                            throw new IOException("source is closed");
                        }
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }
        }
    }

    /* renamed from: e.u$b */
    final class C2028b implements C2000D {

        /* renamed from: a */
        final C2002F f5965a = new C2002F();

        C2028b() {
        }

        public void close() {
            synchronized (C2026u.this.f5958b) {
                C2026u.this.f5960d = true;
                C2026u.this.f5958b.notifyAll();
            }
        }

        public long read(C2011g gVar, long j) {
            synchronized (C2026u.this.f5958b) {
                if (!C2026u.this.f5960d) {
                    while (C2026u.this.f5958b.size() == 0) {
                        if (C2026u.this.f5959c) {
                            return -1;
                        }
                        this.f5965a.waitUntilNotified(C2026u.this.f5958b);
                    }
                    long read = C2026u.this.f5958b.read(gVar, j);
                    C2026u.this.f5958b.notifyAll();
                    return read;
                }
                throw new IllegalStateException("closed");
            }
        }

        public C2002F timeout() {
            return this.f5965a;
        }
    }

    public C2026u(long j) {
        if (j >= 1) {
            this.f5957a = j;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("maxBufferSize < 1: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C1999C mo7174a() {
        return this.f5961e;
    }

    /* renamed from: b */
    public final C2000D mo7175b() {
        return this.f5962f;
    }
}
