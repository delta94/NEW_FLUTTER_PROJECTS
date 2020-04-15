package p032c.p033a.p035b.p036a;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import p032c.p033a.p038c.p049k.C0755c;

/* renamed from: c.a.b.a.e */
public final class C0658e {
    /* renamed from: a */
    public static String m3040a(C0657d dVar) {
        try {
            return dVar instanceof C0659f ? m3042c((C0657d) ((C0659f) dVar).mo3354b().get(0)) : m3042c(dVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static List<String> m3041b(C0657d dVar) {
        try {
            if (dVar instanceof C0659f) {
                List b = ((C0659f) dVar).mo3354b();
                ArrayList arrayList = new ArrayList(b.size());
                for (int i = 0; i < b.size(); i++) {
                    arrayList.add(m3042c((C0657d) b.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(m3042c(dVar));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static String m3042c(C0657d dVar) {
        return C0755c.m3368a(dVar.mo3352a().getBytes("UTF-8"));
    }
}
