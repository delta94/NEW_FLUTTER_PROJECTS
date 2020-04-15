package p032c.p033a.p074i.p090n;

import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.i.n.c */
public abstract class C1051c<T> implements C1081n<T> {

    /* renamed from: a */
    private boolean f3587a = false;

    /* renamed from: a */
    public static int m4686a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public static boolean m4687a(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: a */
    public static boolean m4688a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: b */
    public static boolean m4689b(int i) {
        return !m4687a(i);
    }

    /* renamed from: b */
    public static boolean m4690b(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: c */
    public static int m4691c(int i, int i2) {
        return i & (i2 ^ -1);
    }

    /* renamed from: a */
    public synchronized void mo4307a() {
        if (!this.f3587a) {
            this.f3587a = true;
            try {
                mo4170b();
            } catch (Exception e) {
                mo4309a(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: a */
    public synchronized void mo4308a(float f) {
        if (!this.f3587a) {
            try {
                mo4171b(f);
            } catch (Exception e) {
                mo4309a(e);
            }
        } else {
            return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4309a(Exception exc) {
        C0727a.m3279c(getClass(), "unhandled exception", (Throwable) exc);
    }

    /* renamed from: a */
    public synchronized void mo4310a(T t, int i) {
        if (!this.f3587a) {
            this.f3587a = m4687a(i);
            try {
                mo4172b(t, i);
            } catch (Exception e) {
                mo4309a(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: a */
    public synchronized void mo4311a(Throwable th) {
        if (!this.f3587a) {
            this.f3587a = true;
            try {
                mo4173b(th);
            } catch (Exception e) {
                mo4309a(e);
            }
        } else {
            return;
        }
        return;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4170b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4171b(float f);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4172b(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4173b(Throwable th);
}
