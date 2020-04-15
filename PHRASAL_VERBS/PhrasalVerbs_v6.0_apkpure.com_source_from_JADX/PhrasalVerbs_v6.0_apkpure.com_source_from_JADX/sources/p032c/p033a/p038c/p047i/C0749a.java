package p032c.p033a.p038c.p047i;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p032c.p033a.p038c.p042d.C0726r;

/* renamed from: c.a.c.i.a */
public class C0749a {

    /* renamed from: a */
    private static C0749a f2626a;

    /* renamed from: b */
    private static final long f2627b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: c */
    private volatile StatFs f2628c = null;

    /* renamed from: d */
    private volatile File f2629d;

    /* renamed from: e */
    private volatile StatFs f2630e = null;

    /* renamed from: f */
    private volatile File f2631f;

    /* renamed from: g */
    private long f2632g;

    /* renamed from: h */
    private final Lock f2633h = new ReentrantLock();

    /* renamed from: i */
    private volatile boolean f2634i = false;

    /* renamed from: c.a.c.i.a$a */
    public enum C0750a {
        INTERNAL,
        EXTERNAL
    }

    protected C0749a() {
    }

    /* renamed from: a */
    private StatFs m3355a(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = m3356a(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                C0726r.m3253a(th);
                throw null;
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    /* renamed from: a */
    protected static StatFs m3356a(String str) {
        return new StatFs(str);
    }

    /* renamed from: a */
    public static synchronized C0749a m3357a() {
        C0749a aVar;
        synchronized (C0749a.class) {
            if (f2626a == null) {
                f2626a = new C0749a();
            }
            aVar = f2626a;
        }
        return aVar;
    }

    /* renamed from: b */
    private void m3358b() {
        if (!this.f2634i) {
            this.f2633h.lock();
            try {
                if (!this.f2634i) {
                    this.f2629d = Environment.getDataDirectory();
                    this.f2631f = Environment.getExternalStorageDirectory();
                    m3360d();
                    this.f2634i = true;
                }
            } finally {
                this.f2633h.unlock();
            }
        }
    }

    /* renamed from: c */
    private void m3359c() {
        if (this.f2633h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f2632g > f2627b) {
                    m3360d();
                }
            } finally {
                this.f2633h.unlock();
            }
        }
    }

    /* renamed from: d */
    private void m3360d() {
        this.f2628c = m3355a(this.f2628c, this.f2629d);
        this.f2630e = m3355a(this.f2630e, this.f2631f);
        this.f2632g = SystemClock.uptimeMillis();
    }

    @SuppressLint({"DeprecatedMethod"})
    /* renamed from: a */
    public long mo3530a(C0750a aVar) {
        long j;
        long j2;
        m3358b();
        m3359c();
        StatFs statFs = aVar == C0750a.INTERNAL ? this.f2628c : this.f2630e;
        if (statFs == null) {
            return 0;
        }
        if (VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    /* renamed from: a */
    public boolean mo3531a(C0750a aVar, long j) {
        m3358b();
        long a = mo3530a(aVar);
        return a <= 0 || a < j;
    }
}
