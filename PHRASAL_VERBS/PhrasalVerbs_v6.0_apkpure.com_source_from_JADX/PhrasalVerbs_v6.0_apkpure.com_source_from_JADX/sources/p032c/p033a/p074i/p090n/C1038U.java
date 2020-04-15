package p032c.p033a.p074i.p090n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import java.io.IOException;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.U */
public class C1038U extends C1036S {

    /* renamed from: c */
    private final Resources f3562c;

    public C1038U(Executor executor, C0739h hVar, Resources resources) {
        super(executor, hVar);
        this.f3562c = resources;
    }

    /* renamed from: b */
    private int m4623b(C1114c cVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f3562c.openRawResourceFd(m4624c(cVar));
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            return length;
        } catch (NotFoundException unused2) {
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

    /* renamed from: c */
    private static int m4624c(C1114c cVar) {
        return Integer.parseInt(cVar.mo4372o().getPath().substring(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4276a(C1114c cVar) {
        return mo4288b(this.f3562c.openRawResource(m4624c(cVar)), m4623b(cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4277a() {
        return "LocalResourceFetchProducer";
    }
}
