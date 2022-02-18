// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.HorizontalPodAutoscalerCondition;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricStatus;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HorizontalPodAutoscalerStatus {
    private final @Nullable List<HorizontalPodAutoscalerCondition> conditions;
    private final @Nullable List<MetricStatus> currentMetrics;
    private final @Nullable Integer currentReplicas;
    private final Integer desiredReplicas;
    private final @Nullable String lastScaleTime;
    private final @Nullable Integer observedGeneration;

    @OutputCustomType.Constructor({"conditions","currentMetrics","currentReplicas","desiredReplicas","lastScaleTime","observedGeneration"})
    private HorizontalPodAutoscalerStatus(
        @Nullable List<HorizontalPodAutoscalerCondition> conditions,
        @Nullable List<MetricStatus> currentMetrics,
        @Nullable Integer currentReplicas,
        Integer desiredReplicas,
        @Nullable String lastScaleTime,
        @Nullable Integer observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    public List<HorizontalPodAutoscalerCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public List<MetricStatus> getCurrentMetrics() {
        return this.currentMetrics == null ? List.of() : this.currentMetrics;
    }
    public Optional<Integer> getCurrentReplicas() {
        return Optional.ofNullable(this.currentReplicas);
    }
    public Integer getDesiredReplicas() {
        return this.desiredReplicas;
    }
    public Optional<String> getLastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HorizontalPodAutoscalerCondition> conditions;
        private @Nullable List<MetricStatus> currentMetrics;
        private @Nullable Integer currentReplicas;
        private Integer desiredReplicas;
        private @Nullable String lastScaleTime;
        private @Nullable Integer observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder setConditions(@Nullable List<HorizontalPodAutoscalerCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setCurrentMetrics(@Nullable List<MetricStatus> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }

        public Builder setCurrentReplicas(@Nullable Integer currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }

        public Builder setDesiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }

        public Builder setLastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public HorizontalPodAutoscalerStatus build() {
            return new HorizontalPodAutoscalerStatus(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}