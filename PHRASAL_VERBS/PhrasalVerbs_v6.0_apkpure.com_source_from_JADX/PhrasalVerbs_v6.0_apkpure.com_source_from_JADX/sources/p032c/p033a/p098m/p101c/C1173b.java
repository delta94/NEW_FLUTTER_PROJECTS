package p032c.p033a.p098m.p101c;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: c.a.m.c.b */
public class C1173b {

    /* renamed from: a */
    private static final WeakHashMap<ReactContext, C1173b> f3898a = new WeakHashMap<>();

    /* renamed from: b */
    private final WeakReference<ReactContext> f3899b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Set<C1174c> f3900c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private final AtomicInteger f3901d = new AtomicInteger(0);

    /* renamed from: e */
    private final Handler f3902e = new Handler();

    /* renamed from: f */
    private final Set<Integer> f3903f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final SparseArray<Runnable> f3904g = new SparseArray<>();

    private C1173b(ReactContext reactContext) {
        this.f3899b = new WeakReference<>(reactContext);
    }

    /* renamed from: a */
    public static C1173b m5190a(ReactContext reactContext) {
        C1173b bVar = (C1173b) f3898a.get(reactContext);
        if (bVar != null) {
            return bVar;
        }
        C1173b bVar2 = new C1173b(reactContext);
        f3898a.put(reactContext, bVar2);
        return bVar2;
    }

    /* renamed from: a */
    public synchronized void mo4532a(int i) {
        boolean remove = this.f3903f.remove(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        sb.append("Tried to finish non-existent task with id ");
        sb.append(i);
        sb.append(".");
        C1136a.m5056a(remove, sb.toString());
        Runnable runnable = (Runnable) this.f3904g.get(i);
        if (runnable != null) {
            this.f3902e.removeCallbacks(runnable);
            this.f3904g.remove(i);
        }
        UiThreadUtil.runOnUiThread(new C1172a(this, i));
    }

    /* renamed from: a */
    public void mo4533a(C1174c cVar) {
        this.f3900c.add(cVar);
    }

    /* renamed from: a */
    public boolean mo4534a() {
        return this.f3903f.size() > 0;
    }

    /* renamed from: b */
    public void mo4535b(C1174c cVar) {
        this.f3900c.remove(cVar);
    }

    /* renamed from: b */
    public synchronized boolean mo4536b(int i) {
        return this.f3903f.contains(Integer.valueOf(i));
    }
}
