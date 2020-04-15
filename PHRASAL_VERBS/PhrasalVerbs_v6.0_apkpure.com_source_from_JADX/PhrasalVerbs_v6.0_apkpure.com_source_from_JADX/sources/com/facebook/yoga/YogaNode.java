package com.facebook.yoga;

import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class YogaNode implements Cloneable {

    /* renamed from: a */
    private YogaNode f5804a;

    /* renamed from: b */
    private List<YogaNode> f5805b;

    /* renamed from: c */
    private YogaMeasureFunction f5806c;

    /* renamed from: d */
    private YogaBaselineFunction f5807d;

    /* renamed from: e */
    private long f5808e;

    /* renamed from: f */
    private Object f5809f;

    /* renamed from: g */
    private boolean f5810g;
    @C1137a
    private float mBorderBottom;
    @C1137a
    private float mBorderLeft;
    @C1137a
    private float mBorderRight;
    @C1137a
    private float mBorderTop;
    @C1137a
    private boolean mDoesLegacyStretchFlagAffectsLayout;
    @C1137a
    private int mEdgeSetFlag;
    @C1137a
    private boolean mHasNewLayout;
    @C1137a
    private float mHeight;
    @C1137a
    private int mLayoutDirection;
    @C1137a
    private float mLeft;
    @C1137a
    private float mMarginBottom;
    @C1137a
    private float mMarginLeft;
    @C1137a
    private float mMarginRight;
    @C1137a
    private float mMarginTop;
    @C1137a
    private float mPaddingBottom;
    @C1137a
    private float mPaddingLeft;
    @C1137a
    private float mPaddingRight;
    @C1137a
    private float mPaddingTop;
    @C1137a
    private float mTop;
    @C1137a
    private float mWidth;

    static {
        SoLoader.m7253a("yoga");
    }

    public YogaNode() {
        this.mEdgeSetFlag = 0;
        this.f5810g = false;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        this.f5808e = jni_YGNodeNew();
        if (this.f5808e == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public YogaNode(YogaConfig yogaConfig) {
        this.mEdgeSetFlag = 0;
        this.f5810g = false;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        this.f5808e = jni_YGNodeNewWithConfig(yogaConfig.f5748a);
        if (this.f5808e == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    private static native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    private static native void jni_YGNodeClearChildren(long j);

    private native long jni_YGNodeClone(long j, Object obj);

    private static native void jni_YGNodeCopyStyle(long j, long j2);

    private static native void jni_YGNodeFree(long j);

    static native int jni_YGNodeGetInstanceCount();

    private static native void jni_YGNodeInsertChild(long j, long j2, int i);

    private static native boolean jni_YGNodeIsDirty(long j);

    private static native boolean jni_YGNodeIsReferenceBaseline(long j);

    private static native void jni_YGNodeMarkDirty(long j);

    private static native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    private static native void jni_YGNodePrint(long j);

    private static native void jni_YGNodeRemoveChild(long j, long j2);

    private static native void jni_YGNodeReset(long j);

    private static native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    private static native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    private static native void jni_YGNodeSetIsReferenceBaseline(long j, boolean z);

    private static native void jni_YGNodeSetOwner(long j, long j2);

    private static native int jni_YGNodeStyleGetAlignContent(long j);

    private static native int jni_YGNodeStyleGetAlignItems(long j);

    private static native int jni_YGNodeStyleGetAlignSelf(long j);

    private static native float jni_YGNodeStyleGetAspectRatio(long j);

    private static native float jni_YGNodeStyleGetBorder(long j, int i);

    private static native int jni_YGNodeStyleGetDirection(long j);

    private static native int jni_YGNodeStyleGetDisplay(long j);

    private static native Object jni_YGNodeStyleGetFlexBasis(long j);

    private static native int jni_YGNodeStyleGetFlexDirection(long j);

    private static native float jni_YGNodeStyleGetFlexGrow(long j);

    private static native float jni_YGNodeStyleGetFlexShrink(long j);

    private static native Object jni_YGNodeStyleGetHeight(long j);

    private static native int jni_YGNodeStyleGetJustifyContent(long j);

    private static native Object jni_YGNodeStyleGetMargin(long j, int i);

    private static native Object jni_YGNodeStyleGetMaxHeight(long j);

    private static native Object jni_YGNodeStyleGetMaxWidth(long j);

    private static native Object jni_YGNodeStyleGetMinHeight(long j);

    private static native Object jni_YGNodeStyleGetMinWidth(long j);

    private static native int jni_YGNodeStyleGetOverflow(long j);

    private static native Object jni_YGNodeStyleGetPadding(long j, int i);

    private static native Object jni_YGNodeStyleGetPosition(long j, int i);

    private static native int jni_YGNodeStyleGetPositionType(long j);

    private static native Object jni_YGNodeStyleGetWidth(long j);

    private static native void jni_YGNodeStyleSetAlignContent(long j, int i);

    private static native void jni_YGNodeStyleSetAlignItems(long j, int i);

    private static native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    private static native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    private static native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    private static native void jni_YGNodeStyleSetDirection(long j, int i);

    private static native void jni_YGNodeStyleSetDisplay(long j, int i);

    private static native void jni_YGNodeStyleSetFlex(long j, float f);

    private static native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    private static native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    private static native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    private static native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    private static native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    private static native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    private static native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    private static native void jni_YGNodeStyleSetHeight(long j, float f);

    private static native void jni_YGNodeStyleSetHeightAuto(long j);

    private static native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    private static native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    private static native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    private static native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    private static native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    private static native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    private static native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    private static native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    private static native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    private static native void jni_YGNodeStyleSetMinHeight(long j, float f);

    private static native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    private static native void jni_YGNodeStyleSetMinWidth(long j, float f);

    private static native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    private static native void jni_YGNodeStyleSetOverflow(long j, int i);

    private static native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPositionType(long j, int i);

    private static native void jni_YGNodeStyleSetWidth(long j, float f);

    private static native void jni_YGNodeStyleSetWidthAuto(long j);

    private static native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    @C1137a
    private final long replaceChild(YogaNode yogaNode, int i) {
        List<YogaNode> list = this.f5805b;
        if (list != null) {
            list.remove(i);
            this.f5805b.add(i, yogaNode);
            yogaNode.f5804a = this;
            return yogaNode.f5808e;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    /* renamed from: a */
    public float mo6835a(YogaEdge yogaEdge) {
        switch (C1945c.f5845a[yogaEdge.ordinal()]) {
            case 1:
                return this.mPaddingLeft;
            case 2:
                return this.mPaddingTop;
            case 3:
                return this.mPaddingRight;
            case 4:
                return this.mPaddingBottom;
            case 5:
                return mo6858c() == YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
            case 6:
                return mo6858c() == YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    /* renamed from: a */
    public YogaNode mo6836a(int i) {
        List<YogaNode> list = this.f5805b;
        if (list != null) {
            YogaNode yogaNode = (YogaNode) list.remove(i);
            yogaNode.f5804a = null;
            jni_YGNodeRemoveChild(this.f5808e, yogaNode.f5808e);
            return yogaNode;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    /* renamed from: a */
    public void mo6837a() {
        jni_YGNodeMarkDirty(this.f5808e);
    }

    /* renamed from: a */
    public void mo6838a(float f) {
        jni_YGNodeStyleSetAspectRatio(this.f5808e, f);
    }

    /* renamed from: a */
    public void mo6839a(float f, float f2) {
        jni_YGNodeCalculateLayout(this.f5808e, f, f2);
    }

    /* renamed from: a */
    public void mo6840a(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignContent(this.f5808e, yogaAlign.mo6824a());
    }

    /* renamed from: a */
    public void mo6841a(YogaDirection yogaDirection) {
        jni_YGNodeStyleSetDirection(this.f5808e, yogaDirection.mo6829a());
    }

    /* renamed from: a */
    public void mo6842a(YogaDisplay yogaDisplay) {
        jni_YGNodeStyleSetDisplay(this.f5808e, yogaDisplay.mo6830a());
    }

    /* renamed from: a */
    public void mo6843a(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 4;
        jni_YGNodeStyleSetBorder(this.f5808e, yogaEdge.mo6831a(), f);
    }

    /* renamed from: a */
    public void mo6844a(YogaFlexDirection yogaFlexDirection) {
        jni_YGNodeStyleSetFlexDirection(this.f5808e, yogaFlexDirection.mo6832a());
    }

    /* renamed from: a */
    public void mo6845a(YogaJustify yogaJustify) {
        jni_YGNodeStyleSetJustifyContent(this.f5808e, yogaJustify.mo6833a());
    }

    /* renamed from: a */
    public void mo6846a(YogaMeasureFunction yogaMeasureFunction) {
        this.f5806c = yogaMeasureFunction;
        jni_YGNodeSetHasMeasureFunc(this.f5808e, yogaMeasureFunction != null);
    }

    /* renamed from: a */
    public void mo6847a(YogaNode yogaNode, int i) {
        if (yogaNode.f5804a == null) {
            if (this.f5805b == null) {
                this.f5805b = new ArrayList(4);
            }
            this.f5805b.add(i, yogaNode);
            yogaNode.f5804a = this;
            jni_YGNodeInsertChild(this.f5808e, yogaNode.f5808e, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    /* renamed from: a */
    public void mo6848a(YogaOverflow yogaOverflow) {
        jni_YGNodeStyleSetOverflow(this.f5808e, yogaOverflow.mo6897a());
    }

    /* renamed from: a */
    public void mo6849a(YogaPositionType yogaPositionType) {
        jni_YGNodeStyleSetPositionType(this.f5808e, yogaPositionType.mo6898a());
    }

    /* renamed from: a */
    public void mo6850a(YogaWrap yogaWrap) {
        jni_YGNodeStyleSetFlexWrap(this.f5808e, yogaWrap.mo6903a());
    }

    /* renamed from: a */
    public void mo6851a(Object obj) {
        this.f5809f = obj;
    }

    /* renamed from: b */
    public void mo6852b() {
        long j = this.f5808e;
        if (j > 0) {
            this.f5808e = 0;
            jni_YGNodeFree(j);
        }
    }

    /* renamed from: b */
    public void mo6853b(float f) {
        jni_YGNodeStyleSetFlex(this.f5808e, f);
    }

    /* renamed from: b */
    public void mo6854b(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignItems(this.f5808e, yogaAlign.mo6824a());
    }

    /* renamed from: b */
    public void mo6855b(YogaEdge yogaEdge) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginAuto(this.f5808e, yogaEdge.mo6831a());
    }

    /* renamed from: b */
    public void mo6856b(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMargin(this.f5808e, yogaEdge.mo6831a(), f);
    }

    @C1137a
    public final float baseline(float f, float f2) {
        return this.f5807d.baseline(this, f, f2);
    }

    /* renamed from: c */
    public YogaDirection mo6858c() {
        return YogaDirection.m7362a(this.mLayoutDirection);
    }

    /* renamed from: c */
    public void mo6859c(float f) {
        jni_YGNodeStyleSetFlexBasis(this.f5808e, f);
    }

    /* renamed from: c */
    public void mo6860c(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignSelf(this.f5808e, yogaAlign.mo6824a());
    }

    /* renamed from: c */
    public void mo6861c(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginPercent(this.f5808e, yogaEdge.mo6831a(), f);
    }

    public YogaNode clone() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            long jni_YGNodeClone = jni_YGNodeClone(this.f5808e, yogaNode);
            if (this.f5805b != null) {
                for (YogaNode yogaNode2 : this.f5805b) {
                    jni_YGNodeSetOwner(yogaNode2.f5808e, 0);
                    yogaNode2.f5804a = null;
                }
            }
            yogaNode.f5808e = jni_YGNodeClone;
            yogaNode.f5804a = null;
            yogaNode.f5805b = this.f5805b != null ? (List) ((ArrayList) this.f5805b).clone() : null;
            if (yogaNode.f5805b != null) {
                for (YogaNode yogaNode3 : yogaNode.f5805b) {
                    yogaNode3.f5804a = null;
                }
            }
            return yogaNode;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public float mo6863d() {
        return this.mHeight;
    }

    /* renamed from: d */
    public void mo6864d(float f) {
        jni_YGNodeStyleSetFlexBasisPercent(this.f5808e, f);
    }

    /* renamed from: d */
    public void mo6865d(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPadding(this.f5808e, yogaEdge.mo6831a(), f);
    }

    /* renamed from: e */
    public float mo6866e() {
        return this.mWidth;
    }

    /* renamed from: e */
    public void mo6867e(float f) {
        jni_YGNodeStyleSetFlexGrow(this.f5808e, f);
    }

    /* renamed from: e */
    public void mo6868e(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPaddingPercent(this.f5808e, yogaEdge.mo6831a(), f);
    }

    /* renamed from: f */
    public float mo6869f() {
        return this.mLeft;
    }

    /* renamed from: f */
    public void mo6870f(float f) {
        jni_YGNodeStyleSetFlexShrink(this.f5808e, f);
    }

    /* renamed from: f */
    public void mo6871f(YogaEdge yogaEdge, float f) {
        this.f5810g = true;
        jni_YGNodeStyleSetPosition(this.f5808e, yogaEdge.mo6831a(), f);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            mo6852b();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public float mo6873g() {
        return this.mTop;
    }

    /* renamed from: g */
    public void mo6874g(float f) {
        jni_YGNodeStyleSetHeight(this.f5808e, f);
    }

    /* renamed from: g */
    public void mo6875g(YogaEdge yogaEdge, float f) {
        this.f5810g = true;
        jni_YGNodeStyleSetPositionPercent(this.f5808e, yogaEdge.mo6831a(), f);
    }

    /* renamed from: h */
    public void mo6876h(float f) {
        jni_YGNodeStyleSetHeightPercent(this.f5808e, f);
    }

    /* renamed from: h */
    public boolean mo6877h() {
        return this.mHasNewLayout;
    }

    /* renamed from: i */
    public void mo6878i(float f) {
        jni_YGNodeStyleSetMaxHeight(this.f5808e, f);
    }

    /* renamed from: i */
    public boolean mo6879i() {
        return jni_YGNodeIsDirty(this.f5808e);
    }

    /* renamed from: j */
    public void mo6880j(float f) {
        jni_YGNodeStyleSetMaxHeightPercent(this.f5808e, f);
    }

    /* renamed from: j */
    public boolean mo6881j() {
        return this.f5806c != null;
    }

    /* renamed from: k */
    public void mo6882k() {
        this.mHasNewLayout = false;
    }

    /* renamed from: k */
    public void mo6883k(float f) {
        jni_YGNodeStyleSetMaxWidth(this.f5808e, f);
    }

    /* renamed from: l */
    public void mo6884l() {
        this.mEdgeSetFlag = 0;
        this.f5810g = false;
        this.mHasNewLayout = true;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.f5806c = null;
        this.f5807d = null;
        this.f5809f = null;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        jni_YGNodeReset(this.f5808e);
    }

    /* renamed from: l */
    public void mo6885l(float f) {
        jni_YGNodeStyleSetMaxWidthPercent(this.f5808e, f);
    }

    /* renamed from: m */
    public void mo6886m() {
        jni_YGNodeStyleSetFlexBasisAuto(this.f5808e);
    }

    /* renamed from: m */
    public void mo6887m(float f) {
        jni_YGNodeStyleSetMinHeight(this.f5808e, f);
    }

    @C1137a
    public final long measure(float f, int i, float f2, int i2) {
        if (mo6881j()) {
            return this.f5806c.measure(this, f, YogaMeasureMode.m7369a(i), f2, YogaMeasureMode.m7369a(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    /* renamed from: n */
    public void mo6889n() {
        jni_YGNodeStyleSetHeightAuto(this.f5808e);
    }

    /* renamed from: n */
    public void mo6890n(float f) {
        jni_YGNodeStyleSetMinHeightPercent(this.f5808e, f);
    }

    /* renamed from: o */
    public void mo6891o() {
        jni_YGNodeStyleSetWidthAuto(this.f5808e);
    }

    /* renamed from: o */
    public void mo6892o(float f) {
        jni_YGNodeStyleSetMinWidth(this.f5808e, f);
    }

    /* renamed from: p */
    public void mo6893p(float f) {
        jni_YGNodeStyleSetMinWidthPercent(this.f5808e, f);
    }

    /* renamed from: q */
    public void mo6894q(float f) {
        jni_YGNodeStyleSetWidth(this.f5808e, f);
    }

    /* renamed from: r */
    public void mo6895r(float f) {
        jni_YGNodeStyleSetWidthPercent(this.f5808e, f);
    }
}
