// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class Hl7StoreNotificationConfig {
    /**
     * The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    private final String pubsubTopic;

    @OutputCustomType.Constructor({"pubsubTopic"})
    private Hl7StoreNotificationConfig(String pubsubTopic) {
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
    }

    /**
     * The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
    */
    public String getPubsubTopic() {
        return this.pubsubTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreNotificationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreNotificationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder setPubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }
        public Hl7StoreNotificationConfig build() {
            return new Hl7StoreNotificationConfig(pubsubTopic);
        }
    }
}
