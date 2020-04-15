package p032c.p033a.p074i.p089m;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p035b.p036a.C0662i;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p074i.p091o.C1112a;

/* renamed from: c.a.i.m.a */
public class C1000a extends C1112a {

    /* renamed from: b */
    private final int f3469b;

    /* renamed from: c */
    private final int f3470c;

    /* renamed from: d */
    private C0657d f3471d;

    public C1000a(int i) {
        this(3, i);
    }

    public C1000a(int i, int i2) {
        boolean z = true;
        C0718j.m3243a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        C0718j.m3243a(z);
        this.f3469b = i;
        this.f3470c = i2;
    }

    /* renamed from: a */
    public C0657d mo4246a() {
        if (this.f3471d == null) {
            this.f3471d = new C0662i(String.format(null, "i%dr%d", new Object[]{Integer.valueOf(this.f3469b), Integer.valueOf(this.f3470c)}));
        }
        return this.f3471d;
    }

    /* renamed from: a */
    public void mo4247a(Bitmap bitmap) {
        NativeBlurFilter.m5606a(bitmap, this.f3469b, this.f3470c);
    }
}
