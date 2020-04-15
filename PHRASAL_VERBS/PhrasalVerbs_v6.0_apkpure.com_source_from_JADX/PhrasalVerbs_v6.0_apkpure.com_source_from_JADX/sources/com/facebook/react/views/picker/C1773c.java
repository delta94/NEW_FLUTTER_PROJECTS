package com.facebook.react.views.picker;

import android.content.Context;
import android.support.p030v7.widget.C0503C;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: com.facebook.react.views.picker.c */
public class C1773c extends C0503C {

    /* renamed from: j */
    private int f5215j = 0;

    /* renamed from: k */
    private Integer f5216k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1774a f5217l;

    /* renamed from: m */
    private Integer f5218m;

    /* renamed from: n */
    private final OnItemSelectedListener f5219n = new C1770a(this);

    /* renamed from: o */
    private final Runnable f5220o = new C1772b(this);

    /* renamed from: com.facebook.react.views.picker.c$a */
    public interface C1774a {
        /* renamed from: a */
        void mo6148a(int i);
    }

    public C1773c(Context context, int i) {
        super(context, i);
        this.f5215j = i;
    }

    private void setSelectionWithSuppressEvent(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i, false);
            setOnItemSelectedListener(this.f5219n);
        }
    }

    /* renamed from: a */
    public void mo6155a() {
        Integer num = this.f5218m;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.f5218m = null;
        }
    }

    public int getMode() {
        return this.f5215j;
    }

    public C1774a getOnSelectListener() {
        return this.f5217l;
    }

    public Integer getPrimaryColor() {
        return this.f5216k;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.f5219n);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.f5220o);
    }

    public void setOnSelectListener(C1774a aVar) {
        this.f5217l = aVar;
    }

    public void setPrimaryColor(Integer num) {
        this.f5216k = num;
    }

    public void setStagedSelection(int i) {
        this.f5218m = Integer.valueOf(i);
    }
}
