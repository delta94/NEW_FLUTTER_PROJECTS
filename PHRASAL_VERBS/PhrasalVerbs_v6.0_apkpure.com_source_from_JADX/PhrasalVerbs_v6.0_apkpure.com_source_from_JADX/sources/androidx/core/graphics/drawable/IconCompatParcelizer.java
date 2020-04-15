package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.support.p029v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0630b;

public class IconCompatParcelizer {
    public static IconCompat read(C0630b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f921b = bVar.mo3288a(iconCompat.f921b, 1);
        iconCompat.f923d = bVar.mo3298a(iconCompat.f923d, 2);
        iconCompat.f924e = bVar.mo3289a(iconCompat.f924e, 3);
        iconCompat.f925f = bVar.mo3288a(iconCompat.f925f, 4);
        iconCompat.f926g = bVar.mo3288a(iconCompat.f926g, 5);
        iconCompat.f927h = (ColorStateList) bVar.mo3289a(iconCompat.f927h, 6);
        iconCompat.f929j = bVar.mo3290a(iconCompat.f929j, 7);
        iconCompat.mo1268c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0630b bVar) {
        bVar.mo3295a(true, true);
        iconCompat.mo1266a(bVar.mo3306c());
        bVar.mo3301b(iconCompat.f921b, 1);
        bVar.mo3304b(iconCompat.f923d, 2);
        bVar.mo3302b(iconCompat.f924e, 3);
        bVar.mo3301b(iconCompat.f925f, 4);
        bVar.mo3301b(iconCompat.f926g, 5);
        bVar.mo3302b((Parcelable) iconCompat.f927h, 6);
        bVar.mo3303b(iconCompat.f929j, 7);
    }
}
