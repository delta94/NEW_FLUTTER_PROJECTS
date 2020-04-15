package android.support.p029v4.app;

import android.arch.lifecycle.C0215f;
import android.arch.lifecycle.C0232t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.S */
public abstract class C0254S {
    /* renamed from: a */
    public static <T extends C0215f & C0232t> C0254S m944a(T t) {
        return new LoaderManagerImpl(t, ((C0232t) t).mo840c());
    }

    /* renamed from: a */
    public abstract void mo872a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo873a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
