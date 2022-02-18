// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.LoggingDefaultLogLevel;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLoggingResult {
    /**
     * The log level to use. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    private final @Nullable LoggingDefaultLogLevel defaultLogLevel;
    /**
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    private final @Nullable String roleArn;

    @OutputCustomType.Constructor({"defaultLogLevel","roleArn"})
    private GetLoggingResult(
        @Nullable LoggingDefaultLogLevel defaultLogLevel,
        @Nullable String roleArn) {
        this.defaultLogLevel = defaultLogLevel;
        this.roleArn = roleArn;
    }

    /**
     * The log level to use. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    public Optional<LoggingDefaultLogLevel> getDefaultLogLevel() {
        return Optional.ofNullable(this.defaultLogLevel);
    }
    /**
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LoggingDefaultLogLevel defaultLogLevel;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoggingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLogLevel = defaults.defaultLogLevel;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setDefaultLogLevel(@Nullable LoggingDefaultLogLevel defaultLogLevel) {
            this.defaultLogLevel = defaultLogLevel;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public GetLoggingResult build() {
            return new GetLoggingResult(defaultLogLevel, roleArn);
        }
    }
}
