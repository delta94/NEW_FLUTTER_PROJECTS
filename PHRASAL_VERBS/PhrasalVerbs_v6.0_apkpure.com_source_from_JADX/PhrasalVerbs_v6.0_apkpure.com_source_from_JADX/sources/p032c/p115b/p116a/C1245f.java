package p032c.p115b.p116a;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: c.b.a.f */
public class C1245f {

    /* renamed from: a */
    private static final PointF f4039a = new PointF();

    /* renamed from: b */
    private static final float[] f4040b = new float[2];

    /* renamed from: c */
    private static final Matrix f4041c = new Matrix();

    /* renamed from: d */
    private static final float[] f4042d = new float[2];

    /* renamed from: e */
    private static final Comparator<C1242c> f4043e = new C1244e();

    /* renamed from: f */
    private final ViewGroup f4044f;

    /* renamed from: g */
    private final C1246g f4045g;

    /* renamed from: h */
    private final C1262v f4046h;

    /* renamed from: i */
    private final C1242c[] f4047i = new C1242c[20];

    /* renamed from: j */
    private final C1242c[] f4048j = new C1242c[20];

    /* renamed from: k */
    private final C1242c[] f4049k = new C1242c[20];

    /* renamed from: l */
    private final C1242c[] f4050l = new C1242c[20];

    /* renamed from: m */
    private int f4051m = 0;

    /* renamed from: n */
    private int f4052n = 0;

    /* renamed from: o */
    private boolean f4053o = false;

    /* renamed from: p */
    private int f4054p = 0;

    /* renamed from: q */
    private boolean f4055q = false;

    /* renamed from: r */
    private int f4056r = 0;

    /* renamed from: s */
    private float f4057s = 0.0f;

    public C1245f(ViewGroup viewGroup, C1246g gVar, C1262v vVar) {
        this.f4044f = viewGroup;
        this.f4045g = gVar;
        this.f4046h = vVar;
    }

    /* renamed from: a */
    private void m5327a() {
        for (int i = this.f4052n - 1; i >= 0; i--) {
            this.f4048j[i].mo4628c();
        }
        int i2 = this.f4051m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4049k[i3] = this.f4047i[i3];
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            this.f4049k[i4].mo4628c();
        }
    }

    /* renamed from: a */
    private static void m5328a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f4040b;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f4041c;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f3 = fArr[0];
            scrollY = fArr[1];
            scrollX = f3;
        }
        pointF.set(scrollX, scrollY);
    }

    /* renamed from: a */
    private void m5329a(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.f4044f) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            m5329a((View) viewGroup, motionEvent, fArr);
            PointF pointF = f4039a;
            m5328a(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    /* renamed from: a */
    private void m5330a(C1242c cVar) {
        int i = 0;
        while (true) {
            int i2 = this.f4052n;
            if (i >= i2) {
                C1242c[] cVarArr = this.f4048j;
                if (i2 < cVarArr.length) {
                    this.f4052n = i2 + 1;
                    cVarArr[i2] = cVar;
                    cVar.f4038y = true;
                    int i3 = this.f4056r;
                    this.f4056r = i3 + 1;
                    cVar.f4036w = i3;
                    return;
                }
                throw new IllegalStateException("Too many recognizers");
            } else if (this.f4048j[i] != cVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m5331a(C1242c cVar, MotionEvent motionEvent) {
        if (!m5348c(cVar.mo4642m())) {
            cVar.mo4628c();
        } else if (cVar.mo4646s()) {
            int actionMasked = motionEvent.getActionMasked();
            if (!cVar.f4038y || actionMasked != 2) {
                float[] fArr = f4042d;
                m5329a(cVar.mo4642m(), motionEvent, fArr);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                motionEvent.setLocation(fArr[0], fArr[1]);
                cVar.mo4626b(motionEvent);
                if (cVar.f4037x) {
                    cVar.mo4618a(motionEvent);
                }
                motionEvent.setLocation(x, y);
                if (actionMasked == 1 || actionMasked == 6) {
                    cVar.mo4629c(motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
        }
    }

    /* renamed from: a */
    private void m5332a(C1242c cVar, View view) {
        int i = 0;
        while (true) {
            int i2 = this.f4051m;
            if (i >= i2) {
                C1242c[] cVarArr = this.f4047i;
                if (i2 < cVarArr.length) {
                    this.f4051m = i2 + 1;
                    cVarArr[i2] = cVar;
                    cVar.f4037x = false;
                    cVar.f4038y = false;
                    cVar.f4036w = Integer.MAX_VALUE;
                    cVar.mo4619a(view, this);
                    return;
                }
                throw new IllegalStateException("Too many recognizers");
            } else if (this.f4047i[i] != cVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static boolean m5333a(float f, float f2, View view) {
        return f >= 0.0f && f <= ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    /* renamed from: a */
    private static boolean m5334a(int i) {
        return i == 3 || i == 1 || i == 5;
    }

    /* renamed from: a */
    private boolean m5335a(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f4057s;
    }

    /* renamed from: a */
    private static boolean m5336a(View view, float[] fArr) {
        return (!(view instanceof ViewGroup) || view.getBackground() != null) && m5333a(fArr[0], fArr[1], view);
    }

    /* renamed from: a */
    private boolean m5337a(View view, float[] fArr, int i) {
        ArrayList a = this.f4045g.mo4658a(view);
        if (a == null) {
            return false;
        }
        int size = a.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1242c cVar = (C1242c) a.get(i2);
            if (cVar.mo4643n() && cVar.mo4620a(view, fArr[0], fArr[1])) {
                m5332a(cVar, view);
                cVar.mo4624b(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m5338a(ViewGroup viewGroup, float[] fArr, int i) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View a = this.f4046h.mo4704a(viewGroup, childCount);
            if (m5335a(a)) {
                PointF pointF = f4039a;
                m5328a(fArr[0], fArr[1], viewGroup, a, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean b = (!m5341b(a) || m5333a(fArr[0], fArr[1], a)) ? m5342b(a, fArr, i) : false;
                fArr[0] = f;
                fArr[1] = f2;
                if (b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5339a(C1242c cVar, C1242c cVar2) {
        return cVar == cVar2 || cVar.mo4630c(cVar2) || cVar2.mo4630c(cVar);
    }

    /* renamed from: b */
    private void m5340b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f4052n; i2++) {
            C1242c[] cVarArr = this.f4048j;
            if (cVarArr[i2].f4038y) {
                int i3 = i + 1;
                cVarArr[i] = cVarArr[i2];
                i = i3;
            }
        }
        this.f4052n = i;
    }

    /* renamed from: b */
    private boolean m5341b(View view) {
        return !(view instanceof ViewGroup) || this.f4046h.mo4706a((ViewGroup) view);
    }

    /* renamed from: b */
    private boolean m5342b(View view, float[] fArr, int i) {
        C1255p a = this.f4046h.mo4705a(view);
        boolean z = false;
        if (a == C1255p.NONE) {
            return false;
        }
        if (a == C1255p.BOX_ONLY) {
            if (m5337a(view, fArr, i) || m5336a(view, fArr)) {
                z = true;
            }
            return z;
        } else if (a == C1255p.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return m5338a((ViewGroup) view, fArr, i);
            }
            return false;
        } else if (a == C1255p.AUTO) {
            boolean a2 = view instanceof ViewGroup ? m5338a((ViewGroup) view, fArr, i) : false;
            if (m5337a(view, fArr, i) || a2 || m5336a(view, fArr)) {
                z = true;
            }
            return z;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown pointer event type: ");
            sb.append(a.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private boolean m5343b(C1242c cVar) {
        for (int i = 0; i < this.f4051m; i++) {
            C1242c cVar2 = this.f4047i[i];
            if (!m5334a(cVar2.mo4640k()) && m5349c(cVar, cVar2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m5344b(C1242c cVar, C1242c cVar2) {
        if (!cVar.mo4621a(cVar2) || m5339a(cVar, cVar2)) {
            return false;
        }
        if (cVar == cVar2 || (!cVar.f4038y && cVar.mo4640k() != 4)) {
            return true;
        }
        return cVar.mo4627b(cVar2);
    }

    /* renamed from: c */
    private void m5345c() {
        boolean z = false;
        for (int i = this.f4051m - 1; i >= 0; i--) {
            C1242c cVar = this.f4047i[i];
            if (m5334a(cVar.mo4640k()) && !cVar.f4038y) {
                this.f4047i[i] = null;
                cVar.mo4645r();
                cVar.f4037x = false;
                cVar.f4038y = false;
                cVar.f4036w = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f4051m; i3++) {
                C1242c[] cVarArr = this.f4047i;
                if (cVarArr[i3] != null) {
                    int i4 = i2 + 1;
                    cVarArr[i2] = cVarArr[i3];
                    i2 = i4;
                }
            }
            this.f4051m = i2;
        }
        this.f4055q = false;
    }

    /* renamed from: c */
    private void m5346c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        f4042d[0] = motionEvent.getX(actionIndex);
        f4042d[1] = motionEvent.getY(actionIndex);
        m5342b(this.f4044f, f4042d, pointerId);
        m5338a(this.f4044f, f4042d, pointerId);
    }

    /* renamed from: c */
    private void m5347c(C1242c cVar) {
        int k = cVar.mo4640k();
        cVar.f4038y = false;
        cVar.f4037x = true;
        int i = this.f4056r;
        this.f4056r = i + 1;
        cVar.f4036w = i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4051m; i3++) {
            C1242c cVar2 = this.f4047i[i3];
            if (m5344b(cVar2, cVar)) {
                int i4 = i2 + 1;
                this.f4050l[i2] = cVar2;
                i2 = i4;
            }
        }
        for (int i5 = i2 - 1; i5 >= 0; i5--) {
            this.f4050l[i5].mo4628c();
        }
        for (int i6 = this.f4052n - 1; i6 >= 0; i6--) {
            C1242c cVar3 = this.f4048j[i6];
            if (m5344b(cVar3, cVar)) {
                cVar3.mo4628c();
                cVar3.f4038y = false;
            }
        }
        m5340b();
        cVar.mo4617a(4, 2);
        if (k != 4) {
            cVar.mo4617a(5, 4);
            if (k != 5) {
                cVar.mo4617a(0, 5);
            }
        }
    }

    /* renamed from: c */
    private boolean m5348c(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (view == this.f4044f) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f4044f) {
            parent = parent.getParent();
        }
        if (parent == this.f4044f) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    private static boolean m5349c(C1242c cVar, C1242c cVar2) {
        return cVar != cVar2 && (cVar.mo4634e(cVar2) || cVar2.mo4632d(cVar));
    }

    /* renamed from: d */
    private void m5350d() {
        if (this.f4053o || this.f4054p != 0) {
            this.f4055q = true;
        } else {
            m5345c();
        }
    }

    /* renamed from: d */
    private void m5351d(C1242c cVar) {
        if (m5343b(cVar)) {
            m5330a(cVar);
            return;
        }
        m5347c(cVar);
        cVar.f4038y = false;
    }

    /* renamed from: a */
    public void mo4654a(float f) {
        this.f4057s = f;
    }

    /* renamed from: a */
    public void mo4655a(MotionEvent motionEvent) {
        int i = this.f4051m;
        System.arraycopy(this.f4047i, 0, this.f4049k, 0, i);
        Arrays.sort(this.f4049k, 0, i, f4043e);
        for (int i2 = 0; i2 < i; i2++) {
            m5331a(this.f4049k[i2], motionEvent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4656a(C1242c cVar, int i, int i2) {
        this.f4054p++;
        if (m5334a(i)) {
            for (int i3 = 0; i3 < this.f4052n; i3++) {
                C1242c cVar2 = this.f4048j[i3];
                if (m5349c(cVar2, cVar)) {
                    if (i == 5) {
                        cVar2.mo4628c();
                        cVar2.f4038y = false;
                    } else {
                        m5351d(cVar2);
                    }
                }
            }
            m5340b();
        }
        if (i == 4) {
            m5351d(cVar);
        } else if (!(i2 == 4 || i2 == 5) || cVar.f4037x) {
            cVar.mo4617a(i, i2);
        }
        this.f4054p--;
        m5350d();
    }

    /* renamed from: b */
    public boolean mo4657b(MotionEvent motionEvent) {
        this.f4053o = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            m5346c(motionEvent);
        } else if (actionMasked == 3) {
            m5327a();
        }
        mo4655a(motionEvent);
        this.f4053o = false;
        if (this.f4055q && this.f4054p == 0) {
            m5345c();
        }
        return true;
    }
}
