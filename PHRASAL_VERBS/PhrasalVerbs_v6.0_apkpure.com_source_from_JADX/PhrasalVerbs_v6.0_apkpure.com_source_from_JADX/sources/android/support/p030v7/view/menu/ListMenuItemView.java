package android.support.p030v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v7.view.menu.C0487w.C0488a;
import android.support.p030v7.widget.C0620va;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0169g;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0488a, SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0474p f1591a;

    /* renamed from: b */
    private ImageView f1592b;

    /* renamed from: c */
    private RadioButton f1593c;

    /* renamed from: d */
    private TextView f1594d;

    /* renamed from: e */
    private CheckBox f1595e;

    /* renamed from: f */
    private TextView f1596f;

    /* renamed from: g */
    private ImageView f1597g;

    /* renamed from: h */
    private ImageView f1598h;

    /* renamed from: i */
    private LinearLayout f1599i;

    /* renamed from: j */
    private Drawable f1600j;

    /* renamed from: k */
    private int f1601k;

    /* renamed from: l */
    private Context f1602l;

    /* renamed from: m */
    private boolean f1603m;

    /* renamed from: n */
    private Drawable f1604n;

    /* renamed from: o */
    private boolean f1605o;

    /* renamed from: p */
    private int f1606p;

    /* renamed from: q */
    private LayoutInflater f1607q;

    /* renamed from: r */
    private boolean f1608r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0620va a = C0620va.m2920a(getContext(), attributeSet, C0172j.MenuView, i, 0);
        this.f1600j = a.mo3258b(C0172j.MenuView_android_itemBackground);
        this.f1601k = a.mo3267g(C0172j.MenuView_android_itemTextAppearance, -1);
        this.f1603m = a.mo3256a(C0172j.MenuView_preserveIconSpacing, false);
        this.f1602l = context;
        this.f1604n = a.mo3258b(C0172j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0163a.dropDownListViewStyle, 0);
        this.f1605o = obtainStyledAttributes.hasValue(0);
        a.mo3255a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m2116a() {
        this.f1595e = (CheckBox) getInflater().inflate(C0169g.abc_list_menu_item_checkbox, this, false);
        m2117a(this.f1595e);
    }

    /* renamed from: a */
    private void m2117a(View view) {
        m2118a(view, -1);
    }

    /* renamed from: a */
    private void m2118a(View view, int i) {
        LinearLayout linearLayout = this.f1599i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: b */
    private void m2119b() {
        this.f1592b = (ImageView) getInflater().inflate(C0169g.abc_list_menu_item_icon, this, false);
        m2118a((View) this.f1592b, 0);
    }

    /* renamed from: d */
    private void m2120d() {
        this.f1593c = (RadioButton) getInflater().inflate(C0169g.abc_list_menu_item_radio, this, false);
        m2117a(this.f1593c);
    }

    private LayoutInflater getInflater() {
        if (this.f1607q == null) {
            this.f1607q = LayoutInflater.from(getContext());
        }
        return this.f1607q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1597g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo2017a(C0474p pVar, int i) {
        this.f1591a = pVar;
        this.f1606p = i;
        setVisibility(pVar.isVisible() ? 0 : 8);
        setTitle(pVar.mo2250a((C0488a) this));
        setCheckable(pVar.isCheckable());
        mo2095a(pVar.mo2286m(), pVar.mo2258d());
        setIcon(pVar.getIcon());
        setEnabled(pVar.isEnabled());
        setSubMenuArrowVisible(pVar.hasSubMenu());
        setContentDescription(pVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo2095a(boolean z, char c) {
        int i = (!z || !this.f1591a.mo2286m()) ? 8 : 0;
        if (i == 0) {
            this.f1596f.setText(this.f1591a.mo2260e());
        }
        if (this.f1596f.getVisibility() != i) {
            this.f1596f.setVisibility(i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1598h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f1598h.getLayoutParams();
            rect.top += this.f1598h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: c */
    public boolean mo2020c() {
        return false;
    }

    public C0474p getItemData() {
        return this.f1591a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0156v.m547a((View) this, this.f1600j);
        this.f1594d = (TextView) findViewById(C0168f.title);
        int i = this.f1601k;
        if (i != -1) {
            this.f1594d.setTextAppearance(this.f1602l, i);
        }
        this.f1596f = (TextView) findViewById(C0168f.shortcut);
        this.f1597g = (ImageView) findViewById(C0168f.submenuarrow);
        ImageView imageView = this.f1597g;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1604n);
        }
        this.f1598h = (ImageView) findViewById(C0168f.group_divider);
        this.f1599i = (LinearLayout) findViewById(C0168f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1592b != null && this.f1603m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f1592b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1593c != null || this.f1595e != null) {
            if (this.f1591a.mo2278i()) {
                if (this.f1593c == null) {
                    m2120d();
                }
                compoundButton2 = this.f1593c;
                compoundButton = this.f1595e;
            } else {
                if (this.f1595e == null) {
                    m2116a();
                }
                compoundButton2 = this.f1595e;
                compoundButton = this.f1593c;
            }
            if (z) {
                compoundButton2.setChecked(this.f1591a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f1595e;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f1593c;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1591a.mo2278i()) {
            if (this.f1593c == null) {
                m2120d();
            }
            compoundButton = this.f1593c;
        } else {
            if (this.f1595e == null) {
                m2116a();
            }
            compoundButton = this.f1595e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1608r = z;
        this.f1603m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1598h;
        if (imageView != null) {
            imageView.setVisibility((this.f1605o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1591a.mo2285l() || this.f1608r;
        if (!z && !this.f1603m) {
            return;
        }
        if (this.f1592b != null || drawable != null || this.f1603m) {
            if (this.f1592b == null) {
                m2119b();
            }
            if (drawable != null || this.f1603m) {
                ImageView imageView = this.f1592b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f1592b.getVisibility() != 0) {
                    this.f1592b.setVisibility(0);
                }
            } else {
                this.f1592b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f1594d.setText(charSequence);
            if (this.f1594d.getVisibility() != 0) {
                textView = this.f1594d;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f1594d.getVisibility() != 8) {
                textView = this.f1594d;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
