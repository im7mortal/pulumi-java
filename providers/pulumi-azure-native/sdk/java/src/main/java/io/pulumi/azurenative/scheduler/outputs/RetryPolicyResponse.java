// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RetryPolicyResponse {
    /**
     * Gets or sets the number of times a retry should be attempted.
     * 
     */
    private final @Nullable Integer retryCount;
    /**
     * Gets or sets the retry interval between retries, specify duration in ISO 8601 format.
     * 
     */
    private final @Nullable String retryInterval;
    /**
     * Gets or sets the retry strategy to be used.
     * 
     */
    private final @Nullable String retryType;

    @OutputCustomType.Constructor({"retryCount","retryInterval","retryType"})
    private RetryPolicyResponse(
        @Nullable Integer retryCount,
        @Nullable String retryInterval,
        @Nullable String retryType) {
        this.retryCount = retryCount;
        this.retryInterval = retryInterval;
        this.retryType = retryType;
    }

    /**
     * Gets or sets the number of times a retry should be attempted.
     * 
    */
    public Optional<Integer> getRetryCount() {
        return Optional.ofNullable(this.retryCount);
    }
    /**
     * Gets or sets the retry interval between retries, specify duration in ISO 8601 format.
     * 
    */
    public Optional<String> getRetryInterval() {
        return Optional.ofNullable(this.retryInterval);
    }
    /**
     * Gets or sets the retry strategy to be used.
     * 
    */
    public Optional<String> getRetryType() {
        return Optional.ofNullable(this.retryType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer retryCount;
        private @Nullable String retryInterval;
        private @Nullable String retryType;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retryCount = defaults.retryCount;
    	      this.retryInterval = defaults.retryInterval;
    	      this.retryType = defaults.retryType;
        }

        public Builder setRetryCount(@Nullable Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }

        public Builder setRetryInterval(@Nullable String retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }

        public Builder setRetryType(@Nullable String retryType) {
            this.retryType = retryType;
            return this;
        }
        public RetryPolicyResponse build() {
            return new RetryPolicyResponse(retryCount, retryInterval, retryType);
        }
    }
}
