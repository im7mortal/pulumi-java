// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerGatewayAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayAssociationArgs Empty = new CustomerGatewayAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    @InputImport(name="customerGatewayArn", required=true)
    private final Input<String> customerGatewayArn;

    public Input<String> getCustomerGatewayArn() {
        return this.customerGatewayArn;
    }

    /**
     * The ID of the device
     * 
     */
    @InputImport(name="deviceId", required=true)
    private final Input<String> deviceId;

    public Input<String> getDeviceId() {
        return this.deviceId;
    }

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
    private final Input<String> globalNetworkId;

    public Input<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link
     * 
     */
    @InputImport(name="linkId")
    private final @Nullable Input<String> linkId;

    public Input<String> getLinkId() {
        return this.linkId == null ? Input.empty() : this.linkId;
    }

    public CustomerGatewayAssociationArgs(
        Input<String> customerGatewayArn,
        Input<String> deviceId,
        Input<String> globalNetworkId,
        @Nullable Input<String> linkId) {
        this.customerGatewayArn = Objects.requireNonNull(customerGatewayArn, "expected parameter 'customerGatewayArn' to be non-null");
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.linkId = linkId;
    }

    private CustomerGatewayAssociationArgs() {
        this.customerGatewayArn = Input.empty();
        this.deviceId = Input.empty();
        this.globalNetworkId = Input.empty();
        this.linkId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerGatewayAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> customerGatewayArn;
        private Input<String> deviceId;
        private Input<String> globalNetworkId;
        private @Nullable Input<String> linkId;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerGatewayAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerGatewayArn = defaults.customerGatewayArn;
    	      this.deviceId = defaults.deviceId;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.linkId = defaults.linkId;
        }

        public Builder setCustomerGatewayArn(Input<String> customerGatewayArn) {
            this.customerGatewayArn = Objects.requireNonNull(customerGatewayArn);
            return this;
        }

        public Builder setCustomerGatewayArn(String customerGatewayArn) {
            this.customerGatewayArn = Input.of(Objects.requireNonNull(customerGatewayArn));
            return this;
        }

        public Builder setDeviceId(Input<String> deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }

        public Builder setDeviceId(String deviceId) {
            this.deviceId = Input.of(Objects.requireNonNull(deviceId));
            return this;
        }

        public Builder setGlobalNetworkId(Input<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }

        public Builder setGlobalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Input.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }

        public Builder setLinkId(@Nullable Input<String> linkId) {
            this.linkId = linkId;
            return this;
        }

        public Builder setLinkId(@Nullable String linkId) {
            this.linkId = Input.ofNullable(linkId);
            return this;
        }

        public CustomerGatewayAssociationArgs build() {
            return new CustomerGatewayAssociationArgs(customerGatewayArn, deviceId, globalNetworkId, linkId);
        }
    }
}
