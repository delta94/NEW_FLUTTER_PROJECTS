package p032c.p033a.p074i.p082f;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.a.i.f.q */
public class C0966q implements ThreadFactory {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f3372a;

    /* renamed from: b */
    private final String f3373b;

    /* renamed from: c */
    private final boolean f3374c;

    /* renamed from: d */
    private final AtomicInteger f3375d = new AtomicInteger(1);

    public C0966q(int i, String str, boolean z) {
        this.f3372a = i;
        this.f3373b = str;
        this.f3374c = z;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        C0965p pVar = new C0965p(this, runnable);
        if (this.f3374c) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3373b);
            sb.append("-");
            sb.append(this.f3375d.getAndIncrement());
            str = sb.toString();
        } else {
            str = this.f3373b;
        }
        return new Thread(pVar, str);
    }
}
