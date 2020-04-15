package p032c.p033a.p098m.p112j.p114b;

import android.content.Context;
import android.net.Uri;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: c.a.m.j.b.a */
public class C1219a {

    /* renamed from: a */
    private Uri f3970a;

    /* renamed from: b */
    private String f3971b;

    /* renamed from: c */
    private double f3972c;

    /* renamed from: d */
    private boolean f3973d;

    public C1219a(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public C1219a(Context context, String str, double d, double d2) {
        this.f3971b = str;
        this.f3972c = d * d2;
        this.f3970a = m5221b(context);
    }

    /* renamed from: a */
    private Uri m5220a(Context context) {
        this.f3973d = true;
        return C1223d.m5230a().mo4565c(context, this.f3971b);
    }

    /* renamed from: b */
    private Uri m5221b(Context context) {
        try {
            Uri parse = Uri.parse(this.f3971b);
            if (parse.getScheme() == null) {
                parse = m5220a(context);
            }
            return parse;
        } catch (Exception unused) {
            return m5220a(context);
        }
    }

    /* renamed from: a */
    public double mo4557a() {
        return this.f3972c;
    }

    /* renamed from: b */
    public String mo4558b() {
        return this.f3971b;
    }

    /* renamed from: c */
    public Uri mo4559c() {
        Uri uri = this.f3970a;
        C1136a.m5053a(uri);
        return uri;
    }

    /* renamed from: d */
    public boolean mo4560d() {
        return this.f3973d;
    }
}
