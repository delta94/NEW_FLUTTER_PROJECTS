package p032c.p033a.p098m.p112j.p113a;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: c.a.m.j.a.a */
public class C1218a {
    /* renamed from: a */
    public static <T> T m5219a(Context context, Class<? extends T> cls) {
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (context == baseContext) {
                return null;
            }
            context = baseContext;
        }
        return context;
    }
}
