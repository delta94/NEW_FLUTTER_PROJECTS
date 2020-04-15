package p032c.p033a.p059g.p065c;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.g.c.i */
public class C0821i<INFO> implements C0819g<INFO> {

    /* renamed from: a */
    private final List<C0819g<? super INFO>> f2883a = new ArrayList(2);

    /* renamed from: c */
    private synchronized void m3683c(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    /* renamed from: a */
    public synchronized void mo3718a() {
        this.f2883a.clear();
    }

    /* renamed from: a */
    public synchronized void mo3719a(C0819g<? super INFO> gVar) {
        this.f2883a.add(gVar);
    }

    /* renamed from: a */
    public synchronized void mo3584a(String str) {
        int size = this.f2883a.size();
        for (int i = 0; i < size; i++) {
            try {
                C0819g gVar = (C0819g) this.f2883a.get(i);
                if (gVar != null) {
                    gVar.mo3584a(str);
                }
            } catch (Exception e) {
                m3683c("InternalListener exception in onRelease", e);
            }
        }
    }

    /* renamed from: a */
    public void mo3587a(String str, INFO info) {
        int size = this.f2883a.size();
        for (int i = 0; i < size; i++) {
            try {
                C0819g gVar = (C0819g) this.f2883a.get(i);
                if (gVar != null) {
                    gVar.mo3587a(str, info);
                }
            } catch (Exception e) {
                m3683c("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo3588a(String str, INFO info, Animatable animatable) {
        int size = this.f2883a.size();
        for (int i = 0; i < size; i++) {
            try {
                C0819g gVar = (C0819g) this.f2883a.get(i);
                if (gVar != null) {
                    gVar.mo3588a(str, info, animatable);
                }
            } catch (Exception e) {
                m3683c("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo3589a(String str, Throwable th) {
        int size = this.f2883a.size();
        for (int i = 0; i < size; i++) {
            try {
                C0819g gVar = (C0819g) this.f2883a.get(i);
                if (gVar != null) {
                    gVar.mo3589a(str, th);
                }
            } catch (Exception e) {
                m3683c("InternalListener exception in onFailure", e);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo3720b(C0819g<? super INFO> gVar) {
        int indexOf = this.f2883a.indexOf(gVar);
        if (indexOf != -1) {
            this.f2883a.set(indexOf, null);
        }
    }

    /* renamed from: b */
    public synchronized void mo3590b(String str, Object obj) {
        int size = this.f2883a.size();
        for (int i = 0; i < size; i++) {
            try {
                C0819g gVar = (C0819g) this.f2883a.get(i);
                if (gVar != null) {
                    gVar.mo3590b(str, obj);
                }
            } catch (Exception e) {
                m3683c("InternalListener exception in onSubmit", e);
            }
        }
    }

    /* renamed from: b */
    public void mo3717b(String str, Throwable th) {
        int size = this.f2883a.size();
        for (int i = 0; i < size; i++) {
            try {
                C0819g gVar = (C0819g) this.f2883a.get(i);
                if (gVar != null) {
                    gVar.mo3717b(str, th);
                }
            } catch (Exception e) {
                m3683c("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }
}
