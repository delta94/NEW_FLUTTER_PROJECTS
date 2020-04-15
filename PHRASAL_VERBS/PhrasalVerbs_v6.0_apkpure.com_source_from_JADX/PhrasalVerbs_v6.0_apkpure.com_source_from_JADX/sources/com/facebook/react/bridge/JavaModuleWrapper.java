package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule.NativeMethod;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class JavaModuleWrapper {
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    private final JSInstance mJSInstance;
    private final ArrayList<NativeMethod> mMethods = new ArrayList<>();
    private final ModuleHolder mModuleHolder;

    @C1137a
    public class MethodDescriptor {
        @C1137a
        Method method;
        @C1137a
        String name;
        @C1137a
        String signature;
        @C1137a
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @C1137a
    private void findMethods() {
        Method[] declaredMethods;
        C1937a.m7339a(0, "findMethods");
        HashSet hashSet = new HashSet();
        Class cls = this.mModuleHolder.getModule().getClass();
        Class superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    methodDescriptor.type = javaMethodWrapper.getType();
                    if (methodDescriptor.type == BaseJavaModule.METHOD_TYPE_SYNC) {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Java Module ");
                    sb.append(getName());
                    sb.append(" method name already registered: ");
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        C1937a.m7338a(0);
    }

    @C1137a
    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        C1941a a = C1940c.m7352a(0, "JavaModuleWrapper.getConstants");
        a.mo6822a("moduleName", (Object) name);
        a.mo6823a();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        C1937a.m7339a(0, "module.getConstants");
        Map constants = module.getConstants();
        C1937a.m7338a(0);
        C1937a.m7339a(0, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            C1937a.m7338a(0);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C1940c.m7351a(0).mo6823a();
        }
    }

    @C1137a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @C1137a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @C1137a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @C1137a
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        ArrayList<NativeMethod> arrayList = this.mMethods;
        if (arrayList != null && i < arrayList.size()) {
            ((NativeMethod) this.mMethods.get(i)).invoke(this.mJSInstance, readableNativeArray);
        }
    }
}
