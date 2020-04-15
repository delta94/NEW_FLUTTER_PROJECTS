package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.j */
public class C0220j {

    /* renamed from: a */
    private static Map<Class, Integer> f598a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0210c>>> f599b = new HashMap();

    /* renamed from: a */
    static GenericLifecycleObserver m827a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (m831b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f599b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m828a((Constructor) list.get(0), obj));
        }
        C0210c[] cVarArr = new C0210c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m828a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: a */
    private static C0210c m828a(Constructor<? extends C0210c> constructor, Object obj) {
        try {
            return (C0210c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    public static String m829a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* renamed from: a */
    private static Constructor<? extends C0210c> m830a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m829a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C0210c> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m831b(Class<?> cls) {
        if (f598a.containsKey(cls)) {
            return ((Integer) f598a.get(cls)).intValue();
        }
        int d = m833d(cls);
        f598a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m832c(Class<?> cls) {
        return cls != null && C0214e.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m833d(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m830a(cls);
        if (a != null) {
            f599b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0206a.f573a.mo807b(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m832c(superclass)) {
                if (m831b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f599b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m832c(cls2)) {
                    if (m831b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f599b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f599b.put(cls, arrayList);
            return 2;
        }
    }
}
