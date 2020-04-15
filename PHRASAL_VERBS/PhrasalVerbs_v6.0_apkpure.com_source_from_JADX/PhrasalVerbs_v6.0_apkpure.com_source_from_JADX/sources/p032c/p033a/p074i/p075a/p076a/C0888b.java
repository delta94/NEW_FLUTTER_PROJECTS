package p032c.p033a.p074i.p075a.p076a;

import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p074i.p079c.C0900f;
import p032c.p033a.p074i.p080d.C0925q;
import p032c.p033a.p074i.p082f.C0949e;
import p032c.p033a.p074i.p086j.C0986b;

/* renamed from: c.a.i.a.a.b */
public class C0888b {

    /* renamed from: a */
    private static boolean f3133a;

    /* renamed from: b */
    private static C0887a f3134b;

    /* renamed from: a */
    public static C0887a m3966a(C0900f fVar, C0949e eVar, C0925q<C0657d, C0986b> qVar) {
        if (!f3133a) {
            try {
                f3134b = (C0887a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[]{C0900f.class, C0949e.class, C0925q.class}).newInstance(new Object[]{fVar, eVar, qVar});
            } catch (Throwable unused) {
            }
            if (f3134b != null) {
                f3133a = true;
            }
        }
        return f3134b;
    }
}
