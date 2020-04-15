package p032c.p033a.p074i.p090n;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0731a;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p049k.C0753a;
import p032c.p033a.p074i.p081e.C0939b;
import p032c.p033a.p074i.p084h.C0976d;
import p032c.p033a.p074i.p084h.C0978f;
import p032c.p033a.p074i.p084h.C0979g;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0987c;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p086j.C0990f;
import p032c.p033a.p074i.p086j.C0991g;

/* renamed from: c.a.i.n.p */
public class C1085p implements C1082na<C0744b<C0986b>> {

    /* renamed from: a */
    private final C0731a f3664a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f3665b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0976d f3666c;

    /* renamed from: d */
    private final C0978f f3667d;

    /* renamed from: e */
    private final C1082na<C0988d> f3668e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f3669f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f3670g;

    /* renamed from: h */
    private final boolean f3671h;

    /* renamed from: c.a.i.n.p$a */
    private class C1086a extends C1088c {
        public C1086a(C1081n<C0744b<C0986b>> nVar, C1084oa oaVar, boolean z) {
            super(nVar, oaVar, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo4343a(C0988d dVar) {
            return dVar.mo4223v();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public synchronized boolean mo4344b(C0988d dVar, int i) {
            if (C1051c.m4689b(i)) {
                return false;
            }
            return super.mo4344b(dVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C0991g mo4345d() {
            return C0990f.m4435a(0, false, false);
        }
    }

    /* renamed from: c.a.i.n.p$b */
    private class C1087b extends C1088c {

        /* renamed from: j */
        private final C0979g f3673j;

        /* renamed from: k */
        private final C0978f f3674k;

        /* renamed from: l */
        private int f3675l = 0;

        public C1087b(C1081n<C0744b<C0986b>> nVar, C1084oa oaVar, C0979g gVar, C0978f fVar, boolean z) {
            super(nVar, oaVar, z);
            C0718j.m3240a(gVar);
            this.f3673j = gVar;
            C0718j.m3240a(fVar);
            this.f3674k = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo4343a(C0988d dVar) {
            return this.f3673j.mo4186a();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
            return r0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo4344b(p032c.p033a.p074i.p086j.C0988d r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = super.mo4344b(r4, r5)     // Catch:{ all -> 0x0057 }
                boolean r1 = p032c.p033a.p074i.p090n.C1051c.m4689b(r5)     // Catch:{ all -> 0x0057 }
                if (r1 != 0) goto L_0x0013
                r1 = 8
                boolean r1 = p032c.p033a.p074i.p090n.C1051c.m4690b(r5, r1)     // Catch:{ all -> 0x0057 }
                if (r1 == 0) goto L_0x0055
            L_0x0013:
                r1 = 4
                boolean r5 = p032c.p033a.p074i.p090n.C1051c.m4690b(r5, r1)     // Catch:{ all -> 0x0057 }
                if (r5 != 0) goto L_0x0055
                boolean r5 = p032c.p033a.p074i.p086j.C0988d.m4408e(r4)     // Catch:{ all -> 0x0057 }
                if (r5 == 0) goto L_0x0055
                c.a.h.c r5 = r4.mo4219r()     // Catch:{ all -> 0x0057 }
                c.a.h.c r1 = p032c.p033a.p073h.C0882b.f3116a     // Catch:{ all -> 0x0057 }
                if (r5 != r1) goto L_0x0055
                c.a.i.h.g r5 = r3.f3673j     // Catch:{ all -> 0x0057 }
                boolean r4 = r5.mo4187a(r4)     // Catch:{ all -> 0x0057 }
                r5 = 0
                if (r4 != 0) goto L_0x0033
                monitor-exit(r3)
                return r5
            L_0x0033:
                c.a.i.h.g r4 = r3.f3673j     // Catch:{ all -> 0x0057 }
                int r4 = r4.mo4188b()     // Catch:{ all -> 0x0057 }
                int r1 = r3.f3675l     // Catch:{ all -> 0x0057 }
                if (r4 > r1) goto L_0x003f
                monitor-exit(r3)
                return r5
            L_0x003f:
                c.a.i.h.f r1 = r3.f3674k     // Catch:{ all -> 0x0057 }
                int r2 = r3.f3675l     // Catch:{ all -> 0x0057 }
                int r1 = r1.mo4185b(r2)     // Catch:{ all -> 0x0057 }
                if (r4 >= r1) goto L_0x0053
                c.a.i.h.g r1 = r3.f3673j     // Catch:{ all -> 0x0057 }
                boolean r1 = r1.mo4189c()     // Catch:{ all -> 0x0057 }
                if (r1 != 0) goto L_0x0053
                monitor-exit(r3)
                return r5
            L_0x0053:
                r3.f3675l = r4     // Catch:{ all -> 0x0057 }
            L_0x0055:
                monitor-exit(r3)
                return r0
            L_0x0057:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1085p.C1087b.mo4344b(c.a.i.j.d, int):boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C0991g mo4345d() {
            return this.f3674k.mo4184a(this.f3673j.mo4188b());
        }
    }

    /* renamed from: c.a.i.n.p$c */
    private abstract class C1088c extends C1094s<C0988d, C0744b<C0986b>> {

        /* renamed from: c */
        private final String f3677c = "ProgressiveDecoder";
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C1084oa f3678d;

        /* renamed from: e */
        private final C1091qa f3679e;

        /* renamed from: f */
        private final C0939b f3680f;

        /* renamed from: g */
        private boolean f3681g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C1020I f3682h;

        public C1088c(C1081n<C0744b<C0986b>> nVar, C1084oa oaVar, boolean z) {
            super(nVar);
            this.f3678d = oaVar;
            this.f3679e = oaVar.mo4324e();
            this.f3680f = oaVar.mo4322c().mo4358c();
            this.f3681g = false;
            this.f3682h = new C1020I(C1085p.this.f3665b, new C1090q(this, C1085p.this, oaVar), this.f3680f.f3224b);
            this.f3678d.mo4319a(new C1092r(this, C1085p.this, z));
        }

        /* renamed from: a */
        private Map<String, String> m4854a(C0986b bVar, long j, C0991g gVar, boolean z, String str, String str2, String str3, String str4) {
            String str5;
            HashMap hashMap;
            C0986b bVar2 = bVar;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            if (!this.f3679e.mo4236a(this.f3678d.getId())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(gVar.mo4228b());
            String valueOf3 = String.valueOf(z);
            String str10 = "sampleSize";
            String str11 = "requestedImageSize";
            String str12 = "imageFormat";
            String str13 = "encodedImageSize";
            String str14 = "isFinal";
            String str15 = "hasGoodQuality";
            String str16 = "queueTime";
            if (bVar2 instanceof C0987c) {
                Bitmap t = ((C0987c) bVar2).mo4202t();
                StringBuilder sb = new StringBuilder();
                sb.append(t.getWidth());
                sb.append("x");
                sb.append(t.getHeight());
                String sb2 = sb.toString();
                hashMap = new HashMap(8);
                hashMap.put("bitmapSize", sb2);
                hashMap.put(str16, valueOf);
                hashMap.put(str15, valueOf2);
                hashMap.put(str14, valueOf3);
                hashMap.put(str13, str7);
                hashMap.put(str12, str6);
                hashMap.put(str11, str8);
                str5 = str4;
            } else {
                str5 = str9;
                hashMap = new HashMap(7);
                hashMap.put(str16, valueOf);
                hashMap.put(str15, valueOf2);
                hashMap.put(str14, valueOf3);
                hashMap.put(str13, str7);
                hashMap.put(str12, str6);
                hashMap.put(str11, str8);
            }
            hashMap.put(str10, str5);
            return C0712f.m3225a(hashMap);
        }

        /* renamed from: a */
        private void m4855a(C0986b bVar, int i) {
            C0744b a = C0744b.m3334a(bVar);
            try {
                m4858b(C1051c.m4687a(i));
                mo4347c().mo4310a(a, i);
            } finally {
                C0744b.m3336b(a);
            }
        }

        /* renamed from: b */
        private void m4858b(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f3681g) {
                        mo4347c().mo4308a(1.0f);
                        this.f3681g = true;
                        this.f3682h.mo4271a();
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3 A[Catch:{ all -> 0x0148 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m4859c(p032c.p033a.p074i.p086j.C0988d r19, int r20) {
            /*
                r18 = this;
                r11 = r18
                r0 = r20
                java.lang.String r12 = "DecodeProducer"
                c.a.h.c r1 = r19.mo4219r()
                c.a.h.c r2 = p032c.p033a.p073h.C0882b.f3116a
                if (r1 == r2) goto L_0x0015
                boolean r1 = p032c.p033a.p074i.p090n.C1051c.m4689b(r20)
                if (r1 == 0) goto L_0x0015
                return
            L_0x0015:
                boolean r1 = r18.m4863f()
                if (r1 != 0) goto L_0x014d
                boolean r1 = p032c.p033a.p074i.p086j.C0988d.m4408e(r19)
                if (r1 != 0) goto L_0x0023
                goto L_0x014d
            L_0x0023:
                c.a.h.c r1 = r19.mo4219r()
                java.lang.String r2 = "unknown"
                if (r1 == 0) goto L_0x0031
                java.lang.String r1 = r1.mo3951a()
                r7 = r1
                goto L_0x0032
            L_0x0031:
                r7 = r2
            L_0x0032:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r3 = r19.mo4224w()
                r1.append(r3)
                java.lang.String r3 = "x"
                r1.append(r3)
                int r4 = r19.mo4218q()
                r1.append(r4)
                java.lang.String r8 = r1.toString()
                int r1 = r19.mo4222u()
                java.lang.String r10 = java.lang.String.valueOf(r1)
                boolean r6 = p032c.p033a.p074i.p090n.C1051c.m4687a(r20)
                if (r6 == 0) goto L_0x0066
                r5 = 8
                boolean r5 = p032c.p033a.p074i.p090n.C1051c.m4690b(r0, r5)
                if (r5 != 0) goto L_0x0066
                r5 = 1
                goto L_0x0067
            L_0x0066:
                r5 = 0
            L_0x0067:
                r9 = 4
                boolean r13 = p032c.p033a.p074i.p090n.C1051c.m4690b(r0, r9)
                c.a.i.n.oa r14 = r11.f3678d
                c.a.i.o.c r14 = r14.mo4322c()
                c.a.i.e.e r14 = r14.mo4369l()
                if (r14 == 0) goto L_0x008e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r15 = r14.f3242a
                r2.append(r15)
                r2.append(r3)
                int r3 = r14.f3243b
                r2.append(r3)
                java.lang.String r2 = r2.toString()
            L_0x008e:
                r14 = r2
                c.a.i.n.I r2 = r11.f3682h     // Catch:{ all -> 0x0148 }
                long r15 = r2.mo4273b()     // Catch:{ all -> 0x0148 }
                c.a.i.n.oa r2 = r11.f3678d     // Catch:{ all -> 0x0148 }
                c.a.i.o.c r2 = r2.mo4322c()     // Catch:{ all -> 0x0148 }
                android.net.Uri r2 = r2.mo4372o()     // Catch:{ all -> 0x0148 }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0148 }
                if (r5 != 0) goto L_0x00ad
                if (r13 == 0) goto L_0x00a8
                goto L_0x00ad
            L_0x00a8:
                int r3 = r18.mo4343a(r19)     // Catch:{ all -> 0x0148 }
                goto L_0x00b1
            L_0x00ad:
                int r3 = r19.mo4223v()     // Catch:{ all -> 0x0148 }
            L_0x00b1:
                if (r5 != 0) goto L_0x00bb
                if (r13 == 0) goto L_0x00b6
                goto L_0x00bb
            L_0x00b6:
                c.a.i.j.g r5 = r18.mo4345d()     // Catch:{ all -> 0x0148 }
                goto L_0x00bd
            L_0x00bb:
                c.a.i.j.g r5 = p032c.p033a.p074i.p086j.C0990f.f3456a     // Catch:{ all -> 0x0148 }
            L_0x00bd:
                c.a.i.n.qa r13 = r11.f3679e     // Catch:{ all -> 0x0148 }
                c.a.i.n.oa r1 = r11.f3678d     // Catch:{ all -> 0x0148 }
                java.lang.String r1 = r1.getId()     // Catch:{ all -> 0x0148 }
                r13.mo4232a(r1, r12)     // Catch:{ all -> 0x0148 }
                c.a.i.n.p r13 = p032c.p033a.p074i.p090n.C1085p.this     // Catch:{ a -> 0x0100 }
                c.a.i.h.d r13 = r13.f3666c     // Catch:{ a -> 0x0100 }
                c.a.i.e.b r1 = r11.f3680f     // Catch:{ a -> 0x0100 }
                r4 = r19
                c.a.i.j.b r13 = r13.mo4178a(r4, r3, r5, r1)     // Catch:{ a -> 0x0100 }
                int r1 = r19.mo4222u()     // Catch:{ Exception -> 0x00fa }
                r2 = 1
                if (r1 == r2) goto L_0x00df
                r0 = r0 | 16
            L_0x00df:
                r1 = r18
                r2 = r13
                r3 = r15
                r9 = r14
                java.util.Map r1 = r1.m4854a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0148 }
                c.a.i.n.qa r2 = r11.f3679e     // Catch:{ all -> 0x0148 }
                c.a.i.n.oa r3 = r11.f3678d     // Catch:{ all -> 0x0148 }
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0148 }
                r2.mo4237b(r3, r12, r1)     // Catch:{ all -> 0x0148 }
                r11.m4855a(r13, r0)     // Catch:{ all -> 0x0148 }
                p032c.p033a.p074i.p086j.C0988d.m4406b(r19)
                return
            L_0x00fa:
                r0 = move-exception
                r2 = r13
                goto L_0x012e
            L_0x00fd:
                r0 = move-exception
                r2 = 0
                goto L_0x012e
            L_0x0100:
                r0 = move-exception
                c.a.i.j.d r1 = r0.mo4177a()     // Catch:{ Exception -> 0x00fd }
                java.lang.String r3 = "ProgressiveDecoder"
                java.lang.String r4 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00fd }
                java.lang.String r13 = r0.getMessage()     // Catch:{ Exception -> 0x00fd }
                r17 = 0
                r9[r17] = r13     // Catch:{ Exception -> 0x00fd }
                r13 = 1
                r9[r13] = r2     // Catch:{ Exception -> 0x00fd }
                r2 = 2
                r13 = 10
                java.lang.String r13 = r1.mo4205b(r13)     // Catch:{ Exception -> 0x00fd }
                r9[r2] = r13     // Catch:{ Exception -> 0x00fd }
                r2 = 3
                int r1 = r1.mo4223v()     // Catch:{ Exception -> 0x00fd }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00fd }
                r9[r2] = r1     // Catch:{ Exception -> 0x00fd }
                p032c.p033a.p038c.p043e.C0727a.m3283c(r3, r4, r9)     // Catch:{ Exception -> 0x00fd }
                throw r0     // Catch:{ Exception -> 0x00fd }
            L_0x012e:
                r1 = r18
                r3 = r15
                r9 = r14
                java.util.Map r1 = r1.m4854a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0148 }
                c.a.i.n.qa r2 = r11.f3679e     // Catch:{ all -> 0x0148 }
                c.a.i.n.oa r3 = r11.f3678d     // Catch:{ all -> 0x0148 }
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0148 }
                r2.mo4234a(r3, r12, r0, r1)     // Catch:{ all -> 0x0148 }
                r11.m4861c(r0)     // Catch:{ all -> 0x0148 }
                p032c.p033a.p074i.p086j.C0988d.m4406b(r19)
                return
            L_0x0148:
                r0 = move-exception
                p032c.p033a.p074i.p086j.C0988d.m4406b(r19)
                throw r0
            L_0x014d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1085p.C1088c.m4859c(c.a.i.j.d, int):void");
        }

        /* renamed from: c */
        private void m4861c(Throwable th) {
            m4858b(true);
            mo4347c().mo4311a(th);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m4862e() {
            m4858b(true);
            mo4347c().mo4307a();
        }

        /* renamed from: f */
        private synchronized boolean m4863f() {
            return this.f3681g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo4343a(C0988d dVar);

        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            boolean a = C1051c.m4687a(i);
            if (a && !C0988d.m4408e(dVar)) {
                m4861c((Throwable) new C0753a("Encoded image is not valid."));
            } else if (mo4344b(dVar, i)) {
                boolean b = C1051c.m4690b(i, 4);
                if (a || b || this.f3678d.mo4325f()) {
                    this.f3682h.mo4274c();
                }
            }
        }

        /* renamed from: b */
        public void mo4170b() {
            m4862e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4171b(float f) {
            super.mo4171b(f * 0.99f);
        }

        /* renamed from: b */
        public void mo4173b(Throwable th) {
            m4861c(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo4344b(C0988d dVar, int i) {
            return this.f3682h.mo4272a(dVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract C0991g mo4345d();
    }

    public C1085p(C0731a aVar, Executor executor, C0976d dVar, C0978f fVar, boolean z, boolean z2, boolean z3, C1082na<C0988d> naVar) {
        C0718j.m3240a(aVar);
        this.f3664a = aVar;
        C0718j.m3240a(executor);
        this.f3665b = executor;
        C0718j.m3240a(dVar);
        this.f3666c = dVar;
        C0718j.m3240a(fVar);
        this.f3667d = fVar;
        this.f3669f = z;
        this.f3670g = z2;
        C0718j.m3240a(naVar);
        this.f3668e = naVar;
        this.f3671h = z3;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [c.a.i.n.n] */
    /* JADX WARNING: type inference failed for: r0v6, types: [c.a.i.n.p$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4248a(p032c.p033a.p074i.p090n.C1081n<p032c.p033a.p038c.p046h.C0744b<p032c.p033a.p074i.p086j.C0986b>> r10, p032c.p033a.p074i.p090n.C1084oa r11) {
        /*
            r9 = this;
            c.a.i.o.c r0 = r11.mo4322c()
            android.net.Uri r0 = r0.mo4372o()
            boolean r0 = p032c.p033a.p038c.p049k.C0758f.m3381i(r0)
            if (r0 != 0) goto L_0x0016
            c.a.i.n.p$a r0 = new c.a.i.n.p$a
            boolean r1 = r9.f3671h
            r0.<init>(r10, r11, r1)
            goto L_0x002a
        L_0x0016:
            c.a.i.h.g r6 = new c.a.i.h.g
            c.a.c.g.a r0 = r9.f3664a
            r6.<init>(r0)
            c.a.i.n.p$b r0 = new c.a.i.n.p$b
            c.a.i.h.f r7 = r9.f3667d
            boolean r8 = r9.f3671h
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r4, r5, r6, r7, r8)
        L_0x002a:
            c.a.i.n.na<c.a.i.j.d> r10 = r9.f3668e
            r10.mo4248a(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1085p.mo4248a(c.a.i.n.n, c.a.i.n.oa):void");
    }
}
