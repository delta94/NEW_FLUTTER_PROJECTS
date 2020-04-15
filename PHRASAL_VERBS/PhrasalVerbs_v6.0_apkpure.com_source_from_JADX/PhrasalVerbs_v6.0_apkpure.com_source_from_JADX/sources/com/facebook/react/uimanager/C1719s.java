package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.p123c.C1610h;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p099a.C1165a;
import p032c.p033a.p098m.p099a.C1166b;
import p032c.p033a.p098m.p099a.C1168d;
import p032c.p033a.p098m.p107g.C1209a;

/* renamed from: com.facebook.react.uimanager.s */
public class C1719s {

    /* renamed from: a */
    private static final String f5083a = "s";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1168d f5084b;

    /* renamed from: c */
    private final SparseArray<View> f5085c;

    /* renamed from: d */
    private final SparseArray<ViewManager> f5086d;

    /* renamed from: e */
    private final SparseBooleanArray f5087e;

    /* renamed from: f */
    private final C1701oa f5088f;

    /* renamed from: g */
    private final C1209a f5089g;

    /* renamed from: h */
    private final RootViewManager f5090h;

    /* renamed from: i */
    private final C1610h f5091i;

    /* renamed from: j */
    private boolean f5092j;

    /* renamed from: k */
    private PopupMenu f5093k;

    /* renamed from: com.facebook.react.uimanager.s$a */
    private static class C1720a implements OnMenuItemClickListener, OnDismissListener {

        /* renamed from: a */
        final Callback f5094a;

        /* renamed from: b */
        boolean f5095b;

        private C1720a(Callback callback) {
            this.f5095b = false;
            this.f5094a = callback;
        }

        /* synthetic */ C1720a(Callback callback, C1704q qVar) {
            this(callback);
        }

        public void onDismiss(PopupMenu popupMenu) {
            if (!this.f5095b) {
                this.f5094a.invoke("dismissed");
                this.f5095b = true;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f5095b) {
                return false;
            }
            this.f5094a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.f5095b = true;
            return true;
        }
    }

    public C1719s(C1701oa oaVar) {
        this(oaVar, new RootViewManager());
    }

    public C1719s(C1701oa oaVar, RootViewManager rootViewManager) {
        this.f5089g = new C1209a();
        this.f5091i = new C1610h();
        this.f5084b = new C1168d();
        this.f5088f = oaVar;
        this.f5085c = new SparseArray<>();
        this.f5086d = new SparseArray<>();
        this.f5087e = new SparseBooleanArray();
        this.f5090h = rootViewManager;
    }

    /* renamed from: a */
    private static String m6613a(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, C1684ja[] jaVarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        String str = " ],\n";
        String str2 = ",";
        String str3 = "): [\n";
        String str4 = "\n";
        if (viewGroup != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("View tag:");
            sb2.append(viewGroup.getId());
            sb2.append(str4);
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append(str3);
            sb.append(sb3.toString());
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 >= viewGroupManager.getChildCount(viewGroup) || i2 >= 16) {
                        sb.append(str4);
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(viewGroupManager.getChildAt(viewGroup, i3).getId());
                        sb4.append(str2);
                        sb.append(sb4.toString());
                        i2++;
                    }
                }
                sb.append(str4);
            }
            sb.append(str);
        }
        if (iArr != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  indicesToRemove(");
            sb5.append(iArr.length);
            sb5.append(str3);
            sb.append(sb5.toString());
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        sb.append(str4);
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(iArr[i6]);
                        sb6.append(str2);
                        sb.append(sb6.toString());
                        i5++;
                    }
                }
                sb.append(str4);
            }
            sb.append(str);
        }
        if (jaVarArr != null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  viewsToAdd(");
            sb7.append(jaVarArr.length);
            sb7.append(str3);
            sb.append(sb7.toString());
            for (int i7 = 0; i7 < jaVarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= jaVarArr.length || i8 >= 16) {
                        sb.append(str4);
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("[");
                        sb8.append(jaVarArr[i9].f5031c);
                        sb8.append(str2);
                        sb8.append(jaVarArr[i9].f5030b);
                        sb8.append("],");
                        sb.append(sb8.toString());
                        i8++;
                    }
                }
                sb.append(str4);
            }
            sb.append(str);
        }
        if (iArr2 != null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  tagsToDelete(");
            sb9.append(iArr2.length);
            sb9.append(str3);
            sb.append(sb9.toString());
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        sb.append(str4);
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(iArr2[i12]);
                        sb10.append(str2);
                        sb.append(sb10.toString());
                        i11++;
                    }
                }
                sb.append(str4);
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m6614a(View view, int i, int i2, int i3, int i4) {
        if (!this.f5092j || !this.f5091i.mo5846a(view)) {
            view.layout(i, i2, i3 + i, i4 + i2);
        } else {
            this.f5091i.mo5843a(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private boolean m6615a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private C1578N m6616d(int i) {
        View view = (View) this.f5085c.get(i);
        if (view != null) {
            return (C1578N) view.getContext();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find view with tag ");
        sb.append(i);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public synchronized int mo5984a(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = (View) this.f5085c.get(i);
        if (view != null) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find view with tag ");
            sb.append(i);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        return C1579O.m6263a(f, f2, (ViewGroup) view);
    }

    /* renamed from: a */
    public void mo5985a() {
        this.f5089g.mo4546a();
    }

    /* renamed from: a */
    public synchronized void mo5986a(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.f5087e.get(i)) {
            mo5999a((View) this.f5085c.get(i));
            this.f5087e.delete(i);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("View with tag ");
            sb.append(i);
            sb.append(" is not registered as a root view");
            SoftAssertions.assertUnreachable(sb.toString());
            throw null;
        }
    }

    /* renamed from: a */
    public void mo5987a(int i, int i2) {
        View view = (View) this.f5085c.get(i);
        if (view != null) {
            C1652g.m6464a(view, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find view with tag ");
        sb.append(i);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r1.needsCustomLayoutForChildren() == false) goto L_0x0059;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo5988a(int r11, int r12, int r13, int r14, int r15, int r16) {
        /*
            r10 = this;
            r7 = r10
            r0 = r11
            r1 = r12
            monitor-enter(r10)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "NativeViewHierarchyManager_updateLayout"
            r8 = 0
            com.facebook.systrace.c$a r2 = com.facebook.systrace.C1940c.m7352a(r8, r2)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "parentTag"
            r2.mo6821a(r3, r11)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "tag"
            r2.mo6821a(r3, r12)     // Catch:{ all -> 0x0089 }
            r2.mo6823a()     // Catch:{ all -> 0x0089 }
            android.view.View r2 = r10.mo6003b(r12)     // Catch:{ all -> 0x0084 }
            r1 = 1073741824(0x40000000, float:2.0)
            r5 = r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r1)     // Catch:{ all -> 0x0084 }
            r6 = r16
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)     // Catch:{ all -> 0x0084 }
            r2.measure(r3, r1)     // Catch:{ all -> 0x0084 }
            android.view.ViewParent r1 = r2.getParent()     // Catch:{ all -> 0x0084 }
            boolean r3 = r1 instanceof com.facebook.react.uimanager.C1574J     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x003b
            r1.requestLayout()     // Catch:{ all -> 0x0084 }
        L_0x003b:
            android.util.SparseBooleanArray r1 = r7.f5087e     // Catch:{ all -> 0x0084 }
            boolean r1 = r1.get(r11)     // Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x0059
            android.util.SparseArray<com.facebook.react.uimanager.ViewManager> r1 = r7.f5086d     // Catch:{ all -> 0x0084 }
            java.lang.Object r1 = r1.get(r11)     // Catch:{ all -> 0x0084 }
            com.facebook.react.uimanager.ViewManager r1 = (com.facebook.react.uimanager.ViewManager) r1     // Catch:{ all -> 0x0084 }
            boolean r3 = r1 instanceof com.facebook.react.uimanager.ViewGroupManager     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x0063
            com.facebook.react.uimanager.ViewGroupManager r1 = (com.facebook.react.uimanager.ViewGroupManager) r1     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x007f
            boolean r0 = r1.needsCustomLayoutForChildren()     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x007f
        L_0x0059:
            r1 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1.m6614a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0084 }
            goto L_0x007f
        L_0x0063:
            com.facebook.react.uimanager.k r1 = new com.facebook.react.uimanager.k     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r2.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = "Trying to use view with tag "
            r2.append(r3)     // Catch:{ all -> 0x0084 }
            r2.append(r11)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = " as a parent, but its Manager doesn't extends ViewGroupManager"
            r2.append(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0084 }
            r1.<init>(r0)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x007f:
            com.facebook.systrace.C1937a.m7338a(r8)     // Catch:{ all -> 0x0089 }
            monitor-exit(r10)
            return
        L_0x0084:
            r0 = move-exception
            com.facebook.systrace.C1937a.m7338a(r8)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1719s.mo5988a(int, int, int, int, int, int):void");
    }

    /* renamed from: a */
    public synchronized void mo5989a(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f5085c.get(i);
        if (view != null) {
            mo6006c(i).receiveCommand(view, i2, readableArray);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to send command to a non-existing view with tag ");
            sb.append(i);
            throw new C1685k(sb.toString());
        }
    }

    /* renamed from: a */
    public synchronized void mo5990a(int i, int i2, boolean z) {
        if (!z) {
            this.f5089g.mo4547a(i2, (ViewParent) null);
            return;
        }
        View view = (View) this.f5085c.get(i);
        if (i2 != i && (view instanceof ViewParent)) {
            this.f5089g.mo4547a(i2, (ViewParent) view);
        } else if (!this.f5087e.get(i)) {
            this.f5089g.mo4547a(i2, view.getParent());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot block native responder on ");
            sb.append(i);
            sb.append(" that is a root view");
            SoftAssertions.assertUnreachable(sb.toString());
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo5991a(int i, ViewGroup viewGroup, C1578N n) {
        if (viewGroup.getId() != -1) {
            String str = f5083a;
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to add a root view with an explicit id (");
            sb.append(viewGroup.getId());
            sb.append(") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            C0727a.m3275b(str, sb.toString());
        }
        this.f5085c.put(i, viewGroup);
        this.f5086d.put(i, this.f5090h);
        this.f5087e.put(i, true);
        viewGroup.setId(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo5992a(int i, C1165a aVar, Callback callback) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f5085c.get(i);
        int b = aVar.mo4522b();
        if (view != null) {
            aVar.mo4521a((C1166b) new C1717r(this, b, callback));
            aVar.mo4520a(view);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("View with tag ");
            sb.append(i);
            sb.append(" not found");
            throw new C1685k(sb.toString());
        }
    }

    /* renamed from: a */
    public synchronized void mo5993a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f5085c.get(i);
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't display popup. Could not find view with tag ");
            sb.append(i);
            callback2.invoke(sb.toString());
            return;
        }
        this.f5093k = new PopupMenu(m6616d(i), view);
        Menu menu = this.f5093k.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        C1720a aVar = new C1720a(callback, null);
        this.f5093k.setOnMenuItemClickListener(aVar);
        this.f5093k.setOnDismissListener(aVar);
        this.f5093k.show();
    }

    /* renamed from: a */
    public synchronized void mo5994a(int i, C1571G g) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager c = mo6006c(i);
            View b = mo6003b(i);
            if (g != null) {
                c.updateProperties(b, g);
            }
        } catch (C1685k e) {
            String str = f5083a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to update properties for view tag ");
            sb.append(i);
            C0727a.m3267a(str, sb.toString(), (Throwable) e);
        }
        return;
    }

    /* renamed from: a */
    public synchronized void mo5995a(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, C1578N n) {
        mo5991a(i, (ViewGroup) sizeMonitoringFrameLayout, n);
    }

    /* renamed from: a */
    public synchronized void mo5996a(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        mo6006c(i).updateExtraData(mo6003b(i), obj);
    }

    /* renamed from: a */
    public synchronized void mo5997a(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f5085c.get(i);
        if (view != null) {
            View view2 = (View) C1575K.m6250a(view);
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                view.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
                iArr[2] = view.getWidth();
                iArr[3] = view.getHeight();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Native view ");
                sb.append(i);
                sb.append(" is no longer on screen");
                throw new C1724u(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No native view for ");
            sb2.append(i);
            sb2.append(" currently exists");
            throw new C1724u(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0172, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo5998a(int r7, int[] r8, com.facebook.react.uimanager.C1684ja[] r9, int[] r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch:{ all -> 0x0196 }
            android.util.SparseArray<android.view.View> r0 = r6.f5085c     // Catch:{ all -> 0x0196 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0196 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0196 }
            com.facebook.react.uimanager.ViewManager r1 = r6.mo6006c(r7)     // Catch:{ all -> 0x0196 }
            com.facebook.react.uimanager.ViewGroupManager r1 = (com.facebook.react.uimanager.ViewGroupManager) r1     // Catch:{ all -> 0x0196 }
            if (r0 == 0) goto L_0x0173
            int r2 = r1.getChildCount(r0)     // Catch:{ all -> 0x0196 }
            if (r8 == 0) goto L_0x00de
            int r3 = r8.length     // Catch:{ all -> 0x0196 }
            int r3 = r3 + -1
        L_0x001d:
            if (r3 < 0) goto L_0x00de
            r4 = r8[r3]     // Catch:{ all -> 0x0196 }
            if (r4 < 0) goto L_0x00b3
            int r5 = r1.getChildCount(r0)     // Catch:{ all -> 0x0196 }
            if (r4 < r5) goto L_0x0064
            android.util.SparseBooleanArray r2 = r6.f5087e     // Catch:{ all -> 0x0196 }
            boolean r2 = r2.get(r7)     // Catch:{ all -> 0x0196 }
            if (r2 == 0) goto L_0x0039
            int r2 = r1.getChildCount(r0)     // Catch:{ all -> 0x0196 }
            if (r2 != 0) goto L_0x0039
            monitor-exit(r6)
            return
        L_0x0039:
            com.facebook.react.uimanager.k r2 = new com.facebook.react.uimanager.k     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r3.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r5 = "Trying to remove a view index above child count "
            r3.append(r5)     // Catch:{ all -> 0x0196 }
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = " view tag: "
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = "\n detail: "
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = m6613a(r0, r1, r8, r9, r10)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0196 }
            r2.<init>(r7)     // Catch:{ all -> 0x0196 }
            throw r2     // Catch:{ all -> 0x0196 }
        L_0x0064:
            if (r4 >= r2) goto L_0x0088
            android.view.View r2 = r1.getChildAt(r0, r4)     // Catch:{ all -> 0x0196 }
            boolean r5 = r6.f5092j     // Catch:{ all -> 0x0196 }
            if (r5 == 0) goto L_0x0081
            com.facebook.react.uimanager.c.h r5 = r6.f5091i     // Catch:{ all -> 0x0196 }
            boolean r5 = r5.mo5846a(r2)     // Catch:{ all -> 0x0196 }
            if (r5 == 0) goto L_0x0081
            int r2 = r2.getId()     // Catch:{ all -> 0x0196 }
            boolean r2 = r6.m6615a(r10, r2)     // Catch:{ all -> 0x0196 }
            if (r2 == 0) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r1.removeViewAt(r0, r4)     // Catch:{ all -> 0x0196 }
        L_0x0084:
            int r3 = r3 + -1
            r2 = r4
            goto L_0x001d
        L_0x0088:
            com.facebook.react.uimanager.k r2 = new com.facebook.react.uimanager.k     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r3.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r5 = "Trying to remove an out of order view index:"
            r3.append(r5)     // Catch:{ all -> 0x0196 }
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = " view tag: "
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = "\n detail: "
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = m6613a(r0, r1, r8, r9, r10)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0196 }
            r2.<init>(r7)     // Catch:{ all -> 0x0196 }
            throw r2     // Catch:{ all -> 0x0196 }
        L_0x00b3:
            com.facebook.react.uimanager.k r2 = new com.facebook.react.uimanager.k     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r3.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r5 = "Trying to remove a negative view index:"
            r3.append(r5)     // Catch:{ all -> 0x0196 }
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = " view tag: "
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = "\n detail: "
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = m6613a(r0, r1, r8, r9, r10)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0196 }
            r2.<init>(r7)     // Catch:{ all -> 0x0196 }
            throw r2     // Catch:{ all -> 0x0196 }
        L_0x00de:
            r7 = 0
            if (r9 == 0) goto L_0x0120
            r2 = 0
        L_0x00e2:
            int r3 = r9.length     // Catch:{ all -> 0x0196 }
            if (r2 >= r3) goto L_0x0120
            r3 = r9[r2]     // Catch:{ all -> 0x0196 }
            android.util.SparseArray<android.view.View> r4 = r6.f5085c     // Catch:{ all -> 0x0196 }
            int r5 = r3.f5030b     // Catch:{ all -> 0x0196 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0196 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x0196 }
            if (r4 == 0) goto L_0x00fb
            int r3 = r3.f5031c     // Catch:{ all -> 0x0196 }
            r1.addView(r0, r4, r3)     // Catch:{ all -> 0x0196 }
            int r2 = r2 + 1
            goto L_0x00e2
        L_0x00fb:
            com.facebook.react.uimanager.k r7 = new com.facebook.react.uimanager.k     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r2.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "Trying to add unknown view tag: "
            r2.append(r4)     // Catch:{ all -> 0x0196 }
            int r3 = r3.f5030b     // Catch:{ all -> 0x0196 }
            r2.append(r3)     // Catch:{ all -> 0x0196 }
            java.lang.String r3 = "\n detail: "
            r2.append(r3)     // Catch:{ all -> 0x0196 }
            java.lang.String r8 = m6613a(r0, r1, r8, r9, r10)     // Catch:{ all -> 0x0196 }
            r2.append(r8)     // Catch:{ all -> 0x0196 }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x0196 }
            r7.<init>(r8)     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0120:
            if (r10 == 0) goto L_0x0171
        L_0x0122:
            int r2 = r10.length     // Catch:{ all -> 0x0196 }
            if (r7 >= r2) goto L_0x0171
            r2 = r10[r7]     // Catch:{ all -> 0x0196 }
            android.util.SparseArray<android.view.View> r3 = r6.f5085c     // Catch:{ all -> 0x0196 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0196 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0196 }
            if (r3 == 0) goto L_0x014e
            boolean r2 = r6.f5092j     // Catch:{ all -> 0x0196 }
            if (r2 == 0) goto L_0x0148
            com.facebook.react.uimanager.c.h r2 = r6.f5091i     // Catch:{ all -> 0x0196 }
            boolean r2 = r2.mo5846a(r3)     // Catch:{ all -> 0x0196 }
            if (r2 == 0) goto L_0x0148
            com.facebook.react.uimanager.c.h r2 = r6.f5091i     // Catch:{ all -> 0x0196 }
            com.facebook.react.uimanager.q r4 = new com.facebook.react.uimanager.q     // Catch:{ all -> 0x0196 }
            r4.<init>(r6, r1, r0, r3)     // Catch:{ all -> 0x0196 }
            r2.mo5844a(r3, r4)     // Catch:{ all -> 0x0196 }
            goto L_0x014b
        L_0x0148:
            r6.mo5999a(r3)     // Catch:{ all -> 0x0196 }
        L_0x014b:
            int r7 = r7 + 1
            goto L_0x0122
        L_0x014e:
            com.facebook.react.uimanager.k r7 = new com.facebook.react.uimanager.k     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r3.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "Trying to destroy unknown view tag: "
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            r3.append(r2)     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "\n detail: "
            r3.append(r2)     // Catch:{ all -> 0x0196 }
            java.lang.String r8 = m6613a(r0, r1, r8, r9, r10)     // Catch:{ all -> 0x0196 }
            r3.append(r8)     // Catch:{ all -> 0x0196 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0196 }
            r7.<init>(r8)     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0171:
            monitor-exit(r6)
            return
        L_0x0173:
            com.facebook.react.uimanager.k r2 = new com.facebook.react.uimanager.k     // Catch:{ all -> 0x0196 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0196 }
            r3.<init>()     // Catch:{ all -> 0x0196 }
            java.lang.String r4 = "Trying to manageChildren view with tag "
            r3.append(r4)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = " which doesn't exist\n detail: "
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = m6613a(r0, r1, r8, r9, r10)     // Catch:{ all -> 0x0196 }
            r3.append(r7)     // Catch:{ all -> 0x0196 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0196 }
            r2.<init>(r7)     // Catch:{ all -> 0x0196 }
            throw r2     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1719s.mo5998a(int, int[], com.facebook.react.uimanager.ja[], int[]):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo5999a(View view) {
        UiThreadUtil.assertOnUiThread();
        if (this.f5086d.get(view.getId()) != null) {
            if (!this.f5087e.get(view.getId())) {
                mo6006c(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = (ViewManager) this.f5086d.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        C0727a.m3275b(f5083a, "Unable to drop null child view");
                    } else if (this.f5085c.get(childAt.getId()) != null) {
                        mo5999a(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.f5085c.remove(view.getId());
            this.f5086d.remove(view.getId());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6000a(ReadableMap readableMap) {
        this.f5091i.mo5845a(readableMap);
    }

    /* renamed from: a */
    public synchronized void mo6001a(C1578N n, int i, String str, C1571G g) {
        UiThreadUtil.assertOnUiThread();
        C1941a a = C1940c.m7352a(0, "NativeViewHierarchyManager_createView");
        a.mo6821a("tag", i);
        a.mo6822a("className", (Object) str);
        a.mo6823a();
        try {
            ViewManager a2 = this.f5088f.mo5978a(str);
            View createView = a2.createView(n, this.f5089g);
            this.f5085c.put(i, createView);
            this.f5086d.put(i, a2);
            createView.setId(i);
            if (g != null) {
                a2.updateProperties(createView, g);
            }
        } finally {
            C1937a.m7338a(0);
        }
    }

    /* renamed from: a */
    public void mo6002a(boolean z) {
        this.f5092j = z;
    }

    /* renamed from: b */
    public final synchronized View mo6003b(int i) {
        View view;
        view = (View) this.f5085c.get(i);
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to resolve view with tag ");
            sb.append(i);
            sb.append(" which doesn't exist");
            throw new C1685k(sb.toString());
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6004b() {
        this.f5091i.mo5842a();
    }

    /* renamed from: b */
    public synchronized void mo6005b(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f5085c.get(i);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Resources resources = view.getContext().getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
            }
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No native view for ");
            sb.append(i);
            sb.append(" currently exists");
            throw new C1724u(sb.toString());
        }
    }

    /* renamed from: c */
    public final synchronized ViewManager mo6006c(int i) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.f5086d.get(i);
        if (viewManager == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewManager for tag ");
            sb.append(i);
            sb.append(" could not be found");
            throw new C1685k(sb.toString());
        }
        return viewManager;
    }

    /* renamed from: c */
    public void mo6007c() {
        PopupMenu popupMenu = this.f5093k;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    /* renamed from: d */
    public C1168d mo6008d() {
        return this.f5084b;
    }
}
