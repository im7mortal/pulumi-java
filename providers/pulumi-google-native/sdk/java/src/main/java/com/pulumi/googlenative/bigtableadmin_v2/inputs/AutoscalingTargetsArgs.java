// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Autoscaling targets for a Cluster. These determine the recommended nodes.
 * 
 */
public final class AutoscalingTargetsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingTargetsArgs Empty = new AutoscalingTargetsArgs();

    /**
     * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80, otherwise it will return INVALID_ARGUMENT error.
     * 
     */
    @Import(name="cpuUtilizationPercent")
    private @Nullable Output<Integer> cpuUtilizationPercent;

    /**
     * @return The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80, otherwise it will return INVALID_ARGUMENT error.
     * 
     */
    public Optional<Output<Integer>> cpuUtilizationPercent() {
        return Optional.ofNullable(this.cpuUtilizationPercent);
    }

    private AutoscalingTargetsArgs() {}

    private AutoscalingTargetsArgs(AutoscalingTargetsArgs $) {
        this.cpuUtilizationPercent = $.cpuUtilizationPercent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingTargetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingTargetsArgs $;

        public Builder() {
            $ = new AutoscalingTargetsArgs();
        }

        public Builder(AutoscalingTargetsArgs defaults) {
            $ = new AutoscalingTargetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuUtilizationPercent The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80, otherwise it will return INVALID_ARGUMENT error.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilizationPercent(@Nullable Output<Integer> cpuUtilizationPercent) {
            $.cpuUtilizationPercent = cpuUtilizationPercent;
            return this;
        }

        /**
         * @param cpuUtilizationPercent The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80, otherwise it will return INVALID_ARGUMENT error.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilizationPercent(Integer cpuUtilizationPercent) {
            return cpuUtilizationPercent(Output.of(cpuUtilizationPercent));
        }

        public AutoscalingTargetsArgs build() {
            return $;
        }
    }

}
