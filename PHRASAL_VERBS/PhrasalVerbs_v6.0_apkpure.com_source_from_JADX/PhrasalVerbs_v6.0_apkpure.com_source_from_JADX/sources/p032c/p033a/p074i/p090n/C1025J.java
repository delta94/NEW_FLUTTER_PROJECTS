package p032c.p033a.p074i.p090n;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.J */
public class C1025J extends C1036S {

    /* renamed from: c */
    private final AssetManager f3530c;

    public C1025J(Executor executor, C0739h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f3530c = assetManager;
    }

    /* renamed from: b */
    private static String m4562b(C1114c cVar) {
        return cVar.mo4372o().getPath().substring(1);
    }

    /* renamed from: c */
    private int m4563c(C1114c cVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f3530c.openFd(m4562b(cVar));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } finally {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4276a(C1114c cVar) {
        return mo4288b(this.f3530c.open(m4562b(cVar), 2), m4563c(cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4277a() {
        return "LocalAssetFetchProducer";
    }
}
