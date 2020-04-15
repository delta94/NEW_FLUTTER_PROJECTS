package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.r */
public class C0229r {

    /* renamed from: a */
    private final C0230a f603a;

    /* renamed from: b */
    private final C0231s f604b;

    /* renamed from: android.arch.lifecycle.r$a */
    public interface C0230a {
        /* renamed from: a */
        <T extends C0228q> T mo836a(Class<T> cls);
    }

    public C0229r(C0231s sVar, C0230a aVar) {
        this.f603a = aVar;
        this.f604b = sVar;
    }

    /* renamed from: a */
    public <T extends C0228q> T mo834a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo835a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0228q> T mo835a(String str, Class<T> cls) {
        T a = this.f604b.mo837a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        T a2 = this.f603a.mo836a(cls);
        this.f604b.mo839a(str, a2);
        return a2;
    }
}
