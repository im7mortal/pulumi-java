// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.DirectConnectionResponse;
import io.pulumi.azurenative.peering.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PeeringPropertiesDirectResponse {
    /**
     * The set of connections that constitute a direct peering.
     * 
     */
    private final @Nullable List<DirectConnectionResponse> connections;
    /**
     * The type of direct peering.
     * 
     */
    private final @Nullable String directPeeringType;
    /**
     * The reference of the peer ASN.
     * 
     */
    private final @Nullable SubResourceResponse peerAsn;
    /**
     * The flag that indicates whether or not the peering is used for peering service.
     * 
     */
    private final Boolean useForPeeringService;

    @OutputCustomType.Constructor({"connections","directPeeringType","peerAsn","useForPeeringService"})
    private PeeringPropertiesDirectResponse(
        @Nullable List<DirectConnectionResponse> connections,
        @Nullable String directPeeringType,
        @Nullable SubResourceResponse peerAsn,
        Boolean useForPeeringService) {
        this.connections = connections;
        this.directPeeringType = directPeeringType;
        this.peerAsn = peerAsn;
        this.useForPeeringService = Objects.requireNonNull(useForPeeringService);
    }

    /**
     * The set of connections that constitute a direct peering.
     * 
    */
    public List<DirectConnectionResponse> getConnections() {
        return this.connections == null ? List.of() : this.connections;
    }
    /**
     * The type of direct peering.
     * 
    */
    public Optional<String> getDirectPeeringType() {
        return Optional.ofNullable(this.directPeeringType);
    }
    /**
     * The reference of the peer ASN.
     * 
    */
    public Optional<SubResourceResponse> getPeerAsn() {
        return Optional.ofNullable(this.peerAsn);
    }
    /**
     * The flag that indicates whether or not the peering is used for peering service.
     * 
    */
    public Boolean getUseForPeeringService() {
        return this.useForPeeringService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringPropertiesDirectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DirectConnectionResponse> connections;
        private @Nullable String directPeeringType;
        private @Nullable SubResourceResponse peerAsn;
        private Boolean useForPeeringService;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringPropertiesDirectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
    	      this.directPeeringType = defaults.directPeeringType;
    	      this.peerAsn = defaults.peerAsn;
    	      this.useForPeeringService = defaults.useForPeeringService;
        }

        public Builder setConnections(@Nullable List<DirectConnectionResponse> connections) {
            this.connections = connections;
            return this;
        }

        public Builder setDirectPeeringType(@Nullable String directPeeringType) {
            this.directPeeringType = directPeeringType;
            return this;
        }

        public Builder setPeerAsn(@Nullable SubResourceResponse peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }

        public Builder setUseForPeeringService(Boolean useForPeeringService) {
            this.useForPeeringService = Objects.requireNonNull(useForPeeringService);
            return this;
        }
        public PeeringPropertiesDirectResponse build() {
            return new PeeringPropertiesDirectResponse(connections, directPeeringType, peerAsn, useForPeeringService);
        }
    }
}
