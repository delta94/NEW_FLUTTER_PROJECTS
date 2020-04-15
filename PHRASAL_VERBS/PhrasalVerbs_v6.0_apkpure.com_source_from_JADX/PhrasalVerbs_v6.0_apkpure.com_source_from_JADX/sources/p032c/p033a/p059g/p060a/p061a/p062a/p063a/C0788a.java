package p032c.p033a.p059g.p060a.p061a.p062a.p063a;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.C1264b;
import p032c.p033a.p059g.p060a.p061a.p062a.C0796g;
import p032c.p033a.p059g.p060a.p061a.p062a.C0797h;
import p032c.p033a.p059g.p065c.C0818f;
import p032c.p033a.p074i.p086j.C0989e;

/* renamed from: c.a.g.a.a.a.a.a */
public class C0788a extends C0818f<C0989e> {

    /* renamed from: b */
    private final C1264b f2709b;

    /* renamed from: c */
    private final C0797h f2710c;

    /* renamed from: d */
    private final C0796g f2711d;

    public C0788a(C1264b bVar, C0797h hVar, C0796g gVar) {
        this.f2709b = bVar;
        this.f2710c = hVar;
        this.f2711d = gVar;
    }

    /* renamed from: a */
    public void mo3584a(String str) {
        super.mo3584a(str);
        int a = this.f2710c.mo3603a();
        if (a != 3 && a != 5) {
            this.f2710c.mo3605a(this.f2709b.now());
            this.f2710c.mo3609a(str);
            this.f2710c.mo3610a(true);
            this.f2711d.mo3600a(this.f2710c, 4);
        }
    }

    /* renamed from: a */
    public void mo3587a(String str, C0989e eVar) {
        this.f2710c.mo3619d(this.f2709b.now());
        this.f2710c.mo3609a(str);
        this.f2710c.mo3606a(eVar);
        this.f2711d.mo3600a(this.f2710c, 2);
    }

    /* renamed from: a */
    public void mo3588a(String str, C0989e eVar, Animatable animatable) {
        this.f2710c.mo3617c(this.f2709b.now());
        this.f2710c.mo3609a(str);
        this.f2710c.mo3606a(eVar);
        this.f2710c.mo3618c(true);
        this.f2711d.mo3600a(this.f2710c, 3);
    }

    /* renamed from: a */
    public void mo3589a(String str, Throwable th) {
        this.f2710c.mo3613b(this.f2709b.now());
        this.f2710c.mo3609a(str);
        this.f2710c.mo3618c(false);
        this.f2711d.mo3600a(this.f2710c, 5);
    }

    /* renamed from: b */
    public void mo3590b(String str, Object obj) {
        this.f2710c.mo3620e(this.f2709b.now());
        this.f2710c.mo3609a(str);
        this.f2710c.mo3608a(obj);
        this.f2711d.mo3600a(this.f2710c, 0);
    }
}
