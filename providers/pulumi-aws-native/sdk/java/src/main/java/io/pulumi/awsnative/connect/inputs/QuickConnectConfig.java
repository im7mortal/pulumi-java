// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.awsnative.connect.enums.QuickConnectType;
import io.pulumi.awsnative.connect.inputs.QuickConnectPhoneNumberQuickConnectConfig;
import io.pulumi.awsnative.connect.inputs.QuickConnectQueueQuickConnectConfig;
import io.pulumi.awsnative.connect.inputs.QuickConnectUserQuickConnectConfig;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration settings for the quick connect.
 * 
 */
public final class QuickConnectConfig extends io.pulumi.resources.InvokeArgs {

    public static final QuickConnectConfig Empty = new QuickConnectConfig();

    @InputImport(name="phoneConfig")
    private final @Nullable QuickConnectPhoneNumberQuickConnectConfig phoneConfig;

    public Optional<QuickConnectPhoneNumberQuickConnectConfig> getPhoneConfig() {
        return this.phoneConfig == null ? Optional.empty() : Optional.ofNullable(this.phoneConfig);
    }

    @InputImport(name="queueConfig")
    private final @Nullable QuickConnectQueueQuickConnectConfig queueConfig;

    public Optional<QuickConnectQueueQuickConnectConfig> getQueueConfig() {
        return this.queueConfig == null ? Optional.empty() : Optional.ofNullable(this.queueConfig);
    }

    @InputImport(name="quickConnectType", required=true)
    private final QuickConnectType quickConnectType;

    public QuickConnectType getQuickConnectType() {
        return this.quickConnectType;
    }

    @InputImport(name="userConfig")
    private final @Nullable QuickConnectUserQuickConnectConfig userConfig;

    public Optional<QuickConnectUserQuickConnectConfig> getUserConfig() {
        return this.userConfig == null ? Optional.empty() : Optional.ofNullable(this.userConfig);
    }

    public QuickConnectConfig(
        @Nullable QuickConnectPhoneNumberQuickConnectConfig phoneConfig,
        @Nullable QuickConnectQueueQuickConnectConfig queueConfig,
        QuickConnectType quickConnectType,
        @Nullable QuickConnectUserQuickConnectConfig userConfig) {
        this.phoneConfig = phoneConfig;
        this.queueConfig = queueConfig;
        this.quickConnectType = Objects.requireNonNull(quickConnectType, "expected parameter 'quickConnectType' to be non-null");
        this.userConfig = userConfig;
    }

    private QuickConnectConfig() {
        this.phoneConfig = null;
        this.queueConfig = null;
        this.quickConnectType = null;
        this.userConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QuickConnectPhoneNumberQuickConnectConfig phoneConfig;
        private @Nullable QuickConnectQueueQuickConnectConfig queueConfig;
        private QuickConnectType quickConnectType;
        private @Nullable QuickConnectUserQuickConnectConfig userConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneConfig = defaults.phoneConfig;
    	      this.queueConfig = defaults.queueConfig;
    	      this.quickConnectType = defaults.quickConnectType;
    	      this.userConfig = defaults.userConfig;
        }

        public Builder setPhoneConfig(@Nullable QuickConnectPhoneNumberQuickConnectConfig phoneConfig) {
            this.phoneConfig = phoneConfig;
            return this;
        }

        public Builder setQueueConfig(@Nullable QuickConnectQueueQuickConnectConfig queueConfig) {
            this.queueConfig = queueConfig;
            return this;
        }

        public Builder setQuickConnectType(QuickConnectType quickConnectType) {
            this.quickConnectType = Objects.requireNonNull(quickConnectType);
            return this;
        }

        public Builder setUserConfig(@Nullable QuickConnectUserQuickConnectConfig userConfig) {
            this.userConfig = userConfig;
            return this;
        }

        public QuickConnectConfig build() {
            return new QuickConnectConfig(phoneConfig, queueConfig, quickConnectType, userConfig);
        }
    }
}
