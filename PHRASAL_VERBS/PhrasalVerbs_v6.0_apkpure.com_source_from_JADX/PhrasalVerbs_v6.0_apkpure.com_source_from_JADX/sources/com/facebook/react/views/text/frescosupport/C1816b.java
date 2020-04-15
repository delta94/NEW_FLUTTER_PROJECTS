package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.C1486a;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.views.text.C1838z;
import p032c.p033a.p059g.p065c.C0816e;
import p032c.p033a.p059g.p069f.C0862a;
import p032c.p033a.p059g.p069f.C0863b;
import p032c.p033a.p059g.p071h.C0870a;
import p032c.p033a.p059g.p072i.C0876b;
import p032c.p033a.p074i.p091o.C1117d;

/* renamed from: com.facebook.react.views.text.frescosupport.b */
public class C1816b extends C1838z {

    /* renamed from: a */
    private Drawable f5370a;

    /* renamed from: b */
    private final C0816e f5371b;

    /* renamed from: c */
    private final C0876b<C0862a> f5372c;

    /* renamed from: d */
    private final Object f5373d;

    /* renamed from: e */
    private int f5374e;

    /* renamed from: f */
    private int f5375f;

    /* renamed from: g */
    private Uri f5376g;

    /* renamed from: h */
    private int f5377h;

    /* renamed from: i */
    private ReadableMap f5378i;

    /* renamed from: j */
    private TextView f5379j;

    public C1816b(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, C0816e eVar, Object obj) {
        this.f5372c = new C0876b<>(C0863b.m3836a(resources).mo3861a());
        this.f5371b = eVar;
        this.f5373d = obj;
        this.f5375f = i3;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        this.f5376g = uri;
        this.f5378i = readableMap;
        this.f5377h = (int) C1726w.m6668b((float) i2);
        this.f5374e = (int) C1726w.m6668b((float) i);
    }

    /* renamed from: a */
    public Drawable mo6375a() {
        return this.f5370a;
    }

    /* renamed from: a */
    public void mo6376a(TextView textView) {
        this.f5379j = textView;
    }

    /* renamed from: b */
    public int mo6377b() {
        return this.f5374e;
    }

    /* renamed from: c */
    public void mo6378c() {
        this.f5372c.mo3910d();
    }

    /* renamed from: d */
    public void mo6379d() {
        this.f5372c.mo3911e();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f5370a == null) {
            C1486a a = C1486a.m5923a(C1117d.m4986a(this.f5376g), this.f5378i);
            C0816e eVar = this.f5371b;
            eVar.mo3715k();
            eVar.mo3699a(this.f5372c.mo3903a());
            eVar.mo3700a(this.f5373d);
            eVar.mo3703b(a);
            this.f5372c.mo3905a((C0870a) eVar.build());
            this.f5371b.mo3715k();
            this.f5370a = this.f5372c.mo3909c();
            this.f5370a.setBounds(0, 0, this.f5377h, this.f5374e);
            int i6 = this.f5375f;
            if (i6 != 0) {
                this.f5370a.setColorFilter(i6, Mode.SRC_IN);
            }
            this.f5370a.setCallback(this.f5379j);
        }
        canvas.save();
        canvas.translate(f, (float) (((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f5370a.getBounds().bottom - this.f5370a.getBounds().top) / 2)));
        this.f5370a.draw(canvas);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo6381e() {
        this.f5372c.mo3910d();
    }

    /* renamed from: f */
    public void mo6382f() {
        this.f5372c.mo3911e();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.f5374e;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.f5377h;
    }
}
