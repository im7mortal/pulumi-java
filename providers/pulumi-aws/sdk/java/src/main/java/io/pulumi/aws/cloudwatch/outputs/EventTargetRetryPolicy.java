// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTargetRetryPolicy {
    /**
     * The age in seconds to continue to make retry attempts.
     * 
     */
    private final @Nullable Integer maximumEventAgeInSeconds;
    /**
     * maximum number of retry attempts to make before the request fails
     * 
     */
    private final @Nullable Integer maximumRetryAttempts;

    @OutputCustomType.Constructor({"maximumEventAgeInSeconds","maximumRetryAttempts"})
    private EventTargetRetryPolicy(
        @Nullable Integer maximumEventAgeInSeconds,
        @Nullable Integer maximumRetryAttempts) {
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * The age in seconds to continue to make retry attempts.
     * 
    */
    public Optional<Integer> getMaximumEventAgeInSeconds() {
        return Optional.ofNullable(this.maximumEventAgeInSeconds);
    }
    /**
     * maximum number of retry attempts to make before the request fails
     * 
    */
    public Optional<Integer> getMaximumRetryAttempts() {
        return Optional.ofNullable(this.maximumRetryAttempts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetRetryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maximumEventAgeInSeconds;
        private @Nullable Integer maximumRetryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumEventAgeInSeconds = defaults.maximumEventAgeInSeconds;
    	      this.maximumRetryAttempts = defaults.maximumRetryAttempts;
        }

        public Builder setMaximumEventAgeInSeconds(@Nullable Integer maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }

        public Builder setMaximumRetryAttempts(@Nullable Integer maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }
        public EventTargetRetryPolicy build() {
            return new EventTargetRetryPolicy(maximumEventAgeInSeconds, maximumRetryAttempts);
        }
    }
}
