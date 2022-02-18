// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketNotificationFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The topic to which notifications are sent and the events for which notifications are generated.
 * 
 */
public final class BucketTopicConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketTopicConfigurationArgs Empty = new BucketTopicConfigurationArgs();

    /**
     * The Amazon S3 bucket event about which to send notifications.
     * 
     */
    @InputImport(name="event", required=true)
    private final Input<String> event;

    public Input<String> getEvent() {
        return this.event;
    }

    /**
     * The filtering rules that determine for which objects to send notifications.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<BucketNotificationFilterArgs> filter;

    public Input<BucketNotificationFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message when it detects events of the specified type.
     * 
     */
    @InputImport(name="topic", required=true)
    private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public BucketTopicConfigurationArgs(
        Input<String> event,
        @Nullable Input<BucketNotificationFilterArgs> filter,
        Input<String> topic) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private BucketTopicConfigurationArgs() {
        this.event = Input.empty();
        this.filter = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketTopicConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> event;
        private @Nullable Input<BucketNotificationFilterArgs> filter;
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketTopicConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.topic = defaults.topic;
        }

        public Builder setEvent(Input<String> event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setEvent(String event) {
            this.event = Input.of(Objects.requireNonNull(event));
            return this;
        }

        public Builder setFilter(@Nullable Input<BucketNotificationFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable BucketNotificationFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setTopic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }

        public BucketTopicConfigurationArgs build() {
            return new BucketTopicConfigurationArgs(event, filter, topic);
        }
    }
}
