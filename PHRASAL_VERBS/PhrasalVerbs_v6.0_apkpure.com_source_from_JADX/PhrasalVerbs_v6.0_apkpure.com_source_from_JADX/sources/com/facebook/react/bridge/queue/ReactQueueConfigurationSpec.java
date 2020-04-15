package com.facebook.react.bridge.queue;

import android.os.Build.VERSION;
import p032c.p033a.p094k.p095a.C1136a;

public class ReactQueueConfigurationSpec {
    private static final long LEGACY_STACK_SIZE_BYTES = 2000000;
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public static class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public ReactQueueConfigurationSpec build() {
            MessageQueueThreadSpec messageQueueThreadSpec = this.mNativeModulesQueueSpec;
            C1136a.m5053a(messageQueueThreadSpec);
            MessageQueueThreadSpec messageQueueThreadSpec2 = messageQueueThreadSpec;
            MessageQueueThreadSpec messageQueueThreadSpec3 = this.mJSQueueSpec;
            C1136a.m5053a(messageQueueThreadSpec3);
            return new ReactQueueConfigurationSpec(messageQueueThreadSpec2, messageQueueThreadSpec3);
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            C1136a.m5056a(this.mJSQueueSpec == null, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            C1136a.m5056a(this.mNativeModulesQueueSpec == null, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }
    }

    private ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        String str = "native_modules";
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(VERSION.SDK_INT < 21 ? MessageQueueThreadSpec.newBackgroundThreadSpec(str, LEGACY_STACK_SIZE_BYTES) : MessageQueueThreadSpec.newBackgroundThreadSpec(str)).build();
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }
}
