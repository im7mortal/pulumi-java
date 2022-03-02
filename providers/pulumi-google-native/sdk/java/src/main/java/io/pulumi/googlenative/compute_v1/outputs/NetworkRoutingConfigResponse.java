// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkRoutingConfigResponse {
    /**
     * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
     */
    private final String routingMode;

    @OutputCustomType.Constructor({"routingMode"})
    private NetworkRoutingConfigResponse(String routingMode) {
        this.routingMode = Objects.requireNonNull(routingMode);
    }

    /**
     * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
    */
    public String getRoutingMode() {
        return this.routingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRoutingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String routingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRoutingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingMode = defaults.routingMode;
        }

        public Builder setRoutingMode(String routingMode) {
            this.routingMode = Objects.requireNonNull(routingMode);
            return this;
        }
        public NetworkRoutingConfigResponse build() {
            return new NetworkRoutingConfigResponse(routingMode);
        }
    }
}
