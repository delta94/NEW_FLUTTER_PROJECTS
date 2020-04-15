package p032c.p033a.p059g.p066d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p032c.p033a.p059g.p066d.p067a.C0824b;
import p032c.p033a.p059g.p068e.C0845t.C0847b;

/* renamed from: c.a.g.d.a */
public class C0822a extends Drawable implements C0824b {

    /* renamed from: a */
    private String f2884a;

    /* renamed from: b */
    private String f2885b;

    /* renamed from: c */
    private int f2886c;

    /* renamed from: d */
    private int f2887d;

    /* renamed from: e */
    private int f2888e;

    /* renamed from: f */
    private String f2889f;

    /* renamed from: g */
    private C0847b f2890g;

    /* renamed from: h */
    private int f2891h;

    /* renamed from: i */
    private int f2892i;

    /* renamed from: j */
    private int f2893j = 80;

    /* renamed from: k */
    private final Paint f2894k = new Paint(1);

    /* renamed from: l */
    private final Matrix f2895l = new Matrix();

    /* renamed from: m */
    private final Rect f2896m = new Rect();

    /* renamed from: n */
    private final RectF f2897n = new RectF();

    /* renamed from: o */
    private int f2898o;

    /* renamed from: p */
    private int f2899p;

    /* renamed from: q */
    private int f2900q;

    /* renamed from: r */
    private int f2901r;

    /* renamed from: s */
    private int f2902s;

    /* renamed from: t */
    private long f2903t;

    public C0822a() {
        mo3722a();
    }

    /* renamed from: a */
    private void m3693a(Canvas canvas, String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(str, objArr);
        }
        canvas.drawText(str, (float) this.f2901r, (float) this.f2902s, this.f2894k);
        this.f2902s += this.f2900q;
    }

    /* renamed from: a */
    private void m3694a(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(12, Math.min(rect.width() / i2, rect.height() / i)));
        this.f2894k.setTextSize((float) min);
        this.f2900q = min + 8;
        if (this.f2893j == 80) {
            this.f2900q *= -1;
        }
        this.f2898o = rect.left + 10;
        this.f2899p = this.f2893j == 80 ? rect.bottom - 10 : rect.top + 10 + 12;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3721a(int i, int i2, C0847b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (bVar != null) {
                Rect rect = this.f2896m;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f2895l.reset();
                bVar.mo3833a(this.f2895l, this.f2896m, i, i2, 0.0f, 0.0f);
                RectF rectF = this.f2897n;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                this.f2895l.mapRect(rectF);
                int height2 = (int) this.f2897n.height();
                width = Math.min(width, (int) this.f2897n.width());
                height = Math.min(height, height2);
            }
            float f = (float) width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = (float) abs;
            if (f7 < f2 && ((float) abs2) < f5) {
                return 1716301648;
            }
            if (f7 < f3 && ((float) abs2) < f6) {
                return 1728026624;
            }
        }
        return 1727284022;
    }

    /* renamed from: a */
    public void mo3722a() {
        this.f2886c = -1;
        this.f2887d = -1;
        this.f2888e = -1;
        this.f2891h = -1;
        this.f2892i = -1;
        this.f2889f = null;
        mo3727a((String) null);
        this.f2903t = -1;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3723a(int i) {
        this.f2888e = i;
    }

    /* renamed from: a */
    public void mo3724a(int i, int i2) {
        this.f2886c = i;
        this.f2887d = i2;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3725a(long j) {
        this.f2903t = j;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo3726a(C0847b bVar) {
        this.f2890g = bVar;
    }

    /* renamed from: a */
    public void mo3727a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f2884a = str;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f2894k.setStyle(Style.STROKE);
        this.f2894k.setStrokeWidth(2.0f);
        this.f2894k.setColor(-26624);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f2894k);
        this.f2894k.setStyle(Style.FILL);
        this.f2894k.setColor(mo3721a(this.f2886c, this.f2887d, this.f2890g));
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f2894k);
        this.f2894k.setStyle(Style.FILL);
        this.f2894k.setStrokeWidth(0.0f);
        this.f2894k.setColor(-1);
        this.f2901r = this.f2898o;
        this.f2902s = this.f2899p;
        String str = this.f2885b;
        if (str != null) {
            m3693a(canvas, "IDs: %s, %s", this.f2884a, str);
        } else {
            m3693a(canvas, "ID: %s", this.f2884a);
        }
        m3693a(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        m3693a(canvas, "I: %dx%d", Integer.valueOf(this.f2886c), Integer.valueOf(this.f2887d));
        m3693a(canvas, "I: %d KiB", Integer.valueOf(this.f2888e / 1024));
        String str2 = this.f2889f;
        if (str2 != null) {
            m3693a(canvas, "i format: %s", str2);
        }
        int i = this.f2891h;
        if (i > 0) {
            m3693a(canvas, "anim: f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.f2892i));
        }
        C0847b bVar = this.f2890g;
        if (bVar != null) {
            m3693a(canvas, "scale: %s", bVar);
        }
        long j = this.f2903t;
        if (j >= 0) {
            m3693a(canvas, "t: %d ms", Long.valueOf(j));
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3694a(rect, 7, 7);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
