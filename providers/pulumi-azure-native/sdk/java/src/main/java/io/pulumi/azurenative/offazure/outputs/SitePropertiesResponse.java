// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.outputs;

import io.pulumi.azurenative.offazure.outputs.SiteAgentPropertiesResponse;
import io.pulumi.azurenative.offazure.outputs.SiteSpnPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SitePropertiesResponse {
    private final @Nullable SiteAgentPropertiesResponse agentDetails;
    private final @Nullable String applianceName;
    private final @Nullable String discoverySolutionId;
    private final String serviceEndpoint;
    private final @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails;

    @OutputCustomType.Constructor({"agentDetails","applianceName","discoverySolutionId","serviceEndpoint","servicePrincipalIdentityDetails"})
    private SitePropertiesResponse(
        @Nullable SiteAgentPropertiesResponse agentDetails,
        @Nullable String applianceName,
        @Nullable String discoverySolutionId,
        String serviceEndpoint,
        @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails) {
        this.agentDetails = agentDetails;
        this.applianceName = applianceName;
        this.discoverySolutionId = discoverySolutionId;
        this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
        this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
    }

    public Optional<SiteAgentPropertiesResponse> getAgentDetails() {
        return Optional.ofNullable(this.agentDetails);
    }
    public Optional<String> getApplianceName() {
        return Optional.ofNullable(this.applianceName);
    }
    public Optional<String> getDiscoverySolutionId() {
        return Optional.ofNullable(this.discoverySolutionId);
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }
    public Optional<SiteSpnPropertiesResponse> getServicePrincipalIdentityDetails() {
        return Optional.ofNullable(this.servicePrincipalIdentityDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SitePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SiteAgentPropertiesResponse agentDetails;
        private @Nullable String applianceName;
        private @Nullable String discoverySolutionId;
        private String serviceEndpoint;
        private @Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(SitePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentDetails = defaults.agentDetails;
    	      this.applianceName = defaults.applianceName;
    	      this.discoverySolutionId = defaults.discoverySolutionId;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.servicePrincipalIdentityDetails = defaults.servicePrincipalIdentityDetails;
        }

        public Builder setAgentDetails(@Nullable SiteAgentPropertiesResponse agentDetails) {
            this.agentDetails = agentDetails;
            return this;
        }

        public Builder setApplianceName(@Nullable String applianceName) {
            this.applianceName = applianceName;
            return this;
        }

        public Builder setDiscoverySolutionId(@Nullable String discoverySolutionId) {
            this.discoverySolutionId = discoverySolutionId;
            return this;
        }

        public Builder setServiceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }

        public Builder setServicePrincipalIdentityDetails(@Nullable SiteSpnPropertiesResponse servicePrincipalIdentityDetails) {
            this.servicePrincipalIdentityDetails = servicePrincipalIdentityDetails;
            return this;
        }

        public SitePropertiesResponse build() {
            return new SitePropertiesResponse(agentDetails, applianceName, discoverySolutionId, serviceEndpoint, servicePrincipalIdentityDetails);
        }
    }
}