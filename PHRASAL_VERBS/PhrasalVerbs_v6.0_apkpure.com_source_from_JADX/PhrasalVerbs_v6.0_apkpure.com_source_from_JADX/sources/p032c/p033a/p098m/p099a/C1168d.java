package p032c.p033a.p098m.p099a;

import android.util.SparseArray;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: c.a.m.a.d */
public class C1168d {

    /* renamed from: a */
    private final SparseArray<C1165a> f3886a = new SparseArray<>();

    /* renamed from: a */
    public C1165a mo4526a(int i) {
        UiThreadUtil.assertOnUiThread();
        return (C1165a) this.f3886a.get(i);
    }

    /* renamed from: a */
    public void mo4527a(C1165a aVar) {
        UiThreadUtil.assertOnUiThread();
        this.f3886a.put(aVar.mo4522b(), aVar);
    }

    /* renamed from: b */
    public C1165a mo4528b(int i) {
        UiThreadUtil.assertOnUiThread();
        C1165a aVar = (C1165a) this.f3886a.get(i);
        if (aVar != null) {
            this.f3886a.delete(i);
        }
        return aVar;
    }
}
