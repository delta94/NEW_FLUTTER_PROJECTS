package p133e;

import java.io.IOException;

/* renamed from: e.b */
class C2005b implements C2000D {

    /* renamed from: a */
    final /* synthetic */ C2000D f5920a;

    /* renamed from: b */
    final /* synthetic */ C2006c f5921b;

    C2005b(C2006c cVar, C2000D d) {
        this.f5921b = cVar;
        this.f5920a = d;
    }

    public void close() {
        try {
            this.f5920a.close();
            this.f5921b.exit(true);
        } catch (IOException e) {
            throw this.f5921b.exit(e);
        } catch (Throwable th) {
            this.f5921b.exit(false);
            throw th;
        }
    }

    public long read(C2011g gVar, long j) {
        this.f5921b.enter();
        try {
            long read = this.f5920a.read(gVar, j);
            this.f5921b.exit(true);
            return read;
        } catch (IOException e) {
            throw this.f5921b.exit(e);
        } catch (Throwable th) {
            this.f5921b.exit(false);
            throw th;
        }
    }

    public C2002F timeout() {
        return this.f5921b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncTimeout.source(");
        sb.append(this.f5920a);
        sb.append(")");
        return sb.toString();
    }
}
