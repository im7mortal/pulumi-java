// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatabasePrincipalAssignmentResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    private final String principalId;
    /**
     * The principal name
     * 
     */
    private final String principalName;
    /**
     * Principal type.
     * 
     */
    private final String principalType;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Database principal role.
     * 
     */
    private final String role;
    /**
     * The tenant id of the principal
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The tenant name of the principal
     * 
     */
    private final String tenantName;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","principalId","principalName","principalType","provisioningState","role","tenantId","tenantName","type"})
    private GetDatabasePrincipalAssignmentResult(
        String id,
        String name,
        String principalId,
        String principalName,
        String principalType,
        String provisioningState,
        String role,
        @Nullable String tenantId,
        String tenantName,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.principalId = Objects.requireNonNull(principalId);
        this.principalName = Objects.requireNonNull(principalName);
        this.principalType = Objects.requireNonNull(principalType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.role = Objects.requireNonNull(role);
        this.tenantId = tenantId;
        this.tenantName = Objects.requireNonNull(tenantName);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The principal name
     * 
    */
    public String getPrincipalName() {
        return this.principalName;
    }
    /**
     * Principal type.
     * 
    */
    public String getPrincipalType() {
        return this.principalType;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Database principal role.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * The tenant id of the principal
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The tenant name of the principal
     * 
    */
    public String getTenantName() {
        return this.tenantName;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasePrincipalAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String principalId;
        private String principalName;
        private String principalType;
        private String provisioningState;
        private String role;
        private @Nullable String tenantId;
        private String tenantName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabasePrincipalAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.principalName = defaults.principalName;
    	      this.principalType = defaults.principalType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.role = defaults.role;
    	      this.tenantId = defaults.tenantId;
    	      this.tenantName = defaults.tenantName;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalName(String principalName) {
            this.principalName = Objects.requireNonNull(principalName);
            return this;
        }

        public Builder setPrincipalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantName(String tenantName) {
            this.tenantName = Objects.requireNonNull(tenantName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDatabasePrincipalAssignmentResult build() {
            return new GetDatabasePrincipalAssignmentResult(id, name, principalId, principalName, principalType, provisioningState, role, tenantId, tenantName, type);
        }
    }
}
