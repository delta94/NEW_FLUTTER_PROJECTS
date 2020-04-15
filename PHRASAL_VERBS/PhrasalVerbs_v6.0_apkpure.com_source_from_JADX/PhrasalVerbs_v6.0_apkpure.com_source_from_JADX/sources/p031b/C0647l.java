package p031b;

/* renamed from: b.l */
public class C0647l<TResult> {

    /* renamed from: a */
    private final C0645k<TResult> f2455a = new C0645k<>();

    /* renamed from: a */
    public C0645k<TResult> mo3329a() {
        return this.f2455a;
    }

    /* renamed from: a */
    public void mo3330a(Exception exc) {
        if (!mo3333b(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: a */
    public void mo3331a(TResult tresult) {
        if (!mo3334b(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: b */
    public void mo3332b() {
        if (!mo3335c()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: b */
    public boolean mo3333b(Exception exc) {
        return this.f2455a.mo3322b(exc);
    }

    /* renamed from: b */
    public boolean mo3334b(TResult tresult) {
        return this.f2455a.mo3323b(tresult);
    }

    /* renamed from: c */
    public boolean mo3335c() {
        return this.f2455a.mo3327g();
    }
}
