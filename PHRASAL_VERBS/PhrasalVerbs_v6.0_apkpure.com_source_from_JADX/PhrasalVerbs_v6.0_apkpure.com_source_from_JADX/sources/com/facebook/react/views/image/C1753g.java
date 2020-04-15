package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1681i;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.yoga.C1943a;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p059g.p065c.C0816e;
import p032c.p033a.p059g.p065c.C0819g;
import p032c.p033a.p059g.p068e.C0827c;
import p032c.p033a.p059g.p068e.C0838n;
import p032c.p033a.p059g.p068e.C0845t.C0847b;
import p032c.p033a.p059g.p069f.C0862a;
import p032c.p033a.p059g.p069f.C0863b;
import p032c.p033a.p059g.p069f.C0865d;
import p032c.p033a.p059g.p072i.C0878d;
import p032c.p033a.p074i.p079c.C0900f;
import p032c.p033a.p074i.p089m.C1000a;
import p032c.p033a.p074i.p091o.C1112a;
import p032c.p033a.p098m.p112j.p114b.C1219a;
import p032c.p033a.p098m.p112j.p114b.C1221c;
import p032c.p033a.p098m.p112j.p114b.C1221c.C1222a;
import p032c.p033a.p098m.p112j.p114b.C1223d;

/* renamed from: com.facebook.react.views.image.g */
public class C1753g extends C0878d {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static float[] f5151g = new float[4];
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Matrix f5152h = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Matrix f5153i = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Matrix f5154j = new Matrix();

    /* renamed from: A */
    private final C0816e f5155A;

    /* renamed from: B */
    private final C1754a f5156B;

    /* renamed from: C */
    private final C1755b f5157C;

    /* renamed from: D */
    private C1000a f5158D;

    /* renamed from: E */
    private C0819g f5159E;

    /* renamed from: F */
    private C0819g f5160F;

    /* renamed from: G */
    private C1747a f5161G;

    /* renamed from: H */
    private final Object f5162H;

    /* renamed from: I */
    private int f5163I = -1;

    /* renamed from: J */
    private boolean f5164J;

    /* renamed from: K */
    private ReadableMap f5165K;

    /* renamed from: k */
    private C1749c f5166k = C1749c.AUTO;

    /* renamed from: l */
    private final List<C1219a> f5167l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1219a f5168m;

    /* renamed from: n */
    private C1219a f5169n;

    /* renamed from: o */
    private Drawable f5170o;

    /* renamed from: p */
    private Drawable f5171p;

    /* renamed from: q */
    private C0838n f5172q;

    /* renamed from: r */
    private int f5173r = 0;

    /* renamed from: s */
    private int f5174s;

    /* renamed from: t */
    private int f5175t;

    /* renamed from: u */
    private float f5176u;

    /* renamed from: v */
    private float f5177v = Float.NaN;

    /* renamed from: w */
    private float[] f5178w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C0847b f5179x = C1750d.m6736b();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public TileMode f5180y = C1750d.m6733a();

    /* renamed from: z */
    private boolean f5181z;

    /* renamed from: com.facebook.react.views.image.g$a */
    private class C1754a extends C1112a {
        private C1754a() {
        }

        /* synthetic */ C1754a(C1753g gVar, C1752f fVar) {
            this();
        }

        /* renamed from: a */
        public void mo4354a(Bitmap bitmap, Bitmap bitmap2) {
            C1753g.this.m6747a(C1753g.f5151g);
            bitmap.setHasAlpha(true);
            if (!C1681i.m6531a(C1753g.f5151g[0], 0.0f) || !C1681i.m6531a(C1753g.f5151g[1], 0.0f) || !C1681i.m6531a(C1753g.f5151g[2], 0.0f) || !C1681i.m6531a(C1753g.f5151g[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                mo6109a(bitmap2, C1753g.f5151g, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.mo4354a(bitmap, bitmap2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6109a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            C1753g.this.f5179x.mo3833a(C1753g.f5152h, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            C1753g.f5152h.invert(C1753g.f5153i);
            fArr2[0] = C1753g.f5153i.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = C1753g.f5153i.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = C1753g.f5153i.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = C1753g.f5153i.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    /* renamed from: com.facebook.react.views.image.g$b */
    private class C1755b extends C1112a {
        private C1755b() {
        }

        /* synthetic */ C1755b(C1753g gVar, C1752f fVar) {
            this();
        }

        /* renamed from: a */
        public C0744b<Bitmap> mo4353a(Bitmap bitmap, C0900f fVar) {
            Rect rect = new Rect(0, 0, C1753g.this.getWidth(), C1753g.this.getHeight());
            C1753g.this.f5179x.mo3833a(C1753g.f5154j, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, C1753g.this.f5180y, C1753g.this.f5180y);
            bitmapShader.setLocalMatrix(C1753g.f5154j);
            paint.setShader(bitmapShader);
            C0744b a = fVar.mo3971a(C1753g.this.getWidth(), C1753g.this.getHeight());
            try {
                new Canvas((Bitmap) a.mo3520n()).drawRect(rect, paint);
                return a.clone();
            } finally {
                C0744b.m3336b(a);
            }
        }
    }

    public C1753g(Context context, C0816e eVar, C1747a aVar, Object obj) {
        super(context, m6750b(context));
        this.f5155A = eVar;
        this.f5156B = new C1754a(this, null);
        this.f5157C = new C1755b(this, null);
        this.f5161G = aVar;
        this.f5162H = obj;
        this.f5167l = new LinkedList();
    }

    /* renamed from: a */
    private void m6746a(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6747a(float[] fArr) {
        float f = !C1943a.m7432a(this.f5177v) ? this.f5177v : 0.0f;
        float[] fArr2 = this.f5178w;
        fArr[0] = (fArr2 == null || C1943a.m7432a(fArr2[0])) ? f : this.f5178w[0];
        float[] fArr3 = this.f5178w;
        fArr[1] = (fArr3 == null || C1943a.m7432a(fArr3[1])) ? f : this.f5178w[1];
        float[] fArr4 = this.f5178w;
        fArr[2] = (fArr4 == null || C1943a.m7432a(fArr4[2])) ? f : this.f5178w[2];
        float[] fArr5 = this.f5178w;
        if (fArr5 != null && !C1943a.m7432a(fArr5[3])) {
            f = this.f5178w[3];
        }
        fArr[3] = f;
    }

    /* renamed from: a */
    private boolean m6748a(C1219a aVar) {
        C1749c cVar = this.f5166k;
        boolean z = true;
        if (cVar != C1749c.AUTO) {
            return cVar == C1749c.RESIZE;
        }
        if (!C0758f.m3378f(aVar.mo4559c()) && !C0758f.m3379g(aVar.mo4559c())) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private static C0862a m6750b(Context context) {
        C0863b bVar = new C0863b(context.getResources());
        bVar.mo3864a(C0865d.m3862a(0.0f));
        return bVar.mo3861a();
    }

    /* renamed from: j */
    private boolean m6756j() {
        return this.f5167l.size() > 1;
    }

    /* renamed from: k */
    private boolean m6757k() {
        return this.f5180y != TileMode.CLAMP;
    }

    /* renamed from: l */
    private void m6758l() {
        this.f5168m = null;
        if (this.f5167l.isEmpty()) {
            this.f5167l.add(new C1219a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else if (m6756j()) {
            C1222a a = C1221c.m5226a(getWidth(), getHeight(), this.f5167l);
            this.f5168m = a.mo4561a();
            this.f5169n = a.mo4562b();
            return;
        }
        this.f5168m = (C1219a) this.f5167l.get(0);
    }

    /* renamed from: a */
    public void mo6088a(float f, int i) {
        if (this.f5178w == null) {
            this.f5178w = new float[4];
            Arrays.fill(this.f5178w, Float.NaN);
        }
        if (!C1681i.m6531a(this.f5178w[i], f)) {
            this.f5178w[i] = f;
            this.f5181z = true;
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0192, code lost:
        if (r0 != 0) goto L_0x018a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6090i() {
        /*
            r11 = this;
            boolean r0 = r11.f5181z
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r11.m6756j()
            if (r0 == 0) goto L_0x0018
            int r0 = r11.getWidth()
            if (r0 <= 0) goto L_0x0017
            int r0 = r11.getHeight()
            if (r0 > 0) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            r11.m6758l()
            c.a.m.j.b.a r0 = r11.f5168m
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            boolean r0 = r11.m6748a(r0)
            if (r0 == 0) goto L_0x0033
            int r1 = r11.getWidth()
            if (r1 <= 0) goto L_0x0032
            int r1 = r11.getHeight()
            if (r1 > 0) goto L_0x0033
        L_0x0032:
            return
        L_0x0033:
            boolean r1 = r11.m6757k()
            if (r1 == 0) goto L_0x0046
            int r1 = r11.getWidth()
            if (r1 <= 0) goto L_0x0045
            int r1 = r11.getHeight()
            if (r1 > 0) goto L_0x0046
        L_0x0045:
            return
        L_0x0046:
            c.a.g.h.b r1 = r11.getHierarchy()
            c.a.g.f.a r1 = (p032c.p033a.p059g.p069f.C0862a) r1
            c.a.g.e.t$b r2 = r11.f5179x
            r1.mo3854a(r2)
            android.graphics.drawable.Drawable r2 = r11.f5170o
            if (r2 == 0) goto L_0x005a
            c.a.g.e.t$b r3 = r11.f5179x
            r1.mo3853a(r2, r3)
        L_0x005a:
            android.graphics.drawable.Drawable r2 = r11.f5171p
            if (r2 == 0) goto L_0x0063
            c.a.g.e.t$b r3 = p032c.p033a.p059g.p068e.C0845t.C0847b.f3025e
            r1.mo3853a(r2, r3)
        L_0x0063:
            c.a.g.e.t$b r2 = r11.f5179x
            c.a.g.e.t$b r3 = p032c.p033a.p059g.p068e.C0845t.C0847b.f3027g
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x0071
            c.a.g.e.t$b r3 = p032c.p033a.p059g.p068e.C0845t.C0847b.f3028h
            if (r2 == r3) goto L_0x0071
            r2 = 1
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            c.a.g.f.d r3 = r1.mo3857b()
            float[] r6 = f5151g
            r11.m6747a(r6)
            float[] r6 = f5151g
            r7 = r6[r4]
            r8 = r6[r5]
            r9 = 2
            r9 = r6[r9]
            r10 = 3
            r6 = r6[r10]
            r3.mo3884a(r7, r8, r9, r6)
            c.a.g.e.n r6 = r11.f5172q
            if (r6 == 0) goto L_0x00a3
            int r7 = r11.f5174s
            float r8 = r11.f5176u
            r6.mo3802a(r7, r8)
            c.a.g.e.n r6 = r11.f5172q
            float[] r7 = r3.mo3890c()
            r6.mo3804a(r7)
            c.a.g.e.n r6 = r11.f5172q
            r1.mo3858b(r6)
        L_0x00a3:
            if (r2 == 0) goto L_0x00a9
            r6 = 0
            r3.mo3889b(r6)
        L_0x00a9:
            int r6 = r11.f5174s
            float r7 = r11.f5176u
            r3.mo3886a(r6, r7)
            int r6 = r11.f5175t
            if (r6 == 0) goto L_0x00b8
            r3.mo3885a(r6)
            goto L_0x00bd
        L_0x00b8:
            c.a.g.f.d$a r6 = p032c.p033a.p059g.p069f.C0865d.C0866a.BITMAP_ONLY
            r3.mo3887a(r6)
        L_0x00bd:
            r1.mo3855a(r3)
            int r3 = r11.f5163I
            if (r3 < 0) goto L_0x00c5
            goto L_0x00d1
        L_0x00c5:
            c.a.m.j.b.a r3 = r11.f5168m
            boolean r3 = r3.mo4560d()
            if (r3 == 0) goto L_0x00cf
            r3 = 0
            goto L_0x00d1
        L_0x00cf:
            r3 = 300(0x12c, float:4.2E-43)
        L_0x00d1:
            r1.mo3850a(r3)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            if (r2 == 0) goto L_0x00e0
            com.facebook.react.views.image.g$a r2 = r11.f5156B
            r1.add(r2)
        L_0x00e0:
            c.a.i.m.a r2 = r11.f5158D
            if (r2 == 0) goto L_0x00e7
            r1.add(r2)
        L_0x00e7:
            boolean r2 = r11.m6757k()
            if (r2 == 0) goto L_0x00f2
            com.facebook.react.views.image.g$b r2 = r11.f5157C
            r1.add(r2)
        L_0x00f2:
            c.a.i.o.e r1 = com.facebook.react.views.image.C1751e.m6737a(r1)
            if (r0 == 0) goto L_0x0106
            c.a.i.e.e r0 = new c.a.i.e.e
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r0.<init>(r2, r3)
            goto L_0x0107
        L_0x0106:
            r0 = 0
        L_0x0107:
            c.a.m.j.b.a r2 = r11.f5168m
            android.net.Uri r2 = r2.mo4559c()
            c.a.i.o.d r2 = p032c.p033a.p074i.p091o.C1117d.m4986a(r2)
            r2.mo4387a(r1)
            r2.mo4382a(r0)
            r2.mo4388a(r5)
            boolean r3 = r11.f5164J
            r2.mo4393c(r3)
            com.facebook.react.bridge.ReadableMap r3 = r11.f5165K
            com.facebook.react.modules.fresco.a r2 = com.facebook.react.modules.fresco.C1486a.m5923a(r2, r3)
            com.facebook.react.views.image.a r3 = r11.f5161G
            if (r3 == 0) goto L_0x0132
            c.a.m.j.b.a r6 = r11.f5168m
            android.net.Uri r6 = r6.mo4559c()
            r3.mo6086a(r6)
        L_0x0132:
            c.a.g.c.e r3 = r11.f5155A
            r3.mo3715k()
            c.a.g.c.e r3 = r11.f5155A
            r3.mo3701a(r5)
            java.lang.Object r6 = r11.f5162H
            r3.mo3700a(r6)
            c.a.g.h.a r6 = r11.getController()
            r3.mo3699a(r6)
            r3.mo3703b(r2)
            c.a.m.j.b.a r2 = r11.f5169n
            if (r2 == 0) goto L_0x016e
            android.net.Uri r2 = r2.mo4559c()
            c.a.i.o.d r2 = p032c.p033a.p074i.p091o.C1117d.m4986a(r2)
            r2.mo4387a(r1)
            r2.mo4382a(r0)
            r2.mo4388a(r5)
            boolean r0 = r11.f5164J
            r2.mo4393c(r0)
            c.a.i.o.c r0 = r2.mo4378a()
            c.a.g.c.e r1 = r11.f5155A
            r1.mo3706c(r0)
        L_0x016e:
            c.a.g.c.g r0 = r11.f5159E
            if (r0 == 0) goto L_0x0186
            c.a.g.c.g r0 = r11.f5160F
            if (r0 == 0) goto L_0x0186
            c.a.g.c.i r0 = new c.a.g.c.i
            r0.<init>()
            c.a.g.c.g r1 = r11.f5159E
            r0.mo3719a(r1)
            c.a.g.c.g r1 = r11.f5160F
            r0.mo3719a(r1)
            goto L_0x018a
        L_0x0186:
            c.a.g.c.g r0 = r11.f5160F
            if (r0 == 0) goto L_0x0190
        L_0x018a:
            c.a.g.c.e r1 = r11.f5155A
            r1.mo3698a(r0)
            goto L_0x0195
        L_0x0190:
            c.a.g.c.g r0 = r11.f5159E
            if (r0 == 0) goto L_0x0195
            goto L_0x018a
        L_0x0195:
            c.a.g.c.e r0 = r11.f5155A
            c.a.g.c.b r0 = r0.build()
            r11.setController(r0)
            r11.f5181z = r4
            c.a.g.c.e r0 = r11.f5155A
            r0.mo3715k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.C1753g.mo6090i():void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.f5181z = this.f5181z || m6756j() || m6757k();
            mo6090i();
        }
    }

    public void setBackgroundColor(int i) {
        if (this.f5173r != i) {
            this.f5173r = i;
            this.f5172q = new C0838n(i);
            this.f5181z = true;
        }
    }

    public void setBlurRadius(float f) {
        int b = (int) C1726w.m6668b(f);
        if (b == 0) {
            this.f5158D = null;
        } else {
            this.f5158D = new C1000a(b);
        }
        this.f5181z = true;
    }

    public void setBorderColor(int i) {
        this.f5174s = i;
        this.f5181z = true;
    }

    public void setBorderRadius(float f) {
        if (!C1681i.m6531a(this.f5177v, f)) {
            this.f5177v = f;
            this.f5181z = true;
        }
    }

    public void setBorderWidth(float f) {
        this.f5176u = C1726w.m6668b(f);
        this.f5181z = true;
    }

    public void setControllerListener(C0819g gVar) {
        this.f5160F = gVar;
        this.f5181z = true;
        mo6090i();
    }

    public void setDefaultSource(String str) {
        this.f5170o = C1223d.m5230a().mo4563a(getContext(), str);
        this.f5181z = true;
    }

    public void setFadeDuration(int i) {
        this.f5163I = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.f5165K = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable a = C1223d.m5230a().mo4563a(getContext(), str);
        this.f5171p = a != null ? new C0827c(a, 1000) : null;
        this.f5181z = true;
    }

    public void setOverlayColor(int i) {
        this.f5175t = i;
        this.f5181z = true;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.f5164J = z;
    }

    public void setResizeMethod(C1749c cVar) {
        this.f5166k = cVar;
        this.f5181z = true;
    }

    public void setScaleType(C0847b bVar) {
        this.f5179x = bVar;
        this.f5181z = true;
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.f5159E = null;
        } else {
            this.f5159E = new C1752f(this, ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
        this.f5181z = true;
    }

    public void setSource(ReadableArray readableArray) {
        this.f5167l.clear();
        if (readableArray == null || readableArray.size() == 0) {
            this.f5167l.add(new C1219a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else {
            String str = "uri";
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString(str);
                C1219a aVar = new C1219a(getContext(), string);
                this.f5167l.add(aVar);
                if (Uri.EMPTY.equals(aVar.mo4559c())) {
                    m6746a(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString(str);
                    C1219a aVar2 = new C1219a(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    this.f5167l.add(aVar2);
                    if (Uri.EMPTY.equals(aVar2.mo4559c())) {
                        m6746a(string2);
                    }
                }
            }
        }
        this.f5181z = true;
    }

    public void setTileMode(TileMode tileMode) {
        this.f5180y = tileMode;
        this.f5181z = true;
    }
}
