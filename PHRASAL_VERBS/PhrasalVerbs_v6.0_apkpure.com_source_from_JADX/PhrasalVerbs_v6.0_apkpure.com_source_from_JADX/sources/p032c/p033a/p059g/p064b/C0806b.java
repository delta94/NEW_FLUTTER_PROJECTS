package p032c.p033a.p059g.p064b;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.b.b */
public class C0806b {

    /* renamed from: a */
    private static C0806b f2794a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Set<C0807a> f2795b = new HashSet();

    /* renamed from: c */
    private final Handler f2796c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Runnable f2797d = new C0805a(this);

    /* renamed from: c.a.g.b.b$a */
    public interface C0807a {
        /* renamed from: a */
        void mo3662a();
    }

    /* renamed from: b */
    public static synchronized C0806b m3581b() {
        C0806b bVar;
        synchronized (C0806b.class) {
            if (f2794a == null) {
                f2794a = new C0806b();
            }
            bVar = f2794a;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m3582c() {
        C0718j.m3247b(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    /* renamed from: a */
    public void mo3660a(C0807a aVar) {
        m3582c();
        this.f2795b.remove(aVar);
    }

    /* renamed from: b */
    public void mo3661b(C0807a aVar) {
        m3582c();
        if (this.f2795b.add(aVar) && this.f2795b.size() == 1) {
            this.f2796c.post(this.f2797d);
        }
    }
}
