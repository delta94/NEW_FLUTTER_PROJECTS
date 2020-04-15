package p000a.p005b.p009c.p018g;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: a.b.c.g.b */
class C0128b implements ClassLoaderCreator<C0133c> {
    C0128b() {
    }

    public C0133c createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    public C0133c createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return C0133c.f368a;
        }
        throw new IllegalStateException("superState must be null");
    }

    public C0133c[] newArray(int i) {
        return new C0133c[i];
    }
}
