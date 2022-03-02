// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallFirewallStatusSyncStateAttachment {
    /**
     * The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    private final @Nullable String endpointId;
    /**
     * The unique identifier for the subnet.
     * 
     */
    private final @Nullable String subnetId;

    @OutputCustomType.Constructor({"endpointId","subnetId"})
    private FirewallFirewallStatusSyncStateAttachment(
        @Nullable String endpointId,
        @Nullable String subnetId) {
        this.endpointId = endpointId;
        this.subnetId = subnetId;
    }

    /**
     * The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
    */
    public Optional<String> getEndpointId() {
        return Optional.ofNullable(this.endpointId);
    }
    /**
     * The unique identifier for the subnet.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateAttachment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointId;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setEndpointId(@Nullable String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public FirewallFirewallStatusSyncStateAttachment build() {
            return new FirewallFirewallStatusSyncStateAttachment(endpointId, subnetId);
        }
    }
}
