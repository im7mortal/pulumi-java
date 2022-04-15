// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.autoscaling_v2.inputs.HorizontalPodAutoscalerConditionArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricStatusArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 * 
 */
public final class HorizontalPodAutoscalerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerStatusArgs Empty = new HorizontalPodAutoscalerStatusArgs();

    /**
     * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions;

    public Output<List<HorizontalPodAutoscalerConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    @Import(name="currentMetrics")
      private final @Nullable Output<List<MetricStatusArgs>> currentMetrics;

    public Output<List<MetricStatusArgs>> currentMetrics() {
        return this.currentMetrics == null ? Codegen.empty() : this.currentMetrics;
    }

    /**
     * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    @Import(name="currentReplicas")
      private final @Nullable Output<Integer> currentReplicas;

    public Output<Integer> currentReplicas() {
        return this.currentReplicas == null ? Codegen.empty() : this.currentReplicas;
    }

    /**
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    @Import(name="desiredReplicas", required=true)
      private final Output<Integer> desiredReplicas;

    public Output<Integer> desiredReplicas() {
        return this.desiredReplicas;
    }

    /**
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    @Import(name="lastScaleTime")
      private final @Nullable Output<String> lastScaleTime;

    public Output<String> lastScaleTime() {
        return this.lastScaleTime == null ? Codegen.empty() : this.lastScaleTime;
    }

    /**
     * observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> observedGeneration() {
        return this.observedGeneration == null ? Codegen.empty() : this.observedGeneration;
    }

    public HorizontalPodAutoscalerStatusArgs(
        @Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions,
        @Nullable Output<List<MetricStatusArgs>> currentMetrics,
        @Nullable Output<Integer> currentReplicas,
        Output<Integer> desiredReplicas,
        @Nullable Output<String> lastScaleTime,
        @Nullable Output<Integer> observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = Objects.requireNonNull(desiredReplicas, "expected parameter 'desiredReplicas' to be non-null");
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    private HorizontalPodAutoscalerStatusArgs() {
        this.conditions = Codegen.empty();
        this.currentMetrics = Codegen.empty();
        this.currentReplicas = Codegen.empty();
        this.desiredReplicas = Codegen.empty();
        this.lastScaleTime = Codegen.empty();
        this.observedGeneration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions;
        private @Nullable Output<List<MetricStatusArgs>> currentMetrics;
        private @Nullable Output<Integer> currentReplicas;
        private Output<Integer> desiredReplicas;
        private @Nullable Output<String> lastScaleTime;
        private @Nullable Output<Integer> observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder conditions(@Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<HorizontalPodAutoscalerConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(HorizontalPodAutoscalerConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder currentMetrics(@Nullable Output<List<MetricStatusArgs>> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }
        public Builder currentMetrics(@Nullable List<MetricStatusArgs> currentMetrics) {
            this.currentMetrics = Codegen.ofNullable(currentMetrics);
            return this;
        }
        public Builder currentMetrics(MetricStatusArgs... currentMetrics) {
            return currentMetrics(List.of(currentMetrics));
        }
        public Builder currentReplicas(@Nullable Output<Integer> currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }
        public Builder currentReplicas(@Nullable Integer currentReplicas) {
            this.currentReplicas = Codegen.ofNullable(currentReplicas);
            return this;
        }
        public Builder desiredReplicas(Output<Integer> desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }
        public Builder desiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Output.of(Objects.requireNonNull(desiredReplicas));
            return this;
        }
        public Builder lastScaleTime(@Nullable Output<String> lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }
        public Builder lastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = Codegen.ofNullable(lastScaleTime);
            return this;
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Codegen.ofNullable(observedGeneration);
            return this;
        }        public HorizontalPodAutoscalerStatusArgs build() {
            return new HorizontalPodAutoscalerStatusArgs(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}
