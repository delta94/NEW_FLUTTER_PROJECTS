package p000a.p005b.p009c.p016e;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import java.util.concurrent.Callable;

/* renamed from: a.b.c.e.k */
public class C0092k {

    /* renamed from: a */
    private final Object f208a = new Object();

    /* renamed from: b */
    private HandlerThread f209b;

    /* renamed from: c */
    private Handler f210c;

    /* renamed from: d */
    private int f211d;

    /* renamed from: e */
    private Callback f212e = new C0088g(this);

    /* renamed from: f */
    private final int f213f;

    /* renamed from: g */
    private final int f214g;

    /* renamed from: h */
    private final String f215h;

    /* renamed from: a.b.c.e.k$a */
    public interface C0093a<T> {
        /* renamed from: a */
        void mo273a(T t);
    }

    public C0092k(String str, int i, int i2) {
        this.f215h = str;
        this.f214g = i;
        this.f213f = i2;
        this.f211d = 0;
    }

    /* renamed from: b */
    private void m296b(Runnable runnable) {
        synchronized (this.f208a) {
            if (this.f209b == null) {
                this.f209b = new HandlerThread(this.f215h, this.f214g);
                this.f209b.start();
                this.f210c = new Handler(this.f209b.getLooper(), this.f212e);
                this.f211d++;
            }
            this.f210c.removeMessages(0);
            this.f210c.sendMessage(this.f210c.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo288a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            a.b.c.e.j r11 = new a.b.c.e.j
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m296b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p016e.C0092k.mo288a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo289a() {
        synchronized (this.f208a) {
            if (!this.f210c.hasMessages(1)) {
                this.f209b.quit();
                this.f209b = null;
                this.f210c = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo290a(Runnable runnable) {
        runnable.run();
        synchronized (this.f208a) {
            this.f210c.removeMessages(0);
            this.f210c.sendMessageDelayed(this.f210c.obtainMessage(0), (long) this.f213f);
        }
    }

    /* renamed from: a */
    public <T> void mo291a(Callable<T> callable, C0093a<T> aVar) {
        m296b(new C0090i(this, callable, new Handler(), aVar));
    }
}
