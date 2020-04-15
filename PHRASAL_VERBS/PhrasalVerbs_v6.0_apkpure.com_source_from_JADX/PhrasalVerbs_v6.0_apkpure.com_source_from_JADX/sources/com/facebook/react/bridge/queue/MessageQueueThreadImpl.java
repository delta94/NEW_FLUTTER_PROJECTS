package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;
    /* access modifiers changed from: private */
    public MessageQueueThreadPerfStats mPerfStats;

    /* renamed from: com.facebook.react.bridge.queue.MessageQueueThreadImpl$5 */
    static /* synthetic */ class C13895 {

        /* renamed from: $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType */
        static final /* synthetic */ int[] f4381x16463f8b = new int[ThreadType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType[] r0 = com.facebook.react.bridge.queue.MessageQueueThreadSpec.ThreadType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4381x16463f8b = r0
                int[] r0 = f4381x16463f8b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType r1 = com.facebook.react.bridge.queue.MessageQueueThreadSpec.ThreadType.MAIN_UI     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4381x16463f8b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.react.bridge.queue.MessageQueueThreadSpec$ThreadType r1 = com.facebook.react.bridge.queue.MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.queue.MessageQueueThreadImpl.C13895.<clinit>():void");
        }
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this(str, looper, queueThreadExceptionHandler, null);
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.mIsFinished = false;
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.mPerfStats = messageQueueThreadPerfStats;
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called from the '");
        sb.append(getName());
        sb.append("' thread!");
        this.mAssertionErrorMessage = sb.toString();
    }

    /* access modifiers changed from: private */
    public static void assignToPerfStats(MessageQueueThreadPerfStats messageQueueThreadPerfStats, long j, long j2) {
        messageQueueThreadPerfStats.wallTime = j;
        messageQueueThreadPerfStats.cpuTime = j2;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        int i = C13895.f4381x16463f8b[messageQueueThreadSpec.getThreadType().ordinal()];
        if (i == 1) {
            return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
        }
        if (i == 2) {
            return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown thread type: ");
        sb.append(messageQueueThreadSpec.getThreadType());
        throw new RuntimeException(sb.toString());
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
        if (UiThreadUtil.isOnUiThread()) {
            Process.setThreadPriority(-4);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public void run() {
                    Process.setThreadPriority(-4);
                }
            });
        }
        return messageQueueThreadImpl;
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        C13884 r3 = new Runnable() {
            public void run() {
                Process.setThreadPriority(-4);
                Looper.prepare();
                MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
                MessageQueueThreadImpl.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
                simpleSettableFuture.mo5187a(new Pair(Looper.myLooper(), messageQueueThreadPerfStats));
                Looper.loop();
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append("mqt_");
        sb.append(str);
        Thread thread = new Thread(null, r3, sb.toString(), j);
        thread.start();
        Pair pair = (Pair) simpleSettableFuture.mo5185a();
        return new MessageQueueThreadImpl(str, (Looper) pair.first, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) pair.second);
    }

    @C1137a
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    @C1137a
    public void assertIsOnThread(String str) {
        boolean isOnThread = isOnThread();
        StringBuilder sb = new StringBuilder();
        sb.append(this.mAssertionErrorMessage);
        sb.append(" ");
        sb.append(str);
        SoftAssertions.assertCondition(isOnThread, sb.toString());
    }

    @C1137a
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() {
            public void run() {
                try {
                    simpleSettableFuture.mo5187a(callable.call());
                } catch (Exception e) {
                    simpleSettableFuture.mo5186a(e);
                }
            }
        });
        return simpleSettableFuture;
    }

    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    @C1137a
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.mPerfStats;
    }

    @C1137a
    public boolean isOnThread() {
        return this.mLooper.getThread() == Thread.currentThread();
    }

    @C1137a
    public void quitSynchronous() {
        this.mIsFinished = true;
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got interrupted waiting to join thread ");
                sb.append(this.mName);
                throw new RuntimeException(sb.toString());
            }
        }
    }

    @C1137a
    public void resetPerfStats() {
        assignToPerfStats(this.mPerfStats, -1, -1);
        runOnQueue(new Runnable() {
            public void run() {
                MessageQueueThreadImpl.assignToPerfStats(MessageQueueThreadImpl.this.mPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
            }
        });
    }

    @C1137a
    public void runOnQueue(Runnable runnable) {
        if (this.mIsFinished) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to enqueue runnable on already finished thread: '");
            sb.append(getName());
            sb.append("... dropping Runnable.");
            C0727a.m3284d("ReactNative", sb.toString());
        }
        this.mHandler.post(runnable);
    }
}
