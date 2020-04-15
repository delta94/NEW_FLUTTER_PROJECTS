package p000a.p005b.p009c.p017f;

import android.os.Build.VERSION;
import android.support.p029v4.util.C0334k;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: a.b.c.f.b */
public class C0095b implements Spannable {

    /* renamed from: a */
    private static final Object f218a = new Object();

    /* renamed from: b */
    private static Executor f219b = null;

    /* renamed from: c */
    private final Spannable f220c;

    /* renamed from: d */
    private final C0096a f221d;

    /* renamed from: e */
    private final PrecomputedText f222e;

    /* renamed from: a.b.c.f.b$a */
    public static final class C0096a {

        /* renamed from: a */
        private final TextPaint f223a;

        /* renamed from: b */
        private final TextDirectionHeuristic f224b;

        /* renamed from: c */
        private final int f225c;

        /* renamed from: d */
        private final int f226d;

        /* renamed from: e */
        final Params f227e;

        /* renamed from: a.b.c.f.b$a$a */
        public static class C0097a {

            /* renamed from: a */
            private final TextPaint f228a;

            /* renamed from: b */
            private TextDirectionHeuristic f229b;

            /* renamed from: c */
            private int f230c;

            /* renamed from: d */
            private int f231d;

            public C0097a(TextPaint textPaint) {
                this.f228a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f230c = 1;
                    this.f231d = 1;
                } else {
                    this.f231d = 0;
                    this.f230c = 0;
                }
                this.f229b = VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C0097a mo312a(int i) {
                this.f230c = i;
                return this;
            }

            /* renamed from: a */
            public C0097a mo313a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f229b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C0096a mo314a() {
                return new C0096a(this.f228a, this.f229b, this.f230c, this.f231d);
            }

            /* renamed from: b */
            public C0097a mo315b(int i) {
                this.f231d = i;
                return this;
            }
        }

        public C0096a(Params params) {
            this.f223a = params.getTextPaint();
            this.f224b = params.getTextDirection();
            this.f225c = params.getBreakStrategy();
            this.f226d = params.getHyphenationFrequency();
            this.f227e = params;
        }

        C0096a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f227e = VERSION.SDK_INT >= 28 ? new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f223a = textPaint;
            this.f224b = textDirectionHeuristic;
            this.f225c = i;
            this.f226d = i2;
        }

        /* renamed from: a */
        public int mo305a() {
            return this.f225c;
        }

        /* renamed from: b */
        public int mo306b() {
            return this.f226d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic mo307c() {
            return this.f224b;
        }

        /* renamed from: d */
        public TextPaint mo308d() {
            return this.f223a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0096a)) {
                return false;
            }
            C0096a aVar = (C0096a) obj;
            Params params = this.f227e;
            if (params != null) {
                return params.equals(aVar.f227e);
            }
            if (VERSION.SDK_INT >= 23 && (this.f225c != aVar.mo305a() || this.f226d != aVar.mo306b())) {
                return false;
            }
            if ((VERSION.SDK_INT >= 18 && this.f224b != aVar.mo307c()) || this.f223a.getTextSize() != aVar.mo308d().getTextSize() || this.f223a.getTextScaleX() != aVar.mo308d().getTextScaleX() || this.f223a.getTextSkewX() != aVar.mo308d().getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f223a.getLetterSpacing() != aVar.mo308d().getLetterSpacing() || !TextUtils.equals(this.f223a.getFontFeatureSettings(), aVar.mo308d().getFontFeatureSettings()))) || this.f223a.getFlags() != aVar.mo308d().getFlags()) {
                return false;
            }
            int i = VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f223a.getTextLocales().equals(aVar.mo308d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f223a.getTextLocale().equals(aVar.mo308d().getTextLocale())) {
                return false;
            }
            if (this.f223a.getTypeface() == null) {
                if (aVar.mo308d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f223a.getTypeface().equals(aVar.mo308d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = VERSION.SDK_INT;
            Object[] objArr = i >= 24 ? new Object[]{Float.valueOf(this.f223a.getTextSize()), Float.valueOf(this.f223a.getTextScaleX()), Float.valueOf(this.f223a.getTextSkewX()), Float.valueOf(this.f223a.getLetterSpacing()), Integer.valueOf(this.f223a.getFlags()), this.f223a.getTextLocales(), this.f223a.getTypeface(), Boolean.valueOf(this.f223a.isElegantTextHeight()), this.f224b, Integer.valueOf(this.f225c), Integer.valueOf(this.f226d)} : i >= 21 ? new Object[]{Float.valueOf(this.f223a.getTextSize()), Float.valueOf(this.f223a.getTextScaleX()), Float.valueOf(this.f223a.getTextSkewX()), Float.valueOf(this.f223a.getLetterSpacing()), Integer.valueOf(this.f223a.getFlags()), this.f223a.getTextLocale(), this.f223a.getTypeface(), Boolean.valueOf(this.f223a.isElegantTextHeight()), this.f224b, Integer.valueOf(this.f225c), Integer.valueOf(this.f226d)} : i >= 18 ? new Object[]{Float.valueOf(this.f223a.getTextSize()), Float.valueOf(this.f223a.getTextScaleX()), Float.valueOf(this.f223a.getTextSkewX()), Integer.valueOf(this.f223a.getFlags()), this.f223a.getTextLocale(), this.f223a.getTypeface(), this.f224b, Integer.valueOf(this.f225c), Integer.valueOf(this.f226d)} : i >= 17 ? new Object[]{Float.valueOf(this.f223a.getTextSize()), Float.valueOf(this.f223a.getTextScaleX()), Float.valueOf(this.f223a.getTextSkewX()), Integer.valueOf(this.f223a.getFlags()), this.f223a.getTextLocale(), this.f223a.getTypeface(), this.f224b, Integer.valueOf(this.f225c), Integer.valueOf(this.f226d)} : new Object[]{Float.valueOf(this.f223a.getTextSize()), Float.valueOf(this.f223a.getTextScaleX()), Float.valueOf(this.f223a.getTextSkewX()), Integer.valueOf(this.f223a.getFlags()), this.f223a.getTypeface(), this.f224b, Integer.valueOf(this.f225c), Integer.valueOf(this.f226d)};
            return C0334k.m1438a(objArr);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f223a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f223a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f223a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f223a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f223a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x008f:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f223a
                android.os.LocaleList r2 = r2.getTextLocales()
            L_0x00a5:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L_0x00c3
            L_0x00b0:
                r2 = 17
                if (r1 < r2) goto L_0x00c3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f223a
                java.util.Locale r2 = r2.getTextLocale()
                goto L_0x00a5
            L_0x00c3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f223a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L_0x00fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f223a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00fd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f224b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f225c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f226d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p017f.C0095b.C0096a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C0096a mo292a() {
        return this.f221d;
    }

    /* renamed from: b */
    public PrecomputedText mo293b() {
        Spannable spannable = this.f220c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f220c.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f220c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f220c.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f220c.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return VERSION.SDK_INT >= 28 ? this.f222e.getSpans(i, i2, cls) : this.f220c.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f220c.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f220c.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f222e.removeSpan(obj);
        } else {
            this.f220c.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f222e.setSpan(obj, i, i2, i3);
        } else {
            this.f220c.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f220c.subSequence(i, i2);
    }

    public String toString() {
        return this.f220c.toString();
    }
}
