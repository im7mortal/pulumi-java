// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LimitRangeItemArgs;
import java.util.List;
import java.util.Objects;


public final class LimitRangeSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final LimitRangeSpecArgs Empty = new LimitRangeSpecArgs();

    @InputImport(name="limits", required=true)
    private final Input<List<LimitRangeItemArgs>> limits;

    public Input<List<LimitRangeItemArgs>> getLimits() {
        return this.limits;
    }

    public LimitRangeSpecArgs(Input<List<LimitRangeItemArgs>> limits) {
        this.limits = Objects.requireNonNull(limits, "expected parameter 'limits' to be non-null");
    }

    private LimitRangeSpecArgs() {
        this.limits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitRangeSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<LimitRangeItemArgs>> limits;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitRangeSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
        }

        public Builder setLimits(Input<List<LimitRangeItemArgs>> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }

        public Builder setLimits(List<LimitRangeItemArgs> limits) {
            this.limits = Input.of(Objects.requireNonNull(limits));
            return this;
        }

        public LimitRangeSpecArgs build() {
            return new LimitRangeSpecArgs(limits);
        }
    }
}