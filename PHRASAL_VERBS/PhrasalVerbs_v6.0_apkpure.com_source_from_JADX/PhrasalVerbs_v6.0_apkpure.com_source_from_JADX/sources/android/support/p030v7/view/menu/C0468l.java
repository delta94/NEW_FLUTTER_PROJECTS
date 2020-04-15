package android.support.p030v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p013c.p014a.C0075a;
import p000a.p005b.p009c.p018g.C0159w;

/* renamed from: android.support.v7.view.menu.l */
public class C0468l implements C0075a {

    /* renamed from: a */
    private static final int[] f1699a = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f1700A;

    /* renamed from: b */
    private final Context f1701b;

    /* renamed from: c */
    private final Resources f1702c;

    /* renamed from: d */
    private boolean f1703d;

    /* renamed from: e */
    private boolean f1704e;

    /* renamed from: f */
    private C0469a f1705f;

    /* renamed from: g */
    private ArrayList<C0474p> f1706g;

    /* renamed from: h */
    private ArrayList<C0474p> f1707h;

    /* renamed from: i */
    private boolean f1708i;

    /* renamed from: j */
    private ArrayList<C0474p> f1709j;

    /* renamed from: k */
    private ArrayList<C0474p> f1710k;

    /* renamed from: l */
    private boolean f1711l;

    /* renamed from: m */
    private int f1712m = 0;

    /* renamed from: n */
    private ContextMenuInfo f1713n;

    /* renamed from: o */
    CharSequence f1714o;

    /* renamed from: p */
    Drawable f1715p;

    /* renamed from: q */
    View f1716q;

    /* renamed from: r */
    private boolean f1717r = false;

    /* renamed from: s */
    private boolean f1718s = false;

    /* renamed from: t */
    private boolean f1719t = false;

    /* renamed from: u */
    private boolean f1720u = false;

    /* renamed from: v */
    private boolean f1721v = false;

    /* renamed from: w */
    private ArrayList<C0474p> f1722w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0485v>> f1723x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0474p f1724y;

    /* renamed from: z */
    private boolean f1725z = false;

    /* renamed from: android.support.v7.view.menu.l$a */
    public interface C0469a {
        /* renamed from: a */
        void mo728a(C0468l lVar);

        /* renamed from: a */
        boolean mo729a(C0468l lVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.l$b */
    public interface C0470b {
        /* renamed from: a */
        boolean mo2091a(C0474p pVar);
    }

    public C0468l(Context context) {
        this.f1701b = context;
        this.f1702c = context.getResources();
        this.f1706g = new ArrayList<>();
        this.f1707h = new ArrayList<>();
        this.f1708i = true;
        this.f1709j = new ArrayList<>();
        this.f1710k = new ArrayList<>();
        this.f1711l = true;
        m2195e(true);
    }

    /* renamed from: a */
    private static int m2189a(ArrayList<C0474p> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0474p) arrayList.get(size)).mo2256c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0474p m2190a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        C0474p pVar = new C0474p(this, i, i2, i3, i4, charSequence, i5);
        return pVar;
    }

    /* renamed from: a */
    private void m2191a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo2233l();
        if (view != null) {
            this.f1716q = view;
            this.f1714o = null;
            this.f1715p = null;
        } else {
            if (i > 0) {
                this.f1714o = l.getText(i);
            } else if (charSequence != null) {
                this.f1714o = charSequence;
            }
            if (i2 > 0) {
                this.f1715p = C0039a.m111c(mo2221e(), i2);
            } else if (drawable != null) {
                this.f1715p = drawable;
            }
            this.f1716q = null;
        }
        mo2211b(false);
    }

    /* renamed from: a */
    private void m2192a(int i, boolean z) {
        if (i >= 0 && i < this.f1706g.size()) {
            this.f1706g.remove(i);
            if (z) {
                mo2211b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m2193a(C0453D d, C0485v vVar) {
        boolean z = false;
        if (this.f1723x.isEmpty()) {
            return false;
        }
        if (vVar != null) {
            z = vVar.mo2049a(d);
        }
        Iterator it = this.f1723x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0485v vVar2 = (C0485v) weakReference.get();
            if (vVar2 == null) {
                this.f1723x.remove(weakReference);
            } else if (!z) {
                z = vVar2.mo2049a(d);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m2194d(boolean z) {
        if (!this.f1723x.isEmpty()) {
            mo2240s();
            Iterator it = this.f1723x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0485v vVar = (C0485v) weakReference.get();
                if (vVar == null) {
                    this.f1723x.remove(weakReference);
                } else {
                    vVar.mo2047a(z);
                }
            }
            mo2237r();
        }
    }

    /* renamed from: e */
    private void m2195e(boolean z) {
        boolean z2 = true;
        if (!z || this.f1702c.getConfiguration().keyboard == 1 || !C0159w.m591a(ViewConfiguration.get(this.f1701b), this.f1701b)) {
            z2 = false;
        }
        this.f1704e = z2;
    }

    /* renamed from: f */
    private static int m2196f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1699a;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public int mo2182a(int i) {
        return mo2183a(i, 0);
    }

    /* renamed from: a */
    public int mo2183a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0474p) this.f1706g.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0468l mo2184a(Drawable drawable) {
        m2191a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0468l mo2185a(View view) {
        m2191a(0, null, 0, null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0468l mo2186a(CharSequence charSequence) {
        m2191a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0474p mo2187a(int i, KeyEvent keyEvent) {
        ArrayList<C0474p> arrayList = this.f1722w;
        arrayList.clear();
        mo2194a((List<C0474p>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0474p) arrayList.get(0);
        }
        boolean p = mo2068p();
        for (int i2 = 0; i2 < size; i2++) {
            C0474p pVar = (C0474p) arrayList.get(i2);
            char alphabeticShortcut = p ? pVar.getAlphabeticShortcut() : pVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p && alphabeticShortcut == 8 && i == 67))) {
                return pVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo2188a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m2196f(i3);
        C0474p a = m2190a(i, i2, i3, f, charSequence, this.f1712m);
        ContextMenuInfo contextMenuInfo = this.f1713n;
        if (contextMenuInfo != null) {
            a.mo2252a(contextMenuInfo);
        }
        ArrayList<C0474p> arrayList = this.f1706g;
        arrayList.add(m2189a(arrayList, f), a);
        mo2211b(true);
        return a;
    }

    /* renamed from: a */
    public void mo2189a() {
        C0469a aVar = this.f1705f;
        if (aVar != null) {
            aVar.mo728a(this);
        }
    }

    /* renamed from: a */
    public void mo2190a(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo2064d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0453D) item.getSubMenu()).mo2190a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2060a(C0469a aVar) {
        this.f1705f = aVar;
    }

    /* renamed from: a */
    public void mo2191a(C0485v vVar) {
        mo2192a(vVar, this.f1701b);
    }

    /* renamed from: a */
    public void mo2192a(C0485v vVar, Context context) {
        this.f1723x.add(new WeakReference(vVar));
        vVar.mo2141a(context, this);
        this.f1711l = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2193a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1706g.size();
        mo2240s();
        for (int i = 0; i < size; i++) {
            C0474p pVar = (C0474p) this.f1706g.get(i);
            if (pVar.getGroupId() == groupId && pVar.mo2278i() && pVar.isCheckable()) {
                pVar.mo2255b(pVar == menuItem);
            }
        }
        mo2237r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2194a(List<C0474p> list, int i, KeyEvent keyEvent) {
        boolean p = mo2068p();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1706g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0474p pVar = (C0474p) this.f1706g.get(i2);
                if (pVar.hasSubMenu()) {
                    ((C0468l) pVar.getSubMenu()).mo2194a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? pVar.getAlphabeticShortcut() : pVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? pVar.getAlphabeticModifiers() : pVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == 8 && i == 67)) && pVar.isEnabled()) {
                        list.add(pVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2195a(boolean z) {
        if (!this.f1721v) {
            this.f1721v = true;
            Iterator it = this.f1723x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0485v vVar = (C0485v) weakReference.get();
                if (vVar == null) {
                    this.f1723x.remove(weakReference);
                } else {
                    vVar.mo2043a(this, z);
                }
            }
            this.f1721v = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2061a(C0468l lVar, MenuItem menuItem) {
        C0469a aVar = this.f1705f;
        return aVar != null && aVar.mo729a(lVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo2062a(C0474p pVar) {
        boolean z = false;
        if (!this.f1723x.isEmpty() && this.f1724y == pVar) {
            mo2240s();
            Iterator it = this.f1723x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0485v vVar = (C0485v) weakReference.get();
                if (vVar == null) {
                    this.f1723x.remove(weakReference);
                } else {
                    z = vVar.mo2149b(this, pVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo2237r();
            if (z) {
                this.f1724y = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2196a(MenuItem menuItem, int i) {
        return mo2197a(menuItem, (C0485v) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2197a(android.view.MenuItem r7, android.support.p030v7.view.menu.C0485v r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.p r7 = (android.support.p030v7.view.menu.C0474p) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo2263g()
            a.b.c.g.e r2 = r7.mo242a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo493a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo2262f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo2195a(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo2195a(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            android.support.v7.view.menu.D r9 = new android.support.v7.view.menu.D
            android.content.Context r0 = r6.mo2221e()
            r9.<init>(r0, r6, r7)
            r7.mo2251a(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.D r7 = (android.support.p030v7.view.menu.C0453D) r7
            if (r4 == 0) goto L_0x0063
            r2.mo492a(r7)
        L_0x0063:
            boolean r7 = r6.m2193a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.view.menu.C0468l.mo2197a(android.view.MenuItem, android.support.v7.view.menu.v, int):boolean");
    }

    public MenuItem add(int i) {
        return mo2188a(0, 0, 0, this.f1702c.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2188a(i, i2, i3, this.f1702c.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2188a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2188a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1701b.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            int i6 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i6 < 0 ? intent : intentArr[i6]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null) {
                int i7 = resolveInfo.specificIndex;
                if (i7 >= 0) {
                    menuItemArr[i7] = intent3;
                }
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1702c.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1702c.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0474p pVar = (C0474p) mo2188a(i, i2, i3, charSequence);
        C0453D d = new C0453D(this.f1701b, this, pVar);
        pVar.mo2251a(d);
        return d;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo2207b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0474p) this.f1706g.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo2208b() {
        ArrayList n = mo2234n();
        if (this.f1711l) {
            Iterator it = this.f1723x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0485v vVar = (C0485v) weakReference.get();
                if (vVar == null) {
                    this.f1723x.remove(weakReference);
                } else {
                    z |= vVar.mo2048a();
                }
            }
            if (z) {
                this.f1709j.clear();
                this.f1710k.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0474p pVar = (C0474p) n.get(i);
                    (pVar.mo2276h() ? this.f1709j : this.f1710k).add(pVar);
                }
            } else {
                this.f1709j.clear();
                this.f1710k.clear();
                this.f1710k.addAll(mo2234n());
            }
            this.f1711l = false;
        }
    }

    /* renamed from: b */
    public void mo2209b(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0453D) item.getSubMenu()).mo2209b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2064d(), sparseArray);
        }
    }

    /* renamed from: b */
    public void mo2210b(C0485v vVar) {
        Iterator it = this.f1723x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0485v vVar2 = (C0485v) weakReference.get();
            if (vVar2 == null || vVar2 == vVar) {
                this.f1723x.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void mo2211b(boolean z) {
        if (!this.f1717r) {
            if (z) {
                this.f1708i = true;
                this.f1711l = true;
            }
            m2194d(z);
            return;
        }
        this.f1718s = true;
        if (z) {
            this.f1719t = true;
        }
    }

    /* renamed from: b */
    public boolean mo2063b(C0474p pVar) {
        boolean z = false;
        if (this.f1723x.isEmpty()) {
            return false;
        }
        mo2240s();
        Iterator it = this.f1723x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0485v vVar = (C0485v) weakReference.get();
            if (vVar == null) {
                this.f1723x.remove(weakReference);
            } else {
                z = vVar.mo2145a(this, pVar);
                if (z) {
                    break;
                }
            }
        }
        mo2237r();
        if (z) {
            this.f1724y = pVar;
        }
        return z;
    }

    /* renamed from: c */
    public C0468l mo2212c(int i) {
        this.f1712m = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0474p> mo2213c() {
        mo2208b();
        return this.f1709j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2214c(C0474p pVar) {
        this.f1711l = true;
        mo2211b(true);
    }

    /* renamed from: c */
    public void mo2215c(boolean z) {
        this.f1700A = z;
    }

    public void clear() {
        C0474p pVar = this.f1724y;
        if (pVar != null) {
            mo2062a(pVar);
        }
        this.f1706g.clear();
        mo2211b(true);
    }

    public void clearHeader() {
        this.f1715p = null;
        this.f1714o = null;
        this.f1716q = null;
        mo2211b(false);
    }

    public void close() {
        mo2195a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0468l mo2219d(int i) {
        m2191a(0, null, i, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo2064d() {
        return "android:menu:actionviewstates";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2220d(C0474p pVar) {
        this.f1708i = true;
        mo2211b(true);
    }

    /* renamed from: e */
    public Context mo2221e() {
        return this.f1701b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0468l mo2222e(int i) {
        m2191a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: f */
    public C0474p mo2223f() {
        return this.f1724y;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0474p pVar = (C0474p) this.f1706g.get(i2);
            if (pVar.getItemId() == i) {
                return pVar;
            }
            if (pVar.hasSubMenu()) {
                MenuItem findItem = pVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo2225g() {
        return this.f1715p;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f1706g.get(i);
    }

    /* renamed from: h */
    public CharSequence mo2227h() {
        return this.f1714o;
    }

    public boolean hasVisibleItems() {
        if (this.f1700A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0474p) this.f1706g.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo2229i() {
        return this.f1716q;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo2187a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0474p> mo2231j() {
        mo2208b();
        return this.f1710k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo2232k() {
        return this.f1720u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Resources mo2233l() {
        return this.f1702c;
    }

    /* renamed from: m */
    public C0468l mo2066m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0474p> mo2234n() {
        if (!this.f1708i) {
            return this.f1707h;
        }
        this.f1707h.clear();
        int size = this.f1706g.size();
        for (int i = 0; i < size; i++) {
            C0474p pVar = (C0474p) this.f1706g.get(i);
            if (pVar.isVisible()) {
                this.f1707h.add(pVar);
            }
        }
        this.f1708i = false;
        this.f1711l = true;
        return this.f1707h;
    }

    /* renamed from: o */
    public boolean mo2067o() {
        return this.f1725z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo2068p() {
        return this.f1703d;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo2196a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0474p a = mo2187a(i, keyEvent);
        boolean a2 = a != null ? mo2196a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo2195a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo2069q() {
        return this.f1704e;
    }

    /* renamed from: r */
    public void mo2237r() {
        this.f1717r = false;
        if (this.f1718s) {
            this.f1718s = false;
            mo2211b(this.f1719t);
        }
    }

    public void removeGroup(int i) {
        int a = mo2182a(i);
        if (a >= 0) {
            int size = this.f1706g.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0474p) this.f1706g.get(a)).getGroupId() != i) {
                    mo2211b(true);
                } else {
                    m2192a(a, false);
                    i2 = i3;
                }
            }
            mo2211b(true);
        }
    }

    public void removeItem(int i) {
        m2192a(mo2207b(i), true);
    }

    /* renamed from: s */
    public void mo2240s() {
        if (!this.f1717r) {
            this.f1717r = true;
            this.f1718s = false;
            this.f1719t = false;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1706g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0474p pVar = (C0474p) this.f1706g.get(i2);
            if (pVar.getGroupId() == i) {
                pVar.mo2257c(z2);
                pVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1725z = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1706g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0474p pVar = (C0474p) this.f1706g.get(i2);
            if (pVar.getGroupId() == i) {
                pVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1706g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0474p pVar = (C0474p) this.f1706g.get(i2);
            if (pVar.getGroupId() == i && pVar.mo2261e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo2211b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1703d = z;
        mo2211b(false);
    }

    public int size() {
        return this.f1706g.size();
    }
}
