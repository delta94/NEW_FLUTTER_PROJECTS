package p032c.p033a.p038c.p043e;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: c.a.c.e.b */
public class C0728b implements C0729c {

    /* renamed from: a */
    public static final C0728b f2599a = new C0728b();

    /* renamed from: b */
    private String f2600b = "unknown";

    /* renamed from: c */
    private int f2601c = 5;

    private C0728b() {
    }

    /* renamed from: a */
    public static C0728b m3287a() {
        return f2599a;
    }

    /* renamed from: a */
    private String m3288a(String str) {
        if (this.f2600b == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2600b);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m3289a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(10);
        sb.append(m3290a(th));
        return sb.toString();
    }

    /* renamed from: a */
    private static String m3290a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    private void m3291a(int i, String str, String str2) {
        Log.println(i, m3288a(str), str2);
    }

    /* renamed from: a */
    private void m3292a(int i, String str, String str2, Throwable th) {
        Log.println(i, m3288a(str), m3289a(str2, th));
    }

    /* renamed from: a */
    public void mo3475a(String str, String str2) {
        m3291a(5, str, str2);
    }

    /* renamed from: a */
    public void mo3476a(String str, String str2, Throwable th) {
        m3292a(6, str, str2, th);
    }

    /* renamed from: a */
    public boolean mo3477a(int i) {
        return this.f2601c <= i;
    }

    /* renamed from: b */
    public void mo3478b(String str, String str2) {
        m3291a(6, str, str2);
    }

    /* renamed from: b */
    public void mo3479b(String str, String str2, Throwable th) {
        m3292a(5, str, str2, th);
    }

    /* renamed from: c */
    public void mo3480c(String str, String str2) {
        m3291a(2, str, str2);
    }

    /* renamed from: c */
    public void mo3481c(String str, String str2, Throwable th) {
        m3292a(6, str, str2, th);
    }

    /* renamed from: d */
    public void mo3482d(String str, String str2) {
        m3291a(6, str, str2);
    }

    /* renamed from: e */
    public void mo3483e(String str, String str2) {
        m3291a(3, str, str2);
    }

    /* renamed from: f */
    public void mo3484f(String str, String str2) {
        m3291a(4, str, str2);
    }
}
