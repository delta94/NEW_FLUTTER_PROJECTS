package p000a.p005b.p021d.p028e;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: a.b.d.e.j */
public class C0204j implements Callback {

    /* renamed from: a */
    final Callback f551a;

    public C0204j(Callback callback) {
        if (callback != null) {
            this.f551a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f551a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f551a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f551a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f551a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f551a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f551a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f551a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f551a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f551a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f551a.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f551a.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f551a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f551a.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f551a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f551a.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f551a.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f551a.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f551a.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f551a.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f551a.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f551a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f551a.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f551a.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f551a.onWindowStartingActionMode(callback, i);
    }
}
