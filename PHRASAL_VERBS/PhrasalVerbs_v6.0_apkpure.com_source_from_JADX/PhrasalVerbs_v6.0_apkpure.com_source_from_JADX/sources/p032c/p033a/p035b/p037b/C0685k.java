package p032c.p033a.p035b.p037b;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p032c.p033a.p034a.C0650a;
import p032c.p033a.p035b.p036a.C0652a;
import p032c.p033a.p035b.p036a.C0652a.C0653a;
import p032c.p033a.p035b.p037b.C0678h.C0679a;
import p032c.p033a.p035b.p037b.C0678h.C0680b;
import p032c.p033a.p038c.p041c.C0700a;
import p032c.p033a.p038c.p041c.C0702c;
import p032c.p033a.p038c.p041c.C0702c.C0703a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.b.b.k */
public class C0685k implements C0678h {

    /* renamed from: a */
    private static final Class<?> f2560a = C0685k.class;

    /* renamed from: b */
    private final int f2561b;

    /* renamed from: c */
    private final C0721m<File> f2562c;

    /* renamed from: d */
    private final String f2563d;

    /* renamed from: e */
    private final C0652a f2564e;

    /* renamed from: f */
    volatile C0686a f2565f = new C0686a(null, null);

    /* renamed from: c.a.b.b.k$a */
    static class C0686a {

        /* renamed from: a */
        public final C0678h f2566a;

        /* renamed from: b */
        public final File f2567b;

        C0686a(File file, C0678h hVar) {
            this.f2566a = hVar;
            this.f2567b = file;
        }
    }

    public C0685k(int i, C0721m<File> mVar, String str, C0652a aVar) {
        this.f2561b = i;
        this.f2564e = aVar;
        this.f2562c = mVar;
        this.f2563d = str;
    }

    /* renamed from: g */
    private void m3170g() {
        File file = new File((File) this.f2562c.get(), this.f2563d);
        mo3416a(file);
        this.f2565f = new C0686a(file, new C0665b(file, this.f2561b, this.f2564e));
    }

    /* renamed from: h */
    private boolean m3171h() {
        C0686a aVar = this.f2565f;
        if (aVar.f2566a != null) {
            File file = aVar.f2567b;
            if (file != null && file.exists()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public long mo3362a(C0679a aVar) {
        return mo3418f().mo3362a(aVar);
    }

    /* renamed from: a */
    public C0680b mo3363a(String str, Object obj) {
        return mo3418f().mo3363a(str, obj);
    }

    /* renamed from: a */
    public void mo3364a() {
        mo3418f().mo3364a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3416a(File file) {
        try {
            C0702c.m3218a(file);
            C0727a.m3259a(f2560a, "Created cache directory %s", (Object) file.getAbsolutePath());
        } catch (C0703a e) {
            this.f2564e.mo3343a(C0653a.WRITE_CREATE_DIR, f2560a, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    /* renamed from: b */
    public boolean mo3366b() {
        try {
            return mo3418f().mo3366b();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo3367b(String str, Object obj) {
        return mo3418f().mo3367b(str, obj);
    }

    /* renamed from: c */
    public C0650a mo3368c(String str, Object obj) {
        return mo3418f().mo3368c(str, obj);
    }

    /* renamed from: c */
    public void mo3369c() {
        try {
            mo3418f().mo3369c();
        } catch (IOException e) {
            C0727a.m3263a(f2560a, "purgeUnexpectedResources", (Throwable) e);
        }
    }

    /* renamed from: d */
    public Collection<C0679a> mo3370d() {
        return mo3418f().mo3370d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3417e() {
        if (this.f2565f.f2566a != null && this.f2565f.f2567b != null) {
            C0700a.m3214b(this.f2565f.f2567b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized C0678h mo3418f() {
        C0678h hVar;
        if (m3171h()) {
            mo3417e();
            m3170g();
        }
        hVar = this.f2565f.f2566a;
        C0718j.m3240a(hVar);
        return hVar;
    }

    public long remove(String str) {
        return mo3418f().remove(str);
    }
}
