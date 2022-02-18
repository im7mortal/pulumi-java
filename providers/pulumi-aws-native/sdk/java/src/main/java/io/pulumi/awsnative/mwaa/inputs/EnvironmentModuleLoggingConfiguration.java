// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.inputs;

import io.pulumi.awsnative.mwaa.enums.EnvironmentLoggingLevel;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Logging configuration for a specific airflow component.
 * 
 */
public final class EnvironmentModuleLoggingConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentModuleLoggingConfiguration Empty = new EnvironmentModuleLoggingConfiguration();

    @InputImport(name="cloudWatchLogGroupArn")
    private final @Nullable String cloudWatchLogGroupArn;

    public Optional<String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchLogGroupArn);
    }

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="logLevel")
    private final @Nullable EnvironmentLoggingLevel logLevel;

    public Optional<EnvironmentLoggingLevel> getLogLevel() {
        return this.logLevel == null ? Optional.empty() : Optional.ofNullable(this.logLevel);
    }

    public EnvironmentModuleLoggingConfiguration(
        @Nullable String cloudWatchLogGroupArn,
        @Nullable Boolean enabled,
        @Nullable EnvironmentLoggingLevel logLevel) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.enabled = enabled;
        this.logLevel = logLevel;
    }

    private EnvironmentModuleLoggingConfiguration() {
        this.cloudWatchLogGroupArn = null;
        this.enabled = null;
        this.logLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentModuleLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudWatchLogGroupArn;
        private @Nullable Boolean enabled;
        private @Nullable EnvironmentLoggingLevel logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentModuleLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder setCloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogLevel(@Nullable EnvironmentLoggingLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public EnvironmentModuleLoggingConfiguration build() {
            return new EnvironmentModuleLoggingConfiguration(cloudWatchLogGroupArn, enabled, logLevel);
        }
    }
}