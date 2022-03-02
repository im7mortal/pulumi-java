// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationLoggingS3Log;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInfrastructureConfigurationLogging {
    /**
     * Nested list of S3 logs settings.
     * 
     */
    private final List<GetInfrastructureConfigurationLoggingS3Log> s3Logs;

    @OutputCustomType.Constructor({"s3Logs"})
    private GetInfrastructureConfigurationLogging(List<GetInfrastructureConfigurationLoggingS3Log> s3Logs) {
        this.s3Logs = Objects.requireNonNull(s3Logs);
    }

    /**
     * Nested list of S3 logs settings.
     * 
    */
    public List<GetInfrastructureConfigurationLoggingS3Log> getS3Logs() {
        return this.s3Logs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInfrastructureConfigurationLoggingS3Log> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder setS3Logs(List<GetInfrastructureConfigurationLoggingS3Log> s3Logs) {
            this.s3Logs = Objects.requireNonNull(s3Logs);
            return this;
        }
        public GetInfrastructureConfigurationLogging build() {
            return new GetInfrastructureConfigurationLogging(s3Logs);
        }
    }
}
