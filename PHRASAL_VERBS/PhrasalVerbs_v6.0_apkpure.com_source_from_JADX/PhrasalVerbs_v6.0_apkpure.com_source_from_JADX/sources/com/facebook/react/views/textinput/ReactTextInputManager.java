package com.facebook.react.views.textinput;

import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.widget.TextView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.common.C1397f.C1398a;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p121a.C1596b;
import com.facebook.react.views.scroll.C1789j;
import com.facebook.react.views.scroll.C1791l;
import com.facebook.react.views.text.C1812d;
import com.facebook.react.views.text.C1821j;
import com.facebook.react.views.text.C1831s;
import com.facebook.react.views.text.C1838z;
import com.facebook.yoga.C1943a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import p000a.p005b.p009c.p010a.C0039a;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p032c.p033a.p098m.p112j.p114b.C1223d;

@C1176a(name = "AndroidTextInput")
public class ReactTextInputManager extends BaseViewManager<C1846d, C1691n> {
    private static final int BLUR_TEXT_INPUT = 2;
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final int KEYBOARD_TYPE_FLAGS = 12339;
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    protected static final String REACT_CLASS = "AndroidTextInput";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$a */
    private class C1839a implements C1843a {

        /* renamed from: a */
        private C1846d f5476a;

        /* renamed from: b */
        private C1638f f5477b;

        /* renamed from: c */
        private int f5478c = 0;

        /* renamed from: d */
        private int f5479d = 0;

        public C1839a(C1846d dVar) {
            this.f5476a = dVar;
            this.f5477b = ((UIManagerModule) ((ReactContext) dVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* renamed from: a */
        public void mo6532a() {
            int width = this.f5476a.getWidth();
            int height = this.f5476a.getHeight();
            if (this.f5476a.getLayout() != null) {
                width = this.f5476a.getCompoundPaddingLeft() + this.f5476a.getLayout().getWidth() + this.f5476a.getCompoundPaddingRight();
                height = this.f5476a.getCompoundPaddingTop() + this.f5476a.getLayout().getHeight() + this.f5476a.getCompoundPaddingBottom();
            }
            if (width != this.f5478c || height != this.f5479d) {
                this.f5479d = height;
                this.f5478c = width;
                this.f5477b.mo5886a((C1635c) new C1844b(this.f5476a.getId(), C1726w.m6666a((float) width), C1726w.m6666a((float) height)));
            }
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$b */
    private class C1840b implements C1863s {

        /* renamed from: a */
        private C1846d f5481a;

        /* renamed from: b */
        private C1638f f5482b;

        /* renamed from: c */
        private int f5483c;

        /* renamed from: d */
        private int f5484d;

        public C1840b(C1846d dVar) {
            this.f5481a = dVar;
            this.f5482b = ((UIManagerModule) ((ReactContext) dVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* renamed from: a */
        public void mo6533a(int i, int i2, int i3, int i4) {
            if (this.f5483c != i || this.f5484d != i2) {
                this.f5482b.mo5886a((C1635c) C1789j.m6857a(this.f5481a.getId(), C1791l.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.f5481a.getWidth(), this.f5481a.getHeight()));
                this.f5483c = i;
                this.f5484d = i2;
            }
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$c */
    private class C1841c implements C1864t {

        /* renamed from: a */
        private C1846d f5486a;

        /* renamed from: b */
        private C1638f f5487b;

        /* renamed from: c */
        private int f5488c;

        /* renamed from: d */
        private int f5489d;

        public C1841c(C1846d dVar) {
            this.f5486a = dVar;
            this.f5487b = ((UIManagerModule) ((ReactContext) dVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* renamed from: a */
        public void mo6534a(int i, int i2) {
            if (this.f5488c != i || this.f5489d != i2) {
                this.f5487b.mo5886a((C1635c) new C1860p(this.f5486a.getId(), i, i2));
                this.f5488c = i;
                this.f5489d = i2;
            }
        }
    }

    /* renamed from: com.facebook.react.views.textinput.ReactTextInputManager$d */
    private class C1842d implements TextWatcher {

        /* renamed from: a */
        private C1638f f5491a;

        /* renamed from: b */
        private C1846d f5492b;

        /* renamed from: c */
        private String f5493c = null;

        public C1842d(ReactContext reactContext, C1846d dVar) {
            this.f5491a = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.f5492b = dVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f5493c = charSequence.toString();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 != 0 || i2 != 0) {
                C1136a.m5053a(this.f5493c);
                String substring = charSequence.toString().substring(i, i + i3);
                int i4 = i + i2;
                String substring2 = this.f5493c.substring(i, i4);
                if (i3 != i2 || !substring.equals(substring2)) {
                    this.f5491a.mo5886a((C1635c) new C1850f(this.f5492b.getId(), charSequence.toString(), this.f5492b.mo6547e()));
                    C1638f fVar = this.f5491a;
                    C1853i iVar = new C1853i(this.f5492b.getId(), substring, substring2, i, i4);
                    fVar.mo5886a((C1635c) iVar);
                }
            }
        }
    }

    private static void checkPasswordType(C1846d dVar) {
        if ((dVar.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (dVar.getStagedInputType() & 128) != 0) {
            updateStagedInputTypeFlag(dVar, 128, 16);
        }
    }

    private static int parseNumericFontWeight(String str) {
        return (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') ? UNSET : (str.charAt(0) - '0') * 100;
    }

    private void setCursorColor(C1846d dVar, Integer num) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(dVar);
            if (i != 0) {
                Drawable c = C0039a.m111c(dVar.getContext(), i);
                if (num != null) {
                    c.setColorFilter(num.intValue(), Mode.SRC_IN);
                }
                Drawable[] drawableArr = {c, c};
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(dVar);
                Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                declaredField3.set(obj, drawableArr);
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    private static void updateStagedInputTypeFlag(C1846d dVar, int i, int i2) {
        dVar.setStagedInputType(((i ^ UNSET) & dVar.getStagedInputType()) | i2);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1846d dVar) {
        dVar.addTextChangedListener(new C1842d(n, dVar));
        dVar.setOnFocusChangeListener(new C1858n(this, n, dVar));
        dVar.setOnEditorActionListener(new C1859o(this, dVar, n));
    }

    public C1691n createShadowNodeInstance() {
        return new C1861q();
    }

    public C1846d createViewInstance(C1578N n) {
        C1846d dVar = new C1846d(n);
        dVar.setInputType(dVar.getInputType() & -131073);
        dVar.setReturnKeyType("done");
        return dVar;
    }

    public Map<String, Integer> getCommandsMap() {
        return C1397f.m5736a("focusTextInput", Integer.valueOf(1), "blurTextInput", Integer.valueOf(2));
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        C1398a a = C1397f.m5734a();
        String str = "captured";
        String str2 = "bubbled";
        String str3 = "phasedRegistrationNames";
        String str4 = "topSubmitEditing";
        a.mo5183a(str4, C1397f.m5735a(str3, C1397f.m5736a(str2, "onSubmitEditing", str, "onSubmitEditingCapture")));
        a.mo5183a("topEndEditing", C1397f.m5735a(str3, C1397f.m5736a(str2, "onEndEditing", str, "onEndEditingCapture")));
        a.mo5183a("topTextInput", C1397f.m5735a(str3, C1397f.m5736a(str2, "onTextInput", str, "onTextInputCapture")));
        a.mo5183a("topFocus", C1397f.m5735a(str3, C1397f.m5736a(str2, "onFocus", str, "onFocusCapture")));
        a.mo5183a("topBlur", C1397f.m5735a(str3, C1397f.m5736a(str2, "onBlur", str, "onBlurCapture")));
        a.mo5183a("topKeyPress", C1397f.m5735a(str3, C1397f.m5736a(str2, "onKeyPress", str, "onKeyPressCapture")));
        return a.mo5184a();
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C1398a a = C1397f.m5734a();
        a.mo5183a(C1791l.m6865a(C1791l.SCROLL), C1397f.m5735a("registrationName", "onScroll"));
        return a.mo5184a();
    }

    public Map getExportedViewConstants() {
        return C1397f.m5735a("AutoCapitalizationType", C1397f.m5738a("none", Integer.valueOf(0), "characters", Integer.valueOf(4096), "words", Integer.valueOf(8192), "sentences", Integer.valueOf(16384)));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<? extends C1691n> getShadowNodeClass() {
        return C1861q.class;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C1846d dVar) {
        super.onAfterUpdateTransaction(dVar);
        dVar.mo6546d();
    }

    public void receiveCommand(C1846d dVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            dVar.mo6548f();
        } else if (i == 2) {
            dVar.mo6544c();
        }
    }

    @C1595a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C1846d dVar, boolean z) {
        dVar.setAllowFontScaling(z);
    }

    @C1595a(name = "autoCapitalize")
    public void setAutoCapitalize(C1846d dVar, int i) {
        updateStagedInputTypeFlag(dVar, 28672, i);
    }

    @C1595a(name = "autoCorrect")
    public void setAutoCorrect(C1846d dVar, Boolean bool) {
        int i = bool != null ? bool.booleanValue() ? 32768 : 524288 : 0;
        updateStagedInputTypeFlag(dVar, 557056, i);
    }

    @C1595a(name = "blurOnSubmit")
    public void setBlurOnSubmit(C1846d dVar, Boolean bool) {
        dVar.setBlurOnSubmit(bool);
    }

    @C1596b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1846d dVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        dVar.mo6540a(SPACING_TYPES[i], intValue, f);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1846d dVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        if (i == 0) {
            dVar.setBorderRadius(f);
        } else {
            dVar.mo6538a(f, i + UNSET);
        }
    }

    @C1595a(name = "borderStyle")
    public void setBorderStyle(C1846d dVar, String str) {
        dVar.setBorderStyle(str);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1846d dVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        dVar.mo6539a(SPACING_TYPES[i], f);
    }

    @C1595a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C1846d dVar, boolean z) {
        dVar.setCursorVisible(!z);
    }

    @C1595a(customType = "Color", name = "color")
    public void setColor(C1846d dVar, Integer num) {
        if (num == null) {
            dVar.setTextColor(C1812d.m6912a(dVar.getContext()));
        } else {
            dVar.setTextColor(num.intValue());
        }
    }

    @C1595a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C1846d dVar, boolean z) {
        dVar.setOnLongClickListener(new C1857m(this, z));
    }

    @C1595a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C1846d dVar, boolean z) {
        dVar.setDisableFullscreenUI(z);
    }

    @C1595a(defaultBoolean = true, name = "editable")
    public void setEditable(C1846d dVar, boolean z) {
        dVar.setEnabled(z);
    }

    @C1595a(name = "fontFamily")
    public void setFontFamily(C1846d dVar, String str) {
        dVar.setTypeface(C1821j.m6935a().mo6404a(str, dVar.getTypeface() != null ? dVar.getTypeface().getStyle() : 0, dVar.getContext().getAssets()));
    }

    @C1595a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C1846d dVar, float f) {
        dVar.setFontSize(f);
    }

    @C1595a(name = "fontStyle")
    public void setFontStyle(C1846d dVar, String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : UNSET;
        Typeface typeface = dVar.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            dVar.setTypeface(typeface, i);
        }
    }

    @C1595a(name = "fontWeight")
    public void setFontWeight(C1846d dVar, String str) {
        int i = UNSET;
        int parseNumericFontWeight = str != null ? parseNumericFontWeight(str) : UNSET;
        if (parseNumericFontWeight >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (parseNumericFontWeight != UNSET && parseNumericFontWeight < 500)) {
            i = 0;
        }
        Typeface typeface = dVar.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        if (i != typeface.getStyle()) {
            dVar.setTypeface(typeface, i);
        }
    }

    @C1595a(name = "importantForAutofill")
    public void setImportantForAutofill(C1846d dVar, String str) {
        if (VERSION.SDK_INT >= 26) {
            int i = 0;
            if ("no".equals(str)) {
                i = 2;
            } else if ("noExcludeDescendants".equals(str)) {
                i = 8;
            } else if ("yes".equals(str)) {
                i = 1;
            } else if ("yesExcludeDescendants".equals(str)) {
                i = 4;
            }
            dVar.setImportantForAutofill(i);
        }
    }

    @C1595a(name = "inlineImageLeft")
    public void setInlineImageLeft(C1846d dVar, String str) {
        dVar.setCompoundDrawablesWithIntrinsicBounds(C1223d.m5230a().mo4564b(dVar.getContext(), str), 0, 0, 0);
    }

    @C1595a(name = "inlineImagePadding")
    public void setInlineImagePadding(C1846d dVar, int i) {
        dVar.setCompoundDrawablePadding(i);
    }

    @C1595a(name = "keyboardType")
    public void setKeyboardType(C1846d dVar, String str) {
        int i = KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str) ? INPUT_TYPE_KEYBOARD_NUMBERED : KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str) ? 2 : KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str) ? INPUT_TYPE_KEYBOARD_DECIMAL_PAD : KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str) ? 33 : KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : 1;
        updateStagedInputTypeFlag(dVar, KEYBOARD_TYPE_FLAGS, i);
        checkPasswordType(dVar);
    }

    @C1595a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C1846d dVar, float f) {
        dVar.setLetterSpacingPt(f);
    }

    @C1595a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C1846d dVar, float f) {
        dVar.setMaxFontSizeMultiplier(f);
    }

    @C1595a(name = "maxLength")
    public void setMaxLength(C1846d dVar, Integer num) {
        InputFilter[] filters = dVar.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < filters.length; i++) {
                    if (!(filters[i] instanceof LengthFilter)) {
                        linkedList.add(filters[i]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i2 = 0; i2 < filters.length; i2++) {
                if (filters[i2] instanceof LengthFilter) {
                    filters[i2] = new LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (!z) {
                inputFilterArr = new InputFilter[(filters.length + 1)];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                filters[filters.length] = new LengthFilter(num.intValue());
            } else {
                inputFilterArr = filters;
            }
        } else {
            inputFilterArr = new InputFilter[]{new LengthFilter(num.intValue())};
        }
        dVar.setFilters(inputFilterArr);
    }

    @C1595a(defaultInt = 0, name = "mostRecentEventCount")
    public void setMostRecentEventCount(C1846d dVar, int i) {
        dVar.setMostRecentEventCount(i);
    }

    @C1595a(defaultBoolean = false, name = "multiline")
    public void setMultiline(C1846d dVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 131072;
        if (z) {
            i = 131072;
        }
        updateStagedInputTypeFlag(dVar, i2, i);
    }

    @C1595a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C1846d dVar, int i) {
        dVar.setLines(i);
    }

    @C1595a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C1846d dVar, boolean z) {
        dVar.setContentSizeWatcher(z ? new C1839a(dVar) : null);
    }

    @C1595a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C1846d dVar, boolean z) {
        dVar.setOnKeyPress(z);
    }

    @C1595a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C1846d dVar, boolean z) {
        dVar.setScrollWatcher(z ? new C1840b(dVar) : null);
    }

    @C1595a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C1846d dVar, boolean z) {
        dVar.setSelectionWatcher(z ? new C1841c(dVar) : null);
    }

    @C1595a(name = "placeholder")
    public void setPlaceholder(C1846d dVar, String str) {
        dVar.setHint(str);
    }

    @C1595a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C1846d dVar, Integer num) {
        if (num == null) {
            dVar.setHintTextColor(C1812d.m6915c(dVar.getContext()));
        } else {
            dVar.setHintTextColor(num.intValue());
        }
    }

    @C1595a(name = "returnKeyLabel")
    public void setReturnKeyLabel(C1846d dVar, String str) {
        dVar.setImeActionLabel(str, IME_ACTION_ID);
    }

    @C1595a(name = "returnKeyType")
    public void setReturnKeyType(C1846d dVar, String str) {
        dVar.setReturnKeyType(str);
    }

    @C1595a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C1846d dVar, boolean z) {
        int i = 0;
        int i2 = z ? 0 : 144;
        if (z) {
            i = 128;
        }
        updateStagedInputTypeFlag(dVar, i2, i);
        checkPasswordType(dVar);
    }

    @C1595a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C1846d dVar, boolean z) {
        dVar.setSelectAllOnFocus(z);
    }

    @C1595a(name = "selection")
    public void setSelection(C1846d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            String str = "start";
            if (readableMap.hasKey(str)) {
                String str2 = "end";
                if (readableMap.hasKey(str2)) {
                    dVar.setSelection(readableMap.getInt(str), readableMap.getInt(str2));
                }
            }
        }
    }

    @C1595a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C1846d dVar, Integer num) {
        dVar.setHighlightColor(num == null ? C1812d.m6914b(dVar.getContext()) : num.intValue());
        setCursorColor(dVar, num);
    }

    @C1595a(name = "textAlign")
    public void setTextAlign(C1846d dVar, String str) {
        if (!"justify".equals(str)) {
            if (VERSION.SDK_INT >= 26) {
                dVar.setJustificationMode(0);
            }
            if (str == null || "auto".equals(str)) {
                dVar.setGravityHorizontal(0);
                return;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    dVar.setGravityHorizontal(5);
                    return;
                } else if ("center".equals(str)) {
                    dVar.setGravityHorizontal(1);
                    return;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid textAlign: ");
                    sb.append(str);
                    throw new JSApplicationIllegalArgumentException(sb.toString());
                }
            }
        } else if (VERSION.SDK_INT >= 26) {
            dVar.setJustificationMode(1);
        }
        dVar.setGravityHorizontal(3);
    }

    @C1595a(name = "textAlignVertical")
    public void setTextAlignVertical(C1846d dVar, String str) {
        int i;
        if (str == null || "auto".equals(str)) {
            i = 0;
        } else if ("top".equals(str)) {
            i = 48;
        } else if ("bottom".equals(str)) {
            i = 80;
        } else if ("center".equals(str)) {
            i = 16;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid textAlignVertical: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        dVar.setGravityVertical(i);
    }

    @C1595a(name = "autoComplete")
    public void setTextContentType(C1846d dVar, String str) {
        String[] strArr;
        if (VERSION.SDK_INT >= 26) {
            if (str != null) {
                String str2 = "username";
                if (str2.equals(str)) {
                    strArr = new String[]{str2};
                } else {
                    String str3 = "password";
                    if (str3.equals(str)) {
                        strArr = new String[]{str3};
                    } else if ("email".equals(str)) {
                        strArr = new String[]{"emailAddress"};
                    } else {
                        String str4 = "name";
                        if (str4.equals(str)) {
                            strArr = new String[]{str4};
                        } else if ("tel".equals(str)) {
                            strArr = new String[]{"phone"};
                        } else if ("street-address".equals(str)) {
                            strArr = new String[]{"postalAddress"};
                        } else if ("postal-code".equals(str)) {
                            strArr = new String[]{"postalCode"};
                        } else if ("cc-number".equals(str)) {
                            strArr = new String[]{"creditCardNumber"};
                        } else if ("cc-csc".equals(str)) {
                            strArr = new String[]{"creditCardSecurityCode"};
                        } else if ("cc-exp".equals(str)) {
                            strArr = new String[]{"creditCardExpirationDate"};
                        } else if ("cc-exp-month".equals(str)) {
                            strArr = new String[]{"creditCardExpirationMonth"};
                        } else if ("cc-exp-year".equals(str)) {
                            strArr = new String[]{"creditCardExpirationYear"};
                        } else if (!"off".equals(str)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid autocomplete option: ");
                            sb.append(str);
                            throw new JSApplicationIllegalArgumentException(sb.toString());
                        }
                    }
                }
                dVar.setAutofillHints(strArr);
            }
            dVar.setImportantForAutofill(2);
        }
    }

    @C1595a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C1846d dVar, Integer num) {
        Drawable background = dVar.getBackground();
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e) {
                C0727a.m3267a(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", (Throwable) e);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    public void updateExtraData(C1846d dVar, Object obj) {
        if (obj instanceof C1831s) {
            C1831s sVar = (C1831s) obj;
            dVar.setPadding((int) sVar.mo6414e(), (int) sVar.mo6416g(), (int) sVar.mo6415f(), (int) sVar.mo6413d());
            if (sVar.mo6410a()) {
                C1838z.m7020a(sVar.mo6417h(), dVar);
            }
            dVar.mo6541a(sVar);
        }
    }
}
