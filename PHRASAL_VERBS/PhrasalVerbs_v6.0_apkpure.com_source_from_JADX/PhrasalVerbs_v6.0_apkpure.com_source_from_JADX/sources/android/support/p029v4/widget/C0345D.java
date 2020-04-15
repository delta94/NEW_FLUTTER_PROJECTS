package android.support.p029v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint.FontMetricsInt;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.support.p029v4.util.C0337n;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p017f.C0095b.C0096a;
import p000a.p005b.p009c.p017f.C0095b.C0096a.C0097a;

/* renamed from: android.support.v4.widget.D */
public final class C0345D {

    /* renamed from: android.support.v4.widget.D$a */
    private static class C0346a implements Callback {

        /* renamed from: a */
        private final Callback f1051a;

        /* renamed from: b */
        private final TextView f1052b;

        /* renamed from: c */
        private Class f1053c;

        /* renamed from: d */
        private Method f1054d;

        /* renamed from: e */
        private boolean f1055e;

        /* renamed from: f */
        private boolean f1056f = false;

        C0346a(Callback callback, TextView textView) {
            this.f1051a = callback;
            this.f1052b = textView;
        }

        /* renamed from: a */
        private Intent m1500a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: a */
        private Intent m1501a(ResolveInfo resolveInfo, TextView textView) {
            return m1500a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m1505a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private List<ResolveInfo> m1502a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m1500a(), 0)) {
                if (m1504a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m1503a(Menu menu) {
            Method method;
            Context context = this.f1052b.getContext();
            PackageManager packageManager = context.getPackageManager();
            String str = "removeItemAt";
            if (!this.f1056f) {
                this.f1056f = true;
                try {
                    this.f1053c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1054d = this.f1053c.getDeclaredMethod(str, new Class[]{Integer.TYPE});
                    this.f1055e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f1053c = null;
                    this.f1054d = null;
                    this.f1055e = false;
                }
            }
            try {
                if (!this.f1055e || !this.f1053c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod(str, new Class[]{Integer.TYPE});
                } else {
                    method = this.f1054d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List a = m1502a(context, packageManager);
                for (int i = 0; i < a.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m1501a(resolveInfo, this.f1052b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: a */
        private boolean m1504a(ResolveInfo resolveInfo, Context context) {
            boolean z = true;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            String str = resolveInfo.activityInfo.permission;
            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        private boolean m1505a(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1051a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1051a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f1051a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m1503a(menu);
            return this.f1051a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    private static int m1489a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: a */
    public static int m1490a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: a */
    public static Callback m1491a(TextView textView, Callback callback) {
        int i = VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0346a)) ? callback : new C0346a(callback, textView);
    }

    /* renamed from: a */
    public static void m1492a(TextView textView, int i) {
        C0337n.m1441a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m1493a(TextView textView, C0096a aVar) {
        if (VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m1489a(aVar.mo307c()));
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.mo308d().getTextScaleX();
            textView.getPaint().set(aVar.mo308d());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo308d());
        textView.setBreakStrategy(aVar.mo305a());
        textView.setHyphenationFrequency(aVar.mo306b());
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.text.PrecomputedText] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1494a(android.widget.TextView r2, p000a.p005b.p009c.p017f.C0095b r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000e
            android.text.PrecomputedText r3 = r3.mo293b()
        L_0x000a:
            r2.setText(r3)
            goto L_0x001d
        L_0x000e:
            a.b.c.f.b$a r0 = m1497c(r2)
            a.b.c.f.b$a r1 = r3.mo292a()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001e
            goto L_0x000a
        L_0x001d:
            return
        L_0x001e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Given text can not be applied to TextView."
            r2.<init>(r3)
            throw r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.widget.C0345D.m1494a(android.widget.TextView, a.b.c.f.b):void");
    }

    /* renamed from: b */
    public static int m1495b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: b */
    public static void m1496b(TextView textView, int i) {
        C0337n.m1441a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static C0096a m1497c(TextView textView) {
        if (VERSION.SDK_INT >= 28) {
            return new C0096a(textView.getTextMetricsParams());
        }
        C0097a aVar = new C0097a(new TextPaint(textView.getPaint()));
        if (VERSION.SDK_INT >= 23) {
            aVar.mo312a(textView.getBreakStrategy());
            aVar.mo315b(textView.getHyphenationFrequency());
        }
        if (VERSION.SDK_INT >= 18) {
            aVar.mo313a(m1499d(textView));
        }
        return aVar.mo314a();
    }

    /* renamed from: c */
    public static void m1498c(TextView textView, int i) {
        C0337n.m1441a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m1499d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }
}
