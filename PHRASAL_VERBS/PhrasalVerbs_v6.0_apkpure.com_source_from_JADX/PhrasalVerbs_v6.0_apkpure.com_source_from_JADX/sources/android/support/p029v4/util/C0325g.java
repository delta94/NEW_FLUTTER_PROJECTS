package android.support.p029v4.util;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.util.g */
public class C0325g extends Writer {

    /* renamed from: a */
    private final String f964a;

    /* renamed from: b */
    private StringBuilder f965b = new StringBuilder(128);

    public C0325g(String str) {
        this.f964a = str;
    }

    /* renamed from: m */
    private void m1401m() {
        if (this.f965b.length() > 0) {
            Log.d(this.f964a, this.f965b.toString());
            StringBuilder sb = this.f965b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m1401m();
    }

    public void flush() {
        m1401m();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m1401m();
            } else {
                this.f965b.append(c);
            }
        }
    }
}
