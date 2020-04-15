package p032c.p033a.p074i.p082f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: c.a.i.f.a */
public class C0945a implements C0949e {

    /* renamed from: a */
    private final Executor f3251a = Executors.newFixedThreadPool(2, new C0966q(10, "FrescoIoBoundExecutor", true));

    /* renamed from: b */
    private final Executor f3252b;

    /* renamed from: c */
    private final Executor f3253c;

    /* renamed from: d */
    private final Executor f3254d;

    public C0945a(int i) {
        this.f3252b = Executors.newFixedThreadPool(i, new C0966q(10, "FrescoDecodeExecutor", true));
        this.f3253c = Executors.newFixedThreadPool(i, new C0966q(10, "FrescoBackgroundExecutor", true));
        this.f3254d = Executors.newFixedThreadPool(1, new C0966q(10, "FrescoLightWeightBackgroundExecutor", true));
    }

    /* renamed from: a */
    public Executor mo4063a() {
        return this.f3252b;
    }

    /* renamed from: b */
    public Executor mo4064b() {
        return this.f3254d;
    }

    /* renamed from: c */
    public Executor mo4065c() {
        return this.f3253c;
    }

    /* renamed from: d */
    public Executor mo4066d() {
        return this.f3251a;
    }

    /* renamed from: e */
    public Executor mo4067e() {
        return this.f3251a;
    }
}
