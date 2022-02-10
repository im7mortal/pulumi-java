// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SlowRequestsBasedTriggerResponse {
    private final @Nullable Integer count;
    private final @Nullable String path;
    private final @Nullable String timeInterval;
    private final @Nullable String timeTaken;

    @OutputCustomType.Constructor({"count","path","timeInterval","timeTaken"})
    private SlowRequestsBasedTriggerResponse(
        @Nullable Integer count,
        @Nullable String path,
        @Nullable String timeInterval,
        @Nullable String timeTaken) {
        this.count = count;
        this.path = path;
        this.timeInterval = timeInterval;
        this.timeTaken = timeTaken;
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> getTimeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }
    public Optional<String> getTimeTaken() {
        return Optional.ofNullable(this.timeTaken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlowRequestsBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable String timeInterval;
        private @Nullable String timeTaken;

        public Builder() {
    	      // Empty
        }

        public Builder(SlowRequestsBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.timeInterval = defaults.timeInterval;
    	      this.timeTaken = defaults.timeTaken;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setTimeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public Builder setTimeTaken(@Nullable String timeTaken) {
            this.timeTaken = timeTaken;
            return this;
        }

        public SlowRequestsBasedTriggerResponse build() {
            return new SlowRequestsBasedTriggerResponse(count, path, timeInterval, timeTaken);
        }
    }
}