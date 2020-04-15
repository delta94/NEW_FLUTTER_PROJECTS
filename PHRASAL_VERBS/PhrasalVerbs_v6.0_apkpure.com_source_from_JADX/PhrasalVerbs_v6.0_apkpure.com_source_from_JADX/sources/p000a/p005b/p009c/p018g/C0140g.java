package p000a.p005b.p009c.p018g;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.c.g.g */
public class C0140g {

    /* renamed from: a */
    private static boolean f376a = false;

    /* renamed from: b */
    private static Method f377b = null;

    /* renamed from: c */
    private static boolean f378c = false;

    /* renamed from: d */
    private static Field f379d;

    /* renamed from: a.b.c.g.g$a */
    public interface C0141a {
        /* renamed from: a */
        boolean mo500a(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static OnKeyListener m476a(Dialog dialog) {
        if (!f378c) {
            try {
                f379d = Dialog.class.getDeclaredField("mOnKeyListener");
                f379d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f378c = true;
        }
        Field field = f379d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m477a(C0141a aVar, View view, Callback callback, KeyEvent keyEvent) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.mo500a(keyEvent);
        }
        if (callback instanceof Activity) {
            return m479a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m480a((Dialog) callback, keyEvent);
        }
        if ((view != null && C0156v.m552a(view, keyEvent)) || aVar.mo500a(keyEvent)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m478a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f376a) {
            try {
                f377b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f376a = true;
        }
        Method method = f377b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m479a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m478a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0156v.m552a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: a */
    private static boolean m480a(Dialog dialog, KeyEvent keyEvent) {
        OnKeyListener a = m476a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0156v.m552a(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: a */
    public static boolean m481a(View view, KeyEvent keyEvent) {
        return C0156v.m556b(view, keyEvent);
    }
}
