package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.J */
class C0520J {

    /* renamed from: a */
    private static final RectF f1954a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1955b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f1956c = 0;

    /* renamed from: d */
    private boolean f1957d = false;

    /* renamed from: e */
    private float f1958e = -1.0f;

    /* renamed from: f */
    private float f1959f = -1.0f;

    /* renamed from: g */
    private float f1960g = -1.0f;

    /* renamed from: h */
    private int[] f1961h = new int[0];

    /* renamed from: i */
    private boolean f1962i = false;

    /* renamed from: j */
    private TextPaint f1963j;

    /* renamed from: k */
    private final TextView f1964k;

    /* renamed from: l */
    private final Context f1965l;

    C0520J(TextView textView) {
        this.f1964k = textView;
        this.f1965l = this.f1964k.getContext();
    }

    /* renamed from: a */
    private int m2498a(RectF rectF) {
        int length = this.f1961h.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m2506a(this.f1961h[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1961h[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m2499a(CharSequence charSequence, Alignment alignment, int i) {
        boolean z;
        float f;
        float f2;
        if (VERSION.SDK_INT >= 16) {
            f2 = this.f1964k.getLineSpacingMultiplier();
            f = this.f1964k.getLineSpacingExtra();
            z = this.f1964k.getIncludeFontPadding();
        } else {
            f2 = ((Float) m2501a((Object) this.f1964k, "getLineSpacingMultiplier", (T) Float.valueOf(1.0f))).floatValue();
            f = ((Float) m2501a((Object) this.f1964k, "getLineSpacingExtra", (T) Float.valueOf(0.0f))).floatValue();
            z = ((Boolean) m2501a((Object) this.f1964k, "getIncludeFontPadding", (T) Boolean.valueOf(true))).booleanValue();
        }
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f1963j, i, alignment, f2, f, z);
        return staticLayout;
    }

    /* renamed from: a */
    private StaticLayout m2500a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m2501a((Object) this.f1964k, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.f1963j, i).setAlignment(alignment).setLineSpacing(this.f1964k.getLineSpacingExtra(), this.f1964k.getLineSpacingMultiplier()).setIncludePad(this.f1964k.getIncludeFontPadding()).setBreakStrategy(this.f1964k.getBreakStrategy()).setHyphenationFrequency(this.f1964k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m2501a(Object obj, String str, T t) {
        try {
            return m2502a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m2502a(String str) {
        try {
            Method method = (Method) f1955b.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f1955b.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private void m2503a(float f) {
        if (f != this.f1964k.getPaint().getTextSize()) {
            this.f1964k.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f1964k.isInLayout() : false;
            if (this.f1964k.getLayout() != null) {
                this.f1957d = false;
                try {
                    Method a = m2502a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f1964k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1964k.requestLayout();
                } else {
                    this.f1964k.forceLayout();
                }
                this.f1964k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m2504a(float f, float f2, float f3) {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size ");
            sb2.append("text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f1956c = 1;
            this.f1959f = f;
            this.f1960g = f2;
            this.f1958e = f3;
            this.f1962i = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    private void m2505a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1961h = m2507a(iArr);
            m2510j();
        }
    }

    /* renamed from: a */
    private boolean m2506a(int i, RectF rectF) {
        CharSequence text = this.f1964k.getText();
        TransformationMethod transformationMethod = this.f1964k.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f1964k);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f1964k.getMaxLines() : -1;
        TextPaint textPaint = this.f1963j;
        if (textPaint == null) {
            this.f1963j = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1963j.set(this.f1964k.getPaint());
        this.f1963j.setTextSize((float) i);
        Alignment alignment = (Alignment) m2501a((Object) this.f1964k, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL);
        StaticLayout a = VERSION.SDK_INT >= 23 ? m2500a(text, alignment, Math.round(rectF.right), maxLines) : m2499a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m2507a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private void m2508h() {
        this.f1956c = 0;
        this.f1959f = -1.0f;
        this.f1960g = -1.0f;
        this.f1958e = -1.0f;
        this.f1961h = new int[0];
        this.f1957d = false;
    }

    /* renamed from: i */
    private boolean m2509i() {
        if (!m2511k() || this.f1956c != 1) {
            this.f1957d = false;
        } else {
            if (!this.f1962i || this.f1961h.length == 0) {
                float round = (float) Math.round(this.f1959f);
                int i = 1;
                while (Math.round(this.f1958e + round) <= Math.round(this.f1960g)) {
                    i++;
                    round += this.f1958e;
                }
                int[] iArr = new int[i];
                float f = this.f1959f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f1958e;
                }
                this.f1961h = m2507a(iArr);
            }
            this.f1957d = true;
        }
        return this.f1957d;
    }

    /* renamed from: j */
    private boolean m2510j() {
        int length = this.f1961h.length;
        this.f1962i = length > 0;
        if (this.f1962i) {
            this.f1956c = 1;
            int[] iArr = this.f1961h;
            this.f1959f = (float) iArr[0];
            this.f1960g = (float) iArr[length - 1];
            this.f1958e = -1.0f;
        }
        return this.f1962i;
    }

    /* renamed from: k */
    private boolean m2511k() {
        return !(this.f1964k instanceof C0607p);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2681a() {
        if (mo2692g()) {
            if (this.f1957d) {
                if (this.f1964k.getMeasuredHeight() > 0 && this.f1964k.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) m2501a((Object) this.f1964k, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue() ? 1048576 : (this.f1964k.getMeasuredWidth() - this.f1964k.getTotalPaddingLeft()) - this.f1964k.getTotalPaddingRight();
                    int height = (this.f1964k.getHeight() - this.f1964k.getCompoundPaddingBottom()) - this.f1964k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f1954a) {
                            f1954a.setEmpty();
                            f1954a.right = (float) measuredWidth;
                            f1954a.bottom = (float) height;
                            float a = (float) m2498a(f1954a);
                            if (a != this.f1964k.getTextSize()) {
                                mo2683a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.f1957d = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2682a(int i) {
        if (!m2511k()) {
            return;
        }
        if (i == 0) {
            m2508h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1965l.getResources().getDisplayMetrics();
            m2504a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m2509i()) {
                mo2681a();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2683a(int i, float f) {
        Context context = this.f1965l;
        m2503a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2684a(int i, int i2, int i3, int i4) {
        if (m2511k()) {
            DisplayMetrics displayMetrics = this.f1965l.getResources().getDisplayMetrics();
            m2504a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m2509i()) {
                mo2681a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2685a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1965l.obtainStyledAttributes(attributeSet, C0172j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0172j.AppCompatTextView_autoSizeTextType)) {
            this.f1956c = obtainStyledAttributes.getInt(C0172j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0172j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0172j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0172j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0172j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0172j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0172j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0172j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0172j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m2505a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m2511k()) {
            this.f1956c = 0;
        } else if (this.f1956c == 1) {
            if (!this.f1962i) {
                DisplayMetrics displayMetrics = this.f1965l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m2504a(dimension2, dimension3, dimension);
            }
            m2509i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2686a(int[] iArr, int i) {
        if (m2511k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1965l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1961h = m2507a(iArr2);
                if (!m2510j()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f1962i = false;
            }
            if (m2509i()) {
                mo2681a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo2687b() {
        return Math.round(this.f1960g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo2688c() {
        return Math.round(this.f1959f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2689d() {
        return Math.round(this.f1958e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int[] mo2690e() {
        return this.f1961h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo2691f() {
        return this.f1956c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo2692g() {
        return m2511k() && this.f1956c != 0;
    }
}
