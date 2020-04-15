package p032c.p033a.p098m.p106f;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.C1436a;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.views.checkbox.ReactCheckBoxManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.toolbar.ReactToolbarManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Provider;
import p032c.p033a.p098m.C1217j;

/* renamed from: c.a.m.f.B */
public class C1181B extends C1217j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1182a f3911a;

    /* renamed from: a */
    public C1436a mo4543a() {
        return C1217j.m5212a((C1217j) this);
    }

    /* renamed from: a */
    public List<ViewManager> mo4465a(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ARTRenderableViewManager.createARTGroupViewManager());
        arrayList.add(ARTRenderableViewManager.createARTShapeViewManager());
        arrayList.add(ARTRenderableViewManager.createARTTextViewManager());
        arrayList.add(new ReactCheckBoxManager());
        arrayList.add(new ReactDialogPickerManager());
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactDropdownPickerManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSliderManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new ReactToolbarManager());
        arrayList.add(new ReactWebViewManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new ARTSurfaceViewManager());
        arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
        arrayList.add(new ReactImageManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactViewPagerManager());
        arrayList.add(new ReactVirtualTextViewManager());
        return arrayList;
    }

    /* renamed from: d */
    public List<ModuleSpec> mo4544d(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ModuleSpec[]{ModuleSpec.nativeModuleSpec(AccessibilityInfoModule.class, (Provider<? extends NativeModule>) new C1193l<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(AppStateModule.class, (Provider<? extends NativeModule>) new C1201t<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(BlobModule.class, (Provider<? extends NativeModule>) new C1202u<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(FileReaderModule.class, (Provider<? extends NativeModule>) new C1203v<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(AsyncStorageModule.class, (Provider<? extends NativeModule>) new C1204w<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(CameraRollManager.class, (Provider<? extends NativeModule>) new C1205x<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(ClipboardModule.class, (Provider<? extends NativeModule>) new C1206y<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(DatePickerDialogModule.class, (Provider<? extends NativeModule>) new C1207z<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(DialogModule.class, (Provider<? extends NativeModule>) new C1180A<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(FrescoModule.class, (Provider<? extends NativeModule>) new C1183b<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(I18nManagerModule.class, (Provider<? extends NativeModule>) new C1184c<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(ImageEditingManager.class, (Provider<? extends NativeModule>) new C1185d<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(ImageLoaderModule.class, (Provider<? extends NativeModule>) new C1186e<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(ImageStoreManager.class, (Provider<? extends NativeModule>) new C1187f<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(IntentModule.class, (Provider<? extends NativeModule>) new C1188g<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(LocationModule.class, (Provider<? extends NativeModule>) new C1189h<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(NativeAnimatedModule.class, (Provider<? extends NativeModule>) new C1190i<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(NetworkingModule.class, (Provider<? extends NativeModule>) new C1191j<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(NetInfoModule.class, (Provider<? extends NativeModule>) new C1192k<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(PermissionsModule.class, (Provider<? extends NativeModule>) new C1194m<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(ShareModule.class, (Provider<? extends NativeModule>) new C1195n<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(StatusBarModule.class, (Provider<? extends NativeModule>) new C1196o<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(TimePickerDialogModule.class, (Provider<? extends NativeModule>) new C1197p<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(ToastModule.class, (Provider<? extends NativeModule>) new C1198q<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(VibrationModule.class, (Provider<? extends NativeModule>) new C1199r<Object>(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec(WebSocketModule.class, (Provider<? extends NativeModule>) new C1200s<Object>(this, reactApplicationContext))});
    }
}
