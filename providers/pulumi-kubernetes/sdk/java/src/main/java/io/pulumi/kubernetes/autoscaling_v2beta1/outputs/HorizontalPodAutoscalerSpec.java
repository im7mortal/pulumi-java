// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.autoscaling_v2beta1.outputs.CrossVersionObjectReference;
import io.pulumi.kubernetes.autoscaling_v2beta1.outputs.MetricSpec;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerSpec {
    /**
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
     * 
     */
    private final Integer maxReplicas;
    /**
     * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
     * 
     */
    private final @Nullable List<MetricSpec> metrics;
    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    private final @Nullable Integer minReplicas;
    /**
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
     * 
     */
    private final CrossVersionObjectReference scaleTargetRef;

    @CustomType.Constructor
    private HorizontalPodAutoscalerSpec(
        @CustomType.Parameter("maxReplicas") Integer maxReplicas,
        @CustomType.Parameter("metrics") @Nullable List<MetricSpec> metrics,
        @CustomType.Parameter("minReplicas") @Nullable Integer minReplicas,
        @CustomType.Parameter("scaleTargetRef") CrossVersionObjectReference scaleTargetRef) {
        this.maxReplicas = maxReplicas;
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = scaleTargetRef;
    }

    /**
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
     * 
    */
    public Integer maxReplicas() {
        return this.maxReplicas;
    }
    /**
     * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
     * 
    */
    public List<MetricSpec> metrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
    */
    public Optional<Integer> minReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    /**
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
     * 
    */
    public CrossVersionObjectReference scaleTargetRef() {
        return this.scaleTargetRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxReplicas;
        private @Nullable List<MetricSpec> metrics;
        private @Nullable Integer minReplicas;
        private CrossVersionObjectReference scaleTargetRef;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
        }

        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        public Builder metrics(@Nullable List<MetricSpec> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(MetricSpec... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder minReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Builder scaleTargetRef(CrossVersionObjectReference scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }        public HorizontalPodAutoscalerSpec build() {
            return new HorizontalPodAutoscalerSpec(maxReplicas, metrics, minReplicas, scaleTargetRef);
        }
    }
}
