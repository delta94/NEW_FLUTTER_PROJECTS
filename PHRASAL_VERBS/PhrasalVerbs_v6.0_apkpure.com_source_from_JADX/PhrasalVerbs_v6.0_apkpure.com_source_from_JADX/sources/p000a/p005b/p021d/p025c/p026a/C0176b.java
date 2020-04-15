package p000a.p005b.p021d.p025c.p026a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.util.C0326h;
import android.support.p029v4.util.C0339p;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p007b.p008a.C0020d;
import p000a.p005b.p007b.p008a.C0030k;
import p000a.p005b.p009c.p010a.p011a.C0054i;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: a.b.d.c.a.b */
public class C0176b extends C0188f {

    /* renamed from: p */
    private C0178b f411p;

    /* renamed from: q */
    private C0182f f412q;

    /* renamed from: r */
    private int f413r;

    /* renamed from: s */
    private int f414s;

    /* renamed from: t */
    private boolean f415t;

    /* renamed from: a.b.d.c.a.b$a */
    private static class C0177a extends C0182f {

        /* renamed from: a */
        private final Animatable f416a;

        C0177a(Animatable animatable) {
            super();
            this.f416a = animatable;
        }

        /* renamed from: c */
        public void mo597c() {
            this.f416a.start();
        }

        /* renamed from: d */
        public void mo598d() {
            this.f416a.stop();
        }
    }

    /* renamed from: a.b.d.c.a.b$b */
    static class C0178b extends C0189a {

        /* renamed from: K */
        C0326h<Long> f417K;

        /* renamed from: L */
        C0339p<Integer> f418L;

        C0178b(C0178b bVar, C0176b bVar2, Resources resources) {
            C0339p<Integer> pVar;
            super(bVar, bVar2, resources);
            if (bVar != null) {
                this.f417K = bVar.f417K;
                pVar = bVar.f418L;
            } else {
                this.f417K = new C0326h<>();
                pVar = new C0339p<>();
            }
            this.f418L = pVar;
        }

        /* renamed from: f */
        private static long m615f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo599a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo627a(drawable);
            long f = m615f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f417K.mo1353a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f417K.mo1353a(m615f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo600a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo687a(iArr, drawable);
            this.f418L.mo1456c(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo601b(int[] iArr) {
            int a = super.mo686a(iArr);
            return a >= 0 ? a : super.mo686a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo602c(int i, int i2) {
            return (int) ((Long) this.f417K.mo1357b(m615f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo603d(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f418L.mo1454b(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo604d(int i, int i2) {
            return (((Long) this.f417K.mo1357b(m615f(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo605e(int i, int i2) {
            return (((Long) this.f417K.mo1357b(m615f(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo606m() {
            this.f417K = this.f417K.clone();
            this.f418L = this.f418L.clone();
        }

        public Drawable newDrawable() {
            return new C0176b(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0176b(this, resources);
        }
    }

    /* renamed from: a.b.d.c.a.b$c */
    private static class C0179c extends C0182f {

        /* renamed from: a */
        private final C0020d f419a;

        C0179c(C0020d dVar) {
            super();
            this.f419a = dVar;
        }

        /* renamed from: c */
        public void mo597c() {
            this.f419a.start();
        }

        /* renamed from: d */
        public void mo598d() {
            this.f419a.stop();
        }
    }

    /* renamed from: a.b.d.c.a.b$d */
    private static class C0180d extends C0182f {

        /* renamed from: a */
        private final ObjectAnimator f420a;

        /* renamed from: b */
        private final boolean f421b;

        C0180d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0181e eVar = new C0181e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.mo611a());
            ofInt.setInterpolator(eVar);
            this.f421b = z2;
            this.f420a = ofInt;
        }

        /* renamed from: a */
        public boolean mo609a() {
            return this.f421b;
        }

        /* renamed from: b */
        public void mo610b() {
            this.f420a.reverse();
        }

        /* renamed from: c */
        public void mo597c() {
            this.f420a.start();
        }

        /* renamed from: d */
        public void mo598d() {
            this.f420a.cancel();
        }
    }

    /* renamed from: a.b.d.c.a.b$e */
    private static class C0181e implements TimeInterpolator {

        /* renamed from: a */
        private int[] f422a;

        /* renamed from: b */
        private int f423b;

        /* renamed from: c */
        private int f424c;

        C0181e(AnimationDrawable animationDrawable, boolean z) {
            mo612a(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo611a() {
            return this.f424c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo612a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f423b = numberOfFrames;
            int[] iArr = this.f422a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f422a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f422a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f424c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f424c)) + 0.5f);
            int i2 = this.f423b;
            int[] iArr = this.f422a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f424c) : 0.0f);
        }
    }

    /* renamed from: a.b.d.c.a.b$f */
    private static abstract class C0182f {
        private C0182f() {
        }

        /* renamed from: a */
        public boolean mo609a() {
            return false;
        }

        /* renamed from: b */
        public void mo610b() {
        }

        /* renamed from: c */
        public abstract void mo597c();

        /* renamed from: d */
        public abstract void mo598d();
    }

    public C0176b() {
        this(null, null);
    }

    C0176b(C0178b bVar, Resources resources) {
        super(null);
        this.f413r = -1;
        this.f414s = -1;
        mo563a((C0186b) new C0178b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0176b m601a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0176b bVar = new C0176b();
            bVar.mo565b(context, resources, xmlPullParser, attributeSet, theme);
            return bVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: a */
    private void m602a(TypedArray typedArray) {
        C0178b bVar = this.f411p;
        if (VERSION.SDK_INT >= 21) {
            bVar.f452d |= typedArray.getChangingConfigurations();
        }
        bVar.mo636b(typedArray.getBoolean(C0172j.AnimatedStateListDrawableCompat_android_variablePadding, bVar.f457i));
        bVar.mo632a(typedArray.getBoolean(C0172j.AnimatedStateListDrawableCompat_android_constantSize, bVar.f460l));
        bVar.mo635b(typedArray.getInt(C0172j.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.f440A));
        bVar.mo639c(typedArray.getInt(C0172j.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.f441B));
        setDither(typedArray.getBoolean(C0172j.AnimatedStateListDrawableCompat_android_dither, bVar.f472x));
    }

    /* renamed from: b */
    private boolean m603b(int i) {
        int i2;
        C0182f fVar;
        C0182f fVar2 = this.f412q;
        if (fVar2 == null) {
            i2 = mo618b();
        } else if (i == this.f413r) {
            return true;
        } else {
            if (i != this.f414s || !fVar2.mo609a()) {
                i2 = this.f413r;
                fVar2.mo598d();
            } else {
                fVar2.mo610b();
                this.f413r = this.f414s;
                this.f414s = i;
                return true;
            }
        }
        this.f412q = null;
        this.f414s = -1;
        this.f413r = -1;
        C0178b bVar = this.f411p;
        int d = bVar.mo603d(i2);
        int d2 = bVar.mo603d(i);
        if (!(d2 == 0 || d == 0)) {
            int c = bVar.mo602c(d, d2);
            if (c < 0) {
                return false;
            }
            boolean e = bVar.mo605e(d, d2);
            mo617a(c);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                fVar = new C0180d((AnimationDrawable) current, bVar.mo604d(d, d2), e);
            } else if (current instanceof C0020d) {
                fVar = new C0179c((C0020d) current);
            } else if (current instanceof Animatable) {
                fVar = new C0177a((Animatable) current);
            }
            fVar.mo597c();
            this.f412q = fVar;
            this.f414s = i2;
            this.f413r = i;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m604c() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m605c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m606d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m607e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m606d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        TypedArray a = C0054i.m165a(resources, theme, attributeSet, C0172j.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C0172j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C0172j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable b = resourceId2 > 0 ? C0173a.m597b(context, resourceId2) : null;
        a.recycle();
        int[] a2 = mo685a(attributeSet);
        String str = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                b = xmlPullParser.getName().equals("vector") ? C0030k.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            }
        }
        if (b != null) {
            return this.f411p.mo600a(a2, b, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: e */
    private int m607e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        TypedArray a = C0054i.m165a(resources, theme, attributeSet, C0172j.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0172j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0172j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C0172j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable b = resourceId3 > 0 ? C0173a.m597b(context, resourceId3) : null;
        boolean z = a.getBoolean(C0172j.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        String str = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                b = xmlPullParser.getName().equals("animated-vector") ? C0020d.m30a(context, resources, xmlPullParser, attributeSet, theme) : VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            }
        }
        if (b == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f411p.mo599a(resourceId, resourceId2, b, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0178b m610a() {
        return new C0178b(this.f411p, this, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo563a(C0186b bVar) {
        super.mo563a(bVar);
        if (bVar instanceof C0178b) {
            this.f411p = (C0178b) bVar;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: b */
    public void mo565b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        TypedArray a = C0054i.m165a(resources, theme, attributeSet, C0172j.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0172j.AnimatedStateListDrawableCompat_android_visible, true), true);
        m602a(a);
        mo615a(resources);
        a.recycle();
        m605c(context, resources, xmlPullParser, attributeSet, theme);
        m604c();
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0182f fVar = this.f412q;
        if (fVar != null) {
            fVar.mo598d();
            this.f412q = null;
            mo617a(this.f413r);
            this.f413r = -1;
            this.f414s = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f415t) {
            super.mutate();
            if (this == this) {
                this.f411p.mo606m();
                this.f415t = true;
            }
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b = this.f411p.mo601b(iArr);
        boolean z = b != mo618b() && (m603b(b) || mo617a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f412q != null && (visible || z2)) {
            if (z) {
                this.f412q.mo597c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
