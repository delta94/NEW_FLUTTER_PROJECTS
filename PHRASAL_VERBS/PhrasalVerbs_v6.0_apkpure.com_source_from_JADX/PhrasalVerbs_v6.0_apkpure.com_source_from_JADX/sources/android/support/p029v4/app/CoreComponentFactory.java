package android.support.p029v4.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* renamed from: android.support.v4.app.CoreComponentFactory */
public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: android.support.v4.app.CoreComponentFactory$a */
    public interface C0236a {
        /* renamed from: a */
        Object mo855a();
    }

    /* renamed from: a */
    static <T> T m856a(T t) {
        if (t instanceof C0236a) {
            T a = ((C0236a) t).mo855a();
            if (a != null) {
                return a;
            }
        }
        return t;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m856a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m856a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m856a(super.instantiateProvider(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m856a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m856a(super.instantiateService(classLoader, str, intent));
    }
}
