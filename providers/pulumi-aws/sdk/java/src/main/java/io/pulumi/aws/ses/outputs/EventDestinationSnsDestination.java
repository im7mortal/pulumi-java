// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventDestinationSnsDestination {
    /**
     * The ARN of the SNS topic
     * 
     */
    private final String topicArn;

    @OutputCustomType.Constructor({"topicArn"})
    private EventDestinationSnsDestination(String topicArn) {
        this.topicArn = Objects.requireNonNull(topicArn);
    }

    /**
     * The ARN of the SNS topic
     * 
    */
    public String getTopicArn() {
        return this.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDestinationSnsDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDestinationSnsDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setTopicArn(String topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }
        public EventDestinationSnsDestination build() {
            return new EventDestinationSnsDestination(topicArn);
        }
    }
}
