// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventDestinationKinesisDestination {
    /**
     * The ARN of the role that has permissions to access the Kinesis Stream
     * 
     */
    private final String roleArn;
    /**
     * The ARN of the Kinesis Stream
     * 
     */
    private final String streamArn;

    @OutputCustomType.Constructor({"roleArn","streamArn"})
    private EventDestinationKinesisDestination(
        String roleArn,
        String streamArn) {
        this.roleArn = Objects.requireNonNull(roleArn);
        this.streamArn = Objects.requireNonNull(streamArn);
    }

    /**
     * The ARN of the role that has permissions to access the Kinesis Stream
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The ARN of the Kinesis Stream
     * 
    */
    public String getStreamArn() {
        return this.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationKinesisDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private String streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationKinesisDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setStreamArn(String streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }
        public EventDestinationKinesisDestination build() {
            return new EventDestinationKinesisDestination(roleArn, streamArn);
        }
    }
}
