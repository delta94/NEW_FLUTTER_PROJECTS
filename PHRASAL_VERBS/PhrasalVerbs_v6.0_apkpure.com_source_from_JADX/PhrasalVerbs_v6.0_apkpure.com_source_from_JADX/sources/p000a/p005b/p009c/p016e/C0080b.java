package p000a.p005b.p009c.p016e;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

/* renamed from: a.b.c.e.b */
class C0080b implements Callable<C0087c> {

    /* renamed from: a */
    final /* synthetic */ Context f174a;

    /* renamed from: b */
    final /* synthetic */ C0079a f175b;

    /* renamed from: c */
    final /* synthetic */ int f176c;

    /* renamed from: d */
    final /* synthetic */ String f177d;

    C0080b(Context context, C0079a aVar, int i, String str) {
        this.f174a = context;
        this.f175b = aVar;
        this.f176c = i;
        this.f177d = str;
    }

    public C0087c call() {
        C0087c a = C0084f.m281a(this.f174a, this.f175b, this.f176c);
        Typeface typeface = a.f193a;
        if (typeface != null) {
            C0084f.f181a.mo1362a(this.f177d, typeface);
        }
        return a;
    }
}
