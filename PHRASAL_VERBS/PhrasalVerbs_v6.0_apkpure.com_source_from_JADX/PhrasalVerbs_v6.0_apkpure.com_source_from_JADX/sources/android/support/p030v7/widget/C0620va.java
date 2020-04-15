package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p005b.p009c.p010a.p011a.C0052h;
import p000a.p005b.p009c.p010a.p011a.C0052h.C0053a;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.va */
public class C0620va {

    /* renamed from: a */
    private final Context f2396a;

    /* renamed from: b */
    private final TypedArray f2397b;

    /* renamed from: c */
    private TypedValue f2398c;

    private C0620va(Context context, TypedArray typedArray) {
        this.f2396a = context;
        this.f2397b = typedArray;
    }

    /* renamed from: a */
    public static C0620va m2918a(Context context, int i, int[] iArr) {
        return new C0620va(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0620va m2919a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0620va(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0620va m2920a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0620va(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo3251a(int i, float f) {
        return this.f2397b.getFloat(i, f);
    }

    /* renamed from: a */
    public int mo3252a(int i, int i2) {
        return this.f2397b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList mo3253a(int i) {
        if (this.f2397b.hasValue(i)) {
            int resourceId = this.f2397b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0173a.m594a(this.f2396a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f2397b.getColorStateList(i);
    }

    /* renamed from: a */
    public Typeface mo3254a(int i, int i2, C0053a aVar) {
        int resourceId = this.f2397b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2398c == null) {
            this.f2398c = new TypedValue();
        }
        return C0052h.m154a(this.f2396a, resourceId, this.f2398c, i2, aVar);
    }

    /* renamed from: a */
    public void mo3255a() {
        this.f2397b.recycle();
    }

    /* renamed from: a */
    public boolean mo3256a(int i, boolean z) {
        return this.f2397b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo3257b(int i, int i2) {
        return this.f2397b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public Drawable mo3258b(int i) {
        if (this.f2397b.hasValue(i)) {
            int resourceId = this.f2397b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0173a.m597b(this.f2396a, resourceId);
            }
        }
        return this.f2397b.getDrawable(i);
    }

    /* renamed from: c */
    public int mo3259c(int i, int i2) {
        return this.f2397b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable mo3260c(int i) {
        if (this.f2397b.hasValue(i)) {
            int resourceId = this.f2397b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0600o.m2852a().mo3143a(this.f2396a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public int mo3261d(int i, int i2) {
        return this.f2397b.getInt(i, i2);
    }

    /* renamed from: d */
    public String mo3262d(int i) {
        return this.f2397b.getString(i);
    }

    /* renamed from: e */
    public int mo3263e(int i, int i2) {
        return this.f2397b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence mo3264e(int i) {
        return this.f2397b.getText(i);
    }

    /* renamed from: f */
    public int mo3265f(int i, int i2) {
        return this.f2397b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo3266f(int i) {
        return this.f2397b.getTextArray(i);
    }

    /* renamed from: g */
    public int mo3267g(int i, int i2) {
        return this.f2397b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean mo3268g(int i) {
        return this.f2397b.hasValue(i);
    }
}
