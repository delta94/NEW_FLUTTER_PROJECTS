package p133e;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: e.C */
public interface C1999C extends Closeable, Flushable {
    void close();

    void flush();

    C2002F timeout();

    void write(C2011g gVar, long j);
}
