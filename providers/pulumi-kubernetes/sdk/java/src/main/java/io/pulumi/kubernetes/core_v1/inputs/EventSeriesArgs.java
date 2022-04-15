// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 * 
 */
public final class EventSeriesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSeriesArgs Empty = new EventSeriesArgs();

    /**
     * Number of occurrences in this series up to the last heartbeat time
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> count() {
        return this.count == null ? Codegen.empty() : this.count;
    }

    /**
     * Time of the last occurrence observed
     * 
     */
    @Import(name="lastObservedTime")
      private final @Nullable Output<String> lastObservedTime;

    public Output<String> lastObservedTime() {
        return this.lastObservedTime == null ? Codegen.empty() : this.lastObservedTime;
    }

    /**
     * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public EventSeriesArgs(
        @Nullable Output<Integer> count,
        @Nullable Output<String> lastObservedTime,
        @Nullable Output<String> state) {
        this.count = count;
        this.lastObservedTime = lastObservedTime;
        this.state = state;
    }

    private EventSeriesArgs() {
        this.count = Codegen.empty();
        this.lastObservedTime = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;
        private @Nullable Output<String> lastObservedTime;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSeriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
    	      this.state = defaults.state;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable Integer count) {
            this.count = Codegen.ofNullable(count);
            return this;
        }
        public Builder lastObservedTime(@Nullable Output<String> lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }
        public Builder lastObservedTime(@Nullable String lastObservedTime) {
            this.lastObservedTime = Codegen.ofNullable(lastObservedTime);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public EventSeriesArgs build() {
            return new EventSeriesArgs(count, lastObservedTime, state);
        }
    }
}
