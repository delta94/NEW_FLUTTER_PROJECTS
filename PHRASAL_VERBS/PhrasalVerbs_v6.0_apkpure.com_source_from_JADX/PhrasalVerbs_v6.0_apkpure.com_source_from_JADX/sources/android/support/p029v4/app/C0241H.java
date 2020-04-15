package android.support.p029v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p029v4.util.C0320b;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.app.H */
class C0241H {

    /* renamed from: a */
    private static final int[] f646a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0253Q f647b = (VERSION.SDK_INT >= 21 ? new C0249M() : null);

    /* renamed from: c */
    private static final C0253Q f648c = m859a();

    /* renamed from: android.support.v4.app.H$a */
    static class C0242a {

        /* renamed from: a */
        public C0276j f649a;

        /* renamed from: b */
        public boolean f650b;

        /* renamed from: c */
        public C0268c f651c;

        /* renamed from: d */
        public C0276j f652d;

        /* renamed from: e */
        public boolean f653e;

        /* renamed from: f */
        public C0268c f654f;

        C0242a() {
        }
    }

    /* renamed from: a */
    private static C0242a m858a(C0242a aVar, SparseArray<C0242a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0242a aVar2 = new C0242a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static C0253Q m859a() {
        try {
            return (C0253Q) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C0253Q m860a(C0276j jVar, C0276j jVar2) {
        ArrayList arrayList = new ArrayList();
        if (jVar != null) {
            Object n = jVar.mo1052n();
            if (n != null) {
                arrayList.add(n);
            }
            Object v = jVar.mo1064v();
            if (v != null) {
                arrayList.add(v);
            }
            Object x = jVar.mo1066x();
            if (x != null) {
                arrayList.add(x);
            }
        }
        if (jVar2 != null) {
            Object l = jVar2.mo1048l();
            if (l != null) {
                arrayList.add(l);
            }
            Object t = jVar2.mo1061t();
            if (t != null) {
                arrayList.add(t);
            }
            Object w = jVar2.mo1065w();
            if (w != null) {
                arrayList.add(w);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0253Q q = f647b;
        if (q != null && m881a(q, (List<Object>) arrayList)) {
            return f647b;
        }
        C0253Q q2 = f648c;
        if (q2 != null && m881a(q2, (List<Object>) arrayList)) {
            return f648c;
        }
        if (f647b == null && f648c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0320b<String, String> m861a(int i, ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C0320b<String, String> bVar = new C0320b<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0268c cVar = (C0268c) arrayList.get(i4);
            if (cVar.mo937b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList<String> arrayList5 = cVar.f718r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = cVar.f718r;
                        arrayList4 = cVar.f719s;
                    } else {
                        ArrayList arrayList6 = cVar.f718r;
                        arrayList3 = cVar.f719s;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) bVar.remove(str2);
                        if (str3 != null) {
                            bVar.put(str, str3);
                        } else {
                            bVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    static C0320b<String, View> m862a(C0253Q q, C0320b<String, String> bVar, Object obj, C0242a aVar) {
        C0258W w;
        ArrayList<String> arrayList;
        C0276j jVar = aVar.f649a;
        View z = jVar.mo1068z();
        if (bVar.isEmpty() || obj == null || z == null) {
            bVar.clear();
            return null;
        }
        C0320b<String, View> bVar2 = new C0320b<>();
        q.mo906a((Map<String, View>) bVar2, z);
        C0268c cVar = aVar.f651c;
        if (aVar.f650b) {
            w = jVar.mo1053o();
            arrayList = cVar.f718r;
        } else {
            w = jVar.mo1050m();
            arrayList = cVar.f719s;
        }
        if (arrayList != null) {
            bVar2.mo1322a(arrayList);
            bVar2.mo1322a(bVar.values());
        }
        if (w != null) {
            w.mo912a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) bVar2.get(str);
                if (view == null) {
                    String a = m868a(bVar, str);
                    if (a != null) {
                        bVar.remove(a);
                    }
                } else if (!str.equals(C0156v.m571l(view))) {
                    String a2 = m868a(bVar, str);
                    if (a2 != null) {
                        bVar.put(a2, C0156v.m571l(view));
                    }
                }
            }
        } else {
            m878a(bVar, bVar2);
        }
        return bVar2;
    }

    /* renamed from: a */
    static View m863a(C0320b<String, View> bVar, C0242a aVar, Object obj, boolean z) {
        C0268c cVar = aVar.f651c;
        if (!(obj == null || bVar == null)) {
            ArrayList<String> arrayList = cVar.f718r;
            if (arrayList != null && !arrayList.isEmpty()) {
                return (View) bVar.get((String) (z ? cVar.f718r : cVar.f719s).get(0));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m864a(C0253Q q, C0276j jVar, C0276j jVar2, boolean z) {
        if (jVar == null || jVar2 == null) {
            return null;
        }
        return q.mo895c(q.mo890b(z ? jVar2.mo1066x() : jVar.mo1065w()));
    }

    /* renamed from: a */
    private static Object m865a(C0253Q q, C0276j jVar, boolean z) {
        if (jVar == null) {
            return null;
        }
        return q.mo890b(z ? jVar.mo1061t() : jVar.mo1048l());
    }

    /* renamed from: a */
    private static Object m866a(C0253Q q, ViewGroup viewGroup, View view, C0320b<String, String> bVar, C0242a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0320b<String, String> bVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0253Q q2 = q;
        C0242a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        C0276j jVar = aVar2.f649a;
        C0276j jVar2 = aVar2.f652d;
        if (jVar == null || jVar2 == null) {
            return null;
        }
        boolean z = aVar2.f650b;
        if (bVar.isEmpty()) {
            bVar2 = bVar;
            obj3 = null;
        } else {
            obj3 = m864a(q2, jVar, jVar2, z);
            bVar2 = bVar;
        }
        C0320b b = m882b(q2, bVar2, obj3, aVar2);
        if (bVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m875a(jVar, jVar2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            q2.mo893b(obj4, view, arrayList3);
            m872a(q, obj4, obj2, b, aVar2.f653e, aVar2.f654f);
            if (obj5 != null) {
                q2.mo883a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0240G g = r0;
        C0240G g2 = new C0240G(q, bVar, obj4, aVar, arrayList2, view, jVar, jVar2, z, arrayList, obj, rect);
        C0257V.m954a(viewGroup, g);
        return obj4;
    }

    /* renamed from: a */
    private static Object m867a(C0253Q q, Object obj, Object obj2, Object obj3, C0276j jVar, boolean z) {
        boolean z2 = (obj == null || obj2 == null || jVar == null) ? true : z ? jVar.mo1036f() : jVar.mo1032e();
        return z2 ? q.mo891b(obj2, obj, obj3) : q.mo881a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m868a(C0320b<String, String> bVar, String str) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(bVar.mo1440d(i))) {
                return (String) bVar.mo1435b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static ArrayList<View> m869a(C0253Q q, Object obj, C0276j jVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View z = jVar.mo1068z();
        if (z != null) {
            q.mo905a(arrayList2, z);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        q.mo887a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    private static void m870a(C0253Q q, ViewGroup viewGroup, C0276j jVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        C0238E e = new C0238E(obj, q, view, jVar, arrayList, arrayList2, arrayList3, obj2);
        ViewGroup viewGroup2 = viewGroup;
        C0257V.m954a(viewGroup, e);
    }

    /* renamed from: a */
    private static void m871a(C0253Q q, Object obj, C0276j jVar, ArrayList<View> arrayList) {
        if (jVar != null && obj != null && jVar.f788m && jVar.f756C && jVar.f770Q) {
            jVar.mo1035f(true);
            q.mo885a(obj, jVar.mo1068z(), arrayList);
            C0257V.m954a(jVar.f763J, new C0237D(arrayList));
        }
    }

    /* renamed from: a */
    private static void m872a(C0253Q q, Object obj, Object obj2, C0320b<String, View> bVar, boolean z, C0268c cVar) {
        ArrayList<String> arrayList = cVar.f718r;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = (View) bVar.get((String) (z ? cVar.f719s : cVar.f718r).get(0));
            q.mo896c(obj, view);
            if (obj2 != null) {
                q.mo896c(obj2, view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.f788m != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0074, code lost:
        if (r10.f771R >= 0.0f) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0080, code lost:
        if (r10.f756C == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.f756C == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m873a(android.support.p029v4.app.C0268c r16, android.support.p029v4.app.C0268c.C0269a r17, android.util.SparseArray<android.support.p029v4.app.C0241H.C0242a> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            android.support.v4.app.j r10 = r1.f723b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.f754A
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f646a
            int r1 = r1.f722a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f722a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0087
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0087
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x009a
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.f770Q
            if (r1 == 0) goto L_0x0096
            boolean r1 = r10.f756C
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.f788m
            if (r1 == 0) goto L_0x0096
            goto L_0x0094
        L_0x0044:
            boolean r1 = r10.f756C
            goto L_0x0097
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.f770Q
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f788m
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f756C
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.f788m
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f756C
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            if (r20 == 0) goto L_0x007a
            boolean r1 = r10.f788m
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.f764K
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.f771R
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0083
        L_0x0078:
            r1 = 0
            goto L_0x0083
        L_0x007a:
            boolean r1 = r10.f788m
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.f756C
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0083:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x009a
        L_0x0087:
            if (r20 == 0) goto L_0x008c
            boolean r1 = r10.f769P
            goto L_0x0097
        L_0x008c:
            boolean r1 = r10.f788m
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.f756C
            if (r1 != 0) goto L_0x0096
        L_0x0094:
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x009a:
            java.lang.Object r6 = r2.get(r11)
            android.support.v4.app.H$a r6 = (android.support.p029v4.app.C0241H.C0242a) r6
            if (r4 == 0) goto L_0x00ac
            android.support.v4.app.H$a r6 = m858a(r6, r2, r11)
            r6.f649a = r10
            r6.f650b = r3
            r6.f651c = r0
        L_0x00ac:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d3
            if (r14 == 0) goto L_0x00ba
            android.support.v4.app.j r1 = r14.f652d
            if (r1 != r10) goto L_0x00ba
            r14.f652d = r15
        L_0x00ba:
            android.support.v4.app.w r4 = r0.f701a
            int r1 = r10.f778c
            if (r1 >= r5) goto L_0x00d3
            int r1 = r4.f883r
            if (r1 < r5) goto L_0x00d3
            boolean r1 = r0.f720t
            if (r1 != 0) goto L_0x00d3
            r4.mo1214f(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.mo1181a(r5, r6, r7, r8, r9)
        L_0x00d3:
            if (r13 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00db
            android.support.v4.app.j r1 = r14.f652d
            if (r1 != 0) goto L_0x00e5
        L_0x00db:
            android.support.v4.app.H$a r14 = m858a(r14, r2, r11)
            r14.f652d = r10
            r14.f653e = r3
            r14.f654f = r0
        L_0x00e5:
            if (r20 != 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00f1
            android.support.v4.app.j r0 = r14.f649a
            if (r0 != r10) goto L_0x00f1
            r14.f649a = r15
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.app.C0241H.m873a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m874a(C0268c cVar, SparseArray<C0242a> sparseArray, boolean z) {
        int size = cVar.f702b.size();
        for (int i = 0; i < size; i++) {
            m873a(cVar, (C0269a) cVar.f702b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    static void m875a(C0276j jVar, C0276j jVar2, boolean z, C0320b<String, View> bVar, boolean z2) {
        C0258W m = z ? jVar2.mo1050m() : jVar.mo1050m();
        if (m != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = bVar == null ? 0 : bVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(bVar.mo1435b(i));
                arrayList.add(bVar.mo1440d(i));
            }
            if (z2) {
                m.mo913b(arrayList2, arrayList, null);
            } else {
                m.mo911a(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    private static void m876a(C0297w wVar, int i, C0242a aVar, View view, C0320b<String, String> bVar) {
        Object obj;
        C0297w wVar2 = wVar;
        C0242a aVar2 = aVar;
        View view2 = view;
        C0320b<String, String> bVar2 = bVar;
        ViewGroup viewGroup = wVar2.f885t.mo969a() ? (ViewGroup) wVar2.f885t.mo968a(i) : null;
        if (viewGroup != null) {
            C0276j jVar = aVar2.f649a;
            C0276j jVar2 = aVar2.f652d;
            C0253Q a = m860a(jVar2, jVar);
            if (a != null) {
                boolean z = aVar2.f650b;
                boolean z2 = aVar2.f653e;
                Object a2 = m865a(a, jVar, z);
                Object b = m883b(a, jVar2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b;
                Object obj3 = a2;
                C0253Q q = a;
                Object a3 = m866a(a, viewGroup, view, bVar, aVar, arrayList, arrayList2, a2, obj2);
                Object obj4 = obj3;
                if (obj4 == null && a3 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList a4 = m869a(q, obj, jVar2, arrayList3, view2);
                Object obj5 = (a4 == null || a4.isEmpty()) ? null : obj;
                q.mo884a(obj4, view2);
                Object a5 = m867a(q, obj4, obj5, a3, jVar, aVar2.f650b);
                if (a5 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    C0253Q q2 = q;
                    q2.mo886a(a5, obj4, arrayList4, obj5, a4, a3, arrayList2);
                    m870a(q2, viewGroup, jVar, view, arrayList2, obj4, arrayList4, obj5, a4);
                    ArrayList arrayList5 = arrayList2;
                    q.mo903a((View) viewGroup, arrayList5, (Map<String, String>) bVar2);
                    q.mo882a(viewGroup, a5);
                    q.mo904a(viewGroup, arrayList5, (Map<String, String>) bVar2);
                }
            }
        }
    }

    /* renamed from: a */
    static void m877a(C0297w wVar, ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (wVar.f883r >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0268c cVar = (C0268c) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    m885b(cVar, sparseArray, z);
                } else {
                    m874a(cVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(wVar.f884s.mo1139c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0320b a = m861a(keyAt, arrayList, arrayList2, i, i2);
                    C0242a aVar = (C0242a) sparseArray.valueAt(i4);
                    if (z) {
                        m886b(wVar, keyAt, aVar, view, a);
                    } else {
                        m876a(wVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m878a(C0320b<String, String> bVar, C0320b<String, View> bVar2) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            if (!bVar2.containsKey((String) bVar.mo1440d(size))) {
                bVar.mo1436c(size);
            }
        }
    }

    /* renamed from: a */
    static void m879a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static void m880a(ArrayList<View> arrayList, C0320b<String, View> bVar, Collection<String> collection) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            View view = (View) bVar.mo1440d(size);
            if (collection.contains(C0156v.m571l(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static boolean m881a(C0253Q q, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!q.mo889a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0320b<String, View> m882b(C0253Q q, C0320b<String, String> bVar, Object obj, C0242a aVar) {
        C0258W w;
        ArrayList<String> arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        C0276j jVar = aVar.f652d;
        C0320b<String, View> bVar2 = new C0320b<>();
        q.mo906a((Map<String, View>) bVar2, jVar.mo1068z());
        C0268c cVar = aVar.f654f;
        if (aVar.f653e) {
            w = jVar.mo1050m();
            arrayList = cVar.f719s;
        } else {
            w = jVar.mo1053o();
            arrayList = cVar.f718r;
        }
        bVar2.mo1322a(arrayList);
        if (w != null) {
            w.mo912a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) bVar2.get(str);
                if (view == null) {
                    bVar.remove(str);
                } else if (!str.equals(C0156v.m571l(view))) {
                    bVar.put(C0156v.m571l(view), (String) bVar.remove(str));
                }
            }
        } else {
            bVar.mo1322a(bVar2.keySet());
        }
        return bVar2;
    }

    /* renamed from: b */
    private static Object m883b(C0253Q q, C0276j jVar, boolean z) {
        if (jVar == null) {
            return null;
        }
        return q.mo890b(z ? jVar.mo1064v() : jVar.mo1052n());
    }

    /* renamed from: b */
    private static Object m884b(C0253Q q, ViewGroup viewGroup, View view, C0320b<String, String> bVar, C0242a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        C0253Q q2 = q;
        View view3 = view;
        C0320b<String, String> bVar2 = bVar;
        C0242a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        C0276j jVar = aVar2.f649a;
        C0276j jVar2 = aVar2.f652d;
        if (jVar != null) {
            jVar.mo1068z().setVisibility(0);
        }
        if (jVar == null || jVar2 == null) {
            return null;
        }
        boolean z = aVar2.f650b;
        Object a = bVar.isEmpty() ? null : m864a(q, jVar, jVar2, z);
        C0320b b = m882b(q, bVar2, a, aVar2);
        C0320b a2 = m862a(q, bVar2, a, aVar2);
        if (bVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a2 != null) {
                a2.clear();
            }
            obj3 = null;
        } else {
            m880a(arrayList3, b, (Collection<String>) bVar.keySet());
            m880a(arrayList4, a2, bVar.values());
            obj3 = a;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m875a(jVar, jVar2, z, b, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            q.mo893b(obj3, view3, arrayList3);
            m872a(q, obj3, obj2, b, aVar2.f653e, aVar2.f654f);
            Rect rect2 = new Rect();
            View a3 = m863a(a2, aVar2, obj4, z);
            if (a3 != null) {
                q.mo883a(obj4, rect2);
            }
            rect = rect2;
            view2 = a3;
        } else {
            view2 = null;
            rect = null;
        }
        C0239F f = new C0239F(jVar, jVar2, z, a2, view2, q, rect);
        C0257V.m954a(viewGroup, f);
        return obj3;
    }

    /* renamed from: b */
    public static void m885b(C0268c cVar, SparseArray<C0242a> sparseArray, boolean z) {
        if (cVar.f701a.f885t.mo969a()) {
            for (int size = cVar.f702b.size() - 1; size >= 0; size--) {
                m873a(cVar, (C0269a) cVar.f702b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    private static void m886b(C0297w wVar, int i, C0242a aVar, View view, C0320b<String, String> bVar) {
        Object obj;
        C0297w wVar2 = wVar;
        C0242a aVar2 = aVar;
        View view2 = view;
        ViewGroup viewGroup = wVar2.f885t.mo969a() ? (ViewGroup) wVar2.f885t.mo968a(i) : null;
        if (viewGroup != null) {
            C0276j jVar = aVar2.f649a;
            C0276j jVar2 = aVar2.f652d;
            C0253Q a = m860a(jVar2, jVar);
            if (a != null) {
                boolean z = aVar2.f650b;
                boolean z2 = aVar2.f653e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m865a(a, jVar, z);
                Object b = m883b(a, jVar2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                Object b2 = m884b(a, viewGroup, view, bVar, aVar, arrayList2, arrayList, a2, b);
                Object obj3 = obj2;
                if (obj3 == null && b2 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList a3 = m869a(a, obj, jVar2, arrayList3, view2);
                ArrayList a4 = m869a(a, obj3, jVar, arrayList, view2);
                m879a(a4, 4);
                C0276j jVar3 = jVar;
                ArrayList arrayList4 = a3;
                Object a5 = m867a(a, obj3, obj, b2, jVar3, z);
                if (a5 != null) {
                    m871a(a, obj, jVar2, arrayList4);
                    ArrayList a6 = a.mo900a(arrayList);
                    a.mo886a(a5, obj3, a4, obj, arrayList4, b2, arrayList);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo882a(viewGroup3, a5);
                    a.mo902a(viewGroup3, arrayList3, arrayList, a6, bVar);
                    m879a(a4, 0);
                    a.mo894b(b2, arrayList3, arrayList);
                }
            }
        }
    }
}
