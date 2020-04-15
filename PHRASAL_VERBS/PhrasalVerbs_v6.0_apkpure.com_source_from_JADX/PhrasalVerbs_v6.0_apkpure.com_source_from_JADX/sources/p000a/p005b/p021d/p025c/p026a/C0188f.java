package p000a.p005b.p021d.p025c.p026a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

/* renamed from: a.b.d.c.a.f */
class C0188f extends C0184d {

    /* renamed from: n */
    private C0189a f476n;

    /* renamed from: o */
    private boolean f477o;

    /* renamed from: a.b.d.c.a.f$a */
    static class C0189a extends C0186b {

        /* renamed from: J */
        int[][] f478J;

        C0189a(C0189a aVar, C0188f fVar, Resources resources) {
            super(aVar, fVar, resources);
            this.f478J = aVar != null ? aVar.f478J : new int[mo638c()][];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo686a(int[] iArr) {
            int[][] iArr2 = this.f478J;
            int d = mo641d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo687a(int[] iArr, Drawable drawable) {
            int a = mo627a(drawable);
            this.f478J[a] = iArr;
            return a;
        }

        /* renamed from: a */
        public void mo629a(int i, int i2) {
            super.mo629a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f478J, 0, iArr, 0, i);
            this.f478J = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo606m() {
            int[][] iArr = this.f478J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f478J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f478J = iArr2;
        }

        public Drawable newDrawable() {
            return new C0188f(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0188f(this, resources);
        }
    }

    C0188f(C0189a aVar) {
        if (aVar != null) {
            mo563a((C0186b) aVar);
        }
    }

    C0188f(C0189a aVar, Resources resources) {
        mo563a((C0186b) new C0189a(aVar, this, resources));
        onStateChange(getState());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0189a m675a() {
        return new C0189a(this.f476n, this, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo563a(C0186b bVar) {
        super.mo563a(bVar);
        if (bVar instanceof C0189a) {
            this.f476n = (C0189a) bVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo685a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f477o) {
            super.mutate();
            if (this == this) {
                this.f476n.mo606m();
                this.f477o = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f476n.mo686a(iArr);
        if (a < 0) {
            a = this.f476n.mo686a(StateSet.WILD_CARD);
        }
        return mo617a(a) || onStateChange;
    }
}
