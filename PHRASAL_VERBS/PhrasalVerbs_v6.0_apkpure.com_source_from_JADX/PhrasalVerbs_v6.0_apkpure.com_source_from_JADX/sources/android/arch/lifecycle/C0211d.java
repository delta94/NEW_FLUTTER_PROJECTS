package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.d */
public abstract class C0211d {

    /* renamed from: android.arch.lifecycle.d$a */
    public enum C0212a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.d$b */
    public enum C0213b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo816a(C0213b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract C0213b mo813a();

    /* renamed from: a */
    public abstract void mo814a(C0214e eVar);

    /* renamed from: b */
    public abstract void mo815b(C0214e eVar);
}
