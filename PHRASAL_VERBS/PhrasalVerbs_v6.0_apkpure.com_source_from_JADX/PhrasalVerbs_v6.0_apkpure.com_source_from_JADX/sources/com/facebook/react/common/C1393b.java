package com.facebook.react.common;

/* renamed from: com.facebook.react.common.b */
public class C1393b extends RuntimeException {
    public C1393b(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static C1393b m5725a(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n\nTry the following to fix the issue:\n• Ensure that the packager server is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:8081 tcp:8081' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:8081\n\n");
        sb.append(str2);
        return new C1393b(sb.toString(), th);
    }

    /* renamed from: a */
    public static C1393b m5726a(String str, Throwable th) {
        return m5725a(str, "", th);
    }
}
