package p032c.p033a.p074i.p087k;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.k.b */
public class C0993b implements C0994c {

    /* renamed from: a */
    private final List<C0994c> f3460a;

    public C0993b(Set<C0994c> set) {
        this.f3460a = new ArrayList(set.size());
        for (C0994c cVar : set) {
            if (cVar != null) {
                this.f3460a.add(cVar);
            }
        }
    }

    public C0993b(C0994c... cVarArr) {
        this.f3460a = new ArrayList(cVarArr.length);
        for (C0994c cVar : cVarArr) {
            if (cVar != null) {
                this.f3460a.add(cVar);
            }
        }
    }

    /* renamed from: a */
    private void m4453a(String str, Throwable th) {
        C0727a.m3267a("ForwardingRequestListener", str, th);
    }

    /* renamed from: a */
    public void mo4238a(C0994c cVar) {
        this.f3460a.add(cVar);
    }

    /* renamed from: a */
    public void mo3591a(C1114c cVar, Object obj, String str, boolean z) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo3591a(cVar, obj, str, z);
            } catch (Exception e) {
                m4453a("InternalListener exception in onRequestStart", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo3592a(C1114c cVar, String str, Throwable th, boolean z) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo3592a(cVar, str, th, z);
            } catch (Exception e) {
                m4453a("InternalListener exception in onRequestFailure", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo3593a(C1114c cVar, String str, boolean z) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo3593a(cVar, str, z);
            } catch (Exception e) {
                m4453a("InternalListener exception in onRequestSuccess", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo4232a(String str, String str2) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo4232a(str, str2);
            } catch (Exception e) {
                m4453a("InternalListener exception in onProducerStart", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo4233a(String str, String str2, String str3) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo4233a(str, str2, str3);
            } catch (Exception e) {
                m4453a("InternalListener exception in onIntermediateChunkStart", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo4234a(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo4234a(str, str2, th, map);
            } catch (Exception e) {
                m4453a("InternalListener exception in onProducerFinishWithFailure", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo4235a(String str, String str2, Map<String, String> map) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo4235a(str, str2, map);
            } catch (Exception e) {
                m4453a("InternalListener exception in onProducerFinishWithCancellation", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo3595a(String str, String str2, boolean z) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo3595a(str, str2, z);
            } catch (Exception e) {
                m4453a("InternalListener exception in onProducerFinishWithSuccess", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public boolean mo4236a(String str) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            if (((C0994c) this.f3460a.get(i)).mo4236a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo3594b(String str) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo3594b(str);
            } catch (Exception e) {
                m4453a("InternalListener exception in onRequestCancellation", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public void mo4237b(String str, String str2, Map<String, String> map) {
        int size = this.f3460a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C0994c) this.f3460a.get(i)).mo4237b(str, str2, map);
            } catch (Exception e) {
                m4453a("InternalListener exception in onProducerFinishWithSuccess", (Throwable) e);
            }
        }
    }
}
