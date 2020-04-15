package p032c.p033a.p098m;

/* renamed from: c.a.m.B */
class C1140B implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1146a f3788a;

    /* renamed from: b */
    final /* synthetic */ C1145G f3789b;

    C1140B(C1145G g, C1146a aVar) {
        this.f3789b = g;
        this.f3788a = aVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x000c A[LOOP:0: B:2:0x000c->B:18:0x000c, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r3 = this;
            com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.REACT_CONTEXT_THREAD_END
            com.facebook.react.bridge.ReactMarker.logMarker(r0)
            c.a.m.G r0 = r3.f3789b
            java.lang.Boolean r0 = r0.f3816s
            monitor-enter(r0)
        L_0x000c:
            c.a.m.G r1 = r3.f3789b     // Catch:{ all -> 0x006f }
            java.lang.Boolean r1 = r1.f3816s     // Catch:{ all -> 0x006f }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0022
            c.a.m.G r1 = r3.f3789b     // Catch:{ InterruptedException -> 0x000c }
            java.lang.Boolean r1 = r1.f3816s     // Catch:{ InterruptedException -> 0x000c }
            r1.wait()     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            c.a.m.G r0 = r3.f3789b
            r1 = 1
            r0.f3815r = r1
            r0 = -4
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.VM_INIT     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.ReactMarker.logMarker(r0)     // Catch:{ Exception -> 0x0064 }
            c.a.m.G r0 = r3.f3789b     // Catch:{ Exception -> 0x0064 }
            c.a.m.G$a r1 = r3.f3788a     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.JavaScriptExecutorFactory r1 = r1.mo4436b()     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.JavaScriptExecutor r1 = r1.create()     // Catch:{ Exception -> 0x0064 }
            c.a.m.G$a r2 = r3.f3788a     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.JSBundleLoader r2 = r2.mo4435a()     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.ReactApplicationContext r0 = r0.m5061a(r1, r2)     // Catch:{ Exception -> 0x0064 }
            c.a.m.G r1 = r3.f3789b     // Catch:{ Exception -> 0x0064 }
            r2 = 0
            r1.f3801d = r2     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.ReactMarkerConstants r1 = com.facebook.react.bridge.ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.ReactMarker.logMarker(r1)     // Catch:{ Exception -> 0x0064 }
            c.a.m.z r1 = new c.a.m.z     // Catch:{ Exception -> 0x0064 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0064 }
            c.a.m.A r2 = new c.a.m.A     // Catch:{ Exception -> 0x0064 }
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x0064 }
            r0.runOnNativeModulesQueueThread(r2)     // Catch:{ Exception -> 0x0064 }
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r1)     // Catch:{ Exception -> 0x0064 }
            goto L_0x006e
        L_0x0064:
            r0 = move-exception
            c.a.m.G r1 = r3.f3789b
            com.facebook.react.devsupport.a.b r1 = r1.f3806i
            r1.handleException(r0)
        L_0x006e:
            return
        L_0x006f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            throw r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p098m.C1140B.run():void");
    }
}
