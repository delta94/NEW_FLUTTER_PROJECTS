package android.arch.lifecycle;

import android.arch.lifecycle.C0211d.C0212a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
class C0206a {

    /* renamed from: a */
    static C0206a f573a = new C0206a();

    /* renamed from: b */
    private final Map<Class, C0207a> f574b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f575c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0207a {

        /* renamed from: a */
        final Map<C0212a, List<C0208b>> f576a = new HashMap();

        /* renamed from: b */
        final Map<C0208b, C0212a> f577b;

        C0207a(Map<C0208b, C0212a> map) {
            this.f577b = map;
            for (Entry entry : map.entrySet()) {
                C0212a aVar = (C0212a) entry.getValue();
                List list = (List) this.f576a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f576a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        private static void m799a(List<C0208b> list, C0215f fVar, C0212a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0208b) list.get(size)).mo809a(fVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo808a(C0215f fVar, C0212a aVar, Object obj) {
            m799a((List) this.f576a.get(aVar), fVar, aVar, obj);
            m799a((List) this.f576a.get(C0212a.ON_ANY), fVar, aVar, obj);
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0208b {

        /* renamed from: a */
        final int f578a;

        /* renamed from: b */
        final Method f579b;

        C0208b(int i, Method method) {
            this.f578a = i;
            this.f579b = method;
            this.f579b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo809a(C0215f fVar, C0212a aVar, Object obj) {
            try {
                int i = this.f578a;
                if (i == 0) {
                    this.f579b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f579b.invoke(obj, new Object[]{fVar});
                } else if (i == 2) {
                    this.f579b.invoke(obj, new Object[]{fVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0208b.class != obj.getClass()) {
                return false;
            }
            C0208b bVar = (C0208b) obj;
            if (this.f578a != bVar.f578a || !this.f579b.getName().equals(bVar.f579b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f578a * 31) + this.f579b.getName().hashCode();
        }
    }

    C0206a() {
    }

    /* renamed from: a */
    private C0207a m794a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0207a a = mo806a(superclass);
            if (a != null) {
                hashMap.putAll(a.f577b);
            }
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : mo806a(a2).f577b.entrySet()) {
                m795a(hashMap, (C0208b) entry.getKey(), (C0212a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m796c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0225o oVar = (C0225o) method.getAnnotation(C0225o.class);
            if (oVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0215f.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0212a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0212a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0212a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m795a(hashMap, new C0208b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0207a aVar = new C0207a(hashMap);
        this.f574b.put(cls, aVar);
        this.f575c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m795a(Map<C0208b, C0212a> map, C0208b bVar, C0212a aVar, Class cls) {
        C0212a aVar2 = (C0212a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f579b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: c */
    private Method[] m796c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0207a mo806a(Class cls) {
        C0207a aVar = (C0207a) this.f574b.get(cls);
        return aVar != null ? aVar : m794a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo807b(Class cls) {
        if (this.f575c.containsKey(cls)) {
            return ((Boolean) this.f575c.get(cls)).booleanValue();
        }
        Method[] c = m796c(cls);
        for (Method annotation : c) {
            if (((C0225o) annotation.getAnnotation(C0225o.class)) != null) {
                m794a(cls, c);
                return true;
            }
        }
        this.f575c.put(cls, Boolean.valueOf(false));
        return false;
    }
}
