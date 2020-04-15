package p032c.p033a.p098m.p107g;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: c.a.m.g.a */
public class C1209a implements C1210b {

    /* renamed from: a */
    private volatile int f3962a = -1;

    /* renamed from: b */
    private ViewParent f3963b;

    /* renamed from: b */
    private void m5205b() {
        ViewParent viewParent = this.f3963b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f3963b = null;
        }
    }

    /* renamed from: a */
    public void mo4546a() {
        this.f3962a = -1;
        m5205b();
    }

    /* renamed from: a */
    public void mo4547a(int i, ViewParent viewParent) {
        this.f3962a = i;
        m5205b();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f3963b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo4548a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.f3962a;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }
}
