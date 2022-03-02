// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PubsubDestinationResponse {
    /**
     * The name of the Pub/Sub topic to publish to. Example: `projects/PROJECT_ID/topics/TOPIC_ID`.
     * 
     */
    private final String topic;

    @OutputCustomType.Constructor({"topic"})
    private PubsubDestinationResponse(String topic) {
        this.topic = Objects.requireNonNull(topic);
    }

    /**
     * The name of the Pub/Sub topic to publish to. Example: `projects/PROJECT_ID/topics/TOPIC_ID`.
     * 
    */
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public PubsubDestinationResponse build() {
            return new PubsubDestinationResponse(topic);
        }
    }
}
