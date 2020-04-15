package p032c.p033a.p038c.p042d;

import java.util.Arrays;

/* renamed from: c.a.c.d.i */
public final class C0715i {

    /* renamed from: c.a.c.d.i$a */
    public static final class C0716a {

        /* renamed from: a */
        private final String f2588a;

        /* renamed from: b */
        private C0717a f2589b;

        /* renamed from: c */
        private C0717a f2590c;

        /* renamed from: d */
        private boolean f2591d;

        /* renamed from: c.a.c.d.i$a$a */
        private static final class C0717a {

            /* renamed from: a */
            String f2592a;

            /* renamed from: b */
            Object f2593b;

            /* renamed from: c */
            C0717a f2594c;

            private C0717a() {
            }
        }

        private C0716a(String str) {
            this.f2589b = new C0717a();
            this.f2590c = this.f2589b;
            this.f2591d = false;
            C0718j.m3240a(str);
            this.f2588a = str;
        }

        /* renamed from: a */
        private C0717a m3233a() {
            C0717a aVar = new C0717a();
            this.f2590c.f2594c = aVar;
            this.f2590c = aVar;
            return aVar;
        }

        /* renamed from: b */
        private C0716a m3234b(String str, Object obj) {
            C0717a a = m3233a();
            a.f2593b = obj;
            C0718j.m3240a(str);
            a.f2592a = str;
            return this;
        }

        /* renamed from: a */
        public C0716a mo3470a(String str, int i) {
            m3234b(str, String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public C0716a mo3471a(String str, Object obj) {
            m3234b(str, obj);
            return this;
        }

        /* renamed from: a */
        public C0716a mo3472a(String str, boolean z) {
            m3234b(str, String.valueOf(z));
            return this;
        }

        public String toString() {
            boolean z = this.f2591d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f2588a);
            sb.append('{');
            String str = "";
            for (C0717a aVar = this.f2589b.f2594c; aVar != null; aVar = aVar.f2594c) {
                if (!z || aVar.f2593b != null) {
                    sb.append(str);
                    String str2 = aVar.f2592a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f2593b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m3229a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C0716a m3230a(Object obj) {
        return new C0716a(m3231a(obj.getClass()));
    }

    /* renamed from: a */
    private static String m3231a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    /* renamed from: a */
    public static boolean m3232a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
