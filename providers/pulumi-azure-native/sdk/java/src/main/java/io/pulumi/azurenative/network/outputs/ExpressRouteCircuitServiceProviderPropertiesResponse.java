// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExpressRouteCircuitServiceProviderPropertiesResponse {
    /**
     * The BandwidthInMbps.
     * 
     */
    private final @Nullable Integer bandwidthInMbps;
    /**
     * The peering location.
     * 
     */
    private final @Nullable String peeringLocation;
    /**
     * The serviceProviderName.
     * 
     */
    private final @Nullable String serviceProviderName;

    @OutputCustomType.Constructor({"bandwidthInMbps","peeringLocation","serviceProviderName"})
    private ExpressRouteCircuitServiceProviderPropertiesResponse(
        @Nullable Integer bandwidthInMbps,
        @Nullable String peeringLocation,
        @Nullable String serviceProviderName) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.peeringLocation = peeringLocation;
        this.serviceProviderName = serviceProviderName;
    }

    /**
     * The BandwidthInMbps.
     * 
    */
    public Optional<Integer> getBandwidthInMbps() {
        return Optional.ofNullable(this.bandwidthInMbps);
    }
    /**
     * The peering location.
     * 
    */
    public Optional<String> getPeeringLocation() {
        return Optional.ofNullable(this.peeringLocation);
    }
    /**
     * The serviceProviderName.
     * 
    */
    public Optional<String> getServiceProviderName() {
        return Optional.ofNullable(this.serviceProviderName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitServiceProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandwidthInMbps;
        private @Nullable String peeringLocation;
        private @Nullable String serviceProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitServiceProviderPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.peeringLocation = defaults.peeringLocation;
    	      this.serviceProviderName = defaults.serviceProviderName;
        }

        public Builder setBandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }

        public Builder setPeeringLocation(@Nullable String peeringLocation) {
            this.peeringLocation = peeringLocation;
            return this;
        }

        public Builder setServiceProviderName(@Nullable String serviceProviderName) {
            this.serviceProviderName = serviceProviderName;
            return this;
        }
        public ExpressRouteCircuitServiceProviderPropertiesResponse build() {
            return new ExpressRouteCircuitServiceProviderPropertiesResponse(bandwidthInMbps, peeringLocation, serviceProviderName);
        }
    }
}
