package p000a.p005b.p009c.p016e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.b.c.e.j */
class C0091j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f202a;

    /* renamed from: b */
    final /* synthetic */ Callable f203b;

    /* renamed from: c */
    final /* synthetic */ ReentrantLock f204c;

    /* renamed from: d */
    final /* synthetic */ AtomicBoolean f205d;

    /* renamed from: e */
    final /* synthetic */ Condition f206e;

    /* renamed from: f */
    final /* synthetic */ C0092k f207f;

    C0091j(C0092k kVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f207f = kVar;
        this.f202a = atomicReference;
        this.f203b = callable;
        this.f204c = reentrantLock;
        this.f205d = atomicBoolean;
        this.f206e = condition;
    }

    public void run() {
        try {
            this.f202a.set(this.f203b.call());
        } catch (Exception unused) {
        }
        this.f204c.lock();
        try {
            this.f205d.set(false);
            this.f206e.signal();
        } finally {
            this.f204c.unlock();
        }
    }
}
