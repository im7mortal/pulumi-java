// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketRetentionPolicyResponse {
    /**
     * Server-determined value that indicates the time from which policy was enforced and effective. This value is in RFC 3339 format.
     * 
     */
    private final String effectiveTime;
    /**
     * Once locked, an object retention policy cannot be modified.
     * 
     */
    private final Boolean isLocked;
    /**
     * The duration in seconds that objects need to be retained. Retention duration must be greater than zero and less than 100 years. Note that enforcement of retention periods less than a day is not guaranteed. Such periods should only be used for testing purposes.
     * 
     */
    private final String retentionPeriod;

    @OutputCustomType.Constructor({"effectiveTime","isLocked","retentionPeriod"})
    private BucketRetentionPolicyResponse(
        String effectiveTime,
        Boolean isLocked,
        String retentionPeriod) {
        this.effectiveTime = Objects.requireNonNull(effectiveTime);
        this.isLocked = Objects.requireNonNull(isLocked);
        this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
    }

    /**
     * Server-determined value that indicates the time from which policy was enforced and effective. This value is in RFC 3339 format.
     * 
    */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }
    /**
     * Once locked, an object retention policy cannot be modified.
     * 
    */
    public Boolean getIsLocked() {
        return this.isLocked;
    }
    /**
     * The duration in seconds that objects need to be retained. Retention duration must be greater than zero and less than 100 years. Note that enforcement of retention periods less than a day is not guaranteed. Such periods should only be used for testing purposes.
     * 
    */
    public String getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effectiveTime;
        private Boolean isLocked;
        private String retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveTime = defaults.effectiveTime;
    	      this.isLocked = defaults.isLocked;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder setEffectiveTime(String effectiveTime) {
            this.effectiveTime = Objects.requireNonNull(effectiveTime);
            return this;
        }

        public Builder setIsLocked(Boolean isLocked) {
            this.isLocked = Objects.requireNonNull(isLocked);
            return this;
        }

        public Builder setRetentionPeriod(String retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }
        public BucketRetentionPolicyResponse build() {
            return new BucketRetentionPolicyResponse(effectiveTime, isLocked, retentionPeriod);
        }
    }
}
