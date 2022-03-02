// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnalyticsApplicationCloudwatchLoggingOptions {
    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    private final @Nullable String id;
    /**
     * The ARN of the CloudWatch Log Stream.
     * 
     */
    private final String logStreamArn;
    /**
     * The ARN of the IAM Role used to send application messages.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"id","logStreamArn","roleArn"})
    private AnalyticsApplicationCloudwatchLoggingOptions(
        @Nullable String id,
        String logStreamArn,
        String roleArn) {
        this.id = id;
        this.logStreamArn = Objects.requireNonNull(logStreamArn);
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The ARN of the CloudWatch Log Stream.
     * 
    */
    public String getLogStreamArn() {
        return this.logStreamArn;
    }
    /**
     * The ARN of the IAM Role used to send application messages.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationCloudwatchLoggingOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String logStreamArn;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationCloudwatchLoggingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.logStreamArn = defaults.logStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLogStreamArn(String logStreamArn) {
            this.logStreamArn = Objects.requireNonNull(logStreamArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AnalyticsApplicationCloudwatchLoggingOptions build() {
            return new AnalyticsApplicationCloudwatchLoggingOptions(id, logStreamArn, roleArn);
        }
    }
}
