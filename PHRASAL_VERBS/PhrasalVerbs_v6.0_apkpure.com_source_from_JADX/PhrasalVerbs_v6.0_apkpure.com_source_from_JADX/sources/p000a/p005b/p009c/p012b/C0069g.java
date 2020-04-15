package p000a.p005b.p009c.p012b;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.c.b.g */
public class C0069g extends C0068f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo225a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f159a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f165g.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo230d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
