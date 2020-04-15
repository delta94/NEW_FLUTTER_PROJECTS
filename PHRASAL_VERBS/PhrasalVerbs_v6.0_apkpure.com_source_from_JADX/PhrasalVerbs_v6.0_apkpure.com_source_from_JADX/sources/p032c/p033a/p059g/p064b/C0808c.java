package p032c.p033a.p059g.p064b;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: c.a.g.b.c */
public class C0808c {

    /* renamed from: a */
    private static final C0808c f2798a = new C0808c();

    /* renamed from: b */
    private static boolean f2799b = true;

    /* renamed from: c */
    private final Queue<C0809a> f2800c = new ArrayBlockingQueue(20);

    /* renamed from: c.a.g.b.c$a */
    public enum C0809a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C0808c() {
    }

    /* renamed from: a */
    public static C0808c m3586a() {
        return f2799b ? new C0808c() : f2798a;
    }

    /* renamed from: a */
    public void mo3663a(C0809a aVar) {
        if (f2799b) {
            if (this.f2800c.size() + 1 > 20) {
                this.f2800c.poll();
            }
            this.f2800c.add(aVar);
        }
    }

    public String toString() {
        return this.f2800c.toString();
    }
}
