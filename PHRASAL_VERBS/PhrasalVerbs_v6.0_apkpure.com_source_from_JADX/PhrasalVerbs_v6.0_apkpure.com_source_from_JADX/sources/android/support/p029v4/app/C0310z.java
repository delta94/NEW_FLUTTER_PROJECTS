package android.support.p029v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.app.z */
final class C0310z implements Parcelable {
    public static final Creator<C0310z> CREATOR = new C0309y();

    /* renamed from: a */
    C0234B[] f915a;

    /* renamed from: b */
    int[] f916b;

    /* renamed from: c */
    C0271e[] f917c;

    /* renamed from: d */
    int f918d = -1;

    /* renamed from: e */
    int f919e;

    public C0310z() {
    }

    public C0310z(Parcel parcel) {
        this.f915a = (C0234B[]) parcel.createTypedArray(C0234B.CREATOR);
        this.f916b = parcel.createIntArray();
        this.f917c = (C0271e[]) parcel.createTypedArray(C0271e.CREATOR);
        this.f918d = parcel.readInt();
        this.f919e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f915a, i);
        parcel.writeIntArray(this.f916b);
        parcel.writeTypedArray(this.f917c, i);
        parcel.writeInt(this.f918d);
        parcel.writeInt(this.f919e);
    }
}
