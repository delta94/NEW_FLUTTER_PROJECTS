package p000a.p005b.p021d.p028e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.support.p030v7.view.menu.C0474p;
import android.support.p030v7.view.menu.C0475q;
import android.support.p030v7.widget.C0525M;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p009c.p013c.p014a.C0075a;
import p000a.p005b.p009c.p018g.C0136e;
import p000a.p005b.p009c.p018g.C0144j;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: a.b.d.e.g */
public class C0199g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f501a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f502b = f501a;

    /* renamed from: c */
    final Object[] f503c;

    /* renamed from: d */
    final Object[] f504d = this.f503c;

    /* renamed from: e */
    Context f505e;

    /* renamed from: f */
    private Object f506f;

    /* renamed from: a.b.d.e.g$a */
    private static class C0200a implements OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f507a = {MenuItem.class};

        /* renamed from: b */
        private Object f508b;

        /* renamed from: c */
        private Method f509c;

        public C0200a(Object obj, String str) {
            this.f508b = obj;
            Class cls = obj.getClass();
            try {
                this.f509c = cls.getMethod(str, f507a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f509c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f509c.invoke(this.f508b, new Object[]{menuItem})).booleanValue();
                }
                this.f509c.invoke(this.f508b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a.b.d.e.g$b */
    private class C0201b {

        /* renamed from: A */
        C0136e f510A;

        /* renamed from: B */
        private CharSequence f511B;

        /* renamed from: C */
        private CharSequence f512C;

        /* renamed from: D */
        private ColorStateList f513D = null;

        /* renamed from: E */
        private Mode f514E = null;

        /* renamed from: a */
        private Menu f516a;

        /* renamed from: b */
        private int f517b;

        /* renamed from: c */
        private int f518c;

        /* renamed from: d */
        private int f519d;

        /* renamed from: e */
        private int f520e;

        /* renamed from: f */
        private boolean f521f;

        /* renamed from: g */
        private boolean f522g;

        /* renamed from: h */
        private boolean f523h;

        /* renamed from: i */
        private int f524i;

        /* renamed from: j */
        private int f525j;

        /* renamed from: k */
        private CharSequence f526k;

        /* renamed from: l */
        private CharSequence f527l;

        /* renamed from: m */
        private int f528m;

        /* renamed from: n */
        private char f529n;

        /* renamed from: o */
        private int f530o;

        /* renamed from: p */
        private char f531p;

        /* renamed from: q */
        private int f532q;

        /* renamed from: r */
        private int f533r;

        /* renamed from: s */
        private boolean f534s;

        /* renamed from: t */
        private boolean f535t;

        /* renamed from: u */
        private boolean f536u;

        /* renamed from: v */
        private int f537v;

        /* renamed from: w */
        private int f538w;

        /* renamed from: x */
        private String f539x;

        /* renamed from: y */
        private String f540y;

        /* renamed from: z */
        private String f541z;

        public C0201b(Menu menu) {
            this.f516a = menu;
            mo756d();
        }

        /* renamed from: a */
        private char m740a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m741a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = C0199g.this.f505e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }

        /* renamed from: a */
        private void m742a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f534s).setVisible(this.f535t).setEnabled(this.f536u).setCheckable(this.f533r >= 1).setTitleCondensed(this.f527l).setIcon(this.f528m);
            int i = this.f537v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f541z != null) {
                if (!C0199g.this.f505e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0200a(C0199g.this.mo748a(), this.f541z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0474p;
            if (z2) {
                C0474p pVar = (C0474p) menuItem;
            }
            if (this.f533r >= 2) {
                if (z2) {
                    ((C0474p) menuItem).mo2257c(true);
                } else if (menuItem instanceof C0475q) {
                    ((C0475q) menuItem).mo2306a(true);
                }
            }
            String str = this.f539x;
            if (str != null) {
                menuItem.setActionView((View) m741a(str, C0199g.f501a, C0199g.this.f503c));
                z = true;
            }
            int i2 = this.f538w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0136e eVar = this.f510A;
            if (eVar != null) {
                C0144j.m487a(menuItem, eVar);
            }
            C0144j.m491a(menuItem, this.f511B);
            C0144j.m493b(menuItem, this.f512C);
            C0144j.m488a(menuItem, this.f529n, this.f530o);
            C0144j.m492b(menuItem, this.f531p, this.f532q);
            Mode mode = this.f514E;
            if (mode != null) {
                C0144j.m490a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f513D;
            if (colorStateList != null) {
                C0144j.m489a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo751a() {
            this.f523h = true;
            m742a(this.f516a.add(this.f517b, this.f524i, this.f525j, this.f526k));
        }

        /* renamed from: a */
        public void mo752a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0199g.this.f505e.obtainStyledAttributes(attributeSet, C0172j.MenuGroup);
            this.f517b = obtainStyledAttributes.getResourceId(C0172j.MenuGroup_android_id, 0);
            this.f518c = obtainStyledAttributes.getInt(C0172j.MenuGroup_android_menuCategory, 0);
            this.f519d = obtainStyledAttributes.getInt(C0172j.MenuGroup_android_orderInCategory, 0);
            this.f520e = obtainStyledAttributes.getInt(C0172j.MenuGroup_android_checkableBehavior, 0);
            this.f521f = obtainStyledAttributes.getBoolean(C0172j.MenuGroup_android_visible, true);
            this.f522g = obtainStyledAttributes.getBoolean(C0172j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public SubMenu mo753b() {
            this.f523h = true;
            SubMenu addSubMenu = this.f516a.addSubMenu(this.f517b, this.f524i, this.f525j, this.f526k);
            m742a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: b */
        public void mo754b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0199g.this.f505e.obtainStyledAttributes(attributeSet, C0172j.MenuItem);
            this.f524i = obtainStyledAttributes.getResourceId(C0172j.MenuItem_android_id, 0);
            this.f525j = (obtainStyledAttributes.getInt(C0172j.MenuItem_android_menuCategory, this.f518c) & -65536) | (obtainStyledAttributes.getInt(C0172j.MenuItem_android_orderInCategory, this.f519d) & 65535);
            this.f526k = obtainStyledAttributes.getText(C0172j.MenuItem_android_title);
            this.f527l = obtainStyledAttributes.getText(C0172j.MenuItem_android_titleCondensed);
            this.f528m = obtainStyledAttributes.getResourceId(C0172j.MenuItem_android_icon, 0);
            this.f529n = m740a(obtainStyledAttributes.getString(C0172j.MenuItem_android_alphabeticShortcut));
            this.f530o = obtainStyledAttributes.getInt(C0172j.MenuItem_alphabeticModifiers, 4096);
            this.f531p = m740a(obtainStyledAttributes.getString(C0172j.MenuItem_android_numericShortcut));
            this.f532q = obtainStyledAttributes.getInt(C0172j.MenuItem_numericModifiers, 4096);
            this.f533r = obtainStyledAttributes.hasValue(C0172j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0172j.MenuItem_android_checkable, false) : this.f520e;
            this.f534s = obtainStyledAttributes.getBoolean(C0172j.MenuItem_android_checked, false);
            this.f535t = obtainStyledAttributes.getBoolean(C0172j.MenuItem_android_visible, this.f521f);
            this.f536u = obtainStyledAttributes.getBoolean(C0172j.MenuItem_android_enabled, this.f522g);
            this.f537v = obtainStyledAttributes.getInt(C0172j.MenuItem_showAsAction, -1);
            this.f541z = obtainStyledAttributes.getString(C0172j.MenuItem_android_onClick);
            this.f538w = obtainStyledAttributes.getResourceId(C0172j.MenuItem_actionLayout, 0);
            this.f539x = obtainStyledAttributes.getString(C0172j.MenuItem_actionViewClass);
            this.f540y = obtainStyledAttributes.getString(C0172j.MenuItem_actionProviderClass);
            boolean z = this.f540y != null;
            if (z && this.f538w == 0 && this.f539x == null) {
                this.f510A = (C0136e) m741a(this.f540y, C0199g.f502b, C0199g.this.f504d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f510A = null;
            }
            this.f511B = obtainStyledAttributes.getText(C0172j.MenuItem_contentDescription);
            this.f512C = obtainStyledAttributes.getText(C0172j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0172j.MenuItem_iconTintMode)) {
                this.f514E = C0525M.m2559a(obtainStyledAttributes.getInt(C0172j.MenuItem_iconTintMode, -1), this.f514E);
            } else {
                this.f514E = null;
            }
            if (obtainStyledAttributes.hasValue(C0172j.MenuItem_iconTint)) {
                this.f513D = obtainStyledAttributes.getColorStateList(C0172j.MenuItem_iconTint);
            } else {
                this.f513D = null;
            }
            obtainStyledAttributes.recycle();
            this.f523h = false;
        }

        /* renamed from: c */
        public boolean mo755c() {
            return this.f523h;
        }

        /* renamed from: d */
        public void mo756d() {
            this.f517b = 0;
            this.f518c = 0;
            this.f519d = 0;
            this.f520e = 0;
            this.f521f = true;
            this.f522g = true;
        }
    }

    public C0199g(Context context) {
        super(context);
        this.f505e = context;
        this.f503c = new Object[]{context};
    }

    /* renamed from: a */
    private Object m737a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m737a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: a */
    private void m738a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        String str;
        C0201b bVar = new C0201b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                String str3 = "item";
                String str4 = "group";
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.mo756d();
                        } else if (name2.equals(str3)) {
                            if (!bVar.mo755c()) {
                                C0136e eVar = bVar.f510A;
                                if (eVar == null || !eVar.mo493a()) {
                                    bVar.mo751a();
                                } else {
                                    bVar.mo753b();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.mo752a(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.mo754b(attributeSet);
                    } else if (name3.equals(str)) {
                        m738a(xmlPullParser, attributeSet, bVar.mo753b());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo748a() {
        if (this.f506f == null) {
            this.f506f = m737a(this.f505e);
        }
        return this.f506f;
    }

    public void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof C0075a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f505e.getResources().getLayout(i);
            m738a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException(str, e);
        } catch (IOException e2) {
            throw new InflateException(str, e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
