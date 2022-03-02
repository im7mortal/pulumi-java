// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AKSServiceResponseResponseAutoScaler {
    /**
     * Option to enable/disable auto scaling.
     * 
     */
    private final @Nullable Boolean autoscaleEnabled;
    /**
     * The maximum number of replicas in the cluster.
     * 
     */
    private final @Nullable Integer maxReplicas;
    /**
     * The minimum number of replicas to scale down to.
     * 
     */
    private final @Nullable Integer minReplicas;
    /**
     * The amount of seconds to wait between auto scale updates.
     * 
     */
    private final @Nullable Integer refreshPeriodInSeconds;
    /**
     * The target utilization percentage to use for determining whether to scale the cluster.
     * 
     */
    private final @Nullable Integer targetUtilization;

    @OutputCustomType.Constructor({"autoscaleEnabled","maxReplicas","minReplicas","refreshPeriodInSeconds","targetUtilization"})
    private AKSServiceResponseResponseAutoScaler(
        @Nullable Boolean autoscaleEnabled,
        @Nullable Integer maxReplicas,
        @Nullable Integer minReplicas,
        @Nullable Integer refreshPeriodInSeconds,
        @Nullable Integer targetUtilization) {
        this.autoscaleEnabled = autoscaleEnabled;
        this.maxReplicas = maxReplicas;
        this.minReplicas = minReplicas;
        this.refreshPeriodInSeconds = refreshPeriodInSeconds;
        this.targetUtilization = targetUtilization;
    }

    /**
     * Option to enable/disable auto scaling.
     * 
    */
    public Optional<Boolean> getAutoscaleEnabled() {
        return Optional.ofNullable(this.autoscaleEnabled);
    }
    /**
     * The maximum number of replicas in the cluster.
     * 
    */
    public Optional<Integer> getMaxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }
    /**
     * The minimum number of replicas to scale down to.
     * 
    */
    public Optional<Integer> getMinReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    /**
     * The amount of seconds to wait between auto scale updates.
     * 
    */
    public Optional<Integer> getRefreshPeriodInSeconds() {
        return Optional.ofNullable(this.refreshPeriodInSeconds);
    }
    /**
     * The target utilization percentage to use for determining whether to scale the cluster.
     * 
    */
    public Optional<Integer> getTargetUtilization() {
        return Optional.ofNullable(this.targetUtilization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponseAutoScaler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoscaleEnabled;
        private @Nullable Integer maxReplicas;
        private @Nullable Integer minReplicas;
        private @Nullable Integer refreshPeriodInSeconds;
        private @Nullable Integer targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponseAutoScaler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleEnabled = defaults.autoscaleEnabled;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.refreshPeriodInSeconds = defaults.refreshPeriodInSeconds;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder setAutoscaleEnabled(@Nullable Boolean autoscaleEnabled) {
            this.autoscaleEnabled = autoscaleEnabled;
            return this;
        }

        public Builder setMaxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setRefreshPeriodInSeconds(@Nullable Integer refreshPeriodInSeconds) {
            this.refreshPeriodInSeconds = refreshPeriodInSeconds;
            return this;
        }

        public Builder setTargetUtilization(@Nullable Integer targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }
        public AKSServiceResponseResponseAutoScaler build() {
            return new AKSServiceResponseResponseAutoScaler(autoscaleEnabled, maxReplicas, minReplicas, refreshPeriodInSeconds, targetUtilization);
        }
    }
}
