package p133e;

/* renamed from: e.k */
public abstract class C2016k implements C1999C {
    private final C1999C delegate;

    public C2016k(C1999C c) {
        if (c != null) {
            this.delegate = c;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() {
        this.delegate.close();
    }

    public final C1999C delegate() {
        return this.delegate;
    }

    public void flush() {
        this.delegate.flush();
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

    public void write(C2011g gVar, long j) {
        this.delegate.write(gVar, j);
    }
}
