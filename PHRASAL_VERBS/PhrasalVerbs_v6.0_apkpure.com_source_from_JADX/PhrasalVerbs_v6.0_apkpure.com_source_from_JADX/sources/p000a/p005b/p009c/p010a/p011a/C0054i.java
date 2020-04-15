package p000a.p005b.p009c.p010a.p011a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.b.c.a.a.i */
public class C0054i {
    /* renamed from: a */
    public static float m162a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m168a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m163a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m168a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static C0041b m164a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m168a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0041b.m117a(typedValue.data);
            }
            C0041b a = C0041b.m119a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0041b.m117a(i2);
    }

    /* renamed from: a */
    public static TypedArray m165a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m166a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m168a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m167a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m168a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m168a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m169b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m168a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m170b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m168a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m171c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m168a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
