package android.support.p029v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.e */
final class C0271e implements Parcelable {
    public static final Creator<C0271e> CREATOR = new C0270d();

    /* renamed from: a */
    final int[] f728a;

    /* renamed from: b */
    final int f729b;

    /* renamed from: c */
    final int f730c;

    /* renamed from: d */
    final String f731d;

    /* renamed from: e */
    final int f732e;

    /* renamed from: f */
    final int f733f;

    /* renamed from: g */
    final CharSequence f734g;

    /* renamed from: h */
    final int f735h;

    /* renamed from: i */
    final CharSequence f736i;

    /* renamed from: j */
    final ArrayList<String> f737j;

    /* renamed from: k */
    final ArrayList<String> f738k;

    /* renamed from: l */
    final boolean f739l;

    public C0271e(Parcel parcel) {
        this.f728a = parcel.createIntArray();
        this.f729b = parcel.readInt();
        this.f730c = parcel.readInt();
        this.f731d = parcel.readString();
        this.f732e = parcel.readInt();
        this.f733f = parcel.readInt();
        this.f734g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f735h = parcel.readInt();
        this.f736i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f737j = parcel.createStringArrayList();
        this.f738k = parcel.createStringArrayList();
        this.f739l = parcel.readInt() != 0;
    }

    public C0271e(C0268c cVar) {
        int size = cVar.f702b.size();
        this.f728a = new int[(size * 6)];
        if (cVar.f709i) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C0269a aVar = (C0269a) cVar.f702b.get(i2);
                int[] iArr = this.f728a;
                int i3 = i + 1;
                iArr[i] = aVar.f722a;
                int i4 = i3 + 1;
                C0276j jVar = aVar.f723b;
                iArr[i3] = jVar != null ? jVar.f782g : -1;
                int[] iArr2 = this.f728a;
                int i5 = i4 + 1;
                iArr2[i4] = aVar.f724c;
                int i6 = i5 + 1;
                iArr2[i5] = aVar.f725d;
                int i7 = i6 + 1;
                iArr2[i6] = aVar.f726e;
                i = i7 + 1;
                iArr2[i7] = aVar.f727f;
            }
            this.f729b = cVar.f707g;
            this.f730c = cVar.f708h;
            this.f731d = cVar.f711k;
            this.f732e = cVar.f713m;
            this.f733f = cVar.f714n;
            this.f734g = cVar.f715o;
            this.f735h = cVar.f716p;
            this.f736i = cVar.f717q;
            this.f737j = cVar.f718r;
            this.f738k = cVar.f719s;
            this.f739l = cVar.f720t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0268c mo945a(C0297w wVar) {
        C0268c cVar = new C0268c(wVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f728a.length) {
            C0269a aVar = new C0269a();
            int i3 = i + 1;
            aVar.f722a = this.f728a[i];
            if (C0297w.f856a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(cVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f728a[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            int i4 = i3 + 1;
            int i5 = this.f728a[i3];
            aVar.f723b = i5 >= 0 ? (C0276j) wVar.f876k.get(i5) : null;
            int[] iArr = this.f728a;
            int i6 = i4 + 1;
            aVar.f724c = iArr[i4];
            int i7 = i6 + 1;
            aVar.f725d = iArr[i6];
            int i8 = i7 + 1;
            aVar.f726e = iArr[i7];
            int i9 = i8 + 1;
            aVar.f727f = iArr[i8];
            cVar.f703c = aVar.f724c;
            cVar.f704d = aVar.f725d;
            cVar.f705e = aVar.f726e;
            cVar.f706f = aVar.f727f;
            cVar.mo929a(aVar);
            i2++;
            i = i9;
        }
        cVar.f707g = this.f729b;
        cVar.f708h = this.f730c;
        cVar.f711k = this.f731d;
        cVar.f713m = this.f732e;
        cVar.f709i = true;
        cVar.f714n = this.f733f;
        cVar.f715o = this.f734g;
        cVar.f716p = this.f735h;
        cVar.f717q = this.f736i;
        cVar.f718r = this.f737j;
        cVar.f719s = this.f738k;
        cVar.f720t = this.f739l;
        cVar.mo928a(1);
        return cVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f728a);
        parcel.writeInt(this.f729b);
        parcel.writeInt(this.f730c);
        parcel.writeString(this.f731d);
        parcel.writeInt(this.f732e);
        parcel.writeInt(this.f733f);
        TextUtils.writeToParcel(this.f734g, parcel, 0);
        parcel.writeInt(this.f735h);
        TextUtils.writeToParcel(this.f736i, parcel, 0);
        parcel.writeStringList(this.f737j);
        parcel.writeStringList(this.f738k);
        parcel.writeInt(this.f739l ? 1 : 0);
    }
}
