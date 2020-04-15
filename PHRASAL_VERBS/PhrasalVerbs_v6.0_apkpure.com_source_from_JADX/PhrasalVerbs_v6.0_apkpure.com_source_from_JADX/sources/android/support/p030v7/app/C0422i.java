package android.support.p030v7.app;

import android.content.Context;
import android.database.Cursor;
import android.support.p030v7.app.AlertController.C0396a;
import android.support.p030v7.app.AlertController.RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* renamed from: android.support.v7.app.i */
class C0422i extends CursorAdapter {

    /* renamed from: a */
    private final int f1448a;

    /* renamed from: b */
    private final int f1449b;

    /* renamed from: c */
    final /* synthetic */ RecycleListView f1450c;

    /* renamed from: d */
    final /* synthetic */ AlertController f1451d;

    /* renamed from: e */
    final /* synthetic */ C0396a f1452e;

    C0422i(C0396a aVar, Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
        this.f1452e = aVar;
        this.f1450c = recycleListView;
        this.f1451d = alertController;
        super(context, cursor, z);
        Cursor cursor2 = getCursor();
        this.f1448a = cursor2.getColumnIndexOrThrow(this.f1452e.f1326L);
        this.f1449b = cursor2.getColumnIndexOrThrow(this.f1452e.f1327M);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1448a));
        RecycleListView recycleListView = this.f1450c;
        int position = cursor.getPosition();
        boolean z = true;
        if (cursor.getInt(this.f1449b) != 1) {
            z = false;
        }
        recycleListView.setItemChecked(position, z);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1452e.f1332b.inflate(this.f1451d.f1280M, viewGroup, false);
    }
}
