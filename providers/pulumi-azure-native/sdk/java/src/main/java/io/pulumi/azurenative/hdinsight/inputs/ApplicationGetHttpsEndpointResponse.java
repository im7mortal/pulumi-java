// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGetHttpsEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGetHttpsEndpointResponse Empty = new ApplicationGetHttpsEndpointResponse();

    @InputImport(name="accessModes")
    private final @Nullable List<String> accessModes;

    public List<String> getAccessModes() {
        return this.accessModes == null ? List.of() : this.accessModes;
    }

    @InputImport(name="destinationPort")
    private final @Nullable Integer destinationPort;

    public Optional<Integer> getDestinationPort() {
        return this.destinationPort == null ? Optional.empty() : Optional.ofNullable(this.destinationPort);
    }

    @InputImport(name="disableGatewayAuth")
    private final @Nullable Boolean disableGatewayAuth;

    public Optional<Boolean> getDisableGatewayAuth() {
        return this.disableGatewayAuth == null ? Optional.empty() : Optional.ofNullable(this.disableGatewayAuth);
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="privateIPAddress")
    private final @Nullable String privateIPAddress;

    public Optional<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIPAddress);
    }

    @InputImport(name="publicPort", required=true)
    private final Integer publicPort;

    public Integer getPublicPort() {
        return this.publicPort;
    }

    @InputImport(name="subDomainSuffix")
    private final @Nullable String subDomainSuffix;

    public Optional<String> getSubDomainSuffix() {
        return this.subDomainSuffix == null ? Optional.empty() : Optional.ofNullable(this.subDomainSuffix);
    }

    public ApplicationGetHttpsEndpointResponse(
        @Nullable List<String> accessModes,
        @Nullable Integer destinationPort,
        @Nullable Boolean disableGatewayAuth,
        String location,
        @Nullable String privateIPAddress,
        Integer publicPort,
        @Nullable String subDomainSuffix) {
        this.accessModes = accessModes;
        this.destinationPort = destinationPort;
        this.disableGatewayAuth = disableGatewayAuth;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.privateIPAddress = privateIPAddress;
        this.publicPort = Objects.requireNonNull(publicPort, "expected parameter 'publicPort' to be non-null");
        this.subDomainSuffix = subDomainSuffix;
    }

    private ApplicationGetHttpsEndpointResponse() {
        this.accessModes = List.of();
        this.destinationPort = null;
        this.disableGatewayAuth = null;
        this.location = null;
        this.privateIPAddress = null;
        this.publicPort = null;
        this.subDomainSuffix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGetHttpsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> accessModes;
        private @Nullable Integer destinationPort;
        private @Nullable Boolean disableGatewayAuth;
        private String location;
        private @Nullable String privateIPAddress;
        private Integer publicPort;
        private @Nullable String subDomainSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGetHttpsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessModes = defaults.accessModes;
    	      this.destinationPort = defaults.destinationPort;
    	      this.disableGatewayAuth = defaults.disableGatewayAuth;
    	      this.location = defaults.location;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicPort = defaults.publicPort;
    	      this.subDomainSuffix = defaults.subDomainSuffix;
        }

        public Builder setAccessModes(@Nullable List<String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setDisableGatewayAuth(@Nullable Boolean disableGatewayAuth) {
            this.disableGatewayAuth = disableGatewayAuth;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPublicPort(Integer publicPort) {
            this.publicPort = Objects.requireNonNull(publicPort);
            return this;
        }

        public Builder setSubDomainSuffix(@Nullable String subDomainSuffix) {
            this.subDomainSuffix = subDomainSuffix;
            return this;
        }

        public ApplicationGetHttpsEndpointResponse build() {
            return new ApplicationGetHttpsEndpointResponse(accessModes, destinationPort, disableGatewayAuth, location, privateIPAddress, publicPort, subDomainSuffix);
        }
    }
}