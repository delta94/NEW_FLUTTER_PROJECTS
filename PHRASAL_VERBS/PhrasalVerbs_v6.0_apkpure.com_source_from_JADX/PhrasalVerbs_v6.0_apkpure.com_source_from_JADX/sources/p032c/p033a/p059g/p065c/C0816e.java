package p032c.p033a.p059g.p065c;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p051d.C0768e;
import p032c.p033a.p051d.C0770g;
import p032c.p033a.p051d.C0773j;
import p032c.p033a.p051d.C0776k;
import p032c.p033a.p059g.p065c.C0816e;
import p032c.p033a.p059g.p070g.C0868a;
import p032c.p033a.p059g.p071h.C0870a;
import p032c.p033a.p059g.p071h.C0873d;

/* renamed from: c.a.g.c.e */
public abstract class C0816e<BUILDER extends C0816e<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements C0873d {

    /* renamed from: a */
    private static final C0819g<Object> f2860a = new C0814c();

    /* renamed from: b */
    private static final NullPointerException f2861b = new NullPointerException("No image request was specified!");

    /* renamed from: c */
    private static final AtomicLong f2862c = new AtomicLong();

    /* renamed from: d */
    private final Context f2863d;

    /* renamed from: e */
    private final Set<C0819g> f2864e;

    /* renamed from: f */
    private Object f2865f;

    /* renamed from: g */
    private REQUEST f2866g;

    /* renamed from: h */
    private REQUEST f2867h;

    /* renamed from: i */
    private REQUEST[] f2868i;

    /* renamed from: j */
    private boolean f2869j;

    /* renamed from: k */
    private C0721m<C0768e<IMAGE>> f2870k;

    /* renamed from: l */
    private C0819g<? super INFO> f2871l;

    /* renamed from: m */
    private C0820h f2872m;

    /* renamed from: n */
    private boolean f2873n;

    /* renamed from: o */
    private boolean f2874o;

    /* renamed from: p */
    private boolean f2875p;

    /* renamed from: q */
    private String f2876q;

    /* renamed from: r */
    private C0870a f2877r;

    /* renamed from: c.a.g.c.e$a */
    public enum C0817a {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected C0816e(Context context, Set<C0819g> set) {
        this.f2863d = context;
        this.f2864e = set;
        m3643m();
    }

    /* renamed from: b */
    protected static String m3642b() {
        return String.valueOf(f2862c.getAndIncrement());
    }

    /* renamed from: m */
    private void m3643m() {
        this.f2865f = null;
        this.f2866g = null;
        this.f2867h = null;
        this.f2868i = null;
        this.f2869j = true;
        this.f2871l = null;
        this.f2872m = null;
        this.f2873n = false;
        this.f2874o = false;
        this.f2877r = null;
        this.f2876q = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0721m<C0768e<IMAGE>> mo3693a(C0870a aVar, String str) {
        C0721m<C0768e<IMAGE>> mVar = this.f2870k;
        if (mVar != null) {
            return mVar;
        }
        C0721m<C0768e<IMAGE>> mVar2 = null;
        REQUEST request = this.f2866g;
        if (request != null) {
            mVar2 = mo3694a(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f2868i;
            if (requestArr != null) {
                mVar2 = mo3696a(aVar, str, requestArr, this.f2869j);
            }
        }
        if (!(mVar2 == null || this.f2867h == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(mVar2);
            arrayList.add(mo3694a(aVar, str, this.f2867h));
            mVar2 = C0776k.m3450a(arrayList, false);
        }
        if (mVar2 == null) {
            mVar2 = C0770g.m3426a(f2861b);
        }
        return mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0721m<C0768e<IMAGE>> mo3694a(C0870a aVar, String str, REQUEST request) {
        return mo3695a(aVar, str, request, C0817a.FULL_FETCH);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0721m<C0768e<IMAGE>> mo3695a(C0870a aVar, String str, REQUEST request, C0817a aVar2) {
        C0815d dVar = new C0815d(this, aVar, str, request, mo3707c(), aVar2);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0721m<C0768e<IMAGE>> mo3696a(C0870a aVar, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST a : requestArr) {
                arrayList.add(mo3695a(aVar, str, a, C0817a.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST a2 : requestArr) {
            arrayList.add(mo3694a(aVar, str, a2));
        }
        return C0773j.m3432a((List<C0721m<C0768e<T>>>) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0768e<IMAGE> mo3652a(C0870a aVar, String str, REQUEST request, Object obj, C0817a aVar2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0812b mo3697a() {
        C0812b j = mo3655j();
        j.mo3675a(mo3713h());
        j.mo3673a(mo3709d());
        j.mo3671a(mo3710e());
        mo3708c(j);
        mo3702a(j);
        return j;
    }

    /* renamed from: a */
    public BUILDER mo3698a(C0819g<? super INFO> gVar) {
        this.f2871l = gVar;
        mo3714i();
        return this;
    }

    /* renamed from: a */
    public BUILDER mo3699a(C0870a aVar) {
        this.f2877r = aVar;
        mo3714i();
        return this;
    }

    /* renamed from: a */
    public BUILDER mo3700a(Object obj) {
        this.f2865f = obj;
        mo3714i();
        return this;
    }

    /* renamed from: a */
    public BUILDER mo3701a(boolean z) {
        this.f2874o = z;
        mo3714i();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3702a(C0812b bVar) {
        Set<C0819g> set = this.f2864e;
        if (set != null) {
            for (C0819g a : set) {
                bVar.mo3670a(a);
            }
        }
        C0819g<? super INFO> gVar = this.f2871l;
        if (gVar != null) {
            bVar.mo3670a(gVar);
        }
        if (this.f2874o) {
            bVar.mo3670a(f2860a);
        }
    }

    /* renamed from: b */
    public BUILDER mo3703b(REQUEST request) {
        this.f2866g = request;
        mo3714i();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3704b(C0812b bVar) {
        if (bVar.mo3687k() == null) {
            bVar.mo3672a(C0868a.m3888a(this.f2863d));
        }
    }

    public C0812b build() {
        mo3716l();
        if (this.f2866g == null && this.f2868i == null) {
            REQUEST request = this.f2867h;
            if (request != null) {
                this.f2866g = request;
                this.f2867h = null;
            }
        }
        return mo3697a();
    }

    /* renamed from: c */
    public BUILDER mo3706c(REQUEST request) {
        this.f2867h = request;
        mo3714i();
        return this;
    }

    /* renamed from: c */
    public Object mo3707c() {
        return this.f2865f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3708c(C0812b bVar) {
        if (this.f2873n) {
            bVar.mo3689m().mo3666a(this.f2873n);
            mo3704b(bVar);
        }
    }

    /* renamed from: d */
    public String mo3709d() {
        return this.f2876q;
    }

    /* renamed from: e */
    public C0820h mo3710e() {
        return this.f2872m;
    }

    /* renamed from: f */
    public REQUEST mo3711f() {
        return this.f2866g;
    }

    /* renamed from: g */
    public C0870a mo3712g() {
        return this.f2877r;
    }

    /* renamed from: h */
    public boolean mo3713h() {
        return this.f2875p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final BUILDER mo3714i() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C0812b mo3655j();

    /* renamed from: k */
    public BUILDER mo3715k() {
        m3643m();
        mo3714i();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo3716l() {
        boolean z = false;
        C0718j.m3248b(this.f2868i == null || this.f2866g == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f2870k == null || (this.f2868i == null && this.f2866g == null && this.f2867h == null)) {
            z = true;
        }
        C0718j.m3248b(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }
}
