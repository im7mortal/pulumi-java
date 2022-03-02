// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventResponse {
    /**
     * The count of the event.
     * 
     */
    private final Integer count;
    /**
     * The date-time of the earliest logged event.
     * 
     */
    private final String firstTimestamp;
    /**
     * The date-time of the latest logged event.
     * 
     */
    private final String lastTimestamp;
    /**
     * The event message.
     * 
     */
    private final String message;
    /**
     * The event name.
     * 
     */
    private final String name;
    /**
     * The event type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"count","firstTimestamp","lastTimestamp","message","name","type"})
    private EventResponse(
        Integer count,
        String firstTimestamp,
        String lastTimestamp,
        String message,
        String name,
        String type) {
        this.count = Objects.requireNonNull(count);
        this.firstTimestamp = Objects.requireNonNull(firstTimestamp);
        this.lastTimestamp = Objects.requireNonNull(lastTimestamp);
        this.message = Objects.requireNonNull(message);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The count of the event.
     * 
    */
    public Integer getCount() {
        return this.count;
    }
    /**
     * The date-time of the earliest logged event.
     * 
    */
    public String getFirstTimestamp() {
        return this.firstTimestamp;
    }
    /**
     * The date-time of the latest logged event.
     * 
    */
    public String getLastTimestamp() {
        return this.lastTimestamp;
    }
    /**
     * The event message.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The event name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The event type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String firstTimestamp;
        private String lastTimestamp;
        private String message;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.firstTimestamp = defaults.firstTimestamp;
    	      this.lastTimestamp = defaults.lastTimestamp;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = Objects.requireNonNull(firstTimestamp);
            return this;
        }

        public Builder setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = Objects.requireNonNull(lastTimestamp);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EventResponse build() {
            return new EventResponse(count, firstTimestamp, lastTimestamp, message, name, type);
        }
    }
}
