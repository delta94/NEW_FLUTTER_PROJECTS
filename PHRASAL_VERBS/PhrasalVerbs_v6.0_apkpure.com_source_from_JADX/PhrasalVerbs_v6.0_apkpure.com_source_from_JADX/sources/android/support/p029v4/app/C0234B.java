package android.support.p029v4.app;

import android.arch.lifecycle.C0231s;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: android.support.v4.app.B */
final class C0234B implements Parcelable {
    public static final Creator<C0234B> CREATOR = new C0233A();

    /* renamed from: a */
    final String f606a;

    /* renamed from: b */
    final int f607b;

    /* renamed from: c */
    final boolean f608c;

    /* renamed from: d */
    final int f609d;

    /* renamed from: e */
    final int f610e;

    /* renamed from: f */
    final String f611f;

    /* renamed from: g */
    final boolean f612g;

    /* renamed from: h */
    final boolean f613h;

    /* renamed from: i */
    final Bundle f614i;

    /* renamed from: j */
    final boolean f615j;

    /* renamed from: k */
    Bundle f616k;

    /* renamed from: l */
    C0276j f617l;

    C0234B(Parcel parcel) {
        this.f606a = parcel.readString();
        this.f607b = parcel.readInt();
        boolean z = true;
        this.f608c = parcel.readInt() != 0;
        this.f609d = parcel.readInt();
        this.f610e = parcel.readInt();
        this.f611f = parcel.readString();
        this.f612g = parcel.readInt() != 0;
        this.f613h = parcel.readInt() != 0;
        this.f614i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f615j = z;
        this.f616k = parcel.readBundle();
    }

    C0234B(C0276j jVar) {
        this.f606a = jVar.getClass().getName();
        this.f607b = jVar.f782g;
        this.f608c = jVar.f790o;
        this.f609d = jVar.f801z;
        this.f610e = jVar.f754A;
        this.f611f = jVar.f755B;
        this.f612g = jVar.f758E;
        this.f613h = jVar.f757D;
        this.f614i = jVar.f784i;
        this.f615j = jVar.f756C;
    }

    /* renamed from: a */
    public C0276j mo843a(C0286o oVar, C0284m mVar, C0276j jVar, C0308x xVar, C0231s sVar) {
        if (this.f617l == null) {
            Context c = oVar.mo1139c();
            Bundle bundle = this.f614i;
            if (bundle != null) {
                bundle.setClassLoader(c.getClassLoader());
            }
            this.f617l = mVar != null ? mVar.mo967a(c, this.f606a, this.f614i) : C0276j.m1015a(c, this.f606a, this.f614i);
            Bundle bundle2 = this.f616k;
            if (bundle2 != null) {
                bundle2.setClassLoader(c.getClassLoader());
                this.f617l.f779d = this.f616k;
            }
            this.f617l.mo999a(this.f607b, jVar);
            C0276j jVar2 = this.f617l;
            jVar2.f790o = this.f608c;
            jVar2.f792q = true;
            jVar2.f801z = this.f609d;
            jVar2.f754A = this.f610e;
            jVar2.f755B = this.f611f;
            jVar2.f758E = this.f612g;
            jVar2.f757D = this.f613h;
            jVar2.f756C = this.f615j;
            jVar2.f795t = oVar.f841e;
            if (C0297w.f856a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiated fragment ");
                sb.append(this.f617l);
                Log.v("FragmentManager", sb.toString());
            }
        }
        C0276j jVar3 = this.f617l;
        jVar3.f798w = xVar;
        jVar3.f799x = sVar;
        return jVar3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f606a);
        parcel.writeInt(this.f607b);
        parcel.writeInt(this.f608c ? 1 : 0);
        parcel.writeInt(this.f609d);
        parcel.writeInt(this.f610e);
        parcel.writeString(this.f611f);
        parcel.writeInt(this.f612g ? 1 : 0);
        parcel.writeInt(this.f613h ? 1 : 0);
        parcel.writeBundle(this.f614i);
        parcel.writeInt(this.f615j ? 1 : 0);
        parcel.writeBundle(this.f616k);
    }
}
