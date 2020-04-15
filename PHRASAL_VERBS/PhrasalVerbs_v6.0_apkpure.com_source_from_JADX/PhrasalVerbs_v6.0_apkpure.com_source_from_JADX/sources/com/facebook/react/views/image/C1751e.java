package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.List;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p035b.p036a.C0659f;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p079c.C0900f;
import p032c.p033a.p074i.p091o.C1119e;

/* renamed from: com.facebook.react.views.image.e */
public class C1751e implements C1119e {

    /* renamed from: a */
    private final List<C1119e> f5148a;

    private C1751e(List<C1119e> list) {
        this.f5148a = new LinkedList(list);
    }

    /* renamed from: a */
    public static C1119e m6737a(List<C1119e> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C1751e(list) : (C1119e) list.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public C0657d mo4246a() {
        LinkedList linkedList = new LinkedList();
        for (C1119e a : this.f5148a) {
            linkedList.push(a.mo4246a());
        }
        return new C0659f(linkedList);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public C0744b<Bitmap> mo4353a(Bitmap bitmap, C0900f fVar) {
        C0744b bVar = null;
        try {
            C0744b bVar2 = null;
            for (C1119e a : this.f5148a) {
                bVar = a.mo4353a(bVar2 != null ? (Bitmap) bVar2.mo3520n() : bitmap, fVar);
                C0744b.m3336b(bVar2);
                bVar2 = bVar.clone();
            }
            C0744b<Bitmap> clone = bVar.clone();
            C0744b.m3336b(bVar);
            return clone;
        } catch (Throwable th) {
            C0744b.m3336b(null);
            throw th;
        }
    }

    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (C1119e eVar : this.f5148a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(eVar.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}
