// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PubsubResponse {
    /**
     * The name of the Pub/Sub subscription created and managed by Eventarc as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    private final String subscription;
    /**
     * Optional. The name of the Pub/Sub topic created and managed by Eventarc as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You can set an existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished`. The topic you provide here is not deleted by Eventarc at trigger deletion.
     * 
     */
    private final String topic;

    @OutputCustomType.Constructor({"subscription","topic"})
    private PubsubResponse(
        String subscription,
        String topic) {
        this.subscription = Objects.requireNonNull(subscription);
        this.topic = Objects.requireNonNull(topic);
    }

    /**
     * The name of the Pub/Sub subscription created and managed by Eventarc as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
    */
    public String getSubscription() {
        return this.subscription;
    }
    /**
     * Optional. The name of the Pub/Sub topic created and managed by Eventarc as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You can set an existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished`. The topic you provide here is not deleted by Eventarc at trigger deletion.
     * 
    */
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subscription;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder setSubscription(String subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public PubsubResponse build() {
            return new PubsubResponse(subscription, topic);
        }
    }
}
