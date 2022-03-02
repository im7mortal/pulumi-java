// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExternalVpnGatewayInterface {
    /**
     * The numeric ID for this interface. Allowed values are based on the redundancy type
     * of this external VPN gateway
     * * `0 - SINGLE_IP_INTERNALLY_REDUNDANT`
     * * `0, 1 - TWO_IPS_REDUNDANCY`
     * * `0, 1, 2, 3 - FOUR_IPS_REDUNDANCY`
     * 
     */
    private final @Nullable Integer id;
    /**
     * IP address of the interface in the external VPN gateway.
     * Only IPv4 is supported. This IP address can be either from
     * your on-premise gateway or another Cloud provider's VPN gateway,
     * it cannot be an IP address from Google Compute Engine.
     * 
     */
    private final @Nullable String ipAddress;

    @OutputCustomType.Constructor({"id","ipAddress"})
    private ExternalVpnGatewayInterface(
        @Nullable Integer id,
        @Nullable String ipAddress) {
        this.id = id;
        this.ipAddress = ipAddress;
    }

    /**
     * The numeric ID for this interface. Allowed values are based on the redundancy type
     * of this external VPN gateway
     * * `0 - SINGLE_IP_INTERNALLY_REDUNDANT`
     * * `0, 1 - TWO_IPS_REDUNDANCY`
     * * `0, 1, 2, 3 - FOUR_IPS_REDUNDANCY`
     * 
    */
    public Optional<Integer> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * IP address of the interface in the external VPN gateway.
     * Only IPv4 is supported. This IP address can be either from
     * your on-premise gateway or another Cloud provider's VPN gateway,
     * it cannot be an IP address from Google Compute Engine.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer id;
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setId(@Nullable Integer id) {
            this.id = id;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public ExternalVpnGatewayInterface build() {
            return new ExternalVpnGatewayInterface(id, ipAddress);
        }
    }
}
