// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleAssignmentArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleAssignmentArtifactArgs Empty = new RoleAssignmentArtifactArgs();

    @InputImport(name="artifactName")
    private final @Nullable Input<String> artifactName;

    public Input<String> getArtifactName() {
        return this.artifactName == null ? Input.empty() : this.artifactName;
    }

    @InputImport(name="blueprintName", required=true)
    private final Input<String> blueprintName;

    public Input<String> getBlueprintName() {
        return this.blueprintName;
    }

    @InputImport(name="dependsOn")
    private final @Nullable Input<List<String>> dependsOn;

    public Input<List<String>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    @InputImport(name="principalIds", required=true)
    private final Input<Object> principalIds;

    public Input<Object> getPrincipalIds() {
        return this.principalIds;
    }

    @InputImport(name="resourceGroup")
    private final @Nullable Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    @InputImport(name="resourceScope", required=true)
    private final Input<String> resourceScope;

    public Input<String> getResourceScope() {
        return this.resourceScope;
    }

    @InputImport(name="roleDefinitionId", required=true)
    private final Input<String> roleDefinitionId;

    public Input<String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public RoleAssignmentArtifactArgs(
        @Nullable Input<String> artifactName,
        Input<String> blueprintName,
        @Nullable Input<List<String>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> kind,
        Input<Object> principalIds,
        @Nullable Input<String> resourceGroup,
        Input<String> resourceScope,
        Input<String> roleDefinitionId) {
        this.artifactName = artifactName;
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.displayName = displayName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.principalIds = Objects.requireNonNull(principalIds, "expected parameter 'principalIds' to be non-null");
        this.resourceGroup = resourceGroup;
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
    }

    private RoleAssignmentArtifactArgs() {
        this.artifactName = Input.empty();
        this.blueprintName = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.kind = Input.empty();
        this.principalIds = Input.empty();
        this.resourceGroup = Input.empty();
        this.resourceScope = Input.empty();
        this.roleDefinitionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleAssignmentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> artifactName;
        private Input<String> blueprintName;
        private @Nullable Input<List<String>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> kind;
        private Input<Object> principalIds;
        private @Nullable Input<String> resourceGroup;
        private Input<String> resourceScope;
        private Input<String> roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleAssignmentArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactName = defaults.artifactName;
    	      this.blueprintName = defaults.blueprintName;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.kind = defaults.kind;
    	      this.principalIds = defaults.principalIds;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceScope = defaults.resourceScope;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder setArtifactName(@Nullable Input<String> artifactName) {
            this.artifactName = artifactName;
            return this;
        }

        public Builder setArtifactName(@Nullable String artifactName) {
            this.artifactName = Input.ofNullable(artifactName);
            return this;
        }

        public Builder setBlueprintName(Input<String> blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }

        public Builder setBlueprintName(String blueprintName) {
            this.blueprintName = Input.of(Objects.requireNonNull(blueprintName));
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<String>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<String> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setPrincipalIds(Input<Object> principalIds) {
            this.principalIds = Objects.requireNonNull(principalIds);
            return this;
        }

        public Builder setPrincipalIds(Object principalIds) {
            this.principalIds = Input.of(Objects.requireNonNull(principalIds));
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
            return this;
        }

        public Builder setResourceScope(Input<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }

        public Builder setResourceScope(String resourceScope) {
            this.resourceScope = Input.of(Objects.requireNonNull(resourceScope));
            return this;
        }

        public Builder setRoleDefinitionId(Input<String> roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Input.of(Objects.requireNonNull(roleDefinitionId));
            return this;
        }

        public RoleAssignmentArtifactArgs build() {
            return new RoleAssignmentArtifactArgs(artifactName, blueprintName, dependsOn, description, displayName, kind, principalIds, resourceGroup, resourceScope, roleDefinitionId);
        }
    }
}