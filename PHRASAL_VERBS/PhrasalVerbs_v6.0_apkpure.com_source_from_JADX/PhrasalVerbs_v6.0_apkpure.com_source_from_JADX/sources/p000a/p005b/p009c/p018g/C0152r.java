package p000a.p005b.p009c.p018g;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.c.g.r */
public abstract class C0152r {

    /* renamed from: a */
    private final DataSetObservable f389a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f390b;

    /* renamed from: a */
    public float mo535a(int i) {
        return 1.0f;
    }

    /* renamed from: a */
    public abstract int mo536a();

    /* renamed from: a */
    public abstract int mo537a(Object obj);

    /* renamed from: a */
    public abstract Object mo538a(ViewGroup viewGroup, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo539a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f390b = dataSetObserver;
        }
    }

    /* renamed from: a */
    public void mo540a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo541a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo542a(View view, int i, Object obj) {
    }

    /* renamed from: a */
    public void mo543a(ViewGroup viewGroup) {
        mo541a((View) viewGroup);
    }

    /* renamed from: a */
    public abstract void mo544a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a */
    public abstract boolean mo545a(View view, Object obj);

    /* renamed from: b */
    public void mo546b() {
        synchronized (this) {
            if (this.f390b != null) {
                this.f390b.onChanged();
            }
        }
        this.f389a.notifyChanged();
    }

    @Deprecated
    /* renamed from: b */
    public void mo547b(View view) {
    }

    /* renamed from: b */
    public void mo548b(ViewGroup viewGroup) {
        mo547b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo549b(ViewGroup viewGroup, int i, Object obj) {
        mo542a((View) viewGroup, i, obj);
    }

    /* renamed from: c */
    public Parcelable mo550c() {
        return null;
    }
}
