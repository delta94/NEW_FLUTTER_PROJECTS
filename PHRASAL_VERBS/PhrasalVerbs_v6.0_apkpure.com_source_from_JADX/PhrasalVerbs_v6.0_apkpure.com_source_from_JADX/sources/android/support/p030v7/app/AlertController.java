package android.support.p030v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.p029v4.widget.NestedScrollView;
import android.support.p030v7.widget.C0534Q.C0535a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    NestedScrollView f1268A;

    /* renamed from: B */
    private int f1269B = 0;

    /* renamed from: C */
    private Drawable f1270C;

    /* renamed from: D */
    private ImageView f1271D;

    /* renamed from: E */
    private TextView f1272E;

    /* renamed from: F */
    private TextView f1273F;

    /* renamed from: G */
    private View f1274G;

    /* renamed from: H */
    ListAdapter f1275H;

    /* renamed from: I */
    int f1276I = -1;

    /* renamed from: J */
    private int f1277J;

    /* renamed from: K */
    private int f1278K;

    /* renamed from: L */
    int f1279L;

    /* renamed from: M */
    int f1280M;

    /* renamed from: N */
    int f1281N;

    /* renamed from: O */
    int f1282O;

    /* renamed from: P */
    private boolean f1283P;

    /* renamed from: Q */
    private int f1284Q = 0;

    /* renamed from: R */
    Handler f1285R;

    /* renamed from: S */
    private final OnClickListener f1286S = new C0416c(this);

    /* renamed from: a */
    private final Context f1287a;

    /* renamed from: b */
    final C0401B f1288b;

    /* renamed from: c */
    private final Window f1289c;

    /* renamed from: d */
    private final int f1290d;

    /* renamed from: e */
    private CharSequence f1291e;

    /* renamed from: f */
    private CharSequence f1292f;

    /* renamed from: g */
    ListView f1293g;

    /* renamed from: h */
    private View f1294h;

    /* renamed from: i */
    private int f1295i;

    /* renamed from: j */
    private int f1296j;

    /* renamed from: k */
    private int f1297k;

    /* renamed from: l */
    private int f1298l;

    /* renamed from: m */
    private int f1299m;

    /* renamed from: n */
    private boolean f1300n = false;

    /* renamed from: o */
    Button f1301o;

    /* renamed from: p */
    private CharSequence f1302p;

    /* renamed from: q */
    Message f1303q;

    /* renamed from: r */
    private Drawable f1304r;

    /* renamed from: s */
    Button f1305s;

    /* renamed from: t */
    private CharSequence f1306t;

    /* renamed from: u */
    Message f1307u;

    /* renamed from: v */
    private Drawable f1308v;

    /* renamed from: w */
    Button f1309w;

    /* renamed from: x */
    private CharSequence f1310x;

    /* renamed from: y */
    Message f1311y;

    /* renamed from: z */
    private Drawable f1312z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f1313a;

        /* renamed from: b */
        private final int f1314b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.RecycleListView);
            this.f1314b = obtainStyledAttributes.getDimensionPixelOffset(C0172j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1313a = obtainStyledAttributes.getDimensionPixelOffset(C0172j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo1822a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1313a, getPaddingRight(), z2 ? getPaddingBottom() : this.f1314b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0396a {

        /* renamed from: A */
        public int f1315A;

        /* renamed from: B */
        public int f1316B;

        /* renamed from: C */
        public int f1317C;

        /* renamed from: D */
        public int f1318D;

        /* renamed from: E */
        public boolean f1319E = false;

        /* renamed from: F */
        public boolean[] f1320F;

        /* renamed from: G */
        public boolean f1321G;

        /* renamed from: H */
        public boolean f1322H;

        /* renamed from: I */
        public int f1323I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f1324J;

        /* renamed from: K */
        public Cursor f1325K;

        /* renamed from: L */
        public String f1326L;

        /* renamed from: M */
        public String f1327M;

        /* renamed from: N */
        public OnItemSelectedListener f1328N;

        /* renamed from: O */
        public C0397a f1329O;

        /* renamed from: P */
        public boolean f1330P = true;

        /* renamed from: a */
        public final Context f1331a;

        /* renamed from: b */
        public final LayoutInflater f1332b;

        /* renamed from: c */
        public int f1333c = 0;

        /* renamed from: d */
        public Drawable f1334d;

        /* renamed from: e */
        public int f1335e = 0;

        /* renamed from: f */
        public CharSequence f1336f;

        /* renamed from: g */
        public View f1337g;

        /* renamed from: h */
        public CharSequence f1338h;

        /* renamed from: i */
        public CharSequence f1339i;

        /* renamed from: j */
        public Drawable f1340j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1341k;

        /* renamed from: l */
        public CharSequence f1342l;

        /* renamed from: m */
        public Drawable f1343m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1344n;

        /* renamed from: o */
        public CharSequence f1345o;

        /* renamed from: p */
        public Drawable f1346p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1347q;

        /* renamed from: r */
        public boolean f1348r;

        /* renamed from: s */
        public OnCancelListener f1349s;

        /* renamed from: t */
        public OnDismissListener f1350t;

        /* renamed from: u */
        public OnKeyListener f1351u;

        /* renamed from: v */
        public CharSequence[] f1352v;

        /* renamed from: w */
        public ListAdapter f1353w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1354x;

        /* renamed from: y */
        public int f1355y;

        /* renamed from: z */
        public View f1356z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0397a {
            /* renamed from: a */
            void mo1824a(ListView listView);
        }

        public C0396a(Context context) {
            this.f1331a = context;
            this.f1348r = true;
            this.f1332b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v2, types: [android.support.v7.app.AlertController$c] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v18, types: [android.support.v7.app.i] */
        /* JADX WARNING: type inference failed for: r1v19, types: [android.support.v7.app.h] */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v20, types: [android.support.v7.app.i] */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.support.v7.app.h] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [android.widget.ListAdapter]
          assigns: [android.widget.ListAdapter, android.widget.SimpleCursorAdapter, android.support.v7.app.i, android.support.v7.app.h]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.widget.ListAdapter, android.widget.SimpleCursorAdapter, android.support.v7.app.i, android.support.v7.app.h]
          mth insns count: 67
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1811b(android.support.p030v7.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f1332b
                int r1 = r12.f1279L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p030v7.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f1321G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f1325K
                if (r4 != 0) goto L_0x0026
                android.support.v7.app.h r9 = new android.support.v7.app.h
                android.content.Context r3 = r11.f1331a
                int r4 = r12.f1280M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f1352v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                android.support.v7.app.i r9 = new android.support.v7.app.i
                android.content.Context r3 = r11.f1331a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f1322H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f1281N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f1282O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f1325K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f1331a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f1326L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f1353w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r2 = r11.f1331a
                java.lang.CharSequence[] r3 = r11.f1352v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                android.support.v7.app.AlertController$a$a r1 = r11.f1329O
                if (r1 == 0) goto L_0x006e
                r1.mo1824a(r0)
            L_0x006e:
                r12.f1275H = r9
                int r1 = r11.f1323I
                r12.f1276I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f1354x
                if (r1 == 0) goto L_0x0081
                android.support.v7.app.j r1 = new android.support.v7.app.j
                r1.<init>(r11, r12)
            L_0x007d:
                r0.setOnItemClickListener(r1)
                goto L_0x008b
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f1324J
                if (r1 == 0) goto L_0x008b
                android.support.v7.app.k r1 = new android.support.v7.app.k
                r1.<init>(r11, r0, r12)
                goto L_0x007d
            L_0x008b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f1328N
                if (r1 == 0) goto L_0x0092
                r0.setOnItemSelectedListener(r1)
            L_0x0092:
                boolean r1 = r11.f1322H
                if (r1 == 0) goto L_0x009a
                r0.setChoiceMode(r8)
                goto L_0x00a2
            L_0x009a:
                boolean r1 = r11.f1321G
                if (r1 == 0) goto L_0x00a2
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a2:
                r12.f1293g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.app.AlertController.C0396a.m1811b(android.support.v7.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo1823a(AlertController alertController) {
            View view = this.f1337g;
            if (view != null) {
                alertController.mo1817b(view);
            } else {
                CharSequence charSequence = this.f1336f;
                if (charSequence != null) {
                    alertController.mo1818b(charSequence);
                }
                Drawable drawable = this.f1334d;
                if (drawable != null) {
                    alertController.mo1812a(drawable);
                }
                int i = this.f1333c;
                if (i != 0) {
                    alertController.mo1816b(i);
                }
                int i2 = this.f1335e;
                if (i2 != 0) {
                    alertController.mo1816b(alertController.mo1809a(i2));
                }
            }
            CharSequence charSequence2 = this.f1338h;
            if (charSequence2 != null) {
                alertController.mo1814a(charSequence2);
            }
            if (!(this.f1339i == null && this.f1340j == null)) {
                alertController.mo1811a(-1, this.f1339i, this.f1341k, (Message) null, this.f1340j);
            }
            if (!(this.f1342l == null && this.f1343m == null)) {
                alertController.mo1811a(-2, this.f1342l, this.f1344n, (Message) null, this.f1343m);
            }
            if (!(this.f1345o == null && this.f1346p == null)) {
                alertController.mo1811a(-3, this.f1345o, this.f1347q, (Message) null, this.f1346p);
            }
            if (!(this.f1352v == null && this.f1325K == null && this.f1353w == null)) {
                m1811b(alertController);
            }
            View view2 = this.f1356z;
            if (view2 == null) {
                int i3 = this.f1355y;
                if (i3 != 0) {
                    alertController.mo1820c(i3);
                }
            } else if (this.f1319E) {
                alertController.mo1813a(view2, this.f1315A, this.f1316B, this.f1317C, this.f1318D);
            } else {
                alertController.mo1821c(view2);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0398b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1357a;

        public C0398b(DialogInterface dialogInterface) {
            this.f1357a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1357a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0399c extends ArrayAdapter<CharSequence> {
        public C0399c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0401B b, Window window) {
        this.f1287a = context;
        this.f1288b = b;
        this.f1289c = window;
        this.f1285R = new C0398b(b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0172j.AlertDialog, C0163a.alertDialogStyle, 0);
        this.f1277J = obtainStyledAttributes.getResourceId(C0172j.AlertDialog_android_layout, 0);
        this.f1278K = obtainStyledAttributes.getResourceId(C0172j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1279L = obtainStyledAttributes.getResourceId(C0172j.AlertDialog_listLayout, 0);
        this.f1280M = obtainStyledAttributes.getResourceId(C0172j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1281N = obtainStyledAttributes.getResourceId(C0172j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1282O = obtainStyledAttributes.getResourceId(C0172j.AlertDialog_listItemLayout, 0);
        this.f1283P = obtainStyledAttributes.getBoolean(C0172j.AlertDialog_showTitle, true);
        this.f1290d = obtainStyledAttributes.getDimensionPixelSize(C0172j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        b.mo1847a(1);
    }

    /* renamed from: a */
    private ViewGroup m1785a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m1786a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m1787a(ViewGroup viewGroup) {
        boolean z;
        Button button;
        this.f1301o = (Button) viewGroup.findViewById(16908313);
        this.f1301o.setOnClickListener(this.f1286S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f1302p) || this.f1304r != null) {
            this.f1301o.setText(this.f1302p);
            Drawable drawable = this.f1304r;
            if (drawable != null) {
                int i = this.f1290d;
                drawable.setBounds(0, 0, i, i);
                this.f1301o.setCompoundDrawables(this.f1304r, null, null, null);
            }
            this.f1301o.setVisibility(0);
            z = true;
        } else {
            this.f1301o.setVisibility(8);
            z = false;
        }
        this.f1305s = (Button) viewGroup.findViewById(16908314);
        this.f1305s.setOnClickListener(this.f1286S);
        if (!TextUtils.isEmpty(this.f1306t) || this.f1308v != null) {
            this.f1305s.setText(this.f1306t);
            Drawable drawable2 = this.f1308v;
            if (drawable2 != null) {
                int i2 = this.f1290d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f1305s.setCompoundDrawables(this.f1308v, null, null, null);
            }
            this.f1305s.setVisibility(0);
            z |= true;
        } else {
            this.f1305s.setVisibility(8);
        }
        this.f1309w = (Button) viewGroup.findViewById(16908315);
        this.f1309w.setOnClickListener(this.f1286S);
        if (!TextUtils.isEmpty(this.f1310x) || this.f1312z != null) {
            this.f1309w.setText(this.f1310x);
            Drawable drawable3 = this.f1304r;
            if (drawable3 != null) {
                int i3 = this.f1290d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f1301o.setCompoundDrawables(this.f1304r, null, null, null);
            }
            this.f1309w.setVisibility(0);
            z |= true;
        } else {
            this.f1309w.setVisibility(8);
        }
        if (m1790a(this.f1287a)) {
            if (z) {
                button = this.f1301o;
            } else if (z) {
                button = this.f1305s;
            } else if (z) {
                button = this.f1309w;
            }
            m1789a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m1788a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f1289c.findViewById(C0168f.scrollIndicatorUp);
        View findViewById2 = this.f1289c.findViewById(C0168f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C0156v.m542a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f1292f != null) {
                this.f1268A.setOnScrollChangeListener(new C0417d(this, findViewById, view2));
                this.f1268A.post(new C0418e(this, findViewById, view2));
                return;
            }
            ListView listView = this.f1293g;
            if (listView != null) {
                listView.setOnScrollListener(new C0419f(this, findViewById, view2));
                this.f1293g.post(new C0420g(this, findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    private void m1789a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m1790a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0163a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m1791a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1791a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m1792b() {
        int i = this.f1278K;
        return i == 0 ? this.f1277J : this.f1284Q == 1 ? i : this.f1277J;
    }

    /* renamed from: b */
    private void m1793b(ViewGroup viewGroup) {
        this.f1268A = (NestedScrollView) this.f1289c.findViewById(C0168f.scrollView);
        this.f1268A.setFocusable(false);
        this.f1268A.setNestedScrollingEnabled(false);
        this.f1273F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f1273F;
        if (textView != null) {
            CharSequence charSequence = this.f1292f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f1268A.removeView(this.f1273F);
                if (this.f1293g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f1268A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f1268A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f1293g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: c */
    private void m1794c() {
        View findViewById = this.f1289c.findViewById(C0168f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0168f.topPanel);
        View findViewById3 = findViewById.findViewById(C0168f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0168f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0168f.customPanel);
        m1795c(viewGroup);
        View findViewById5 = viewGroup.findViewById(C0168f.topPanel);
        View findViewById6 = viewGroup.findViewById(C0168f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C0168f.buttonPanel);
        ViewGroup a = m1785a(findViewById5, findViewById2);
        ViewGroup a2 = m1785a(findViewById6, findViewById3);
        ViewGroup a3 = m1785a(findViewById7, findViewById4);
        m1793b(a2);
        m1787a(a3);
        m1796d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(C0168f.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f1268A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f1292f == null && this.f1293g == null)) {
                view = a.findViewById(C0168f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(C0168f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = this.f1293g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo1822a(z2, z3);
        }
        if (!z) {
            View view2 = this.f1293g;
            if (view2 == null) {
                view2 = this.f1268A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m1788a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f1293g;
        if (listView2 != null) {
            ListAdapter listAdapter = this.f1275H;
            if (listAdapter != null) {
                listView2.setAdapter(listAdapter);
                int i = this.f1276I;
                if (i > -1) {
                    listView2.setItemChecked(i, true);
                    listView2.setSelection(i);
                }
            }
        }
    }

    /* renamed from: c */
    private void m1795c(ViewGroup viewGroup) {
        View view = this.f1294h;
        boolean z = false;
        if (view == null) {
            view = this.f1295i != 0 ? LayoutInflater.from(this.f1287a).inflate(this.f1295i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m1791a(view)) {
            this.f1289c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f1289c.findViewById(C0168f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1300n) {
                frameLayout.setPadding(this.f1296j, this.f1297k, this.f1298l, this.f1299m);
            }
            if (this.f1293g != null) {
                ((C0535a) viewGroup.getLayoutParams()).f2011a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: d */
    private void m1796d(ViewGroup viewGroup) {
        if (this.f1274G != null) {
            viewGroup.addView(this.f1274G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1289c.findViewById(C0168f.title_template).setVisibility(8);
            return;
        }
        this.f1271D = (ImageView) this.f1289c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1291e)) || !this.f1283P) {
            this.f1289c.findViewById(C0168f.title_template).setVisibility(8);
            this.f1271D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1272E = (TextView) this.f1289c.findViewById(C0168f.alertTitle);
        this.f1272E.setText(this.f1291e);
        int i = this.f1269B;
        if (i != 0) {
            this.f1271D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1270C;
        if (drawable != null) {
            this.f1271D.setImageDrawable(drawable);
            return;
        }
        this.f1272E.setPadding(this.f1271D.getPaddingLeft(), this.f1271D.getPaddingTop(), this.f1271D.getPaddingRight(), this.f1271D.getPaddingBottom());
        this.f1271D.setVisibility(8);
    }

    /* renamed from: a */
    public int mo1809a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1287a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public void mo1810a() {
        this.f1288b.setContentView(m1792b());
        m1794c();
    }

    /* renamed from: a */
    public void mo1811a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1285R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f1310x = charSequence;
            this.f1311y = message;
            this.f1312z = drawable;
        } else if (i == -2) {
            this.f1306t = charSequence;
            this.f1307u = message;
            this.f1308v = drawable;
        } else if (i == -1) {
            this.f1302p = charSequence;
            this.f1303q = message;
            this.f1304r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo1812a(Drawable drawable) {
        this.f1270C = drawable;
        this.f1269B = 0;
        ImageView imageView = this.f1271D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f1271D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo1813a(View view, int i, int i2, int i3, int i4) {
        this.f1294h = view;
        this.f1295i = 0;
        this.f1300n = true;
        this.f1296j = i;
        this.f1297k = i2;
        this.f1298l = i3;
        this.f1299m = i4;
    }

    /* renamed from: a */
    public void mo1814a(CharSequence charSequence) {
        this.f1292f = charSequence;
        TextView textView = this.f1273F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo1815a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1268A;
        return nestedScrollView != null && nestedScrollView.mo1554a(keyEvent);
    }

    /* renamed from: b */
    public void mo1816b(int i) {
        this.f1270C = null;
        this.f1269B = i;
        ImageView imageView = this.f1271D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f1271D.setImageResource(this.f1269B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public void mo1817b(View view) {
        this.f1274G = view;
    }

    /* renamed from: b */
    public void mo1818b(CharSequence charSequence) {
        this.f1291e = charSequence;
        TextView textView = this.f1272E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo1819b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1268A;
        return nestedScrollView != null && nestedScrollView.mo1554a(keyEvent);
    }

    /* renamed from: c */
    public void mo1820c(int i) {
        this.f1294h = null;
        this.f1295i = i;
        this.f1300n = false;
    }

    /* renamed from: c */
    public void mo1821c(View view) {
        this.f1294h = view;
        this.f1295i = 0;
        this.f1300n = false;
    }
}
