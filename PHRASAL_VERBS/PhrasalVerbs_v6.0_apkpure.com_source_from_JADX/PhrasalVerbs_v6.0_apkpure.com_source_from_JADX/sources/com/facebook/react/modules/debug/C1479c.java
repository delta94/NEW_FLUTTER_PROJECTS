package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C1458b;
import com.facebook.react.modules.core.C1458b.C1459a;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map.Entry;
import java.util.TreeMap;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.modules.debug.c */
public class C1479c extends C1459a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1458b f4556b;

    /* renamed from: c */
    private final ReactContext f4557c;

    /* renamed from: d */
    private final UIManagerModule f4558d;

    /* renamed from: e */
    private final C1476a f4559e;

    /* renamed from: f */
    private boolean f4560f = false;

    /* renamed from: g */
    private long f4561g = -1;

    /* renamed from: h */
    private long f4562h = -1;

    /* renamed from: i */
    private int f4563i = 0;

    /* renamed from: j */
    private int f4564j = 0;

    /* renamed from: k */
    private int f4565k = 0;

    /* renamed from: l */
    private int f4566l = 0;

    /* renamed from: m */
    private boolean f4567m = false;

    /* renamed from: n */
    private TreeMap<Long, C1480a> f4568n;

    /* renamed from: com.facebook.react.modules.debug.c$a */
    public static class C1480a {

        /* renamed from: a */
        public final int f4569a;

        /* renamed from: b */
        public final int f4570b;

        /* renamed from: c */
        public final int f4571c;

        /* renamed from: d */
        public final int f4572d;

        /* renamed from: e */
        public final double f4573e;

        /* renamed from: f */
        public final double f4574f;

        /* renamed from: g */
        public final int f4575g;

        public C1480a(int i, int i2, int i3, int i4, double d, double d2, int i5) {
            this.f4569a = i;
            this.f4570b = i2;
            this.f4571c = i3;
            this.f4572d = i4;
            this.f4573e = d;
            this.f4574f = d2;
            this.f4575g = i5;
        }
    }

    public C1479c(ReactContext reactContext) {
        this.f4557c = reactContext;
        this.f4558d = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f4559e = new C1476a();
    }

    /* renamed from: a */
    public void mo5332a(long j) {
        if (!this.f4560f) {
            if (this.f4561g == -1) {
                this.f4561g = j;
            }
            long j2 = this.f4562h;
            this.f4562h = j;
            if (this.f4559e.mo5359a(j2, j)) {
                this.f4566l++;
            }
            this.f4563i++;
            int b = mo5364b();
            if ((b - this.f4564j) - 1 >= 4) {
                this.f4565k++;
            }
            if (this.f4567m) {
                C1136a.m5053a(this.f4568n);
                C1480a aVar = new C1480a(mo5368e(), mo5369f(), b, this.f4565k, mo5366c(), mo5367d(), mo5370g());
                this.f4568n.put(Long.valueOf(System.currentTimeMillis()), aVar);
            }
            this.f4564j = b;
            C1458b bVar = this.f4556b;
            if (bVar != null) {
                bVar.mo5334a((C1459a) this);
            }
        }
    }

    /* renamed from: b */
    public int mo5364b() {
        double g = (double) mo5370g();
        Double.isNaN(g);
        return (int) ((g / 16.9d) + 1.0d);
    }

    /* renamed from: b */
    public C1480a mo5365b(long j) {
        C1136a.m5054a(this.f4568n, "FPS was not recorded at each frame!");
        Entry floorEntry = this.f4568n.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return (C1480a) floorEntry.getValue();
    }

    /* renamed from: c */
    public double mo5366c() {
        if (this.f4562h == this.f4561g) {
            return 0.0d;
        }
        double e = (double) mo5368e();
        Double.isNaN(e);
        double d = e * 1.0E9d;
        double d2 = (double) (this.f4562h - this.f4561g);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: d */
    public double mo5367d() {
        if (this.f4562h == this.f4561g) {
            return 0.0d;
        }
        double f = (double) mo5369f();
        Double.isNaN(f);
        double d = f * 1.0E9d;
        double d2 = (double) (this.f4562h - this.f4561g);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: e */
    public int mo5368e() {
        return this.f4563i - 1;
    }

    /* renamed from: f */
    public int mo5369f() {
        return this.f4566l - 1;
    }

    /* renamed from: g */
    public int mo5370g() {
        double d = (double) this.f4562h;
        double d2 = (double) this.f4561g;
        Double.isNaN(d);
        Double.isNaN(d2);
        return ((int) (d - d2)) / 1000000;
    }

    /* renamed from: h */
    public void mo5371h() {
        this.f4560f = false;
        this.f4557c.getCatalystInstance().addBridgeIdleDebugListener(this.f4559e);
        this.f4558d.setViewHierarchyUpdateDebugListener(this.f4559e);
        UiThreadUtil.runOnUiThread(new C1478b(this, this));
    }

    /* renamed from: i */
    public void mo5372i() {
        this.f4568n = new TreeMap<>();
        this.f4567m = true;
        mo5371h();
    }

    /* renamed from: j */
    public void mo5373j() {
        this.f4560f = true;
        this.f4557c.getCatalystInstance().removeBridgeIdleDebugListener(this.f4559e);
        this.f4558d.setViewHierarchyUpdateDebugListener(null);
    }
}
