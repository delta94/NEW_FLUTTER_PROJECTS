package p032c.p033a.p074i.p090n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.K */
public class C1027K extends C1036S {

    /* renamed from: c */
    private static final String[] f3533c = {"_id", "_data"};

    /* renamed from: d */
    private final ContentResolver f3534d;

    public C1027K(Executor executor, C0739h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f3534d = contentResolver;
    }

    /* renamed from: a */
    private static int m4574a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: a */
    private C0988d m4575a(Uri uri) {
        Cursor query = this.f3534d.query(uri, f3533c, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                C0988d b = mo4288b(new FileInputStream(string), m4574a(string));
                query.close();
                return b;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4276a(C1114c cVar) {
        InputStream inputStream;
        Uri o = cVar.mo4372o();
        if (C0758f.m3377e(o)) {
            if (o.toString().endsWith("/photo")) {
                inputStream = this.f3534d.openInputStream(o);
            } else {
                String str = "Contact photo does not exist: ";
                if (o.toString().endsWith("/display_photo")) {
                    try {
                        inputStream = this.f3534d.openAssetFileDescriptor(o, "r").createInputStream();
                    } catch (IOException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(o);
                        throw new IOException(sb.toString());
                    }
                } else {
                    InputStream openContactPhotoInputStream = Contacts.openContactPhotoInputStream(this.f3534d, o);
                    if (openContactPhotoInputStream != null) {
                        inputStream = openContactPhotoInputStream;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(o);
                        throw new IOException(sb2.toString());
                    }
                }
            }
            return mo4288b(inputStream, -1);
        }
        if (C0758f.m3376d(o)) {
            C0988d a = m4575a(o);
            if (a != null) {
                return a;
            }
        }
        return mo4288b(this.f3534d.openInputStream(o), -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4277a() {
        return "LocalContentUriFetchProducer";
    }
}
