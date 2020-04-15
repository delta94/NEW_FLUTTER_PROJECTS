package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule.NativeMethod;
import com.facebook.systrace.C1940c;
import com.facebook.systrace.C1940c.C1941a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p032c.p033a.p052e.p055b.C0783c;
import p032c.p033a.p052e.p056c.C0784a;
import p032c.p033a.p094k.p095a.C1136a;

public class JavaMethodWrapper implements NativeMethod {
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() {
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    };
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() {
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    };
    /* access modifiers changed from: private */
    public static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() {
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() {
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() {
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() {
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() {
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() {
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() {
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }

        public int getJSArgumentsNeeded() {
            return 2;
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() {
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    };
    private static final boolean DEBUG = C0783c.m3478a().mo3577a(C0784a.f2700d);
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType = BaseJavaModule.METHOD_TYPE_ASYNC;

    private static abstract class ArgumentExtractor<T> {
        private ArgumentExtractor() {
        }

        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        String str;
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        this.mMethod.setAccessible(true);
        this.mParameterTypes = this.mMethod.getParameterTypes();
        Class<Promise>[] clsArr = this.mParameterTypes;
        this.mParamLength = clsArr.length;
        if (z) {
            str = BaseJavaModule.METHOD_TYPE_SYNC;
        } else {
            int i = this.mParamLength;
            if (i > 0 && clsArr[i - 1] == Promise.class) {
                str = BaseJavaModule.METHOD_TYPE_PROMISE;
            } else {
                return;
            }
        }
        this.mType = str;
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        for (int i = 0; i < clsArr.length; i += argumentExtractorArr[i].getJSArgumentsNeeded()) {
            Class<Dynamic> cls = clsArr[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_PROMISE;
                boolean z = true;
                if (i != clsArr.length - 1) {
                    z = false;
                }
                C1136a.m5056a(z, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
            } else if (cls == Dynamic.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Got unknown argument class: ");
                sb.append(cls.getSimpleName());
                throw new RuntimeException(sb.toString());
            }
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class<Promise> cls = clsArr[i];
            if (cls == Promise.class) {
                boolean z2 = true;
                if (i != clsArr.length - 1) {
                    z2 = false;
                }
                C1136a.m5056a(z2, "Promise must be used as last parameter only");
            }
            sb.append(paramTypeToChar(cls));
        }
        return sb.toString();
    }

    private int calculateJSArgumentsNeeded() {
        ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
        C1136a.m5053a(argumentExtractorArr);
        int i = 0;
        for (ArgumentExtractor jSArgumentsNeeded : argumentExtractorArr) {
            i += jSArgumentsNeeded.getJSArgumentsNeeded();
        }
        return i;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : 0;
    }

    private String getAffectedRange(int i, int i2) {
        String str = "";
        if (i2 > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            sb.append("-");
            sb.append((i + i2) - 1);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i);
        return sb2.toString();
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got unknown param class: ");
        sb.append(cls.getSimpleName());
        throw new RuntimeException(sb.toString());
    }

    private void processArguments() {
        if (!this.mArgumentsProcessed) {
            C1941a a = C1940c.m7352a(0, "processArguments");
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModuleWrapper.getName());
            sb.append(".");
            sb.append(this.mMethod.getName());
            a.mo6822a("method", (Object) sb.toString());
            a.mo6823a();
            try {
                this.mArgumentsProcessed = true;
                this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
                this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
                this.mArguments = new Object[this.mParameterTypes.length];
                this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
            } finally {
                C1940c.m7351a(0).mo6823a();
            }
        }
    }

    private static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got unknown return class: ");
        sb.append(cls.getSimpleName());
        throw new RuntimeException(sb.toString());
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        String str = this.mSignature;
        C1136a.m5053a(str);
        return str;
    }

    public String getType() {
        return this.mType;
    }

    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        int i;
        String str = "Could not invoke ";
        StringBuilder sb = new StringBuilder();
        sb.append(this.mModuleWrapper.getName());
        sb.append(".");
        sb.append(this.mMethod.getName());
        String sb2 = sb.toString();
        C1941a a = C1940c.m7352a(0, "callJavaModuleMethod");
        a.mo6822a("method", (Object) sb2);
        a.mo6823a();
        int i2 = 0;
        if (DEBUG) {
            C0783c.m3478a().mo3576a(C0784a.f2700d, "JS->Java: %s.%s()", this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                throw new Error("processArguments failed");
            } else if (this.mJSArgumentsNeeded == readableArray.size()) {
                i = 0;
                while (i2 < this.mArgumentExtractors.length) {
                    this.mArguments[i2] = this.mArgumentExtractors[i2].extractArgument(jSInstance, readableArray, i);
                    i += this.mArgumentExtractors[i2].getJSArgumentsNeeded();
                    i2++;
                }
                this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                C1940c.m7351a(0).mo6823a();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" got ");
                sb3.append(readableArray.size());
                sb3.append(" arguments, expected ");
                sb3.append(this.mJSArgumentsNeeded);
                throw new NativeArgumentsParseException(sb3.toString());
            }
        } catch (UnexpectedNativeTypeException e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e.getMessage());
            sb4.append(" (constructing arguments for ");
            sb4.append(sb2);
            sb4.append(" at argument index ");
            sb4.append(getAffectedRange(i, this.mArgumentExtractors[i2].getJSArgumentsNeeded()));
            sb4.append(")");
            throw new NativeArgumentsParseException(sb4.toString(), e);
        } catch (IllegalArgumentException e2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(sb2);
            throw new RuntimeException(sb5.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(sb2);
            throw new RuntimeException(sb6.toString(), e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(sb2);
            throw new RuntimeException(sb7.toString(), e4);
        } catch (Throwable th) {
            C1940c.m7351a(0).mo6823a();
            throw th;
        }
    }
}
