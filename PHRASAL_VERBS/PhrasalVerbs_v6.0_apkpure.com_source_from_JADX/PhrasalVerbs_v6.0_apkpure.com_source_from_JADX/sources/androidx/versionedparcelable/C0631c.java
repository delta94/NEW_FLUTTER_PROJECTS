package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.c */
class C0631c extends C0630b {

    /* renamed from: a */
    private final SparseIntArray f2410a;

    /* renamed from: b */
    private final Parcel f2411b;

    /* renamed from: c */
    private final int f2412c;

    /* renamed from: d */
    private final int f2413d;

    /* renamed from: e */
    private final String f2414e;

    /* renamed from: f */
    private int f2415f;

    /* renamed from: g */
    private int f2416g;

    C0631c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    C0631c(Parcel parcel, int i, int i2, String str) {
        this.f2410a = new SparseIntArray();
        this.f2415f = -1;
        this.f2416g = 0;
        this.f2411b = parcel;
        this.f2412c = i;
        this.f2413d = i2;
        this.f2416g = this.f2412c;
        this.f2414e = str;
    }

    /* renamed from: d */
    private int m2973d(int i) {
        int readInt;
        do {
            int i2 = this.f2416g;
            if (i2 >= this.f2413d) {
                return -1;
            }
            this.f2411b.setDataPosition(i2);
            int readInt2 = this.f2411b.readInt();
            readInt = this.f2411b.readInt();
            this.f2416g += readInt2;
        } while (readInt != i);
        return this.f2411b.dataPosition();
    }

    /* renamed from: a */
    public void mo3291a() {
        int i = this.f2415f;
        if (i >= 0) {
            int i2 = this.f2410a.get(i);
            int dataPosition = this.f2411b.dataPosition();
            int i3 = dataPosition - i2;
            this.f2411b.setDataPosition(i2);
            this.f2411b.writeInt(i3);
            this.f2411b.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo3292a(Parcelable parcelable) {
        this.f2411b.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo3294a(String str) {
        this.f2411b.writeString(str);
    }

    /* renamed from: a */
    public void mo3296a(byte[] bArr) {
        if (bArr != null) {
            this.f2411b.writeInt(bArr.length);
            this.f2411b.writeByteArray(bArr);
            return;
        }
        this.f2411b.writeInt(-1);
    }

    /* renamed from: a */
    public boolean mo3297a(int i) {
        int d = m2973d(i);
        if (d == -1) {
            return false;
        }
        this.f2411b.setDataPosition(d);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0630b mo3299b() {
        Parcel parcel = this.f2411b;
        int dataPosition = parcel.dataPosition();
        int i = this.f2416g;
        if (i == this.f2412c) {
            i = this.f2413d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2414e);
        sb.append("  ");
        return new C0631c(parcel, dataPosition, i, sb.toString());
    }

    /* renamed from: b */
    public void mo3300b(int i) {
        mo3291a();
        this.f2415f = i;
        this.f2410a.put(i, this.f2411b.dataPosition());
        mo3305c(0);
        mo3305c(i);
    }

    /* renamed from: c */
    public void mo3305c(int i) {
        this.f2411b.writeInt(i);
    }

    /* renamed from: d */
    public byte[] mo3307d() {
        int readInt = this.f2411b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2411b.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: e */
    public int mo3308e() {
        return this.f2411b.readInt();
    }

    /* renamed from: f */
    public <T extends Parcelable> T mo3309f() {
        return this.f2411b.readParcelable(C0631c.class.getClassLoader());
    }

    /* renamed from: g */
    public String mo3310g() {
        return this.f2411b.readString();
    }
}
