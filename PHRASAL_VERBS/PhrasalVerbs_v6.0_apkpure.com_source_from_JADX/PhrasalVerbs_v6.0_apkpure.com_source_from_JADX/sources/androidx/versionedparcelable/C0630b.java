package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.b */
public abstract class C0630b {
    /* renamed from: a */
    protected static <T extends C0632d> T m2944a(String str, C0630b bVar) {
        try {
            return (C0632d) Class.forName(str, true, C0630b.class.getClassLoader()).getDeclaredMethod("read", new Class[]{C0630b.class}).invoke(null, new Object[]{bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    private static Class m2945a(Class<? extends C0632d> cls) {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    /* renamed from: a */
    protected static <T extends C0632d> void m2946a(T t, C0630b bVar) {
        try {
            m2947b(t).getDeclaredMethod("write", new Class[]{t.getClass(), C0630b.class}).invoke(null, new Object[]{t, bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    private static <T extends C0632d> Class m2947b(T t) {
        return m2945a(t.getClass());
    }

    /* renamed from: c */
    private void m2948c(C0632d dVar) {
        try {
            mo3294a(m2945a(dVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public int mo3288a(int i, int i2) {
        return !mo3297a(i2) ? i : mo3308e();
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo3289a(T t, int i) {
        return !mo3297a(i) ? t : mo3309f();
    }

    /* renamed from: a */
    public String mo3290a(String str, int i) {
        return !mo3297a(i) ? str : mo3310g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3291a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3292a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3293a(C0632d dVar) {
        if (dVar == null) {
            mo3294a((String) null);
            return;
        }
        m2948c(dVar);
        C0630b b = mo3299b();
        m2946a((T) dVar, b);
        b.mo3291a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3294a(String str);

    /* renamed from: a */
    public void mo3295a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3296a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3297a(int i);

    /* renamed from: a */
    public byte[] mo3298a(byte[] bArr, int i) {
        return !mo3297a(i) ? bArr : mo3307d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0630b mo3299b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3300b(int i);

    /* renamed from: b */
    public void mo3301b(int i, int i2) {
        mo3300b(i2);
        mo3305c(i);
    }

    /* renamed from: b */
    public void mo3302b(Parcelable parcelable, int i) {
        mo3300b(i);
        mo3292a(parcelable);
    }

    /* renamed from: b */
    public void mo3303b(String str, int i) {
        mo3300b(i);
        mo3294a(str);
    }

    /* renamed from: b */
    public void mo3304b(byte[] bArr, int i) {
        mo3300b(i);
        mo3296a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo3305c(int i);

    /* renamed from: c */
    public boolean mo3306c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo3307d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo3308e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract <T extends Parcelable> T mo3309f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo3310g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public <T extends C0632d> T mo3311h() {
        String g = mo3310g();
        if (g == null) {
            return null;
        }
        return m2944a(g, mo3299b());
    }
}
