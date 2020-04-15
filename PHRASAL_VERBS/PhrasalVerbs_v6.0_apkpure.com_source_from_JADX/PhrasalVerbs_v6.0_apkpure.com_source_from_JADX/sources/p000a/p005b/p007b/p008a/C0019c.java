package p000a.p005b.p007b.p008a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: a.b.b.a.c */
class C0019c implements Callback {

    /* renamed from: a */
    final /* synthetic */ C0020d f34a;

    C0019c(C0020d dVar) {
        this.f34a = dVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.f34a.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f34a.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f34a.unscheduleSelf(runnable);
    }
}
