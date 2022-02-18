// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCarrierGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCarrierGatewayArgs Empty = new GetCarrierGatewayArgs();

    /**
     * The ID of the carrier gateway.
     * 
     */
    @InputImport(name="carrierGatewayId", required=true)
    private final String carrierGatewayId;

    public String getCarrierGatewayId() {
        return this.carrierGatewayId;
    }

    public GetCarrierGatewayArgs(String carrierGatewayId) {
        this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId, "expected parameter 'carrierGatewayId' to be non-null");
    }

    private GetCarrierGatewayArgs() {
        this.carrierGatewayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCarrierGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCarrierGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierGatewayId = defaults.carrierGatewayId;
        }

        public Builder setCarrierGatewayId(String carrierGatewayId) {
            this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId);
            return this;
        }

        public GetCarrierGatewayArgs build() {
            return new GetCarrierGatewayArgs(carrierGatewayId);
        }
    }
}
