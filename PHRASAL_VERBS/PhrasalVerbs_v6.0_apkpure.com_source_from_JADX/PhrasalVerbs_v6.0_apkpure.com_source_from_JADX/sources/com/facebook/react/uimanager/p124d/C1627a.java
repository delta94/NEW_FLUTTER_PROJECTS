package com.facebook.react.uimanager.p124d;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p032c.p033a.p098m.C1226m;

/* renamed from: com.facebook.react.uimanager.d.a */
public class C1627a {

    /* renamed from: a */
    private static final List<C1629b> f4882a = new ArrayList();

    /* renamed from: b */
    private static final Map<C1628a, Set<String>> f4883b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.d.a$a */
    public interface C1628a {
        /* renamed from: a */
        void mo5861a(View view, String str);
    }

    /* renamed from: com.facebook.react.uimanager.d.a$b */
    public interface C1629b {
        /* renamed from: a */
        String mo5862a();

        /* renamed from: a */
        void mo5863a(View view);
    }

    /* renamed from: a */
    public static void m6382a(View view) {
        String b = m6383b(view);
        if (b != null) {
            Iterator it = f4882a.iterator();
            while (it.hasNext()) {
                C1629b bVar = (C1629b) it.next();
                if (b != null && b.equals(bVar.mo5862a())) {
                    bVar.mo5863a(view);
                    it.remove();
                }
            }
            for (Entry entry : f4883b.entrySet()) {
                Set set = (Set) entry.getValue();
                if (set != null && set.contains(b)) {
                    ((C1628a) entry.getKey()).mo5861a(view, b);
                }
            }
        }
    }

    /* renamed from: b */
    private static String m6383b(View view) {
        Object tag = view.getTag(C1226m.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }
}
