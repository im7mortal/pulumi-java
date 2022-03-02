// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketIamConfigurationUniformBucketLevelAccessResponse {
    /**
     * If set, access is controlled only by bucket-level or above IAM policies.
     * 
     */
    private final Boolean enabled;
    /**
     * The deadline for changing iamConfiguration.uniformBucketLevelAccess.enabled from true to false in RFC 3339  format. iamConfiguration.uniformBucketLevelAccess.enabled may be changed from true to false until the locked time, after which the field is immutable.
     * 
     */
    private final String lockedTime;

    @OutputCustomType.Constructor({"enabled","lockedTime"})
    private BucketIamConfigurationUniformBucketLevelAccessResponse(
        Boolean enabled,
        String lockedTime) {
        this.enabled = Objects.requireNonNull(enabled);
        this.lockedTime = Objects.requireNonNull(lockedTime);
    }

    /**
     * If set, access is controlled only by bucket-level or above IAM policies.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deadline for changing iamConfiguration.uniformBucketLevelAccess.enabled from true to false in RFC 3339  format. iamConfiguration.uniformBucketLevelAccess.enabled may be changed from true to false until the locked time, after which the field is immutable.
     * 
    */
    public String getLockedTime() {
        return this.lockedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamConfigurationUniformBucketLevelAccessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String lockedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamConfigurationUniformBucketLevelAccessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.lockedTime = defaults.lockedTime;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setLockedTime(String lockedTime) {
            this.lockedTime = Objects.requireNonNull(lockedTime);
            return this;
        }
        public BucketIamConfigurationUniformBucketLevelAccessResponse build() {
            return new BucketIamConfigurationUniformBucketLevelAccessResponse(enabled, lockedTime);
        }
    }
}
