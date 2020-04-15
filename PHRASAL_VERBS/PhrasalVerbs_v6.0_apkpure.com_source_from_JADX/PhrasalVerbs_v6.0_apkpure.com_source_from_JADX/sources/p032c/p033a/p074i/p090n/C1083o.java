package p032c.p033a.p074i.p090n;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p032c.p033a.p038c.p040b.C0694a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.o */
public class C1083o extends C1036S {
    public C1083o(C0739h hVar) {
        super(C0694a.m3202a(), hVar);
    }

    /* renamed from: a */
    static byte[] m4830a(String str) {
        C0718j.m3243a(str.substring(0, 5).equals("data:"));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        return m4831b(str.substring(0, indexOf)) ? Base64.decode(substring, 0) : Uri.decode(substring).getBytes();
    }

    /* renamed from: b */
    static boolean m4831b(String str) {
        String str2 = ";";
        if (!str.contains(str2)) {
            return false;
        }
        String[] split = str.split(str2);
        return split[split.length - 1].equals("base64");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4276a(C1114c cVar) {
        byte[] a = m4830a(cVar.mo4372o().toString());
        return mo4287a((InputStream) new ByteArrayInputStream(a), a.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4277a() {
        return "DataFetchProducer";
    }
}
