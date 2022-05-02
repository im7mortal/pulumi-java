// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class PubsubTargetResponse {
    /**
     * @return Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    private final Map<String,String> attributes;
    /**
     * @return The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    private final String data;
    /**
     * @return The name of the Cloud Pub/Sub topic to which messages will be published when a job is delivered. The topic name must be in the same format as required by Pub/Sub&#39;s [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the Cloud Scheduler job.
     * 
     */
    private final String topicName;

    @CustomType.Constructor
    private PubsubTargetResponse(
        @CustomType.Parameter("attributes") Map<String,String> attributes,
        @CustomType.Parameter("data") String data,
        @CustomType.Parameter("topicName") String topicName) {
        this.attributes = attributes;
        this.data = data;
        this.topicName = topicName;
    }

    /**
     * @return Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    public Map<String,String> attributes() {
        return this.attributes;
    }
    /**
     * @return The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return The name of the Cloud Pub/Sub topic to which messages will be published when a job is delivered. The topic name must be in the same format as required by Pub/Sub&#39;s [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the Cloud Scheduler job.
     * 
     */
    public String topicName() {
        return this.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> attributes;
        private String data;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.data = defaults.data;
    	      this.topicName = defaults.topicName;
        }

        public Builder attributes(Map<String,String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder topicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }        public PubsubTargetResponse build() {
            return new PubsubTargetResponse(attributes, data, topicName);
        }
    }
}
