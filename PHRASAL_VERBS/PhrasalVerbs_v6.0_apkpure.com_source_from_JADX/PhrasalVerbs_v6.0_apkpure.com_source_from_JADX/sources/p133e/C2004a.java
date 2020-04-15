package p133e;

import java.io.IOException;

/* renamed from: e.a */
class C2004a implements C1999C {

    /* renamed from: a */
    final /* synthetic */ C1999C f5918a;

    /* renamed from: b */
    final /* synthetic */ C2006c f5919b;

    C2004a(C2006c cVar, C1999C c) {
        this.f5919b = cVar;
        this.f5918a = c;
    }

    public void close() {
        this.f5919b.enter();
        try {
            this.f5918a.close();
            this.f5919b.exit(true);
        } catch (IOException e) {
            throw this.f5919b.exit(e);
        } catch (Throwable th) {
            this.f5919b.exit(false);
            throw th;
        }
    }

    public void flush() {
        this.f5919b.enter();
        try {
            this.f5918a.flush();
            this.f5919b.exit(true);
        } catch (IOException e) {
            throw this.f5919b.exit(e);
        } catch (Throwable th) {
            this.f5919b.exit(false);
            throw th;
        }
    }

    public C2002F timeout() {
        return this.f5919b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncTimeout.sink(");
        sb.append(this.f5918a);
        sb.append(")");
        return sb.toString();
    }

    public void write(C2011g gVar, long j) {
        C2003G.m7625a(gVar.f5928c, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C2033z zVar = gVar.f5927b;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (zVar.f5977c - zVar.f5976b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    zVar = zVar.f5980f;
                }
                this.f5919b.enter();
                try {
                    this.f5918a.write(gVar, j2);
                    j -= j2;
                    this.f5919b.exit(true);
                } catch (IOException e) {
                    throw this.f5919b.exit(e);
                } catch (Throwable th) {
                    this.f5919b.exit(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
