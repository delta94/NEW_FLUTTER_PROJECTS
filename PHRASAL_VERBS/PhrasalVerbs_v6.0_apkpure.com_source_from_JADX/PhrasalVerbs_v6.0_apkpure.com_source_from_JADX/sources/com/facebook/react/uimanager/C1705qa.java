package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p121a.C1596b;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.uimanager.qa */
class C1705qa {

    /* renamed from: a */
    private static final Map<Class, Map<String, C1715j>> f5062a = new HashMap();

    /* renamed from: b */
    private static final Map<String, C1715j> f5063b = new HashMap();

    /* renamed from: com.facebook.react.uimanager.qa$a */
    private static class C1706a extends C1715j {
        public C1706a(C1595a aVar, Method method) {
            super(aVar, "Array", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return g.mo5671a(this.f5072e);
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$b */
    private static class C1707b extends C1715j {

        /* renamed from: i */
        private final boolean f5064i;

        public C1707b(C1595a aVar, Method method, boolean z) {
            super(aVar, "boolean", method);
            this.f5064i = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return g.mo5672a(this.f5072e, this.f5064i) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$c */
    private static class C1708c extends C1715j {
        public C1708c(C1595a aVar, Method method) {
            super(aVar, "boolean", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            if (g.mo5677f(this.f5072e)) {
                return null;
            }
            return g.mo5672a(this.f5072e, false) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$d */
    private static class C1709d extends C1715j {
        public C1709d(C1595a aVar, Method method) {
            super(aVar, "number", method);
        }

        public C1709d(C1596b bVar, Method method, int i) {
            super(bVar, "number", method, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            if (!g.mo5677f(this.f5072e)) {
                return Integer.valueOf(g.mo5670a(this.f5072e, 0));
            }
            return null;
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$e */
    private static class C1710e extends C1715j {

        /* renamed from: i */
        private final double f5065i;

        public C1710e(C1595a aVar, Method method, double d) {
            super(aVar, "number", method);
            this.f5065i = d;
        }

        public C1710e(C1596b bVar, Method method, int i, double d) {
            super(bVar, "number", method, i);
            this.f5065i = d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return Double.valueOf(g.mo5668a(this.f5072e, this.f5065i));
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$f */
    private static class C1711f extends C1715j {
        public C1711f(C1595a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        public C1711f(C1596b bVar, Method method, int i) {
            super(bVar, "mixed", method, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return g.mo5673b(this.f5072e);
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$g */
    private static class C1712g extends C1715j {

        /* renamed from: i */
        private final float f5066i;

        public C1712g(C1595a aVar, Method method, float f) {
            super(aVar, "number", method);
            this.f5066i = f;
        }

        public C1712g(C1596b bVar, Method method, int i, float f) {
            super(bVar, "number", method, i);
            this.f5066i = f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return Float.valueOf(g.mo5669a(this.f5072e, this.f5066i));
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$h */
    private static class C1713h extends C1715j {

        /* renamed from: i */
        private final int f5067i;

        public C1713h(C1595a aVar, Method method, int i) {
            super(aVar, "number", method);
            this.f5067i = i;
        }

        public C1713h(C1596b bVar, Method method, int i, int i2) {
            super(bVar, "number", method, i);
            this.f5067i = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return Integer.valueOf(g.mo5670a(this.f5072e, this.f5067i));
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$i */
    private static class C1714i extends C1715j {
        public C1714i(C1595a aVar, Method method) {
            super(aVar, "Map", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return g.mo5674c(this.f5072e);
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$j */
    static abstract class C1715j {

        /* renamed from: a */
        private static final Object[] f5068a = new Object[2];

        /* renamed from: b */
        private static final Object[] f5069b = new Object[3];

        /* renamed from: c */
        private static final Object[] f5070c = new Object[1];

        /* renamed from: d */
        private static final Object[] f5071d = new Object[2];

        /* renamed from: e */
        protected final String f5072e;

        /* renamed from: f */
        protected final String f5073f;

        /* renamed from: g */
        protected final Method f5074g;

        /* renamed from: h */
        protected final Integer f5075h;

        private C1715j(C1595a aVar, String str, Method method) {
            this.f5072e = aVar.name();
            if (!"__default_type__".equals(aVar.customType())) {
                str = aVar.customType();
            }
            this.f5073f = str;
            this.f5074g = method;
            this.f5075h = null;
        }

        private C1715j(C1596b bVar, String str, Method method, int i) {
            this.f5072e = bVar.names()[i];
            if (!"__default_type__".equals(bVar.customType())) {
                str = bVar.customType();
            }
            this.f5073f = str;
            this.f5074g = method;
            this.f5075h = Integer.valueOf(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract Object mo5979a(C1571G g);

        /* renamed from: a */
        public String mo5980a() {
            return this.f5072e;
        }

        /* renamed from: a */
        public void mo5981a(C1569E e, C1571G g) {
            Object[] objArr;
            try {
                if (this.f5075h == null) {
                    f5070c[0] = mo5979a(g);
                    this.f5074g.invoke(e, f5070c);
                    objArr = f5070c;
                } else {
                    f5071d[0] = this.f5075h;
                    f5071d[1] = mo5979a(g);
                    this.f5074g.invoke(e, f5071d);
                    objArr = f5071d;
                }
                Arrays.fill(objArr, null);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error while updating prop ");
                sb.append(this.f5072e);
                C0727a.m3263a(ViewManager.class, sb.toString(), th);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error while updating property '");
                sb2.append(this.f5072e);
                sb2.append("' in shadow node of type: ");
                sb2.append(e.mo5606t());
                throw new JSApplicationIllegalArgumentException(sb2.toString(), th);
            }
        }

        /* renamed from: a */
        public void mo5982a(ViewManager viewManager, View view, C1571G g) {
            Object[] objArr;
            try {
                if (this.f5075h == null) {
                    f5068a[0] = view;
                    f5068a[1] = mo5979a(g);
                    this.f5074g.invoke(viewManager, f5068a);
                    objArr = f5068a;
                } else {
                    f5069b[0] = view;
                    f5069b[1] = this.f5075h;
                    f5069b[2] = mo5979a(g);
                    this.f5074g.invoke(viewManager, f5069b);
                    objArr = f5069b;
                }
                Arrays.fill(objArr, null);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error while updating prop ");
                sb.append(this.f5072e);
                C0727a.m3263a(ViewManager.class, sb.toString(), th);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error while updating property '");
                sb2.append(this.f5072e);
                sb2.append("' of a view managed by: ");
                sb2.append(viewManager.getName());
                throw new JSApplicationIllegalArgumentException(sb2.toString(), th);
            }
        }

        /* renamed from: b */
        public String mo5983b() {
            return this.f5073f;
        }
    }

    /* renamed from: com.facebook.react.uimanager.qa$k */
    private static class C1716k extends C1715j {
        public C1716k(C1595a aVar, Method method) {
            super(aVar, "String", method);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo5979a(C1571G g) {
            return g.mo5675d(this.f5072e);
        }
    }

    /* renamed from: a */
    private static C1715j m6589a(C1595a aVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new C1711f(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new C1707b(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new C1713h(aVar, method, aVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new C1712g(aVar, method, aVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new C1710e(aVar, method, aVar.defaultDouble());
        }
        if (cls == String.class) {
            return new C1716k(aVar, method);
        }
        if (cls == Boolean.class) {
            return new C1708c(aVar, method);
        }
        if (cls == Integer.class) {
            return new C1709d(aVar, method);
        }
        if (cls == ReadableArray.class) {
            return new C1706a(aVar, method);
        }
        if (cls == ReadableMap.class) {
            return new C1714i(aVar, method);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized type: ");
        sb.append(cls);
        sb.append(" for method: ");
        sb.append(method.getDeclaringClass().getName());
        sb.append("#");
        sb.append(method.getName());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    static Map<String, C1715j> m6590a(Class<? extends C1569E> cls) {
        for (Class<C1569E> cls2 : cls.getInterfaces()) {
            if (cls2 == C1569E.class) {
                return f5063b;
            }
        }
        Map<String, C1715j> map = (Map) f5062a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(m6590a(cls.getSuperclass()));
        m6593a(cls, hashMap);
        f5062a.put(cls, hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static void m6591a() {
        f5062a.clear();
        f5063b.clear();
    }

    /* renamed from: a */
    private static void m6592a(C1596b bVar, Method method, Class<?> cls, Map<String, C1715j> map) {
        String[] names = bVar.names();
        int i = 0;
        if (cls == Dynamic.class) {
            while (i < names.length) {
                map.put(names[i], new C1711f(bVar, method, i));
                i++;
            }
        } else if (cls == Integer.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C1713h(bVar, method, i, bVar.defaultInt()));
                i++;
            }
        } else if (cls == Float.TYPE) {
            while (i < names.length) {
                map.put(names[i], new C1712g(bVar, method, i, bVar.defaultFloat()));
                i++;
            }
        } else if (cls == Double.TYPE) {
            while (i < names.length) {
                String str = names[i];
                C1710e eVar = new C1710e(bVar, method, i, bVar.defaultDouble());
                map.put(str, eVar);
                i++;
            }
        } else if (cls == Integer.class) {
            while (i < names.length) {
                map.put(names[i], new C1709d(bVar, method, i));
                i++;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized type: ");
            sb.append(cls);
            sb.append(" for method: ");
            sb.append(method.getDeclaringClass().getName());
            sb.append("#");
            sb.append(method.getName());
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m6593a(Class<? extends C1569E> cls, Map<String, C1715j> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            C1595a aVar = (C1595a) method.getAnnotation(C1595a.class);
            String str = "#";
            if (aVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(aVar.name(), m6589a(aVar, method, parameterTypes[0]));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Wrong number of args for prop setter: ");
                    sb.append(cls.getName());
                    sb.append(str);
                    sb.append(method.getName());
                    throw new RuntimeException(sb.toString());
                }
            }
            C1596b bVar = (C1596b) method.getAnnotation(C1596b.class);
            if (bVar != null) {
                Class[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Wrong number of args for group prop setter: ");
                    sb2.append(cls.getName());
                    sb2.append(str);
                    sb2.append(method.getName());
                    throw new RuntimeException(sb2.toString());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    m6592a(bVar, method, parameterTypes2[1], map);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Second argument should be property index: ");
                    sb3.append(cls.getName());
                    sb3.append(str);
                    sb3.append(method.getName());
                    throw new RuntimeException(sb3.toString());
                }
            }
        }
    }

    /* renamed from: b */
    static Map<String, C1715j> m6594b(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f5063b;
        }
        Map<String, C1715j> map = (Map) f5062a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(m6594b(cls.getSuperclass()));
        m6595b(cls, hashMap);
        f5062a.put(cls, hashMap);
        return hashMap;
    }

    /* renamed from: b */
    private static void m6595b(Class<? extends ViewManager> cls, Map<String, C1715j> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            C1595a aVar = (C1595a) method.getAnnotation(C1595a.class);
            String str = "First param should be a view subclass to be updated: ";
            String str2 = "#";
            if (aVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Wrong number of args for prop setter: ");
                    sb.append(cls.getName());
                    sb.append(str2);
                    sb.append(method.getName());
                    throw new RuntimeException(sb.toString());
                } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                    map.put(aVar.name(), m6589a(aVar, method, parameterTypes[1]));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(cls.getName());
                    sb2.append(str2);
                    sb2.append(method.getName());
                    throw new RuntimeException(sb2.toString());
                }
            }
            C1596b bVar = (C1596b) method.getAnnotation(C1596b.class);
            if (bVar != null) {
                Class[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Wrong number of args for group prop setter: ");
                    sb3.append(cls.getName());
                    sb3.append(str2);
                    sb3.append(method.getName());
                    throw new RuntimeException(sb3.toString());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(cls.getName());
                    sb4.append(str2);
                    sb4.append(method.getName());
                    throw new RuntimeException(sb4.toString());
                } else if (parameterTypes2[1] == Integer.TYPE) {
                    m6592a(bVar, method, parameterTypes2[2], map);
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Second argument should be property index: ");
                    sb5.append(cls.getName());
                    sb5.append(str2);
                    sb5.append(method.getName());
                    throw new RuntimeException(sb5.toString());
                }
            }
        }
    }
}
