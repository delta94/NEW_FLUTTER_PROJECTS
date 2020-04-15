package p032c.p033a.p038c.p049k;

import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.c.k.d */
public class C0756d {
    /* renamed from: a */
    public static long m3369a(InputStream inputStream, long j) {
        C0718j.m3240a(inputStream);
        C0718j.m3243a(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }
}
