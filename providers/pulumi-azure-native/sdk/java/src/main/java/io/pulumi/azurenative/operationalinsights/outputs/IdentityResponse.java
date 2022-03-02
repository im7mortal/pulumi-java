// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.UserIdentityPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityResponse {
    /**
     * The principal ID of resource identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of resource.
     * 
     */
    private final String tenantId;
    /**
     * Type of managed service identity.
     * 
     */
    private final String type;
    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    private final @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

    @OutputCustomType.Constructor({"principalId","tenantId","type","userAssignedIdentities"})
    private IdentityResponse(
        String principalId,
        String tenantId,
        String type,
        @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The principal ID of resource identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of resource.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Type of managed service identity.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
    */
    public Map<String,UserIdentityPropertiesResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        private @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
