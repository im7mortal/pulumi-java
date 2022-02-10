// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CircuitResponse extends io.pulumi.resources.InvokeArgs {

    public static final CircuitResponse Empty = new CircuitResponse();

    @InputImport(name="expressRouteID", required=true)
    private final String expressRouteID;

    public String getExpressRouteID() {
        return this.expressRouteID;
    }

    @InputImport(name="expressRoutePrivatePeeringID", required=true)
    private final String expressRoutePrivatePeeringID;

    public String getExpressRoutePrivatePeeringID() {
        return this.expressRoutePrivatePeeringID;
    }

    @InputImport(name="primarySubnet", required=true)
    private final String primarySubnet;

    public String getPrimarySubnet() {
        return this.primarySubnet;
    }

    @InputImport(name="secondarySubnet", required=true)
    private final String secondarySubnet;

    public String getSecondarySubnet() {
        return this.secondarySubnet;
    }

    public CircuitResponse(
        String expressRouteID,
        String expressRoutePrivatePeeringID,
        String primarySubnet,
        String secondarySubnet) {
        this.expressRouteID = Objects.requireNonNull(expressRouteID, "expected parameter 'expressRouteID' to be non-null");
        this.expressRoutePrivatePeeringID = Objects.requireNonNull(expressRoutePrivatePeeringID, "expected parameter 'expressRoutePrivatePeeringID' to be non-null");
        this.primarySubnet = Objects.requireNonNull(primarySubnet, "expected parameter 'primarySubnet' to be non-null");
        this.secondarySubnet = Objects.requireNonNull(secondarySubnet, "expected parameter 'secondarySubnet' to be non-null");
    }

    private CircuitResponse() {
        this.expressRouteID = null;
        this.expressRoutePrivatePeeringID = null;
        this.primarySubnet = null;
        this.secondarySubnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expressRouteID;
        private String expressRoutePrivatePeeringID;
        private String primarySubnet;
        private String secondarySubnet;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expressRouteID = defaults.expressRouteID;
    	      this.expressRoutePrivatePeeringID = defaults.expressRoutePrivatePeeringID;
    	      this.primarySubnet = defaults.primarySubnet;
    	      this.secondarySubnet = defaults.secondarySubnet;
        }

        public Builder setExpressRouteID(String expressRouteID) {
            this.expressRouteID = Objects.requireNonNull(expressRouteID);
            return this;
        }

        public Builder setExpressRoutePrivatePeeringID(String expressRoutePrivatePeeringID) {
            this.expressRoutePrivatePeeringID = Objects.requireNonNull(expressRoutePrivatePeeringID);
            return this;
        }

        public Builder setPrimarySubnet(String primarySubnet) {
            this.primarySubnet = Objects.requireNonNull(primarySubnet);
            return this;
        }

        public Builder setSecondarySubnet(String secondarySubnet) {
            this.secondarySubnet = Objects.requireNonNull(secondarySubnet);
            return this;
        }

        public CircuitResponse build() {
            return new CircuitResponse(expressRouteID, expressRoutePrivatePeeringID, primarySubnet, secondarySubnet);
        }
    }
}