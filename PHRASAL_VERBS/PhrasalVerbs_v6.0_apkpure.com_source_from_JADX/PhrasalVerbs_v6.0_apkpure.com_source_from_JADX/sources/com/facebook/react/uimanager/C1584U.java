package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View.MeasureSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.i18nmanager.C1489a;
import com.facebook.react.uimanager.common.C1624a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.p122b.C1599a;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import com.facebook.yoga.YogaDirection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p099a.C1165a;

/* renamed from: com.facebook.react.uimanager.U */
public class C1584U {

    /* renamed from: a */
    protected Object f4793a;

    /* renamed from: b */
    protected final C1638f f4794b;

    /* renamed from: c */
    protected final ReactApplicationContext f4795c;

    /* renamed from: d */
    protected final C1576L f4796d;

    /* renamed from: e */
    private final Set<Integer> f4797e;

    /* renamed from: f */
    private final C1701oa f4798f;

    /* renamed from: g */
    private final C1655ha f4799g;

    /* renamed from: h */
    private final C1722t f4800h;

    /* renamed from: i */
    private final int[] f4801i;

    /* renamed from: j */
    private long f4802j;

    /* renamed from: k */
    protected C1585a f4803k;

    /* renamed from: com.facebook.react.uimanager.U$a */
    public interface C1585a {
        /* renamed from: a */
        void mo5750a(C1569E e);
    }

    C1584U(ReactApplicationContext reactApplicationContext, C1701oa oaVar, C1638f fVar, int i) {
        this(reactApplicationContext, oaVar, new C1655ha(reactApplicationContext, new C1719s(oaVar), i), fVar);
    }

    protected C1584U(ReactApplicationContext reactApplicationContext, C1701oa oaVar, C1655ha haVar, C1638f fVar) {
        this.f4793a = new Object();
        this.f4796d = new C1576L();
        this.f4797e = new HashSet();
        this.f4801i = new int[4];
        this.f4802j = 0;
        this.f4795c = reactApplicationContext;
        this.f4798f = oaVar;
        this.f4799g = haVar;
        this.f4800h = new C1722t(this.f4799g, this.f4796d);
        this.f4794b = fVar;
    }

    /* renamed from: a */
    private void m6273a(int i, int i2, int[] iArr) {
        C1569E a = this.f4796d.mo5682a(i);
        C1569E a2 = this.f4796d.mo5682a(i2);
        String str = "Tag ";
        if (a == null || a2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (a != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new C1685k(sb.toString());
        }
        if (a != a2) {
            C1569E parent = a.getParent();
            while (parent != a2) {
                if (parent != null) {
                    parent = parent.getParent();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i2);
                    sb2.append(" is not an ancestor of tag ");
                    sb2.append(i);
                    throw new C1685k(sb2.toString());
                }
            }
        }
        m6276a(a, a2, iArr);
    }

    /* renamed from: a */
    private void m6274a(int i, String str) {
        if (this.f4796d.mo5682a(i) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to execute operation ");
            sb.append(str);
            sb.append(" on view with tag: ");
            sb.append(i);
            sb.append(", since the view does not exists");
            throw new C1685k(sb.toString());
        }
    }

    /* renamed from: a */
    private void m6275a(int i, int[] iArr) {
        C1569E a = this.f4796d.mo5682a(i);
        if (a != null) {
            C1569E parent = a.getParent();
            if (parent != null) {
                m6276a(a, parent, iArr);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("View with tag ");
            sb.append(i);
            sb.append(" doesn't have a parent!");
            throw new C1685k(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No native view for tag ");
        sb2.append(i);
        sb2.append(" exists!");
        throw new C1685k(sb2.toString());
    }

    /* renamed from: a */
    private void m6276a(C1569E e, C1569E e2, int[] iArr) {
        int i;
        int i2;
        if (e != e2) {
            i2 = Math.round(e.mo5610x());
            i = Math.round(e.mo5607u());
            for (C1569E parent = e.getParent(); parent != e2; parent = parent.getParent()) {
                C1136a.m5053a(parent);
                m6277c(parent);
                i2 += Math.round(parent.mo5610x());
                i += Math.round(parent.mo5607u());
            }
            m6277c(e2);
        } else {
            i2 = 0;
            i = 0;
        }
        iArr[0] = i2;
        iArr[1] = i;
        iArr[2] = e.mo5598l();
        iArr[3] = e.mo5564a();
    }

    /* renamed from: c */
    private void m6277c(C1569E e) {
        ViewManager a = this.f4798f.mo5978a(e.mo5606t());
        C1136a.m5053a(a);
        ViewManager viewManager = a;
        if (viewManager instanceof ViewGroupManager) {
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            if (viewGroupManager != null && viewGroupManager.needsCustomLayoutForChildren()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (");
                sb.append(e.mo5606t());
                sb.append("). Use measure instead.");
                throw new C1685k(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Trying to use view ");
        sb2.append(e.mo5606t());
        sb2.append(" as a parent, but its Manager doesn't extends ViewGroupManager");
        throw new C1685k(sb2.toString());
    }

    /* renamed from: d */
    private void m6278d(C1569E e) {
        if (e.mo5587d()) {
            for (int i = 0; i < e.mo5589e(); i++) {
                m6278d(e.mo5590e(i));
            }
            e.mo5599m();
        }
    }

    /* renamed from: e */
    private void m6279e(C1569E e) {
        C1722t.m6644a(e);
        this.f4796d.mo5687d(e.mo5592g());
        this.f4797e.remove(Integer.valueOf(e.mo5592g()));
        for (int e2 = e.mo5589e() - 1; e2 >= 0; e2--) {
            m6279e(e.mo5590e(e2));
        }
        e.mo5591f();
    }

    /* renamed from: j */
    private void m6280j() {
        if (this.f4799g.mo5935e()) {
            mo5700a(-1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1569E mo5698a(String str) {
        return this.f4798f.mo5978a(str).createShadowNodeInstance(this.f4795c);
    }

    /* renamed from: a */
    public void mo5699a() {
        this.f4799g.mo5907a();
    }

    /* renamed from: a */
    public void mo5700a(int i) {
        C1941a a = C1940c.m7352a(0, "UIImplementation.dispatchViewUpdates");
        a.mo6821a("batchId", i);
        a.mo6823a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            mo5749i();
            this.f4800h.mo6011a();
            this.f4799g.mo5915a(i, uptimeMillis, this.f4802j);
        } finally {
            C1937a.m7338a(0);
        }
    }

    /* renamed from: a */
    public void mo5701a(int i, float f, float f2, Callback callback) {
        this.f4799g.mo5909a(i, f, f2, callback);
    }

    /* renamed from: a */
    public void mo5702a(int i, int i2) {
        m6274a(i, "removeAnimation");
        this.f4799g.mo5908a(i2);
    }

    /* renamed from: a */
    public void mo5703a(int i, int i2, int i3) {
        C1569E a = this.f4796d.mo5682a(i);
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to update size of non-existent tag: ");
            sb.append(i);
            C0727a.m3284d("ReactNative", sb.toString());
            return;
        }
        a.mo5586d((float) i2);
        a.mo5578b((float) i3);
        m6280j();
    }

    /* renamed from: a */
    public void mo5704a(int i, int i2, Callback callback) {
        m6274a(i, "addAnimation");
        this.f4799g.mo5912a(i, i2, callback);
    }

    /* renamed from: a */
    public void mo5705a(int i, int i2, Callback callback, Callback callback2) {
        try {
            m6273a(i, i2, this.f4801i);
            callback2.invoke(Float.valueOf(C1726w.m6666a((float) this.f4801i[0])), Float.valueOf(C1726w.m6666a((float) this.f4801i[1])), Float.valueOf(C1726w.m6666a((float) this.f4801i[2])), Float.valueOf(C1726w.m6666a((float) this.f4801i[3])));
        } catch (C1685k e) {
            callback.invoke(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo5706a(int i, int i2, ReadableArray readableArray) {
        m6274a(i, "dispatchViewManagerCommand");
        this.f4799g.mo5913a(i, i2, readableArray);
    }

    /* renamed from: a */
    public void mo5707a(int i, Callback callback) {
        this.f4799g.mo5916a(i, callback);
    }

    /* renamed from: a */
    public void mo5708a(int i, Callback callback, Callback callback2) {
        try {
            m6275a(i, this.f4801i);
            callback2.invoke(Float.valueOf(C1726w.m6666a((float) this.f4801i[0])), Float.valueOf(C1726w.m6666a((float) this.f4801i[1])), Float.valueOf(C1726w.m6666a((float) this.f4801i[2])), Float.valueOf(C1726w.m6666a((float) this.f4801i[3])));
        } catch (C1685k e) {
            callback.invoke(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo5709a(int i, ReadableArray readableArray) {
        synchronized (this.f4793a) {
            C1569E a = this.f4796d.mo5682a(i);
            int i2 = 0;
            while (i2 < readableArray.size()) {
                C1569E a2 = this.f4796d.mo5682a(readableArray.getInt(i2));
                if (a2 != null) {
                    a.mo5580b(a2, i2);
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Trying to add unknown view tag: ");
                    sb.append(readableArray.getInt(i2));
                    throw new C1685k(sb.toString());
                }
            }
            if (!a.mo5596j() && !a.mo5609w()) {
                this.f4800h.mo6012a(a, readableArray);
            }
        }
    }

    /* renamed from: a */
    public void mo5710a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        m6274a(i, "showPopupMenu");
        this.f4799g.mo5917a(i, readableArray, callback, callback2);
    }

    /* renamed from: a */
    public void mo5711a(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int i2 = i;
        ReadableArray readableArray6 = readableArray;
        ReadableArray readableArray7 = readableArray2;
        ReadableArray readableArray8 = readableArray3;
        ReadableArray readableArray9 = readableArray4;
        ReadableArray readableArray10 = readableArray5;
        synchronized (this.f4793a) {
            try {
                C1569E a = this.f4796d.mo5682a(i2);
                int size = readableArray6 == null ? 0 : readableArray.size();
                int size2 = readableArray8 == null ? 0 : readableArray3.size();
                int size3 = readableArray10 == null ? 0 : readableArray5.size();
                if (size != 0) {
                    if (readableArray7 == null || size != readableArray2.size()) {
                        throw new C1685k("Size of moveFrom != size of moveTo!");
                    }
                }
                if (size2 != 0) {
                    if (readableArray9 == null || size2 != readableArray4.size()) {
                        throw new C1685k("Size of addChildTags != size of addAtIndices!");
                    }
                }
                C1684ja[] jaVarArr = new C1684ja[(size + size2)];
                int[] iArr = new int[(size + size3)];
                int[] iArr2 = new int[iArr.length];
                int[] iArr3 = new int[size3];
                if (size > 0) {
                    try {
                        C1136a.m5053a(readableArray);
                        C1136a.m5053a(readableArray2);
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = readableArray6.getInt(i3);
                            int g = a.mo5590e(i4).mo5592g();
                            int[] iArr4 = iArr3;
                            C1569E e = a;
                            jaVarArr[i3] = new C1684ja(g, readableArray7.getInt(i3));
                            iArr[i3] = i4;
                            iArr2[i3] = g;
                            i3++;
                            int i5 = i;
                            readableArray6 = readableArray;
                            iArr3 = iArr4;
                            a = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                C1569E e2 = a;
                int[] iArr5 = iArr3;
                if (size2 > 0) {
                    C1136a.m5053a(readableArray3);
                    C1136a.m5053a(readableArray4);
                    for (int i6 = 0; i6 < size2; i6++) {
                        jaVarArr[size + i6] = new C1684ja(readableArray8.getInt(i6), readableArray9.getInt(i6));
                    }
                }
                if (size3 > 0) {
                    C1136a.m5053a(readableArray5);
                    int i7 = 0;
                    while (i7 < size3) {
                        int i8 = readableArray10.getInt(i7);
                        C1569E e3 = e2;
                        int g2 = e3.mo5590e(i8).mo5592g();
                        int i9 = size + i7;
                        iArr[i9] = i8;
                        iArr2[i9] = g2;
                        iArr5[i7] = g2;
                        i7++;
                        e2 = e3;
                    }
                }
                C1569E e4 = e2;
                Arrays.sort(jaVarArr, C1684ja.f5029a);
                Arrays.sort(iArr);
                int length = iArr.length - 1;
                int i10 = -1;
                while (length >= 0) {
                    if (iArr[length] != i10) {
                        e4.mo5566a(iArr[length]);
                        i10 = iArr[length];
                        length--;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Repeated indices in Removal list for view tag: ");
                        sb.append(i);
                        throw new C1685k(sb.toString());
                    }
                }
                int i11 = 0;
                while (i11 < jaVarArr.length) {
                    C1684ja jaVar = jaVarArr[i11];
                    C1569E a2 = this.f4796d.mo5682a(jaVar.f5030b);
                    if (a2 != null) {
                        e4.mo5580b(a2, jaVar.f5031c);
                        i11++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Trying to add unknown view tag: ");
                        sb2.append(jaVar.f5030b);
                        throw new C1685k(sb2.toString());
                    }
                }
                if (!e4.mo5596j() && !e4.mo5609w()) {
                    this.f4800h.mo6015a(e4, iArr, iArr2, jaVarArr, iArr5);
                }
                int[] iArr6 = iArr5;
                for (int a3 : iArr6) {
                    mo5735b(this.f4796d.mo5682a(a3));
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo5712a(int i, C1571G g) {
        UiThreadUtil.assertOnUiThread();
        this.f4799g.mo5933c().mo5994a(i, g);
    }

    /* renamed from: a */
    public void mo5713a(int i, Object obj) {
        C1569E a = this.f4796d.mo5682a(i);
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt to set local data for view with unknown tag: ");
            sb.append(i);
            C0727a.m3284d("ReactNative", sb.toString());
            return;
        }
        a.mo5572a(obj);
        m6280j();
    }

    /* renamed from: a */
    public void mo5714a(int i, String str, int i2, ReadableMap readableMap) {
        synchronized (this.f4793a) {
            C1569E a = mo5698a(str);
            C1569E a2 = this.f4796d.mo5682a(i2);
            StringBuilder sb = new StringBuilder();
            sb.append("Root node with tag ");
            sb.append(i2);
            sb.append(" doesn't exist");
            C1136a.m5054a(a2, sb.toString());
            a.mo5584c(i);
            a.mo5573a(str);
            a.mo5579b(a2.mo5592g());
            a.mo5570a(a2.mo5602p());
            this.f4796d.mo5683a(a);
            C1571G g = null;
            if (readableMap != null) {
                g = new C1571G(readableMap);
                a.mo5569a(g);
            }
            mo5722a(a, i2, g);
        }
    }

    /* renamed from: a */
    public void mo5715a(int i, String str, ReadableMap readableMap) {
        if (this.f4798f.mo5978a(str) != null) {
            C1569E a = this.f4796d.mo5682a(i);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Trying to update non-existent view with tag ");
                sb.append(i);
                throw new C1685k(sb.toString());
            } else if (readableMap != null) {
                C1571G g = new C1571G(readableMap);
                a.mo5569a(g);
                mo5723a(a, str, g);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got unknown view type: ");
            sb2.append(str);
            throw new C1685k(sb2.toString());
        }
    }

    /* renamed from: a */
    public void mo5716a(int i, boolean z) {
        C1569E a = this.f4796d.mo5682a(i);
        if (a != null) {
            while (true) {
                if (a.mo5596j() || a.mo5563A()) {
                    a = a.getParent();
                } else {
                    this.f4799g.mo5914a(a.mo5592g(), i, z);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5717a(C1165a aVar) {
        this.f4799g.mo5922a(aVar);
    }

    /* renamed from: a */
    public void mo5718a(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.f4799g.mo5923a(readableMap, callback, callback2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5719a(C1569E e) {
        C1941a a = C1940c.m7352a(0, "cssRoot.calculateLayout");
        a.mo6821a("rootTag", e.mo5592g());
        a.mo6823a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            e.mo5595i();
        } finally {
            C1937a.m7338a(0);
            this.f4802j = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5720a(C1569E e, float f, float f2) {
        if (e.mo5587d()) {
            if (!e.mo5609w()) {
                for (int i = 0; i < e.mo5589e(); i++) {
                    mo5720a(e.mo5590e(i), e.mo5610x() + f, e.mo5607u() + f2);
                }
            }
            int g = e.mo5592g();
            if (!this.f4796d.mo5686c(g) && e.mo5575a(f, f2, this.f4799g, this.f4800h) && e.mo5604r()) {
                this.f4794b.mo5886a((C1635c) C1725v.m6660b(g, e.mo5608v(), e.mo5601o(), e.mo5598l(), e.mo5564a()));
            }
            e.mo5577b();
        }
    }

    /* renamed from: a */
    public void mo5721a(C1569E e, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            e.mo5567a((float) size);
        } else if (mode == 0) {
            e.mo5611y();
        } else if (mode == 1073741824) {
            e.mo5586d((float) size);
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            e.mo5583c((float) size2);
        } else if (mode2 == 0) {
            e.mo5605s();
        } else if (mode2 == 1073741824) {
            e.mo5578b((float) size2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5722a(C1569E e, int i, C1571G g) {
        if (!e.mo5596j()) {
            this.f4800h.mo6013a(e, e.mo5602p(), g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5723a(C1569E e, String str, C1571G g) {
        if (!e.mo5596j()) {
            this.f4800h.mo6014a(e, str, g);
        }
    }

    /* renamed from: a */
    public void mo5724a(C1582S s) {
        this.f4799g.mo5926a(s);
    }

    /* renamed from: a */
    public void mo5725a(C1599a aVar) {
        this.f4799g.mo5927a(aVar);
    }

    /* renamed from: a */
    public <T extends SizeMonitoringFrameLayout & C1624a> void mo5726a(T t, int i, C1578N n) {
        synchronized (this.f4793a) {
            C1569E b = mo5728b();
            b.mo5584c(i);
            b.mo5570a(n);
            mo5721a(b, ((C1624a) t).getWidthMeasureSpec(), ((C1624a) t).getHeightMeasureSpec());
            n.runOnNativeModulesQueueThread(new C1583T(this, b));
            this.f4799g.mo5918a(i, (SizeMonitoringFrameLayout) t, n);
        }
    }

    /* renamed from: a */
    public void mo5727a(boolean z) {
        this.f4799g.mo5928a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1569E mo5728b() {
        C1570F f = new C1570F();
        if (C1489a.m5938a().mo5394b(this.f4795c)) {
            f.mo5571a(YogaDirection.RTL);
        }
        f.mo5573a("Root");
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ViewManager mo5729b(String str) {
        return this.f4798f.mo5978a(str);
    }

    /* renamed from: b */
    public void mo5730b(int i) {
        this.f4797e.add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo5731b(int i, int i2) {
        if (this.f4796d.mo5686c(i) || this.f4796d.mo5686c(i2)) {
            throw new C1685k("Trying to add or replace a root tag!");
        }
        C1569E a = this.f4796d.mo5682a(i);
        if (a != null) {
            C1569E parent = a.getParent();
            if (parent != null) {
                int c = parent.mo5581c(a);
                if (c >= 0) {
                    WritableArray createArray = Arguments.createArray();
                    createArray.pushInt(i2);
                    WritableArray createArray2 = Arguments.createArray();
                    createArray2.pushInt(c);
                    WritableArray createArray3 = Arguments.createArray();
                    createArray3.pushInt(c);
                    mo5711a(parent.mo5592g(), null, null, createArray, createArray2, createArray3);
                    return;
                }
                throw new IllegalStateException("Didn't find child tag in parent");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Node is not attached to a parent: ");
            sb.append(i);
            throw new C1685k(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Trying to replace unknown view tag: ");
        sb2.append(i);
        throw new C1685k(sb2.toString());
    }

    /* renamed from: b */
    public void mo5732b(int i, int i2, int i3) {
        C1569E a = this.f4796d.mo5682a(i);
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to update non-existent root tag: ");
            sb.append(i);
            C0727a.m3284d("ReactNative", sb.toString());
            return;
        }
        mo5721a(a, i2, i3);
    }

    /* renamed from: b */
    public void mo5733b(int i, int i2, Callback callback) {
        C1569E a = this.f4796d.mo5682a(i);
        C1569E a2 = this.f4796d.mo5682a(i2);
        if (a == null || a2 == null) {
            callback.invoke(Boolean.valueOf(false));
            return;
        }
        callback.invoke(Boolean.valueOf(a.mo5588d(a2)));
    }

    /* renamed from: b */
    public void mo5734b(int i, Callback callback) {
        this.f4799g.mo5931b(i, callback);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5735b(C1569E e) {
        m6279e(e);
        e.mo5600n();
    }

    /* renamed from: b */
    public void mo5736b(C1582S s) {
        this.f4799g.mo5932b(s);
    }

    /* renamed from: c */
    public void mo5737c() {
        this.f4799g.mo5929b();
    }

    /* renamed from: c */
    public void mo5738c(int i) {
        synchronized (this.f4793a) {
            this.f4796d.mo5688e(i);
        }
    }

    /* renamed from: c */
    public void mo5739c(int i, int i2) {
        this.f4799g.mo5910a(i, i2);
    }

    /* renamed from: d */
    public Map<String, Long> mo5740d() {
        return this.f4799g.mo5934d();
    }

    /* renamed from: d */
    public void mo5741d(int i) {
        mo5738c(i);
        this.f4799g.mo5930b(i);
    }

    /* renamed from: e */
    public void mo5742e() {
    }

    /* renamed from: e */
    public void mo5743e(int i) {
        C1569E a = this.f4796d.mo5682a(i);
        if (a != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i2 = 0; i2 < a.mo5589e(); i2++) {
                createArray.pushInt(i2);
            }
            mo5711a(i, null, null, null, null, createArray);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to remove subviews of an unknown view tag: ");
        sb.append(i);
        throw new C1685k(sb.toString());
    }

    /* renamed from: f */
    public int mo5744f(int i) {
        if (this.f4796d.mo5686c(i)) {
            return i;
        }
        C1569E g = mo5746g(i);
        int i2 = 0;
        if (g != null) {
            i2 = g.mo5603q();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Warning : attempted to resolve a non-existent react shadow node. reactTag=");
            sb.append(i);
            C0727a.m3284d("ReactNative", sb.toString());
        }
        return i2;
    }

    /* renamed from: f */
    public void mo5745f() {
        this.f4799g.mo5936f();
    }

    /* renamed from: g */
    public final C1569E mo5746g(int i) {
        return this.f4796d.mo5682a(i);
    }

    /* renamed from: g */
    public void mo5747g() {
        this.f4799g.mo5938h();
    }

    /* renamed from: h */
    public void mo5748h() {
        this.f4799g.mo5937g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        throw r0;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5749i() {
        /*
            r7 = this;
            java.lang.String r0 = "rootTag"
            r1 = 0
            java.lang.String r3 = "UIImplementation.updateViewHierarchy"
            com.facebook.systrace.C1937a.m7339a(r1, r3)
            r3 = 0
        L_0x000a:
            com.facebook.react.uimanager.L r4 = r7.f4796d     // Catch:{ all -> 0x0077 }
            int r4 = r4.mo5681a()     // Catch:{ all -> 0x0077 }
            if (r3 >= r4) goto L_0x0073
            com.facebook.react.uimanager.L r4 = r7.f4796d     // Catch:{ all -> 0x0077 }
            int r4 = r4.mo5684b(r3)     // Catch:{ all -> 0x0077 }
            com.facebook.react.uimanager.L r5 = r7.f4796d     // Catch:{ all -> 0x0077 }
            com.facebook.react.uimanager.E r5 = r5.mo5682a(r4)     // Catch:{ all -> 0x0077 }
            java.util.Set<java.lang.Integer> r6 = r7.f4797e     // Catch:{ all -> 0x0077 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0077 }
            boolean r4 = r6.contains(r4)     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x0070
            java.lang.String r4 = "UIImplementation.notifyOnBeforeLayoutRecursive"
            com.facebook.systrace.c$a r4 = com.facebook.systrace.C1940c.m7352a(r1, r4)     // Catch:{ all -> 0x0077 }
            int r6 = r5.mo5592g()     // Catch:{ all -> 0x0077 }
            r4.mo6821a(r0, r6)     // Catch:{ all -> 0x0077 }
            r4.mo6823a()     // Catch:{ all -> 0x0077 }
            r7.m6278d(r5)     // Catch:{ all -> 0x006b }
            com.facebook.systrace.C1937a.m7338a(r1)     // Catch:{ all -> 0x0077 }
            r7.mo5719a(r5)     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "UIImplementation.applyUpdatesRecursive"
            com.facebook.systrace.c$a r4 = com.facebook.systrace.C1940c.m7352a(r1, r4)     // Catch:{ all -> 0x0077 }
            int r6 = r5.mo5592g()     // Catch:{ all -> 0x0077 }
            r4.mo6821a(r0, r6)     // Catch:{ all -> 0x0077 }
            r4.mo6823a()     // Catch:{ all -> 0x0077 }
            r4 = 0
            r7.mo5720a(r5, r4, r4)     // Catch:{ all -> 0x0066 }
            com.facebook.systrace.C1937a.m7338a(r1)     // Catch:{ all -> 0x0077 }
            com.facebook.react.uimanager.U$a r4 = r7.f4803k     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x0070
            com.facebook.react.uimanager.ha r4 = r7.f4799g     // Catch:{ all -> 0x0077 }
            com.facebook.react.uimanager.U$a r6 = r7.f4803k     // Catch:{ all -> 0x0077 }
            r4.mo5924a(r5, r6)     // Catch:{ all -> 0x0077 }
            goto L_0x0070
        L_0x0066:
            r0 = move-exception
            com.facebook.systrace.C1937a.m7338a(r1)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x006b:
            r0 = move-exception
            com.facebook.systrace.C1937a.m7338a(r1)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0073:
            com.facebook.systrace.C1937a.m7338a(r1)
            return
        L_0x0077:
            r0 = move-exception
            com.facebook.systrace.C1937a.m7338a(r1)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1584U.mo5749i():void");
    }
}
