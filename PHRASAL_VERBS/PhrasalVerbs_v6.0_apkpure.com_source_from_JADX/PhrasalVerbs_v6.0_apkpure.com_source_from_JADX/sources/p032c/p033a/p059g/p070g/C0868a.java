package p032c.p033a.p059g.p070g;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: c.a.g.g.a */
public class C0868a {

    /* renamed from: a */
    C0869a f3080a;

    /* renamed from: b */
    final float f3081b;

    /* renamed from: c */
    boolean f3082c;

    /* renamed from: d */
    boolean f3083d;

    /* renamed from: e */
    long f3084e;

    /* renamed from: f */
    float f3085f;

    /* renamed from: g */
    float f3086g;

    /* renamed from: c.a.g.g.a$a */
    public interface C0869a {
        /* renamed from: d */
        boolean mo3682d();
    }

    public C0868a(Context context) {
        this.f3081b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        mo3898a();
    }

    /* renamed from: a */
    public static C0868a m3888a(Context context) {
        return new C0868a(context);
    }

    /* renamed from: a */
    public void mo3898a() {
        this.f3080a = null;
        mo3902c();
    }

    /* renamed from: a */
    public void mo3899a(C0869a aVar) {
        this.f3080a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (java.lang.Math.abs(r8.getY() - r7.f3086g) <= r7.f3081b) goto L_0x0093;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3900a(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x007d
            r2 = 0
            if (r0 == r1) goto L_0x003b
            r3 = 2
            if (r0 == r3) goto L_0x0018
            r8 = 3
            if (r0 == r8) goto L_0x0012
            goto L_0x0093
        L_0x0012:
            r7.f3082c = r2
        L_0x0014:
            r7.f3083d = r2
            goto L_0x0093
        L_0x0018:
            float r0 = r8.getX()
            float r3 = r7.f3085f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f3081b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0014
            float r8 = r8.getY()
            float r0 = r7.f3086g
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            float r0 = r7.f3081b
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0093
            goto L_0x0014
        L_0x003b:
            r7.f3082c = r2
            float r0 = r8.getX()
            float r3 = r7.f3085f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f3081b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            float r0 = r8.getY()
            float r3 = r7.f3086g
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f3081b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
        L_0x005f:
            r7.f3083d = r2
        L_0x0061:
            boolean r0 = r7.f3083d
            if (r0 == 0) goto L_0x0014
            long r3 = r8.getEventTime()
            long r5 = r7.f3084e
            long r3 = r3 - r5
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r5 = (long) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0014
            c.a.g.g.a$a r8 = r7.f3080a
            if (r8 == 0) goto L_0x0014
            r8.mo3682d()
            goto L_0x0014
        L_0x007d:
            r7.f3082c = r1
            r7.f3083d = r1
            long r2 = r8.getEventTime()
            r7.f3084e = r2
            float r0 = r8.getX()
            r7.f3085f = r0
            float r8 = r8.getY()
            r7.f3086g = r8
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p059g.p070g.C0868a.mo3900a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public boolean mo3901b() {
        return this.f3082c;
    }

    /* renamed from: c */
    public void mo3902c() {
        this.f3082c = false;
        this.f3083d = false;
    }
}
