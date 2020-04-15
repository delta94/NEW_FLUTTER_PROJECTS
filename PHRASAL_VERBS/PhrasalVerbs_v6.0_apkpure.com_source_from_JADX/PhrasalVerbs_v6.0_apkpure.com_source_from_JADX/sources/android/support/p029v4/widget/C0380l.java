package android.support.p029v4.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: android.support.v4.widget.l */
class C0380l implements ClassLoaderCreator<C0378e> {
    C0380l() {
    }

    public C0378e createFromParcel(Parcel parcel) {
        return new C0378e(parcel, null);
    }

    public C0378e createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C0378e(parcel, classLoader);
    }

    public C0378e[] newArray(int i) {
        return new C0378e[i];
    }
}
