package p000a.p005b.p009c.p018g;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: a.b.c.g.c */
public abstract class C0133c implements Parcelable {
    public static final Creator<C0133c> CREATOR = new C0128b();

    /* renamed from: a */
    public static final C0133c f368a = new C0122a();

    /* renamed from: b */
    private final Parcelable f369b;

    private C0133c() {
        this.f369b = null;
    }

    /* synthetic */ C0133c(C0122a aVar) {
        this();
    }

    protected C0133c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f368a;
        }
        this.f369b = readParcelable;
    }

    protected C0133c(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f368a) {
                parcelable = null;
            }
            this.f369b = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* renamed from: a */
    public final Parcelable mo471a() {
        return this.f369b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f369b, i);
    }
}
