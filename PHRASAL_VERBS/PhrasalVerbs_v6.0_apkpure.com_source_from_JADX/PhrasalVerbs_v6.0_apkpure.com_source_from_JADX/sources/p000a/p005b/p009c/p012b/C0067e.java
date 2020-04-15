package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p029v4.util.C0338o;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0044b;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0045c;
import p000a.p005b.p009c.p016e.C0084f.C0086b;

/* renamed from: a.b.c.b.e */
class C0067e extends C0072j {

    /* renamed from: a */
    private static final Class f155a;

    /* renamed from: b */
    private static final Constructor f156b;

    /* renamed from: c */
    private static final Method f157c;

    /* renamed from: d */
    private static final Method f158d;

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f156b = constructor;
        f155a = cls;
        f157c = method;
        f158d = method2;
    }

    C0067e() {
    }

    /* renamed from: a */
    private static Typeface m217a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f155a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f158d.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m218a() {
        if (f157c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f157c != null;
    }

    /* renamed from: a */
    private static boolean m219a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f157c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m220b() {
        try {
            return f156b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo223a(Context context, C0044b bVar, Resources resources, int i) {
        C0045c[] a;
        Object b = m220b();
        for (C0045c cVar : bVar.mo189a()) {
            ByteBuffer a2 = C0074k.m260a(context, resources, cVar.mo191b());
            if (a2 == null || !m219a(b, a2, cVar.mo192c(), cVar.mo194e(), cVar.mo195f())) {
                return null;
            }
        }
        return m217a(b);
    }

    /* renamed from: a */
    public Typeface mo222a(Context context, CancellationSignal cancellationSignal, C0086b[] bVarArr, int i) {
        Object b = m220b();
        C0338o oVar = new C0338o();
        for (C0086b bVar : bVarArr) {
            Uri c = bVar.mo281c();
            ByteBuffer byteBuffer = (ByteBuffer) oVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C0074k.m261a(context, cancellationSignal, c);
                oVar.put(c, byteBuffer);
            }
            if (!m219a(b, byteBuffer, bVar.mo280b(), bVar.mo282d(), bVar.mo283e())) {
                return null;
            }
        }
        return Typeface.create(m217a(b), i);
    }
}
