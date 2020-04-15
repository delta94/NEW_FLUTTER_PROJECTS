package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1584U;
import com.facebook.react.uimanager.C1685k;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModule.C1586a;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1642h;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.animated.H */
class C1312H implements C1642h {

    /* renamed from: a */
    private final SparseArray<C1328b> f4247a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<C1330d> f4248b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<C1328b> f4249c = new SparseArray<>();

    /* renamed from: d */
    private final Map<String, List<EventAnimationDriver>> f4250d = new HashMap();

    /* renamed from: e */
    private final C1586a f4251e;

    /* renamed from: f */
    private final C1584U f4252f;

    /* renamed from: g */
    private int f4253g = 0;

    /* renamed from: h */
    private final List<C1328b> f4254h = new LinkedList();

    public C1312H(UIManagerModule uIManagerModule) {
        this.f4252f = uIManagerModule.getUIImplementation();
        uIManagerModule.getEventDispatcher().mo5887a((C1642h) this);
        this.f4251e = uIManagerModule.getDirectEventNamesResolver();
    }

    /* renamed from: a */
    private void m5635a(C1328b bVar) {
        int i = 0;
        while (i < this.f4248b.size()) {
            C1330d dVar = (C1330d) this.f4248b.valueAt(i);
            if (bVar.equals(dVar.f4306b)) {
                if (dVar.f4307c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    dVar.f4307c.invoke(createMap);
                }
                this.f4248b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m5636a(List<C1328b> list) {
        this.f4253g++;
        int i = this.f4253g;
        if (i == 0) {
            this.f4253g = i + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        for (C1328b bVar : list) {
            int i3 = bVar.f4303c;
            int i4 = this.f4253g;
            if (i3 != i4) {
                bVar.f4303c = i4;
                i2++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            C1328b bVar2 = (C1328b) arrayDeque.poll();
            if (bVar2.f4301a != null) {
                int i5 = i2;
                for (int i6 = 0; i6 < bVar2.f4301a.size(); i6++) {
                    C1328b bVar3 = (C1328b) bVar2.f4301a.get(i6);
                    bVar3.f4302b++;
                    int i7 = bVar3.f4303c;
                    int i8 = this.f4253g;
                    if (i7 != i8) {
                        bVar3.f4303c = i8;
                        i5++;
                        arrayDeque.add(bVar3);
                    }
                }
                i2 = i5;
            }
        }
        this.f4253g++;
        int i9 = this.f4253g;
        if (i9 == 0) {
            this.f4253g = i9 + 1;
        }
        int i10 = 0;
        for (C1328b bVar4 : list) {
            if (bVar4.f4302b == 0) {
                int i11 = bVar4.f4303c;
                int i12 = this.f4253g;
                if (i11 != i12) {
                    bVar4.f4303c = i12;
                    i10++;
                    arrayDeque.add(bVar4);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            C1328b bVar5 = (C1328b) arrayDeque.poll();
            bVar5.mo4836a();
            if (bVar5 instanceof C1313I) {
                try {
                    ((C1313I) bVar5).mo4832c();
                } catch (C1685k e) {
                    C0727a.m3267a("ReactNative", "Native animation workaround, frame lost as result of race condition", (Throwable) e);
                }
            }
            if (bVar5 instanceof C1326Q) {
                ((C1326Q) bVar5).mo4865e();
            }
            if (bVar5.f4301a != null) {
                int i13 = i10;
                for (int i14 = 0; i14 < bVar5.f4301a.size(); i14++) {
                    C1328b bVar6 = (C1328b) bVar5.f4301a.get(i14);
                    bVar6.f4302b--;
                    int i15 = bVar6.f4303c;
                    int i16 = this.f4253g;
                    if (i15 != i16 && bVar6.f4302b == 0) {
                        bVar6.f4303c = i16;
                        i13++;
                        arrayDeque.add(bVar6);
                    }
                }
                i10 = i13;
            }
        }
        if (i2 != i10) {
            StringBuilder sb = new StringBuilder();
            sb.append("Looks like animated nodes graph has cycles, there are ");
            sb.append(i2);
            sb.append(" but toposort visited only ");
            sb.append(i10);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5637b(C1635c cVar) {
        if (!this.f4250d.isEmpty()) {
            String a = this.f4251e.mo5790a(cVar.mo5869d());
            Map<String, List<EventAnimationDriver>> map = this.f4250d;
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.mo5877g());
            sb.append(a);
            List<EventAnimationDriver> list = (List) map.get(sb.toString());
            if (list != null) {
                for (EventAnimationDriver eventAnimationDriver : list) {
                    m5635a((C1328b) eventAnimationDriver.mValueNode);
                    cVar.mo5868a((RCTEventEmitter) eventAnimationDriver);
                    this.f4254h.add(eventAnimationDriver.mValueNode);
                }
                m5636a(this.f4254h);
                this.f4254h.clear();
            }
        }
    }

    /* renamed from: a */
    public void mo4808a(int i) {
        this.f4247a.remove(i);
        this.f4249c.remove(i);
    }

    /* renamed from: a */
    public void mo4809a(int i, double d) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null || !(bVar instanceof C1326Q)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        ((C1326Q) bVar).f4297f = d;
        this.f4249c.put(i, bVar);
    }

    /* renamed from: a */
    public void mo4810a(int i, int i2) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        } else if (bVar instanceof C1313I) {
            ((C1313I) bVar).mo4829a(i2);
            this.f4249c.put(i, bVar);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Animated node connected to view should beof type ");
            sb2.append(C1313I.class.getName());
            throw new JSApplicationIllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public void mo4811a(int i, int i2, ReadableMap readableMap, Callback callback) {
        C1330d dVar;
        C1328b bVar = (C1328b) this.f4247a.get(i2);
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i2);
            sb.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        } else if (bVar instanceof C1326Q) {
            C1330d dVar2 = (C1330d) this.f4248b.get(i);
            if (dVar2 != null) {
                dVar2.mo4834a(readableMap);
                return;
            }
            String string = readableMap.getString("type");
            if ("frames".equals(string)) {
                dVar = new C1334h(readableMap);
            } else if ("spring".equals(string)) {
                dVar = new C1315K(readableMap);
            } else if ("decay".equals(string)) {
                dVar = new C1331e(readableMap);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported animation type: ");
                sb2.append(string);
                throw new JSApplicationIllegalArgumentException(sb2.toString());
            }
            dVar.f4308d = i;
            dVar.f4307c = callback;
            dVar.f4306b = (C1326Q) bVar;
            this.f4248b.put(i, dVar);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Animated node should be of type ");
            sb3.append(C1326Q.class.getName());
            throw new JSApplicationIllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public void mo4812a(int i, C1329c cVar) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null || !(bVar instanceof C1326Q)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        ((C1326Q) bVar).mo4861a(cVar);
    }

    /* renamed from: a */
    public void mo4813a(int i, ReadableMap readableMap) {
        C1328b bVar;
        if (this.f4247a.get(i) == null) {
            String string = readableMap.getString("type");
            if ("style".equals(string)) {
                bVar = new C1317L(readableMap, this);
            } else if ("value".equals(string)) {
                bVar = new C1326Q(readableMap);
            } else if ("props".equals(string)) {
                bVar = new C1313I(readableMap, this, this.f4252f);
            } else if ("interpolation".equals(string)) {
                bVar = new C1335i(readableMap);
            } else if ("addition".equals(string)) {
                bVar = new C1327a(readableMap, this);
            } else if ("subtraction".equals(string)) {
                bVar = new C1318M(readableMap, this);
            } else if ("division".equals(string)) {
                bVar = new C1333g(readableMap, this);
            } else if ("multiplication".equals(string)) {
                bVar = new C1337k(readableMap, this);
            } else if ("modulus".equals(string)) {
                bVar = new C1336j(readableMap, this);
            } else if ("diffclamp".equals(string)) {
                bVar = new C1332f(readableMap, this);
            } else if ("transform".equals(string)) {
                bVar = new C1322P(readableMap, this);
            } else if ("tracking".equals(string)) {
                bVar = new C1319N(readableMap, this);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported node type: ");
                sb.append(string);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            bVar.f4304d = i;
            this.f4247a.put(i, bVar);
            this.f4249c.put(i, bVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Animated node with tag ");
        sb2.append(i);
        sb2.append(" already exists");
        throw new JSApplicationIllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public void mo4814a(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f4250d.containsKey(sb2)) {
            List list = (List) this.f4250d.get(sb2);
            if (list.size() == 1) {
                Map<String, List<EventAnimationDriver>> map = this.f4250d;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                sb3.append(str);
                map.remove(sb3.toString());
                return;
            }
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (((EventAnimationDriver) listIterator.next()).mValueNode.f4304d == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4815a(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        C1328b bVar = (C1328b) this.f4247a.get(i2);
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i2);
            sb.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        } else if (bVar instanceof C1326Q) {
            ReadableArray array = readableMap.getArray("nativeEventPath");
            ArrayList arrayList = new ArrayList(array.size());
            for (int i3 = 0; i3 < array.size(); i3++) {
                arrayList.add(array.getString(i3));
            }
            EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (C1326Q) bVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(str);
            String sb3 = sb2.toString();
            if (this.f4250d.containsKey(sb3)) {
                ((List) this.f4250d.get(sb3)).add(eventAnimationDriver);
                return;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(eventAnimationDriver);
            this.f4250d.put(sb3, arrayList2);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Animated node connected to event should beof type ");
            sb4.append(C1326Q.class.getName());
            throw new JSApplicationIllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    public void mo4816a(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.f4249c.size(); i++) {
            this.f4254h.add((C1328b) this.f4249c.valueAt(i));
        }
        this.f4249c.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.f4248b.size(); i2++) {
            C1330d dVar = (C1330d) this.f4248b.valueAt(i2);
            dVar.mo4833a(j);
            this.f4254h.add(dVar.f4306b);
            if (dVar.f4305a) {
                z = true;
            }
        }
        m5636a(this.f4254h);
        this.f4254h.clear();
        if (z) {
            for (int size = this.f4248b.size() - 1; size >= 0; size--) {
                C1330d dVar2 = (C1330d) this.f4248b.valueAt(size);
                if (dVar2.f4305a) {
                    if (dVar2.f4307c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        dVar2.f4307c.invoke(createMap);
                    }
                    this.f4248b.removeAt(size);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4817a(C1635c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            m5637b(cVar);
        } else {
            UiThreadUtil.runOnUiThread(new C1311G(this, cVar));
        }
    }

    /* renamed from: a */
    public boolean mo4818a() {
        return this.f4248b.size() > 0 || this.f4249c.size() > 0;
    }

    /* renamed from: b */
    public void mo4819b(int i) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null || !(bVar instanceof C1326Q)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        ((C1326Q) bVar).mo4862b();
    }

    /* renamed from: b */
    public void mo4820b(int i, double d) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null || !(bVar instanceof C1326Q)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        m5635a(bVar);
        ((C1326Q) bVar).f4296e = d;
        this.f4249c.put(i, bVar);
    }

    /* renamed from: b */
    public void mo4821b(int i, int i2) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        String str = " does not exists";
        String str2 = "Animated node with tag ";
        if (bVar != null) {
            C1328b bVar2 = (C1328b) this.f4247a.get(i2);
            if (bVar2 != null) {
                bVar.mo4866a(bVar2);
                this.f4249c.put(i2, bVar2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2);
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(i);
        sb2.append(str);
        throw new JSApplicationIllegalArgumentException(sb2.toString());
    }

    /* renamed from: c */
    public void mo4822c(int i) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null || !(bVar instanceof C1326Q)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        ((C1326Q) bVar).mo4863c();
    }

    /* renamed from: c */
    public void mo4823c(int i, int i2) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        } else if (bVar instanceof C1313I) {
            ((C1313I) bVar).mo4831b(i2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Animated node connected to view should beof type ");
            sb2.append(C1313I.class.getName());
            throw new JSApplicationIllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1328b mo4824d(int i) {
        return (C1328b) this.f4247a.get(i);
    }

    /* renamed from: d */
    public void mo4825d(int i, int i2) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        String str = " does not exists";
        String str2 = "Animated node with tag ";
        if (bVar != null) {
            C1328b bVar2 = (C1328b) this.f4247a.get(i2);
            if (bVar2 != null) {
                bVar.mo4869d(bVar2);
                this.f4249c.put(i2, bVar2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2);
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(i);
        sb2.append(str);
        throw new JSApplicationIllegalArgumentException(sb2.toString());
    }

    /* renamed from: e */
    public void mo4826e(int i) {
        for (int i2 = 0; i2 < this.f4248b.size(); i2++) {
            C1330d dVar = (C1330d) this.f4248b.valueAt(i2);
            if (dVar.f4308d == i) {
                if (dVar.f4307c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    dVar.f4307c.invoke(createMap);
                }
                this.f4248b.removeAt(i2);
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo4827e(int i, int i2) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar != null) {
            if (bVar instanceof C1313I) {
                ((C1313I) bVar).mo4830b();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node connected to view should beof type ");
            sb.append(C1313I.class.getName());
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    public void mo4828f(int i) {
        C1328b bVar = (C1328b) this.f4247a.get(i);
        if (bVar == null || !(bVar instanceof C1326Q)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animated node with tag ");
            sb.append(i);
            sb.append(" does not exists or is not a 'value' node");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        ((C1326Q) bVar).mo4861a(null);
    }
}
