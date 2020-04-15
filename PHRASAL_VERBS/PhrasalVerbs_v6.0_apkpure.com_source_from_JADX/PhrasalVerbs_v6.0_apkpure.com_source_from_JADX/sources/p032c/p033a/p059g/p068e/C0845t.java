package p032c.p033a.p059g.p068e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: c.a.g.e.t */
public class C0845t {

    /* renamed from: c.a.g.e.t$a */
    public static abstract class C0846a implements C0847b {
        /* renamed from: a */
        public Matrix mo3833a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            int i3 = i;
            int i4 = i2;
            mo3834a(matrix, rect, i3, i4, f, f2, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }

        /* renamed from: a */
        public abstract void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    /* renamed from: c.a.g.e.t$b */
    public interface C0847b {

        /* renamed from: a */
        public static final C0847b f3021a = C0855j.f3037a;

        /* renamed from: b */
        public static final C0847b f3022b = C0854i.f3036a;

        /* renamed from: c */
        public static final C0847b f3023c = C0852g.f3034a;

        /* renamed from: d */
        public static final C0847b f3024d = C0853h.f3035a;

        /* renamed from: e */
        public static final C0847b f3025e = C0848c.f3030a;

        /* renamed from: f */
        public static final C0847b f3026f = C0850e.f3032a;

        /* renamed from: g */
        public static final C0847b f3027g = C0849d.f3031a;

        /* renamed from: h */
        public static final C0847b f3028h = C0856k.f3038a;

        /* renamed from: i */
        public static final C0847b f3029i = C0851f.f3033a;

        /* renamed from: a */
        Matrix mo3833a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: c.a.g.e.t$c */
    private static class C0848c extends C0846a {

        /* renamed from: a */
        public static final C0847b f3030a = new C0848c();

        private C0848c() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }

        public String toString() {
            return "center";
        }
    }

    /* renamed from: c.a.g.e.t$d */
    private static class C0849d extends C0846a {

        /* renamed from: a */
        public static final C0847b f3031a = new C0849d();

        private C0849d() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f6 = (float) rect.top;
                f5 = width;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                f6 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* renamed from: c.a.g.e.t$e */
    private static class C0850e extends C0846a {

        /* renamed from: a */
        public static final C0847b f3032a = new C0850e();

        private C0850e() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* renamed from: c.a.g.e.t$f */
    private static class C0851f extends C0846a {

        /* renamed from: a */
        public static final C0847b f3033a = new C0851f();

        private C0851f() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: c.a.g.e.t$g */
    private static class C0852g extends C0846a {

        /* renamed from: a */
        public static final C0847b f3034a = new C0852g();

        private C0852g() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* renamed from: c.a.g.e.t$h */
    private static class C0853h extends C0846a {

        /* renamed from: a */
        public static final C0847b f3035a = new C0853h();

        private C0853h() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + (((float) rect.width()) - (((float) i) * min));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* renamed from: c.a.g.e.t$i */
    private static class C0854i extends C0846a {

        /* renamed from: a */
        public static final C0847b f3036a = new C0854i();

        private C0854i() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* renamed from: c.a.g.e.t$j */
    private static class C0855j extends C0846a {

        /* renamed from: a */
        public static final C0847b f3037a = new C0855j();

        private C0855j() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: c.a.g.e.t$k */
    private static class C0856k extends C0846a {

        /* renamed from: a */
        public static final C0847b f3038a = new C0856k();

        private C0856k() {
        }

        /* renamed from: a */
        public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f7), 0.0f), ((float) rect.width()) - f7);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f8 = ((float) i2) * f3;
                float height = (((float) rect.height()) * 0.5f) - (f2 * f8);
                f6 = Math.max(Math.min(height, 0.0f), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: c.a.g.e.t$l */
    public interface C0857l {
        Object getState();
    }

    /* renamed from: a */
    public static C0844s m3795a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof C0844s) {
            return (C0844s) drawable;
        }
        if (drawable instanceof C0829e) {
            return m3795a(((C0829e) drawable).mo3733a());
        }
        if (drawable instanceof C0826b) {
            C0826b bVar = (C0826b) drawable;
            int a = bVar.mo3735a();
            for (int i = 0; i < a; i++) {
                C0844s a2 = m3795a(bVar.mo3736a(i));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
