package android.support.p029v4.util;

import java.util.Map;

/* renamed from: android.support.v4.util.c */
class C0321c extends C0328j<E, E> {

    /* renamed from: d */
    final /* synthetic */ C0322d f950d;

    C0321c(C0322d dVar) {
        this.f950d = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1313a(Object obj) {
        return this.f950d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo1314a(int i, int i2) {
        return this.f950d.f958h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public E mo1315a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1316a() {
        this.f950d.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1317a(int i) {
        this.f950d.mo1330b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1318a(E e, E e2) {
        this.f950d.add(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1319b(Object obj) {
        return this.f950d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<E, E> mo1320b() {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1321c() {
        return this.f950d.f959i;
    }
}
