package p000a.p005b.p009c.p018g;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p018g.p019a.C0123a;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: a.b.c.g.C */
public class C0101C extends ViewGroup {

    /* renamed from: a */
    static final int[] f236a = {16842931};

    /* renamed from: b */
    private static final Comparator<C0103b> f237b = new C0161y();

    /* renamed from: c */
    private static final Interpolator f238c = new C0162z();

    /* renamed from: d */
    private static final C0111j f239d = new C0111j();

    /* renamed from: A */
    private boolean f240A;

    /* renamed from: B */
    private int f241B = 1;

    /* renamed from: C */
    private boolean f242C;

    /* renamed from: D */
    private boolean f243D;

    /* renamed from: E */
    private int f244E;

    /* renamed from: F */
    private int f245F;

    /* renamed from: G */
    private int f246G;

    /* renamed from: H */
    private float f247H;

    /* renamed from: I */
    private float f248I;

    /* renamed from: J */
    private float f249J;

    /* renamed from: K */
    private float f250K;

    /* renamed from: L */
    private int f251L = -1;

    /* renamed from: M */
    private VelocityTracker f252M;

    /* renamed from: N */
    private int f253N;

    /* renamed from: O */
    private int f254O;

    /* renamed from: P */
    private int f255P;

    /* renamed from: Q */
    private int f256Q;

    /* renamed from: R */
    private boolean f257R;

    /* renamed from: S */
    private EdgeEffect f258S;

    /* renamed from: T */
    private EdgeEffect f259T;

    /* renamed from: U */
    private boolean f260U = true;

    /* renamed from: V */
    private boolean f261V = false;

    /* renamed from: W */
    private boolean f262W;

    /* renamed from: aa */
    private int f263aa;

    /* renamed from: ba */
    private List<C0107f> f264ba;

    /* renamed from: ca */
    private C0107f f265ca;

    /* renamed from: da */
    private C0107f f266da;

    /* renamed from: e */
    private int f267e;

    /* renamed from: ea */
    private List<C0106e> f268ea;

    /* renamed from: f */
    private final ArrayList<C0103b> f269f = new ArrayList<>();

    /* renamed from: fa */
    private C0108g f270fa;

    /* renamed from: g */
    private final C0103b f271g = new C0103b();

    /* renamed from: ga */
    private int f272ga;

    /* renamed from: h */
    private final Rect f273h = new Rect();

    /* renamed from: ha */
    private int f274ha;

    /* renamed from: i */
    C0152r f275i;

    /* renamed from: ia */
    private ArrayList<View> f276ia;

    /* renamed from: j */
    int f277j;

    /* renamed from: ja */
    private final Runnable f278ja = new C0099A(this);

    /* renamed from: k */
    private int f279k = -1;

    /* renamed from: ka */
    private int f280ka = 0;

    /* renamed from: l */
    private Parcelable f281l = null;

    /* renamed from: m */
    private ClassLoader f282m = null;

    /* renamed from: n */
    private Scroller f283n;

    /* renamed from: o */
    private boolean f284o;

    /* renamed from: p */
    private C0109h f285p;

    /* renamed from: q */
    private int f286q;

    /* renamed from: r */
    private Drawable f287r;

    /* renamed from: s */
    private int f288s;

    /* renamed from: t */
    private int f289t;

    /* renamed from: u */
    private float f290u = -3.4028235E38f;

    /* renamed from: v */
    private float f291v = Float.MAX_VALUE;

    /* renamed from: w */
    private int f292w;

    /* renamed from: x */
    private int f293x;

    /* renamed from: y */
    private boolean f294y;

    /* renamed from: z */
    private boolean f295z;

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: a.b.c.g.C$a */
    public @interface C0102a {
    }

    /* renamed from: a.b.c.g.C$b */
    static class C0103b {

        /* renamed from: a */
        Object f296a;

        /* renamed from: b */
        int f297b;

        /* renamed from: c */
        boolean f298c;

        /* renamed from: d */
        float f299d;

        /* renamed from: e */
        float f300e;

        C0103b() {
        }
    }

    /* renamed from: a.b.c.g.C$c */
    public static class C0104c extends LayoutParams {

        /* renamed from: a */
        public boolean f301a;

        /* renamed from: b */
        public int f302b;

        /* renamed from: c */
        float f303c = 0.0f;

        /* renamed from: d */
        boolean f304d;

        /* renamed from: e */
        int f305e;

        /* renamed from: f */
        int f306f;

        public C0104c() {
            super(-1, -1);
        }

        public C0104c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0101C.f236a);
            this.f302b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.b.c.g.C$d */
    class C0105d extends C0134d {
        C0105d() {
        }

        /* renamed from: b */
        private boolean m358b() {
            C0152r rVar = C0101C.this.f275i;
            return rVar != null && rVar.mo536a() > 1;
        }

        /* renamed from: a */
        public void mo376a(View view, C0123a aVar) {
            super.mo376a(view, aVar);
            aVar.mo423a((CharSequence) C0101C.class.getName());
            aVar.mo447g(m358b());
            if (C0101C.this.canScrollHorizontally(1)) {
                aVar.mo420a(4096);
            }
            if (C0101C.this.canScrollHorizontally(-1)) {
                aVar.mo420a(8192);
            }
        }

        /* renamed from: a */
        public boolean mo377a(View view, int i, Bundle bundle) {
            C0101C c;
            int i2;
            if (super.mo377a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !C0101C.this.canScrollHorizontally(-1)) {
                    return false;
                }
                c = C0101C.this;
                i2 = c.f277j - 1;
            } else if (!C0101C.this.canScrollHorizontally(1)) {
                return false;
            } else {
                c = C0101C.this;
                i2 = c.f277j + 1;
            }
            c.setCurrentItem(i2);
            return true;
        }

        /* renamed from: b */
        public void mo378b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo378b(view, accessibilityEvent);
            accessibilityEvent.setClassName(C0101C.class.getName());
            accessibilityEvent.setScrollable(m358b());
            if (accessibilityEvent.getEventType() == 4096) {
                C0152r rVar = C0101C.this.f275i;
                if (rVar != null) {
                    accessibilityEvent.setItemCount(rVar.mo536a());
                    accessibilityEvent.setFromIndex(C0101C.this.f277j);
                    accessibilityEvent.setToIndex(C0101C.this.f277j);
                }
            }
        }
    }

    /* renamed from: a.b.c.g.C$e */
    public interface C0106e {
        /* renamed from: a */
        void mo379a(C0101C c, C0152r rVar, C0152r rVar2);
    }

    /* renamed from: a.b.c.g.C$f */
    public interface C0107f {
        /* renamed from: a */
        void mo380a(int i);

        /* renamed from: a */
        void mo381a(int i, float f, int i2);

        /* renamed from: b */
        void mo382b(int i);
    }

    /* renamed from: a.b.c.g.C$g */
    public interface C0108g {
        /* renamed from: a */
        void mo383a(View view, float f);
    }

    /* renamed from: a.b.c.g.C$h */
    private class C0109h extends DataSetObserver {
        C0109h() {
        }

        public void onChanged() {
            C0101C.this.mo321a();
        }

        public void onInvalidated() {
            C0101C.this.mo321a();
        }
    }

    /* renamed from: a.b.c.g.C$i */
    public static class C0110i extends C0133c {
        public static final Creator<C0110i> CREATOR = new C0112D();

        /* renamed from: a */
        int f309a;

        /* renamed from: b */
        Parcelable f310b;

        /* renamed from: c */
        ClassLoader f311c;

        C0110i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0110i.class.getClassLoader();
            }
            this.f309a = parcel.readInt();
            this.f310b = parcel.readParcelable(classLoader);
            this.f311c = classLoader;
        }

        public C0110i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f309a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f309a);
            parcel.writeParcelable(this.f310b, i);
        }
    }

    /* renamed from: a.b.c.g.C$j */
    static class C0111j implements Comparator<View> {
        C0111j() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0104c cVar = (C0104c) view.getLayoutParams();
            C0104c cVar2 = (C0104c) view2.getLayoutParams();
            boolean z = cVar.f301a;
            if (z == cVar2.f301a) {
                return cVar.f305e - cVar2.f305e;
            }
            return z ? 1 : -1;
        }
    }

    public C0101C(Context context) {
        super(context);
        mo335b();
    }

    /* renamed from: a */
    private int m318a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f255P || Math.abs(i2) <= this.f253N) {
            i += (int) (f + (i >= this.f277j ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f269f.size() <= 0) {
            return i;
        }
        C0103b bVar = (C0103b) this.f269f.get(0);
        ArrayList<C0103b> arrayList = this.f269f;
        return Math.max(bVar.f297b, Math.min(i, ((C0103b) arrayList.get(arrayList.size() - 1)).f297b));
    }

    /* renamed from: a */
    private Rect m319a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    private void m320a(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f269f.isEmpty()) {
            C0103b b = mo333b(this.f277j);
            min = (int) ((b != null ? Math.min(b.f300e, this.f291v) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m324a(false);
            } else {
                return;
            }
        } else if (!this.f283n.isFinished()) {
            this.f283n.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: a */
    private void m321a(int i, boolean z, int i2, boolean z2) {
        C0103b b = mo333b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f290u, Math.min(b.f300e, this.f291v))) : 0;
        if (z) {
            mo323a(clientWidth, 0, i2);
            if (z2) {
                mo6741d(i);
                return;
            }
            return;
        }
        if (z2) {
            mo6741d(i);
        }
        m324a(false);
        scrollTo(clientWidth, 0);
        m334f(clientWidth);
    }

    /* renamed from: a */
    private void m322a(C0103b bVar, int i, C0103b bVar2) {
        int i2;
        int i3;
        C0103b bVar3;
        C0103b bVar4;
        int a = this.f275i.mo536a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f286q) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i4 = bVar2.f297b;
            int i5 = bVar.f297b;
            if (i4 < i5) {
                float f2 = bVar2.f300e + bVar2.f299d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= bVar.f297b && i7 < this.f269f.size()) {
                    while (true) {
                        bVar4 = (C0103b) this.f269f.get(i7);
                        if (i6 > bVar4.f297b && i7 < this.f269f.size() - 1) {
                            i7++;
                        }
                    }
                    while (i6 < bVar4.f297b) {
                        f2 += this.f275i.mo535a(i6) + f;
                        i6++;
                    }
                    bVar4.f300e = f2;
                    f2 += bVar4.f299d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f269f.size() - 1;
                float f3 = bVar2.f300e;
                while (true) {
                    i4--;
                    if (i4 < bVar.f297b || size < 0) {
                        break;
                    }
                    while (true) {
                        bVar3 = (C0103b) this.f269f.get(size);
                        if (i4 < bVar3.f297b && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > bVar3.f297b) {
                        f3 -= this.f275i.mo535a(i4) + f;
                        i4--;
                    }
                    f3 -= bVar3.f299d + f;
                    bVar3.f300e = f3;
                }
            }
        }
        int size2 = this.f269f.size();
        float f4 = bVar.f300e;
        int i8 = bVar.f297b;
        int i9 = i8 - 1;
        this.f290u = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = a - 1;
        this.f291v = bVar.f297b == i10 ? (bVar.f300e + bVar.f299d) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0103b bVar5 = (C0103b) this.f269f.get(i11);
            while (true) {
                i3 = bVar5.f297b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f275i.mo535a(i9) + f;
                i9--;
            }
            f4 -= bVar5.f299d + f;
            bVar5.f300e = f4;
            if (i3 == 0) {
                this.f290u = f4;
            }
            i11--;
            i9--;
        }
        float f5 = bVar.f300e + bVar.f299d + f;
        int i12 = bVar.f297b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0103b bVar6 = (C0103b) this.f269f.get(i13);
            while (true) {
                i2 = bVar6.f297b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f275i.mo535a(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f291v = (bVar6.f299d + f5) - 1.0f;
            }
            bVar6.f300e = f5;
            f5 += bVar6.f299d + f;
            i13++;
            i12++;
        }
        this.f261V = false;
    }

    /* renamed from: a */
    private void m323a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f251L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f247H = motionEvent.getX(i);
            this.f251L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f252M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m324a(boolean z) {
        boolean z2 = this.f280ka == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f283n.isFinished()) {
                this.f283n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f283n.getCurrX();
                int currY = this.f283n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m334f(currX);
                    }
                }
            }
        }
        this.f240A = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f269f.size(); i++) {
            C0103b bVar = (C0103b) this.f269f.get(i);
            if (bVar.f298c) {
                bVar.f298c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0156v.m548a((View) this, this.f278ja);
        } else {
            this.f278ja.run();
        }
    }

    /* renamed from: a */
    private boolean m325a(float f, float f2) {
        return (f < ((float) this.f245F) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f245F)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m326b(int i, float f, int i2) {
        C0107f fVar = this.f265ca;
        if (fVar != null) {
            fVar.mo381a(i, f, i2);
        }
        List<C0107f> list = this.f264ba;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0107f fVar2 = (C0107f) this.f264ba.get(i3);
                if (fVar2 != null) {
                    fVar2.mo381a(i, f, i2);
                }
            }
        }
        C0107f fVar3 = this.f266da;
        if (fVar3 != null) {
            fVar3.mo381a(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m327b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f272ga : 0, null);
        }
    }

    /* renamed from: b */
    private boolean m328b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f247H - f;
        this.f247H = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f290u * clientWidth;
        float f4 = this.f291v * clientWidth;
        boolean z3 = false;
        C0103b bVar = (C0103b) this.f269f.get(0);
        ArrayList<C0103b> arrayList = this.f269f;
        C0103b bVar2 = (C0103b) arrayList.get(arrayList.size() - 1);
        if (bVar.f297b != 0) {
            f3 = bVar.f300e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f297b != this.f275i.mo536a() - 1) {
            f4 = bVar2.f300e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f258S.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f259T.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f247H += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m334f(i);
        return z3;
    }

    /* renamed from: c */
    private void m329c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private static boolean m330c(View view) {
        return view.getClass().getAnnotation(C0102a.class) != null;
    }

    /* renamed from: d */
    private void mo6741d(int i) {
        C0107f fVar = this.f265ca;
        if (fVar != null) {
            fVar.mo382b(i);
        }
        List<C0107f> list = this.f264ba;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0107f fVar2 = (C0107f) this.f264ba.get(i2);
                if (fVar2 != null) {
                    fVar2.mo382b(i);
                }
            }
        }
        C0107f fVar3 = this.f266da;
        if (fVar3 != null) {
            fVar3.mo382b(i);
        }
    }

    /* renamed from: e */
    private void mo6742e(int i) {
        C0107f fVar = this.f265ca;
        if (fVar != null) {
            fVar.mo380a(i);
        }
        List<C0107f> list = this.f264ba;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0107f fVar2 = (C0107f) this.f264ba.get(i2);
                if (fVar2 != null) {
                    fVar2.mo380a(i);
                }
            }
        }
        C0107f fVar3 = this.f266da;
        if (fVar3 != null) {
            fVar3.mo380a(i);
        }
    }

    /* renamed from: f */
    private void m333f() {
        this.f242C = false;
        this.f243D = false;
        VelocityTracker velocityTracker = this.f252M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f252M = null;
        }
    }

    /* renamed from: f */
    private boolean m334f(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.f269f.size() != 0) {
            C0103b g = m335g();
            int clientWidth = getClientWidth();
            int i2 = this.f286q;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            float f2 = ((float) i2) / f;
            int i4 = g.f297b;
            float f3 = ((((float) i) / f) - g.f300e) / (g.f299d + f2);
            int i5 = (int) (((float) i3) * f3);
            this.f262W = false;
            mo322a(i4, f3, i5);
            if (this.f262W) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.f260U) {
            return false;
        } else {
            this.f262W = false;
            mo322a(0, 0.0f, 0);
            if (this.f262W) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    private C0103b m335g() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f286q) / ((float) clientWidth) : 0.0f;
        C0103b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.f269f.size()) {
            C0103b bVar2 = (C0103b) this.f269f.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f297b != i3) {
                    bVar2 = this.f271g;
                    bVar2.f300e = f2 + f3 + f;
                    bVar2.f297b = i3;
                    bVar2.f299d = this.f275i.mo535a(bVar2.f297b);
                    i--;
                }
            }
            f2 = bVar2.f300e;
            float f4 = bVar2.f299d + f2 + f;
            if (!z && scrollX < f2) {
                return bVar;
            }
            if (scrollX < f4 || i == this.f269f.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f297b;
            f3 = bVar2.f299d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m336h() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0104c) getChildAt(i).getLayoutParams()).f301a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: i */
    private boolean m337i() {
        this.f251L = -1;
        m333f();
        this.f258S.onRelease();
        this.f259T.onRelease();
        return this.f258S.isFinished() || this.f259T.isFinished();
    }

    /* renamed from: j */
    private void m338j() {
        if (this.f274ha != 0) {
            ArrayList<View> arrayList = this.f276ia;
            if (arrayList == null) {
                this.f276ia = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f276ia.add(getChildAt(i));
            }
            Collections.sort(this.f276ia, f239d);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f295z != z) {
            this.f295z = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo318a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0103b mo319a(int i, int i2) {
        C0103b bVar = new C0103b();
        bVar.f297b = i;
        bVar.f296a = this.f275i.mo538a((ViewGroup) this, i);
        bVar.f299d = this.f275i.mo535a(i);
        if (i2 < 0 || i2 >= this.f269f.size()) {
            this.f269f.add(bVar);
        } else {
            this.f269f.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0103b mo320a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo334b(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo321a() {
        int a = this.f275i.mo536a();
        this.f267e = a;
        boolean z = this.f269f.size() < (this.f241B * 2) + 1 && this.f269f.size() < a;
        int i = this.f277j;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f269f.size()) {
            C0103b bVar = (C0103b) this.f269f.get(i2);
            int a2 = this.f275i.mo537a(bVar.f296a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.f269f.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f275i.mo548b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f275i.mo544a((ViewGroup) this, bVar.f297b, bVar.f296a);
                    int i3 = this.f277j;
                    if (i3 == bVar.f297b) {
                        i = Math.max(0, Math.min(i3, a - 1));
                    }
                } else {
                    int i4 = bVar.f297b;
                    if (i4 != a2) {
                        if (i4 == this.f277j) {
                            i = a2;
                        }
                        bVar.f297b = a2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f275i.mo543a((ViewGroup) this);
        }
        Collections.sort(this.f269f, f237b);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0104c cVar = (C0104c) getChildAt(i5).getLayoutParams();
                if (!cVar.f301a) {
                    cVar.f303c = 0.0f;
                }
            }
            mo325a(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo322a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f263aa
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            a.b.c.g.C$c r9 = (p000a.p005b.p009c.p018g.C0101C.C0104c) r9
            boolean r10 = r9.f301a
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f302b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.m326b(r13, r14, r15)
            a.b.c.g.C$g r13 = r12.f270fa
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            a.b.c.g.C$c r0 = (p000a.p005b.p009c.p018g.C0101C.C0104c) r0
            boolean r0 = r0.f301a
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            a.b.c.g.C$g r3 = r12.f270fa
            r3.mo383a(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.f262W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p018g.C0101C.mo322a(int, float, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo323a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f283n;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f284o ? this.f283n.getCurrX() : this.f283n.getStartX();
            this.f283n.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i5 = i4;
        int scrollY = getScrollY();
        int i6 = i - i5;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m324a(false);
            mo346e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float a = f2 + (mo318a(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f * this.f275i.mo535a(this.f277j)) + ((float) this.f286q))) + 1.0f) * 100.0f), 600);
        this.f284o = false;
        this.f283n.startScroll(i5, scrollY, i6, i7, min);
        C0156v.m579t(this);
    }

    /* renamed from: a */
    public void mo324a(int i, boolean z) {
        this.f240A = false;
        mo325a(i, z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo325a(int i, boolean z, boolean z2) {
        mo326a(i, z, z2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo326a(int i, boolean z, boolean z2, int i2) {
        C0152r rVar = this.f275i;
        if (rVar == null || rVar.mo536a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f277j != i || this.f269f.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f275i.mo536a()) {
                i = this.f275i.mo536a() - 1;
            }
            int i3 = this.f241B;
            int i4 = this.f277j;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f269f.size(); i5++) {
                    ((C0103b) this.f269f.get(i5)).f298c = true;
                }
            }
            if (this.f277j == i) {
                z3 = false;
            }
            if (this.f260U) {
                this.f277j = i;
                if (z3) {
                    mo6741d(i);
                }
                requestLayout();
            } else {
                mo336c(i);
                m321a(i, z, i2, z3);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public boolean mo327a(int i) {
        boolean d;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    Log.e("ViewPager", sb2.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m319a(this.f273h, findNextFocus).left;
                int i3 = m319a(this.f273h, view).left;
                if (view != null && i2 >= i3) {
                    d = mo337c();
                    z2 = d;
                }
            } else if (i == 66) {
                int i4 = m319a(this.f273h, findNextFocus).left;
                int i5 = m319a(this.f273h, view).left;
                if (view != null && i4 <= i5) {
                    d = mo341d();
                    z2 = d;
                }
            }
            d = findNextFocus.requestFocus();
            z2 = d;
        } else if (i == 17 || i == 1) {
            z2 = mo337c();
        } else if (i == 66 || i == 2) {
            z2 = mo341d();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    /* renamed from: a */
    public boolean mo328a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo327a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo327a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo341d();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo337c();
            } else {
                i = 17;
            }
            return mo327a(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo329a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo329a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0103b b = mo334b(childAt);
                    if (b != null && b.f297b == this.f277j) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0103b b = mo334b(childAt);
                if (b != null && b.f297b == this.f277j) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0104c cVar = (C0104c) layoutParams;
        cVar.f301a |= m330c(view);
        if (!this.f294y) {
            super.addView(view, i, layoutParams);
        } else if (cVar == null || !cVar.f301a) {
            cVar.f304d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0103b mo333b(int i) {
        for (int i2 = 0; i2 < this.f269f.size(); i2++) {
            C0103b bVar = (C0103b) this.f269f.get(i2);
            if (bVar.f297b == i) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0103b mo334b(View view) {
        for (int i = 0; i < this.f269f.size(); i++) {
            C0103b bVar = (C0103b) this.f269f.get(i);
            if (this.f275i.mo545a(view, bVar.f296a)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo335b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f283n = new Scroller(context, f238c);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f246G = viewConfiguration.getScaledPagingTouchSlop();
        this.f253N = (int) (400.0f * f);
        this.f254O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f258S = new EdgeEffect(context);
        this.f259T = new EdgeEffect(context);
        this.f255P = (int) (25.0f * f);
        this.f256Q = (int) (2.0f * f);
        this.f244E = (int) (f * 16.0f);
        C0156v.m543a((View) this, (C0134d) new C0105d());
        if (C0156v.m563f(this) == 0) {
            C0156v.m560d(this, 1);
        }
        C0156v.m544a((View) this, (C0151q) new C0100B(this));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013f, code lost:
        if (r4 < r0.f269f.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015d, code lost:
        if (r4 < r0.f269f.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        if (r4 < r0.f269f.size()) goto L_0x0141;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo336c(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f277j
            if (r2 == r1) goto L_0x000f
            a.b.c.g.C$b r2 = r0.mo333b(r2)
            r0.f277j = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            a.b.c.g.r r1 = r0.f275i
            if (r1 != 0) goto L_0x0018
            r17.m338j()
            return
        L_0x0018:
            boolean r1 = r0.f240A
            if (r1 == 0) goto L_0x0020
            r17.m338j()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            a.b.c.g.r r1 = r0.f275i
            r1.mo548b(r0)
            int r1 = r0.f241B
            int r4 = r0.f277j
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            a.b.c.g.r r6 = r0.f275i
            int r6 = r6.mo536a()
            int r7 = r6 + -1
            int r8 = r0.f277j
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f267e
            if (r6 != r7) goto L_0x01f2
            r7 = 0
        L_0x004a:
            java.util.ArrayList<a.b.c.g.C$b> r8 = r0.f269f
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<a.b.c.g.C$b> r8 = r0.f269f
            java.lang.Object r8 = r8.get(r7)
            a.b.c.g.C$b r8 = (p000a.p005b.p009c.p018g.C0101C.C0103b) r8
            int r9 = r8.f297b
            int r10 = r0.f277j
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f277j
            a.b.c.g.C$b r8 = r0.mo319a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017f
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<a.b.c.g.C$b> r11 = r0.f269f
            java.lang.Object r11 = r11.get(r10)
            a.b.c.g.C$b r11 = (p000a.p005b.p009c.p018g.C0101C.C0103b) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r3 = 0
            goto L_0x0099
        L_0x008c:
            float r14 = r8.f299d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x0099:
            int r14 = r0.f277j
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x00a0:
            if (r14 < 0) goto L_0x00f0
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00c6
            if (r14 >= r4) goto L_0x00c6
            if (r11 != 0) goto L_0x00ab
            goto L_0x00f0
        L_0x00ab:
            int r5 = r11.f297b
            if (r14 != r5) goto L_0x00ec
            boolean r5 = r11.f298c
            if (r5 != 0) goto L_0x00ec
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            r5.remove(r15)
            a.b.c.g.r r5 = r0.f275i
            java.lang.Object r11 = r11.f296a
            r5.mo544a(r0, r14, r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00ea
            goto L_0x00e1
        L_0x00c6:
            if (r11 == 0) goto L_0x00d4
            int r5 = r11.f297b
            if (r14 != r5) goto L_0x00d4
            float r5 = r11.f299d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00ea
            goto L_0x00e1
        L_0x00d4:
            int r5 = r15 + 1
            a.b.c.g.C$b r5 = r0.mo319a(r14, r5)
            float r5 = r5.f299d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00ea
        L_0x00e1:
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            java.lang.Object r5 = r5.get(r15)
            a.b.c.g.C$b r5 = (p000a.p005b.p009c.p018g.C0101C.C0103b) r5
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            r11 = r5
        L_0x00ec:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a0
        L_0x00f0:
            float r3 = r8.f299d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0173
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0109
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            java.lang.Object r5 = r5.get(r4)
            a.b.c.g.C$b r5 = (p000a.p005b.p009c.p018g.C0101C.C0103b) r5
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r12 > 0) goto L_0x010e
            r7 = 0
            goto L_0x0116
        L_0x010e:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x0116:
            int r11 = r0.f277j
        L_0x0118:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0173
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x014c
            if (r11 <= r1) goto L_0x014c
            if (r5 != 0) goto L_0x0125
            goto L_0x0173
        L_0x0125:
            int r12 = r5.f297b
            if (r11 != r12) goto L_0x0172
            boolean r12 = r5.f298c
            if (r12 != 0) goto L_0x0172
            java.util.ArrayList<a.b.c.g.C$b> r12 = r0.f269f
            r12.remove(r4)
            a.b.c.g.r r12 = r0.f275i
            java.lang.Object r5 = r5.f296a
            r12.mo544a(r0, r11, r5)
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
        L_0x0141:
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            java.lang.Object r5 = r5.get(r4)
            a.b.c.g.C$b r5 = (p000a.p005b.p009c.p018g.C0101C.C0103b) r5
            goto L_0x0172
        L_0x014a:
            r5 = 0
            goto L_0x0172
        L_0x014c:
            if (r5 == 0) goto L_0x0160
            int r12 = r5.f297b
            if (r11 != r12) goto L_0x0160
            float r5 = r5.f299d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
            goto L_0x0141
        L_0x0160:
            a.b.c.g.C$b r5 = r0.mo319a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f299d
            float r3 = r3 + r5
            java.util.ArrayList<a.b.c.g.C$b> r5 = r0.f269f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
            goto L_0x0141
        L_0x0172:
            goto L_0x0118
        L_0x0173:
            r0.m322a(r8, r10, r2)
            a.b.c.g.r r1 = r0.f275i
            int r2 = r0.f277j
            java.lang.Object r3 = r8.f296a
            r1.mo549b(r0, r2, r3)
        L_0x017f:
            a.b.c.g.r r1 = r0.f275i
            r1.mo543a(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0189:
            if (r2 >= r1) goto L_0x01b2
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            a.b.c.g.C$c r4 = (p000a.p005b.p009c.p018g.C0101C.C0104c) r4
            r4.f306f = r2
            boolean r5 = r4.f301a
            if (r5 != 0) goto L_0x01af
            float r5 = r4.f303c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01af
            a.b.c.g.C$b r3 = r0.mo334b(r3)
            if (r3 == 0) goto L_0x01af
            float r5 = r3.f299d
            r4.f303c = r5
            int r3 = r3.f297b
            r4.f305e = r3
        L_0x01af:
            int r2 = r2 + 1
            goto L_0x0189
        L_0x01b2:
            r17.m338j()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01f1
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c6
            a.b.c.g.C$b r3 = r0.mo320a(r1)
            goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            if (r3 == 0) goto L_0x01cf
            int r1 = r3.f297b
            int r2 = r0.f277j
            if (r1 == r2) goto L_0x01f1
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x01f1
            android.view.View r2 = r0.getChildAt(r1)
            a.b.c.g.C$b r3 = r0.mo334b(r2)
            if (r3 == 0) goto L_0x01ee
            int r3 = r3.f297b
            int r4 = r0.f277j
            if (r3 != r4) goto L_0x01ee
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x01ee
            goto L_0x01f1
        L_0x01ee:
            int r1 = r1 + 1
            goto L_0x01d0
        L_0x01f1:
            return
        L_0x01f2:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01ff }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01ff }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01ff }
            goto L_0x0207
        L_0x01ff:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0207:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f267e
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            a.b.c.g.r r1 = r0.f275i
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p018g.C0101C.mo336c(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo337c() {
        int i = this.f277j;
        if (i <= 0) {
            return false;
        }
        mo324a(i - 1, true);
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.f275i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f290u))) {
                z = true;
            }
            return z;
        }
        if (i > 0 && scrollX < ((int) (((float) clientWidth) * this.f291v))) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0104c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f284o = true;
        if (this.f283n.isFinished() || !this.f283n.computeScrollOffset()) {
            m324a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f283n.getCurrX();
        int currY = this.f283n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m334f(currX)) {
                this.f283n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0156v.m579t(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo341d() {
        C0152r rVar = this.f275i;
        if (rVar == null || this.f277j >= rVar.mo536a() - 1) {
            return false;
        }
        mo324a(this.f277j + 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo328a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0103b b = mo334b(childAt);
                if (b != null && b.f297b == this.f277j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.mo536a() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 != r2) goto L_0x0018
            a.b.c.g.r r0 = r7.f275i
            if (r0 == 0) goto L_0x0018
            int r0 = r0.mo536a()
            if (r0 <= r2) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.widget.EdgeEffect r8 = r7.f258S
            r8.finish()
            android.widget.EdgeEffect r8 = r7.f259T
            r8.finish()
            goto L_0x00a9
        L_0x0024:
            android.widget.EdgeEffect r0 = r7.f258S
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0065
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r7.f290u
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f258S
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.f258S
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x0065:
            android.widget.EdgeEffect r0 = r7.f259T
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.f291v
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f259T
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.f259T
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            p000a.p005b.p009c.p018g.C0156v.m579t(r7)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p018g.C0101C.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f287r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo346e() {
        mo336c(this.f277j);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C0104c();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0104c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0152r getAdapter() {
        return this.f275i;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f274ha == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0104c) ((View) this.f276ia.get(i2)).getLayoutParams()).f306f;
    }

    public int getCurrentItem() {
        return this.f277j;
    }

    public int getOffscreenPageLimit() {
        return this.f241B;
    }

    public int getPageMargin() {
        return this.f286q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f260U = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f278ja);
        Scroller scroller = this.f283n;
        if (scroller != null && !scroller.isFinished()) {
            this.f283n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f286q > 0 && this.f287r != null && this.f269f.size() > 0 && this.f275i != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.f286q) / f3;
            int i = 0;
            C0103b bVar = (C0103b) this.f269f.get(0);
            float f5 = bVar.f300e;
            int size = this.f269f.size();
            int i2 = bVar.f297b;
            int i3 = ((C0103b) this.f269f.get(size - 1)).f297b;
            while (i2 < i3) {
                while (i2 > bVar.f297b && i < size) {
                    i++;
                    bVar = (C0103b) this.f269f.get(i);
                }
                if (i2 == bVar.f297b) {
                    float f6 = bVar.f300e;
                    float f7 = bVar.f299d;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float a = this.f275i.mo535a(i2);
                    f = (f5 + a) * f3;
                    f5 += a + f4;
                }
                if (((float) this.f286q) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.f287r.setBounds(Math.round(f), this.f288s, Math.round(((float) this.f286q) + f), this.f289t);
                    this.f287r.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m337i();
            return false;
        }
        if (action != 0) {
            if (this.f242C) {
                return true;
            }
            if (this.f243D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f249J = x;
            this.f247H = x;
            float y = motionEvent.getY();
            this.f250K = y;
            this.f248I = y;
            this.f251L = motionEvent2.getPointerId(0);
            this.f243D = false;
            this.f284o = true;
            this.f283n.computeScrollOffset();
            if (this.f280ka != 2 || Math.abs(this.f283n.getFinalX() - this.f283n.getCurrX()) <= this.f256Q) {
                m324a(false);
                this.f242C = false;
            } else {
                this.f283n.abortAnimation();
                this.f240A = false;
                mo346e();
                this.f242C = true;
                m329c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f251L;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f247H;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f250K);
                if (f != 0.0f && !m325a(this.f247H, f)) {
                    if (mo329a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f247H = x2;
                        this.f248I = y2;
                        this.f243D = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f246G) && abs * 0.5f > abs2) {
                    this.f242C = true;
                    m329c(true);
                    setScrollState(1);
                    this.f247H = f > 0.0f ? this.f249J + ((float) this.f246G) : this.f249J - ((float) this.f246G);
                    this.f248I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f246G)) {
                    this.f243D = true;
                }
                if (this.f242C && m328b(x2)) {
                    C0156v.m579t(this);
                }
            }
        } else if (action == 6) {
            m323a(motionEvent);
        }
        if (this.f252M == null) {
            this.f252M = VelocityTracker.obtain();
        }
        this.f252M.addMovement(motionEvent2);
        return this.f242C;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0104c cVar = (C0104c) childAt.getLayoutParams();
                if (cVar.f301a) {
                    int i14 = cVar.f302b;
                    int i15 = i14 & 7;
                    int i16 = i14 & C0172j.AppCompatTheme_windowActionBarOverlay;
                    if (i15 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i15 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i15 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i16 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i16 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i16 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i17 = i5 + scrollX;
                    childAt.layout(i17, i6, childAt.getMeasuredWidth() + i17, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i18 = (i7 - i12) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                C0104c cVar2 = (C0104c) childAt2.getLayoutParams();
                if (!cVar2.f301a) {
                    C0103b b = mo334b(childAt2);
                    if (b != null) {
                        float f = (float) i18;
                        int i20 = ((int) (b.f300e * f)) + i12;
                        if (cVar2.f304d) {
                            cVar2.f304d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * cVar2.f303c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i20, i11, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.f288s = i11;
        this.f289t = i8 - i9;
        this.f263aa = i10;
        if (this.f260U) {
            z2 = false;
            m321a(this.f277j, false, 0, false);
        } else {
            z2 = false;
        }
        this.f260U = z2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f244E
            int r15 = java.lang.Math.min(r15, r1)
            r13.f245F = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = r15
            r15 = r14
            r14 = 0
        L_0x0039:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r14 >= r1) goto L_0x00b4
            android.view.View r6 = r13.getChildAt(r14)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            a.b.c.g.C$c r3 = (p000a.p005b.p009c.p018g.C0101C.C0104c) r3
            if (r3 == 0) goto L_0x00b1
            boolean r7 = r3.f301a
            if (r7 == 0) goto L_0x00b1
            int r7 = r3.f302b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0067
            r9 = 80
            if (r7 != r9) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r7 = 0
            goto L_0x0068
        L_0x0067:
            r7 = 1
        L_0x0068:
            r9 = 3
            if (r8 == r9) goto L_0x0070
            r9 = 5
            if (r8 != r9) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0077
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x0077:
            if (r4 == 0) goto L_0x007c
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007e
        L_0x007c:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007e:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x008b
            if (r10 == r11) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r10 = r15
        L_0x0088:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008c
        L_0x008b:
            r10 = r15
        L_0x008c:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0095
            if (r3 == r11) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            r3 = r2
            goto L_0x0097
        L_0x0095:
            r3 = r2
            r5 = r9
        L_0x0097:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00aa
            int r3 = r6.getMeasuredHeight()
            int r2 = r2 - r3
            goto L_0x00b1
        L_0x00aa:
            if (r4 == 0) goto L_0x00b1
            int r3 = r6.getMeasuredWidth()
            int r15 = r15 - r3
        L_0x00b1:
            int r14 = r14 + 1
            goto L_0x0039
        L_0x00b4:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f292w = r14
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            r13.f293x = r14
            r13.f294y = r4
            r13.mo346e()
            r13.f294y = r0
            int r14 = r13.getChildCount()
        L_0x00cb:
            if (r0 >= r14) goto L_0x00f5
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00f2
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            a.b.c.g.C$c r2 = (p000a.p005b.p009c.p018g.C0101C.C0104c) r2
            if (r2 == 0) goto L_0x00e3
            boolean r4 = r2.f301a
            if (r4 != 0) goto L_0x00f2
        L_0x00e3:
            float r4 = (float) r15
            float r2 = r2.f303c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f293x
            r1.measure(r2, r4)
        L_0x00f2:
            int r0 = r0 + 1
            goto L_0x00cb
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p018g.C0101C.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C0103b b = mo334b(childAt);
                if (b != null && b.f297b == this.f277j && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0110i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0110i iVar = (C0110i) parcelable;
        super.onRestoreInstanceState(iVar.mo471a());
        C0152r rVar = this.f275i;
        if (rVar != null) {
            rVar.mo540a(iVar.f310b, iVar.f311c);
            mo325a(iVar.f309a, false, true);
        } else {
            this.f279k = iVar.f309a;
            this.f281l = iVar.f310b;
            this.f282m = iVar.f311c;
        }
    }

    public Parcelable onSaveInstanceState() {
        C0110i iVar = new C0110i(super.onSaveInstanceState());
        iVar.f309a = this.f277j;
        C0152r rVar = this.f275i;
        if (rVar != null) {
            iVar.f310b = rVar.mo550c();
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f286q;
            m320a(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f257R
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            a.b.c.g.r r0 = r7.f275i
            if (r0 == 0) goto L_0x0155
            int r0 = r0.mo536a()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.f252M
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f252M = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.f252M
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.m323a(r8)
            int r0 = r7.f251L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f247H = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f247H = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.f242C
            if (r8 == 0) goto L_0x014f
            int r8 = r7.f277j
            r7.m321a(r8, r1, r2, r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.f242C
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.f251L
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.f247H
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f248I
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f246G
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.f242C = r1
            r7.m329c(r1)
            float r4 = r7.f249J
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.f246G
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.f246G
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.f247H = r4
            r7.f248I = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.f242C
            if (r0 == 0) goto L_0x014f
            int r0 = r7.f251L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.m328b(r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.f242C
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.f252M
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f254O
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f251L
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f240A = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            a.b.c.g.C$b r4 = r7.m335g()
            int r5 = r7.f286q
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f297b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f300e
            float r3 = r3 - r2
            float r2 = r4.f299d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f251L
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f249J
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.m318a(r6, r3, r0, r8)
            r7.mo326a(r8, r1, r1, r0)
        L_0x012a:
            boolean r2 = r7.m337i()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.f283n
            r0.abortAnimation()
            r7.f240A = r2
            r7.mo346e()
            float r0 = r8.getX()
            r7.f249J = r0
            r7.f247H = r0
            float r0 = r8.getY()
            r7.f250K = r0
            r7.f248I = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.f251L = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            p000a.p005b.p009c.p018g.C0156v.m579t(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p018g.C0101C.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.f294y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0152r rVar) {
        C0152r rVar2 = this.f275i;
        if (rVar2 != null) {
            rVar2.mo539a((DataSetObserver) null);
            this.f275i.mo548b((ViewGroup) this);
            for (int i = 0; i < this.f269f.size(); i++) {
                C0103b bVar = (C0103b) this.f269f.get(i);
                this.f275i.mo544a((ViewGroup) this, bVar.f297b, bVar.f296a);
            }
            this.f275i.mo543a((ViewGroup) this);
            this.f269f.clear();
            m336h();
            this.f277j = 0;
            scrollTo(0, 0);
        }
        C0152r rVar3 = this.f275i;
        this.f275i = rVar;
        this.f267e = 0;
        if (this.f275i != null) {
            if (this.f285p == null) {
                this.f285p = new C0109h();
            }
            this.f275i.mo539a((DataSetObserver) this.f285p);
            this.f240A = false;
            boolean z = this.f260U;
            this.f260U = true;
            this.f267e = this.f275i.mo536a();
            if (this.f279k >= 0) {
                this.f275i.mo540a(this.f281l, this.f282m);
                mo325a(this.f279k, false, true);
                this.f279k = -1;
                this.f281l = null;
                this.f282m = null;
            } else if (!z) {
                mo346e();
            } else {
                requestLayout();
            }
        }
        List<C0106e> list = this.f268ea;
        if (list != null && !list.isEmpty()) {
            int size = this.f268ea.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0106e) this.f268ea.get(i2)).mo379a(this, rVar3, rVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f240A = false;
        mo325a(i, !this.f260U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.f241B) {
            this.f241B = i;
            mo346e();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0107f fVar) {
        this.f265ca = fVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f286q;
        this.f286q = i;
        int width = getWidth();
        m320a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0039a.m111c(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f287r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (this.f280ka != i) {
            this.f280ka = i;
            if (this.f270fa != null) {
                m327b(i != 0);
            }
            mo6742e(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f287r;
    }
}
