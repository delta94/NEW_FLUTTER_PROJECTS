package p032c.p033a.p059g.p060a.p061a;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p059g.p072i.C0880f;
import p032c.p033a.p074i.p082f.C0954j;
import p032c.p033a.p074i.p082f.C0956l;
import p032c.p033a.p074i.p082f.C0964o;

/* renamed from: c.a.g.a.a.c */
public class C0799c {

    /* renamed from: a */
    private static final Class<?> f2761a = C0799c.class;

    /* renamed from: b */
    private static C0803g f2762b = null;

    /* renamed from: c */
    private static volatile boolean f2763c = false;

    private C0799c() {
    }

    /* renamed from: a */
    public static C0954j m3533a() {
        return m3537b().mo4133e();
    }

    /* renamed from: a */
    private static void m3534a(Context context, C0798b bVar) {
        f2762b = new C0803g(context, bVar);
        C0880f.m3937a(f2762b);
    }

    /* renamed from: a */
    public static void m3535a(Context context, C0956l lVar) {
        m3536a(context, lVar, null);
    }

    /* renamed from: a */
    public static void m3536a(Context context, C0956l lVar, C0798b bVar) {
        if (f2763c) {
            C0727a.m3278c(f2761a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f2763c = true;
        }
        try {
            SoLoader.m7248a(context, 0);
            Context applicationContext = context.getApplicationContext();
            if (lVar == null) {
                C0964o.m4271b(applicationContext);
            } else {
                C0964o.m4270a(lVar);
            }
            m3534a(applicationContext, bVar);
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize SoLoader", e);
        }
    }

    /* renamed from: b */
    public static C0964o m3537b() {
        return C0964o.m4272f();
    }

    /* renamed from: c */
    public static C0802f m3538c() {
        return f2762b.get();
    }
}
