// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SparkStandaloneAutoscalingConfigResponse {
    /**
     * Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    private final String gracefulDecommissionTimeout;
    /**
     * Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    private final Double scaleDownFactor;
    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    private final Double scaleDownMinWorkerFraction;
    /**
     * Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    private final Double scaleUpFactor;
    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    private final Double scaleUpMinWorkerFraction;

    @OutputCustomType.Constructor({"gracefulDecommissionTimeout","scaleDownFactor","scaleDownMinWorkerFraction","scaleUpFactor","scaleUpMinWorkerFraction"})
    private SparkStandaloneAutoscalingConfigResponse(
        String gracefulDecommissionTimeout,
        Double scaleDownFactor,
        Double scaleDownMinWorkerFraction,
        Double scaleUpFactor,
        Double scaleUpMinWorkerFraction) {
        this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
        this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
        this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction);
        this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
        this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction);
    }

    /**
     * Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
    */
    public String getGracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }
    /**
     * Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
    */
    public Double getScaleDownFactor() {
        return this.scaleDownFactor;
    }
    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
    */
    public Double getScaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction;
    }
    /**
     * Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
    */
    public Double getScaleUpFactor() {
        return this.scaleUpFactor;
    }
    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
    */
    public Double getScaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkStandaloneAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gracefulDecommissionTimeout;
        private Double scaleDownFactor;
        private Double scaleDownMinWorkerFraction;
        private Double scaleUpFactor;
        private Double scaleUpMinWorkerFraction;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkStandaloneAutoscalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.scaleDownFactor = defaults.scaleDownFactor;
    	      this.scaleDownMinWorkerFraction = defaults.scaleDownMinWorkerFraction;
    	      this.scaleUpFactor = defaults.scaleUpFactor;
    	      this.scaleUpMinWorkerFraction = defaults.scaleUpMinWorkerFraction;
        }

        public Builder setGracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
            return this;
        }

        public Builder setScaleDownFactor(Double scaleDownFactor) {
            this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
            return this;
        }

        public Builder setScaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction);
            return this;
        }

        public Builder setScaleUpFactor(Double scaleUpFactor) {
            this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
            return this;
        }

        public Builder setScaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction);
            return this;
        }
        public SparkStandaloneAutoscalingConfigResponse build() {
            return new SparkStandaloneAutoscalingConfigResponse(gracefulDecommissionTimeout, scaleDownFactor, scaleDownMinWorkerFraction, scaleUpFactor, scaleUpMinWorkerFraction);
        }
    }
}
