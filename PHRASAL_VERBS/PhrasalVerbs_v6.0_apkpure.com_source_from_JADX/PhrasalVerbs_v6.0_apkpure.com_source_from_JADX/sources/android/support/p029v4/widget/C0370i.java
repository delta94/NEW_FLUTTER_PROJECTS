package android.support.p029v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.i */
class C0370i extends Filter {

    /* renamed from: a */
    C0371a f1192a;

    /* renamed from: android.support.v4.widget.i$a */
    interface C0371a {
        /* renamed from: a */
        Cursor mo1696a();

        /* renamed from: a */
        Cursor mo1718a(CharSequence charSequence);

        /* renamed from: a */
        void mo1699a(Cursor cursor);

        CharSequence convertToString(Cursor cursor);
    }

    C0370i(C0371a aVar) {
        this.f1192a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1192a.convertToString((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f1192a.mo1718a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f1192a.mo1696a();
        Object obj = filterResults.values;
        if (obj != null && obj != a) {
            this.f1192a.mo1699a((Cursor) obj);
        }
    }
}
