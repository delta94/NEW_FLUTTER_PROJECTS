package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: androidx.versionedparcelable.a */
class C0629a implements Creator<ParcelImpl> {
    C0629a() {
    }

    public ParcelImpl createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    public ParcelImpl[] newArray(int i) {
        return new ParcelImpl[i];
    }
}
