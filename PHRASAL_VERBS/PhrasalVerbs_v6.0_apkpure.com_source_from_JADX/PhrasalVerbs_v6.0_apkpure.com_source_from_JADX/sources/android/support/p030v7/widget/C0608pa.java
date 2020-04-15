package android.support.p030v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.widget.C0345D;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p023b.p024a.C0173a;
import p000a.p005b.p021d.p027d.C0190a;

/* renamed from: android.support.v7.widget.pa */
public class C0608pa extends CompoundButton {

    /* renamed from: a */
    private static final Property<C0608pa, Float> f2324a = new C0606oa(Float.class, "thumbPos");

    /* renamed from: b */
    private static final int[] f2325b = {16842912};

    /* renamed from: A */
    private int f2326A;

    /* renamed from: B */
    private int f2327B;

    /* renamed from: C */
    private int f2328C;

    /* renamed from: D */
    private int f2329D;

    /* renamed from: E */
    private int f2330E;

    /* renamed from: F */
    private int f2331F;

    /* renamed from: G */
    private int f2332G;

    /* renamed from: H */
    private final TextPaint f2333H;

    /* renamed from: I */
    private ColorStateList f2334I;

    /* renamed from: J */
    private Layout f2335J;

    /* renamed from: K */
    private Layout f2336K;

    /* renamed from: L */
    private TransformationMethod f2337L;

    /* renamed from: M */
    ObjectAnimator f2338M;

    /* renamed from: N */
    private final Rect f2339N;

    /* renamed from: c */
    private Drawable f2340c;

    /* renamed from: d */
    private ColorStateList f2341d;

    /* renamed from: e */
    private Mode f2342e;

    /* renamed from: f */
    private boolean f2343f;

    /* renamed from: g */
    private boolean f2344g;

    /* renamed from: h */
    private Drawable f2345h;

    /* renamed from: i */
    private ColorStateList f2346i;

    /* renamed from: j */
    private Mode f2347j;

    /* renamed from: k */
    private boolean f2348k;

    /* renamed from: l */
    private boolean f2349l;

    /* renamed from: m */
    private int f2350m;

    /* renamed from: n */
    private int f2351n;

    /* renamed from: o */
    private int f2352o;

    /* renamed from: p */
    private boolean f2353p;

    /* renamed from: q */
    private CharSequence f2354q;

    /* renamed from: r */
    private CharSequence f2355r;

    /* renamed from: s */
    private boolean f2356s;

    /* renamed from: t */
    private int f2357t;

    /* renamed from: u */
    private int f2358u;

    /* renamed from: v */
    private float f2359v;

    /* renamed from: w */
    private float f2360w;

    /* renamed from: x */
    private VelocityTracker f2361x;

    /* renamed from: y */
    private int f2362y;

    /* renamed from: z */
    float f2363z;

    public C0608pa(Context context) {
        this(context, null);
    }

    public C0608pa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.switchStyle);
    }

    public C0608pa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2341d = null;
        this.f2342e = null;
        this.f2343f = false;
        this.f2344g = false;
        this.f2346i = null;
        this.f2347j = null;
        this.f2348k = false;
        this.f2349l = false;
        this.f2361x = VelocityTracker.obtain();
        this.f2339N = new Rect();
        this.f2333H = new TextPaint(1);
        Resources resources = getResources();
        this.f2333H.density = resources.getDisplayMetrics().density;
        C0620va a = C0620va.m2920a(context, attributeSet, C0172j.SwitchCompat, i, 0);
        this.f2340c = a.mo3258b(C0172j.SwitchCompat_android_thumb);
        Drawable drawable = this.f2340c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f2345h = a.mo3258b(C0172j.SwitchCompat_track);
        Drawable drawable2 = this.f2345h;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.f2354q = a.mo3264e(C0172j.SwitchCompat_android_textOn);
        this.f2355r = a.mo3264e(C0172j.SwitchCompat_android_textOff);
        this.f2356s = a.mo3256a(C0172j.SwitchCompat_showText, true);
        this.f2350m = a.mo3259c(C0172j.SwitchCompat_thumbTextPadding, 0);
        this.f2351n = a.mo3259c(C0172j.SwitchCompat_switchMinWidth, 0);
        this.f2352o = a.mo3259c(C0172j.SwitchCompat_switchPadding, 0);
        this.f2353p = a.mo3256a(C0172j.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo3253a(C0172j.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f2341d = a2;
            this.f2343f = true;
        }
        Mode a3 = C0525M.m2559a(a.mo3261d(C0172j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f2342e != a3) {
            this.f2342e = a3;
            this.f2344g = true;
        }
        if (this.f2343f || this.f2344g) {
            m2887a();
        }
        ColorStateList a4 = a.mo3253a(C0172j.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f2346i = a4;
            this.f2348k = true;
        }
        Mode a5 = C0525M.m2559a(a.mo3261d(C0172j.SwitchCompat_trackTintMode, -1), null);
        if (this.f2347j != a5) {
            this.f2347j = a5;
            this.f2349l = true;
        }
        if (this.f2348k || this.f2349l) {
            m2892b();
        }
        int g = a.mo3267g(C0172j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo3161a(context, g);
        }
        a.mo3255a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2358u = viewConfiguration.getScaledTouchSlop();
        this.f2362y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m2885a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m2886a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f2337L;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f2333H;
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    private void m2887a() {
        if (this.f2340c == null) {
            return;
        }
        if (this.f2343f || this.f2344g) {
            this.f2340c = this.f2340c.mutate();
            if (this.f2343f) {
                C0311a.m1336a(this.f2340c, this.f2341d);
            }
            if (this.f2344g) {
                C0311a.m1339a(this.f2340c, this.f2342e);
            }
            if (this.f2340c.isStateful()) {
                this.f2340c.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private void m2888a(int i, int i2) {
        Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
        mo3162a(typeface, i2);
    }

    /* renamed from: a */
    private void m2889a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void mo6342a(boolean z) {
        this.f2338M = ObjectAnimator.ofFloat(this, f2324a, new float[]{z ? 1.0f : 0.0f});
        this.f2338M.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f2338M.setAutoCancel(true);
        }
        this.f2338M.start();
    }

    /* renamed from: a */
    private boolean m2891a(float f, float f2) {
        boolean z = false;
        if (this.f2340c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f2340c.getPadding(this.f2339N);
        int i = this.f2330E;
        int i2 = this.f2358u;
        int i3 = i - i2;
        int i4 = (this.f2329D + thumbOffset) - i2;
        int i5 = this.f2328C + i4;
        Rect rect = this.f2339N;
        int i6 = i5 + rect.left + rect.right + i2;
        int i7 = this.f2332G + i2;
        if (f > ((float) i4) && f < ((float) i6) && f2 > ((float) i3) && f2 < ((float) i7)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m2892b() {
        if (this.f2345h == null) {
            return;
        }
        if (this.f2348k || this.f2349l) {
            this.f2345h = this.f2345h.mutate();
            if (this.f2348k) {
                C0311a.m1336a(this.f2345h, this.f2346i);
            }
            if (this.f2349l) {
                C0311a.m1339a(this.f2345h, this.f2347j);
            }
            if (this.f2345h.isStateful()) {
                this.f2345h.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private void m2893b(MotionEvent motionEvent) {
        boolean z;
        this.f2357t = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f2361x.computeCurrentVelocity(1000);
            float xVelocity = this.f2361x.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f2362y)) {
                if (!C0521Ja.m2525a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m2889a(motionEvent);
    }

    /* renamed from: c */
    private void m2894c() {
        ObjectAnimator objectAnimator = this.f2338M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f2363z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0521Ja.m2525a(this) ? 1.0f - this.f2363z : this.f2363z) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f2345h;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f2339N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2340c;
        Rect c = drawable2 != null ? C0525M.m2562c(drawable2) : C0525M.f1967a;
        return ((((this.f2326A - this.f2328C) - rect.left) - rect.right) - c.left) - c.right;
    }

    /* renamed from: a */
    public void mo3161a(Context context, int i) {
        C0620va a = C0620va.m2918a(context, i, C0172j.TextAppearance);
        ColorStateList a2 = a.mo3253a(C0172j.TextAppearance_android_textColor);
        if (a2 == null) {
            a2 = getTextColors();
        }
        this.f2334I = a2;
        int c = a.mo3259c(C0172j.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f2333H.getTextSize()) {
                this.f2333H.setTextSize(f);
                requestLayout();
            }
        }
        m2888a(a.mo3261d(C0172j.TextAppearance_android_typeface, -1), a.mo3261d(C0172j.TextAppearance_android_textStyle, -1));
        this.f2337L = a.mo3256a(C0172j.TextAppearance_textAllCaps, false) ? new C0190a(getContext()) : null;
        a.mo3255a();
    }

    /* renamed from: a */
    public void mo3162a(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f2333H;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f2333H;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f2333H.setFakeBoldText(false);
        this.f2333H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f2339N;
        int i3 = this.f2329D;
        int i4 = this.f2330E;
        int i5 = this.f2331F;
        int i6 = this.f2332G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f2340c;
        Rect c = drawable != null ? C0525M.m2562c(drawable) : C0525M.f1967a;
        Drawable drawable2 = this.f2345h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (c != null) {
                int i8 = c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = c.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = c.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = c.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f2345h.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f2345h.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f2340c;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f2328C + rect.right;
            this.f2340c.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0311a.m1335a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f2340c;
        if (drawable != null) {
            C0311a.m1334a(drawable, f, f2);
        }
        Drawable drawable2 = this.f2345h;
        if (drawable2 != null) {
            C0311a.m1334a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2340c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2345h;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0521Ja.m2525a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2326A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f2352o;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0521Ja.m2525a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2326A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f2352o;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2356s;
    }

    public boolean getSplitTrack() {
        return this.f2353p;
    }

    public int getSwitchMinWidth() {
        return this.f2351n;
    }

    public int getSwitchPadding() {
        return this.f2352o;
    }

    public CharSequence getTextOff() {
        return this.f2355r;
    }

    public CharSequence getTextOn() {
        return this.f2354q;
    }

    public Drawable getThumbDrawable() {
        return this.f2340c;
    }

    public int getThumbTextPadding() {
        return this.f2350m;
    }

    public ColorStateList getThumbTintList() {
        return this.f2341d;
    }

    public Mode getThumbTintMode() {
        return this.f2342e;
    }

    public Drawable getTrackDrawable() {
        return this.f2345h;
    }

    public ColorStateList getTrackTintList() {
        return this.f2346i;
    }

    public Mode getTrackTintMode() {
        return this.f2347j;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2340c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2345h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2338M;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f2338M.end();
            this.f2338M = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f2325b);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f2339N;
        Drawable drawable = this.f2345h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f2330E + rect.top;
        int i3 = this.f2332G - rect.bottom;
        Drawable drawable2 = this.f2340c;
        if (drawable != null) {
            if (!this.f2353p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c = C0525M.m2562c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c.left;
                rect.right -= c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f2335J : this.f2336K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2334I;
            if (colorStateList != null) {
                this.f2333H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f2333H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f2354q : this.f2355r;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f2340c != null) {
            Rect rect = this.f2339N;
            Drawable drawable = this.f2345h;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c = C0525M.m2562c(this.f2340c);
            i5 = Math.max(0, c.left - rect.left);
            i11 = Math.max(0, c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0521Ja.m2525a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f2326A + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f2326A) + i5 + i11;
        }
        int gravity = getGravity() & C0172j.AppCompatTheme_windowActionBarOverlay;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i10 = this.f2327B;
            i9 = paddingTop - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f2327B;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f2327B;
            this.f2329D = i7;
            this.f2330E = i9;
            this.f2332G = i8;
            this.f2331F = i6;
        }
        i8 = i10 + i9;
        this.f2329D = i7;
        this.f2330E = i9;
        this.f2332G = i8;
        this.f2331F = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f2356s) {
            if (this.f2335J == null) {
                this.f2335J = m2886a(this.f2354q);
            }
            if (this.f2336K == null) {
                this.f2336K = m2886a(this.f2355r);
            }
        }
        Rect rect = this.f2339N;
        Drawable drawable = this.f2340c;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f2340c.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f2340c.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f2328C = Math.max(this.f2356s ? Math.max(this.f2335J.getWidth(), this.f2336K.getWidth()) + (this.f2350m * 2) : 0, i4);
        Drawable drawable2 = this.f2345h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f2345h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f2340c;
        if (drawable3 != null) {
            Rect c = C0525M.m2562c(drawable3);
            i6 = Math.max(i6, c.left);
            i7 = Math.max(i7, c.right);
        }
        int max = Math.max(this.f2351n, (this.f2328C * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f2326A = max;
        this.f2327B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2354q : this.f2355r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f2361x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x00a1
            r2 = 2
            if (r0 == r1) goto L_0x008d
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008d
            goto L_0x00bb
        L_0x0016:
            int r0 = r6.f2357t
            if (r0 == 0) goto L_0x00bb
            if (r0 == r1) goto L_0x0059
            if (r0 == r2) goto L_0x0020
            goto L_0x00bb
        L_0x0020:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f2359v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003f
        L_0x0034:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r0 = android.support.p030v7.widget.C0521Ja.m2525a(r6)
            if (r0 == 0) goto L_0x0046
            float r2 = -r2
        L_0x0046:
            float r0 = r6.f2363z
            float r0 = r0 + r2
            float r0 = m2885a(r0, r4, r3)
            float r2 = r6.f2363z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            r6.f2359v = r7
            r6.setThumbPosition(r0)
        L_0x0058:
            return r1
        L_0x0059:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f2359v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2358u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007f
            float r4 = r6.f2360w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2358u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bb
        L_0x007f:
            r6.f2357t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f2359v = r0
            r6.f2360w = r3
            return r1
        L_0x008d:
            int r0 = r6.f2357t
            if (r0 != r2) goto L_0x0098
            r6.m2893b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0098:
            r0 = 0
            r6.f2357t = r0
            android.view.VelocityTracker r0 = r6.f2361x
            r0.clear()
            goto L_0x00bb
        L_0x00a1:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r6.m2891a(r0, r2)
            if (r3 == 0) goto L_0x00bb
            r6.f2357t = r1
            r6.f2359v = r0
            r6.f2360w = r2
        L_0x00bb:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0608pa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C0156v.m577r(this)) {
            m2894c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        mo6342a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0345D.m1491a((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f2356s != z) {
            this.f2356s = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f2353p = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f2351n = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f2352o = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f2333H.getTypeface() != null && !this.f2333H.getTypeface().equals(typeface)) || (this.f2333H.getTypeface() == null && typeface != null)) {
            this.f2333H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2355r = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2354q = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2340c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2340c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f2363z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0173a.m597b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f2350m = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2341d = colorStateList;
        this.f2343f = true;
        m2887a();
    }

    public void setThumbTintMode(Mode mode) {
        this.f2342e = mode;
        this.f2344g = true;
        m2887a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2345h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2345h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0173a.m597b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2346i = colorStateList;
        this.f2348k = true;
        m2892b();
    }

    public void setTrackTintMode(Mode mode) {
        this.f2347j = mode;
        this.f2349l = true;
        m2892b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2340c || drawable == this.f2345h;
    }
}
