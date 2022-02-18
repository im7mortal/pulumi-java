// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusVersionTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusVersionTargetArgs Empty = new RegionInstanceGroupManagerStatusVersionTargetArgs();

    @InputImport(name="isReached")
    private final @Nullable Input<Boolean> isReached;

    public Input<Boolean> getIsReached() {
        return this.isReached == null ? Input.empty() : this.isReached;
    }

    public RegionInstanceGroupManagerStatusVersionTargetArgs(@Nullable Input<Boolean> isReached) {
        this.isReached = isReached;
    }

    private RegionInstanceGroupManagerStatusVersionTargetArgs() {
        this.isReached = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusVersionTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isReached;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusVersionTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isReached = defaults.isReached;
        }

        public Builder setIsReached(@Nullable Input<Boolean> isReached) {
            this.isReached = isReached;
            return this;
        }

        public Builder setIsReached(@Nullable Boolean isReached) {
            this.isReached = Input.ofNullable(isReached);
            return this;
        }

        public RegionInstanceGroupManagerStatusVersionTargetArgs build() {
            return new RegionInstanceGroupManagerStatusVersionTargetArgs(isReached);
        }
    }
}