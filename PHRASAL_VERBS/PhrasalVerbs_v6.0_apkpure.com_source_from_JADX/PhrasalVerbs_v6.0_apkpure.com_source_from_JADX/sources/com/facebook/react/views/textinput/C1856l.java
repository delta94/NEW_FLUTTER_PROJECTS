package com.facebook.react.views.textinput;

import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* renamed from: com.facebook.react.views.textinput.l */
public final class C1856l {

    /* renamed from: a */
    private final SpannableStringBuilder f5534a;

    /* renamed from: b */
    private final float f5535b;

    /* renamed from: c */
    private final int f5536c;

    /* renamed from: d */
    private final int f5537d;

    /* renamed from: e */
    private final int f5538e;

    /* renamed from: f */
    private final int f5539f;

    /* renamed from: g */
    private final CharSequence f5540g;

    public C1856l(EditText editText) {
        this.f5534a = new SpannableStringBuilder(editText.getText());
        this.f5535b = editText.getTextSize();
        this.f5538e = editText.getInputType();
        this.f5540g = editText.getHint();
        this.f5536c = editText.getMinLines();
        this.f5537d = editText.getMaxLines();
        this.f5539f = VERSION.SDK_INT >= 23 ? editText.getBreakStrategy() : 0;
    }

    /* renamed from: a */
    public void mo6604a(EditText editText) {
        editText.setText(this.f5534a);
        editText.setTextSize(0, this.f5535b);
        editText.setMinLines(this.f5536c);
        editText.setMaxLines(this.f5537d);
        editText.setInputType(this.f5538e);
        editText.setHint(this.f5540g);
        if (VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f5539f);
        }
    }
}
