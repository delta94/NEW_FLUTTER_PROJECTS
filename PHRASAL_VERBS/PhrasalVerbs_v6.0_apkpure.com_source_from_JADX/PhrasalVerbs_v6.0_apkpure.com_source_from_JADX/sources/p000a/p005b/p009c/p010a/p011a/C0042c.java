package p000a.p005b.p009c.p010a.p011a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p006a.C0016c;
import p000a.p005b.p009c.p016e.C0079a;

/* renamed from: a.b.c.a.a.c */
public class C0042c {

    /* renamed from: a.b.c.a.a.c$a */
    public interface C0043a {
    }

    /* renamed from: a.b.c.a.a.c$b */
    public static final class C0044b implements C0043a {

        /* renamed from: a */
        private final C0045c[] f126a;

        public C0044b(C0045c[] cVarArr) {
            this.f126a = cVarArr;
        }

        /* renamed from: a */
        public C0045c[] mo189a() {
            return this.f126a;
        }
    }

    /* renamed from: a.b.c.a.a.c$c */
    public static final class C0045c {

        /* renamed from: a */
        private final String f127a;

        /* renamed from: b */
        private int f128b;

        /* renamed from: c */
        private boolean f129c;

        /* renamed from: d */
        private String f130d;

        /* renamed from: e */
        private int f131e;

        /* renamed from: f */
        private int f132f;

        public C0045c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f127a = str;
            this.f128b = i;
            this.f129c = z;
            this.f130d = str2;
            this.f131e = i2;
            this.f132f = i3;
        }

        /* renamed from: a */
        public String mo190a() {
            return this.f127a;
        }

        /* renamed from: b */
        public int mo191b() {
            return this.f132f;
        }

        /* renamed from: c */
        public int mo192c() {
            return this.f131e;
        }

        /* renamed from: d */
        public String mo193d() {
            return this.f130d;
        }

        /* renamed from: e */
        public int mo194e() {
            return this.f128b;
        }

        /* renamed from: f */
        public boolean mo195f() {
            return this.f129c;
        }
    }

    /* renamed from: a.b.c.a.a.c$d */
    public static final class C0046d implements C0043a {

        /* renamed from: a */
        private final C0079a f133a;

        /* renamed from: b */
        private final int f134b;

        /* renamed from: c */
        private final int f135c;

        public C0046d(C0079a aVar, int i, int i2) {
            this.f133a = aVar;
            this.f135c = i;
            this.f134b = i2;
        }

        /* renamed from: a */
        public int mo196a() {
            return this.f135c;
        }

        /* renamed from: b */
        public C0079a mo197b() {
            return this.f133a;
        }

        /* renamed from: c */
        public int mo198c() {
            return this.f134b;
        }
    }

    /* renamed from: a */
    private static int m129a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static C0043a m130a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m134b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m131a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m129a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m132a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m132a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m132a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m133a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: b */
    private static C0043a m134b(XmlPullParser xmlPullParser, Resources resources) {
        String str = "font-family";
        xmlPullParser.require(2, null, str);
        if (xmlPullParser.getName().equals(str)) {
            return m135c(xmlPullParser, resources);
        }
        m133a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0043a m135c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0016c.FontFamily);
        String string = obtainAttributes.getString(C0016c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0016c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0016c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0016c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0016c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0016c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m136d(xmlPullParser, resources));
                    } else {
                        m133a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0044b((C0045c[]) arrayList.toArray(new C0045c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m133a(xmlPullParser);
        }
        return new C0046d(new C0079a(string, string2, string3, m131a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0045c m136d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0016c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0016c.FontFamilyFont_fontWeight) ? C0016c.FontFamilyFont_fontWeight : C0016c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0016c.FontFamilyFont_fontStyle) ? C0016c.FontFamilyFont_fontStyle : C0016c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0016c.FontFamilyFont_ttcIndex) ? C0016c.FontFamilyFont_ttcIndex : C0016c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0016c.FontFamilyFont_fontVariationSettings) ? C0016c.FontFamilyFont_fontVariationSettings : C0016c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0016c.FontFamilyFont_font) ? C0016c.FontFamilyFont_font : C0016c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m133a(xmlPullParser);
        }
        C0045c cVar = new C0045c(string2, i, z, string, i3, resourceId);
        return cVar;
    }
}
