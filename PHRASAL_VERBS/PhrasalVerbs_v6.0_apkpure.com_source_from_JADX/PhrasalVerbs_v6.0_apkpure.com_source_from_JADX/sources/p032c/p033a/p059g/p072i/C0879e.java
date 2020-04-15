package p032c.p033a.p059g.p072i;

import java.util.ArrayList;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p059g.p071h.C0871b;

/* renamed from: c.a.g.i.e */
public class C0879e<DH extends C0871b> {

    /* renamed from: a */
    boolean f3101a = false;

    /* renamed from: b */
    ArrayList<C0876b<DH>> f3102b = new ArrayList<>();

    /* renamed from: a */
    public void mo3937a() {
        if (this.f3101a) {
            for (int i = 0; i < this.f3102b.size(); i++) {
                ((C0876b) this.f3102b.get(i)).mo3911e();
            }
        }
        this.f3102b.clear();
    }

    /* renamed from: a */
    public void mo3938a(int i, C0876b<DH> bVar) {
        C0718j.m3240a(bVar);
        C0718j.m3238a(i, this.f3102b.size() + 1);
        this.f3102b.add(i, bVar);
        if (this.f3101a) {
            bVar.mo3910d();
        }
    }

    /* renamed from: a */
    public void mo3939a(C0876b<DH> bVar) {
        mo3938a(this.f3102b.size(), bVar);
    }

    /* renamed from: b */
    public void mo3940b() {
        if (!this.f3101a) {
            this.f3101a = true;
            for (int i = 0; i < this.f3102b.size(); i++) {
                ((C0876b) this.f3102b.get(i)).mo3910d();
            }
        }
    }

    /* renamed from: c */
    public void mo3941c() {
        if (this.f3101a) {
            this.f3101a = false;
            for (int i = 0; i < this.f3102b.size(); i++) {
                ((C0876b) this.f3102b.get(i)).mo3911e();
            }
        }
    }
}
