package com.facebook.react.uimanager;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.C1458b.C1459a;
import com.facebook.react.modules.core.C1466i;
import com.facebook.react.modules.core.C1466i.C1467a;
import com.facebook.react.uimanager.C1584U.C1585a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.p122b.C1599a;
import com.facebook.systrace.C1937a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p099a.C1165a;
import p032c.p033a.p098m.p099a.C1168d;

/* renamed from: com.facebook.react.uimanager.ha */
public class C1655ha {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int[] f4942a = new int[4];
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1719s f4943b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1168d f4944c;

    /* renamed from: d */
    private final Object f4945d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f4946e = new Object();

    /* renamed from: f */
    private final C1663h f4947f;

    /* renamed from: g */
    private final ReactApplicationContext f4948g;

    /* renamed from: h */
    private ArrayList<C1676u> f4949h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<Runnable> f4950i = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ArrayDeque<C1676u> f4951j = new ArrayDeque<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1599a f4952k;

    /* renamed from: l */
    private boolean f4953l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f4954m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f4955n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f4956o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f4957p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f4958q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f4959r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f4960s;

    /* renamed from: t */
    private long f4961t;

    /* renamed from: u */
    private long f4962u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f4963v;

    /* renamed from: com.facebook.react.uimanager.ha$a */
    private class C1656a extends C1657b {

        /* renamed from: b */
        private final int f4964b;

        /* renamed from: c */
        private final Callback f4965c;

        private C1656a(int i, int i2, Callback callback) {
            super(i2);
            this.f4964b = i;
            this.f4965c = callback;
        }

        /* synthetic */ C1656a(C1655ha haVar, int i, int i2, Callback callback, C1651fa faVar) {
            this(i, i2, callback);
        }

        public void execute() {
            C1165a a = C1655ha.this.f4944c.mo4526a(this.f4967a);
            if (a != null) {
                C1655ha.this.f4943b.mo5992a(this.f4964b, a, this.f4965c);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Animation with id ");
            sb.append(this.f4967a);
            sb.append(" was not found");
            throw new C1685k(sb.toString());
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$b */
    private static abstract class C1657b implements C1676u {

        /* renamed from: a */
        protected final int f4967a;

        public C1657b(int i) {
            this.f4967a = i;
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$c */
    private final class C1658c extends C1680y {

        /* renamed from: c */
        private final int f4968c;

        /* renamed from: d */
        private final boolean f4969d;

        /* renamed from: e */
        private final boolean f4970e;

        public C1658c(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.f4968c = i2;
            this.f4970e = z;
            this.f4969d = z2;
        }

        public void execute() {
            if (!this.f4970e) {
                C1655ha.this.f4943b.mo5990a(this.f5026a, this.f4968c, this.f4969d);
            } else {
                C1655ha.this.f4943b.mo5985a();
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$d */
    private class C1659d implements C1676u {

        /* renamed from: a */
        private final ReadableMap f4972a;

        private C1659d(ReadableMap readableMap) {
            this.f4972a = readableMap;
        }

        /* synthetic */ C1659d(C1655ha haVar, ReadableMap readableMap, C1651fa faVar) {
            this(readableMap);
        }

        public void execute() {
            C1655ha.this.f4943b.mo6000a(this.f4972a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$e */
    private final class C1660e extends C1680y {

        /* renamed from: c */
        private final C1578N f4974c;

        /* renamed from: d */
        private final String f4975d;

        /* renamed from: e */
        private final C1571G f4976e;

        public C1660e(C1578N n, int i, String str, C1571G g) {
            super(i);
            this.f4974c = n;
            this.f4975d = str;
            this.f4976e = g;
            C1937a.m7349d(0, "createView", this.f5026a);
        }

        public void execute() {
            C1937a.m7344b(0, "createView", this.f5026a);
            C1655ha.this.f4943b.mo6001a(this.f4974c, this.f5026a, this.f4975d, this.f4976e);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$f */
    private final class C1661f implements C1676u {
        private C1661f() {
        }

        /* synthetic */ C1661f(C1655ha haVar, C1651fa faVar) {
            this();
        }

        public void execute() {
            C1655ha.this.f4943b.mo6007c();
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$g */
    private final class C1662g extends C1680y {

        /* renamed from: c */
        private final int f4979c;

        /* renamed from: d */
        private final ReadableArray f4980d;

        public C1662g(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.f4979c = i2;
            this.f4980d = readableArray;
        }

        public void execute() {
            C1655ha.this.f4943b.mo5989a(this.f5026a, this.f4979c, this.f4980d);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$h */
    private class C1663h extends C1683j {

        /* renamed from: c */
        private final int f4982c;

        private C1663h(ReactContext reactContext, int i) {
            super(reactContext);
            this.f4982c = i;
        }

        /* synthetic */ C1663h(C1655ha haVar, ReactContext reactContext, int i, C1651fa faVar) {
            this(reactContext, i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2 = android.os.SystemClock.uptimeMillis();
            r1.execute();
            com.facebook.react.uimanager.C1655ha.m6488f(r8.f4983d, com.facebook.react.uimanager.C1655ha.m6495l(r8.f4983d) + (android.os.SystemClock.uptimeMillis() - r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
            com.facebook.react.uimanager.C1655ha.m6478a(r8.f4983d, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            throw r9;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m6529c(long r9) {
            /*
                r8 = this;
            L_0x0000:
                r0 = 16
                long r2 = java.lang.System.nanoTime()
                long r2 = r2 - r9
                r4 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r2 / r4
                long r0 = r0 - r2
                int r2 = r8.f4982c
                long r2 = (long) r2
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L_0x0014
                goto L_0x0028
            L_0x0014:
                com.facebook.react.uimanager.ha r0 = com.facebook.react.uimanager.C1655ha.this
                java.lang.Object r0 = r0.f4946e
                monitor-enter(r0)
                com.facebook.react.uimanager.ha r1 = com.facebook.react.uimanager.C1655ha.this     // Catch:{ all -> 0x0057 }
                java.util.ArrayDeque r1 = r1.f4951j     // Catch:{ all -> 0x0057 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0057 }
                if (r1 == 0) goto L_0x0029
                monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            L_0x0028:
                return
            L_0x0029:
                com.facebook.react.uimanager.ha r1 = com.facebook.react.uimanager.C1655ha.this     // Catch:{ all -> 0x0057 }
                java.util.ArrayDeque r1 = r1.f4951j     // Catch:{ all -> 0x0057 }
                java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0057 }
                com.facebook.react.uimanager.ha$u r1 = (com.facebook.react.uimanager.C1655ha.C1676u) r1     // Catch:{ all -> 0x0057 }
                monitor-exit(r0)     // Catch:{ all -> 0x0057 }
                long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x004f }
                r1.execute()     // Catch:{ Exception -> 0x004f }
                com.facebook.react.uimanager.ha r0 = com.facebook.react.uimanager.C1655ha.this     // Catch:{ Exception -> 0x004f }
                com.facebook.react.uimanager.ha r1 = com.facebook.react.uimanager.C1655ha.this     // Catch:{ Exception -> 0x004f }
                long r4 = r1.f4956o     // Catch:{ Exception -> 0x004f }
                long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x004f }
                long r6 = r6 - r2
                long r4 = r4 + r6
                r0.f4956o = r4     // Catch:{ Exception -> 0x004f }
                goto L_0x0000
            L_0x004f:
                r9 = move-exception
                com.facebook.react.uimanager.ha r10 = com.facebook.react.uimanager.C1655ha.this
                r0 = 1
                r10.f4954m = r0
                throw r9
            L_0x0057:
                r9 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0057 }
                throw r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1655ha.C1663h.m6529c(long):void");
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public void mo4870b(long j) {
            if (C1655ha.this.f4954m) {
                C0727a.m3284d("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            C1937a.m7339a(0, "dispatchNonBatchedUIOperations");
            try {
                m6529c(j);
                C1937a.m7338a(0);
                C1655ha.this.m6491i();
                C1466i.m5877a().mo5342a(C1467a.DISPATCH_UI, (C1459a) this);
            } catch (Throwable th) {
                C1937a.m7338a(0);
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$i */
    private final class C1664i implements C1676u {

        /* renamed from: a */
        private final int f4984a;

        /* renamed from: b */
        private final float f4985b;

        /* renamed from: c */
        private final float f4986c;

        /* renamed from: d */
        private final Callback f4987d;

        private C1664i(int i, float f, float f2, Callback callback) {
            this.f4984a = i;
            this.f4985b = f;
            this.f4986c = f2;
            this.f4987d = callback;
        }

        /* synthetic */ C1664i(C1655ha haVar, int i, float f, float f2, Callback callback, C1651fa faVar) {
            this(i, f, f2, callback);
        }

        public void execute() {
            try {
                C1655ha.this.f4943b.mo5997a(this.f4984a, C1655ha.this.f4942a);
                float f = (float) C1655ha.this.f4942a[0];
                float f2 = (float) C1655ha.this.f4942a[1];
                int a = C1655ha.this.f4943b.mo5984a(this.f4984a, this.f4985b, this.f4986c);
                try {
                    C1655ha.this.f4943b.mo5997a(a, C1655ha.this.f4942a);
                    float a2 = C1726w.m6666a(((float) C1655ha.this.f4942a[0]) - f);
                    float a3 = C1726w.m6666a(((float) C1655ha.this.f4942a[1]) - f2);
                    float a4 = C1726w.m6666a((float) C1655ha.this.f4942a[2]);
                    float a5 = C1726w.m6666a((float) C1655ha.this.f4942a[3]);
                    this.f4987d.invoke(Integer.valueOf(a), Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(a4), Float.valueOf(a5));
                } catch (C1685k unused) {
                    this.f4987d.invoke(new Object[0]);
                }
            } catch (C1685k unused2) {
                this.f4987d.invoke(new Object[0]);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$j */
    private final class C1665j implements C1676u {

        /* renamed from: a */
        private final C1569E f4989a;

        /* renamed from: b */
        private final C1585a f4990b;

        private C1665j(C1569E e, C1585a aVar) {
            this.f4989a = e;
            this.f4990b = aVar;
        }

        /* synthetic */ C1665j(C1655ha haVar, C1569E e, C1585a aVar, C1651fa faVar) {
            this(e, aVar);
        }

        public void execute() {
            this.f4990b.mo5750a(this.f4989a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$k */
    private final class C1666k extends C1680y {

        /* renamed from: c */
        private final int[] f4992c;

        /* renamed from: d */
        private final C1684ja[] f4993d;

        /* renamed from: e */
        private final int[] f4994e;

        public C1666k(int i, int[] iArr, C1684ja[] jaVarArr, int[] iArr2) {
            super(i);
            this.f4992c = iArr;
            this.f4993d = jaVarArr;
            this.f4994e = iArr2;
        }

        public void execute() {
            C1655ha.this.f4943b.mo5998a(this.f5026a, this.f4992c, this.f4993d, this.f4994e);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$l */
    private final class C1667l implements C1676u {

        /* renamed from: a */
        private final int f4996a;

        /* renamed from: b */
        private final Callback f4997b;

        private C1667l(int i, Callback callback) {
            this.f4996a = i;
            this.f4997b = callback;
        }

        /* synthetic */ C1667l(C1655ha haVar, int i, Callback callback, C1651fa faVar) {
            this(i, callback);
        }

        public void execute() {
            try {
                C1655ha.this.f4943b.mo6005b(this.f4996a, C1655ha.this.f4942a);
                float a = C1726w.m6666a((float) C1655ha.this.f4942a[0]);
                float a2 = C1726w.m6666a((float) C1655ha.this.f4942a[1]);
                float a3 = C1726w.m6666a((float) C1655ha.this.f4942a[2]);
                float a4 = C1726w.m6666a((float) C1655ha.this.f4942a[3]);
                this.f4997b.invoke(Float.valueOf(a), Float.valueOf(a2), Float.valueOf(a3), Float.valueOf(a4));
            } catch (C1724u unused) {
                this.f4997b.invoke(new Object[0]);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$m */
    private final class C1668m implements C1676u {

        /* renamed from: a */
        private final int f4999a;

        /* renamed from: b */
        private final Callback f5000b;

        private C1668m(int i, Callback callback) {
            this.f4999a = i;
            this.f5000b = callback;
        }

        /* synthetic */ C1668m(C1655ha haVar, int i, Callback callback, C1651fa faVar) {
            this(i, callback);
        }

        public void execute() {
            try {
                C1655ha.this.f4943b.mo5997a(this.f4999a, C1655ha.this.f4942a);
                float a = C1726w.m6666a((float) C1655ha.this.f4942a[0]);
                float a2 = C1726w.m6666a((float) C1655ha.this.f4942a[1]);
                float a3 = C1726w.m6666a((float) C1655ha.this.f4942a[2]);
                float a4 = C1726w.m6666a((float) C1655ha.this.f4942a[3]);
                this.f5000b.invoke(Integer.valueOf(0), Integer.valueOf(0), Float.valueOf(a3), Float.valueOf(a4), Float.valueOf(a), Float.valueOf(a2));
            } catch (C1724u unused) {
                this.f5000b.invoke(new Object[0]);
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$n */
    private class C1669n extends C1657b {

        /* renamed from: b */
        private final C1165a f5002b;

        private C1669n(C1165a aVar) {
            super(aVar.mo4522b());
            this.f5002b = aVar;
        }

        /* synthetic */ C1669n(C1655ha haVar, C1165a aVar, C1651fa faVar) {
            this(aVar);
        }

        public void execute() {
            C1655ha.this.f4944c.mo4527a(this.f5002b);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$o */
    private final class C1670o extends C1657b {
        private C1670o(int i) {
            super(i);
        }

        /* synthetic */ C1670o(C1655ha haVar, int i, C1651fa faVar) {
            this(i);
        }

        public void execute() {
            C1165a a = C1655ha.this.f4944c.mo4526a(this.f4967a);
            if (a != null) {
                a.mo4519a();
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$p */
    private final class C1671p extends C1680y {
        public C1671p(int i) {
            super(i);
        }

        public void execute() {
            C1655ha.this.f4943b.mo5986a(this.f5026a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$q */
    private final class C1672q extends C1680y {

        /* renamed from: c */
        private final int f5006c;

        private C1672q(int i, int i2) {
            super(i);
            this.f5006c = i2;
        }

        /* synthetic */ C1672q(C1655ha haVar, int i, int i2, C1651fa faVar) {
            this(i, i2);
        }

        public void execute() {
            C1655ha.this.f4943b.mo5987a(this.f5026a, this.f5006c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$r */
    private class C1673r implements C1676u {

        /* renamed from: a */
        private final boolean f5008a;

        private C1673r(boolean z) {
            this.f5008a = z;
        }

        /* synthetic */ C1673r(C1655ha haVar, boolean z, C1651fa faVar) {
            this(z);
        }

        public void execute() {
            C1655ha.this.f4943b.mo6002a(this.f5008a);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$s */
    private final class C1674s extends C1680y {

        /* renamed from: c */
        private final ReadableArray f5010c;

        /* renamed from: d */
        private final Callback f5011d;

        /* renamed from: e */
        private final Callback f5012e;

        public C1674s(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.f5010c = readableArray;
            this.f5011d = callback;
            this.f5012e = callback2;
        }

        public void execute() {
            C1655ha.this.f4943b.mo5993a(this.f5026a, this.f5010c, this.f5012e, this.f5011d);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$t */
    private class C1675t implements C1676u {

        /* renamed from: a */
        private final C1582S f5014a;

        public C1675t(C1582S s) {
            this.f5014a = s;
        }

        public void execute() {
            this.f5014a.mo4871a(C1655ha.this.f4943b);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$u */
    public interface C1676u {
        void execute();
    }

    /* renamed from: com.facebook.react.uimanager.ha$v */
    private final class C1677v extends C1680y {

        /* renamed from: c */
        private final int f5016c;

        /* renamed from: d */
        private final int f5017d;

        /* renamed from: e */
        private final int f5018e;

        /* renamed from: f */
        private final int f5019f;

        /* renamed from: g */
        private final int f5020g;

        public C1677v(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.f5016c = i;
            this.f5017d = i3;
            this.f5018e = i4;
            this.f5019f = i5;
            this.f5020g = i6;
            C1937a.m7349d(0, "updateLayout", this.f5026a);
        }

        public void execute() {
            C1937a.m7344b(0, "updateLayout", this.f5026a);
            C1655ha.this.f4943b.mo5988a(this.f5016c, this.f5026a, this.f5017d, this.f5018e, this.f5019f, this.f5020g);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$w */
    private final class C1678w extends C1680y {

        /* renamed from: c */
        private final C1571G f5022c;

        private C1678w(int i, C1571G g) {
            super(i);
            this.f5022c = g;
        }

        /* synthetic */ C1678w(C1655ha haVar, int i, C1571G g, C1651fa faVar) {
            this(i, g);
        }

        public void execute() {
            C1655ha.this.f4943b.mo5994a(this.f5026a, this.f5022c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$x */
    private final class C1679x extends C1680y {

        /* renamed from: c */
        private final Object f5024c;

        public C1679x(int i, Object obj) {
            super(i);
            this.f5024c = obj;
        }

        public void execute() {
            C1655ha.this.f4943b.mo5996a(this.f5026a, this.f5024c);
        }
    }

    /* renamed from: com.facebook.react.uimanager.ha$y */
    private abstract class C1680y implements C1676u {

        /* renamed from: a */
        public int f5026a;

        public C1680y(int i) {
            this.f5026a = i;
        }
    }

    public C1655ha(ReactApplicationContext reactApplicationContext, C1719s sVar, int i) {
        this.f4943b = sVar;
        this.f4944c = sVar.mo6008d();
        if (i == -1) {
            i = 8;
        }
        this.f4947f = new C1663h(this, reactApplicationContext, i, null);
        this.f4948g = reactApplicationContext;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = android.os.SystemClock.uptimeMillis();
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r12.f4955n == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r12.f4961t = android.os.SystemClock.uptimeMillis() - r2;
        r12.f4962u = r12.f4956o;
        r12.f4955n = false;
        com.facebook.systrace.C1937a.m7341a(0, "batchedExecutionTime", 0, 1000000 * r2);
        com.facebook.systrace.C1937a.m7348c(0, "batchedExecutionTime", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r12.f4956o = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6491i() {
        /*
            r12 = this;
            boolean r0 = r12.f4954m
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Not flushing pending UI operations because of previously thrown Exception"
            p032c.p033a.p038c.p043e.C0727a.m3284d(r0, r1)
            return
        L_0x000c:
            java.lang.Object r0 = r12.f4945d
            monitor-enter(r0)
            java.util.ArrayList<java.lang.Runnable> r1 = r12.f4950i     // Catch:{ all -> 0x0064 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0062
            java.util.ArrayList<java.lang.Runnable> r1 = r12.f4950i     // Catch:{ all -> 0x0064 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0064 }
            r2.<init>()     // Catch:{ all -> 0x0064 }
            r12.f4950i = r2     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            long r2 = android.os.SystemClock.uptimeMillis()
            java.util.Iterator r0 = r1.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0029
        L_0x0039:
            boolean r0 = r12.f4955n
            r4 = 0
            if (r0 == 0) goto L_0x005f
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            r12.f4961t = r0
            long r0 = r12.f4956o
            r12.f4962u = r0
            r0 = 0
            r12.f4955n = r0
            r6 = 0
            r9 = 0
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r2
            java.lang.String r8 = "batchedExecutionTime"
            com.facebook.systrace.C1937a.m7341a(r6, r8, r9, r10)
            java.lang.String r1 = "batchedExecutionTime"
            com.facebook.systrace.C1937a.m7348c(r4, r1, r0)
        L_0x005f:
            r12.f4956o = r4
            return
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0064:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1655ha.m6491i():void");
    }

    /* renamed from: a */
    public void mo5907a() {
        ArrayList<C1676u> arrayList = this.f4949h;
        C1658c cVar = new C1658c(0, 0, true, false);
        arrayList.add(cVar);
    }

    /* renamed from: a */
    public void mo5908a(int i) {
        this.f4949h.add(new C1670o(this, i, null));
    }

    /* renamed from: a */
    public void mo5909a(int i, float f, float f2, Callback callback) {
        ArrayList<C1676u> arrayList = this.f4949h;
        C1664i iVar = new C1664i(this, i, f, f2, callback, null);
        arrayList.add(iVar);
    }

    /* renamed from: a */
    public void mo5910a(int i, int i2) {
        this.f4949h.add(new C1672q(this, i, i2, null));
    }

    /* renamed from: a */
    public void mo5911a(int i, int i2, int i3, int i4, int i5, int i6) {
        ArrayList<C1676u> arrayList = this.f4949h;
        C1677v vVar = new C1677v(i, i2, i3, i4, i5, i6);
        arrayList.add(vVar);
    }

    /* renamed from: a */
    public void mo5912a(int i, int i2, Callback callback) {
        ArrayList<C1676u> arrayList = this.f4949h;
        C1656a aVar = new C1656a(this, i, i2, callback, null);
        arrayList.add(aVar);
    }

    /* renamed from: a */
    public void mo5913a(int i, int i2, ReadableArray readableArray) {
        this.f4949h.add(new C1662g(i, i2, readableArray));
    }

    /* renamed from: a */
    public void mo5914a(int i, int i2, boolean z) {
        ArrayList<C1676u> arrayList = this.f4949h;
        C1658c cVar = new C1658c(i, i2, false, z);
        arrayList.add(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009e, code lost:
        r0 = th;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5915a(int r19, long r20, long r22) {
        /*
            r18 = this;
            r14 = r18
            r0 = r19
            r12 = 0
            java.lang.String r1 = "UIViewOperationQueue.dispatchViewUpdates"
            com.facebook.systrace.c$a r1 = com.facebook.systrace.C1940c.m7352a(r12, r1)
            java.lang.String r2 = "batchId"
            r1.mo6821a(r2, r0)
            r1.mo6823a()
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00a0 }
            long r15 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x00a0 }
            java.util.ArrayList<com.facebook.react.uimanager.ha$u> r1 = r14.f4949h     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a0 }
            r2 = 0
            if (r1 != 0) goto L_0x0030
            java.util.ArrayList<com.facebook.react.uimanager.ha$u> r1 = r14.f4949h     // Catch:{ all -> 0x00a0 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00a0 }
            r3.<init>()     // Catch:{ all -> 0x00a0 }
            r14.f4949h = r3     // Catch:{ all -> 0x00a0 }
            r5 = r1
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            java.lang.Object r1 = r14.f4946e     // Catch:{ all -> 0x00a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a0 }
            java.util.ArrayDeque<com.facebook.react.uimanager.ha$u> r3 = r14.f4951j     // Catch:{ all -> 0x0098 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x0045
            java.util.ArrayDeque<com.facebook.react.uimanager.ha$u> r2 = r14.f4951j     // Catch:{ all -> 0x0098 }
            java.util.ArrayDeque r3 = new java.util.ArrayDeque     // Catch:{ all -> 0x0098 }
            r3.<init>()     // Catch:{ all -> 0x0098 }
            r14.f4951j = r3     // Catch:{ all -> 0x0098 }
        L_0x0045:
            r4 = r2
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            com.facebook.react.uimanager.b.a r1 = r14.f4952k     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0050
            com.facebook.react.uimanager.b.a r1 = r14.f4952k     // Catch:{ all -> 0x00a0 }
            r1.mo5358a()     // Catch:{ all -> 0x00a0 }
        L_0x0050:
            com.facebook.react.uimanager.fa r8 = new com.facebook.react.uimanager.fa     // Catch:{ all -> 0x00a0 }
            r1 = r8
            r2 = r18
            r3 = r19
            r6 = r20
            r17 = r8
            r8 = r22
            r12 = r15
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r12)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "acquiring mDispatchRunnablesLock"
            r2 = 0
            com.facebook.systrace.c$a r1 = com.facebook.systrace.C1940c.m7352a(r2, r1)     // Catch:{ all -> 0x009c }
            java.lang.String r4 = "batchId"
            r1.mo6821a(r4, r0)     // Catch:{ all -> 0x009c }
            r1.mo6823a()     // Catch:{ all -> 0x009c }
            java.lang.Object r1 = r14.f4945d     // Catch:{ all -> 0x009c }
            monitor-enter(r1)     // Catch:{ all -> 0x009c }
            com.facebook.systrace.C1937a.m7338a(r2)     // Catch:{ all -> 0x0091 }
            java.util.ArrayList<java.lang.Runnable> r0 = r14.f4950i     // Catch:{ all -> 0x0091 }
            r4 = r17
            r0.add(r4)     // Catch:{ all -> 0x0091 }
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            boolean r0 = r14.f4953l     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x008d
            com.facebook.react.uimanager.ga r0 = new com.facebook.react.uimanager.ga     // Catch:{ all -> 0x009c }
            com.facebook.react.bridge.ReactApplicationContext r1 = r14.f4948g     // Catch:{ all -> 0x009c }
            r0.<init>(r14, r1)     // Catch:{ all -> 0x009c }
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)     // Catch:{ all -> 0x009c }
        L_0x008d:
            com.facebook.systrace.C1937a.m7338a(r2)
            return
        L_0x0091:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x0094:
            r0 = move-exception
            r2 = 0
            goto L_0x00a2
        L_0x0098:
            r0 = move-exception
            r2 = r12
        L_0x009a:
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            goto L_0x009a
        L_0x00a0:
            r0 = move-exception
            r2 = r12
        L_0x00a2:
            com.facebook.systrace.C1937a.m7338a(r2)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1655ha.mo5915a(int, long, long):void");
    }

    /* renamed from: a */
    public void mo5916a(int i, Callback callback) {
        this.f4949h.add(new C1668m(this, i, callback, null));
    }

    /* renamed from: a */
    public void mo5917a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        ArrayList<C1676u> arrayList = this.f4949h;
        C1674s sVar = new C1674s(i, readableArray, callback, callback2);
        arrayList.add(sVar);
    }

    /* renamed from: a */
    public void mo5918a(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, C1578N n) {
        this.f4943b.mo5995a(i, sizeMonitoringFrameLayout, n);
    }

    /* renamed from: a */
    public void mo5919a(int i, Object obj) {
        this.f4949h.add(new C1679x(i, obj));
    }

    /* renamed from: a */
    public void mo5920a(int i, String str, C1571G g) {
        this.f4949h.add(new C1678w(this, i, g, null));
    }

    /* renamed from: a */
    public void mo5921a(int i, int[] iArr, C1684ja[] jaVarArr, int[] iArr2) {
        ArrayList<C1676u> arrayList = this.f4949h;
        C1666k kVar = new C1666k(i, iArr, jaVarArr, iArr2);
        arrayList.add(kVar);
    }

    /* renamed from: a */
    public void mo5922a(C1165a aVar) {
        this.f4949h.add(new C1669n(this, aVar, null));
    }

    /* renamed from: a */
    public void mo5923a(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.f4949h.add(new C1659d(this, readableMap, null));
    }

    /* renamed from: a */
    public void mo5924a(C1569E e, C1585a aVar) {
        this.f4949h.add(new C1665j(this, e, aVar, null));
    }

    /* renamed from: a */
    public void mo5925a(C1578N n, int i, String str, C1571G g) {
        synchronized (this.f4946e) {
            ArrayDeque<C1676u> arrayDeque = this.f4951j;
            C1660e eVar = new C1660e(n, i, str, g);
            arrayDeque.addLast(eVar);
        }
    }

    /* renamed from: a */
    public void mo5926a(C1582S s) {
        this.f4949h.add(new C1675t(s));
    }

    /* renamed from: a */
    public void mo5927a(C1599a aVar) {
        this.f4952k = aVar;
    }

    /* renamed from: a */
    public void mo5928a(boolean z) {
        this.f4949h.add(new C1673r(this, z, null));
    }

    /* renamed from: b */
    public void mo5929b() {
        this.f4949h.add(new C1661f(this, null));
    }

    /* renamed from: b */
    public void mo5930b(int i) {
        this.f4949h.add(new C1671p(i));
    }

    /* renamed from: b */
    public void mo5931b(int i, Callback callback) {
        this.f4949h.add(new C1667l(this, i, callback, null));
    }

    /* renamed from: b */
    public void mo5932b(C1582S s) {
        this.f4949h.add(0, new C1675t(s));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1719s mo5933c() {
        return this.f4943b;
    }

    /* renamed from: d */
    public Map<String, Long> mo5934d() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.f4957p));
        hashMap.put("LayoutTime", Long.valueOf(this.f4958q));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.f4959r));
        hashMap.put("RunStartTime", Long.valueOf(this.f4960s));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.f4961t));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.f4962u));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.f4963v));
        return hashMap;
    }

    /* renamed from: e */
    public boolean mo5935e() {
        return this.f4949h.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5936f() {
        this.f4953l = false;
        C1466i.m5877a().mo5344b(C1467a.DISPATCH_UI, this.f4947f);
        m6491i();
    }

    /* renamed from: g */
    public void mo5937g() {
        this.f4955n = true;
        this.f4957p = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo5938h() {
        this.f4953l = true;
        C1466i.m5877a().mo5342a(C1467a.DISPATCH_UI, (C1459a) this.f4947f);
    }
}
