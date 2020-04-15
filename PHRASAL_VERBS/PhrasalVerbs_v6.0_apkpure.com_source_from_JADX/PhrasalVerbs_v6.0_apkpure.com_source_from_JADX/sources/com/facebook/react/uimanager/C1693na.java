package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.uimanager.na */
public class C1693na {

    /* renamed from: a */
    private static final Map<Class<?>, C1698e<?, ?>> f5047a = new HashMap();

    /* renamed from: b */
    private static final Map<Class<?>, C1697d<?>> f5048b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.na$a */
    private static class C1694a<T extends C1569E> implements C1697d<T> {

        /* renamed from: a */
        private final Map<String, C1715j> f5049a;

        private C1694a(Class<? extends C1569E> cls) {
            this.f5049a = C1705qa.m6590a(cls);
        }

        /* renamed from: a */
        public void mo5975a(C1569E e, String str, C1571G g) {
            C1715j jVar = (C1715j) this.f5049a.get(str);
            if (jVar != null) {
                jVar.mo5981a(e, g);
            }
        }

        /* renamed from: a */
        public void mo5976a(Map<String, String> map) {
            for (C1715j jVar : this.f5049a.values()) {
                map.put(jVar.mo5980a(), jVar.mo5983b());
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.na$b */
    private static class C1695b<T extends ViewManager, V extends View> implements C1698e<T, V> {

        /* renamed from: a */
        private final Map<String, C1715j> f5050a;

        private C1695b(Class<? extends ViewManager> cls) {
            this.f5050a = C1705qa.m6594b(cls);
        }

        /* renamed from: a */
        public void mo5977a(T t, V v, String str, C1571G g) {
            C1715j jVar = (C1715j) this.f5050a.get(str);
            if (jVar != null) {
                jVar.mo5982a(t, v, g);
            }
        }

        /* renamed from: a */
        public void mo5976a(Map<String, String> map) {
            for (C1715j jVar : this.f5050a.values()) {
                map.put(jVar.mo5980a(), jVar.mo5983b());
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.na$c */
    public interface C1696c {
        /* renamed from: a */
        void mo5976a(Map<String, String> map);
    }

    /* renamed from: com.facebook.react.uimanager.na$d */
    public interface C1697d<T extends C1569E> extends C1696c {
        /* renamed from: a */
        void mo5975a(T t, String str, C1571G g);
    }

    /* renamed from: com.facebook.react.uimanager.na$e */
    public interface C1698e<T extends ViewManager, V extends View> extends C1696c {
        /* renamed from: a */
        void mo5977a(T t, V v, String str, C1571G g);
    }

    /* renamed from: a */
    private static <T> T m6547a(Class<?> cls) {
        String name = cls.getName();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("$$PropsSetter");
            return Class.forName(sb.toString()).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find generated setter for ");
            sb2.append(cls);
            C0727a.m3284d("ViewManagerPropertyUpdater", sb2.toString());
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate methods getter for ");
            sb3.append(name);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m6548a(Class<? extends ViewManager> cls, Class<? extends C1569E> cls2) {
        HashMap hashMap = new HashMap();
        m6552b(cls).mo5976a(hashMap);
        m6553c(cls2).mo5976a(hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static void m6549a() {
        C1705qa.m6591a();
        f5047a.clear();
        f5048b.clear();
    }

    /* renamed from: a */
    public static <T extends C1569E> void m6550a(T t, C1571G g) {
        C1697d c = m6553c(t.getClass());
        ReadableMapKeySetIterator keySetIterator = g.f4775a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            c.mo5975a(t, keySetIterator.nextKey(), g);
        }
    }

    /* renamed from: a */
    public static <T extends ViewManager, V extends View> void m6551a(T t, V v, C1571G g) {
        C1698e b = m6552b(t.getClass());
        ReadableMapKeySetIterator keySetIterator = g.f4775a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            b.mo5977a(t, v, keySetIterator.nextKey(), g);
        }
    }

    /* renamed from: b */
    private static <T extends ViewManager, V extends View> C1698e<T, V> m6552b(Class<? extends ViewManager> cls) {
        C1698e<T, V> eVar = (C1698e) f5047a.get(cls);
        if (eVar == null) {
            eVar = (C1698e) m6547a(cls);
            if (eVar == null) {
                eVar = new C1695b<>(cls);
            }
            f5047a.put(cls, eVar);
        }
        return eVar;
    }

    /* renamed from: c */
    private static <T extends C1569E> C1697d<T> m6553c(Class<? extends C1569E> cls) {
        C1697d<T> dVar = (C1697d) f5048b.get(cls);
        if (dVar == null) {
            dVar = (C1697d) m6547a(cls);
            if (dVar == null) {
                dVar = new C1694a<>(cls);
            }
            f5048b.put(cls, dVar);
        }
        return dVar;
    }
}
