package android.support.p029v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.h */
public abstract class C0367h extends BaseAdapter implements Filterable, C0371a {

    /* renamed from: a */
    protected boolean f1182a;

    /* renamed from: b */
    protected boolean f1183b;

    /* renamed from: c */
    protected Cursor f1184c;

    /* renamed from: d */
    protected Context f1185d;

    /* renamed from: e */
    protected int f1186e;

    /* renamed from: f */
    protected C0368a f1187f;

    /* renamed from: g */
    protected DataSetObserver f1188g;

    /* renamed from: h */
    protected C0370i f1189h;

    /* renamed from: android.support.v4.widget.h$a */
    private class C0368a extends ContentObserver {
        C0368a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0367h.this.mo1703b();
        }
    }

    /* renamed from: android.support.v4.widget.h$b */
    private class C0369b extends DataSetObserver {
        C0369b() {
        }

        public void onChanged() {
            C0367h hVar = C0367h.this;
            hVar.f1182a = true;
            hVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0367h hVar = C0367h.this;
            hVar.f1182a = false;
            hVar.notifyDataSetInvalidated();
        }
    }

    public C0367h(Context context, Cursor cursor, boolean z) {
        mo1698a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo1696a() {
        return this.f1184c;
    }

    /* renamed from: a */
    public abstract View mo1697a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1698a(Context context, Cursor cursor, int i) {
        C0369b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1183b = true;
        } else {
            this.f1183b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f1184c = cursor;
        this.f1182a = z;
        this.f1185d = context;
        this.f1186e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1187f = new C0368a();
            bVar = new C0369b();
        } else {
            bVar = null;
            this.f1187f = null;
        }
        this.f1188g = bVar;
        if (z) {
            C0368a aVar = this.f1187f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1188g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo1699a(Cursor cursor) {
        Cursor b = mo1701b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: a */
    public abstract void mo1700a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public Cursor mo1701b(Cursor cursor) {
        Cursor cursor2 = this.f1184c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0368a aVar = this.f1187f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1188g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1184c = cursor;
        if (cursor != null) {
            C0368a aVar2 = this.f1187f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f1188g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1186e = cursor.getColumnIndexOrThrow("_id");
            this.f1182a = true;
            notifyDataSetChanged();
        } else {
            this.f1186e = -1;
            this.f1182a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public abstract View mo1702b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1703b() {
        if (this.f1183b) {
            Cursor cursor = this.f1184c;
            if (cursor != null && !cursor.isClosed()) {
                this.f1182a = this.f1184c.requery();
            }
        }
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public int getCount() {
        if (this.f1182a) {
            Cursor cursor = this.f1184c;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1182a) {
            return null;
        }
        this.f1184c.moveToPosition(i);
        if (view == null) {
            view = mo1697a(this.f1185d, this.f1184c, viewGroup);
        }
        mo1700a(view, this.f1185d, this.f1184c);
        return view;
    }

    public Filter getFilter() {
        if (this.f1189h == null) {
            this.f1189h = new C0370i(this);
        }
        return this.f1189h;
    }

    public Object getItem(int i) {
        if (this.f1182a) {
            Cursor cursor = this.f1184c;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.f1184c;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.f1182a) {
            Cursor cursor = this.f1184c;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.f1184c.getLong(this.f1186e);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1182a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1184c.moveToPosition(i)) {
            if (view == null) {
                view = mo1702b(this.f1185d, this.f1184c, viewGroup);
            }
            mo1700a(view, this.f1185d, this.f1184c);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }
}
