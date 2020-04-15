package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.views.text.j */
public class C1821j {

    /* renamed from: a */
    private static final String[] f5405a = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: b */
    private static final String[] f5406b = {".ttf", ".otf"};

    /* renamed from: c */
    private static C1821j f5407c;

    /* renamed from: d */
    private Map<String, C1822a> f5408d = new HashMap();

    /* renamed from: com.facebook.react.views.text.j$a */
    private static class C1822a {

        /* renamed from: a */
        private SparseArray<Typeface> f5409a;

        private C1822a() {
            this.f5409a = new SparseArray<>(4);
        }

        /* renamed from: a */
        public Typeface mo6405a(int i) {
            return (Typeface) this.f5409a.get(i);
        }

        /* renamed from: a */
        public void mo6406a(int i, Typeface typeface) {
            this.f5409a.put(i, typeface);
        }
    }

    private C1821j() {
    }

    /* renamed from: a */
    public static C1821j m6935a() {
        if (f5407c == null) {
            f5407c = new C1821j();
        }
        return f5407c;
    }

    /* renamed from: b */
    private static Typeface m6936b(String str, int i, AssetManager assetManager) {
        String str2 = f5405a[i];
        String[] strArr = f5406b;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArr[i2];
            StringBuilder sb = new StringBuilder();
            sb.append("fonts/");
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            try {
                return Typeface.createFromAsset(assetManager, sb.toString());
            } catch (RuntimeException unused) {
                i2++;
            }
        }
        return Typeface.create(str, i);
    }

    /* renamed from: a */
    public Typeface mo6404a(String str, int i, AssetManager assetManager) {
        C1822a aVar = (C1822a) this.f5408d.get(str);
        if (aVar == null) {
            aVar = new C1822a();
            this.f5408d.put(str, aVar);
        }
        Typeface a = aVar.mo6405a(i);
        if (a == null) {
            a = m6936b(str, i, assetManager);
            if (a != null) {
                aVar.mo6406a(i, a);
            }
        }
        return a;
    }
}
