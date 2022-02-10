// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIamConfigurationUniformBucketLevelAccessArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIamConfigurationUniformBucketLevelAccessArgs Empty = new BucketIamConfigurationUniformBucketLevelAccessArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="lockedTime")
    private final @Nullable Input<String> lockedTime;

    public Input<String> getLockedTime() {
        return this.lockedTime == null ? Input.empty() : this.lockedTime;
    }

    public BucketIamConfigurationUniformBucketLevelAccessArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> lockedTime) {
        this.enabled = enabled;
        this.lockedTime = lockedTime;
    }

    private BucketIamConfigurationUniformBucketLevelAccessArgs() {
        this.enabled = Input.empty();
        this.lockedTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamConfigurationUniformBucketLevelAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> lockedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamConfigurationUniformBucketLevelAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.lockedTime = defaults.lockedTime;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLockedTime(@Nullable Input<String> lockedTime) {
            this.lockedTime = lockedTime;
            return this;
        }

        public Builder setLockedTime(@Nullable String lockedTime) {
            this.lockedTime = Input.ofNullable(lockedTime);
            return this;
        }

        public BucketIamConfigurationUniformBucketLevelAccessArgs build() {
            return new BucketIamConfigurationUniformBucketLevelAccessArgs(enabled, lockedTime);
        }
    }
}