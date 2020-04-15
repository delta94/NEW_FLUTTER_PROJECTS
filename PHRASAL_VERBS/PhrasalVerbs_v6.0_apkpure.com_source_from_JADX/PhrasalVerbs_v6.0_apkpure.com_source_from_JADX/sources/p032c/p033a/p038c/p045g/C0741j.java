package p032c.p033a.p038c.p045g;

import java.io.IOException;
import java.io.OutputStream;
import p032c.p033a.p038c.p042d.C0726r;

/* renamed from: c.a.c.g.j */
public abstract class C0741j extends OutputStream {
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C0726r.m3253a(e);
            throw null;
        }
    }

    /* renamed from: m */
    public abstract C0737g mo3512m();

    public abstract int size();
}
