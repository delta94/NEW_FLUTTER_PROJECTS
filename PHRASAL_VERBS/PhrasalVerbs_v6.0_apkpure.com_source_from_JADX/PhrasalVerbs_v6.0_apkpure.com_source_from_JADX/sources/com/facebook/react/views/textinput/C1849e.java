package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;

/* renamed from: com.facebook.react.views.textinput.e */
class C1849e extends InputConnectionWrapper {

    /* renamed from: a */
    private C1846d f5522a;

    /* renamed from: b */
    private C1638f f5523b;

    /* renamed from: c */
    private boolean f5524c;

    /* renamed from: d */
    private String f5525d = null;

    public C1849e(InputConnection inputConnection, ReactContext reactContext, C1846d dVar) {
        super(inputConnection, false);
        this.f5523b = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.f5522a = dVar;
    }

    /* renamed from: a */
    private void m7058a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f5523b.mo5886a((C1635c) new C1855k(this.f5522a.getId(), str));
    }

    /* renamed from: b */
    private void m7059b(String str) {
        if (this.f5524c) {
            this.f5525d = str;
        } else {
            m7058a(str);
        }
    }

    public boolean beginBatchEdit() {
        this.f5524c = true;
        return super.beginBatchEdit();
    }

    public boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 1) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            m7059b(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        m7058a("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    public boolean endBatchEdit() {
        this.f5524c = false;
        String str = this.f5525d;
        if (str != null) {
            m7058a(str);
            this.f5525d = null;
        }
        return super.endBatchEdit();
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        String str;
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                str = "Backspace";
            } else if (keyEvent.getKeyCode() == 66) {
                str = "Enter";
            }
            m7058a(str);
        }
        return super.sendKeyEvent(keyEvent);
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.f5522a.getSelectionStart();
        int selectionEnd = this.f5522a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.f5522a.getSelectionStart();
        boolean z = false;
        boolean z2 = selectionStart == selectionEnd;
        boolean z3 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0) {
            z = true;
        }
        m7059b((z || (!z2 && z3)) ? "Backspace" : String.valueOf(this.f5522a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
