package android.support.p029v4.app;

import android.support.p029v4.app.C0287p.C0288a;
import android.support.p029v4.util.C0325g;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.c */
final class C0268c extends C0235C implements C0288a, C0305h {

    /* renamed from: a */
    final C0297w f701a;

    /* renamed from: b */
    ArrayList<C0269a> f702b = new ArrayList<>();

    /* renamed from: c */
    int f703c;

    /* renamed from: d */
    int f704d;

    /* renamed from: e */
    int f705e;

    /* renamed from: f */
    int f706f;

    /* renamed from: g */
    int f707g;

    /* renamed from: h */
    int f708h;

    /* renamed from: i */
    boolean f709i;

    /* renamed from: j */
    boolean f710j = true;

    /* renamed from: k */
    String f711k;

    /* renamed from: l */
    boolean f712l;

    /* renamed from: m */
    int f713m = -1;

    /* renamed from: n */
    int f714n;

    /* renamed from: o */
    CharSequence f715o;

    /* renamed from: p */
    int f716p;

    /* renamed from: q */
    CharSequence f717q;

    /* renamed from: r */
    ArrayList<String> f718r;

    /* renamed from: s */
    ArrayList<String> f719s;

    /* renamed from: t */
    boolean f720t = false;

    /* renamed from: u */
    ArrayList<Runnable> f721u;

    /* renamed from: android.support.v4.app.c$a */
    static final class C0269a {

        /* renamed from: a */
        int f722a;

        /* renamed from: b */
        C0276j f723b;

        /* renamed from: c */
        int f724c;

        /* renamed from: d */
        int f725d;

        /* renamed from: e */
        int f726e;

        /* renamed from: f */
        int f727f;

        C0269a() {
        }

        C0269a(int i, C0276j jVar) {
            this.f722a = i;
            this.f723b = jVar;
        }
    }

    public C0268c(C0297w wVar) {
        this.f701a = wVar;
    }

    /* renamed from: a */
    private void m972a(int i, C0276j jVar, String str, int i2) {
        Class cls = jVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from");
            sb.append(" instance state.");
            throw new IllegalStateException(sb.toString());
        }
        jVar.f795t = this.f701a;
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = jVar.f755B;
            if (str4 == null || str.equals(str4)) {
                jVar.f755B = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(jVar);
                sb2.append(str3);
                sb2.append(jVar.f755B);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = jVar.f801z;
                if (i3 == 0 || i3 == i) {
                    jVar.f801z = i;
                    jVar.f754A = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(jVar);
                    sb3.append(str3);
                    sb3.append(jVar.f801z);
                    sb3.append(str2);
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(jVar);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        mo929a(new C0269a(i2, jVar));
    }

    /* renamed from: b */
    private static boolean m973b(C0269a aVar) {
        C0276j jVar = aVar.f723b;
        return jVar != null && jVar.f788m && jVar.f764K != null && !jVar.f757D && !jVar.f756C && jVar.mo974E();
    }

    /* renamed from: a */
    public int mo846a() {
        return mo926a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo926a(boolean z) {
        if (!this.f712l) {
            if (C0297w.f856a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                String str = "FragmentManager";
                Log.v(str, sb.toString());
                PrintWriter printWriter = new PrintWriter(new C0325g(str));
                mo931a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f712l = true;
            this.f713m = this.f709i ? this.f701a.mo1193b(this) : -1;
            this.f701a.mo1187a((C0305h) this, z);
            return this.f713m;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: a */
    public C0235C mo847a(C0276j jVar) {
        mo929a(new C0269a(3, jVar));
        return this;
    }

    /* renamed from: a */
    public C0235C mo848a(C0276j jVar, String str) {
        m972a(0, jVar, str, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0276j mo927a(ArrayList<C0276j> arrayList, C0276j jVar) {
        ArrayList<C0276j> arrayList2 = arrayList;
        C0276j jVar2 = jVar;
        int i = 0;
        while (i < this.f702b.size()) {
            C0269a aVar = (C0269a) this.f702b.get(i);
            int i2 = aVar.f722a;
            if (i2 != 1) {
                if (i2 == 2) {
                    C0276j jVar3 = aVar.f723b;
                    int i3 = jVar3.f754A;
                    C0276j jVar4 = jVar2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C0276j jVar5 = (C0276j) arrayList2.get(size);
                        if (jVar5.f754A == i3) {
                            if (jVar5 == jVar3) {
                                z = true;
                            } else {
                                if (jVar5 == jVar4) {
                                    this.f702b.add(i4, new C0269a(9, jVar5));
                                    i4++;
                                    jVar4 = null;
                                }
                                C0269a aVar2 = new C0269a(3, jVar5);
                                aVar2.f724c = aVar.f724c;
                                aVar2.f726e = aVar.f726e;
                                aVar2.f725d = aVar.f725d;
                                aVar2.f727f = aVar.f727f;
                                this.f702b.add(i4, aVar2);
                                arrayList2.remove(jVar5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f702b.remove(i4);
                        i4--;
                    } else {
                        aVar.f722a = 1;
                        arrayList2.add(jVar3);
                    }
                    i = i4;
                    jVar2 = jVar4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f723b);
                    C0276j jVar6 = aVar.f723b;
                    if (jVar6 == jVar2) {
                        this.f702b.add(i, new C0269a(9, jVar6));
                        i++;
                        jVar2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f702b.add(i, new C0269a(9, jVar2));
                        i++;
                        jVar2 = aVar.f723b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f723b);
            i++;
        }
        return jVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo928a(int i) {
        if (this.f709i) {
            String str = "FragmentManager";
            if (C0297w.f856a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v(str, sb.toString());
            }
            int size = this.f702b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0269a aVar = (C0269a) this.f702b.get(i2);
                C0276j jVar = aVar.f723b;
                if (jVar != null) {
                    jVar.f794s += i;
                    if (C0297w.f856a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f723b);
                        sb2.append(" to ");
                        sb2.append(aVar.f723b.f794s);
                        Log.v(str, sb2.toString());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo929a(C0269a aVar) {
        this.f702b.add(aVar);
        aVar.f724c = this.f703c;
        aVar.f725d = this.f704d;
        aVar.f726e = this.f705e;
        aVar.f727f = this.f706f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo930a(C0279c cVar) {
        for (int i = 0; i < this.f702b.size(); i++) {
            C0269a aVar = (C0269a) this.f702b.get(i);
            if (m973b(aVar)) {
                aVar.f723b.mo1006a(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo931a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo932a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo932a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f711k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f713m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f712l);
            if (this.f707g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f707g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f708h));
            }
            if (!(this.f703c == 0 && this.f704d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f703c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f704d));
            }
            if (!(this.f705e == 0 && this.f706f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f705e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f706f));
            }
            if (!(this.f714n == 0 && this.f715o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f714n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f715o);
            }
            if (!(this.f716p == 0 && this.f717q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f716p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f717q);
            }
        }
        if (!this.f702b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            sb.toString();
            int size = this.f702b.size();
            for (int i = 0; i < size; i++) {
                C0269a aVar = (C0269a) this.f702b.get(i);
                switch (aVar.f722a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("cmd=");
                        sb2.append(aVar.f722a);
                        str2 = sb2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f723b);
                if (z) {
                    if (!(aVar.f724c == 0 && aVar.f725d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f724c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f725d));
                    }
                    if (aVar.f726e != 0 || aVar.f727f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f726e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f727f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo933a(ArrayList<C0268c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f702b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0276j jVar = ((C0269a) this.f702b.get(i4)).f723b;
            int i5 = jVar != null ? jVar.f754A : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0268c cVar = (C0268c) arrayList.get(i6);
                    int size2 = cVar.f702b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0276j jVar2 = ((C0269a) cVar.f702b.get(i7)).f723b;
                        if ((jVar2 != null ? jVar2.f754A : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo934a(ArrayList<C0268c> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0297w.f856a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f709i) {
            this.f701a.mo1178a(this);
        }
        return true;
    }

    /* renamed from: b */
    public int mo849b() {
        return mo926a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0276j mo935b(ArrayList<C0276j> arrayList, C0276j jVar) {
        for (int i = 0; i < this.f702b.size(); i++) {
            C0269a aVar = (C0269a) this.f702b.get(i);
            int i2 = aVar.f722a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            jVar = null;
                            break;
                        case 9:
                            jVar = aVar.f723b;
                            break;
                    }
                }
                arrayList.add(aVar.f723b);
            }
            arrayList.remove(aVar.f723b);
        }
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo936b(boolean z) {
        for (int size = this.f702b.size() - 1; size >= 0; size--) {
            C0269a aVar = (C0269a) this.f702b.get(size);
            C0276j jVar = aVar.f723b;
            if (jVar != null) {
                jVar.mo997a(C0297w.m1230d(this.f707g), this.f708h);
            }
            switch (aVar.f722a) {
                case 1:
                    jVar.mo996a(aVar.f727f);
                    this.f701a.mo1227k(jVar);
                    break;
                case 3:
                    jVar.mo996a(aVar.f726e);
                    this.f701a.mo1185a(jVar, false);
                    break;
                case 4:
                    jVar.mo996a(aVar.f726e);
                    this.f701a.mo1234o(jVar);
                    break;
                case 5:
                    jVar.mo996a(aVar.f727f);
                    this.f701a.mo1211e(jVar);
                    break;
                case 6:
                    jVar.mo996a(aVar.f726e);
                    this.f701a.mo1180a(jVar);
                    break;
                case 7:
                    jVar.mo996a(aVar.f727f);
                    this.f701a.mo1203c(jVar);
                    break;
                case 8:
                    this.f701a.mo1233n(null);
                    break;
                case 9:
                    this.f701a.mo1233n(jVar);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f722a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f720t || aVar.f722a == 3 || jVar == null)) {
                this.f701a.mo1220h(jVar);
            }
        }
        if (!this.f720t && z) {
            C0297w wVar = this.f701a;
            wVar.mo1174a(wVar.f883r, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo937b(int i) {
        int size = this.f702b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0276j jVar = ((C0269a) this.f702b.get(i2)).f723b;
            int i3 = jVar != null ? jVar.f754A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo938c() {
        int size = this.f702b.size();
        for (int i = 0; i < size; i++) {
            C0269a aVar = (C0269a) this.f702b.get(i);
            C0276j jVar = aVar.f723b;
            if (jVar != null) {
                jVar.mo997a(this.f707g, this.f708h);
            }
            switch (aVar.f722a) {
                case 1:
                    jVar.mo996a(aVar.f724c);
                    this.f701a.mo1185a(jVar, false);
                    break;
                case 3:
                    jVar.mo996a(aVar.f725d);
                    this.f701a.mo1227k(jVar);
                    break;
                case 4:
                    jVar.mo996a(aVar.f725d);
                    this.f701a.mo1211e(jVar);
                    break;
                case 5:
                    jVar.mo996a(aVar.f724c);
                    this.f701a.mo1234o(jVar);
                    break;
                case 6:
                    jVar.mo996a(aVar.f725d);
                    this.f701a.mo1203c(jVar);
                    break;
                case 7:
                    jVar.mo996a(aVar.f724c);
                    this.f701a.mo1180a(jVar);
                    break;
                case 8:
                    this.f701a.mo1233n(jVar);
                    break;
                case 9:
                    this.f701a.mo1233n(null);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f722a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f720t || aVar.f722a == 1 || jVar == null)) {
                this.f701a.mo1220h(jVar);
            }
        }
        if (!this.f720t) {
            C0297w wVar = this.f701a;
            wVar.mo1174a(wVar.f883r, true);
        }
    }

    /* renamed from: d */
    public String mo939d() {
        return this.f711k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo940e() {
        for (int i = 0; i < this.f702b.size(); i++) {
            if (m973b((C0269a) this.f702b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo941f() {
        ArrayList<Runnable> arrayList = this.f721u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f721u.get(i)).run();
            }
            this.f721u = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f713m >= 0) {
            sb.append(" #");
            sb.append(this.f713m);
        }
        if (this.f711k != null) {
            sb.append(" ");
            sb.append(this.f711k);
        }
        sb.append("}");
        return sb.toString();
    }
}
