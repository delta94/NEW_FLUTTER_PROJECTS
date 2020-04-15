package p032c.p033a.p098m;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: c.a.m.k */
public class C1224k implements ComponentCallbacks2 {

    /* renamed from: a */
    private final Set<MemoryPressureListener> f3978a = Collections.synchronizedSet(new LinkedHashSet());

    C1224k(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    /* renamed from: a */
    private void m5234a(int i) {
        Set<MemoryPressureListener> set = this.f3978a;
        for (MemoryPressureListener handleMemoryPressure : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            handleMemoryPressure.handleMemoryPressure(i);
        }
    }

    /* renamed from: a */
    public void mo4566a(MemoryPressureListener memoryPressureListener) {
        this.f3978a.add(memoryPressureListener);
    }

    /* renamed from: b */
    public void mo4567b(MemoryPressureListener memoryPressureListener) {
        this.f3978a.remove(memoryPressureListener);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        m5234a(i);
    }
}
