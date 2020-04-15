package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import p032c.p115b.p116a.C1242c;
import p032c.p115b.p116a.C1243d;

/* renamed from: com.swmansion.gesturehandler.react.d */
public class C1983d implements C1243d {

    /* renamed from: a */
    private SparseArray<int[]> f5893a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<int[]> f5894b = new SparseArray<>();

    /* renamed from: a */
    private int[] m7555a(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int[] iArr = new int[array.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    /* renamed from: a */
    public void mo7018a() {
        this.f5893a.clear();
        this.f5894b.clear();
    }

    /* renamed from: a */
    public void mo7019a(int i) {
        this.f5893a.remove(i);
        this.f5894b.remove(i);
    }

    /* renamed from: a */
    public void mo7020a(C1242c cVar, ReadableMap readableMap) {
        cVar.mo4612a((C1243d) this);
        String str = "waitFor";
        if (readableMap.hasKey(str)) {
            this.f5893a.put(cVar.mo4641l(), m7555a(readableMap, str));
        }
        String str2 = "simultaneousHandlers";
        if (readableMap.hasKey(str2)) {
            this.f5894b.put(cVar.mo4641l(), m7555a(readableMap, str2));
        }
    }

    /* renamed from: a */
    public boolean mo4648a(C1242c cVar, C1242c cVar2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo4649b(C1242c cVar, C1242c cVar2) {
        int[] iArr = (int[]) this.f5894b.get(cVar.mo4641l());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == cVar2.mo4641l()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo4650c(C1242c cVar, C1242c cVar2) {
        int[] iArr = (int[]) this.f5893a.get(cVar.mo4641l());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == cVar2.mo4641l()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo4651d(C1242c cVar, C1242c cVar2) {
        return false;
    }
}
