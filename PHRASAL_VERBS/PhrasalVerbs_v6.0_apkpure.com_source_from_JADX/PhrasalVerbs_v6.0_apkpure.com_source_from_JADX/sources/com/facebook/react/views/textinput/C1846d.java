package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.text.C1825m;
import com.facebook.react.views.text.C1831s;
import com.facebook.react.views.text.C1837y;
import com.facebook.react.views.text.C1838z;
import com.facebook.react.views.view.C1884f;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p005b.p021d.p022a.C0172j;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.views.textinput.d */
public class C1846d extends EditText {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final KeyListener f5497a = QwertyKeyListener.getInstanceForFullKeyboard();

    /* renamed from: b */
    private final InputMethodManager f5498b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f5499c;

    /* renamed from: d */
    private boolean f5500d;

    /* renamed from: e */
    private int f5501e;

    /* renamed from: f */
    private int f5502f;

    /* renamed from: g */
    private int f5503g;

    /* renamed from: h */
    private int f5504h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<TextWatcher> f5505i;

    /* renamed from: j */
    private C1848b f5506j;

    /* renamed from: k */
    private int f5507k;

    /* renamed from: l */
    private boolean f5508l;

    /* renamed from: m */
    private Boolean f5509m;

    /* renamed from: n */
    private boolean f5510n;

    /* renamed from: o */
    private String f5511o;

    /* renamed from: p */
    private C1864t f5512p;

    /* renamed from: q */
    private C1843a f5513q;

    /* renamed from: r */
    private C1863s f5514r;

    /* renamed from: s */
    private final C1847a f5515s;

    /* renamed from: t */
    private boolean f5516t = false;

    /* renamed from: u */
    private boolean f5517u = false;

    /* renamed from: v */
    private C1837y f5518v;

    /* renamed from: w */
    private C1884f f5519w;

    /* renamed from: com.facebook.react.views.textinput.d$a */
    private static class C1847a implements KeyListener {

        /* renamed from: a */
        private int f5520a = 0;

        /* renamed from: a */
        public void mo6589a(int i) {
            this.f5520a = i;
        }

        public void clearMetaKeyState(View view, Editable editable, int i) {
            C1846d.f5497a.clearMetaKeyState(view, editable, i);
        }

        public int getInputType() {
            return this.f5520a;
        }

        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return C1846d.f5497a.onKeyDown(view, editable, i, keyEvent);
        }

        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return C1846d.f5497a.onKeyOther(view, editable, keyEvent);
        }

        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return C1846d.f5497a.onKeyUp(view, editable, i, keyEvent);
        }
    }

    /* renamed from: com.facebook.react.views.textinput.d$b */
    private class C1848b implements TextWatcher {
        private C1848b() {
        }

        public void afterTextChanged(Editable editable) {
            if (!C1846d.this.f5499c && C1846d.this.f5505i != null) {
                Iterator it = C1846d.this.f5505i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).afterTextChanged(editable);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!C1846d.this.f5499c && C1846d.this.f5505i != null) {
                Iterator it = C1846d.this.f5505i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!C1846d.this.f5499c && C1846d.this.f5505i != null) {
                Iterator it = C1846d.this.f5505i.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            C1846d.this.m7044j();
        }
    }

    public C1846d(Context context) {
        super(context);
        setFocusableInTouchMode(false);
        this.f5519w = new C1884f(this);
        Object systemService = getContext().getSystemService("input_method");
        C1136a.m5053a(systemService);
        this.f5498b = (InputMethodManager) systemService;
        this.f5501e = getGravity() & 8388615;
        this.f5502f = getGravity() & C0172j.AppCompatTheme_windowActionBarOverlay;
        this.f5503g = 0;
        this.f5504h = 0;
        this.f5499c = false;
        this.f5500d = false;
        this.f5509m = null;
        this.f5510n = false;
        this.f5505i = null;
        this.f5506j = null;
        this.f5507k = getInputType();
        this.f5515s = new C1847a();
        this.f5514r = null;
        this.f5518v = new C1837y();
        mo6543b();
    }

    /* renamed from: a */
    private void m7036a(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i = 0; i < spans.length; i++) {
            if (spans[i] instanceof C1825m) {
                getText().removeSpan(spans[i]);
            }
            if ((getText().getSpanFlags(spans[i]) & 33) == 33) {
                Object obj = spans[i];
                int spanStart = getText().getSpanStart(spans[i]);
                int spanEnd = getText().getSpanEnd(spans[i]);
                int spanFlags = getText().getSpanFlags(spans[i]);
                getText().removeSpan(spans[i]);
                if (m7037a(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m7037a(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: g */
    private void m7041g() {
        this.f5498b.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private C1848b getTextWatcherDelegator() {
        if (this.f5506j == null) {
            this.f5506j = new C1848b();
        }
        return this.f5506j;
    }

    /* renamed from: h */
    private boolean m7042h() {
        return (getInputType() & 131072) != 0;
    }

    /* renamed from: i */
    private boolean m7043i() {
        return (getInputType() & 144) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m7044j() {
        C1843a aVar = this.f5513q;
        if (aVar != null) {
            aVar.mo6532a();
        }
        m7045k();
    }

    /* renamed from: k */
    private void m7045k() {
        ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new C1856l(this));
    }

    /* renamed from: l */
    private boolean m7046l() {
        return this.f5498b.showSoftInput(this, 0);
    }

    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7047m() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f5511o
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 5
            r5 = 2
            r6 = 6
            if (r0 == 0) goto L_0x0068
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L_0x004f;
                case -906336856: goto L_0x0045;
                case 3304: goto L_0x003b;
                case 3089282: goto L_0x0031;
                case 3377907: goto L_0x0027;
                case 3387192: goto L_0x001d;
                case 3526536: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0059
        L_0x0013:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0059
            r0 = 5
            goto L_0x005a
        L_0x001d:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0059
            r0 = 2
            goto L_0x005a
        L_0x0027:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0031:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0059
            r0 = 6
            goto L_0x005a
        L_0x003b:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0059
            r0 = 0
            goto L_0x005a
        L_0x0045:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0059
            r0 = 4
            goto L_0x005a
        L_0x004f:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0059
            r0 = 3
            goto L_0x005a
        L_0x0059:
            r0 = -1
        L_0x005a:
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0064;
                case 2: goto L_0x0062;
                case 3: goto L_0x0060;
                case 4: goto L_0x005e;
                case 5: goto L_0x0069;
                case 6: goto L_0x0068;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0068
        L_0x005e:
            r1 = 3
            goto L_0x0069
        L_0x0060:
            r1 = 7
            goto L_0x0069
        L_0x0062:
            r1 = 1
            goto L_0x0069
        L_0x0064:
            r1 = 5
            goto L_0x0069
        L_0x0066:
            r1 = 2
            goto L_0x0069
        L_0x0068:
            r1 = 6
        L_0x0069:
            boolean r0 = r9.f5510n
            if (r0 == 0) goto L_0x0074
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            goto L_0x0077
        L_0x0074:
            r9.setImeOptions(r1)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.C1846d.m7047m():void");
    }

    /* renamed from: a */
    public void mo6538a(float f, int i) {
        this.f5519w.mo6687a(f, i);
    }

    /* renamed from: a */
    public void mo6539a(int i, float f) {
        this.f5519w.mo6689a(i, f);
    }

    /* renamed from: a */
    public void mo6540a(int i, float f, float f2) {
        this.f5519w.mo6690a(i, f, f2);
    }

    /* renamed from: a */
    public void mo6541a(C1831s sVar) {
        if (!m7043i() || !TextUtils.equals(getText(), sVar.mo6417h())) {
            this.f5504h = sVar.mo6411b();
            if (this.f5504h >= this.f5503g) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.mo6417h());
                m7036a(spannableStringBuilder);
                this.f5508l = sVar.mo6410a();
                this.f5499c = true;
                getText().replace(0, length(), spannableStringBuilder);
                this.f5499c = false;
                if (VERSION.SDK_INT >= 23 && getBreakStrategy() != sVar.mo6419j()) {
                    setBreakStrategy(sVar.mo6419j());
                }
            }
        }
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f5505i == null) {
            this.f5505i = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f5505i.add(textWatcher);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6543b() {
        setTextSize(0, (float) this.f5518v.mo6470b());
        if (VERSION.SDK_INT >= 21) {
            float c = this.f5518v.mo6472c();
            if (!Float.isNaN(c)) {
                setLetterSpacing(c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6544c() {
        clearFocus();
    }

    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        m7041g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo6546d() {
        if (getInputType() != this.f5507k) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f5507k);
            setSelection(selectionStart, selectionEnd);
        }
    }

    /* renamed from: e */
    public int mo6547e() {
        int i = this.f5503g + 1;
        this.f5503g = i;
        return i;
    }

    /* renamed from: f */
    public void mo6548f() {
        this.f5500d = true;
        requestFocus();
        this.f5500d = false;
    }

    public boolean getBlurOnSubmit() {
        Boolean bool = this.f5509m;
        return bool == null ? !m7042h() : bool.booleanValue();
    }

    public boolean getDisableFullscreenUI() {
        return this.f5510n;
    }

    public String getReturnKeyType() {
        return this.f5511o;
    }

    /* access modifiers changed from: 0000 */
    public int getStagedInputType() {
        return this.f5507k;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f5508l) {
            Editable text = getText();
            for (C1838z a : (C1838z[]) text.getSpans(0, text.length(), C1838z.class)) {
                if (a.mo6375a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public boolean isLayoutRequested() {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5508l) {
            Editable text = getText();
            for (C1838z c : (C1838z[]) text.getSpans(0, text.length(), C1838z.class)) {
                c.mo6378c();
            }
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = (ReactContext) getContext();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.f5517u) {
            onCreateInputConnection = new C1849e(onCreateInputConnection, reactContext, this);
        }
        if (m7042h() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5508l) {
            Editable text = getText();
            for (C1838z d : (C1838z[]) text.getSpans(0, text.length(), C1838z.class)) {
                d.mo6379d();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f5508l) {
            Editable text = getText();
            for (C1838z e : (C1838z[]) text.getSpans(0, text.length(), C1838z.class)) {
                e.mo6381e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            C1864t tVar = this.f5512p;
            if (tVar != null) {
                tVar.mo6534a(getSelectionStart(), getSelectionEnd());
            }
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || m7042h()) {
            return super.onKeyUp(i, keyEvent);
        }
        m7041g();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m7044j();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C1863s sVar = this.f5514r;
        if (sVar != null) {
            sVar.mo6533a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f5512p != null && hasFocus()) {
            this.f5512p.mo6534a(i, i2);
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f5508l) {
            Editable text = getText();
            for (C1838z f : (C1838z[]) text.getSpans(0, text.length(), C1838z.class)) {
                f.mo6382f();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5516t = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f5516t) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f5516t = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.f5505i;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f5505i.isEmpty()) {
                this.f5505i = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (!this.f5500d) {
            return false;
        }
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(i, rect);
        m7046l();
        return requestFocus;
    }

    public void setAllowFontScaling(boolean z) {
        if (this.f5518v.mo6469a() != z) {
            this.f5518v.mo6468a(z);
            mo6543b();
        }
    }

    public void setBackgroundColor(int i) {
        this.f5519w.mo6688a(i);
    }

    public void setBlurOnSubmit(Boolean bool) {
        this.f5509m = bool;
    }

    public void setBorderRadius(float f) {
        this.f5519w.mo6686a(f);
    }

    public void setBorderStyle(String str) {
        this.f5519w.mo6691a(str);
    }

    public void setContentSizeWatcher(C1843a aVar) {
        this.f5513q = aVar;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.f5510n = z;
        m7047m();
    }

    public void setFontSize(float f) {
        this.f5518v.mo6466a(f);
        mo6543b();
    }

    /* access modifiers changed from: 0000 */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f5501e;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    /* access modifiers changed from: 0000 */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f5502f;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.f5507k = i;
        super.setTypeface(typeface);
        this.f5515s.mo6589a(i);
        setKeyListener(this.f5515s);
    }

    public void setLetterSpacingPt(float f) {
        this.f5518v.mo6473c(f);
        mo6543b();
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.f5518v.mo6482j()) {
            this.f5518v.mo6477e(f);
            mo6543b();
        }
    }

    public void setMostRecentEventCount(int i) {
        this.f5504h = i;
    }

    public void setOnKeyPress(boolean z) {
        this.f5517u = z;
    }

    public void setReturnKeyType(String str) {
        this.f5511o = str;
        m7047m();
    }

    public void setScrollWatcher(C1863s sVar) {
        this.f5514r = sVar;
    }

    public void setSelection(int i, int i2) {
        if (this.f5504h >= this.f5503g) {
            super.setSelection(i, i2);
        }
    }

    public void setSelectionWatcher(C1864t tVar) {
        this.f5512p = tVar;
    }

    /* access modifiers changed from: 0000 */
    public void setStagedInputType(int i) {
        this.f5507k = i;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f5508l) {
            Editable text = getText();
            for (C1838z a : (C1838z[]) text.getSpans(0, text.length(), C1838z.class)) {
                if (a.mo6375a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
