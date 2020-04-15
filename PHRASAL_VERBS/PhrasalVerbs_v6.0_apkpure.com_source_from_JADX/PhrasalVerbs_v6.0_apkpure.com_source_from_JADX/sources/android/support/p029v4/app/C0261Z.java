package android.support.p029v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p005b.p009c.p010a.C0039a;

/* renamed from: android.support.v4.app.Z */
public final class C0261Z implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f698a = new ArrayList<>();

    /* renamed from: b */
    private final Context f699b;

    /* renamed from: android.support.v4.app.Z$a */
    public interface C0262a {
        /* renamed from: d */
        Intent mo924d();
    }

    private C0261Z(Context context) {
        this.f699b = context;
    }

    /* renamed from: a */
    public static C0261Z m961a(Context context) {
        return new C0261Z(context);
    }

    /* renamed from: a */
    public C0261Z mo918a(Activity activity) {
        Intent d = activity instanceof C0262a ? ((C0262a) activity).mo924d() : null;
        if (d == null) {
            d = C0256U.m948a(activity);
        }
        if (d != null) {
            ComponentName component = d.getComponent();
            if (component == null) {
                component = d.resolveActivity(this.f699b.getPackageManager());
            }
            mo919a(component);
            mo920a(d);
        }
        return this;
    }

    /* renamed from: a */
    public C0261Z mo919a(ComponentName componentName) {
        int size = this.f698a.size();
        try {
            Context context = this.f699b;
            while (true) {
                Intent a = C0256U.m949a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f698a.add(size, a);
                context = this.f699b;
                componentName = a.getComponent();
            }
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0261Z mo920a(Intent intent) {
        this.f698a.add(intent);
        return this;
    }

    /* renamed from: a */
    public void mo921a() {
        mo922a((Bundle) null);
    }

    /* renamed from: a */
    public void mo922a(Bundle bundle) {
        if (!this.f698a.isEmpty()) {
            ArrayList<Intent> arrayList = this.f698a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0039a.m107a(this.f699b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f699b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f698a.iterator();
    }
}
