package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.C1601c.C1602a;
import p000a.p005b.p009c.p018g.C0134d;
import p000a.p005b.p009c.p018g.p019a.C0123a;

/* renamed from: com.facebook.react.uimanager.a */
class C1594a extends C0134d {

    /* renamed from: c */
    final /* synthetic */ String f4812c;

    /* renamed from: d */
    final /* synthetic */ C1602a f4813d;

    /* renamed from: e */
    final /* synthetic */ View f4814e;

    C1594a(String str, C1602a aVar, View view) {
        this.f4812c = str;
        this.f4813d = aVar;
        this.f4814e = view;
    }

    /* renamed from: a */
    public void mo376a(View view, C0123a aVar) {
        String str;
        super.mo376a(view, aVar);
        if (this.f4812c != null) {
            String str2 = (String) aVar.mo432c();
            if (str2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(", ");
                sb.append(this.f4812c);
                str = sb.toString();
            } else {
                str = this.f4812c;
            }
            aVar.mo430b((CharSequence) str);
        }
        C1601c.m6344a(aVar, this.f4813d, this.f4814e.getContext());
    }
}
