package android.support.p030v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p029v4.util.C0320b;
import android.support.p030v7.widget.C0503C;
import android.support.p030v7.widget.C0518I;
import android.support.p030v7.widget.C0587i;
import android.support.p030v7.widget.C0591k;
import android.support.p030v7.widget.C0593l;
import android.support.p030v7.widget.C0595m;
import android.support.p030v7.widget.C0607p;
import android.support.p030v7.widget.C0611r;
import android.support.p030v7.widget.C0614sa;
import android.support.p030v7.widget.C0615t;
import android.support.p030v7.widget.C0617u;
import android.support.p030v7.widget.C0623x;
import android.support.p030v7.widget.C0625y;
import android.support.p030v7.widget.C0627z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p028e.C0195d;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f1358a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f1359b = {16843375};

    /* renamed from: c */
    private static final String[] f1360c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f1361d = new C0320b();

    /* renamed from: e */
    private final Object[] f1362e = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    private static class C0400a implements OnClickListener {

        /* renamed from: a */
        private final View f1363a;

        /* renamed from: b */
        private final String f1364b;

        /* renamed from: c */
        private Method f1365c;

        /* renamed from: d */
        private Context f1366d;

        public C0400a(View view, String str) {
            this.f1363a = view;
            this.f1364b = str;
        }

        /* renamed from: a */
        private void m1834a(Context context, String str) {
            String str2;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f1364b, new Class[]{View.class});
                        if (method != null) {
                            this.f1365c = method;
                            this.f1366d = context;
                            return;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f1363a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.f1363a.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.f1364b);
            sb2.append("(View) in a parent or ancestor Context for android:onClick ");
            sb2.append("attribute defined on view ");
            sb2.append(this.f1363a.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        public void onClick(View view) {
            if (this.f1365c == null) {
                m1834a(this.f1363a.getContext(), this.f1364b);
            }
            try {
                this.f1365c.invoke(this.f1366d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private static Context m1814a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0172j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0172j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0195d) || ((C0195d) context).mo720a() != resourceId) ? new C0195d(context, resourceId) : context : context;
    }

    /* renamed from: a */
    private View m1815a(Context context, String str, String str2) {
        String str3;
        Constructor constructor = (Constructor) f1361d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f1358a);
                f1361d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1362e);
    }

    /* renamed from: a */
    private void m1816a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || C0156v.m574o(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1359b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0400a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m1817a(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AppCompatViewInflater.class.getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private View m1818b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f1362e[0] = context;
            this.f1362e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f1360c) {
                    View a2 = m1815a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Object[] objArr = this.f1362e;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View a3 = m1815a(context, str, (String) null);
            Object[] objArr2 = this.f1362e;
            objArr2[0] = null;
            objArr2[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f1362e;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0587i mo1828a(Context context, AttributeSet attributeSet) {
        return new C0587i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo1829a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo1830a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1814a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0614sa.m2913a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo1842m(context2, attributeSet);
                break;
            case 1:
                view2 = mo1836g(context2, attributeSet);
                break;
            case 2:
                view2 = mo1831b(context2, attributeSet);
                break;
            case 3:
                view2 = mo1834e(context2, attributeSet);
                break;
            case 4:
                view2 = mo1841l(context2, attributeSet);
                break;
            case 5:
                view2 = mo1835f(context2, attributeSet);
                break;
            case 6:
                view2 = mo1832c(context2, attributeSet);
                break;
            case 7:
                view2 = mo1838i(context2, attributeSet);
                break;
            case 8:
                view2 = mo1833d(context2, attributeSet);
                break;
            case 9:
                view2 = mo1828a(context2, attributeSet);
                break;
            case 10:
                view2 = mo1837h(context2, attributeSet);
                break;
            case 11:
                view2 = mo1839j(context2, attributeSet);
                break;
            case 12:
                view2 = mo1840k(context2, attributeSet);
                break;
            default:
                view2 = mo1829a(context2, str, attributeSet);
                break;
        }
        m1817a(view2, str);
        if (view2 == null && context != context2) {
            view2 = m1818b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m1816a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0591k mo1831b(Context context, AttributeSet attributeSet) {
        return new C0591k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0593l mo1832c(Context context, AttributeSet attributeSet) {
        return new C0593l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0595m mo1833d(Context context, AttributeSet attributeSet) {
        return new C0595m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0607p mo1834e(Context context, AttributeSet attributeSet) {
        return new C0607p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0611r mo1835f(Context context, AttributeSet attributeSet) {
        return new C0611r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0615t mo1836g(Context context, AttributeSet attributeSet) {
        return new C0615t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0617u mo1837h(Context context, AttributeSet attributeSet) {
        return new C0617u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0623x mo1838i(Context context, AttributeSet attributeSet) {
        return new C0623x(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0625y mo1839j(Context context, AttributeSet attributeSet) {
        return new C0625y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0627z mo1840k(Context context, AttributeSet attributeSet) {
        return new C0627z(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0503C mo1841l(Context context, AttributeSet attributeSet) {
        return new C0503C(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0518I mo1842m(Context context, AttributeSet attributeSet) {
        return new C0518I(context, attributeSet);
    }
}
