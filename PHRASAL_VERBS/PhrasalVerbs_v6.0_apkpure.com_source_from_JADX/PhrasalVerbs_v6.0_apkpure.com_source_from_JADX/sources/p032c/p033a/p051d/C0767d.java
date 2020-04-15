package p032c.p033a.p051d;

/* renamed from: c.a.d.d */
public abstract class C0767d<T> implements C0771h<T> {
    /* renamed from: a */
    public void mo3563a(C0768e<T> eVar) {
    }

    /* renamed from: b */
    public void mo3564b(C0768e<T> eVar) {
        try {
            mo3567e(eVar);
        } finally {
            eVar.close();
        }
    }

    /* renamed from: c */
    public void mo3565c(C0768e<T> eVar) {
        boolean b = eVar.mo3555b();
        try {
            mo3568f(eVar);
        } finally {
            if (b) {
                eVar.close();
            }
        }
    }

    /* renamed from: d */
    public void mo3566d(C0768e<T> eVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo3567e(C0768e<T> eVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo3568f(C0768e<T> eVar);
}
