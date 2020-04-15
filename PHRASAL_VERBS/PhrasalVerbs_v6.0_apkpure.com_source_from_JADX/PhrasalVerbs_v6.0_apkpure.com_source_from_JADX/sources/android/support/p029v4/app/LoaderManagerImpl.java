package android.support.p029v4.app;

import android.arch.lifecycle.C0215f;
import android.arch.lifecycle.C0223m;
import android.arch.lifecycle.C0224n;
import android.arch.lifecycle.C0228q;
import android.arch.lifecycle.C0229r;
import android.arch.lifecycle.C0229r.C0230a;
import android.arch.lifecycle.C0231s;
import android.os.Bundle;
import android.support.p029v4.util.C0324f;
import android.support.p029v4.util.C0339p;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p005b.p009c.p010a.C0058c;
import p000a.p005b.p009c.p010a.C0058c.C0059a;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends C0254S {

    /* renamed from: a */
    static boolean f669a = false;

    /* renamed from: b */
    private final C0215f f670b;

    /* renamed from: c */
    private final LoaderViewModel f671c;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0228q {

        /* renamed from: a */
        private static final C0230a f672a = new C0255T();

        /* renamed from: b */
        private C0339p<C0247a> f673b = new C0339p<>();

        /* renamed from: c */
        private boolean f674c = false;

        LoaderViewModel() {
        }

        /* renamed from: a */
        static LoaderViewModel m889a(C0231s sVar) {
            return (LoaderViewModel) new C0229r(sVar, f672a).mo834a(LoaderViewModel.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo833a() {
            super.mo833a();
            if (this.f673b.mo1452b() <= 0) {
                this.f673b.mo1449a();
            } else {
                ((C0247a) this.f673b.mo1459e(0)).mo877a(true);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo875a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f673b.mo1452b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                if (this.f673b.mo1452b() > 0) {
                    C0247a aVar = (C0247a) this.f673b.mo1459e(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f673b.mo1455c(0));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo878a(sb2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo876b() {
            int b = this.f673b.mo1452b();
            for (int i = 0; i < b; i++) {
                ((C0247a) this.f673b.mo1459e(i)).mo879d();
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0247a<D> extends C0223m<D> implements C0059a<D> {

        /* renamed from: k */
        private final int f675k;

        /* renamed from: l */
        private final Bundle f676l;

        /* renamed from: m */
        private final C0058c<D> f677m;

        /* renamed from: n */
        private C0215f f678n;

        /* renamed from: o */
        private C0248b<D> f679o;

        /* renamed from: p */
        private C0058c<D> f680p;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0058c<D> mo877a(boolean z) {
            if (LoaderManagerImpl.f669a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f677m.mo217a();
            throw null;
        }

        /* renamed from: a */
        public void mo798a(C0224n<? super D> nVar) {
            super.mo798a(nVar);
            this.f678n = null;
            this.f679o = null;
        }

        /* renamed from: a */
        public void mo799a(D d) {
            super.mo799a(d);
            C0058c<D> cVar = this.f680p;
            if (cVar != null) {
                cVar.mo218b();
                throw null;
            }
        }

        /* renamed from: a */
        public void mo878a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f675k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f676l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f677m);
            C0058c<D> cVar = this.f677m;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            cVar.mo216a(sb.toString(), fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo800b() {
            if (LoaderManagerImpl.f669a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f677m.mo219c();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo801c() {
            if (LoaderManagerImpl.f669a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f677m.mo220d();
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo879d() {
            C0215f fVar = this.f678n;
            C0248b<D> bVar = this.f679o;
            if (fVar != null && bVar != null) {
                super.mo798a((C0224n<T>) bVar);
                mo797a(fVar, (C0224n<T>) bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f675k);
            sb.append(" : ");
            C0324f.m1400a(this.f677m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0248b<D> implements C0224n<D> {
    }

    LoaderManagerImpl(C0215f fVar, C0231s sVar) {
        this.f670b = fVar;
        this.f671c = LoaderViewModel.m889a(sVar);
    }

    /* renamed from: a */
    public void mo872a() {
        this.f671c.mo876b();
    }

    @Deprecated
    /* renamed from: a */
    public void mo873a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f671c.mo875a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0324f.m1400a(this.f670b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
