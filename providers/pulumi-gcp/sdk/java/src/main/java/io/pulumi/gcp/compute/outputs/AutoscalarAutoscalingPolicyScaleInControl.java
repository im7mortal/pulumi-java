// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscalarAutoscalingPolicyScaleInControl {
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    private final @Nullable Integer timeWindowSec;

    @OutputCustomType.Constructor({"maxScaledInReplicas","timeWindowSec"})
    private AutoscalarAutoscalingPolicyScaleInControl(
        @Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas,
        @Nullable Integer timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
    */
    public Optional<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas> getMaxScaledInReplicas() {
        return Optional.ofNullable(this.maxScaledInReplicas);
    }
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
    */
    public Optional<Integer> getTimeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleInControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
        private @Nullable Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScaleInControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledInReplicas(@Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas) {
            this.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }

        public Builder setTimeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }
        public AutoscalarAutoscalingPolicyScaleInControl build() {
            return new AutoscalarAutoscalingPolicyScaleInControl(maxScaledInReplicas, timeWindowSec);
        }
    }
}
