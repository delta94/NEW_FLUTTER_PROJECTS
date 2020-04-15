package p032c.p033a.p035b.p037b;

import android.content.Context;
import java.io.File;
import p032c.p033a.p035b.p036a.C0652a;
import p032c.p033a.p035b.p036a.C0655c;
import p032c.p033a.p035b.p036a.C0660g;
import p032c.p033a.p035b.p036a.C0661h;
import p032c.p033a.p038c.p039a.C0692b;
import p032c.p033a.p038c.p039a.C0693c;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0721m;

/* renamed from: c.a.b.b.g */
public class C0676g {

    /* renamed from: a */
    private final int f2509a;

    /* renamed from: b */
    private final String f2510b;

    /* renamed from: c */
    private final C0721m<File> f2511c;

    /* renamed from: d */
    private final long f2512d;

    /* renamed from: e */
    private final long f2513e;

    /* renamed from: f */
    private final long f2514f;

    /* renamed from: g */
    private final C0688m f2515g;

    /* renamed from: h */
    private final C0652a f2516h;

    /* renamed from: i */
    private final C0655c f2517i;

    /* renamed from: j */
    private final C0692b f2518j;

    /* renamed from: k */
    private final Context f2519k;

    /* renamed from: l */
    private final boolean f2520l;

    /* renamed from: c.a.b.b.g$a */
    public static class C0677a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f2521a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f2522b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C0721m<File> f2523c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f2524d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f2525e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f2526f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C0688m f2527g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C0652a f2528h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C0655c f2529i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C0692b f2530j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f2531k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final Context f2532l;

        private C0677a(Context context) {
            this.f2521a = 1;
            this.f2522b = "image_cache";
            this.f2524d = 41943040;
            this.f2525e = 10485760;
            this.f2526f = 2097152;
            this.f2527g = new C0673d();
            this.f2532l = context;
        }

        /* renamed from: a */
        public C0676g mo3402a() {
            C0718j.m3248b((this.f2523c == null && this.f2532l == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f2523c == null && this.f2532l != null) {
                this.f2523c = new C0675f(this);
            }
            return new C0676g(this);
        }
    }

    private C0676g(C0677a aVar) {
        this.f2509a = aVar.f2521a;
        String b = aVar.f2522b;
        C0718j.m3240a(b);
        this.f2510b = b;
        C0721m<File> e = aVar.f2523c;
        C0718j.m3240a(e);
        this.f2511c = e;
        this.f2512d = aVar.f2524d;
        this.f2513e = aVar.f2525e;
        this.f2514f = aVar.f2526f;
        C0688m i = aVar.f2527g;
        C0718j.m3240a(i);
        this.f2515g = i;
        this.f2516h = aVar.f2528h == null ? C0660g.m3046a() : aVar.f2528h;
        this.f2517i = aVar.f2529i == null ? C0661h.m3048b() : aVar.f2529i;
        this.f2518j = aVar.f2530j == null ? C0693c.m3200a() : aVar.f2530j;
        this.f2519k = aVar.f2532l;
        this.f2520l = aVar.f2531k;
    }

    /* renamed from: a */
    public static C0677a m3107a(Context context) {
        return new C0677a(context);
    }

    /* renamed from: a */
    public String mo3390a() {
        return this.f2510b;
    }

    /* renamed from: b */
    public C0721m<File> mo3391b() {
        return this.f2511c;
    }

    /* renamed from: c */
    public C0652a mo3392c() {
        return this.f2516h;
    }

    /* renamed from: d */
    public C0655c mo3393d() {
        return this.f2517i;
    }

    /* renamed from: e */
    public Context mo3394e() {
        return this.f2519k;
    }

    /* renamed from: f */
    public long mo3395f() {
        return this.f2512d;
    }

    /* renamed from: g */
    public C0692b mo3396g() {
        return this.f2518j;
    }

    /* renamed from: h */
    public C0688m mo3397h() {
        return this.f2515g;
    }

    /* renamed from: i */
    public boolean mo3398i() {
        return this.f2520l;
    }

    /* renamed from: j */
    public long mo3399j() {
        return this.f2513e;
    }

    /* renamed from: k */
    public long mo3400k() {
        return this.f2514f;
    }

    /* renamed from: l */
    public int mo3401l() {
        return this.f2509a;
    }
}
