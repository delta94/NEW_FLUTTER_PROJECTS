package android.support.p029v4.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.app.Q */
public abstract class C0253Q {
    /* renamed from: a */
    static String m917a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m918a(List<View> list, View view) {
        int size = list.size();
        if (!m920a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m920a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected static boolean m919a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m920a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo881a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ArrayList<String> mo900a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C0156v.m571l(view));
            C0156v.m550a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo901a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo902a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String l = C0156v.m571l(view2);
            arrayList4.add(l);
            if (l != null) {
                C0156v.m550a(view2, (String) null);
                String str = (String) map.get(l);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0156v.m550a((View) arrayList2.get(i2), l);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0250N n = new C0250N(this, size, arrayList2, arrayList3, arrayList, arrayList4);
        C0257V.m954a(view, n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo903a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C0257V.m954a(view, new C0251O(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo882a(ViewGroup viewGroup, Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo904a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C0257V.m954a(viewGroup, new C0252P(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo883a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo884a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo885a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo886a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo887a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo888a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.view.ViewGroup] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.view.View, code=null, for r5v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2, types: [android.view.ViewGroup]
      assigns: [android.view.ViewGroup, android.view.View]
      uses: [android.view.ViewGroup, java.lang.Object, android.view.View, ?[OBJECT, ARRAY]]
      mth insns count: 17
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo905a(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
        /*
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0027
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0024
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = p000a.p005b.p009c.p018g.C0160x.m592a(r5)
            if (r0 == 0) goto L_0x0013
            goto L_0x0024
        L_0x0013:
            int r0 = r5.getChildCount()
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x0027
            android.view.View r2 = r5.getChildAt(r1)
            r3.mo905a(r4, r2)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            r4.add(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.app.C0253Q.mo905a(java.util.ArrayList, android.view.View):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo906a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String l = C0156v.m571l(view);
            if (l != null) {
                map.put(l, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo906a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo889a(Object obj);

    /* renamed from: b */
    public abstract Object mo890b(Object obj);

    /* renamed from: b */
    public abstract Object mo891b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo892b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo893b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo894b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo895c(Object obj);

    /* renamed from: c */
    public abstract void mo896c(Object obj, View view);
}
