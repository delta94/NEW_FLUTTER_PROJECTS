package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p005b.p021d.p022a.C0163a;

/* renamed from: android.support.v7.widget.z */
public class C0627z extends SeekBar {

    /* renamed from: a */
    private final C0492A f2408a;

    public C0627z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.seekBarStyle);
    }

    public C0627z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2408a = new C0492A(this);
        this.f2408a.mo2408a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2408a.mo2409b();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2408a.mo2410c();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2408a.mo2406a(canvas);
    }
}
