package android.support.p029v4.util;

import java.util.Map;

/* renamed from: android.support.v4.util.a */
class C0319a extends C0328j<K, V> {

    /* renamed from: d */
    final /* synthetic */ C0320b f948d;

    C0319a(C0320b bVar) {
        this.f948d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1313a(Object obj) {
        return this.f948d.mo1430a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo1314a(int i, int i2) {
        return this.f948d.f1000f[(i << 1) + i2];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo1315a(int i, V v) {
        return this.f948d.mo1432a(i, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1316a() {
        this.f948d.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1317a(int i) {
        this.f948d.mo1436c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1318a(K k, V v) {
        this.f948d.put(k, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1319b(Object obj) {
        return this.f948d.mo1434b(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<K, V> mo1320b() {
        return this.f948d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1321c() {
        return this.f948d.f1001g;
    }
}
