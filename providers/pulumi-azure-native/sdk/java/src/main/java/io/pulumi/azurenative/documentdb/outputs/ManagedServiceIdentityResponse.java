// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponseUserAssignedIdentities;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedServiceIdentityResponse {
    /**
     * The principal id of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant id of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String tenantId;
    /**
     * The type of identity used for the resource. The type 'SystemAssigned,UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the service.
     * 
     */
    private final @Nullable String type;
    /**
     * The list of user identities associated with resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    private final @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    @OutputCustomType.Constructor({"principalId","tenantId","type","userAssignedIdentities"})
    private ManagedServiceIdentityResponse(
        String principalId,
        String tenantId,
        @Nullable String type,
        @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The principal id of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant id of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of identity used for the resource. The type 'SystemAssigned,UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the service.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The list of user identities associated with resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
    */
    public Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public ManagedServiceIdentityResponse build() {
            return new ManagedServiceIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
