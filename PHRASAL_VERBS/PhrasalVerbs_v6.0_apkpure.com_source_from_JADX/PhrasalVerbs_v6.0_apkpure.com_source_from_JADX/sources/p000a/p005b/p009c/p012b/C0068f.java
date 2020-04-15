package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0044b;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0045c;
import p000a.p005b.p009c.p016e.C0084f;
import p000a.p005b.p009c.p016e.C0084f.C0086b;

/* renamed from: a.b.c.b.f */
public class C0068f extends C0066d {

    /* renamed from: a */
    protected final Class f159a;

    /* renamed from: b */
    protected final Constructor f160b;

    /* renamed from: c */
    protected final Method f161c;

    /* renamed from: d */
    protected final Method f162d;

    /* renamed from: e */
    protected final Method f163e;

    /* renamed from: f */
    protected final Method f164f;

    /* renamed from: g */
    protected final Method f165g;

    public C0068f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a = mo226a();
            constructor = mo231e(a);
            method4 = mo228b(a);
            method3 = mo229c(a);
            method2 = mo232f(a);
            method = mo227a(a);
            Class cls2 = a;
            method5 = mo230d(a);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f159a = cls;
        this.f160b = constructor;
        this.f161c = method4;
        this.f162d = method3;
        this.f163e = method2;
        this.f164f = method;
        this.f165g = method5;
    }

    /* renamed from: a */
    private boolean m223a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f161c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m224a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f162d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private void m225b(Object obj) {
        try {
            this.f164f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m226b() {
        if (this.f161c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f161c != null;
    }

    /* renamed from: c */
    private Object m227c() {
        try {
            return this.f160b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private boolean m228c(Object obj) {
        try {
            return ((Boolean) this.f163e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo223a(Context context, C0044b bVar, Resources resources, int i) {
        C0045c[] a;
        if (!m226b()) {
            return super.mo223a(context, bVar, resources, i);
        }
        Object c = m227c();
        for (C0045c cVar : bVar.mo189a()) {
            if (!m223a(context, c, cVar.mo190a(), cVar.mo192c(), cVar.mo194e(), cVar.mo195f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo193d()))) {
                m225b(c);
                return null;
            }
        }
        if (!m228c(c)) {
            return null;
        }
        return mo225a(c);
    }

    /* renamed from: a */
    public Typeface mo224a(Context context, Resources resources, int i, String str, int i2) {
        if (!m226b()) {
            return super.mo224a(context, resources, i, str, i2);
        }
        Object c = m227c();
        if (!m223a(context, c, str, 0, -1, -1, null)) {
            m225b(c);
            return null;
        } else if (!m228c(c)) {
            return null;
        } else {
            return mo225a(c);
        }
    }

    /* renamed from: a */
    public Typeface mo222a(Context context, CancellationSignal cancellationSignal, C0086b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m226b()) {
            C0086b a = mo239a(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a.mo281c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.mo282d()).setItalic(a.mo283e()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r13;
                    th2 = th4;
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map a2 = C0084f.m286a(context, bVarArr, cancellationSignal);
            Object c = m227c();
            boolean z = false;
            for (C0086b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.get(bVar.mo281c());
                if (byteBuffer != null) {
                    if (!m224a(c, byteBuffer, bVar.mo280b(), bVar.mo282d(), bVar.mo283e() ? 1 : 0)) {
                        m225b(c);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m225b(c);
                return null;
            } else if (!m228c(c)) {
                return null;
            } else {
                return Typeface.create(mo225a(c), i);
            }
        }
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable unused2) {
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo225a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f159a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f165g.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class mo226a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo227a(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo228b(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo229c(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo230d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Constructor mo231e(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo232f(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
