package android.support.p029v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.t */
public abstract class C0388t extends C0367h {

    /* renamed from: i */
    private int f1256i;

    /* renamed from: j */
    private int f1257j;

    /* renamed from: k */
    private LayoutInflater f1258k;

    @Deprecated
    public C0388t(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1257j = i;
        this.f1256i = i;
        this.f1258k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo1697a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1258k.inflate(this.f1257j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo1702b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1258k.inflate(this.f1256i, viewGroup, false);
    }
}
