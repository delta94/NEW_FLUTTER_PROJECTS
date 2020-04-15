package p000a.p005b.p007b.p008a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.util.C0320b;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p009c.p010a.p011a.C0041b;
import p000a.p005b.p009c.p010a.p011a.C0054i;
import p000a.p005b.p009c.p012b.C0062b;
import p000a.p005b.p009c.p012b.C0062b.C0064b;

/* renamed from: a.b.b.a.k */
public class C0030k extends C0028i {

    /* renamed from: b */
    static final Mode f52b = Mode.SRC_IN;

    /* renamed from: c */
    private C0037g f53c;

    /* renamed from: d */
    private PorterDuffColorFilter f54d;

    /* renamed from: e */
    private ColorFilter f55e;

    /* renamed from: f */
    private boolean f56f;

    /* renamed from: g */
    private boolean f57g;

    /* renamed from: h */
    private ConstantState f58h;

    /* renamed from: i */
    private final float[] f59i;

    /* renamed from: j */
    private final Matrix f60j;

    /* renamed from: k */
    private final Rect f61k;

    /* renamed from: a.b.b.a.k$a */
    private static class C0031a extends C0035e {
        public C0031a() {
        }

        public C0031a(C0031a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m70a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f89b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f88a = C0062b.m200a(string2);
            }
        }

        /* renamed from: a */
        public void mo115a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0054i.m168a(xmlPullParser, "pathData")) {
                TypedArray a = C0054i.m165a(resources, theme, attributeSet, C0017a.f25d);
                m70a(a);
                a.recycle();
            }
        }

        /* renamed from: b */
        public boolean mo116b() {
            return true;
        }
    }

    /* renamed from: a.b.b.a.k$b */
    private static class C0032b extends C0035e {

        /* renamed from: d */
        private int[] f62d;

        /* renamed from: e */
        C0041b f63e;

        /* renamed from: f */
        float f64f = 0.0f;

        /* renamed from: g */
        C0041b f65g;

        /* renamed from: h */
        float f66h = 1.0f;

        /* renamed from: i */
        int f67i = 0;

        /* renamed from: j */
        float f68j = 1.0f;

        /* renamed from: k */
        float f69k = 0.0f;

        /* renamed from: l */
        float f70l = 1.0f;

        /* renamed from: m */
        float f71m = 0.0f;

        /* renamed from: n */
        Cap f72n = Cap.BUTT;

        /* renamed from: o */
        Join f73o = Join.MITER;

        /* renamed from: p */
        float f74p = 4.0f;

        public C0032b() {
        }

        public C0032b(C0032b bVar) {
            super(bVar);
            this.f62d = bVar.f62d;
            this.f63e = bVar.f63e;
            this.f64f = bVar.f64f;
            this.f66h = bVar.f66h;
            this.f65g = bVar.f65g;
            this.f67i = bVar.f67i;
            this.f68j = bVar.f68j;
            this.f69k = bVar.f69k;
            this.f70l = bVar.f70l;
            this.f71m = bVar.f71m;
            this.f72n = bVar.f72n;
            this.f73o = bVar.f73o;
            this.f74p = bVar.f74p;
        }

        /* renamed from: a */
        private Cap m73a(int i, Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Cap.SQUARE : Cap.ROUND : Cap.BUTT;
        }

        /* renamed from: a */
        private Join m74a(int i, Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Join.BEVEL : Join.ROUND : Join.MITER;
        }

        /* renamed from: a */
        private void m75a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f62d = null;
            if (C0054i.m168a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f89b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f88a = C0062b.m200a(string2);
                }
                Theme theme2 = theme;
                this.f65g = C0054i.m164a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f68j = C0054i.m162a(typedArray, xmlPullParser, "fillAlpha", 12, this.f68j);
                this.f72n = m73a(C0054i.m169b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f72n);
                this.f73o = m74a(C0054i.m169b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f73o);
                this.f74p = C0054i.m162a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f74p);
                this.f63e = C0054i.m164a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f66h = C0054i.m162a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f66h);
                this.f64f = C0054i.m162a(typedArray, xmlPullParser, "strokeWidth", 4, this.f64f);
                this.f70l = C0054i.m162a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f70l);
                this.f71m = C0054i.m162a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f71m);
                this.f69k = C0054i.m162a(typedArray, xmlPullParser, "trimPathStart", 5, this.f69k);
                this.f67i = C0054i.m169b(typedArray, xmlPullParser, "fillType", 13, this.f67i);
            }
        }

        /* renamed from: a */
        public void mo117a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0054i.m165a(resources, theme, attributeSet, C0017a.f24c);
            m75a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo118a() {
            return this.f65g.mo187d() || this.f63e.mo187d();
        }

        /* renamed from: a */
        public boolean mo119a(int[] iArr) {
            return this.f63e.mo183a(iArr) | this.f65g.mo183a(iArr);
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.f68j;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.f65g.mo182a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.f66h;
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.f63e.mo182a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f64f;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.f70l;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.f71m;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.f69k;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f) {
            this.f68j = f;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i) {
            this.f65g.mo185b(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f) {
            this.f66h = f;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i) {
            this.f63e.mo185b(i);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f) {
            this.f64f = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f) {
            this.f70l = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f) {
            this.f71m = f;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f) {
            this.f69k = f;
        }
    }

    /* renamed from: a.b.b.a.k$c */
    private static class C0033c extends C0034d {

        /* renamed from: a */
        final Matrix f75a = new Matrix();

        /* renamed from: b */
        final ArrayList<C0034d> f76b = new ArrayList<>();

        /* renamed from: c */
        float f77c = 0.0f;

        /* renamed from: d */
        private float f78d = 0.0f;

        /* renamed from: e */
        private float f79e = 0.0f;

        /* renamed from: f */
        private float f80f = 1.0f;

        /* renamed from: g */
        private float f81g = 1.0f;

        /* renamed from: h */
        private float f82h = 0.0f;

        /* renamed from: i */
        private float f83i = 0.0f;

        /* renamed from: j */
        final Matrix f84j = new Matrix();

        /* renamed from: k */
        int f85k;

        /* renamed from: l */
        private int[] f86l;

        /* renamed from: m */
        private String f87m = null;

        public C0033c() {
            super();
        }

        public C0033c(C0033c cVar, C0320b<String, Object> bVar) {
            C0035e eVar;
            super();
            this.f77c = cVar.f77c;
            this.f78d = cVar.f78d;
            this.f79e = cVar.f79e;
            this.f80f = cVar.f80f;
            this.f81g = cVar.f81g;
            this.f82h = cVar.f82h;
            this.f83i = cVar.f83i;
            this.f86l = cVar.f86l;
            this.f87m = cVar.f87m;
            this.f85k = cVar.f85k;
            String str = this.f87m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f84j.set(cVar.f84j);
            ArrayList<C0034d> arrayList = cVar.f76b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0033c) {
                    this.f76b.add(new C0033c((C0033c) obj, bVar));
                } else {
                    if (obj instanceof C0032b) {
                        eVar = new C0032b((C0032b) obj);
                    } else if (obj instanceof C0031a) {
                        eVar = new C0031a((C0031a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f76b.add(eVar);
                    String str2 = eVar.f89b;
                    if (str2 != null) {
                        bVar.put(str2, eVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m79a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f86l = null;
            this.f77c = C0054i.m162a(typedArray, xmlPullParser, "rotation", 5, this.f77c);
            this.f78d = typedArray.getFloat(1, this.f78d);
            this.f79e = typedArray.getFloat(2, this.f79e);
            this.f80f = C0054i.m162a(typedArray, xmlPullParser, "scaleX", 3, this.f80f);
            this.f81g = C0054i.m162a(typedArray, xmlPullParser, "scaleY", 4, this.f81g);
            this.f82h = C0054i.m162a(typedArray, xmlPullParser, "translateX", 6, this.f82h);
            this.f83i = C0054i.m162a(typedArray, xmlPullParser, "translateY", 7, this.f83i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f87m = string;
            }
            m80b();
        }

        /* renamed from: b */
        private void m80b() {
            this.f84j.reset();
            this.f84j.postTranslate(-this.f78d, -this.f79e);
            this.f84j.postScale(this.f80f, this.f81g);
            this.f84j.postRotate(this.f77c, 0.0f, 0.0f);
            this.f84j.postTranslate(this.f82h + this.f78d, this.f83i + this.f79e);
        }

        /* renamed from: a */
        public void mo136a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0054i.m165a(resources, theme, attributeSet, C0017a.f23b);
            m79a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo118a() {
            for (int i = 0; i < this.f76b.size(); i++) {
                if (((C0034d) this.f76b.get(i)).mo118a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo119a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f76b.size(); i++) {
                z |= ((C0034d) this.f76b.get(i)).mo119a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.f87m;
        }

        public Matrix getLocalMatrix() {
            return this.f84j;
        }

        public float getPivotX() {
            return this.f78d;
        }

        public float getPivotY() {
            return this.f79e;
        }

        public float getRotation() {
            return this.f77c;
        }

        public float getScaleX() {
            return this.f80f;
        }

        public float getScaleY() {
            return this.f81g;
        }

        public float getTranslateX() {
            return this.f82h;
        }

        public float getTranslateY() {
            return this.f83i;
        }

        public void setPivotX(float f) {
            if (f != this.f78d) {
                this.f78d = f;
                m80b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f79e) {
                this.f79e = f;
                m80b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f77c) {
                this.f77c = f;
                m80b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f80f) {
                this.f80f = f;
                m80b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f81g) {
                this.f81g = f;
                m80b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f82h) {
                this.f82h = f;
                m80b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f83i) {
                this.f83i = f;
                m80b();
            }
        }
    }

    /* renamed from: a.b.b.a.k$d */
    private static abstract class C0034d {
        private C0034d() {
        }

        /* renamed from: a */
        public boolean mo118a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo119a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: a.b.b.a.k$e */
    private static abstract class C0035e extends C0034d {

        /* renamed from: a */
        protected C0064b[] f88a = null;

        /* renamed from: b */
        String f89b;

        /* renamed from: c */
        int f90c;

        public C0035e() {
            super();
        }

        public C0035e(C0035e eVar) {
            super();
            this.f89b = eVar.f89b;
            this.f90c = eVar.f90c;
            this.f88a = C0062b.m201a(eVar.f88a);
        }

        /* renamed from: a */
        public void mo153a(Path path) {
            path.reset();
            C0064b[] bVarArr = this.f88a;
            if (bVarArr != null) {
                C0064b.m208a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo116b() {
            return false;
        }

        public C0064b[] getPathData() {
            return this.f88a;
        }

        public String getPathName() {
            return this.f89b;
        }

        public void setPathData(C0064b[] bVarArr) {
            if (!C0062b.m198a(this.f88a, bVarArr)) {
                this.f88a = C0062b.m201a(bVarArr);
            } else {
                C0062b.m203b(this.f88a, bVarArr);
            }
        }
    }

    /* renamed from: a.b.b.a.k$f */
    private static class C0036f {

        /* renamed from: a */
        private static final Matrix f91a = new Matrix();

        /* renamed from: b */
        private final Path f92b;

        /* renamed from: c */
        private final Path f93c;

        /* renamed from: d */
        private final Matrix f94d;

        /* renamed from: e */
        Paint f95e;

        /* renamed from: f */
        Paint f96f;

        /* renamed from: g */
        private PathMeasure f97g;

        /* renamed from: h */
        private int f98h;

        /* renamed from: i */
        final C0033c f99i;

        /* renamed from: j */
        float f100j;

        /* renamed from: k */
        float f101k;

        /* renamed from: l */
        float f102l;

        /* renamed from: m */
        float f103m;

        /* renamed from: n */
        int f104n;

        /* renamed from: o */
        String f105o;

        /* renamed from: p */
        Boolean f106p;

        /* renamed from: q */
        final C0320b<String, Object> f107q;

        public C0036f() {
            this.f94d = new Matrix();
            this.f100j = 0.0f;
            this.f101k = 0.0f;
            this.f102l = 0.0f;
            this.f103m = 0.0f;
            this.f104n = 255;
            this.f105o = null;
            this.f106p = null;
            this.f107q = new C0320b<>();
            this.f99i = new C0033c();
            this.f92b = new Path();
            this.f93c = new Path();
        }

        public C0036f(C0036f fVar) {
            this.f94d = new Matrix();
            this.f100j = 0.0f;
            this.f101k = 0.0f;
            this.f102l = 0.0f;
            this.f103m = 0.0f;
            this.f104n = 255;
            this.f105o = null;
            this.f106p = null;
            this.f107q = new C0320b<>();
            this.f99i = new C0033c(fVar.f99i, this.f107q);
            this.f92b = new Path(fVar.f92b);
            this.f93c = new Path(fVar.f93c);
            this.f100j = fVar.f100j;
            this.f101k = fVar.f101k;
            this.f102l = fVar.f102l;
            this.f103m = fVar.f103m;
            this.f98h = fVar.f98h;
            this.f104n = fVar.f104n;
            this.f105o = fVar.f105o;
            String str = fVar.f105o;
            if (str != null) {
                this.f107q.put(str, this);
            }
            this.f106p = fVar.f106p;
        }

        /* renamed from: a */
        private static float m88a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m89a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m88a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m90a(C0033c cVar, C0035e eVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f102l;
            float f2 = ((float) i2) / this.f103m;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f75a;
            this.f94d.set(matrix);
            this.f94d.postScale(f, f2);
            float a = m89a(matrix);
            if (a != 0.0f) {
                eVar.mo153a(this.f92b);
                Path path = this.f92b;
                this.f93c.reset();
                if (eVar.mo116b()) {
                    this.f93c.addPath(path, this.f94d);
                    canvas.clipPath(this.f93c);
                } else {
                    C0032b bVar = (C0032b) eVar;
                    if (!(bVar.f69k == 0.0f && bVar.f70l == 1.0f)) {
                        float f3 = bVar.f69k;
                        float f4 = bVar.f71m;
                        float f5 = (f3 + f4) % 1.0f;
                        float f6 = (bVar.f70l + f4) % 1.0f;
                        if (this.f97g == null) {
                            this.f97g = new PathMeasure();
                        }
                        this.f97g.setPath(this.f92b, false);
                        float length = this.f97g.getLength();
                        float f7 = f5 * length;
                        float f8 = f6 * length;
                        path.reset();
                        if (f7 > f8) {
                            this.f97g.getSegment(f7, length, path, true);
                            this.f97g.getSegment(0.0f, f8, path, true);
                        } else {
                            this.f97g.getSegment(f7, f8, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.f93c.addPath(path, this.f94d);
                    if (bVar.f65g.mo188e()) {
                        C0041b bVar2 = bVar.f65g;
                        if (this.f96f == null) {
                            this.f96f = new Paint(1);
                            this.f96f.setStyle(Style.FILL);
                        }
                        Paint paint = this.f96f;
                        if (bVar2.mo186c()) {
                            Shader b = bVar2.mo184b();
                            b.setLocalMatrix(this.f94d);
                            paint.setShader(b);
                            paint.setAlpha(Math.round(bVar.f68j * 255.0f));
                        } else {
                            paint.setColor(C0030k.m61a(bVar2.mo182a(), bVar.f68j));
                        }
                        paint.setColorFilter(colorFilter);
                        this.f93c.setFillType(bVar.f67i == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f93c, paint);
                    }
                    if (bVar.f63e.mo188e()) {
                        C0041b bVar3 = bVar.f63e;
                        if (this.f95e == null) {
                            this.f95e = new Paint(1);
                            this.f95e.setStyle(Style.STROKE);
                        }
                        Paint paint2 = this.f95e;
                        Join join = bVar.f73o;
                        if (join != null) {
                            paint2.setStrokeJoin(join);
                        }
                        Cap cap = bVar.f72n;
                        if (cap != null) {
                            paint2.setStrokeCap(cap);
                        }
                        paint2.setStrokeMiter(bVar.f74p);
                        if (bVar3.mo186c()) {
                            Shader b2 = bVar3.mo184b();
                            b2.setLocalMatrix(this.f94d);
                            paint2.setShader(b2);
                            paint2.setAlpha(Math.round(bVar.f66h * 255.0f));
                        } else {
                            paint2.setColor(C0030k.m61a(bVar3.mo182a(), bVar.f66h));
                        }
                        paint2.setColorFilter(colorFilter);
                        paint2.setStrokeWidth(bVar.f64f * min * a);
                        canvas.drawPath(this.f93c, paint2);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m91a(C0033c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f75a.set(matrix);
            cVar.f75a.preConcat(cVar.f84j);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f76b.size(); i3++) {
                C0034d dVar = (C0034d) cVar.f76b.get(i3);
                if (dVar instanceof C0033c) {
                    m91a((C0033c) dVar, cVar.f75a, canvas, i, i2, colorFilter);
                } else if (dVar instanceof C0035e) {
                    m90a(cVar, (C0035e) dVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void mo157a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m91a(this.f99i, f91a, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean mo158a() {
            if (this.f106p == null) {
                this.f106p = Boolean.valueOf(this.f99i.mo118a());
            }
            return this.f106p.booleanValue();
        }

        /* renamed from: a */
        public boolean mo159a(int[] iArr) {
            return this.f99i.mo119a(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f104n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f104n = i;
        }
    }

    /* renamed from: a.b.b.a.k$g */
    private static class C0037g extends ConstantState {

        /* renamed from: a */
        int f108a;

        /* renamed from: b */
        C0036f f109b;

        /* renamed from: c */
        ColorStateList f110c;

        /* renamed from: d */
        Mode f111d;

        /* renamed from: e */
        boolean f112e;

        /* renamed from: f */
        Bitmap f113f;

        /* renamed from: g */
        ColorStateList f114g;

        /* renamed from: h */
        Mode f115h;

        /* renamed from: i */
        int f116i;

        /* renamed from: j */
        boolean f117j;

        /* renamed from: k */
        boolean f118k;

        /* renamed from: l */
        Paint f119l;

        public C0037g() {
            this.f110c = null;
            this.f111d = C0030k.f52b;
            this.f109b = new C0036f();
        }

        public C0037g(C0037g gVar) {
            this.f110c = null;
            this.f111d = C0030k.f52b;
            if (gVar != null) {
                this.f108a = gVar.f108a;
                this.f109b = new C0036f(gVar.f109b);
                Paint paint = gVar.f109b.f96f;
                if (paint != null) {
                    this.f109b.f96f = new Paint(paint);
                }
                Paint paint2 = gVar.f109b.f95e;
                if (paint2 != null) {
                    this.f109b.f95e = new Paint(paint2);
                }
                this.f110c = gVar.f110c;
                this.f111d = gVar.f111d;
                this.f112e = gVar.f112e;
            }
        }

        /* renamed from: a */
        public Paint mo164a(ColorFilter colorFilter) {
            if (!mo170b() && colorFilter == null) {
                return null;
            }
            if (this.f119l == null) {
                this.f119l = new Paint();
                this.f119l.setFilterBitmap(true);
            }
            this.f119l.setAlpha(this.f109b.getRootAlpha());
            this.f119l.setColorFilter(colorFilter);
            return this.f119l;
        }

        /* renamed from: a */
        public void mo165a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f113f, null, rect, mo164a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo166a() {
            return !this.f118k && this.f114g == this.f110c && this.f115h == this.f111d && this.f117j == this.f112e && this.f116i == this.f109b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean mo167a(int i, int i2) {
            return i == this.f113f.getWidth() && i2 == this.f113f.getHeight();
        }

        /* renamed from: a */
        public boolean mo168a(int[] iArr) {
            boolean a = this.f109b.mo159a(iArr);
            this.f118k |= a;
            return a;
        }

        /* renamed from: b */
        public void mo169b(int i, int i2) {
            if (this.f113f == null || !mo167a(i, i2)) {
                this.f113f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f118k = true;
            }
        }

        /* renamed from: b */
        public boolean mo170b() {
            return this.f109b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo171c(int i, int i2) {
            this.f113f.eraseColor(0);
            this.f109b.mo157a(new Canvas(this.f113f), i, i2, (ColorFilter) null);
        }

        /* renamed from: c */
        public boolean mo172c() {
            return this.f109b.mo158a();
        }

        /* renamed from: d */
        public void mo173d() {
            this.f114g = this.f110c;
            this.f115h = this.f111d;
            this.f116i = this.f109b.getRootAlpha();
            this.f117j = this.f112e;
            this.f118k = false;
        }

        public int getChangingConfigurations() {
            return this.f108a;
        }

        public Drawable newDrawable() {
            return new C0030k(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0030k(this);
        }
    }

    /* renamed from: a.b.b.a.k$h */
    private static class C0038h extends ConstantState {

        /* renamed from: a */
        private final ConstantState f120a;

        public C0038h(ConstantState constantState) {
            this.f120a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f120a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f120a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0030k kVar = new C0030k();
            kVar.f51a = (VectorDrawable) this.f120a.newDrawable();
            return kVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0030k kVar = new C0030k();
            kVar.f51a = (VectorDrawable) this.f120a.newDrawable(resources);
            return kVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C0030k kVar = new C0030k();
            kVar.f51a = (VectorDrawable) this.f120a.newDrawable(resources, theme);
            return kVar;
        }
    }

    C0030k() {
        this.f57g = true;
        this.f59i = new float[9];
        this.f60j = new Matrix();
        this.f61k = new Rect();
        this.f53c = new C0037g();
    }

    C0030k(C0037g gVar) {
        this.f57g = true;
        this.f59i = new float[9];
        this.f60j = new Matrix();
        this.f61k = new Rect();
        this.f53c = gVar;
        this.f54d = mo90a(this.f54d, gVar.f110c, gVar.f111d);
    }

    /* renamed from: a */
    static int m61a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000a.p005b.p007b.p008a.C0030k m62a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            a.b.b.a.k r0 = new a.b.b.a.k
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p000a.p005b.p009c.p010a.p011a.C0052h.m157a(r6, r7, r8)
            r0.f51a = r6
            a.b.b.a.k$h r6 = new a.b.b.a.k$h
            android.graphics.drawable.Drawable r7 = r0.f51a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f58h = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            a.b.b.a.k r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p007b.p008a.C0030k.m62a(android.content.res.Resources, int, android.content.res.Resources$Theme):a.b.b.a.k");
    }

    /* renamed from: a */
    private static Mode m63a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m64a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int i;
        int i2;
        C0031a aVar;
        C0037g gVar = this.f53c;
        C0036f fVar = gVar.f109b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f99i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0033c cVar = (C0033c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0032b bVar = new C0032b();
                    bVar.mo117a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f76b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f107q.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    aVar = bVar;
                } else if ("clip-path".equals(name)) {
                    aVar = new C0031a();
                    aVar.mo115a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f76b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f107q.put(aVar.getPathName(), aVar);
                    }
                } else if (str.equals(name)) {
                    C0033c cVar2 = new C0033c();
                    cVar2.mo136a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f76b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f107q.put(cVar2.getGroupName(), cVar2);
                    }
                    i = gVar.f108a;
                    i2 = cVar2.f85k;
                    gVar.f108a = i2 | i;
                }
                i = gVar.f108a;
                i2 = aVar.f90c;
                gVar.f108a = i2 | i;
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    private void m65a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0037g gVar = this.f53c;
        C0036f fVar = gVar.f109b;
        gVar.f111d = m63a(C0054i.m169b(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.f110c = colorStateList;
        }
        gVar.f112e = C0054i.m167a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f112e);
        fVar.f102l = C0054i.m162a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f102l);
        fVar.f103m = C0054i.m162a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f103m);
        if (fVar.f102l <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (fVar.f103m > 0.0f) {
            fVar.f100j = typedArray.getDimension(3, fVar.f100j);
            fVar.f101k = typedArray.getDimension(2, fVar.f101k);
            if (fVar.f100j <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (fVar.f101k > 0.0f) {
                fVar.setAlpha(C0054i.m162a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.f105o = string;
                    fVar.f107q.put(string, fVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    /* renamed from: a */
    private boolean m66a() {
        return VERSION.SDK_INT >= 17 && isAutoMirrored() && C0311a.m1346d(this) == 1;
    }

    public static C0030k createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0030k kVar = new C0030k();
        kVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PorterDuffColorFilter mo90a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo91a(String str) {
        return this.f53c.f109b.f107q.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo92a(boolean z) {
        this.f57g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1341a(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f61k);
        if (this.f61k.width() > 0 && this.f61k.height() > 0) {
            ColorFilter colorFilter = this.f55e;
            if (colorFilter == null) {
                colorFilter = this.f54d;
            }
            canvas.getMatrix(this.f60j);
            this.f60j.getValues(this.f59i);
            float abs = Math.abs(this.f59i[0]);
            float abs2 = Math.abs(this.f59i[4]);
            float abs3 = Math.abs(this.f59i[1]);
            float abs4 = Math.abs(this.f59i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.f61k.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.f61k.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f61k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m66a()) {
                    canvas.translate((float) this.f61k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f61k.offsetTo(0, 0);
                this.f53c.mo169b(min, min2);
                if (!this.f57g) {
                    this.f53c.mo171c(min, min2);
                } else if (!this.f53c.mo166a()) {
                    this.f53c.mo171c(min, min2);
                    this.f53c.mo173d();
                }
                this.f53c.mo165a(canvas, colorFilter, this.f61k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0311a.m1343b(drawable) : this.f53c.f109b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f53c.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f51a;
        if (drawable != null && VERSION.SDK_INT >= 24) {
            return new C0038h(drawable.getConstantState());
        }
        this.f53c.f108a = getChangingConfigurations();
        return this.f53c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f53c.f109b.f101k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f53c.f109b.f100j;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1338a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0037g gVar = this.f53c;
        gVar.f109b = new C0036f();
        TypedArray a = C0054i.m165a(resources, theme, attributeSet, C0017a.f22a);
        m65a(a, xmlPullParser);
        a.recycle();
        gVar.f108a = getChangingConfigurations();
        gVar.f118k = true;
        m64a(resources, xmlPullParser, attributeSet, theme);
        this.f54d = mo90a(this.f54d, gVar.f110c, gVar.f111d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0311a.m1347e(drawable) : this.f53c.f112e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f51a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            a.b.b.a.k$g r0 = r1.f53c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo172c()
            if (r0 != 0) goto L_0x0028
            a.b.b.a.k$g r0 = r1.f53c
            android.content.res.ColorStateList r0 = r0.f110c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p007b.p008a.C0030k.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f56f && super.mutate() == this) {
            this.f53c = new C0037g(this.f53c);
            this.f56f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0037g gVar = this.f53c;
        ColorStateList colorStateList = gVar.f110c;
        if (colorStateList != null) {
            Mode mode = gVar.f111d;
            if (mode != null) {
                this.f54d = mo90a(this.f54d, colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (gVar.mo172c() && gVar.mo168a(iArr)) {
            invalidateSelf();
            z = true;
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.f53c.f109b.getRootAlpha() != i) {
            this.f53c.f109b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1340a(drawable, z);
        } else {
            this.f53c.f112e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f55e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1344b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1336a(drawable, colorStateList);
            return;
        }
        C0037g gVar = this.f53c;
        if (gVar.f110c != colorStateList) {
            gVar.f110c = colorStateList;
            this.f54d = mo90a(this.f54d, colorStateList, gVar.f111d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1339a(drawable, mode);
            return;
        }
        C0037g gVar = this.f53c;
        if (gVar.f111d != mode) {
            gVar.f111d = mode;
            this.f54d = mo90a(this.f54d, gVar.f110c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
