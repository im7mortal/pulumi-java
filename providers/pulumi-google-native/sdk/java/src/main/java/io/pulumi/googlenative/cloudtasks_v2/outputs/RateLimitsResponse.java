// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RateLimitsResponse {
    /**
     * The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously refilled with new tokens based on max_dispatches_per_second. Cloud Tasks will pick the value of `max_burst_size` based on the value of max_dispatches_per_second. For queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). Since `max_burst_size` is output only, if UpdateQueue is called on a queue created by `queue.yaml/xml`, `max_burst_size` will be reset based on the value of max_dispatches_per_second, regardless of whether max_dispatches_per_second is updated.
     * 
     */
    private final Integer maxBurstSize;
    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * 
     */
    private final Integer maxConcurrentDispatches;
    /**
     * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * The maximum allowed value is 500. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * 
     */
    private final Double maxDispatchesPerSecond;

    @OutputCustomType.Constructor({"maxBurstSize","maxConcurrentDispatches","maxDispatchesPerSecond"})
    private RateLimitsResponse(
        Integer maxBurstSize,
        Integer maxConcurrentDispatches,
        Double maxDispatchesPerSecond) {
        this.maxBurstSize = Objects.requireNonNull(maxBurstSize);
        this.maxConcurrentDispatches = Objects.requireNonNull(maxConcurrentDispatches);
        this.maxDispatchesPerSecond = Objects.requireNonNull(maxDispatchesPerSecond);
    }

    /**
     * The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously refilled with new tokens based on max_dispatches_per_second. Cloud Tasks will pick the value of `max_burst_size` based on the value of max_dispatches_per_second. For queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). Since `max_burst_size` is output only, if UpdateQueue is called on a queue created by `queue.yaml/xml`, `max_burst_size` will be reset based on the value of max_dispatches_per_second, regardless of whether max_dispatches_per_second is updated.
     * 
    */
    public Integer getMaxBurstSize() {
        return this.maxBurstSize;
    }
    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * 
    */
    public Integer getMaxConcurrentDispatches() {
        return this.maxConcurrentDispatches;
    }
    /**
     * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * The maximum allowed value is 500. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * 
    */
    public Double getMaxDispatchesPerSecond() {
        return this.maxDispatchesPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxBurstSize;
        private Integer maxConcurrentDispatches;
        private Double maxDispatchesPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBurstSize = defaults.maxBurstSize;
    	      this.maxConcurrentDispatches = defaults.maxConcurrentDispatches;
    	      this.maxDispatchesPerSecond = defaults.maxDispatchesPerSecond;
        }

        public Builder setMaxBurstSize(Integer maxBurstSize) {
            this.maxBurstSize = Objects.requireNonNull(maxBurstSize);
            return this;
        }

        public Builder setMaxConcurrentDispatches(Integer maxConcurrentDispatches) {
            this.maxConcurrentDispatches = Objects.requireNonNull(maxConcurrentDispatches);
            return this;
        }

        public Builder setMaxDispatchesPerSecond(Double maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = Objects.requireNonNull(maxDispatchesPerSecond);
            return this;
        }
        public RateLimitsResponse build() {
            return new RateLimitsResponse(maxBurstSize, maxConcurrentDispatches, maxDispatchesPerSecond);
        }
    }
}
