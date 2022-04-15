// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.policy_v1beta1.inputs.IDRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
 * 
 */
public final class SupplementalGroupsStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SupplementalGroupsStrategyOptionsArgs Empty = new SupplementalGroupsStrategyOptionsArgs();

    /**
     * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    @Import(name="ranges")
      private final @Nullable Output<List<IDRangeArgs>> ranges;

    public Output<List<IDRangeArgs>> ranges() {
        return this.ranges == null ? Codegen.empty() : this.ranges;
    }

    /**
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     * 
     */
    @Import(name="rule")
      private final @Nullable Output<String> rule;

    public Output<String> rule() {
        return this.rule == null ? Codegen.empty() : this.rule;
    }

    public SupplementalGroupsStrategyOptionsArgs(
        @Nullable Output<List<IDRangeArgs>> ranges,
        @Nullable Output<String> rule) {
        this.ranges = ranges;
        this.rule = rule;
    }

    private SupplementalGroupsStrategyOptionsArgs() {
        this.ranges = Codegen.empty();
        this.rule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SupplementalGroupsStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<IDRangeArgs>> ranges;
        private @Nullable Output<String> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(SupplementalGroupsStrategyOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder ranges(@Nullable Output<List<IDRangeArgs>> ranges) {
            this.ranges = ranges;
            return this;
        }
        public Builder ranges(@Nullable List<IDRangeArgs> ranges) {
            this.ranges = Codegen.ofNullable(ranges);
            return this;
        }
        public Builder ranges(IDRangeArgs... ranges) {
            return ranges(List.of(ranges));
        }
        public Builder rule(@Nullable Output<String> rule) {
            this.rule = rule;
            return this;
        }
        public Builder rule(@Nullable String rule) {
            this.rule = Codegen.ofNullable(rule);
            return this;
        }        public SupplementalGroupsStrategyOptionsArgs build() {
            return new SupplementalGroupsStrategyOptionsArgs(ranges, rule);
        }
    }
}
