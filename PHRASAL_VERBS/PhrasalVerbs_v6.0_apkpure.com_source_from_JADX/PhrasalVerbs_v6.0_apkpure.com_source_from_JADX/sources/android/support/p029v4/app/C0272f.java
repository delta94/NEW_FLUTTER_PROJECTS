package android.support.p029v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.app.f */
public class C0272f extends C0276j implements OnCancelListener, OnDismissListener {

    /* renamed from: Y */
    int f740Y = 0;

    /* renamed from: Z */
    int f741Z = 0;

    /* renamed from: aa */
    boolean f742aa = true;

    /* renamed from: ba */
    boolean f743ba = true;

    /* renamed from: ca */
    int f744ca = -1;

    /* renamed from: da */
    Dialog f745da;

    /* renamed from: ea */
    boolean f746ea;

    /* renamed from: fa */
    boolean f747fa;

    /* renamed from: ga */
    boolean f748ga;

    /* renamed from: K */
    public void mo948K() {
        super.mo948K();
        Dialog dialog = this.f745da;
        if (dialog != null) {
            this.f746ea = true;
            dialog.dismiss();
            this.f745da = null;
        }
    }

    /* renamed from: L */
    public void mo949L() {
        super.mo949L();
        if (!this.f748ga && !this.f747fa) {
            this.f747fa = true;
        }
    }

    /* renamed from: O */
    public void mo950O() {
        super.mo950O();
        Dialog dialog = this.f745da;
        if (dialog != null) {
            this.f746ea = false;
            dialog.show();
        }
    }

    /* renamed from: P */
    public void mo951P() {
        super.mo951P();
        Dialog dialog = this.f745da;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: a */
    public void mo952a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo953a(Context context) {
        super.mo953a(context);
        if (!this.f748ga) {
            this.f747fa = false;
        }
    }

    /* renamed from: a */
    public void mo954a(C0287p pVar, String str) {
        this.f747fa = false;
        this.f748ga = true;
        C0235C a = pVar.mo1142a();
        a.mo848a(this, str);
        a.mo846a();
    }

    /* renamed from: b */
    public void mo955b(Bundle bundle) {
        super.mo955b(bundle);
        if (this.f743ba) {
            View z = mo1068z();
            if (z != null) {
                if (z.getParent() == null) {
                    this.f745da.setContentView(z);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C0281l d = mo1027d();
            if (d != null) {
                this.f745da.setOwnerActivity(d);
            }
            this.f745da.setCancelable(this.f742aa);
            this.f745da.setOnCancelListener(this);
            this.f745da.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f745da.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    /* renamed from: ba */
    public void mo956ba() {
        mo961g(false);
    }

    /* renamed from: c */
    public void mo957c(Bundle bundle) {
        super.mo957c(bundle);
        this.f743ba = this.f754A == 0;
        if (bundle != null) {
            this.f740Y = bundle.getInt("android:style", 0);
            this.f741Z = bundle.getInt("android:theme", 0);
            this.f742aa = bundle.getBoolean("android:cancelable", true);
            this.f743ba = bundle.getBoolean("android:showsDialog", this.f743ba);
            this.f744ca = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: ca */
    public int mo958ca() {
        return this.f741Z;
    }

    /* renamed from: d */
    public LayoutInflater mo959d(Bundle bundle) {
        Context c;
        if (!this.f743ba) {
            return super.mo959d(bundle);
        }
        this.f745da = mo963n(bundle);
        Dialog dialog = this.f745da;
        String str = "layout_inflater";
        if (dialog != null) {
            mo952a(dialog, this.f740Y);
            c = this.f745da.getContext();
        } else {
            c = this.f796u.mo1139c();
        }
        return (LayoutInflater) c.getSystemService(str);
    }

    /* renamed from: e */
    public void mo960e(Bundle bundle) {
        super.mo960e(bundle);
        Dialog dialog = this.f745da;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        int i = this.f740Y;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f741Z;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f742aa;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f743ba;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f744ca;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo961g(boolean z) {
        if (!this.f747fa) {
            this.f747fa = true;
            this.f748ga = false;
            Dialog dialog = this.f745da;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f746ea = true;
            if (this.f744ca >= 0) {
                mo1057p().mo1144a(this.f744ca, 1);
                this.f744ca = -1;
            } else {
                C0235C a = mo1057p().mo1142a();
                a.mo847a(this);
                if (z) {
                    a.mo849b();
                } else {
                    a.mo846a();
                }
            }
        }
    }

    /* renamed from: h */
    public void mo962h(boolean z) {
        this.f742aa = z;
        Dialog dialog = this.f745da;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: n */
    public Dialog mo963n(Bundle bundle) {
        return new Dialog(mo1027d(), mo958ca());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f746ea) {
            mo961g(true);
        }
    }
}
