package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new C0629a();

    /* renamed from: a */
    private final C0632d f2409a;

    protected ParcelImpl(Parcel parcel) {
        this.f2409a = new C0631c(parcel).mo3311h();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0631c(parcel).mo3293a(this.f2409a);
    }
}
