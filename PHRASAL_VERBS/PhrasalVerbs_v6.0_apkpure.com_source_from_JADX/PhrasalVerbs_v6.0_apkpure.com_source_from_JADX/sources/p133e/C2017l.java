package p133e;

/* renamed from: e.l */
public abstract class C2017l implements C2000D {
    private final C2000D delegate;

    public C2017l(C2000D d) {
        if (d != null) {
            this.delegate = d;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.delegate.close();
    }

    public final C2000D delegate() {
        return this.delegate;
    }

    public long read(C2011g gVar, long j) {
        return this.delegate.read(gVar, j);
    }

    public C2002F timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.delegate.toString());
        sb.append(")");
        return sb.toString();
    }
}
