package p133e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: e.c */
public class C2006c extends C2002F {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    static C2006c head;
    private boolean inQueue;
    private C2006c next;
    private long timeoutAt;

    /* renamed from: e.c$a */
    private static final class C2007a extends Thread {
        C2007a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.timedOut();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<e.c> r0 = p133e.C2006c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                e.c r1 = p133e.C2006c.awaitTimeout()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                e.c r2 = p133e.C2006c.head     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p133e.C2006c.head = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p133e.C2006c.C2007a.run():void");
        }
    }

    static C2006c awaitTimeout() {
        C2006c cVar = head.next;
        C2006c cVar2 = null;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            C2006c.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next == null && System.nanoTime() - nanoTime >= IDLE_TIMEOUT_NANOS) {
                cVar2 = head;
            }
            return cVar2;
        }
        long remainingNanos = cVar.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            C2006c.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = cVar.next;
        cVar.next = null;
        return cVar;
    }

    private static synchronized boolean cancelScheduledTimeout(C2006c cVar) {
        boolean z;
        synchronized (C2006c.class) {
            C2006c cVar2 = head;
            while (true) {
                if (cVar2 == null) {
                    z = true;
                    break;
                } else if (cVar2.next == cVar) {
                    cVar2.next = cVar.next;
                    cVar.next = null;
                    z = false;
                    break;
                } else {
                    cVar2 = cVar2.next;
                }
            }
        }
        return z;
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054 A[EDGE_INSN: B:34:0x0054->B:23:0x0054 ?: BREAK  
    EDGE_INSN: B:34:0x0054->B:23:0x0054 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void scheduleTimeout(p133e.C2006c r6, long r7, boolean r9) {
        /*
            java.lang.Class<e.c> r0 = p133e.C2006c.class
            monitor-enter(r0)
            e.c r1 = head     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0016
            e.c r1 = new e.c     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            head = r1     // Catch:{ all -> 0x006b }
            e.c$a r1 = new e.c$a     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            r1.start()     // Catch:{ all -> 0x006b }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006b }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            long r3 = r6.deadlineNanoTime()     // Catch:{ all -> 0x006b }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x006b }
        L_0x002b:
            long r7 = r7 + r1
            r6.timeoutAt = r7     // Catch:{ all -> 0x006b }
            goto L_0x003c
        L_0x002f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            goto L_0x002b
        L_0x0034:
            if (r9 == 0) goto L_0x0065
            long r7 = r6.deadlineNanoTime()     // Catch:{ all -> 0x006b }
            r6.timeoutAt = r7     // Catch:{ all -> 0x006b }
        L_0x003c:
            long r7 = r6.remainingNanos(r1)     // Catch:{ all -> 0x006b }
            e.c r9 = head     // Catch:{ all -> 0x006b }
        L_0x0042:
            e.c r3 = r9.next     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0054
            e.c r3 = r9.next     // Catch:{ all -> 0x006b }
            long r3 = r3.remainingNanos(r1)     // Catch:{ all -> 0x006b }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            e.c r9 = r9.next     // Catch:{ all -> 0x006b }
            goto L_0x0042
        L_0x0054:
            e.c r7 = r9.next     // Catch:{ all -> 0x006b }
            r6.next = r7     // Catch:{ all -> 0x006b }
            r9.next = r6     // Catch:{ all -> 0x006b }
            e.c r6 = head     // Catch:{ all -> 0x006b }
            if (r9 != r6) goto L_0x0063
            java.lang.Class<e.c> r6 = p133e.C2006c.class
            r6.notify()     // Catch:{ all -> 0x006b }
        L_0x0063:
            monitor-exit(r0)
            return
        L_0x0065:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x006b }
            r6.<init>()     // Catch:{ all -> 0x006b }
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p133e.C2006c.scheduleTimeout(e.c, long, boolean):void");
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: 0000 */
    public final IOException exit(IOException iOException) {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    /* access modifiers changed from: 0000 */
    public final void exit(boolean z) {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final C1999C sink(C1999C c) {
        return new C2004a(this, c);
    }

    public final C2000D source(C2000D d) {
        return new C2005b(this, d);
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
    }
}
