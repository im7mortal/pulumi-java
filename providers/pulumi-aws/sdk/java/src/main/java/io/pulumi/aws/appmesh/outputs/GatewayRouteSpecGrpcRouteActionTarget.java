// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecGrpcRouteActionTargetVirtualService;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GatewayRouteSpecGrpcRouteActionTarget {
    /**
     * The virtual service gateway route target.
     * 
     */
    private final GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService;

    @OutputCustomType.Constructor({"virtualService"})
    private GatewayRouteSpecGrpcRouteActionTarget(GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService);
    }

    /**
     * The virtual service gateway route target.
     * 
    */
    public GatewayRouteSpecGrpcRouteActionTargetVirtualService getVirtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteActionTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteActionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder setVirtualService(GatewayRouteSpecGrpcRouteActionTargetVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public GatewayRouteSpecGrpcRouteActionTarget build() {
            return new GatewayRouteSpecGrpcRouteActionTarget(virtualService);
        }
    }
}
