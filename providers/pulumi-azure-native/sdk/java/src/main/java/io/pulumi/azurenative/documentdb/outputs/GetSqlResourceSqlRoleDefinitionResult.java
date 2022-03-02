// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.PermissionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSqlResourceSqlRoleDefinitionResult {
    /**
     * A set of fully qualified Scopes at or below which Role Assignments may be created using this Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not exist.
     * 
     */
    private final @Nullable List<String> assignableScopes;
    /**
     * The unique resource identifier of the database account.
     * 
     */
    private final String id;
    /**
     * The name of the database account.
     * 
     */
    private final String name;
    /**
     * The set of operations allowed through this Role Definition.
     * 
     */
    private final @Nullable List<PermissionResponse> permissions;
    /**
     * A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     */
    private final @Nullable String roleName;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"assignableScopes","id","name","permissions","roleName","type"})
    private GetSqlResourceSqlRoleDefinitionResult(
        @Nullable List<String> assignableScopes,
        String id,
        String name,
        @Nullable List<PermissionResponse> permissions,
        @Nullable String roleName,
        String type) {
        this.assignableScopes = assignableScopes;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.permissions = permissions;
        this.roleName = roleName;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A set of fully qualified Scopes at or below which Role Assignments may be created using this Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not exist.
     * 
    */
    public List<String> getAssignableScopes() {
        return this.assignableScopes == null ? List.of() : this.assignableScopes;
    }
    /**
     * The unique resource identifier of the database account.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the database account.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The set of operations allowed through this Role Definition.
     * 
    */
    public List<PermissionResponse> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
    */
    public Optional<String> getRoleName() {
        return Optional.ofNullable(this.roleName);
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlResourceSqlRoleDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> assignableScopes;
        private String id;
        private String name;
        private @Nullable List<PermissionResponse> permissions;
        private @Nullable String roleName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlResourceSqlRoleDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignableScopes = defaults.assignableScopes;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.roleName = defaults.roleName;
    	      this.type = defaults.type;
        }

        public Builder setAssignableScopes(@Nullable List<String> assignableScopes) {
            this.assignableScopes = assignableScopes;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPermissions(@Nullable List<PermissionResponse> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setRoleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSqlResourceSqlRoleDefinitionResult build() {
            return new GetSqlResourceSqlRoleDefinitionResult(assignableScopes, id, name, permissions, roleName, type);
        }
    }
}
