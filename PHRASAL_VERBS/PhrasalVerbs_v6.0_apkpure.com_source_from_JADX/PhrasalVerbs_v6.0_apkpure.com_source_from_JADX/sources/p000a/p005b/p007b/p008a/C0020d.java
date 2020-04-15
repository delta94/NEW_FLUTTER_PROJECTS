package p000a.p005b.p007b.p008a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.util.C0320b;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p000a.p005b.p009c.p010a.p011a.C0054i;

/* renamed from: a.b.b.a.d */
public class C0020d extends C0028i implements C0018b {

    /* renamed from: b */
    private C0021a f35b;

    /* renamed from: c */
    private Context f36c;

    /* renamed from: d */
    private ArgbEvaluator f37d;

    /* renamed from: e */
    private AnimatorListener f38e;

    /* renamed from: f */
    ArrayList<Object> f39f;

    /* renamed from: g */
    final Callback f40g;

    /* renamed from: a.b.b.a.d$a */
    private static class C0021a extends ConstantState {

        /* renamed from: a */
        int f41a;

        /* renamed from: b */
        C0030k f42b;

        /* renamed from: c */
        AnimatorSet f43c;

        /* renamed from: d */
        ArrayList<Animator> f44d;

        /* renamed from: e */
        C0320b<Animator, String> f45e;

        public C0021a(Context context, C0021a aVar, Callback callback, Resources resources) {
            if (aVar != null) {
                this.f41a = aVar.f41a;
                C0030k kVar = aVar.f42b;
                if (kVar != null) {
                    ConstantState constantState = kVar.getConstantState();
                    this.f42b = (C0030k) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C0030k kVar2 = this.f42b;
                    kVar2.mutate();
                    this.f42b = kVar2;
                    this.f42b.setCallback(callback);
                    this.f42b.setBounds(aVar.f42b.getBounds());
                    this.f42b.mo92a(false);
                }
                ArrayList<Animator> arrayList = aVar.f44d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f44d = new ArrayList<>(size);
                    this.f45e = new C0320b<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) aVar.f44d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) aVar.f45e.get(animator);
                        clone.setTarget(this.f42b.mo91a(str));
                        this.f44d.add(clone);
                        this.f45e.put(clone, str);
                    }
                    mo77a();
                }
            }
        }

        /* renamed from: a */
        public void mo77a() {
            if (this.f43c == null) {
                this.f43c = new AnimatorSet();
            }
            this.f43c.playTogether(this.f44d);
        }

        public int getChangingConfigurations() {
            return this.f41a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: a.b.b.a.d$b */
    private static class C0022b extends ConstantState {

        /* renamed from: a */
        private final ConstantState f46a;

        public C0022b(ConstantState constantState) {
            this.f46a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f46a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f46a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0020d dVar = new C0020d();
            dVar.f51a = this.f46a.newDrawable();
            dVar.f51a.setCallback(dVar.f40g);
            return dVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0020d dVar = new C0020d();
            dVar.f51a = this.f46a.newDrawable(resources);
            dVar.f51a.setCallback(dVar.f40g);
            return dVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C0020d dVar = new C0020d();
            dVar.f51a = this.f46a.newDrawable(resources, theme);
            dVar.f51a.setCallback(dVar.f40g);
            return dVar;
        }
    }

    C0020d() {
        this(null, null, null);
    }

    private C0020d(Context context) {
        this(context, null, null);
    }

    private C0020d(Context context, C0021a aVar, Resources resources) {
        this.f37d = null;
        this.f38e = null;
        this.f39f = null;
        this.f40g = new C0019c(this);
        this.f36c = context;
        if (aVar != null) {
            this.f35b = aVar;
        } else {
            this.f35b = new C0021a(context, aVar, this.f40g, resources);
        }
    }

    /* renamed from: a */
    public static C0020d m30a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0020d dVar = new C0020d(context);
        dVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return dVar;
    }

    /* renamed from: a */
    private void m31a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m31a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f37d == null) {
                    this.f37d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f37d);
            }
        }
    }

    /* renamed from: a */
    private void m32a(String str, Animator animator) {
        animator.setTarget(this.f35b.f42b.mo91a(str));
        if (VERSION.SDK_INT < 21) {
            m31a(animator);
        }
        C0021a aVar = this.f35b;
        if (aVar.f44d == null) {
            aVar.f44d = new ArrayList<>();
            this.f35b.f45e = new C0320b<>();
        }
        this.f35b.f44d.add(animator);
        this.f35b.f45e.put(animator, str);
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1337a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return C0311a.m1341a(drawable);
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
        this.f35b.f42b.draw(canvas);
        if (this.f35b.f43c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0311a.m1343b(drawable) : this.f35b.f42b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f35b.f41a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f51a;
        if (drawable == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0022b(drawable.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f35b.f42b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f35b.f42b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getOpacity() : this.f35b.f42b.getOpacity();
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
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1338a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0054i.m165a(resources, theme, attributeSet, C0017a.f26e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0030k a = C0030k.m62a(resources, resourceId, theme);
                        a.mo92a(false);
                        a.setCallback(this.f40g);
                        C0030k kVar = this.f35b.f42b;
                        if (kVar != null) {
                            kVar.setCallback(null);
                        }
                        this.f35b.f42b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0017a.f27f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f36c;
                        if (context != null) {
                            m32a(string, C0024f.m38a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f35b.mo77a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0311a.m1347e(drawable) : this.f35b.f42b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f51a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f35b.f43c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.isStateful() : this.f35b.f42b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f35b.f42b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setLevel(i) : this.f35b.f42b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setState(iArr) : this.f35b.f42b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f35b.f42b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1340a(drawable, z);
        } else {
            this.f35b.f42b.setAutoMirrored(z);
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
        } else {
            this.f35b.f42b.setColorFilter(colorFilter);
        }
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
            this.f35b.f42b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1336a(drawable, colorStateList);
        } else {
            this.f35b.f42b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0311a.m1339a(drawable, mode);
        } else {
            this.f35b.f42b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f35b.f42b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f35b.f43c.isStarted()) {
            this.f35b.f43c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f35b.f43c.end();
        }
    }
}
