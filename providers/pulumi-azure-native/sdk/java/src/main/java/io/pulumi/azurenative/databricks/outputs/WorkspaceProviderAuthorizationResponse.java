// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkspaceProviderAuthorizationResponse {
    /**
     * The provider's principal identifier. This is the identity that the provider will use to call ARM to manage the workspace resources.
     * 
     */
    private final String principalId;
    /**
     * The provider's role definition identifier. This role will define all the permissions that the provider must have on the workspace's container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    private final String roleDefinitionId;

    @OutputCustomType.Constructor({"principalId","roleDefinitionId"})
    private WorkspaceProviderAuthorizationResponse(
        String principalId,
        String roleDefinitionId) {
        this.principalId = Objects.requireNonNull(principalId);
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
    }

    /**
     * The provider's principal identifier. This is the identity that the provider will use to call ARM to manage the workspace resources.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The provider's role definition identifier. This role will define all the permissions that the provider must have on the workspace's container resource group. This role definition cannot have permission to delete the resource group.
     * 
    */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceProviderAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceProviderAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public WorkspaceProviderAuthorizationResponse build() {
            return new WorkspaceProviderAuthorizationResponse(principalId, roleDefinitionId);
        }
    }
}
