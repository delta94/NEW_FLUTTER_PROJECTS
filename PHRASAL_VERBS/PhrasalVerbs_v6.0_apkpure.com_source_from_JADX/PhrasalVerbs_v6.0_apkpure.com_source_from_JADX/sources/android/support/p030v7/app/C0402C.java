package android.support.p030v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.C */
class C0402C {

    /* renamed from: a */
    private static Field f1369a;

    /* renamed from: b */
    private static boolean f1370b;

    /* renamed from: c */
    private static Class f1371c;

    /* renamed from: d */
    private static boolean f1372d;

    /* renamed from: e */
    private static Field f1373e;

    /* renamed from: f */
    private static boolean f1374f;

    /* renamed from: g */
    private static Field f1375g;

    /* renamed from: h */
    private static boolean f1376h;

    /* renamed from: a */
    static void m1842a(Resources resources) {
        int i = VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m1846d(resources);
            } else if (i >= 23) {
                m1845c(resources);
            } else if (i >= 21) {
                m1844b(resources);
            }
        }
    }

    /* renamed from: a */
    private static void m1843a(Object obj) {
        LongSparseArray longSparseArray;
        String str = "ResourcesFlusher";
        if (!f1372d) {
            try {
                f1371c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(str, "Could not find ThemedResourceCache class", e);
            }
            f1372d = true;
        }
        Class cls = f1371c;
        if (cls != null) {
            if (!f1374f) {
                try {
                    f1373e = cls.getDeclaredField("mUnthemedEntries");
                    f1373e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(str, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f1374f = true;
            }
            Field field = f1373e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(str, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m1844b(Resources resources) {
        Map map;
        String str = "ResourcesFlusher";
        if (!f1370b) {
            try {
                f1369a = Resources.class.getDeclaredField("mDrawableCache");
                f1369a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1370b = true;
        }
        Field field = f1369a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m1845c(Resources resources) {
        String str = "ResourcesFlusher";
        if (!f1370b) {
            try {
                f1369a = Resources.class.getDeclaredField("mDrawableCache");
                f1369a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1370b = true;
        }
        Object obj = null;
        Field field = f1369a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m1843a(obj);
        }
    }

    /* renamed from: d */
    private static void m1846d(Resources resources) {
        Object obj;
        String str = "ResourcesFlusher";
        if (!f1376h) {
            try {
                f1375g = Resources.class.getDeclaredField("mResourcesImpl");
                f1375g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1376h = true;
        }
        Field field = f1375g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f1370b) {
                    try {
                        f1369a = obj.getClass().getDeclaredField("mDrawableCache");
                        f1369a.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e(str, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f1370b = true;
                }
                Field field2 = f1369a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e(str, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m1843a(obj2);
                }
            }
        }
    }
}
