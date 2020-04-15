package p032c.p033a.p074i.p084h;

import java.util.Map;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p073h.C0883c;
import p032c.p033a.p073h.C0885d;
import p032c.p033a.p074i.p081e.C0939b;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0987c;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p086j.C0990f;
import p032c.p033a.p074i.p086j.C0991g;
import p032c.p033a.p074i.p088l.C0999e;

/* renamed from: c.a.i.h.c */
public class C0975c implements C0976d {

    /* renamed from: a */
    private final C0976d f3427a;

    /* renamed from: b */
    private final C0976d f3428b;

    /* renamed from: c */
    private final C0999e f3429c;

    /* renamed from: d */
    private final C0976d f3430d;

    /* renamed from: e */
    private final Map<C0883c, C0976d> f3431e;

    public C0975c(C0976d dVar, C0976d dVar2, C0999e eVar) {
        this(dVar, dVar2, eVar, null);
    }

    public C0975c(C0976d dVar, C0976d dVar2, C0999e eVar, Map<C0883c, C0976d> map) {
        this.f3430d = new C0974b(this);
        this.f3427a = dVar;
        this.f3428b = dVar2;
        this.f3429c = eVar;
        this.f3431e = map;
    }

    /* renamed from: a */
    public C0986b mo4178a(C0988d dVar, int i, C0991g gVar, C0939b bVar) {
        C0976d dVar2 = bVar.f3230h;
        if (dVar2 != null) {
            return dVar2.mo4178a(dVar, i, gVar, bVar);
        }
        C0883c r = dVar.mo4219r();
        if (r == null || r == C0883c.f3126a) {
            r = C0885d.m3958c(dVar.mo4220s());
            dVar.mo4203a(r);
        }
        Map<C0883c, C0976d> map = this.f3431e;
        if (map != null) {
            C0976d dVar3 = (C0976d) map.get(r);
            if (dVar3 != null) {
                return dVar3.mo4178a(dVar, i, gVar, bVar);
            }
        }
        return this.f3430d.mo4178a(dVar, i, gVar, bVar);
    }

    /* renamed from: a */
    public C0987c mo4179a(C0988d dVar, C0939b bVar) {
        C0744b a = this.f3429c.mo4239a(dVar, bVar.f3229g, null);
        try {
            return new C0987c(a, C0990f.f3456a, dVar.mo4221t(), dVar.mo4217p());
        } finally {
            a.close();
        }
    }

    /* renamed from: b */
    public C0986b mo4180b(C0988d dVar, int i, C0991g gVar, C0939b bVar) {
        return this.f3428b.mo4178a(dVar, i, gVar, bVar);
    }

    /* renamed from: c */
    public C0986b mo4181c(C0988d dVar, int i, C0991g gVar, C0939b bVar) {
        if (!bVar.f3228f) {
            C0976d dVar2 = this.f3427a;
            if (dVar2 != null) {
                return dVar2.mo4178a(dVar, i, gVar, bVar);
            }
        }
        return mo4179a(dVar, bVar);
    }

    /* renamed from: d */
    public C0987c mo4182d(C0988d dVar, int i, C0991g gVar, C0939b bVar) {
        C0744b a = this.f3429c.mo4240a(dVar, bVar.f3229g, null, i);
        try {
            return new C0987c(a, gVar, dVar.mo4221t(), dVar.mo4217p());
        } finally {
            a.close();
        }
    }
}
