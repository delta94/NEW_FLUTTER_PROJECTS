package p032c.p033a.p059g.p060a.p061a.p062a;

import com.facebook.common.time.C1264b;
import java.util.LinkedList;
import java.util.List;
import p032c.p033a.p059g.p060a.p061a.C0800d;
import p032c.p033a.p059g.p060a.p061a.p062a.p063a.C0788a;
import p032c.p033a.p059g.p060a.p061a.p062a.p063a.C0789b;
import p032c.p033a.p059g.p060a.p061a.p062a.p063a.C0790c;
import p032c.p033a.p059g.p065c.C0819g;
import p032c.p033a.p074i.p087k.C0992a;
import p032c.p033a.p074i.p087k.C0993b;
import p032c.p033a.p074i.p087k.C0994c;

/* renamed from: c.a.g.a.a.a.g */
public class C0796g extends C0992a {

    /* renamed from: a */
    private final C0800d f2734a;

    /* renamed from: b */
    private final C1264b f2735b;

    /* renamed from: c */
    private final C0797h f2736c = new C0797h();

    /* renamed from: d */
    private C0792c f2737d;

    /* renamed from: e */
    private C0791b f2738e;

    /* renamed from: f */
    private C0790c f2739f;

    /* renamed from: g */
    private C0788a f2740g;

    /* renamed from: h */
    private C0993b f2741h;

    /* renamed from: i */
    private List<C0795f> f2742i;

    /* renamed from: j */
    private boolean f2743j;

    public C0796g(C1264b bVar, C0800d dVar) {
        this.f2735b = bVar;
        this.f2734a = dVar;
    }

    /* renamed from: c */
    private void m3504c() {
        if (this.f2740g == null) {
            this.f2740g = new C0788a(this.f2735b, this.f2736c, this);
        }
        if (this.f2739f == null) {
            this.f2739f = new C0790c(this.f2735b, this.f2736c);
        }
        if (this.f2738e == null) {
            this.f2738e = new C0789b(this.f2736c, this);
        }
        C0792c cVar = this.f2737d;
        if (cVar == null) {
            this.f2737d = new C0792c(this.f2734a.mo3688l(), this.f2738e);
        } else {
            cVar.mo3596c(this.f2734a.mo3688l());
        }
        if (this.f2741h == null) {
            this.f2741h = new C0993b(this.f2739f, this.f2737d);
        }
    }

    /* renamed from: a */
    public void mo3598a() {
        List<C0795f> list = this.f2742i;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: a */
    public void mo3599a(C0795f fVar) {
        if (fVar != null) {
            if (this.f2742i == null) {
                this.f2742i = new LinkedList();
            }
            this.f2742i.add(fVar);
        }
    }

    /* renamed from: a */
    public void mo3600a(C0797h hVar, int i) {
        hVar.mo3604a(i);
        if (this.f2743j) {
            List<C0795f> list = this.f2742i;
            if (list != null && !list.isEmpty()) {
                C0794e c = hVar.mo3616c();
                for (C0795f a : this.f2742i) {
                    a.mo3597a(c, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3601a(boolean z) {
        this.f2743j = z;
        if (z) {
            m3504c();
            C0791b bVar = this.f2738e;
            if (bVar != null) {
                this.f2734a.mo3631a(bVar);
            }
            C0788a aVar = this.f2740g;
            if (aVar != null) {
                this.f2734a.mo3670a((C0819g<? super INFO>) aVar);
            }
            C0993b bVar2 = this.f2741h;
            if (bVar2 != null) {
                this.f2734a.mo3634a((C0994c) bVar2);
                return;
            }
            return;
        }
        C0791b bVar3 = this.f2738e;
        if (bVar3 != null) {
            this.f2734a.mo3637b(bVar3);
        }
        C0788a aVar2 = this.f2740g;
        if (aVar2 != null) {
            this.f2734a.mo3680b((C0819g<? super INFO>) aVar2);
        }
        C0993b bVar4 = this.f2741h;
        if (bVar4 != null) {
            this.f2734a.mo3638b((C0994c) bVar4);
        }
    }

    /* renamed from: b */
    public void mo3602b() {
        mo3598a();
        mo3601a(false);
        this.f2736c.mo3611b();
    }
}
