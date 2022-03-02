// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class BackendServiceFailoverPolicyResponse {
    /**
     * This can be set to true only if the protocol is TCP. The default is false.
     * 
     */
    private final Boolean disableConnectionDrainOnFailover;
    /**
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * 
     */
    private final Boolean dropTrafficIfUnhealthy;
    /**
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    private final Double failoverRatio;

    @OutputCustomType.Constructor({"disableConnectionDrainOnFailover","dropTrafficIfUnhealthy","failoverRatio"})
    private BackendServiceFailoverPolicyResponse(
        Boolean disableConnectionDrainOnFailover,
        Boolean dropTrafficIfUnhealthy,
        Double failoverRatio) {
        this.disableConnectionDrainOnFailover = Objects.requireNonNull(disableConnectionDrainOnFailover);
        this.dropTrafficIfUnhealthy = Objects.requireNonNull(dropTrafficIfUnhealthy);
        this.failoverRatio = Objects.requireNonNull(failoverRatio);
    }

    /**
     * This can be set to true only if the protocol is TCP. The default is false.
     * 
    */
    public Boolean getDisableConnectionDrainOnFailover() {
        return this.disableConnectionDrainOnFailover;
    }
    /**
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * 
    */
    public Boolean getDropTrafficIfUnhealthy() {
        return this.dropTrafficIfUnhealthy;
    }
    /**
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
    */
    public Double getFailoverRatio() {
        return this.failoverRatio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceFailoverPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableConnectionDrainOnFailover;
        private Boolean dropTrafficIfUnhealthy;
        private Double failoverRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceFailoverPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableConnectionDrainOnFailover = defaults.disableConnectionDrainOnFailover;
    	      this.dropTrafficIfUnhealthy = defaults.dropTrafficIfUnhealthy;
    	      this.failoverRatio = defaults.failoverRatio;
        }

        public Builder setDisableConnectionDrainOnFailover(Boolean disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = Objects.requireNonNull(disableConnectionDrainOnFailover);
            return this;
        }

        public Builder setDropTrafficIfUnhealthy(Boolean dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = Objects.requireNonNull(dropTrafficIfUnhealthy);
            return this;
        }

        public Builder setFailoverRatio(Double failoverRatio) {
            this.failoverRatio = Objects.requireNonNull(failoverRatio);
            return this;
        }
        public BackendServiceFailoverPolicyResponse build() {
            return new BackendServiceFailoverPolicyResponse(disableConnectionDrainOnFailover, dropTrafficIfUnhealthy, failoverRatio);
        }
    }
}
