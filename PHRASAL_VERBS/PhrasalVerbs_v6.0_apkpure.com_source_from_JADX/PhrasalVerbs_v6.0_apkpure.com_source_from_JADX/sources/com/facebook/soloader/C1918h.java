package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C1931q.C1932a;
import com.facebook.soloader.C1931q.C1933b;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.h */
public class C1918h extends C1931q {

    /* renamed from: g */
    protected final File f5700g;

    /* renamed from: h */
    protected final String f5701h;

    /* renamed from: com.facebook.soloader.h$a */
    private static final class C1919a extends C1932a implements Comparable {

        /* renamed from: c */
        final ZipEntry f5702c;

        /* renamed from: d */
        final int f5703d;

        C1919a(String str, ZipEntry zipEntry, int i) {
            super(str, m7291a(zipEntry));
            this.f5702c = zipEntry;
            this.f5703d = i;
        }

        /* renamed from: a */
        private static String m7291a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())});
        }

        public int compareTo(Object obj) {
            return this.f5727a.compareTo(((C1919a) obj).f5727a);
        }
    }

    /* renamed from: com.facebook.soloader.h$b */
    protected class C1920b extends C1936e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C1919a[] f5704a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ZipFile f5705b;

        /* renamed from: c */
        private final C1931q f5706c;

        /* renamed from: com.facebook.soloader.h$b$a */
        private final class C1921a extends C1935d {

            /* renamed from: a */
            private int f5708a;

            private C1921a() {
            }

            /* renamed from: m */
            public boolean mo6807m() {
                C1920b.this.mo6811o();
                return this.f5708a < C1920b.this.f5704a.length;
            }

            /* renamed from: n */
            public C1934c mo6808n() {
                C1920b.this.mo6811o();
                C1919a[] a = C1920b.this.f5704a;
                int i = this.f5708a;
                this.f5708a = i + 1;
                C1919a aVar = a[i];
                InputStream inputStream = C1920b.this.f5705b.getInputStream(aVar.f5702c);
                try {
                    return new C1934c(aVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        C1920b(C1931q qVar) {
            this.f5705b = new ZipFile(C1918h.this.f5700g);
            this.f5706c = qVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo6798a(ZipEntry zipEntry, String str) {
            throw null;
        }

        public void close() {
            this.f5705b.close();
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public final C1933b mo6805m() {
            return new C1933b(mo6811o());
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public final C1935d mo6806n() {
            return new C1921a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public final C1919a[] mo6811o() {
            if (this.f5704a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C1918h.this.f5701h);
                String[] a = SysUtil.m7269a();
                Enumeration entries = this.f5705b.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a2 = SysUtil.m7266a(a, group);
                        if (a2 >= 0) {
                            linkedHashSet.add(group);
                            C1919a aVar = (C1919a) hashMap.get(group2);
                            if (aVar == null || a2 < aVar.f5703d) {
                                hashMap.put(group2, new C1919a(group2, zipEntry, a2));
                            }
                        }
                    }
                }
                this.f5706c.mo6816a((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                C1919a[] aVarArr = (C1919a[]) hashMap.values().toArray(new C1919a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    C1919a aVar2 = aVarArr[i2];
                    if (mo6798a(aVar2.f5702c, aVar2.f5727a)) {
                        i++;
                    } else {
                        aVarArr[i2] = null;
                    }
                }
                C1919a[] aVarArr2 = new C1919a[i];
                int i3 = 0;
                for (C1919a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        int i4 = i3 + 1;
                        aVarArr2[i3] = aVar3;
                        i3 = i4;
                    }
                }
                this.f5704a = aVarArr2;
            }
            return this.f5704a;
        }
    }

    public C1918h(Context context, String str, File file, String str2) {
        super(context, str);
        this.f5700g = file;
        this.f5701h = str2;
    }
}
