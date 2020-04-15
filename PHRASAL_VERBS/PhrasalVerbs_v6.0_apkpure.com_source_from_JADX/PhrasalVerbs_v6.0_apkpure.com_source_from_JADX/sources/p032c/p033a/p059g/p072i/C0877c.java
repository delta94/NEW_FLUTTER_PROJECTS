package p032c.p033a.p059g.p072i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0715i.C0716a;
import p032c.p033a.p059g.p071h.C0870a;
import p032c.p033a.p059g.p071h.C0871b;
import p032c.p033a.p059g.p072i.C0874a.C0875a;

/* renamed from: c.a.g.i.c */
public class C0877c<DH extends C0871b> extends ImageView {

    /* renamed from: a */
    private static boolean f3095a = false;

    /* renamed from: b */
    private final C0875a f3096b = new C0875a();

    /* renamed from: c */
    private float f3097c = 0.0f;

    /* renamed from: d */
    private C0876b<DH> f3098d;

    /* renamed from: e */
    private boolean f3099e = false;

    /* renamed from: f */
    private boolean f3100f = false;

    public C0877c(Context context) {
        super(context);
        m3926a(context);
    }

    /* renamed from: a */
    private void m3926a(Context context) {
        if (!this.f3099e) {
            boolean z = true;
            this.f3099e = true;
            this.f3098d = C0876b.m3910a(null, context);
            if (VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                } else {
                    return;
                }
            }
            if (!f3095a || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.f3100f = z;
        }
    }

    /* renamed from: e */
    private void m3927e() {
        if (this.f3100f) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setVisible(getVisibility() == 0, false);
            }
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f3095a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3913a() {
        this.f3098d.mo3910d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3914b() {
        this.f3098d.mo3911e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3915c() {
        mo3913a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3916d() {
        mo3914b();
    }

    public float getAspectRatio() {
        return this.f3097c;
    }

    public C0870a getController() {
        return this.f3098d.mo3903a();
    }

    public DH getHierarchy() {
        return this.f3098d.mo3908b();
    }

    public Drawable getTopLevelDrawable() {
        return this.f3098d.mo3909c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3927e();
        mo3915c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3927e();
        mo3916d();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m3927e();
        mo3915c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0875a aVar = this.f3096b;
        aVar.f3087a = i;
        aVar.f3088b = i2;
        C0874a.m3908a(aVar, this.f3097c, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C0875a aVar2 = this.f3096b;
        super.onMeasure(aVar2.f3087a, aVar2.f3088b);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m3927e();
        mo3916d();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3098d.mo3907a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m3927e();
    }

    public void setAspectRatio(float f) {
        if (f != this.f3097c) {
            this.f3097c = f;
            requestLayout();
        }
    }

    public void setController(C0870a aVar) {
        this.f3098d.mo3905a(aVar);
        super.setImageDrawable(this.f3098d.mo3909c());
    }

    public void setHierarchy(DH dh) {
        this.f3098d.mo3906a(dh);
        super.setImageDrawable(this.f3098d.mo3909c());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        m3926a(getContext());
        this.f3098d.mo3905a((C0870a) null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        m3926a(getContext());
        this.f3098d.mo3905a((C0870a) null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        m3926a(getContext());
        this.f3098d.mo3905a((C0870a) null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        m3926a(getContext());
        this.f3098d.mo3905a((C0870a) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f3100f = z;
    }

    public String toString() {
        C0716a a = C0715i.m3230a((Object) this);
        C0876b<DH> bVar = this.f3098d;
        a.mo3471a("holder", (Object) bVar != null ? bVar.toString() : "<no holder set>");
        return a.toString();
    }
}
