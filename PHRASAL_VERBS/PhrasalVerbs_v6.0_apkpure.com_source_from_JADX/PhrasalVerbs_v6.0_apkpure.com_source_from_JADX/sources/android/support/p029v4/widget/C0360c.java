package android.support.p029v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.widget.c */
class C0360c extends ImageView {

    /* renamed from: a */
    private AnimationListener f1141a;

    /* renamed from: b */
    int f1142b;

    /* renamed from: android.support.v4.widget.c$a */
    private class C0361a extends OvalShape {

        /* renamed from: a */
        private RadialGradient f1143a;

        /* renamed from: b */
        private Paint f1144b = new Paint();

        C0361a(int i) {
            C0360c.this.f1142b = i;
            m1640a((int) rect().width());
        }

        /* renamed from: a */
        private void m1640a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C0360c.this.f1142b, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f1143a = radialGradient;
            this.f1144b.setShader(this.f1143a);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C0360c.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C0360c.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f1144b);
            canvas.drawCircle(f, height, (float) (width - C0360c.this.f1142b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m1640a((int) f);
        }
    }

    C0360c(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f1142b = (int) (3.5f * f);
        if (m1638a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0156v.m540a((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0361a(this.f1142b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1142b, (float) i3, (float) i2, 503316480);
            int i4 = this.f1142b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0156v.m547a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m1638a() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void mo1640a(AnimationListener animationListener) {
        this.f1141a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.f1141a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.f1141a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m1638a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1142b * 2), getMeasuredHeight() + (this.f1142b * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
