package p000a.p005b.p009c.p010a.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.b.c.a.a.b */
public final class C0041b {

    /* renamed from: a */
    private final Shader f123a;

    /* renamed from: b */
    private final ColorStateList f124b;

    /* renamed from: c */
    private int f125c;

    private C0041b(Shader shader, ColorStateList colorStateList, int i) {
        this.f123a = shader;
        this.f124b = colorStateList;
        this.f125c = i;
    }

    /* renamed from: a */
    static C0041b m117a(int i) {
        return new C0041b(null, null, i);
    }

    /* renamed from: a */
    static C0041b m118a(ColorStateList colorStateList) {
        return new C0041b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    public static C0041b m119a(Resources resources, int i, Theme theme) {
        try {
            return m121b(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0041b m120a(Shader shader) {
        return new C0041b(shader, null, 0);
    }

    /* renamed from: b */
    private static C0041b m121b(Resources resources, int i, Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m118a(C0040a.m114a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m120a(C0047d.m149a(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public int mo182a() {
        return this.f125c;
    }

    /* renamed from: a */
    public boolean mo183a(int[] iArr) {
        if (mo187d()) {
            ColorStateList colorStateList = this.f124b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f125c) {
                this.f125c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Shader mo184b() {
        return this.f123a;
    }

    /* renamed from: b */
    public void mo185b(int i) {
        this.f125c = i;
    }

    /* renamed from: c */
    public boolean mo186c() {
        return this.f123a != null;
    }

    /* renamed from: d */
    public boolean mo187d() {
        if (this.f123a == null) {
            ColorStateList colorStateList = this.f124b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo188e() {
        return mo186c() || this.f125c != 0;
    }
}
