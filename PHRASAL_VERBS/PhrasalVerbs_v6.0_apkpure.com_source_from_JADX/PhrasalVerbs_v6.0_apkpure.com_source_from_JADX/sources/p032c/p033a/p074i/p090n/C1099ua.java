package p032c.p033a.p074i.p090n;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0711e;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p049k.C0757e;
import p032c.p033a.p073h.C0882b;
import p032c.p033a.p073h.C0883c;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p081e.C0943f;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.ua */
public class C1099ua implements C1082na<C0988d> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0711e<Integer> f3704a = C0711e.m3224a(Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(5));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f3705b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0739h f3706c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f3707d;

    /* renamed from: e */
    private final C1082na<C0988d> f3708e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f3709f;

    /* renamed from: c.a.i.n.ua$a */
    private class C1100a extends C1094s<C0988d, C0988d> {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1084oa f3710c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f3711d = false;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C1020I f3712e;

        public C1100a(C1081n<C0988d> nVar, C1084oa oaVar) {
            super(nVar);
            this.f3710c = oaVar;
            this.f3712e = new C1020I(C1099ua.this.f3705b, new C1095sa(this, C1099ua.this), 100);
            this.f3710c.mo4319a(new C1097ta(this, C1099ua.this, nVar));
        }

        /* renamed from: a */
        private C0988d m4919a(C0988d dVar) {
            C0988d a = C0988d.m4405a(dVar);
            dVar.close();
            return a;
        }

        /* renamed from: a */
        private Map<String, String> m4921a(C0988d dVar, C1114c cVar, int i, int i2, int i3, int i4) {
            String str;
            String str2;
            if (!this.f3710c.mo4324e().mo4236a(this.f3710c.getId())) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.mo4224w());
            String str3 = "x";
            sb.append(str3);
            sb.append(dVar.mo4218q());
            String sb2 = sb.toString();
            if (cVar.mo4369l() != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cVar.mo4369l().f3242a);
                sb3.append(str3);
                sb3.append(cVar.mo4369l().f3243b);
                str = sb3.toString();
            } else {
                str = "Unspecified";
            }
            if (i > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i);
                sb4.append("/8");
                str2 = sb4.toString();
            } else {
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Original size", sb2);
            hashMap.put("Requested size", str);
            hashMap.put("Fraction", str2);
            hashMap.put("queueTime", String.valueOf(this.f3712e.mo4273b()));
            hashMap.put("downsampleEnumerator", Integer.toString(i2));
            hashMap.put("softwareEnumerator", Integer.toString(i3));
            hashMap.put("rotationAngle", Integer.toString(i4));
            return C0712f.m3225a(hashMap);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff A[Catch:{ all -> 0x010d }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m4925b(p032c.p033a.p074i.p086j.C0988d r18, int r19) {
            /*
                r17 = this;
                r8 = r17
                r0 = r18
                c.a.i.n.oa r1 = r8.f3710c
                c.a.i.n.qa r1 = r1.mo4324e()
                c.a.i.n.oa r2 = r8.f3710c
                java.lang.String r2 = r2.getId()
                java.lang.String r9 = "ResizeAndRotateProducer"
                r1.mo4232a(r2, r9)
                c.a.i.n.oa r1 = r8.f3710c
                c.a.i.o.c r3 = r1.mo4322c()
                c.a.i.n.ua r1 = p032c.p033a.p074i.p090n.C1099ua.this
                c.a.c.g.h r1 = r1.f3706c
                c.a.c.g.j r10 = r1.mo3501a()
                r11 = 0
                c.a.i.n.ua r1 = p032c.p033a.p074i.p090n.C1099ua.this     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                boolean r1 = r1.f3707d     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                int r6 = p032c.p033a.p074i.p090n.C1099ua.m4911c(r3, r0, r1)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                int r12 = p032c.p033a.p074i.p090n.C1108y.m4950b(r3, r0)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                int r5 = p032c.p033a.p074i.p090n.C1099ua.m4900a(r12)     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                c.a.i.n.ua r1 = p032c.p033a.p074i.p090n.C1099ua.this     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                boolean r1 = r1.f3709f     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                if (r1 == 0) goto L_0x0042
                r13 = r5
                goto L_0x0043
            L_0x0042:
                r13 = r6
            L_0x0043:
                java.io.InputStream r14 = r18.mo4220s()     // Catch:{ Exception -> 0x00e6, all -> 0x00e3 }
                c.a.c.d.e r1 = p032c.p033a.p074i.p090n.C1099ua.f3704a     // Catch:{ Exception -> 0x00df }
                int r2 = r18.mo4217p()     // Catch:{ Exception -> 0x00df }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00df }
                boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x00df }
                r15 = 85
                if (r1 == 0) goto L_0x0075
                c.a.i.e.f r1 = r3.mo4370m()     // Catch:{ Exception -> 0x00df }
                int r7 = p032c.p033a.p074i.p090n.C1099ua.m4910c(r1, r0)     // Catch:{ Exception -> 0x00df }
                r16 = 0
                r1 = r17
                r2 = r18
                r4 = r13
                r0 = r7
                r7 = r16
                java.util.Map r11 = r1.m4921a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00df }
                com.facebook.imagepipeline.nativecode.JpegTranscoder.m5604b(r14, r10, r0, r13, r15)     // Catch:{ Exception -> 0x00df }
                goto L_0x008a
            L_0x0075:
                c.a.i.e.f r1 = r3.mo4370m()     // Catch:{ Exception -> 0x00df }
                int r7 = p032c.p033a.p074i.p090n.C1099ua.m4913d(r1, r0)     // Catch:{ Exception -> 0x00df }
                r1 = r17
                r2 = r18
                r4 = r13
                r0 = r7
                java.util.Map r11 = r1.m4921a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00df }
                com.facebook.imagepipeline.nativecode.JpegTranscoder.m5602a(r14, r10, r0, r13, r15)     // Catch:{ Exception -> 0x00df }
            L_0x008a:
                c.a.c.g.g r0 = r10.mo3512m()     // Catch:{ Exception -> 0x00df }
                c.a.c.h.b r1 = p032c.p033a.p038c.p046h.C0744b.m3334a(r0)     // Catch:{ Exception -> 0x00df }
                c.a.i.j.d r2 = new c.a.i.j.d     // Catch:{ all -> 0x00d6 }
                r2.<init>(r1)     // Catch:{ all -> 0x00d6 }
                c.a.h.c r0 = p032c.p033a.p073h.C0882b.f3116a     // Catch:{ all -> 0x00d6 }
                r2.mo4203a(r0)     // Catch:{ all -> 0x00d6 }
                r2.mo4226y()     // Catch:{ all -> 0x00cd }
                c.a.i.n.oa r0 = r8.f3710c     // Catch:{ all -> 0x00cd }
                c.a.i.n.qa r0 = r0.mo4324e()     // Catch:{ all -> 0x00cd }
                c.a.i.n.oa r3 = r8.f3710c     // Catch:{ all -> 0x00cd }
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x00cd }
                r0.mo4237b(r3, r9, r11)     // Catch:{ all -> 0x00cd }
                r0 = 1
                if (r12 == r0) goto L_0x00b5
                r0 = r19 | 16
                r3 = r0
                goto L_0x00b7
            L_0x00b5:
                r3 = r19
            L_0x00b7:
                c.a.i.n.n r0 = r17.mo4347c()     // Catch:{ all -> 0x00cb }
                r0.mo4310a(r2, r3)     // Catch:{ all -> 0x00cb }
                p032c.p033a.p074i.p086j.C0988d.m4406b(r2)     // Catch:{ all -> 0x00d4 }
                p032c.p033a.p038c.p046h.C0744b.m3336b(r1)     // Catch:{ Exception -> 0x00dd }
                p032c.p033a.p038c.p042d.C0708b.m3223a(r14)
                r10.close()
                return
            L_0x00cb:
                r0 = move-exception
                goto L_0x00d0
            L_0x00cd:
                r0 = move-exception
                r3 = r19
            L_0x00d0:
                p032c.p033a.p074i.p086j.C0988d.m4406b(r2)     // Catch:{ all -> 0x00d4 }
                throw r0     // Catch:{ all -> 0x00d4 }
            L_0x00d4:
                r0 = move-exception
                goto L_0x00d9
            L_0x00d6:
                r0 = move-exception
                r3 = r19
            L_0x00d9:
                p032c.p033a.p038c.p046h.C0744b.m3336b(r1)     // Catch:{ Exception -> 0x00dd }
                throw r0     // Catch:{ Exception -> 0x00dd }
            L_0x00dd:
                r0 = move-exception
                goto L_0x00ea
            L_0x00df:
                r0 = move-exception
                r3 = r19
                goto L_0x00ea
            L_0x00e3:
                r0 = move-exception
                r14 = r11
                goto L_0x010e
            L_0x00e6:
                r0 = move-exception
                r3 = r19
                r14 = r11
            L_0x00ea:
                c.a.i.n.oa r1 = r8.f3710c     // Catch:{ all -> 0x010d }
                c.a.i.n.qa r1 = r1.mo4324e()     // Catch:{ all -> 0x010d }
                c.a.i.n.oa r2 = r8.f3710c     // Catch:{ all -> 0x010d }
                java.lang.String r2 = r2.getId()     // Catch:{ all -> 0x010d }
                r1.mo4234a(r2, r9, r0, r11)     // Catch:{ all -> 0x010d }
                boolean r1 = p032c.p033a.p074i.p090n.C1051c.m4687a(r3)     // Catch:{ all -> 0x010d }
                if (r1 == 0) goto L_0x0106
                c.a.i.n.n r1 = r17.mo4347c()     // Catch:{ all -> 0x010d }
                r1.mo4311a(r0)     // Catch:{ all -> 0x010d }
            L_0x0106:
                p032c.p033a.p038c.p042d.C0708b.m3223a(r14)
                r10.close()
                return
            L_0x010d:
                r0 = move-exception
            L_0x010e:
                p032c.p033a.p038c.p042d.C0708b.m3223a(r14)
                r10.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1099ua.C1100a.m4925b(c.a.i.j.d, int):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            if (!this.f3711d) {
                boolean a = C1051c.m4687a(i);
                if (dVar == null) {
                    if (a) {
                        mo4347c().mo4310a(null, 1);
                    }
                    return;
                }
                C0757e a2 = C1099ua.m4914d(this.f3710c.mo4322c(), dVar, C1099ua.this.f3707d);
                if (!a && a2 == C0757e.UNSET) {
                    return;
                }
                if (a2 != C0757e.YES) {
                    if (!(this.f3710c.mo4322c().mo4370m().mo4056c() || dVar.mo4221t() == 0 || dVar.mo4221t() == -1)) {
                        dVar = m4919a(dVar);
                        dVar.mo4211f(0);
                    }
                    mo4347c().mo4310a(dVar, i);
                } else if (this.f3712e.mo4272a(dVar, i)) {
                    if (a || this.f3710c.mo4325f()) {
                        this.f3712e.mo4274c();
                    }
                }
            }
        }
    }

    public C1099ua(Executor executor, C0739h hVar, boolean z, C1082na<C0988d> naVar, boolean z2) {
        C0718j.m3240a(executor);
        this.f3705b = executor;
        C0718j.m3240a(hVar);
        this.f3706c = hVar;
        this.f3707d = z;
        C0718j.m3240a(naVar);
        this.f3708e = naVar;
        this.f3709f = z2;
    }

    /* renamed from: a */
    static float m4898a(C0942e eVar, int i, int i2) {
        if (eVar == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) eVar.f3242a) / f, ((float) eVar.f3243b) / f2);
        float f3 = f * max;
        float f4 = eVar.f3244c;
        if (f3 > f4) {
            max = f4 / f;
        }
        float f5 = f2 * max;
        float f6 = eVar.f3244c;
        if (f5 > f6) {
            max = f6 / f2;
        }
        return max;
    }

    /* renamed from: a */
    static int m4899a(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }

    /* renamed from: a */
    static int m4900a(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: a */
    private static int m4902a(C0988d dVar) {
        int t = dVar.mo4221t();
        if (t == 90 || t == 180 || t == 270) {
            return dVar.mo4221t();
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m4908b(int i) {
        return i < 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m4910c(C0943f fVar, C0988d dVar) {
        int indexOf = f3704a.indexOf(Integer.valueOf(dVar.mo4217p()));
        if (indexOf >= 0) {
            int i = 0;
            if (!fVar.mo4060g()) {
                i = fVar.mo4057e();
            }
            int i2 = i / 90;
            C0711e<Integer> eVar = f3704a;
            return ((Integer) eVar.get((indexOf + i2) % eVar.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m4911c(C1114c cVar, C0988d dVar, boolean z) {
        if (!z) {
            return 8;
        }
        C0942e l = cVar.mo4369l();
        if (l == null) {
            return 8;
        }
        int d = m4913d(cVar.mo4370m(), dVar);
        boolean z2 = false;
        int c = f3704a.contains(Integer.valueOf(dVar.mo4217p())) ? m4910c(cVar.mo4370m(), dVar) : 0;
        if (d == 90 || d == 270 || c == 5 || c == 7) {
            z2 = true;
        }
        int a = m4899a(m4898a(l, z2 ? dVar.mo4218q() : dVar.mo4224w(), z2 ? dVar.mo4224w() : dVar.mo4218q()), l.f3245d);
        if (a > 8) {
            return 8;
        }
        if (a < 1) {
            a = 1;
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m4913d(C0943f fVar, C0988d dVar) {
        if (!fVar.mo4059f()) {
            return 0;
        }
        int a = m4902a(dVar);
        return fVar.mo4060g() ? a : (a + fVar.mo4057e()) % 360;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C0757e m4914d(C1114c cVar, C0988d dVar, boolean z) {
        if (dVar == null || dVar.mo4219r() == C0883c.f3126a) {
            return C0757e.UNSET;
        }
        if (dVar.mo4219r() != C0882b.f3116a) {
            return C0757e.NO;
        }
        return C0757e.m3370a(m4916e(cVar.mo4370m(), dVar) || m4908b(m4911c(cVar, dVar, z)));
    }

    /* renamed from: e */
    private static boolean m4916e(C0943f fVar, C0988d dVar) {
        return !fVar.mo4056c() && (m4913d(fVar, dVar) != 0 || m4917f(fVar, dVar));
    }

    /* renamed from: f */
    private static boolean m4917f(C0943f fVar, C0988d dVar) {
        if (fVar.mo4059f() && !fVar.mo4056c()) {
            return f3704a.contains(Integer.valueOf(dVar.mo4217p()));
        }
        dVar.mo4209d(0);
        return false;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        this.f3708e.mo4248a(new C1100a(nVar, oaVar), oaVar);
    }
}
