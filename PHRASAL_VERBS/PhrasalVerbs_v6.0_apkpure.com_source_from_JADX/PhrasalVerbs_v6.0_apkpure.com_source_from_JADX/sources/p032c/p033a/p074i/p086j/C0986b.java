package p032c.p033a.p074i.p086j;

import java.io.Closeable;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.i.j.b */
public abstract class C0986b implements Closeable, C0989e {
    public abstract void close();

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!isClosed()) {
            C0727a.m3283c("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public abstract boolean isClosed();

    /* renamed from: o */
    public C0991g mo4195o() {
        return C0990f.f3456a;
    }

    /* renamed from: p */
    public abstract int mo4196p();

    /* renamed from: q */
    public boolean mo4197q() {
        return false;
    }
}
