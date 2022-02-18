// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketNotificationFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
 * 
 */
public final class BucketQueueConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketQueueConfiguration Empty = new BucketQueueConfiguration();

    /**
     * The Amazon S3 bucket event about which you want to publish messages to Amazon SQS.
     * 
     */
    @InputImport(name="event", required=true)
    private final String event;

    public String getEvent() {
        return this.event;
    }

    /**
     * The filtering rules that determine which objects trigger notifications.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable BucketNotificationFilter filter;

    public Optional<BucketNotificationFilter> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type.
     * 
     */
    @InputImport(name="queue", required=true)
    private final String queue;

    public String getQueue() {
        return this.queue;
    }

    public BucketQueueConfiguration(
        String event,
        @Nullable BucketNotificationFilter filter,
        String queue) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.queue = Objects.requireNonNull(queue, "expected parameter 'queue' to be non-null");
    }

    private BucketQueueConfiguration() {
        this.event = null;
        this.filter = null;
        this.queue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketQueueConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;
        private @Nullable BucketNotificationFilter filter;
        private String queue;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketQueueConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.queue = defaults.queue;
        }

        public Builder setEvent(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setFilter(@Nullable BucketNotificationFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder setQueue(String queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }

        public BucketQueueConfiguration build() {
            return new BucketQueueConfiguration(event, filter, queue);
        }
    }
}