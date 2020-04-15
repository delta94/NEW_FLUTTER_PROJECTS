package p000a.p005b.p009c.p016e;

import android.support.p029v4.util.C0337n;
import android.util.Base64;
import java.util.List;

/* renamed from: a.b.c.e.a */
public final class C0079a {

    /* renamed from: a */
    private final String f168a;

    /* renamed from: b */
    private final String f169b;

    /* renamed from: c */
    private final String f170c;

    /* renamed from: d */
    private final List<List<byte[]>> f171d;

    /* renamed from: e */
    private final int f172e = 0;

    /* renamed from: f */
    private final String f173f;

    public C0079a(String str, String str2, String str3, List<List<byte[]>> list) {
        C0337n.m1442a(str);
        this.f168a = str;
        C0337n.m1442a(str2);
        this.f169b = str2;
        C0337n.m1442a(str3);
        this.f170c = str3;
        C0337n.m1442a(list);
        this.f171d = list;
        StringBuilder sb = new StringBuilder(this.f168a);
        String str4 = "-";
        sb.append(str4);
        sb.append(this.f169b);
        sb.append(str4);
        sb.append(this.f170c);
        this.f173f = sb.toString();
    }

    /* renamed from: a */
    public List<List<byte[]>> mo264a() {
        return this.f171d;
    }

    /* renamed from: b */
    public int mo265b() {
        return this.f172e;
    }

    /* renamed from: c */
    public String mo266c() {
        return this.f173f;
    }

    /* renamed from: d */
    public String mo267d() {
        return this.f168a;
    }

    /* renamed from: e */
    public String mo268e() {
        return this.f169b;
    }

    /* renamed from: f */
    public String mo269f() {
        return this.f170c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.f168a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f169b);
        sb2.append(", mQuery: ");
        sb2.append(this.f170c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f171d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f171d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.f172e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
