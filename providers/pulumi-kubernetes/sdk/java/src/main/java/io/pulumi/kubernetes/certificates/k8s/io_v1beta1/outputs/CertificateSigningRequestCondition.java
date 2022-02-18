// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateSigningRequestCondition {
    /**
     * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
     * 
     */
    private final @Nullable String lastTransitionTime;
    /**
     * timestamp for the last update to this condition
     * 
     */
    private final @Nullable String lastUpdateTime;
    /**
     * human readable message with details about the request state
     * 
     */
    private final @Nullable String message;
    /**
     * brief reason for the request state
     * 
     */
    private final @Nullable String reason;
    /**
     * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
     * 
     */
    private final @Nullable String status;
    /**
     * request approval state, currently Approved or Denied.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"lastTransitionTime","lastUpdateTime","message","reason","status","type"})
    private CertificateSigningRequestCondition(
        @Nullable String lastTransitionTime,
        @Nullable String lastUpdateTime,
        @Nullable String message,
        @Nullable String reason,
        @Nullable String status,
        String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.lastUpdateTime = lastUpdateTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition's status is changed, the server defaults this to the current time.
     * 
     */
    public Optional<String> getLastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * timestamp for the last update to this condition
     * 
     */
    public Optional<String> getLastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }
    /**
     * human readable message with details about the request state
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * brief reason for the request state
     * 
     */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown". Defaults to "True". If unset, should be treated as "True".
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * request approval state, currently Approved or Denied.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String lastUpdateTime;
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder setLastUpdateTime(@Nullable String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public CertificateSigningRequestCondition build() {
            return new CertificateSigningRequestCondition(lastTransitionTime, lastUpdateTime, message, reason, status, type);
        }
    }
}
