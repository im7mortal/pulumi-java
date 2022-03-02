// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.UserIdentityPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityInfoResponse {
    /**
     * The principal ID of resource identity.
     * 
     */
    private final @Nullable String principalId;
    /**
     * The tenant ID of resource.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
     */
    private final @Nullable String type;
    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     * 
     */
    private final @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

    @OutputCustomType.Constructor({"principalId","tenantId","type","userAssignedIdentities"})
    private IdentityInfoResponse(
        @Nullable String principalId,
        @Nullable String tenantId,
        @Nullable String type,
        @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The principal ID of resource identity.
     * 
    */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * The tenant ID of resource.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     * 
    */
    public Map<String,UserIdentityPropertiesResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public IdentityInfoResponse build() {
            return new IdentityInfoResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
